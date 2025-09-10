package deob;

import java.net.MalformedURLException;
import java.net.URL;

@ObfuscatedName("nh")
public class class364 {

	@ObfuscatedName("nh.af")
	public class122 field4062;

	@ObfuscatedName("nh.aw")
	public class606 field4064;

	public class364(String arg0, class120 arg1) {
		try {
			this.field4062 = arg1.method3354(new URL(arg0));
		} catch (MalformedURLException var4) {
			this.field4062 = null;
		}
	}

	public class364(class122 arg0) {
		this.field4062 = arg0;
	}

	@ObfuscatedName("nh.af(I)Lxt;")
	public class606 method6906() {
		if (this.field4064 == null && this.field4062 != null && this.field4062.method3382()) {
			if (this.field4062.method3383() != null) {
				this.field4064 = class31.method3863(this.field4062.method3383());
			}
			this.field4062 = null;
		}
		return this.field4064;
	}
}
