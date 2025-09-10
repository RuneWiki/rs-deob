package deob;

import java.util.Iterator;

@ObfuscatedName("cd")
public class class73 extends class545 {

	@ObfuscatedName("cd.af")
	public final int field992;

	@ObfuscatedName("cd.aw")
	public final int field985;

	@ObfuscatedName("cd.at")
	public final int field986;

	@ObfuscatedName("cd.ac")
	public final int field987;

	@ObfuscatedName("cd.ap")
	public final int field988;

	@ObfuscatedName("cd.aq")
	public final int field989;

	@ObfuscatedName("cd.ao")
	public int field990;

	@ObfuscatedName("cd.as")
	public int field1001;

	@ObfuscatedName("cd.al")
	public final class213 field991;

	@ObfuscatedName("cd.au")
	public class104 field984;

	@ObfuscatedName("cd.ai")
	public int field997;

	@ObfuscatedName("cd.aa")
	public class104 field995;

	@ObfuscatedName("cd.am")
	public int[] field996;

	@ObfuscatedName("cd.an")
	public int field1007;

	@ObfuscatedName("cd.ar")
	public int field998;

	@ObfuscatedName("cd.ae")
	public int field999;

	@ObfuscatedName("cd.ay")
	public class338 field993;

	@ObfuscatedName("cd.ad")
	public class338 field1000;

	@ObfuscatedName("cd.ag")
	public int field1002;

	@ObfuscatedName("cd.av")
	public class338 field1003;

	@ObfuscatedName("cd.ah")
	public int field1004;

	@ObfuscatedName("cd.ab")
	public boolean field1005 = false;

	@ObfuscatedName("cd.ax")
	public static final class437 field1006 = new class437();

	@ObfuscatedName("cd.aj")
	public static final class338 field994 = class338.field3854;

	public class73(int arg0, int arg1, int arg2, int arg3, int arg4, class213 arg5) {
		this.field992 = arg0;
		this.field985 = arg1;
		this.field986 = class357.method6807(arg2);
		this.field987 = class357.method6807(arg3);
		int var7 = arg5.field2330;
		int var8 = arg5.field2331;
		if (arg4 == 1 || arg4 == 3) {
			var7 = arg5.field2331;
			var8 = arg5.field2330;
		}
		this.field988 = class357.method6807(arg2 + var7);
		this.field989 = class357.method6807(arg3 + var8);
		this.field997 = arg5.field2359;
		this.field990 = class357.method6807(arg5.field2360);
		this.field1001 = Math.max(class357.method6807(arg5.field2353 - 1), 0);
		this.field1007 = arg5.field2367;
		this.field998 = arg5.field2368;
		this.field996 = arg5.field2369;
		if (arg5.field2356 == null) {
			this.field991 = null;
		} else {
			this.field991 = arg5;
			this.method2210();
		}
		if (this.field996 != null) {
			this.field999 = class337.method5421(this.field1007, this.field998);
		}
		this.field993 = arg5.field2362;
		this.field1003 = arg5.field2365;
		this.field1004 = arg5.field2363;
		this.field1000 = arg5.field2327;
		this.field1002 = arg5.field2364;
	}

	@ObfuscatedName("hh.af(I)V")
	public static void method4082() {
		for (class73 var0 = (class73) field1006.method8034(); var0 != null; var0 = (class73) field1006.method8036()) {
			var0.method2232();
		}
	}

	@ObfuscatedName("cd.aw(B)V")
	public void method2232() {
		this.method2247(0, this.field1002, this.field1000);
		this.method2205(0, this.field1002, this.field1000);
		this.method2223();
		this.method2207();
		if (method1976(this.field984) == 0 && method1976(this.field995) == 0) {
			this.method2208();
			this.method2270();
			this.method2234();
		}
	}

