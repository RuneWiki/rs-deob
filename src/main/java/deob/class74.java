package deob;

import java.util.HashMap;
import java.util.Iterator;

@ObfuscatedName("co")
public class class74 implements Iterable {

	@ObfuscatedName("co.af")
	public final class427 field1017 = new class427(16);

	@ObfuscatedName("co.aw")
	public final HashMap field1015 = new HashMap(16);

	@ObfuscatedName("co.at")
	public final HashMap field1010 = new HashMap(16);

	@ObfuscatedName("co.ac")
	public class519 field1018;

	@ObfuscatedName("co.ap")
	public class517 field1012;

	@ObfuscatedName("co.aq")
	public class80 field1013;

	@ObfuscatedName("co.ao")
	public int field1014 = 0;

	public class74() {
		this.method2348();
	}

	@ObfuscatedName("co.af(IIII)Ldr;")
	public class80 method2341(int arg0, int arg1, int arg2) {
		this.field1013 = this.method2324(-1, arg0, arg1, arg2, class218.field2513);
		return this.field1013;
	}

	@ObfuscatedName("co.aw(IIIILio;I)Ldr;")
	public class80 method2324(int arg0, int arg1, int arg2, int arg3, class218 arg4) {
		class80 var6 = new class80(arg0, arg1, arg2, arg3, arg4);
		this.field1017.method7940(var6, (long) arg0);
		this.field1014++;
		return var6;
	}

	@ObfuscatedName("co.at(IB)V")
	public void method2337(int arg0) {
		class80 var2 = (class80) this.field1017.method7946((long) arg0);
		this.method2302(var2);
	}

	@ObfuscatedName("co.ac(Ldr;I)V")
	public void method2302(class80 arg0) {
		if (arg0 == null) {
			return;
		}
		this.field1015.remove(arg0.field1173);
		this.field1010.remove(arg0.field1173);
		arg0.method2637();
		arg0.method2234();
		this.field1014--;
	}

	@ObfuscatedName("co.ap(II)Ldr;")
	public class80 method2311(int arg0) {
		return (class80) this.field1017.method7946((long) arg0);
	}

	@ObfuscatedName("co.aq(I)Ldr;")
	public class80 method2304() {
		return this.field1013;
	}

	@ObfuscatedName("co.ao(I)Ldr;")
	public class80 method2309() {
		return this.method2311(client.field347);
	}

	@ObfuscatedName("co.as(III)Ldr;")
	public class80 method2306(int arg0, int arg1) {
		Iterator var3 = this.iterator();
		while (var3.hasNext()) {
			class80 var4 = (class80) var3.next();
			if (var4.field1173 != -1) {
				int var5 = var4.field1165;
				int var6 = var4.field1166;
				int var7 = var4.field1163 + var5;
				int var8 = var4.field1164 + var6;
				if (arg0 >= var5 && arg1 >= var6 && arg0 < var7 && arg1 < var8) {
					return var4;
				}
			}
		}
		return this.field1013;
	}

	@ObfuscatedName("co.al(IB)Ltj;")
	public class506 method2307(int arg0) {
		return (class506) this.method2304().field1172.method7946((long) arg0);
	}

	@ObfuscatedName("co.au(I)Ltj;")
	public class506 method2308() {
		return (class506) this.method2304().field1172.method7946((long) client.field347);
	}

	@ObfuscatedName("co.ai(I)Lre;")
	public class453 method2322() {
		class80 var1 = this.method2309();
		class70 var2 = var1.method2634(client.field492);
		class453 var3 = client.method1977(var1, var2.method2394(), var2.method2395());
		var3.field5177 = var2.method2177();
		return var3;
	}

	@ObfuscatedName("co.aa(I)I")
	public int method2310() {
		return this.field1014;
	}

	@ObfuscatedName("co.am(Ltb;Ltz;I)V")
	public void method2323(class519 arg0, class517 arg1) {
		this.field1018 = arg0;
		this.field1012 = arg1;
	}

	@ObfuscatedName("co.an(ILtb;Ltz;B)V")
	public void method2312(int arg0, class519 arg1, class517 arg2) {
		this.field1015.put(arg0, arg1);
		this.field1010.put(arg0, arg2);
	}

	@ObfuscatedName("co.ar(II)V")
	public void method2354(int arg0) {
		this.field1015.remove(arg0);
		this.field1010.remove(arg0);
	}

	@ObfuscatedName("co.ae(II)Ltb;")
	public class519 method2313(int arg0) {
		class519 var2 = (class519) this.field1015.get(arg0);
		return var2 == null ? this.field1018 : var2;
	}

	@ObfuscatedName("co.ay(II)Ltz;")
	public class517 method2339(int arg0) {
		class517 var2 = (class517) this.field1010.get(arg0);
		return var2 == null ? this.field1012 : var2;
	}

	public Iterator iterator() {
		return this.field1017.iterator();
	}

	@ObfuscatedName("co.ad(I)V")
	public void method2348() {
		Iterator var1 = this.field1017.iterator();
		while (var1.hasNext()) {
			class80 var2 = (class80) var1.next();
			this.method2302(var2);
		}
		this.field1017.method7941();
		this.field1014 = 0;
		this.field1015.clear();
		this.field1010.clear();
		this.field1018 = class519.field5494;
		this.field1012 = class517.field5486;
		if (this.field1013 != null) {
			this.field1013.method2632();
			this.field1017.method7940(this.field1013, -1L);
			this.field1014 = 1;
		}
	}
}
