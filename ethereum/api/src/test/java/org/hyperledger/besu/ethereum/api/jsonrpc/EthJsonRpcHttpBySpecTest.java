/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.ethereum.api.jsonrpc;

import java.net.URL;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class EthJsonRpcHttpBySpecTest extends AbstractJsonRpcHttpBySpecTest {

  public EthJsonRpcHttpBySpecTest(final String specName, final URL specURL) {
    super(specName, specURL);
  }

  @Override
  public void setup() throws Exception {
    super.setup();
    startService();
  }

  @Parameters(name = "{index}: {0}")
  public static Object[][] specs() {
    return findSpecFiles("eth");
  }
}