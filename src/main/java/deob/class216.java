package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ij")
public class class216 extends class541 {

	@ObfuscatedName("ij.az")
	public static class321 field2467 = new class321(64);

	@ObfuscatedName("ij.bt")
	public static class321 field2468 = new class321(100);

	@ObfuscatedName("ij.bs")
	public static class321 field2469 = new class321(100);

	@ObfuscatedName("ij.bu")
	public static boolean field2470 = false;

	@ObfuscatedName("ij.bi")
	public int field2459 = -1;

	@ObfuscatedName("ij.bd")
	public Map field2472;

	@ObfuscatedName("ij.ba")
	public int field2456 = 0;

	@ObfuscatedName("ij.bb")
	public int field2474 = 0;

	@ObfuscatedName("ij.bo")
	public int[] field2475;

	@ObfuscatedName("ij.bl")
	public int[] field2476;

	@ObfuscatedName("ij.by")
	public int[] field2461;

	@ObfuscatedName("ij.bg")
	public int field2478;

	@ObfuscatedName("ij.bx")
	public int field2494 = -1;

	@ObfuscatedName("ij.bq")
	public int[] field2480;

	@ObfuscatedName("ij.bz")
	public boolean[] field2471;

	@ObfuscatedName("ij.bn")
	public int field2482 = 0;

	@ObfuscatedName("ij.be")
	public boolean field2483 = false;

	@ObfuscatedName("ij.bh")
	public int field2481 = 5;

	@ObfuscatedName("ij.bk")
	public int field2485 = -1;

	@ObfuscatedName("ij.bp")
	public int field2491 = -1;

	@ObfuscatedName("ij.br")
	public int field2487 = 99;

	@ObfuscatedName("ij.bv")
	public int field2493 = -1;

	@ObfuscatedName("ij.bj")
	public int field2486 = -1;

	@ObfuscatedName("ij.bm")
	public int field2490 = 2;

	@ObfuscatedName("ij.bf")
	public boolean field2484 = false;

	@ObfuscatedName("gt.af(II)Lij;")
	public static class216 method3858(int arg0) {
		class216 var1 = (class216) field2467.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		byte[] var2 = Statics.field1612.method7692(12, arg0);
		class216 var3 = new class216();
		if (var2 != null) {
			var3.method4458(new class591(var2));
		}
		var3.method4460();
		field2467.method6454(var3, (long) arg0);
		return var3;
	}

	@ObfuscatedName("by.aw(II)Ljj;")
	public static class236 method723(int arg0) {
		class236 var1 = (class236) field2468.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		class236 var2 = class236.method6241(Statics.field2466, Statics.field2511, arg0);
		if (var2 != null) {
			field2468.method6454(var2, (long) arg0);
		}
		return var2;
	}

	@ObfuscatedName("ey.ac(II)Lfh;")
	public static class147 method3379(int arg0) {
		class147 var1 = (class147) field2469.method6463((long) arg0);
		if (var1 != null) {
			return var1;
		}
		class147 var2 = class147.method6264(Statics.field5184, Statics.field2511, arg0);
		if (var2 != null) {
			field2469.method6454(var2, (long) arg0);
		}
		return var2;
	}

	@ObfuscatedName("ij.ap(Lwb;I)V")
	public void method4458(class591 arg0) {
		while (true) {
			int var2 = arg0.method10339();
			if (var2 == 0) {
				return;
			}
			this.method4488(arg0, var2);
		}
	}

