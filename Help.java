class Help {
	public static void printHelp() { 
		System.out.println("\nThe HttpRequest command prints any inputed JSON file.");
		System.out.println("HttpRequest [URL] examples:");
		System.out.println("java sak -HttpRequest https://sak-v2-sct.azurewebsites.net/sthrawl.json");
		System.out.println("java sak -HttpRequest https://sak-v2-sct.azurewebsites.net/mscherf.json");

		System.out.println("\nHttpRequestIndex parses a given URL into individual components.");
		System.out.println("A [URL] example to execute is:");
		System.out.println("java sak -HttpRequestIndex https://sak-v2-sct.azurewebsites.net/indyjones.json");

		System.out.println("\nThe sleep command pauses for 2 seconds"); 
		System.out.println("To run sleep command:");
		System.out.println("java sak -sleep");

		System.out.println("\nTo run sleepFast command:");
		System.out.println("java sak -sleepFast");

		System.out.println("\nTo run sleepFastImplementsRunnable command:");
		System.out.println("java sak -sleepFastImplementsRunnable");

		System.out.println("\nThe JSONValidateIndex command validates any inputed JSON file.");
		System.out.println("To run JSONValidateIndex command use a URL of a JSON file like so...");
		System.out.println("java sak -JSONValidateIndex https://thunderbird-index.azurewebsites.net/w0a6zk195f.json");
	}
}