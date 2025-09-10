package deob;

import java.util.Iterator;

@ObfuscatedName("sz")
public class class475 extends class478 {

	public class475(class478 arg0) {
		super(arg0);
		this.field5304 = "StartSongTask";
	}

	@ObfuscatedName("sz.af(B)Z")
	public boolean method8969() {
		Iterator var1 = class340.field3891.iterator();
		while (var1.hasNext()) {
			class352 var2 = (class352) var1.next();
			if (var2 != null && !var2.field4010 && var2.field4013 != null) {
				try {
					var2.field4013.method6575();
					var2.field4013.method6632(0);
					if (var2.field4004 != null) {
						var2.field4013.method6660(var2.field4004, var2.field4014);
					}
					var2.field4004 = null;
					var2.field4007 = null;
					var2.field4015 = null;
					var2.field4010 = true;
				} catch (Exception var4) {
					class617.method9413(null, var4);
					this.method8982(var4.getMessage());
					return true;
				}
			}
		}
		this.field5302 = true;
		return true;
	}
}
