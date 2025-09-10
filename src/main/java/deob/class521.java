package deob;

import java.util.Arrays;

@ObfuscatedName("uy")
public class class521 {

	@ObfuscatedName("uy.af")
	public static final int[] field5510 = new int[5000];

	public class521() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ox.af(Lti;Lti;I)I")
	public static int method7555(class520 arg0, class520 arg1) {
		if (arg0 == arg1) {
			return 0;
		} else if (arg0 == null) {
			return -1;
		} else if (arg1 == null) {
			return 1;
		} else {
			int var2 = arg0.method9545();
			int var3 = arg1.method9545();
			int var4 = Math.min(var2, var3);
			if (class575.field5821 == arg0.field5505 && class575.field5821 == arg1.field5505) {
				int[] var5 = arg0.method9541();
				int[] var6 = arg1.method9541();
				for (int var7 = 0; var7 < var4; var7++) {
					if (var5[var7] < var6[var7]) {
						return -1;
					}
					if (var5[var7] > var6[var7]) {
						return 1;
					}
				}
			} else if (class575.field5817 == arg0.field5505 && class575.field5817 == arg1.field5505) {
				long[] var8 = arg0.method9543();
				long[] var9 = arg1.method9543();
				for (int var10 = 0; var10 < var4; var10++) {
					if (var8[var10] < var9[var10]) {
						return -1;
					}
					if (var8[var10] > var9[var10]) {
						return 1;
					}
				}
			} else if (class575.field5825 == arg0.field5505 && class575.field5825 == arg1.field5505) {
				Object[] var11 = arg0.method9544();
				Object[] var12 = arg1.method9544();
				for (int var13 = 0; var13 < var4; var13++) {
					int var14 = ((String) var11[var13]).compareTo((String) var12[var13]);
					if (var14 < 0) {
						return -1;
					}
					if (var14 > 0) {
						return 1;
					}
				}
			} else {
				throw new RuntimeException();
			}
			return var2 < var3 ? -1 : var2 == var3 ? 0 : 1;
		}
	}

