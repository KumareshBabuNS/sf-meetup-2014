/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nebhale.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class ApplicationConfiguration {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

//    @Configuration
//    public static class DataSourceConfiguration {
//
//        @Bean
//        Cloud cloud() {
//            return new CloudFactory().getCloud();
//        }
//
//        @Bean
//        DataSource dataSource() {
//            return cloud().getSingletonServiceConnector(DataSource.class, null);
//        }
//
//        @Bean
//        DataSource dataSource() {
//            PostgresqlServiceInfo serviceInfo = (PostgresqlServiceInfo) cloud()
//                    .getServiceInfos(DataSource.class).get(0);
//
//            return new SimpleDriverDataSource(
//                    new Driver(),
//                    serviceInfo.getJdbcUrl(),
//                    serviceInfo.getUserName(),
//                    serviceInfo.getPassword()
//            );
//
//        }
//
//    }

}
