class roundrobin { 
	public static void roundRobin(String pt[], int ar[], int br[], int n1) 
	{ 
		// result of average times 
		int re1 = 0; 
		int re2 = 0; 

		// for sequence storage 
		String seq = new String(); 

		// copy the burst array and arrival array for not effecting the actual array 
		int res11[] = new int[br.length]; 
		int res12[] = new int[ar.length]; 

		for (int i = 0; i < res11.length; i++) 
		{ 
			res11[i] = br[i]; 
			res12[i] = ar[i]; 
		} 

		// critical time of system 
		int k = 0; 

		// for store the waiting time 
		int w[] = new int[pt.length]; 

		// for store the Completion time 
		int comp[] = new int[pt.length]; 

		while (true)
		 { 
			boolean flag = true; 
			for (int i = 0; i < pt.length; i++) 
			{ 

				// these condition for if 
				// arrival is not on zero 

				// check that if there come before qtime 
				if (res12[i] <= k)
				 { 
					if (res12[i] <= n1)
					 { 
						if (res11[i] > 0)
						 { 
							flag = false; 
							if (res11[i] > n1)
							 { 

								// make decrease the b time 
								k = k + n1; 
								res11[i] = res11[i] - n1; 
								res12[i] = res12[i] + n1; 
								seq += "->" + pt[i]; 
							} 
							else { 

								// for last time 
								k = k + res11[i]; 

								// store comp time 
								comp[i] = k - ar[i]; 

								// store wait time 
								w[i] = k - br[i] - ar[i]; 
								res11[i] = 0; 

								// add sequence 
								seq += "->" + pt[i]; 
							} 
						} 
					} 