	@ObfuscatedName("ij.aq(Lwb;IB)V")
	public void method4488(class591 arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.method10341();
			this.field2461 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2461[var4] = arg0.method10341();
			}
			this.field2475 = new int[var3];
			for (int var5 = 0; var5 < var3; var5++) {
				this.field2475[var5] = arg0.method10341();
			}
			for (int var6 = 0; var6 < var3; var6++) {
				this.field2475[var6] += arg0.method10341() << 16;
			}
		} else if (arg1 == 2) {
			this.field2494 = arg0.method10341();
		} else if (arg1 == 3) {
			int var7 = arg0.method10339();
			this.field2480 = new int[var7 + 1];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field2480[var8] = arg0.method10339();
			}
			this.field2480[var7] = 9999999;
		} else if (arg1 == 4) {
			this.field2483 = true;
		} else if (arg1 == 5) {
			this.field2481 = arg0.method10339();
		} else if (arg1 == 6) {
			this.field2485 = arg0.method10341();
		} else if (arg1 == 7) {
			this.field2491 = arg0.method10341();
		} else if (arg1 == 8) {
			this.field2487 = arg0.method10339();
		} else if (arg1 == 9) {
			this.field2493 = arg0.method10339();
		} else if (arg1 == 10) {
			this.field2486 = arg0.method10339();
		} else if (arg1 == 11) {
			this.field2490 = arg0.method10339();
		} else if (arg1 == 12) {
			int var9 = arg0.method10339();
			this.field2476 = new int[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field2476[var10] = arg0.method10341();
			}
			for (int var11 = 0; var11 < var9; var11++) {
				this.field2476[var11] += arg0.method10341() << 16;
			}
		} else if (arg1 == 13) {
			this.field2459 = arg0.method10345();
		} else if (arg1 == 14) {
			int var12 = arg0.method10341();
			if (this.field2472 == null) {
				this.field2472 = new HashMap();
			}
			for (int var13 = 0; var13 < var12; var13++) {
				int var14;
				class212 var25;
				label111: {
					var14 = arg0.method10341();
					if (arg0 != null) {
						boolean var15 = false;
						boolean var16 = true;
						boolean var17 = false;
						boolean var18 = false;
						boolean var19 = false;
						int var20 = arg0.method10341();
						int var21 = arg0.method10339();
						int var22 = arg0.method10339();
						int var23 = arg0.method10339();
						int var24 = arg0.method10339();
						if (var20 >= 1 && var22 >= 1 && var23 >= 0 && var24 >= 0) {
							var25 = new class212(var20, var21, var22, var23, var24);
							break label111;
						}
					}
					var25 = null;
				}
				if (var25 != null) {
					if (!this.field2472.containsKey(var14)) {
						this.field2472.put(var14, new ArrayList());
					}
					((ArrayList) this.field2472.get(var14)).add(var25);
				}
			}
		} else if (arg1 == 15) {
			this.field2456 = arg0.method10341();
			this.field2474 = arg0.method10341();
		} else if (arg1 == 16) {
			this.field2482 = arg0.method10340();
		} else if (arg1 == 17) {
			this.field2471 = new boolean[256];
			for (int var27 = 0; var27 < this.field2471.length; var27++) {
				this.field2471[var27] = false;
			}
			int var28 = arg0.method10339();
			for (int var29 = 0; var29 < var28; var29++) {
				this.field2471[arg0.method10339()] = true;
			}
		} else if (arg1 == 19) {
			this.field2484 = true;
		}
	}

	@ObfuscatedName("ij.ao(I)V")
	public void method4460() {
		if (this.field2493 == -1) {
			if (this.field2480 == null && this.field2471 == null) {
				this.field2493 = 0;
			} else {
				this.field2493 = 2;
			}
		}
		if (this.field2486 == -1) {
			if (this.field2480 == null && this.field2471 == null) {
				this.field2486 = 0;
			} else {
				this.field2486 = 2;
			}
		}
		if (this.field2461 != null) {
			this.field2478 = 0;
			for (int var1 = 0; var1 < this.field2461.length; var1++) {
				this.field2478 += this.field2461[var1];
			}
		}
	}

	@ObfuscatedName("ij.as(Ljn;IB)Ljn;")
	public class242 method4461(class242 arg0, int arg1) {
		if (this.method4467()) {
			class147 var7 = Statics.method4333(this.field2459);
			if (var7 == null) {
				return arg0.method5123(true);
			} else {
				class242 var8 = arg0.method5123(!var7.method3611());
				var8.method5146(var7, arg1);
				return var8;
			}
		} else {
			int var3 = this.field2475[arg1];
			class236 var4 = method723(var3 >> 16);
			int var5 = var3 & 0xFFFF;
			if (var4 == null) {
				return arg0.method5123(true);
			} else {
				class242 var6 = arg0.method5123(!var4.method5060(var5));
				var6.method5132(var4, var5);
				return var6;
			}
		}
	}

	@ObfuscatedName("ij.al(Ljn;IIB)Ljn;")
	public class242 method4462(class242 arg0, int arg1, int arg2) {
		if (this.method4467()) {
			class147 var9 = Statics.method4333(this.field2459);
			if (var9 == null) {
				return arg0.method5123(true);
			}
			class242 var10 = arg0.method5123(!var9.method3611());
			int var11 = arg2 & 0x3;
			if (var11 == 1) {
				var10.method5141();
			} else if (var11 == 2) {
				var10.method5140();
			} else if (var11 == 3) {
				var10.method5213();
			}
			var10.method5146(var9, arg1);
			if (var11 == 1) {
				var10.method5213();
			} else if (var11 == 2) {
				var10.method5140();
			} else if (var11 == 3) {
				var10.method5141();
			}
			return var10;
		}
		int var4 = this.field2475[arg1];
		class236 var5 = method723(var4 >> 16);
		int var6 = var4 & 0xFFFF;
		if (var5 == null) {
			return arg0.method5123(true);
		}
		class242 var7 = arg0.method5123(!var5.method5060(var6));
		int var8 = arg2 & 0x3;
		if (var8 == 1) {
			var7.method5141();
		} else if (var8 == 2) {
			var7.method5140();
		} else if (var8 == 3) {
			var7.method5213();
		}
		var7.method5132(var5, var6);
		if (var8 == 1) {
			var7.method5213();
		} else if (var8 == 2) {
			var7.method5140();
		} else if (var8 == 3) {
			var7.method5141();
		}
		return var7;
	}

	@ObfuscatedName("ij.au(Ljn;II)Ljn;")
	public class242 method4463(class242 arg0, int arg1) {
		if (this.method4467()) {
			class147 var7 = Statics.method4333(this.field2459);
			if (var7 == null) {
				return arg0.method5255(true);
			} else {
				class242 var8 = arg0.method5255(!var7.method3611());
				var8.method5146(var7, arg1);
				return var8;
			}
		} else {
			int var3 = this.field2475[arg1];
			class236 var4 = method723(var3 >> 16);
			int var5 = var3 & 0xFFFF;
			if (var4 == null) {
				return arg0.method5255(true);
			} else {
				class242 var6 = arg0.method5255(!var4.method5060(var5));
				var6.method5132(var4, var5);
				return var6;
			}
		}
	}

	@ObfuscatedName("ij.ai(Ljn;ILij;II)Ljn;")
	public class242 method4464(class242 arg0, int arg1, class216 arg2, int arg3) {
		if (field2470 && !this.method4467() && !arg2.method4467()) {
			return this.method4465(arg0, arg1, arg2, arg3);
		}
		class242 var5 = arg0.method5123(false);
		boolean var6 = false;
		class236 var7 = null;
		class230 var8 = null;
		if (this.method4467()) {
			class147 var9 = this.method4470();
			if (var9 == null) {
				return var5;
			}
			if (arg2.method4467() && this.field2471 == null) {
				var5.method5146(var9, arg1);
				return var5;
			}
			var8 = var9.field1732;
			var5.method5163(var8, var9, arg1, this.field2471, false, !arg2.method4467());
		} else {
			int var10 = this.field2475[arg1];
			var7 = method723(var10 >> 16);
			arg1 = var10 & 0xFFFF;
			if (var7 == null) {
				return arg2.method4461(arg0, arg3);
			}
			if (!arg2.method4467() && (this.field2480 == null || arg3 == -1)) {
				var5.method5132(var7, arg1);
				return var5;
			}
			if (this.field2480 == null || arg3 == -1) {
				var5.method5132(var7, arg1);
				return var5;
			}
			var6 = arg2.method4467();
			if (!var6) {
				var5.method5137(var7, arg1, this.field2480, false);
			}
		}
		if (arg2.method4467()) {
			class147 var11 = arg2.method4470();
			if (var11 == null) {
				return var5;
			}
			if (var8 == null) {
				var8 = var11.field1732;
			}
			var5.method5163(var8, var11, arg3, this.field2471, true, true);
		} else {
			int var12 = arg2.field2475[arg3];
			class236 var13 = method723(var12 >> 16);
			int var14 = var12 & 0xFFFF;
			if (var13 == null) {
				return this.method4461(arg0, arg1);
			}
			var5.method5137(var13, var14, this.field2480, true);
		}
		if (var6 && var7 != null) {
			var5.method5137(var7, arg1, this.field2480, false);
		}
		var5.method5131();
		return var5;
	}

	@ObfuscatedName("ij.aa(Ljn;ILij;II)Ljn;")
	public class242 method4465(class242 arg0, int arg1, class216 arg2, int arg3) {
		int var5 = this.field2475[arg1];
		class236 var6 = method723(var5 >> 16);
		int var7 = var5 & 0xFFFF;
		if (var6 == null) {
			return arg2.method4461(arg0, arg3);
		}
		int var8 = arg2.field2475[arg3];
		class236 var9 = method723(var8 >> 16);
		int var10 = var8 & 0xFFFF;
		if (var9 == null) {
			class242 var11 = arg0.method5123(!var6.method5060(var7));
			var11.method5132(var6, var7);
			return var11;
		} else {
			class242 var12 = arg0.method5123(!var6.method5060(var7) & !var9.method5060(var10));
			var12.method5136(var6, var7, var9, var10, this.field2480);
			return var12;
		}
	}

	@ObfuscatedName("ij.am(Ljn;II)Ljn;")
	public class242 method4466(class242 arg0, int arg1) {
		if (this.method4467()) {
			return this.method4461(arg0, arg1);
		}
		int var3 = this.field2475[arg1];
		class236 var4 = method723(var3 >> 16);
		int var5 = var3 & 0xFFFF;
		if (var4 == null) {
			return arg0.method5123(true);
		}
		class236 var6 = null;
		int var7 = 0;
		if (this.field2476 != null && arg1 < this.field2476.length) {
			int var8 = this.field2476[arg1];
			var6 = method723(var8 >> 16);
			var7 = var8 & 0xFFFF;
		}
		if (var6 == null || var7 == 65535) {
			class242 var10 = arg0.method5123(!var4.method5060(var5));
			var10.method5132(var4, var5);
			return var10;
		} else {
			class242 var9 = arg0.method5123(!var4.method5060(var5) & !var6.method5060(var7));
			var9.method5132(var4, var5);
			var9.method5132(var6, var7);
			return var9;
		}
	}

	@ObfuscatedName("ij.an(I)Z")
	public boolean method4467() {
		return this.field2459 >= 0;
	}

	@ObfuscatedName("ij.ar(B)I")
	public int method4468() {
		return this.field2474 - this.field2456;
	}

	@ObfuscatedName("ij.ae(I)I")
	public int method4469() {
		if (!this.method4467()) {
			return 2;
		}
		int var1 = this.field2459;
		class147 var2 = method3379(var1);
		int var3;
		if (var2 == null) {
			var3 = 2;
		} else {
			var3 = var2.method3609() ? 0 : 1;
		}
		return var3;
	}

	@ObfuscatedName("ij.ay(B)Lfh;")
	public class147 method4470() {
		return this.method4467() ? Statics.method4333(this.field2459) : null;
	}

	@ObfuscatedName("ij.ad(I)Z")
	public boolean method4490() {
		if (this.method4467()) {
			return this.method4469() == 0;
		} else {
			return method723(this.field2475[0] >> 16) != null;
		}
	}
}
