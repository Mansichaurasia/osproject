// now the previous porcess according to ith is process 
						if (res11[i] > 0) { 
							flag = false; 

							// Check for greaters 
							if (res11[i] > n1) { 
								k = k + n1; 
								res11[i] = res11[i] - n1; 
								res12[i] = res12[i] + n1; 
								seq += "->" + pt[i]; 
							} 
							else { 
								k = k + res11[i]; 
								comp[i] = k - ar[i]; 
								w[i] = k - br[i] - ar[i]; 
								res11[i] = 0; 
								seq += "->" + pt[i]; 
							} 
						} 
					} 
				} 

				// if no process is come on thse critical 
				else if (res12[i] > k) { 
					k++; 
					i--; 
				} 
			} 
			// for exit the while loop 
			if (flag) { 
				break; 
			} 
		} 

		System.out.println("Process Name   Completion Time   Waiting Time"); 
		for (int i = 0; i < pt.length; i++) { 
			System.out.println(" " + pt[i] + "  		 " + comp[i] + " 		  " + w[i]); 

			re1 = re1 + w[i]; 
			re2 = re2 + comp[i]; 
		} 

		System.out.println("Average waiting time is "+ (float)re1 / pt.length); 
		System.out.println("Average compilation time is "+ (float)re2 / pt.length); 
		System.out.println("Sequence is like that " + seq); 
	} 

