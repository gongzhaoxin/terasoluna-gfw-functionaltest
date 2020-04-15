/*
 * Copyright (C) 2013-2018 NTT DATA Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.terasoluna.gfw.functionaltest.app.welcome;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    private static final Logger logger = LoggerFactory
            .getLogger(WelcomeController.class);

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        logger.info("Request URI  is " + request.getRequestURI());
        logger.info("Context Root is " + request.getContextPath());
        logger.info("Servlet Path is " + request.getServletPath());
        logger.info("Path Info    is " + request.getPathInfo());
        return "welcome/index";
    }

}