	@ObfuscatedName("cd.at(Ltj;IIIIB)V")
	public void method2203(class506 arg0, int arg1, int arg2, int arg3, int arg4) {
		int var6 = Statics.field240.method2624();
		if (this.field1005) {
			this.method2247(0, this.field1002, this.field1000);
			this.method2205(0, this.field1002, this.field1000);
			this.method2223();
			this.method2207();
			if (method1976(this.field984) == 0 && method1976(this.field995) == 0) {
				this.method2208();
				this.method2270();
				this.field1005 = false;
			}
		} else if (this.field997 != -1 || this.field996 != null) {
			class506 var7 = client.field334.method2307(this.field992);
			if (var6 != 0 && method5667(arg0, var7, arg1, this.field985)) {
				this.method2223();
				this.method2207();
				class80 var9 = client.field334.method2311(this.field992);
				class453 var10 = client.method1977(var9, this.field986, this.field987);
				class453 var11 = client.method1977(var9, this.field988, this.field989);
				int var12 = (int) var10.field5176;
				int var13 = (int) var10.field5170;
				int var14 = (int) var11.field5176;
				int var15 = (int) var11.field5170;
				var10.method8336();
				var11.method8336();
				int var16 = class452.method7591(arg2, arg3, var12, var13, var14, var15);
				int var17 = Math.max(var16 - 64, 0);
				double var20;
				if (this.field1001 < this.field990) {
					var20 = class338.method5562((long) (this.field990 - var17), (long) (this.field990 - this.field1001), this.field993);
				} else {
					var20 = 1.0D;
				}
				int var22 = (int) ((double) var6 * var20);
				int var23 = method1976(this.field984);
				int var24 = method1976(this.field995);
				if (var23 < var22) {
					this.method2247(var22, this.field1004, this.field1003);
				} else if (var23 > var22) {
					this.method2247(var22, this.field1002, this.field1000);
				}
				if (var24 < var22) {
					this.method2205(var22, this.field1004, this.field1003);
				} else if (var24 > var22) {
					this.method2205(var22, this.field1002, this.field1000);
				}
				if (this.field984 != null) {
					this.method2223();
				} else if (this.field997 >= 0 && var22 > 0) {
					this.method2252(this.field997, 0);
				}
				if (this.field995 != null) {
					this.method2207();
				} else if (this.field996 != null && (this.field999 -= arg4) <= 0 && var22 > 0) {
					this.method2212(this.field996, var22);
					this.method2205(var22, this.field1004, this.field1003);
					this.method2207();
				}
			} else {
				this.method2247(0, 150, field994);
				this.method2205(0, 150, field994);
				this.method2223();
				this.method2207();
			}
		}
	}

	@ObfuscatedName("cd.ac(IILmx;B)V")
	public void method2247(int arg0, int arg1, class338 arg2) {
		if (this.field984 == null || this.field984.field1410 == arg0) {
			return;
		}
		this.field984.field1393 = this.field984.method3089();
		this.field984.field1394 = class335.method3987();
		this.field984.field1410 = arg0;
		class104 var4 = this.field984;
		int var5 = Math.abs(this.field984.field1393 - this.field984.field1410);
		int var6 = Statics.field240.method2624();
		int var7;
		if (var5 >= var6) {
			var7 = arg1;
		} else {
			var7 = (int) ((float) var5 / (float) var6 * (float) arg1);
		}
		var4.field1404 = var7;
		this.field984.field1406 = arg2;
	}

	@ObfuscatedName("cd.ap(IILmx;S)V")
	public void method2205(int arg0, int arg1, class338 arg2) {
		if (this.field995 == null || this.field995.field1410 == arg0) {
			return;
		}
		this.field995.field1393 = this.field995.method3089();
		this.field995.field1394 = class335.method3987();
		int var4 = Math.abs(this.field995.field1393 - arg0);
		int var5 = Statics.field240.method2624();
		int var6;
		if (var4 >= var5) {
			var6 = arg1;
		} else {
			var6 = (int) ((float) var4 / (float) var5 * (float) arg1);
		}
		this.field995.field1404 = var6;
		this.field995.field1410 = arg0;
		this.field995.field1406 = arg2;
	}

	@ObfuscatedName("cd.aq(B)V")
	public void method2223() {
		if (this.field984 == null) {
			return;
		}
		int var1 = this.field984.method3089();
		long var2 = class335.method3987();
		long var4 = var2 - this.field984.field1394;
		int var6 = this.field984.field1393;
		int var7 = this.field984.field1410;
		class338 var8 = this.field984.field1406;
		int var9 = this.field984.field1404;
		int var10;
		if (var1 == var7) {
			var10 = var1;
		} else {
			int var13;
			if (var1 > var7) {
				double var11 = 1.0D - class338.method5562(var4, (long) var9, var8);
				var13 = (int) ((double) (var6 - var7) * var11) + var7;
			} else {
				double var14 = class338.method5562(var4, (long) var9, var8);
				var13 = (int) ((double) (var7 - var6) * var14) + var6;
			}
			var10 = var13;
		}
		if (var1 != var10) {
			this.field984.method3179(var10);
		}
	}

	@ObfuscatedName("ci.ao(Ldo;I)I")
	public static int method1976(class104 arg0) {
		return arg0 == null ? 0 : arg0.method3089();
	}

	@ObfuscatedName("cd.as(I)V")
	public void method2207() {
		if (this.field995 == null) {
			return;
		}
		int var1 = this.field995.method3089();
		long var2 = class335.method3987();
		long var4 = var2 - this.field995.field1394;
		int var6 = this.field995.field1393;
		int var7 = this.field995.field1410;
		class338 var8 = this.field995.field1406;
		int var9 = this.field995.field1404;
		int var10;
		if (var1 == var7) {
			var10 = var1;
		} else {
			int var13;
			if (var1 > var7) {
				double var11 = 1.0D - class338.method5562(var4, (long) var9, var8);
				var13 = (int) ((double) (var6 - var7) * var11) + var7;
			} else {
				double var14 = class338.method5562(var4, (long) var9, var8);
				var13 = (int) ((double) (var7 - var6) * var14) + var6;
			}
			var10 = var13;
		}
		if (var1 != var10) {
			this.field995.method3179(var10);
		}
		if (!this.field995.method9763()) {
			this.field995 = null;
		}
	}

