package com.percipient24.cgc.art;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;

public class Textures {
	public static void main(String[] args) {
		Settings settings = new Settings();
		settings.maxWidth = 2048;
		settings.maxHeight = 2048;

		// We will assume that this code runs from
		// [art]
		// Raw assets live in
		// [art]/assets/[sheetname]
		// Thus, all asset source paths should be prefixed with
		// assets
		// and all asset destination paths should be prefixed with
		// package

		TexturePacker.process(settings, "assets/images", "package/assets", "main");
		TexturePacker.process(settings, "assets/characters", "package/assets", "characters");
		TexturePacker.process(settings, "assets/titleScreen", "package/assets", "titlescreen");
		TexturePacker.process(settings, "assets/menuControls", "package/assets", "menu");
		TexturePacker.process(settings, "assets/creditslogos", "package/assets", "credits");
	}
}