	@ObfuscatedName("bq.at(Lti;Ljava/lang/Object;III)I")
	public static int method736(class520 arg0, Object arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg3 < 0 || arg3 > arg0.method9545()) {
			arg3 = arg0.method9545();
		}
		if (class575.field5821 == arg0.field5505) {
			int[] var4 = arg0.method9541();
			int var5 = (Integer) arg1;
			for (int var6 = arg3 - 1; var6 >= arg2; var6--) {
				if (var4[var6] == var5) {
					return var6;
				}
			}
		} else if (class575.field5817 == arg0.field5505) {
			long[] var7 = arg0.method9543();
			long var8 = (Long) arg1;
			for (int var10 = arg3 - 1; var10 >= arg2; var10--) {
				if (var7[var10] == var8) {
					return var10;
				}
			}
		} else {
			Object[] var11 = arg0.method9544();
			for (int var12 = arg3 - 1; var12 >= arg2; var12--) {
				if (var11[var12] == arg1 || var11[var12] != null && var11[var12].equals(arg1)) {
					return var12;
				}
			}
		}
		return -1;
	}

	@ObfuscatedName("vf.ap(Lti;B)I")
	public static int method10025(class520 arg0) {
		method4525(arg0, null, false);
		byte var1 = 0;
		int var2 = arg0.method9545();
		int var3 = -1;
		if (class575.field5821 == arg0.field5505) {
			int[] var4 = arg0.method9541();
			for (int var5 = var1; var5 < var2; var5++) {
				if (var3 == -1 || var4[var5] < var4[var3]) {
					var3 = var5;
				}
			}
		} else if (class575.field5817 == arg0.field5505) {
			long[] var6 = arg0.method9543();
			for (int var7 = var1; var7 < var2; var7++) {
				if (var3 == -1 || var6[var7] < var6[var3]) {
					var3 = var7;
				}
			}
		} else if (class575.field5825 == arg0.field5505) {
			String var8 = null;
			Object[] var9 = arg0.method9544();
			for (int var10 = var1; var10 < var2; var10++) {
				String var11 = (String) var9[var10];
				if (var3 == -1 || var11 != null && var11.compareTo(var8) < 0) {
					var3 = var10;
					var8 = var11;
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("gz.aq(Lti;I)I")
	public static int method3681(class520 arg0) {
		method4525(arg0, null, false);
		byte var1 = 0;
		int var2 = arg0.method9545();
		int var3 = -1;
		if (class575.field5821 == arg0.field5505) {
			int[] var4 = arg0.method9541();
			for (int var5 = var1; var5 < var2; var5++) {
				if (var3 == -1 || var4[var5] > var4[var3]) {
					var3 = var5;
				}
			}
		} else if (class575.field5817 == arg0.field5505) {
			long[] var6 = arg0.method9543();
			for (int var7 = var1; var7 < var2; var7++) {
				if (var3 == -1 || var6[var7] > var6[var3]) {
					var3 = var7;
				}
			}
		} else if (class575.field5825 == arg0.field5505) {
			String var8 = null;
			Object[] var9 = arg0.method9544();
			for (int var10 = var1; var10 < var2; var10++) {
				String var11 = (String) var9[var10];
				if (var3 == -1 || var11 != null && var11.compareTo(var8) > 0) {
					var3 = var10;
					var8 = var11;
				}
			}
		}
		return var3;
	}

	@ObfuscatedName("nw.ao(Lti;Ljava/lang/Object;IIB)V")
	public static void method6799(class520 arg0, Object arg1, int arg2, int arg3) {
		method7522(arg0);
		if (arg2 < 0) {
			arg2 = 0;
		}
		int var4 = arg2 + arg3;
		if (arg3 < 0 || var4 < 0 || var4 > arg0.method9545()) {
			var4 = arg0.method9545();
		}
		if (class575.field5821 == arg0.field5505) {
			Arrays.fill(arg0.method9541(), arg2, var4, (Integer) arg1);
		} else if (class575.field5817 == arg0.field5505) {
			Arrays.fill(arg0.method9543(), arg2, var4, (Long) arg1);
		} else {
			Arrays.fill(arg0.method9544(), arg2, var4, arg1);
		}
	}

	@ObfuscatedName("ko.as(Lti;IIIIB)V")
	public static void method5876(class520 arg0, int arg1, int arg2, int arg3, int arg4) {
		class575 var5 = class575.field5821;
		method4525(arg0, var5, true);
		if (arg3 < 0) {
			arg3 = 0;
		}
		int var6 = arg3 + arg4;
		if (arg4 < 0 || var6 < 0 || var6 > arg0.method9545()) {
			var6 = arg0.method9545();
		}
		int[] var7 = arg0.method9541();
		int var8 = arg1;
		for (int var9 = arg3; var9 < var6; var9++) {
			var7[var9] = var8;
			var8 += arg2;
		}
	}

	@ObfuscatedName("hs.al(Lti;I)V")
	public static void method3953(class520 arg0) {
		method7522(arg0);
		int var1 = arg0.method9545();
		if (var1 <= 1) {
			return;
		}
		if (class575.field5821 == arg0.field5505) {
			method8390(arg0.method9541(), 0, var1 - 1);
		} else if (class575.field5817 == arg0.field5505) {
			method8747(arg0.method9543(), 0, var1 - 1);
		} else {
			method3655(arg0.method9544(), 0, var1 - 1);
		}
	}

	@ObfuscatedName("kj.au(Lti;IB)V")
	public static void method5683(class520 arg0, int arg1) {
		method7522(arg0);
		int var2 = arg0.method9545();
		if (var2 <= 1) {
			return;
		}
		int var3 = arg1 % var2;
		if (var3 == 0) {
			return;
		}
		if (var3 < 0) {
			var3 += var2;
		}
		if (class575.field5821 == arg0.field5505) {
			int[] var4 = arg0.method9541();
			method8390(var4, 0, var2 - 1);
			method8390(var4, 0, var3 - 1);
			method8390(var4, var3, var2 - 1);
		} else if (class575.field5817 == arg0.field5505) {
			long[] var5 = arg0.method9543();
			method8747(var5, 0, var2 - 1);
			method8747(var5, 0, var3 - 1);
			method8747(var5, var3, var2 - 1);
		} else {
			Object[] var6 = arg0.method9544();
			method3655(var6, 0, var2 - 1);
			method3655(var6, 0, var3 - 1);
			method3655(var6, var3, var2 - 1);
		}
	}

	@ObfuscatedName("ba.ai(Lti;IIB)V")
	public static void method473(class520 arg0, int arg1, int arg2) {
		method7522(arg0);
		if (arg1 < 0 || arg2 < 0 || arg1 >= arg0.method9545() || arg2 >= arg0.method9545()) {
			throw new RuntimeException();
		} else if (arg1 != arg2) {
			if (class575.field5821 == arg0.field5505) {
				int[] var3 = arg0.method9541();
				int var4 = var3[arg1];
				var3[arg1] = var3[arg2];
				var3[arg2] = var4;
			} else if (class575.field5817 == arg0.field5505) {
				long[] var5 = arg0.method9543();
				long var6 = var5[arg1];
				var5[arg1] = var5[arg2];
				var5[arg2] = var6;
			} else {
				Object[] var8 = arg0.method9544();
				Object var9 = var8[arg1];
				var8[arg1] = var8[arg2];
				var8[arg2] = var9;
			}
		}
	}

	@ObfuscatedName("rt.aa(Lti;Lti;IIII)V")
	public static void method8273(class520 arg0, class520 arg1, int arg2, int arg3, int arg4) {
		method4525(arg0, null, false);
		class575 var5 = arg0.field5505;
		method4525(arg1, var5, true);
		int var6 = arg0.method9545();
		int var7 = arg1.method9545();
		if (arg4 == -1) {
			arg4 = arg0.method9545() - arg2;
		}
		if (arg4 == 0 || arg0 == arg1 && arg2 == arg3) {
			return;
		}
		if (arg2 < 0 || arg2 + arg4 > var6 || arg3 < 0 || arg3 + arg4 > var7) {
			throw new RuntimeException();
		}
		Statics.method2712(arg0, arg2, arg1, arg3, arg4);
	}

	@ObfuscatedName("ej.am(Lti;Lti;I)V")
	public static void method3400(class520 arg0, class520 arg1) {
		if (arg0 == null || arg0.method9545() <= 1) {
			return;
		}
		method7522(arg0);
		if (arg1 != null) {
			method7522(arg1);
		}
		int var2 = arg0.method9545();
		if (arg1 != null && arg1.method9545() < var2) {
			throw new RuntimeException();
		} else if (class575.field5821 == arg0.field5505) {
			if (arg1 == null) {
				class582.method5404(arg0.method9541(), field5510, 0, var2 - 1);
			} else if (class575.field5821 == arg1.field5505) {
				class582.method5404(arg0.method9541(), arg1.method9541(), 0, var2 - 1);
			} else if (class575.field5817 == arg1.field5505) {
				class582.method4099(arg0.method9541(), arg1.method9543(), 0, var2 - 1);
			} else {
				class582.method7286(arg0.method9541(), arg1.method9544(), 0, var2 - 1);
			}
		} else if (class575.field5817 != arg0.field5505) {
			if (class575.field5825 != arg0.field5505) {
				throw new RuntimeException();
			}
			if (arg1 == null) {
				Arrays.sort(arg0.method9544(), 0, var2);
			} else if (class575.field5821 == arg1.field5505) {
				class582.method10135((String[]) arg0.method9544(), arg1.method9541(), 0, var2 - 1);
			} else if (class575.field5817 == arg1.field5505) {
				Statics.method5684((String[]) arg0.method9544(), arg1.method9543(), 0, var2 - 1);
			} else {
				class582.method3772((String[]) arg0.method9544(), arg1.method9544(), 0, var2 - 1);
			}
		} else if (arg1 == null) {
			Arrays.sort(arg0.method9543(), 0, var2);
		} else if (class575.field5821 == arg1.field5505) {
			class582.method9737(arg0.method9543(), arg1.method9541(), 0, var2 - 1);
		} else if (class575.field5817 == arg1.field5505) {
			class582.method7859(arg0.method9543(), arg1.method9543(), 0, var2 - 1);
		} else {
			class582.method1504(arg0.method9543(), arg1.method9544(), 0, var2 - 1);
		}
	}

	@ObfuscatedName("gn.ar(Lti;I)J")
	public static long method3683(class520 arg0) {
		method6481(arg0, class575.field5821);
		int[] var1 = arg0.method9541();
		int var2 = arg0.method9545();
		long var3 = 0L;
		for (int var5 = 0; var5 < var2; var5++) {
			var3 += var1[var5];
		}
		return var3;
	}

	@ObfuscatedName("dx.ae(Lti;IB)I")
	public static int method3030(class520 arg0, int arg1) {
		method6481(arg0, class575.field5821);
		if (arg1 >= 0) {
			int[] var2 = arg0.method9541();
			int var3 = arg0.method9545();
			for (int var4 = 0; var4 < var3; var4++) {
				if (arg1 < var2[var4]) {
					return var4;
				}
				arg1 -= var2[var4];
			}
		}
		return -1;
	}

	@ObfuscatedName("co.ad(Lti;Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2357(class520 arg0, String arg1) {
		method6481(arg0, class575.field5825);
		int var2 = arg0.method9545();
		String[] var3 = (String[]) arg0.method9544();
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			return var3[0];
		} else {
			int var4 = arg1.length();
			int var5 = (var2 - 1) * var4;
			for (int var6 = 0; var6 < var2; var6++) {
				var5 += var3[var6].length();
			}
			char[] var7 = new char[var5];
			int var8 = 0;
			for (int var9 = 0; var9 < var2; var9++) {
				if (var9 > 0) {
					arg1.getChars(0, var4, var7, var8);
					var8 += var4;
				}
				var3[var9].getChars(0, var3[var9].length(), var7, var8);
				var8 += var3[var9].length();
			}
			return new String(var7);
		}
	}

	@ObfuscatedName("ai.av(Lti;IB)Ljava/lang/Object;")
	public static Object method92(class520 arg0, int arg1) {
		method7522(arg0);
		if (arg1 < 0 || arg1 >= arg0.field5503) {
			throw new RuntimeException();
		}
		Object var2 = arg0.method9546(arg1);
		if (arg1 < arg0.field5503 - 1) {
			Statics.method2712(arg0, arg1 + 1, arg0, arg1, arg0.field5503 - (arg1 + 1));
		}
		arg0.method9585(arg0.field5503 - 1);
		return var2;
	}

	@ObfuscatedName("lu.ah(Lti;Lti;IB)V")
	public static void method6332(class520 arg0, class520 arg1, int arg2) {
		method7522(arg0);
		method6481(arg1, arg0.field5505);
		if (arg2 < 0 || arg2 > arg0.field5503) {
			throw new RuntimeException();
		} else if (arg1.field5503 != 0) {
			arg0.method9578(arg0.field5503 + arg1.field5503);
			if (arg2 < arg0.field5503) {
				Statics.method2712(arg0, arg2, arg0, arg1.field5503 + arg2, arg0.field5503 - arg2);
			}
			Statics.method2712(arg1, 0, arg0, arg2, arg1.field5503);
			arg0.field5503 += arg1.field5503;
		}
	}

	@ObfuscatedName("hh.ab(Lti;III)V")
	public static void method4040(class520 arg0, int arg1, int arg2) {
		method7522(arg0);
		if (arg1 == 0) {
			return;
		}
		if (arg2 < 0 || arg2 >= arg0.field5503 || arg1 < 0 || arg1 + arg2 > arg0.field5503) {
			throw new RuntimeException();
		}
		if (arg2 < arg0.field5503 - arg1) {
			Statics.method2712(arg0, arg1 + arg2, arg0, arg2, arg0.field5503 - (arg1 + arg2));
		}
		arg0.method9585(arg0.field5503 - arg1);
	}

	@ObfuscatedName("iw.ax(Lti;Lwv;ZI)V")
	public static void method4525(class520 arg0, class575 arg1, boolean arg2) {
		if (arg0 == null) {
			throw new RuntimeException();
		} else if (arg1 != null && arg0.field5505 != arg1) {
			throw new RuntimeException();
		} else if (arg2 && !arg0.field5502) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ow.ak(Lti;I)V")
	public static void method7522(class520 arg0) {
		method4525(arg0, null, true);
	}

	@ObfuscatedName("me.aj(Lti;Lwv;I)V")
	public static void method6481(class520 arg0, class575 arg1) {
		method4525(arg0, arg1, false);
	}

	@ObfuscatedName("re.az([IIIS)V")
	public static void method8390(int[] arg0, int arg1, int arg2) {
		while (arg1 < arg2) {
			int var3 = arg0[arg1];
			arg0[arg1] = arg0[arg2];
			arg0[arg2] = var3;
			arg1++;
			arg2--;
		}
	}

	@ObfuscatedName("rx.bt([JIII)V")
	public static void method8747(long[] arg0, int arg1, int arg2) {
		while (arg1 < arg2) {
			long var3 = arg0[arg1];
			arg0[arg1] = arg0[arg2];
			arg0[arg2] = var3;
			arg1++;
			arg2--;
		}
	}

	@ObfuscatedName("fx.bs([Ljava/lang/Object;III)V")
	public static void method3655(Object[] arg0, int arg1, int arg2) {
		while (arg1 < arg2) {
			Object var3 = arg0[arg1];
			arg0[arg1] = arg0[arg2];
			arg0[arg2] = var3;
			arg1++;
			arg2--;
		}
	}
}
