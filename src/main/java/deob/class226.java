package deob;

@ObfuscatedName("ie")
public class class226 {

	@ObfuscatedName("ie.af")
	public static final class229 field2636;

	@ObfuscatedName("ie.aw")
	public static final class229 field2632;

	@ObfuscatedName("ie.at")
	public static int[] field2640 = new int[65536];

	@ObfuscatedName("ie.ac")
	public static int[] field2634 = new int[512];

	@ObfuscatedName("ie.ap")
	public static int[] field2635 = new int[2048];

	@ObfuscatedName("ie.aq")
	public static int[] field2638 = new int[2048];

	@ObfuscatedName("ie.ao")
	public static int[] field2637 = new int[2048];

	@ObfuscatedName("ie.as")
	public static float[] field2631 = new float[2048];

	@ObfuscatedName("ie.al")
	public static float[] field2639 = new float[2048];

	@ObfuscatedName("ie.au")
	public static class248 field2633;

	@ObfuscatedName("ie.aa")
	public static class229 field2642;

	static {
		for (int var0 = 1; var0 < 512; var0++) {
			field2634[var0] = 32768 / var0;
		}
		for (int var1 = 1; var1 < 2048; var1++) {
			field2635[var1] = 65536 / var1;
		}
		for (int var2 = 0; var2 < 2048; var2++) {
			double var3 = Math.sin((double) var2 * 0.0030679615D);
			double var5 = Math.cos((double) var2 * 0.0030679615D);
			field2638[var2] = (int) (var3 * 65536.0D);
			field2637[var2] = (int) (var5 * 65536.0D);
			field2631[var2] = (float) var3;
			field2639[var2] = (float) var5;
		}
		field2633 = new class248();
		field2636 = new class247(field2633);
		field2632 = new class249(field2633);
		field2642 = field2636;
	}

	public class226() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ie.af(Z)V")
	public static void method4626(boolean arg0) {
		if (arg0 && Statics.field5988 != null) {
			field2642 = field2632;
		} else {
			field2642 = field2636;
		}
	}

	@ObfuscatedName("ie.aw(Ljs;)V")
	public static void method4627(class252 arg0) {
		field2633.field3011 = arg0;
	}

	@ObfuscatedName("ie.at(D)V")
	public static void method4628(double arg0) {
		method4669(arg0, 0, 512);
	}

