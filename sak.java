
public class sak {
	public static void main(String[] args) {
        System.out.println("");
       long start = System.nanoTime();

		if (args.length < 1) {
			// Processed with no arguments.
            System.out.println("An additional argument is required. " +
            "Executing \"java sak -Help\" for more information.");	
            Help.printHelp(); 

            //Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nExecution time = " + elapsed/1000000 + " milliseconds.");
		} 
		else if (args[0].equalsIgnoreCase("-Help")) {
            //Processed with -Help command
			System.out.println("Running -Help");
            Help.printHelp();	
            
            //Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nExecution time = " + elapsed/1000000 + " milliseconds.");
		} 
		else if (args[0].equalsIgnoreCase("-HttpRequest")) {
            //Processed with -HttpRequest command
			System.out.println("Running -HttpRequest");
			if (args.length <2) {
                // Checks if there is actually a URL to run
				System.out.println("A valid URL is required to run the -HttpRequest command.");
			} else {
				String URL = args[1];
				HttpRequest urlRequest = new HttpRequest();
				if (urlRequest.readURL(URL)) {
					System.out.println(urlRequest);
				}
            }
            // Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Execution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
            // Processed with -HttpRequestIndex command
			 System.out.println("Running -HttpRequestIndex");	
			if (args.length < 2) {
                // Checks if there is actually a URL to run
				System.out.println("A valid URL is required to run the -HttpRequestIndex command");
			} else {
				String URLindex = args[1];
				HttpRequestIndex urlRequestIndex = new HttpRequestIndex();
				if (urlRequestIndex.readURL(URLindex)) {
                    System.out.println(urlRequestIndex);
					urlRequestIndex.parseIndex();
				}
            }
            // Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Execution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-sleep")) {
            //Processed with -sleep command
			System.out.println("Running -sleep");
				
			sleep.main(args);
			
            //Ends and prints total time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nTotal execution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-sleepFast")) {
            //Processed with -sleepFast command
			System.out.println("Running -sleepFast");
				
			sleepFast.main(args);
			
            //Ends and prints total time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nTotal execution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-sleepFastImplementsRunnable")) {
            //Processed with -sleepFastRunnable command
			System.out.println("Running -sleepFastIMplementsRunnable");
				
			sleepFastImplementsRunnable.main(args);
			
            //Ends and prints total time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("\nTotal execution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-JSONValidateIndex")) {
            // Processed with -JSONValidateIndex command
			 System.out.println("Running -JSONValidateIndex");	
			if (args.length < 2) {
                // Checks if there is actually a URL to run
				System.out.println("A valid URL is required to run the -JSONValidateIndex command");
			} else {
				String URLindex = args[1];
				JSONValidateIndex urlValidateIndex = new JSONValidateIndex();
				if (urlValidateIndex.readURL(URLindex)) {
                    System.out.println(urlValidateIndex);
					urlValidateIndex.validateIndex();
				}
            }
            // Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Execution time = " + elapsed/1000000 + " milliseconds.");
		}
		else if (args[0].equalsIgnoreCase("-JSONValidateIndexThreaded")) {
            // Processed with -JSONValidateIndex command
			 System.out.println("Running -JSONValidateIndexThreaded");	
			if (args.length < 2) {
                // Checks if there is actually a URL to run
				System.out.println("A valid URL is required to run the -JSONValidateIndexThreaded command");
			} else {
				String URLindex = args[1];
				JSONValidateIndexThreaded urlValidateIndexThr = new JSONValidateIndexThreaded();
				if (urlValidateIndexThr.readURL(URLindex)) {
                    System.out.println(urlValidateIndexThr);
					urlValidateIndexThr.validateIndexThr();
				}
            }
            // Ends and prints time elapsed
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println("Execution time = " + elapsed/1000000 + " milliseconds.");
		}

		System.out.println("");
	}
} 