	@ObfuscatedName("cd.al(IIB)V")
	public void method2252(int arg0, int arg1) {
		int var3 = Statics.field1515.method7702(arg0) - 1;
		class95 var4 = class95.method2928(Statics.field1515, arg0, var3);
		if (var4 == null) {
			return;
		}
		class96 var5 = var4.method2935(Statics.field240.method2537());
		class104 var6 = class104.method3067(var5, 100, arg1);
		if (var6 == null) {
			return;
		}
		var6.method3087(-1);
		Statics.field145.method2890(var6);
		this.field984 = var6;
	}

	@ObfuscatedName("cd.au([III)V")
	public void method2212(int[] arg0, int arg1) {
		int var3 = arg0[(int) (Math.random() * (double) arg0.length)];
		int var4 = Statics.field1515.method7702(var3) - 1;
		class95 var5 = class95.method2928(Statics.field1515, var3, var4);
		if (var5 == null) {
			return;
		}
		class96 var6 = var5.method2935(Statics.field240.method2537());
		class104 var7 = class104.method3067(var6, 100, arg1);
		if (var7 == null) {
			return;
		}
		var7.method3087(0);
		Statics.field145.method2890(var7);
		var7.method3069();
		this.field995 = var7;
		this.field999 = class337.method5421(this.field1007, this.field998);
	}

	@ObfuscatedName("lx.ai(I)V")
	public static void method6274() {
		Iterator var0 = client.field334.iterator();
		while (var0.hasNext()) {
			class80 var1 = (class80) var0.next();
			for (class73 var2 = (class73) var1.method2635().method8034(); var2 != null; var2 = (class73) var1.method2635().method8036()) {
				var2.method2213();
			}
		}
	}

	@ObfuscatedName("rp.aa(I)V")
	public static void method8894() {
		Iterator var0 = client.field334.iterator();
		while (var0.hasNext()) {
			class80 var1 = (class80) var0.next();
			for (class73 var2 = (class73) var1.method2635().method8034(); var2 != null; var2 = (class73) var1.method2635().method8036()) {
				if (var2.field991 != null) {
					var2.method2210();
				}
			}
		}
	}

	@ObfuscatedName("cd.am(I)V")
	public void method2210() {
		int var1 = this.field997;
		class213 var2 = this.field991.method4310();
		if (var2 == null) {
			this.field997 = -1;
			this.field990 = 0;
			this.field1001 = 0;
			this.field1007 = 0;
			this.field998 = 0;
			this.field996 = null;
			this.field993 = class213.field2310;
			this.field1000 = class213.field2314;
			this.field1002 = 300;
			this.field1003 = class213.field2346;
			this.field1004 = 300;
		} else {
			this.field997 = var2.field2359;
			this.field990 = class357.method6807(var2.field2360);
			this.field1001 = class357.method6807(var2.field2353);
			this.field1007 = var2.field2367;
			this.field998 = var2.field2368;
			this.field996 = var2.field2369;
			this.field993 = var2.field2362;
			this.field1003 = var2.field2365;
			this.field1004 = var2.field2363;
			this.field1000 = var2.field2327;
			this.field1002 = var2.field2364;
		}
		if (this.field997 != var1) {
			this.field1005 = true;
		}
	}

	@ObfuscatedName("ke.an(Ltj;Ltj;IIS)Z")
	public static boolean method5667(class506 arg0, class506 arg1, int arg2, int arg3) {
		if (arg0 == arg1) {
			return arg2 == arg3;
		} else if (arg0 != null && arg1 == null) {
			return arg0.field5426.method4151() == arg2 && arg0.method2177() == arg3;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cd.ar(S)V")
	public void method2208() {
		if (this.field984 != null) {
			Statics.field145.method2891(this.field984);
			this.field984 = null;
		}
	}

	@ObfuscatedName("cd.ae(B)V")
	public void method2270() {
		if (this.field995 != null) {
			Statics.field145.method2891(this.field995);
			this.field995 = null;
		}
	}

	@ObfuscatedName("cd.ay(B)V")
	public void method2213() {
		field1006.method8033(this);
	}

	@ObfuscatedName("cd.ad(I)I")
	public int method2251() {
		return this.field997;
	}

	@ObfuscatedName("cd.ag(B)I")
	public int method2215() {
		return this.field986;
	}

	@ObfuscatedName("cd.av(I)I")
	public int method2216() {
		return this.field988;
	}

	@ObfuscatedName("cd.ah(B)I")
	public int method2278() {
		return this.field987;
	}

	@ObfuscatedName("cd.ab(B)I")
	public int method2218() {
		return this.field989;
	}

	@ObfuscatedName("cd.ax(I)I")
	public int method2221() {
		return this.field985;
	}

	@ObfuscatedName("cd.ak(B)I")
	public int method2220() {
		return this.field990;
	}

	@ObfuscatedName("cd.aj(B)I")
	public int method2261() {
		return this.field1001;
	}

	public String toString() {
		return super.toString();
	}

	@ObfuscatedName("cd.cv()V")
	public void method2234() {
		super.method2234();
	}
}
