package com.example;

import dev.davidv.prifddinas.PrifddinasPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PrifddinasPlugin.class);
		RuneLite.main(args);
	}
}