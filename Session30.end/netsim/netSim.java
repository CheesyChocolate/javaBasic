/** a prgram to simulate a network
  * the folowing nodes are implemented as classes
  * 1. Device(client) 2. Router 3. Network
  * and the following nodes are implemented as interfaces
  * 1. DNS 2. Switch
  * router implements switch and DNS.
  * network is stand alone and does not implement any interface
  * network has the ping method
  * network has the list of nodes
  * network has method validity to check if all the nodes in the network are conected
  * DNS has a dictionary of ip and host name
  * switch has a list of connected ip
  * Device has isConnected boolean variable to check if it is connected to the network
  */

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class netSim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("initiating network ...");
		Network network = new Network();
		System.out.println("network initiated");
		do {
			System.out.print("1. add device\n2. ping device to router\n3. check validity of network\n4.show all devices ip\n5. exit");
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.print("enter device ip: ");
					network.addDevice(new Device(scanner.next()));
					break;
				case 2:
					System.out.print("enter device ip: ");
					network.ping(scanner.next());
					break;
				case 3:
					network.validity();
					break;
				case 4:
					network.showAllDevices();
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice");
			}

		} while(true);
	}
}

interface DNS {
	Dictionary<String, String> ipHost = new Hashtable<String, String>();
	public void updateTable(String ip, String hostName);
	public String getHostName(String ip);
}

interface Switch {
	ArrayList<String> connectedIP = new ArrayList<String>();
	public void addIP(String ip);
	public void removeIP(String ip);
	public boolean isConnected(String ip);
}

class Router implements DNS, Switch {

	public Router() {
		addIP("0.0.0.0");
	}
	public void addIP(String ip) {
		connectedIP.add(ip);
	}
	public void removeIP(String ip) {
		connectedIP.remove(ip);
	}
	public boolean isConnected(String ip) {
		return connectedIP.contains(ip);
	}
	public void updateTable(String ip, String hostName) {
		ipHost.put(ip, hostName);
	}
	public String getHostName(String ip) {
		return ipHost.get(ip);
	}
}

class Device {
	boolean isConnected;
	String ip;
	public Device(String ip) {
		isConnected = false;
		this.ip = ip;
	}
	public void connect() {
		isConnected = true;
	}
	public void disconnect() {
		isConnected = false;
	}
}

class Network {
	ArrayList<Device> devices;
	Router router;

	public Network() {
		devices = new ArrayList<Device>();
		router = new Router();
	}

	public void addDevice(Device device) {
		devices.add(device);
		connectDeviceToRouter(device, this.router);
	}
	public void connectDeviceToRouter(Device device, Router router) {
		device.connect();
		router.addIP(device.ip);
	}
	public void disconnectDeviceFromRouter(Device device, Router router) {
		device.disconnect();
		router.removeIP(device.ip);
	}
	public boolean validity() {
		for (Device device : devices) {
			if (!device.isConnected) {
				return false;
			}
		}
		return true;
	}
	public void ping(String ip) {
		if (router.isConnected(ip)) {
			System.out.println("ping successful");
		} else {
			System.out.println("ping unsuccessful");
		}
	}
	public void addSite(String ip, String hostName) {
		router.updateTable(ip, hostName);
	}
	public void showAllDevices() {
		for (Device device : devices) {
			System.out.println(device.ip);
		}
	}
}
