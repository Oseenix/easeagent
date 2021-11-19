/*
 * Copyright (c) 2017, MegaEase
 * All rights reserved.
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
 * limitations under the License.
 */

package com.megaease.easeagent.plugin.kafka.interceptor;

import com.megaease.easeagent.plugin.MethodInfo;
import com.megaease.easeagent.plugin.annotation.AdviceTo;
import com.megaease.easeagent.plugin.api.Context;
import com.megaease.easeagent.plugin.field.AgentDynamicFieldAccessor;
import com.megaease.easeagent.plugin.kafka.advice.KafkaProducerAdvice;
import com.megaease.easeagent.plugin.utils.FirstEnterInterceptor;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.List;
import java.util.Map;

//@AdviceTo(value = KafkaProducerAdvice.class, qualifier = "doSend")
public class KafkaProducerDoSendInterceptor implements FirstEnterInterceptor {

    @Override
    public void doBefore(MethodInfo methodInfo, Context context) {
    }
}
