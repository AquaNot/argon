package dev.lvstrng.argon.module.modules.misc;

import dev.lvstrng.argon.module.Category;
import dev.lvstrng.argon.module.Module;
import dev.lvstrng.argon.utils.EncryptedString;

public final class No Break Delay extends Module {
	public No Break Delay() {
		super(EncryptedString.of("NoBreakDlay"),
				EncryptedString.of("Removes the break delay from mining blocks"),
				-1,
				Category.MISC);
	}
}
