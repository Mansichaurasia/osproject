// is any have less arrival time 
						// the coming process then execute them 
						for (int j = 0; j < pt.length; j++) { 

							// compare 
							if (res12[j] < res12[i])
							 { 
								if (res11[j] > 0)
								 { 
									flag = false; 
									if (res11[j] > n1)
									 { 
										k = k + n1; 
										res11[j] = res11[j] - n1; 
										res12[j] = res12[j] + n1; 
										seq += "->" + pt[j]; 
									} 
									else { 
										k = k + res11[j]; 
										comp[j] = k - ar[j]; 
										w[j] = k - br[j] - ar[j]; 
										res11[j] = 0; 
										seq += "->" + pt[j]; 
									} 
								} 
							} 
						} 
