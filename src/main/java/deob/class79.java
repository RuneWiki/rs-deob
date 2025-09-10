package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dd")
public class class79 {

	@ObfuscatedName("dd.ap")
	public final Map field1143 = new LinkedHashMap();

	@ObfuscatedName("dd.aq")
	public boolean field1144;

	@ObfuscatedName("dd.ao")
	public boolean field1145 = false;

	@ObfuscatedName("dd.as")
	public boolean field1140;

	@ObfuscatedName("dd.al")
	public boolean field1148 = false;

	@ObfuscatedName("dd.au")
	public int field1147;

	@ObfuscatedName("dd.ai")
	public double field1155 = 0.8D;

	@ObfuscatedName("dd.aa")
	public int field1150 = 127;

	@ObfuscatedName("dd.am")
	public int field1151 = 127;

	@ObfuscatedName("dd.an")
	public int field1156 = 127;

	@ObfuscatedName("dd.ar")
	public int field1153 = -1;

	@ObfuscatedName("dd.ae")
	public String field1154 = null;

	@ObfuscatedName("dd.ay")
	public int field1149 = 1;

	@ObfuscatedName("dd.ad")
	public int field1146 = 25;

	@ObfuscatedName("dd.ag")
	public boolean field1157 = true;

	public class79() {
		this.method2504(true);
	}

	public class79(class591 arg0) {
		if (arg0 == null || arg0.field5917 == null) {
			this.method2504(true);
		} else {
			int var2 = arg0.method10339();
			if (var2 >= 0 && var2 <= 12) {
				if (arg0.method10339() == 1) {
					this.field1144 = true;
				}
				if (var2 > 1) {
					this.field1140 = arg0.method10339() == 1;
				}
				if (var2 > 3) {
					this.field1149 = arg0.method10339();
				}
				if (var2 > 2) {
					int var3 = arg0.method10339();
					for (int var4 = 0; var4 < var3; var4++) {
						int var5 = arg0.method10345();
						int var6 = arg0.method10345();
						this.field1143.put(var5, var6);
					}
				}
				if (var2 > 4) {
					this.field1154 = arg0.method10349();
				}
				if (var2 > 5) {
					this.field1145 = arg0.method10553();
				}
				if (var2 > 6) {
					this.field1155 = (double) arg0.method10339() / 100.0D;
					this.field1150 = arg0.method10339();
					this.field1151 = arg0.method10339();
					this.field1156 = arg0.method10339();
				}
				if (var2 > 7) {
					this.field1153 = arg0.method10339();
				}
				if (var2 > 8) {
					this.field1148 = arg0.method10339() == 1;
				}
				if (var2 > 9) {
					this.field1147 = arg0.method10345();
				}
				if (var2 > 10) {
					this.field1146 = arg0.method10339();
				}
				if (var2 > 11) {
					this.field1157 = arg0.method10339() == 1;
				}
			} else {
				this.method2504(true);
			}
		}
	}

	@ObfuscatedName("ce.af(B)V")
	public static void method2061() {
		class566 var0 = null;
		try {
			var0 = class261.method496("", Statics.field5085.field4420, true);
			class591 var1 = Statics.field240.method2583();
			var0.method10085(var1.field5917, 0, var1.field5920);
		} catch (Exception var5) {
		}
		try {
			if (var0 != null) {
				var0.method10068(true);
			}
		} catch (Exception var4) {
		}
	}

	@ObfuscatedName("dd.aw(ZI)V")
	public void method2504(boolean arg0) {
	}

