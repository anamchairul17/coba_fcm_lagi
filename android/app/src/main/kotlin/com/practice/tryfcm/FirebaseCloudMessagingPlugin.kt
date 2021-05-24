package com.practice.tryfcm

import io.flutter.plugin.common.PluginRegistry

object FirebaseCloudMessagingPlugin {
    fun registerWith(pluginRegistry: PluginRegistry)
    {
        if (alradyRegisterWith(pluginRegistry)) return
        registerWith(pluginRegistry)
    }

    private fun alradyRegisterWith(pluginRegistry: PluginRegistry): Boolean {
        val key = FirebaseCloudMessagingPlugin::class.java.canonicalName
        if(pluginRegistry.hasPlugin(key)) return true
        pluginRegistry.registrarFor(key)
        return false
    }
}