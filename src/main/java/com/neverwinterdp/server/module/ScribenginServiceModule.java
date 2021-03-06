package com.neverwinterdp.server.module;

import java.util.Map;

import com.neverwinterdp.scribengin.ScribenginClusterService;
import com.neverwinterdp.server.module.ModuleConfig;
import com.neverwinterdp.server.module.ServiceModule;

@ModuleConfig(name = "Scribengin", autostart = false, autoInstall=false)
public class ScribenginServiceModule extends ServiceModule {
  protected void configure(Map<String, String> properties) {  
    bind("SparknginClusterService", ScribenginClusterService.class) ;
  }
}