	@ObfuscatedName("dd.at(I)Lwb;")
	public class591 method2583() {
		class591 var1 = new class591(419, true);
		var1.method10320(12);
		var1.method10320(this.field1144 ? 1 : 0);
		var1.method10320(this.field1140 ? 1 : 0);
		var1.method10320(this.field1149);
		var1.method10320(this.field1143.size());
		Iterator var2 = this.field1143.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = (Entry) var2.next();
			var1.method10547((Integer) var3.getKey());
			var1.method10547((Integer) var3.getValue());
		}
		var1.method10504(this.field1154 == null ? "" : this.field1154);
		var1.method10405(this.field1145);
		var1.method10320((int) (this.field1155 * 100.0D));
		var1.method10320(this.field1150);
		var1.method10320(this.field1151);
		var1.method10320(this.field1156);
		var1.method10320(this.field1153);
		var1.method10320(this.field1148 ? 1 : 0);
		var1.method10547(this.field1147);
		var1.method10320(this.field1146);
		var1.method10320(this.field1157 ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("dd.ac(B)Z")
	public boolean method2623() {
		return this.field1144;
	}

	@ObfuscatedName("dd.ap(ZI)V")
	public void method2507(boolean arg0) {
		this.field1144 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.aq(I)Z")
	public boolean method2508() {
		return this.field1145;
	}

	@ObfuscatedName("dd.ao(ZI)V")
	public void method2509(boolean arg0) {
		this.field1145 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.as(B)Z")
	public boolean method2510() {
		return this.field1140;
	}

	@ObfuscatedName("dd.al(ZI)V")
	public void method2511(boolean arg0) {
		this.field1140 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.au(I)V")
	public void method2512() {
		this.method2514(!this.field1148);
	}

	@ObfuscatedName("dd.ai(I)Z")
	public boolean method2513() {
		return this.field1148;
	}

	@ObfuscatedName("dd.aa(ZB)V")
	public void method2514(boolean arg0) {
		this.field1148 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.am(B)I")
	public int method2567() {
		return this.field1147;
	}

	@ObfuscatedName("dd.an(II)V")
	public void method2516(int arg0) {
		this.field1147 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.ar(I)D")
	public double method2517() {
		return this.field1155;
	}

	@ObfuscatedName("dd.ae(D)V")
	public void method2603(double arg0) {
		this.field1155 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.ay(I)I")
	public int method2519() {
		return this.field1150;
	}

	@ObfuscatedName("dd.ad(II)V")
	public void method2576(int arg0) {
		this.field1150 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.ag(I)I")
	public int method2569() {
		return this.field1151;
	}

	@ObfuscatedName("dd.av(II)V")
	public void method2522(int arg0) {
		this.field1151 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.ah(B)I")
	public int method2624() {
		return this.field1156;
	}

	@ObfuscatedName("dd.ab(II)V")
	public void method2524(int arg0) {
		this.field1156 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.ax(I)Ljava/lang/String;")
	public String method2548() {
		return this.field1154;
	}

	@ObfuscatedName("dd.ak(Ljava/lang/String;B)V")
	public void method2539(String arg0) {
		this.field1154 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.aj(B)I")
	public int method2521() {
		return this.field1153;
	}

	@ObfuscatedName("dd.az(II)V")
	public void method2578(int arg0) {
		this.field1153 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.bt(I)I")
	public int method2525() {
		return this.field1149;
	}

	@ObfuscatedName("dd.bs(IB)V")
	public void method2518(int arg0) {
		this.field1149 = arg0;
		method2061();
	}

	@ObfuscatedName("dd.bu(Ljava/lang/String;II)V")
	public void method2531(String arg0, int arg1) {
		int var3 = this.method2534(arg0);
		if (this.field1143.size() >= 10 && !this.field1143.containsKey(var3)) {
			Iterator var4 = this.field1143.entrySet().iterator();
			var4.next();
			var4.remove();
		}
		this.field1143.put(var3, arg1);
		method2061();
	}

	@ObfuscatedName("dd.bi(Ljava/lang/String;I)Z")
	public boolean method2523(String arg0) {
		int var2 = this.method2534(arg0);
		return this.field1143.containsKey(var2);
	}

	@ObfuscatedName("dd.bd(Ljava/lang/String;I)I")
	public int method2532(String arg0) {
		int var2 = this.method2534(arg0);
		return this.field1143.containsKey(var2) ? (Integer) this.field1143.get(var2) : 0;
	}

	@ObfuscatedName("dd.ba(Ljava/lang/String;I)I")
	public int method2534(String arg0) {
		return class446.method7842(arg0.toLowerCase());
	}

	@ObfuscatedName("dd.bb(II)V")
	public void method2506(int arg0) {
		this.field1146 = arg0;
		if (Statics.field3837 != null) {
			Statics.field3837.field1160.method4837(Statics.field240.method2536());
		}
		method2061();
	}

	@ObfuscatedName("dd.bo(S)I")
	public int method2536() {
		return this.field1146;
	}

	@ObfuscatedName("dd.bl(B)Z")
	public boolean method2537() {
		return this.field1157;
	}

	@ObfuscatedName("dd.by(ZI)V")
	public void method2619(boolean arg0) {
		this.field1157 = arg0;
		method2061();
	}
}
