/*   Copyright (C) 2013-2014 Computer Sciences Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */

package ezbake.frack.eventbus.util;

import ezbake.common.properties.EzProperties;
import ezbake.frack.api.PipelineConfiguration;

import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: eperry
 * Date: 10/28/13
 * Time: 10:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConfigurationHelper {
    public static int getNumExecutors(Properties props, String pipeId) {
        return new EzProperties(props, true).getInteger(PipelineConfiguration.NUM_EXECUTORS_PROP_PREFIX + pipeId, getNumTasks(props, pipeId));
    }

    public static int getNumTasks(Properties props, String pipeId) {
        return new EzProperties(props, true).getInteger(PipelineConfiguration.NUM_TASKS_PROP_PREFIX + pipeId, 1);
    }
}
