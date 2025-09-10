package deob;

import java.util.ArrayList;

@ObfuscatedName("su")
public class class479 extends class478 {

	@ObfuscatedName("su.af")
	public ArrayList field5309;

	public class479(class478 arg0, ArrayList arg1) {
		super(arg0);
		this.field5309 = arg1;
		this.field5304 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("su.af(B)Z")
	public boolean method8969() {
		for (int var1 = 0; var1 < this.field5309.size(); var1++) {
			class478 var2 = (class478) this.field5309.get(var1);
			if (var2 == null) {
				this.field5309.remove(var1);
				var1--;
			} else if (var2.method8969()) {
				if (var2.method8981()) {
					this.method8982(var2.method8984());
					this.field5309.clear();
					return true;
				}
				if (var2.method8986() != null) {
					this.field5309.add(var2.method8986());
				}
				this.field5302 = var2.field5302;
				this.field5309.remove(var1);
				var1--;
			}
		}
		if (this.field5309.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
