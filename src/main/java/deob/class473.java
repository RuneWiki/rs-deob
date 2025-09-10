package deob;

import java.util.ArrayList;
import java.util.Iterator;

@ObfuscatedName("sy")
public class class473 extends class478 {

	@ObfuscatedName("sy.af")
	public ArrayList field5288;

	public class473(class478 arg0, ArrayList arg1) {
		super(arg0);
		this.field5304 = "ClearRequestTask";
		this.field5288 = arg1;
	}

	@ObfuscatedName("sy.af(B)Z")
	public boolean method8969() {
		if (this.field5288.isEmpty()) {
			return true;
		}
		Iterator var1 = this.field5288.iterator();
		while (var1.hasNext()) {
			class352 var2 = (class352) var1.next();
			try {
				if (class340.field3891.contains(var2)) {
					if (var2 == null) {
						class340.field3891.remove(var2);
					} else {
						if (var2.field4013.field3905 > 0) {
							var2.field4013.field3905--;
						}
						if (var2.field4013.field3905 == 0) {
							var2.field4013.method6578();
							var2.field4013.method6576();
							var2.field4013.method6632(0);
						}
						int var3 = var2.field4008;
						int var4 = var2.field4005;
						Iterator var5 = class340.field3894.iterator();
						while (var5.hasNext()) {
							class346 var6 = (class346) var5.next();
							var6.method806(var3, var4);
						}
						class340.field3891.remove(var2);
					}
				}
			} catch (Exception var8) {
				class617.method9413(null, var8);
				this.method8982(var8.getMessage());
				class340.field3891.clear();
				return true;
			}
		}
		return true;
	}
}
