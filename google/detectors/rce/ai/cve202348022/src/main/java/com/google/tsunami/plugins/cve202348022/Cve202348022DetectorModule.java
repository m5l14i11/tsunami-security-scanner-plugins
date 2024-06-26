/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.tsunami.plugins.cve202348022;

import com.google.tsunami.plugin.PluginBootstrapModule;

/** An module registering the detector for CVE-2023-48022. */
public final class Cve202348022DetectorModule extends PluginBootstrapModule {
  @Override
  protected void configurePlugin() {
    registerPlugin(Cve202348022Detector.class);
  }
}
