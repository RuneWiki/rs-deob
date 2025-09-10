package deob;

@ObfuscatedName("dt")
public class class82 extends class76 {

	@ObfuscatedName("dt.aw")
	public static int field1186 = 1;

	@ObfuscatedName("dt.at")
	public static int field1187 = 1;

	@ObfuscatedName("dt.ac")
	public class196 field1185;

	@ObfuscatedName("dt.ap")
	public boolean field1189 = false;

	@ObfuscatedName("dt.aq")
	public String field1190 = "";

	@ObfuscatedName("dt.ao")
	public int field1191 = 31;

	@ObfuscatedName("dt.as")
	public class592 field1192;

	@ObfuscatedName("dt.al")
	public class195 field1188;

	@ObfuscatedName("dt.au")
	public class195 field1194;

	public class82(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("dt.aw(Ljava/lang/String;I)V")
	public void method2667(String arg0) {
		this.field1190 = arg0 == null ? "" : arg0;
	}

	@ObfuscatedName("dt.ac(IB)V")
	public void method2668(int arg0) {
		this.field1191 = arg0;
	}

	@ObfuscatedName("dt.ap(IB)Z")
	public boolean method2669(int arg0) {
		if (arg0 >= 0 && arg0 <= 4) {
			return (this.field1191 & 0x1 << arg0) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("dt.aq(I)Ljava/lang/String;")
	public final String method2666() {
		if (!this.field1190.isEmpty()) {
			return this.field1190;
		}
		class196 var1 = this.field1185;
		if (var1.field2100 != null) {
			var1 = var1.method4066();
			if (var1 == null) {
				var1 = this.field1185;
			}
		}
		return var1.field2111;
	}

	@ObfuscatedName("dt.ao(ILko;S)V")
	public final void method2686(int arg0, class281 arg1) {
		int var3 = this.field1040[0];
		int var4 = this.field1108[0];
		if (arg0 == 0) {
			var3--;
			var4++;
		}
		if (arg0 == 1) {
			var4++;
		}
		if (arg0 == 2) {
			var3++;
			var4++;
		}
		if (arg0 == 3) {
			var3--;
		}
		if (arg0 == 4) {
			var3++;
		}
		if (arg0 == 5) {
			var3--;
			var4--;
		}
		if (arg0 == 6) {
			var4--;
		}
		if (arg0 == 7) {
			var3++;
			var4--;
		}
		if (this.field1075.method8901() && this.field1075.method8916().field2486 == 1) {
			this.method2426();
		}
		this.method2382(var3, var4, arg1);
	}

	@ObfuscatedName("dt.as(IIZI)V")
	public final void method2672(int arg0, int arg1, boolean arg2) {
		if (this.field1075.method8901() && this.field1075.method8916().field2486 == 1) {
			this.method2426();
		}
		if (!arg2) {
			int var4 = arg0 - this.field1040[0];
			int var5 = arg1 - this.field1108[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2382(arg0, arg1, class281.field3282);
				return;
			}
		}
		this.method2383(arg0, arg1);
	}

	@ObfuscatedName("dt.at(I)Ljn;")
	public final class242 method1847() {
		if (this.field1185 == null) {
			return null;
		}
		class470 var1 = this.method2400();
		class470 var2 = this.method2380(var1);
		if (var1 == null && var2 == null) {
			var2 = this.field1094;
			if (this.field1094.method8902(30)) {
				return null;
			}
		}
		class216 var3 = var1 == null ? null : var1.method8916();
		class216 var4 = var2 == null ? null : var2.method8916();
		int var5 = var1 == null ? -1 : var1.method8900();
		int var6 = var2 == null ? -1 : var2.method8900();
		Object var7 = null;
		class242 var8;
		if (this.field1188 != null && this.field1188.field2097) {
			var8 = Statics.field1109.field936.method6986(var3, var5, var4, var6);
		} else {
			var8 = this.field1185.method4028(var3, var5, var4, var6, this.field1188);
		}
		if (var8 == null) {
			return null;
		}
		var8.method5128();
		this.field1071 = var8.field2802;
		int var9 = var8.field2909;
		class242 var10 = this.method2392(var8);
		if (this.field1185.field2112 == 1) {
			var10.field2942 = true;
		}
		if (this.field1077.method5314() && client.field413 >= this.field1052 && client.field413 < this.field1053) {
			var10.method5158(this.field1077, (short) var9);
		} else {
			var10.method5262();
		}
		return var10;
	}

	@ObfuscatedName("dt.ae(I)Z")
	public final boolean method2132() {
		return this.field1185 != null;
	}

	@ObfuscatedName("dt.al(B)[I")
	public int[] method2675() {
		return this.field1192 == null ? this.field1185.method4036() : this.field1192.method10602();
	}

	@ObfuscatedName("dt.ai(I)[S")
	public short[] method2692() {
		return this.field1192 == null ? this.field1185.method4034() : this.field1192.method10603();
	}

	@ObfuscatedName("dt.aa(IISS)V")
	public void method2677(int arg0, int arg1, short arg2) {
		if (this.field1192 == null) {
			this.field1192 = new class592(this.field1185);
		}
		this.field1192.method10604(arg0, arg1, arg2);
	}

	@ObfuscatedName("dt.am([I[SB)V")
	public void method2678(int[] arg0, short[] arg1) {
		if (this.field1192 == null) {
			this.field1192 = new class592(this.field1185);
		}
		this.field1192.method10601(arg0, arg1);
	}

	@ObfuscatedName("dt.an(I)V")
	public void method2702() {
		this.field1192 = null;
	}

	@ObfuscatedName("dt.ar(I)Lhq;")
	public class195 method2680() {
		return this.field1194;
	}

	@ObfuscatedName("dt.ad(Lhq;I)V")
	public void method2681(class195 arg0) {
		this.field1194 = arg0;
	}

	@ObfuscatedName("dt.ag(Lhq;B)V")
	public void method2682(class195 arg0) {
		this.field1188 = arg0;
	}

	@ObfuscatedName("dt.ak(I)V")
	public void method2683() {
		this.field1194 = null;
	}

	@ObfuscatedName("dt.aj(I)V")
	public void method2684() {
		this.field1188 = null;
	}

	@ObfuscatedName("dt.dy(I)I")
	public int method2397() {
		return this.field1185.field2119 == -1 ? this.field1071 : this.field1185.field2119;
	}

	@ObfuscatedName("dt.av(B)I")
	public int method2148() {
		return this.method2399() ? 0 : this.field1185.method4046();
	}
}
