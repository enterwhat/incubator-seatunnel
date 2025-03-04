/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.seatunnel.e2e.flink.file;

import org.apache.seatunnel.e2e.flink.FlinkContainer;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.Container;

@Slf4j
public class FakeSourceToFileIT extends FlinkContainer {

    @Test
    public void testFakeSource2FileSink() throws Exception {
        Container.ExecResult execResult = executeSeaTunnelFlinkJob("/file/fakesource_to_file.conf");
        Assertions.assertEquals(0, execResult.getExitCode());
    }
}
