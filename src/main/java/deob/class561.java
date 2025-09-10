package deob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("vz")
public class class561 implements class560 {

	@ObfuscatedName("vz.af")
	public final class600 field5765;

	@ObfuscatedName("vz.aw")
	public Map field5764;

	public class561(class600 arg0) {
		this.field5765 = arg0;
	}

	@ObfuscatedName("vz.af(II)I")
	public int method10054(int arg0) {
		if (this.field5764 != null) {
			class601 var2 = (class601) this.field5764.get(arg0);
			if (var2 != null) {
				return (Integer) var2.field5986;
			}
		}
		return (Integer) this.field5765.method9675(arg0);
	}

	@ObfuscatedName("vz.aw(ILjava/lang/Object;I)V")
	public void method10053(int arg0, Object arg1) {
		if (this.field5764 == null) {
			this.field5764 = new HashMap();
			this.field5764.put(arg0, new class601(arg0, arg1));
			return;
		}
		class601 var3 = (class601) this.field5764.get(arg0);
		if (var3 == null) {
			this.field5764.put(arg0, new class601(arg0, arg1));
		} else {
			var3.field5986 = arg1;
		}
	}

	public Iterator iterator() {
		return this.field5764 == null ? Collections.emptyList().iterator() : this.field5764.values().iterator();
	}
}
