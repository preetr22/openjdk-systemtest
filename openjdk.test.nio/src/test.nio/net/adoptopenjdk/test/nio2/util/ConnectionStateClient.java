/*******************************************************************************
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

package net.adoptopenjdk.test.nio2.util;

import net.adoptopenjdk.test.nio2.asyncio.server.AServer;

public class ConnectionStateClient extends ConnectionState {

	// Constructor, no-args, sets up buffers and queues
	public ConnectionStateClient(AServer server) {		
		super();
		this.server = server;
	}
	
	public AServer getServer() {
		return server;
	}
	
	private AServer server = null;	
}
