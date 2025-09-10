package deob;

import java.net.URL;

@ObfuscatedName("bp")
public class class45 {

	@ObfuscatedName("bp.aq")
	public static int field627 = 0;

	@ObfuscatedName("bp.ao")
	public static int field628 = 0;

	@ObfuscatedName("bp.as")
	public static int[] field637 = new int[] { 1, 1, 1, 1 };

	@ObfuscatedName("bp.al")
	public static int[] field630 = new int[] { 0, 1, 2, 3 };

	@ObfuscatedName("bp.ai")
	public int field641;

	@ObfuscatedName("bp.aa")
	public int field633;

	@ObfuscatedName("bp.am")
	public int field629;

	@ObfuscatedName("bp.an")
	public String field635;

	@ObfuscatedName("bp.ar")
	public String field623;

	@ObfuscatedName("bp.ae")
	public int field636;

	@ObfuscatedName("bp.ay")
	public int field638;

	@ObfuscatedName("bp.ad")
	public String field639;

	@ObfuscatedName("cq.af(B)Z")
	public static boolean method2106() {
		try {
			if (Statics.field631 == null) {
				Statics.field631 = Statics.field1508.method3354(new URL(Statics.field3180));
			} else if (Statics.field631.method3382()) {
				byte[] var0 = Statics.field631.method3383();
				class591 var1 = new class591(var0);
				var1.method10345();
				field627 = var1.method10341();
				Statics.field625 = new class45[field627];
				int var2 = 0;
				while (var2 < field627) {
					class45 var3 = Statics.field625[var2] = new class45();
					var3.field641 = var1.method10341();
					var3.field633 = var1.method10345();
					var3.field635 = var1.method10350();
					var3.field623 = var1.method10350();
					var3.field636 = var1.method10339();
					var3.field629 = var1.method10593();
					var3.field638 = var2++;
				}
				method8745(Statics.field625, 0, Statics.field625.length - 1, field630, field637);
				Statics.field631 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			Statics.field631 = null;
		}
		return false;
	}

	@ObfuscatedName("im.aw(III)V")
	public static void method4239(int arg0, int arg1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = arg0;
		var3[0] = arg1;
		int var4 = 1;
		for (int var5 = 0; var5 < 4; var5++) {
			if (field630[var5] != arg0) {
				var2[var4] = field630[var5];
				var3[var4] = field637[var5];
				var4++;
			}
		}
		field630 = var2;
		field637 = var3;
		method8745(Statics.field625, 0, Statics.field625.length - 1, field630, field637);
	}

	@ObfuscatedName("rx.at([Lbp;II[I[II)V")
	public static void method8745(class45[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		if (arg1 >= arg2) {
			return;
		}
		int var5 = arg1 - 1;
		int var6 = arg2 + 1;
		int var7 = (arg1 + arg2) / 2;
		class45 var8 = arg0[var7];
		arg0[var7] = arg0[arg1];
		arg0[arg1] = var8;
		while (var5 < var6) {
			boolean var9 = true;
			do {
				var6--;
				for (int var10 = 0; var10 < 4; var10++) {
					int var11;
					int var12;
					if (arg3[var10] == 2) {
						var11 = arg0[var6].field638;
						var12 = var8.field638;
					} else if (arg3[var10] == 1) {
						var11 = arg0[var6].field629;
						var12 = var8.field629;
						if (var11 == -1 && arg4[var10] == 1) {
							var11 = 2001;
						}
						if (var12 == -1 && arg4[var10] == 1) {
							var12 = 2001;
						}
					} else if (arg3[var10] == 3) {
						var11 = arg0[var6].method1461() ? 1 : 0;
						var12 = var8.method1461() ? 1 : 0;
					} else {
						var11 = arg0[var6].field641;
						var12 = var8.field641;
					}
					if (var11 != var12) {
						if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
							var9 = false;
						}
						break;
					}
					if (var10 == 3) {
						var9 = false;
					}
				}
			} while (var9);
			boolean var13 = true;
			do {
				var5++;
				for (int var14 = 0; var14 < 4; var14++) {
					int var15;
					int var16;
					if (arg3[var14] == 2) {
						var15 = arg0[var5].field638;
						var16 = var8.field638;
					} else if (arg3[var14] == 1) {
						var15 = arg0[var5].field629;
						var16 = var8.field629;
						if (var15 == -1 && arg4[var14] == 1) {
							var15 = 2001;
						}
						if (var16 == -1 && arg4[var14] == 1) {
							var16 = 2001;
						}
					} else if (arg3[var14] == 3) {
						var15 = arg0[var5].method1461() ? 1 : 0;
						var16 = var8.method1461() ? 1 : 0;
					} else {
						var15 = arg0[var5].field641;
						var16 = var8.field641;
					}
					if (var15 != var16) {
						if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
							var13 = false;
						}
						break;
					}
					if (var14 == 3) {
						var13 = false;
					}
				}
			} while (var13);
			if (var5 < var6) {
				class45 var17 = arg0[var5];
				arg0[var5] = arg0[var6];
				arg0[var6] = var17;
			}
		}
		method8745(arg0, arg1, var6, arg3, arg4);
		method8745(arg0, var6 + 1, arg2, arg3, arg4);
	}

