public class ForwardResponse{
	public static void forwardResponse(Token t){
	        //node.removeTopInRequestQ();
		        MultiThreadedServer.node.increment++;
		                System.out.println(" line 175:forwarding Response:"+ MultiThreadedServer.node.getTopInRequestQ());
		                        if (MultiThreadedServer.node.requestQ.size()>0){
		   String fresHost = MultiThreadedServer.node.getTopInRequestQ().split(",")[0];            int fresPort = Integer.parseInt(MultiThreadedServer.node.getTopInRequestQ().split(",")[1]);
		                  MultiThreadedServer.node.setTreeNeighHost(fresHost);
		                                                                        MultiThreadedServer.node.setTreeNeighPort(fresPort);
		
		                                                                                    // node.removeTopInRequestQ();
		//                                                                                                // System.out.println("line 184: Tree Neighbors swapped"+node.treeNeighPort);
		//
		                                                                     //     if (!fresHost.equals(node.host) && fresPort == node.port){
		                                                                       //                node.addToRequestQ(node.host+","+node.port);
		                                                                         //                                                              }  
		//
		                                                                                                                                                       if (!(fresHost.equals(MultiThreadedServer.node.host) && fresPort == MultiThreadedServer.node.port)){
		                                                                                                                                                                           MultiThreadedServer.node.removeTopInRequestQ();
		                                                                                                                                                   System.out.println("line 184: Tree Neighbors swapped"+MultiThreadedServer.node.treeNeighPort);
		
		                                                                         }
		                                                                                                                                                       Token ft = new Token("response",MultiThreadedServer.node.host, MultiThreadedServer.node.port, t.getPassword());                                                                                                                                                                                       Client c = new Client(fresHost,fresPort, ft);
		                     System.out.println("line 195:");                                                                                                        Thread fthread = new Thread(c);                                                                                                                                                                           fthread.start();                                MultiThreadedServer.node.initialToken = null;
		
		//                                                                                                                                                                                                                                                                                                   // if (node.requestQ.size() >0){
		//                                                                                                                                                                                                                                                                                                               //     forwardRequest();
		                                                                                                                                                                                                                                                                                                                          // }
		                                                                                                                                                                                                                                                                                                                                   }
		                                                                                                                                                                                                                                                                                                                                       }
		
}