	@ObfuscatedName("ie.ac(DII)V")
	public static void method4669(double arg0, int arg1, int arg2) {
		int var4 = arg1 * 128;
		for (int var5 = arg1; var5 < arg2; var5++) {
			double var6 = (double) (var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double) (var5 & 0x7) / 8.0D + 0.0625D;
			for (int var10 = 0; var10 < 128; var10++) {
				double var11 = (double) var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = (var8 + 1.0D) * var11;
					} else {
						var19 = var8 + var11 - var8 * var11;
					}
					double var21 = var11 * 2.0D - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						var23--;
					}
					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						var27++;
					}
					if (var23 * 6.0D < 1.0D) {
						var13 = (var19 - var21) * 6.0D * var23 + var21;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var19;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = (var19 - var21) * (0.6666666666666666D - var23) * 6.0D + var21;
					} else {
						var13 = var21;
					}
					if (var6 * 6.0D < 1.0D) {
						var15 = (var19 - var21) * 6.0D * var6 + var21;
					} else if (var6 * 2.0D < 1.0D) {
						var15 = var19;
					} else if (var6 * 3.0D < 2.0D) {
						var15 = (var19 - var21) * (0.6666666666666666D - var6) * 6.0D + var21;
					} else {
						var15 = var21;
					}
					if (var27 * 6.0D < 1.0D) {
						var17 = (var19 - var21) * 6.0D * var27 + var21;
					} else if (var27 * 2.0D < 1.0D) {
						var17 = var19;
					} else if (var27 * 3.0D < 2.0D) {
						var17 = (var19 - var21) * (0.6666666666666666D - var27) * 6.0D + var21;
					} else {
						var17 = var21;
					}
				}
				int var29 = (int) (var13 * 256.0D);
				int var30 = (int) (var15 * 256.0D);
				int var31 = (int) (var17 * 256.0D);
				int var32 = (var29 << 16) + (var30 << 8) + var31;
				int var33 = method4691(var32, arg0);
				if (var33 == 0) {
					var33 = 1;
				}
				field2640[var4++] = var33;
			}
		}
	}

	@ObfuscatedName("ie.ap(ID)I")
	public static int method4691(int arg0, double arg1) {
		Statics.field2641 = arg1;
		double var3 = (double) (arg0 >> 16) / 256.0D;
		double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var7 = (double) (arg0 & 0xFF) / 256.0D;
		double var9 = Math.pow(var3, arg1);
		double var11 = Math.pow(var5, arg1);
		double var13 = Math.pow(var7, arg1);
		int var15 = (int) (var9 * 256.0D);
		int var16 = (int) (var11 * 256.0D);
		int var17 = (int) (var13 * 256.0D);
		return (var15 << 16) + (var16 << 8) + var17;
	}

	@ObfuscatedName("ie.aq()D")
	public static double method4631() {
		return Statics.field2641;
	}

	@ObfuscatedName("ie.ao()I")
	public static int method4632() {
		return field2633.field3004;
	}

	@ObfuscatedName("ie.as()I")
	public static int method4645() {
		return field2633.field3009;
	}

	@ObfuscatedName("ie.al()I")
	public static int method4630() {
		return field2633.field3012;
	}

	@ObfuscatedName("ie.au()I")
	public static int method4709() {
		return field2633.field3013;
	}

	@ObfuscatedName("ie.ai()I")
	public static int method4634() {
		return field2633.field3015;
	}

	@ObfuscatedName("ie.aa()I")
	public static int method4636() {
		return field2633.field3014;
	}

	@ObfuscatedName("ie.am()I")
	public static int method4637() {
		return field2633.field3006;
	}

	@ObfuscatedName("ie.an()I")
	public static int method4638() {
		return field2633.field2998;
	}

	@ObfuscatedName("ie.ar()Z")
	public static boolean method4639() {
		return field2642.method4752();
	}

	@ObfuscatedName("ie.ae([III[F)V")
	public static void method4640(int[] arg0, int arg1, int arg2, float[] arg3) {
		if (arg3 == null && field2642 == field2632) {
			field2642 = field2636;
		}
		field2642.method4753(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ie.ay()V")
	public static void method4633() {
		method4642(class602.field5995, class602.field5993, class602.field5996, class602.field5994);
	}

	@ObfuscatedName("ie.ad(IIII)V")
	public static void method4642(int arg0, int arg1, int arg2, int arg3) {
		field2633.field2998 = arg2 - arg0;
		field2633.field3010 = arg3 - arg1;
		method4710();
		if (field2633.field3016.length < field2633.field3010) {
			field2633.field3016 = new int[class337.method3774(field2633.field3010)];
		}
		int var4 = Statics.field5990 * arg1 + arg0;
		for (int var5 = 0; var5 < field2633.field3010; var5++) {
			field2633.field3016[var5] = var4;
			var4 += Statics.field5990;
		}
	}

	@ObfuscatedName("ie.ag()V")
	public static void method4710() {
		field2633.method5340();
	}

	@ObfuscatedName("ie.av(II)V")
	public static void method4680(int arg0, int arg1) {
		int var2 = field2633.field3016[0];
		int var3 = var2 / Statics.field5990;
		int var4 = var2 - Statics.field5990 * var3;
		field2633.method5339(arg0, var4, arg1, var3);
	}

	@ObfuscatedName("ie.ah(III)V")
	public static void method4668(int arg0, int arg1, int arg2) {
		field2633.method5342(arg0, arg1, arg2);
	}

	@ObfuscatedName("ie.ab(FFFFFFFFFIII)V")
	public static void method4644(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
		field2642.method4755(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	@ObfuscatedName("ie.ax(FFFFFFFFFI)V")
	public static void method4647(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9) {
		field2642.method4756(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("ie.ak(FFFFFFFFFIIIIIIIIIIIII)V")
	public static void method4648(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
		field2642.method4787(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
	}

	@ObfuscatedName("ie.aj(FFFFFFFFFIIIIIIIIIIIII)V")
	public static void method4649(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21) {
		field2642.method4746(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21);
	}

	@ObfuscatedName("ie.az(FFFFFFFFFIII)V")
	public static void method4704(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
		field2642.method4758(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	@ObfuscatedName("ie.bt(FFFFFFFFFI)V")
	public static void method4651(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9) {
		field2642.method4754(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}
}