	@ObfuscatedName("go.ac(IZIZB)V")
	public static void method3812(int arg0, boolean arg1, int arg2, boolean arg3) {
		if (Statics.field625 != null) {
			method212(0, Statics.field625.length - 1, arg0, arg1, arg2, arg3);
		}
	}

	@ObfuscatedName("ay.ap(IIIZIZB)V")
	public static void method212(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
		if (arg0 >= arg1) {
			return;
		}
		int var6 = (arg0 + arg1) / 2;
		int var7 = arg0;
		class45 var8 = Statics.field625[var6];
		Statics.field625[var6] = Statics.field625[arg1];
		Statics.field625[arg1] = var8;
		for (int var9 = arg0; var9 < arg1; var9++) {
			class45 var10 = Statics.field625[var9];
			int var11 = method3586(var10, var8, arg2, arg3);
			int var12;
			if (var11 == 0) {
				if (arg4 == -1) {
					var12 = 0;
				} else {
					int var13 = method3586(var10, var8, arg4, arg5);
					if (arg5) {
						var12 = -var13;
					} else {
						var12 = var13;
					}
				}
			} else if (arg3) {
				var12 = -var11;
			} else {
				var12 = var11;
			}
			if (var12 <= 0) {
				class45 var14 = Statics.field625[var9];
				Statics.field625[var9] = Statics.field625[var7];
				Statics.field625[var7++] = var14;
			}
		}
		Statics.field625[arg1] = Statics.field625[var7];
		Statics.field625[var7] = var8;
		method212(arg0, var7 - 1, arg2, arg3, arg4, arg5);
		method212(var7 + 1, arg1, arg2, arg3, arg4, arg5);
	}

	@ObfuscatedName("fc.aq(Lbp;Lbp;IZI)I")
	public static int method3586(class45 arg0, class45 arg1, int arg2, boolean arg3) {
		if (arg2 == 1) {
			int var4 = arg0.field629;
			int var5 = arg1.field629;
			if (!arg3) {
				if (var4 == -1) {
					var4 = 2001;
				}
				if (var5 == -1) {
					var5 = 2001;
				}
			}
			return var4 - var5;
		} else if (arg2 == 2) {
			return arg0.field636 - arg1.field636;
		} else if (arg2 == 3) {
			if (arg0.field623.equals("-")) {
				if (arg1.field623.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.field623.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return arg0.field623.compareTo(arg1.field623);
			}
		} else if (arg2 == 4) {
			return arg0.method1464() ? (arg1.method1464() ? 0 : 1) : (arg1.method1464() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method1448() ? (arg1.method1448() ? 0 : 1) : (arg1.method1448() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method1443() ? (arg1.method1443() ? 0 : 1) : (arg1.method1443() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method1461() ? (arg1.method1461() ? 0 : 1) : (arg1.method1461() ? -1 : 0);
		} else {
			return arg0.field641 - arg1.field641;
		}
	}

	@ObfuscatedName("tv.ao(I)Lbp;")
	public static class45 method9536() {
		field628 = 0;
		return method410();
	}

	@ObfuscatedName("bs.as(I)Lbp;")
	public static class45 method410() {
		return field628 < field627 ? Statics.field625[++field628 - 1] : null;
	}

	@ObfuscatedName("bp.al(I)Z")
	public boolean method1461() {
		return (class583.field5863.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.au(B)Z")
	public boolean method1441() {
		return (class583.field5866.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.ai(I)Z")
	public boolean method1448() {
		return (class583.field5880.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.aa(I)Z")
	public boolean method1443() {
		return (class583.field5852.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.am(I)Z")
	public boolean method1464() {
		return (class583.field5867.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.an(I)Z")
	public boolean method1445() {
		return (class583.field5882.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.ar(I)Z")
	public boolean method1446() {
		return (class583.field5864.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.ae(I)Z")
	public boolean method1447() {
		return (class583.field5879.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.ay(I)Z")
	public boolean method1468() {
		return (class583.field5857.method34() & this.field633) != 0;
	}

	@ObfuscatedName("bp.ad(I)Z")
	public boolean method1449() {
		return (class583.field5877.method34() & this.field633) != 0;
	}
}
