package deob;

import java.util.Iterator;

@ObfuscatedName("sw")
public class class480 extends class478 {

	@ObfuscatedName("sw.af")
	public class413 field5311;

	@ObfuscatedName("sw.aw")
	public class413 field5310;

	@ObfuscatedName("sw.as")
	public class413 field5312;

	public class480(class478 arg0, class413 arg1, class413 arg2, class413 arg3) {
		super(arg0);
		this.field5311 = arg1;
		this.field5310 = arg2;
		this.field5312 = arg3;
		this.field5304 = "LoadSongTask";
	}

	@ObfuscatedName("sw.af(B)Z")
	public boolean method8969() {
		int var1 = 0;
		Iterator var2 = class340.field3891.iterator();
		while (true) {
			while (var2.hasNext()) {
				class352 var3 = (class352) var2.next();
				if (var3 != null && var3.field4013.field3905 > 1 && var3.field4013.method6669()) {
					this.method8982("Attempted to load patches of already loading midiplayer!");
					return true;
				}
				if (var3 == null || var3.field4009) {
					var1++;
				} else {
					try {
						if (var3.field4015 == null || var3.field4008 == -1 || var3.field4005 == -1) {
							var1++;
						} else {
							if (var3.field4004 == null) {
								var3.field4004 = class349.method6762(var3.field4015, var3.field4008, var3.field4005);
								if (var3.field4004 == null) {
									continue;
								}
							}
							if (var3.field4007 == null) {
								var3.field4007 = new class101(this.field5312, this.field5310);
							}
							if (var3.field4013.method6598(var3.field4004, this.field5311, var3.field4007)) {
								var1++;
								var3.field4009 = true;
								var3.field4013.method6574();
							}
						}
					} catch (Exception var5) {
						class617.method9413(null, var5);
						this.method8982(var5.getMessage());
						return true;
					}
				}
			}
			if (var1 == class340.field3891.size()) {
				return true;
			}
			return false;
		}
	}
}
