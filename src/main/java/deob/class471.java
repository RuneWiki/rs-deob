package deob;

import java.util.Iterator;

@ObfuscatedName("sx")
public class class471 extends class478 {

	public class471(class478 arg0) {
		super(arg0);
		this.field5304 = "AddRequestTask";
	}

	@ObfuscatedName("sx.af(B)Z")
	public boolean method8969() {
		while (!class340.field3896.isEmpty()) {
			class352 var1 = (class352) class340.field3896.peek();
			if (var1 == null) {
				class340.field3896.pop();
			} else {
				var1.field4013 = this.method8973();
				class340.field3891.add(var1);
				class340.field3896.pop();
			}
		}
		return true;
	}

	@ObfuscatedName("sx.aw(I)Lnf;")
	public class341 method8973() {
		class341 var1 = null;
		Iterator var2 = class340.field3889.iterator();
		while (true) {
			class341 var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							var1.field3905++;
							if (var1.method6572() == 0 && var1.method6579()) {
								var1.method6578();
								var1.method6576();
								var1.method6632(0);
							}
						}
						return var1;
					}
					var3 = (class341) var2.next();
				} while (var3 == null);
			} while (var1 != null && var1.field3905 <= var3.field3905 && (var3.method6572() != 0 || !var3.method6579()));
			var1 = var3;
		}
	}
}
