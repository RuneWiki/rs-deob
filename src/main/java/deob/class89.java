package deob;

import java.util.Iterator;

@ObfuscatedName("dh")
public class class89 {

	@ObfuscatedName("dh.at")
	public final int[] field1244 = new int[2048];

	@ObfuscatedName("dh.ac")
	public final class48[] field1256 = new class48[2048];

	@ObfuscatedName("dh.ap")
	public final boolean[] field1246 = new boolean[2048];

	@ObfuscatedName("dh.aq")
	public final class281[] field1247 = new class281[2048];

	@ObfuscatedName("dh.ao")
	public final class591 field1245 = new class591(new byte[5000]);

	@ObfuscatedName("dh.as")
	public final String[] field1254 = new String[3];

	@ObfuscatedName("dh.al")
	public final int[] field1250 = new int[2048];

	@ObfuscatedName("dh.au")
	public final int[] field1251 = new int[2048];

	@ObfuscatedName("dh.ai")
	public final int[] field1242 = new int[2048];

	@ObfuscatedName("dh.aa")
	public int field1255 = 0;

	@ObfuscatedName("dh.am")
	public int field1253 = 0;

	@ObfuscatedName("dh.an")
	public int field1249 = 0;

	@ObfuscatedName("dh.ar")
	public int field1252 = 0;

	public class89() {
		for (int var1 = 0; var1 < 2048; var1++) {
			this.field1256[var1] = new class48(var1);
		}
	}

