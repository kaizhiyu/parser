/**		
 *		Copyright [2019] [flaxel]
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *		 
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.flaxel.parser.command.utils;

import picocli.CommandLine.Command;

/**
 * This class represents a command to close the terminal.
 * 
 * @author flaxel
 * @since 1.0.0
 */
@Command(name = "exit", aliases = "close", description = "close the terminal")
public class ExitCommand implements Runnable {

	/**
	 * Execute the command.
	 * 
	 * @since 1.0.0
	 */
	@Override
	public void run() {
		System.exit(0);
	}
}
