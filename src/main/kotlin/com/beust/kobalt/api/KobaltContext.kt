package com.beust.kobalt.api

import com.beust.kobalt.Args
import com.beust.kobalt.Plugins

public class KobaltContext(val args: Args) {
    fun findPlugin(name: String) = Plugins.findPlugin(name)
    var pluginInfo: PluginInfo? = null
}