	@ObfuscatedName("dh.af(Lwf;I)V")
	public final void method2782(class590 arg0) {
		this.method2779();
		arg0.method10289();
		int var2 = client.field492;
		class48 var3 = this.field1256[var2];
		int var4 = arg0.method10290(30);
		var3.method1777(-1);
		var3.field676.method6860(var4);
		var3.field677 = 0;
		class70 var5 = var3.method1752(var2, Statics.field3837);
		var3.method1749(var5);
		Statics.field3837.field1170.method7908(var5, (long) var2);
		Statics.field1109 = var5;
		this.field1255 = 0;
		this.field1244[++this.field1255 - 1] = var2;
		this.field1253 = 0;
		for (int var6 = 1; var6 < 2048; var6++) {
			if (var2 != var6) {
				int var7 = arg0.method10290(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 0xFF;
				int var10 = var7 & 0xFF;
				this.field1256[var6].method1777(class357.method6851(var8, var9, var10));
				this.field1250[++this.field1253 - 1] = var6;
			}
		}
		arg0.method10291();
	}

	@ObfuscatedName("dh.aw(Lwf;II)V")
	public final void method2786(class590 arg0, int arg1) {
		int var3 = arg0.field5920;
		this.field1252 = 0;
		this.method2769(arg0);
		this.method2773();
		this.method2774();
		this.method2775(arg0);
		this.method2776();
		if (arg0.field5920 - var3 != arg1) {
			throw new RuntimeException(arg0.field5920 - var3 + " " + arg1);
		}
	}

	@ObfuscatedName("dh.at(Lwf;I)V")
	public void method2769(class590 arg0) {
		this.field1249 = 0;
		int var2 = 0;
		arg0.method10289();
		for (int var3 = 0; var3 < this.field1255; var3++) {
			int var4 = this.field1244[var3];
			if ((this.field1256[var4].field677 & 0x1) == 0) {
				if (var2 > 0) {
					var2--;
					this.field1256[var4].field677 = (byte) (this.field1256[var4].field677 | 0x2);
				} else {
					int var5 = arg0.method10290(1);
					if (var5 == 0) {
						var2 = this.method2785(arg0);
						this.field1256[var4].field677 = (byte) (this.field1256[var4].field677 | 0x2);
					} else {
						this.method2771(arg0, var4);
					}
				}
			}
		}
		arg0.method10291();
		if (var2 != 0) {
			throw new RuntimeException();
		}
		arg0.method10289();
		for (int var6 = 0; var6 < this.field1255; var6++) {
			int var7 = this.field1244[var6];
			if ((this.field1256[var7].field677 & 0x1) != 0) {
				if (var2 > 0) {
					var2--;
					this.field1256[var7].field677 = (byte) (this.field1256[var7].field677 | 0x2);
				} else {
					int var8 = arg0.method10290(1);
					if (var8 == 0) {
						var2 = this.method2785(arg0);
						this.field1256[var7].field677 = (byte) (this.field1256[var7].field677 | 0x2);
					} else {
						this.method2771(arg0, var7);
					}
				}
			}
		}
		arg0.method10291();
		if (var2 != 0) {
			throw new RuntimeException();
		}
		arg0.method10289();
		for (int var9 = 0; var9 < this.field1253; var9++) {
			int var10 = this.field1250[var9];
			if ((this.field1256[var10].field677 & 0x1) != 0) {
				if (var2 > 0) {
					var2--;
					this.field1256[var10].field677 = (byte) (this.field1256[var10].field677 | 0x2);
				} else {
					int var11 = arg0.method10290(1);
					if (var11 == 0) {
						var2 = this.method2785(arg0);
						this.field1256[var10].field677 = (byte) (this.field1256[var10].field677 | 0x2);
					} else if (this.method2772(arg0, var10)) {
						this.field1256[var10].field677 = (byte) (this.field1256[var10].field677 | 0x2);
					}
				}
			}
		}
		arg0.method10291();
		if (var2 != 0) {
			throw new RuntimeException();
		}
		arg0.method10289();
		for (int var12 = 0; var12 < this.field1253; var12++) {
			int var13 = this.field1250[var12];
			if ((this.field1256[var13].field677 & 0x1) == 0) {
				if (var2 > 0) {
					var2--;
					this.field1256[var13].field677 = (byte) (this.field1256[var13].field677 | 0x2);
				} else {
					int var14 = arg0.method10290(1);
					if (var14 == 0) {
						var2 = this.method2785(arg0);
						this.field1256[var13].field677 = (byte) (this.field1256[var13].field677 | 0x2);
					} else if (this.method2772(arg0, var13)) {
						this.field1256[var13].field677 = (byte) (this.field1256[var13].field677 | 0x2);
					}
				}
			}
		}
		arg0.method10291();
		if (var2 != 0) {
			throw new RuntimeException();
		}
		this.field1255 = 0;
		this.field1253 = 0;
		for (int var15 = 1; var15 < 2048; var15++) {
			this.field1256[var15].field677 = (byte) (this.field1256[var15].field677 >> 1);
			if (this.field1256[var15].method1828()) {
				this.field1244[++this.field1255 - 1] = var15;
			} else {
				this.field1250[++this.field1253 - 1] = var15;
			}
		}
	}

	@ObfuscatedName("dh.ac(Lwf;B)I")
	public int method2785(class590 arg0) {
		int var2 = arg0.method10290(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = arg0.method10290(5);
		} else if (var2 == 2) {
			var3 = arg0.method10290(8);
		} else {
			var3 = arg0.method10290(11);
		}
		return var3;
	}

	@ObfuscatedName("dh.ap(Lwf;IB)V")
	public void method2771(class590 arg0, int arg1) {
		boolean var3 = arg0.method10290(1) == 1;
		if (var3) {
			this.field1242[++this.field1252 - 1] = arg1;
		}
		int var4 = arg0.method10290(2);
		class48 var5 = this.field1256[arg1];
		if (var4 == 0) {
			if (var3) {
				this.field1246[arg1] = false;
			} else if (client.field492 == arg1) {
				throw new RuntimeException();
			} else {
				var5.method1754();
				if (arg0.method10290(1) != 0) {
					this.method2772(arg0, arg1);
				}
				this.field1251[++this.field1249 - 1] = arg1;
			}
		} else if (var4 == 1) {
			int var6 = arg0.method10290(3);
			class357 var7 = var5.field676;
			if (var6 == 0) {
				var7.field4027--;
				var7.field4026--;
			} else if (var6 == 1) {
				var7.field4026--;
			} else if (var6 == 2) {
				var7.field4027++;
				var7.field4026--;
			} else if (var6 == 3) {
				var7.field4027--;
			} else if (var6 == 4) {
				var7.field4027++;
			} else if (var6 == 5) {
				var7.field4027--;
				var7.field4026++;
			} else if (var6 == 6) {
				var7.field4026++;
			} else if (var6 == 7) {
				var7.field4027++;
				var7.field4026++;
			}
			this.field1246[arg1] = true;
			this.field1247[arg1] = var5.field678;
		} else if (var4 == 2) {
			int var8 = arg0.method10290(4);
			class357 var9 = var5.field676;
			if (var8 == 0) {
				var9.field4027 -= 2;
				var9.field4026 -= 2;
			} else if (var8 == 1) {
				var9.field4027--;
				var9.field4026 -= 2;
			} else if (var8 == 2) {
				var9.field4026 -= 2;
			} else if (var8 == 3) {
				var9.field4027++;
				var9.field4026 -= 2;
			} else if (var8 == 4) {
				var9.field4027 += 2;
				var9.field4026 -= 2;
			} else if (var8 == 5) {
				var9.field4027 -= 2;
				var9.field4026--;
			} else if (var8 == 6) {
				var9.field4027 += 2;
				var9.field4026--;
			} else if (var8 == 7) {
				var9.field4027 -= 2;
			} else if (var8 == 8) {
				var9.field4027 += 2;
			} else if (var8 == 9) {
				var9.field4027 -= 2;
				var9.field4026++;
			} else if (var8 == 10) {
				var9.field4027 += 2;
				var9.field4026++;
			} else if (var8 == 11) {
				var9.field4027 -= 2;
				var9.field4026 += 2;
			} else if (var8 == 12) {
				var9.field4027--;
				var9.field4026 += 2;
			} else if (var8 == 13) {
				var9.field4026 += 2;
			} else if (var8 == 14) {
				var9.field4027++;
				var9.field4026 += 2;
			} else if (var8 == 15) {
				var9.field4027 += 2;
				var9.field4026 += 2;
			}
			this.field1246[arg1] = true;
			this.field1247[arg1] = var5.field678;
		} else {
			int var10 = arg0.method10290(1);
			if (var10 == 0) {
				int var11 = arg0.method10290(12);
				int var12 = var11 >> 10;
				int var13 = var11 >> 5 & 0x1F;
				if (var13 > 15) {
					var13 -= 32;
				}
				int var14 = var11 & 0x1F;
				if (var14 > 15) {
					var14 -= 32;
				}
				class357 var15 = var5.field676;
				var15.field4028 = (byte) (var15.field4028 + var12 & 0x3);
				var15.field4027 += var13;
				var15.field4026 += var14;
				this.field1246[arg1] = true;
				this.field1247[arg1] = var5.field678;
			} else {
				int var16 = arg0.method10290(30);
				int var17 = class357.method6803(var16);
				int var18 = Statics.method6814(var16);
				int var19 = class357.method6805(var16);
				class357 var20 = var5.field676;
				var20.field4028 = (byte) (var20.field4028 + var17 & 0x3);
				var20.field4027 = var20.field4027 + var18 & 0x3FFF;
				var20.field4026 = var20.field4026 + var19 & 0x3FFF;
				this.field1246[arg1] = true;
				this.field1247[arg1] = var5.field678;
			}
		}
	}

	@ObfuscatedName("dh.aq(Lwf;II)Z")
	public boolean method2772(class590 arg0, int arg1) {
		class48 var3 = this.field1256[arg1];
		int var4 = arg0.method10290(2);
		if (var4 == 0) {
			if (arg0.method10290(1) != 0) {
				this.method2772(arg0, arg1);
			}
			int var5 = arg0.method10290(13);
			int var6 = arg0.method10290(13);
			boolean var7 = arg0.method10290(1) == 1;
			if (var7) {
				this.field1242[++this.field1252 - 1] = arg1;
			}
			if (var3.method1828()) {
				throw new RuntimeException();
			}
			var3.method1755(var5, var6);
			this.field1246[arg1] = false;
			return true;
		} else if (var4 == 1) {
			int var8 = arg0.method10290(2);
			int var9 = var3.field675;
			int var10 = class357.method6803(var9) + var8 & 0x3;
			var3.method1790(var10);
			var3.field675 = (var10 << 28) + (var9 & 0xFFFFFFF);
			return false;
		} else if (var4 == 2) {
			int var11 = arg0.method10290(5);
			int var12 = var11 >> 3;
			int var13 = var11 & 0x7;
			int var14 = var3.field675;
			int var15 = class357.method6803(var14) + var12 & 0x3;
			int var16 = var14 >> 14 & 0xFF;
			int var17 = var14 & 0xFF;
			if (var13 == 0) {
				var16--;
				var17--;
			}
			if (var13 == 1) {
				var17--;
			}
			if (var13 == 2) {
				var16++;
				var17--;
			}
			if (var13 == 3) {
				var16--;
			}
			if (var13 == 4) {
				var16++;
			}
			if (var13 == 5) {
				var16--;
				var17++;
			}
			if (var13 == 6) {
				var17++;
			}
			if (var13 == 7) {
				var16++;
				var17++;
			}
			var3.method1790(var15);
			var3.field675 = class357.method6851(var15, var16, var17);
			return false;
		} else {
			int var18 = arg0.method10290(18);
			int var19 = var18 >> 16;
			int var20 = var18 >> 8 & 0xFF;
			int var21 = var18 & 0xFF;
			int var22 = var3.field675;
			int var23 = class357.method6803(var22) + var19 & 0x3;
			var3.method1790(var23);
			int var24 = Statics.method6814(var22) + var20 & 0xFF;
			int var25 = class357.method6805(var22) + var21 & 0xFF;
			var3.field675 = class357.method6851(var3.method1756(), var24, var25);
			return false;
		}
	}

	@ObfuscatedName("dh.ao(I)V")
	public void method2773() {
		for (int var1 = 0; var1 < this.field1249; var1++) {
			int var2 = this.field1251[var1];
			class48 var3 = this.field1256[var2];
			Iterator var4 = client.field334.iterator();
			while (var4.hasNext()) {
				class80 var5 = (class80) var4.next();
				class70 var6 = (class70) var5.field1170.method7917((long) var2);
				if (var6 != null) {
					var3.method1750(var6);
					var6.method9757();
				}
			}
			var3.method1776();
		}
	}

	@ObfuscatedName("dh.as(B)V")
	public void method2774() {
		client.field347 = -1;
		label56: for (int var1 = 0; var1 < this.field1255; var1++) {
			int var2 = this.field1244[var1];
			class48 var3 = this.field1256[var2];
			class357 var4 = var3.field676;
			Iterator var5 = client.field334.iterator();
			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label56;
					}
					class80 var6 = (class80) var5.next();
					class70 var7 = (class70) var6.field1170.method7917((long) var2);
					boolean var8 = var4.field4027 > var6.field1165 && var4.field4026 > var6.field1166 && var4.field4027 < var6.field1165 + var6.field1163 && var4.field4026 < var6.field1166 + var6.field1164;
					if (client.field492 == var2 && var8 && var6.field1173 != -1) {
						client.field347 = var6.field1173;
					}
					if (var8 && var7 == null) {
						class70 var9 = var3.method1752(var2, var6);
						var3.method1749(var9);
						var6.field1170.method7908(var9, (long) var2);
					} else if (!var8 && var7 != null && Statics.field1109 != var7) {
						var3.method1750(var7);
						var7.method9757();
					}
				}
			}
		}
	}

	@ObfuscatedName("dh.al(Lwf;I)V")
	public void method2775(class590 arg0) {
		for (int var2 = 0; var2 < this.field1252; var2++) {
			int var3 = this.field1242[var2];
			int var4 = arg0.method10339();
			if ((var4 & 0x2) != 0) {
				var4 += arg0.method10339() << 8;
			}
			if ((var4 & 0x4000) != 0) {
				var4 += arg0.method10339() << 16;
			}
			this.method2790(arg0, var3, var4);
		}
	}

	@ObfuscatedName("dh.au(B)V")
	public void method2776() {
		for (int var1 = 0; var1 < this.field1255; var1++) {
			int var2 = this.field1244[var1];
			if (this.field1246[var2]) {
				class48 var3 = this.field1256[var2];
				var3.method1788(this.field1247[var2]);
				this.field1246[var2] = false;
			}
		}
	}

	@ObfuscatedName("dh.ai(Lwf;III)V")
	public void method2790(class590 arg0, int arg1, int arg2) {
		class48 var4 = this.field1256[arg1];
		int var5 = Integer.MAX_VALUE;
		if ((arg2 & 0x1) != 0) {
			int var6 = arg0.method10324();
			if (var6 == 65535) {
				var6 = -1;
			}
			int var7 = arg0.method10375();
			var4.method1800(var6, var7);
		}
		if ((arg2 & 0x800) != 0) {
			int var8 = arg0.method10384();
			int var9 = var8 >> 8;
			int var10 = var9 >= 13 && var9 <= 20 ? var9 - 12 : 0;
			class398 var11 = (class398) class432.method3817(class398.method8270(), arg0.method10339());
			boolean var12 = arg0.method10422() == 1;
			int var13 = arg0.method10375();
			this.field1245.field5920 = 0;
			arg0.method10398(this.field1245.field5917, 0, var13);
			this.field1245.field5920 = 0;
			String var14 = class466.method8836(class446.method7517(class377.method2112(this.field1245)));
			byte[] var15 = null;
			if (var10 > 0 && var10 <= 8) {
				var15 = new byte[var10];
				for (int var16 = 0; var16 < var10; var16++) {
					var15[var16] = arg0.method10400();
				}
			}
			var4.method1767(var8, var11, var12, var14, var15);
		}
		if ((arg2 & 0x20) != 0) {
			int var17 = arg0.method10384();
			int var18 = var17 + (arg0.method10422() << 16);
			int var19 = 16777215;
			if (var18 == var19) {
				var18 = -1;
			}
			var4.method1761(var18);
		}
		if ((arg2 & 0x100) != 0) {
			int var20 = client.field413 + arg0.method10384();
			int var21 = client.field413 + arg0.method10341();
			byte var22 = arg0.method10376();
			byte var23 = arg0.method10378();
			byte var24 = arg0.method10400();
			byte var25 = (byte) arg0.method10339();
			var4.method1770(var20, var21, var22, var23, var24, var25);
		}
		if ((arg2 & 0x40) != 0) {
			int var26 = arg0.method10339();
			byte[] var27 = new byte[var26];
			class591 var28 = new class591(var27);
			arg0.method10407(var27, 0, var26);
			var4.method1833(var28);
		}
		if ((arg2 & 0x10000) != 0) {
			int var29 = arg0.method10339();
			for (int var30 = 0; var30 < var29; var30++) {
				int var31 = arg0.method10373();
				int var32 = arg0.method10324();
				int var33 = arg0.method10397();
				var4.method1748(var31, var32, var33 >> 16, var33 & 0xFFFF);
			}
		}
		if ((arg2 & 0x1000) != 0) {
			for (int var34 = 0; var34 < 3; var34++) {
				this.field1254[var34] = arg0.method10350();
			}
			var4.method1769(this.field1254);
		}
		if ((arg2 & 0x4) != 0) {
			int var35 = arg0.method10422();
			if (var35 > 0) {
				for (int var36 = 0; var36 < var35; var36++) {
					int var37 = -1;
					int var38 = -1;
					int var39 = -1;
					int var40 = arg0.method10355();
					if (var40 == 32767) {
						var40 = arg0.method10355();
						var38 = arg0.method10355();
						var37 = arg0.method10355();
						var39 = arg0.method10355();
					} else if (var40 == 32766) {
						var40 = -1;
					} else {
						var38 = arg0.method10355();
					}
					int var41 = arg0.method10355();
					var4.method1817(var40, var38, var37, var39, var41);
				}
			}
			int var42 = arg0.method10375();
			if (var42 > 0) {
				for (int var43 = 0; var43 < var42; var43++) {
					int var44 = arg0.method10355();
					int var45 = arg0.method10355();
					if (var45 == 32767) {
						var4.method1765(var44);
					} else {
						int var46 = arg0.method10355();
						int var47 = arg0.method10422();
						int var48 = var45 > 0 ? arg0.method10422() : var47;
						var4.method1760(var44, var45, var46, var47, var48);
					}
				}
			}
		}
		if ((arg2 & 0x80) != 0) {
			arg0.method10384();
			arg0.method10375();
			arg0.method10422();
			int var49 = arg0.method10339();
			this.field1245.field5920 = 0;
			arg0.method10398(this.field1245.field5917, 0, var49);
			this.field1245.field5920 = 0;
		}
		if ((arg2 & 0x400) != 0) {
			var4.field678 = (class281) class432.method3817(class281.method3769(), arg0.method10378());
			if (var5 == Integer.MAX_VALUE) {
				this.field1247[arg1] = var4.field678;
			}
		}
		if ((arg2 & 0x8) != 0) {
			String var50 = arg0.method10350();
			var4.method1762(var50);
		}
		if ((arg2 & 0x2000) != 0) {
			byte var51 = arg0.method10340();
			if (var51 == 127) {
				this.field1247[arg1] = class281.field3280;
			} else {
				this.field1247[arg1] = (class281) class432.method3817(class281.method3769(), var51);
			}
		}
		if ((arg2 & 0x10) != 0) {
			int var52 = arg0.method10324();
			var4.method1766(var52);
		}
		if ((arg2 & 0x200) == 0) {
			return;
		}
		byte var53 = arg0.method10376();
		byte var54 = arg0.method10378();
		byte var55 = arg0.method10378();
		byte var56 = arg0.method10376();
		int var57 = arg0.method10324() + client.field413;
		int var58 = arg0.method10341() + client.field413;
		int var59 = arg0.method10563();
		var4.method1768(var53, var54, var55, var56, var57, var58, var59);
		this.field1246[arg1] = false;
	}

	@ObfuscatedName("dh.aa(Lcv;I)V")
	public void method2783(class70 arg0) {
		if (arg0 != null) {
			this.field1256[arg0.field1104].method1750(arg0);
		}
	}

	@ObfuscatedName("dh.am(I)V")
	public void method2779() {
		this.field1255 = 0;
		for (int var1 = 0; var1 < 2048; var1++) {
			this.field1256[var1].method1747();
		}
	}
}
