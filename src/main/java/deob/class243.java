package deob;

@ObfuscatedName("jl")
public class class243 {

	@ObfuscatedName("jl.bs")
	public static final class453 field2963 = new class453();

	@ObfuscatedName("jl.bu")
	public static boolean field2954 = false;

	@ObfuscatedName("jl.bi")
	public static int field2965 = 0;

	@ObfuscatedName("jl.bd")
	public static int field2966 = 0;

	@ObfuscatedName("jl.ba")
	public static boolean field2958 = false;

	@ObfuscatedName("jl.be")
	public static int field2968 = 0;

	@ObfuscatedName("jl.bh")
	public static long[] field2969 = new long[1000];

	public class243() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("he.af(II)I")
	public static int method4212(int arg0) {
		long var1 = field2969[arg0];
		return (int) (var1 >>> 0 & 0x7FL);
	}

	@ObfuscatedName("fj.aw(J)I")
	public static int method3592(long arg0) {
		return (int) (arg0 >>> 7 & 0x7FL);
	}

	@ObfuscatedName("rj.at(II)I")
	public static int method8523(int arg0) {
		long var1 = field2969[arg0];
		return (int) (var1 >>> 16 & 0x7L);
	}

	@ObfuscatedName("is.ac(IS)I")
	public static int method4434(int arg0) {
		return method9745(field2969[arg0]);
	}

	@ObfuscatedName("ue.ap(J)I")
	public static int method9745(long arg0) {
		return (int) (arg0 >>> 20 & 0xFFFFFFFFL);
	}

	@ObfuscatedName("ei.ao(IIIIZIII)J")
	public static long method3407(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
		long var7 = (long) ((arg1 & 0x7F) << 0 | (arg2 & 0x7F) << 7 | (arg0 & 0x3) << 14 | (arg3 & 0x7) << 16) | ((long) arg5 & 0xFFFFFFFFL) << 20 | ((long) arg6 & 0xFFFL) << 52;
		if (arg4) {
			var7 |= 0x80000L;
		}
		return var7;
	}

	@ObfuscatedName("qe.as(J)V")
	public static final void method7849(long arg0) {
		field2969[++field2968 - 1] = arg0;
	}

	@ObfuscatedName("de.al(I)Z")
	public static final boolean method2811() {
		return field2954;
	}

	@ObfuscatedName("hi.au(I)I")
	public static final int method3962() {
		return field2965;
	}

	@ObfuscatedName("hy.ai(FFFFIIIB)V")
	public static final void method4007(float arg0, float arg1, float arg2, float arg3, int arg4, int arg5, int arg6) {
		if (field2958) {
			return;
		}
		float var11 = 50.0F;
		float var12 = (float) class229.method4749();
		float var13 = (float) (field2965 - arg4) * var11 / (float) arg6;
		float var14 = (float) (field2966 - arg5) * var11 / (float) arg6;
		float var15 = (float) (field2965 - arg4) * var12 / (float) arg6;
		float var16 = (float) (field2966 - arg5) * var12 / (float) arg6;
		float var17 = arg0 * var11 + arg1 * var14;
		float var19 = class241.method5566(var14, var11, arg1, arg0);
		float var21 = arg0 * var12 + arg1 * var16;
		float var23 = class241.method5566(var16, var12, arg1, arg0);
		float var25 = class241.method3044(var13, var19, arg3, arg2);
		float var26 = arg2 * var13 + arg3 * var19;
		float var29 = class241.method3044(var15, var23, arg3, arg2);
		float var30 = arg2 * var15 + arg3 * var23;
		method7631((int) var25, (int) var17, (int) var26, (int) var29, (int) var21, (int) var30);
	}

	@ObfuscatedName("ke.aa(Lrj;IIIB)V")
	public static void method5666(class455 arg0, int arg1, int arg2, int arg3) {
		if (field2958) {
			return;
		}
		byte var4 = 50;
		int var5 = class229.method4749();
		int var6 = (field2965 - arg1) * var4 / arg3;
		int var7 = (field2966 - arg2) * var4 / arg3;
		int var8 = (field2965 - arg1) * var5 / arg3;
		int var9 = (field2966 - arg2) * var5 / arg3;
		class455 var10 = class455.method3584(arg0);
		var10.method8445();
		float[] var11 = new float[3];
		var10.method8429((float) var6, (float) var7, (float) var4, var11);
		int var12 = (int) var11[0];
		int var13 = (int) var11[1];
		int var14 = (int) var11[2];
		var10.method8429((float) var8, (float) var9, (float) var5, var11);
		int var15 = (int) var11[0];
		int var16 = (int) var11[1];
		int var17 = (int) var11[2];
		var10.method8484();
		method7631(var12, var13, var14, var15, var16, var17);
	}

	@ObfuscatedName("ph.am(IIIIIIB)V")
	public static void method7631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		Statics.field2209 = (arg0 + arg3) / 2;
		Statics.field2249 = (arg1 + arg4) / 2;
		Statics.field1968 = (arg2 + arg5) / 2;
		Statics.field5167 = (arg3 - arg0) / 2;
		Statics.field1966 = (arg4 - arg1) / 2;
		Statics.field1592 = (arg5 - arg2) / 2;
		Statics.field1114 = Math.abs(Statics.field5167);
		Statics.field5751 = Math.abs(Statics.field1966);
		Statics.field3501 = Math.abs(Statics.field1592);
		field2963.method8337((float) (arg3 - arg0), (float) (arg4 - arg1), (float) (arg5 - arg2));
		field2963.method8386();
		field2958 = true;
	}

	@ObfuscatedName("hn.an(Ljn;IIIIFFFFIIII)Z")
	public static final boolean method4123(class242 arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
		boolean var12 = field2954;
		if (var12) {
			method4007(arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			return method7991(arg0, arg1, arg2, arg3, arg4);
		} else {
			return false;
		}
	}

	@ObfuscatedName("lu.ar(Ljn;IIIILrj;IIIB)Z")
	public static final boolean method6333(class242 arg0, int arg1, int arg2, int arg3, int arg4, class455 arg5, int arg6, int arg7, int arg8) {
		boolean var9 = field2954;
		if (var9) {
			method5666(arg5, arg6, arg7, arg8);
			return method7991(arg0, arg1, arg2, arg3, arg4);
		} else {
			return false;
		}
	}

	@ObfuscatedName("qj.ae(Ljn;IIIIB)Z")
	public static boolean method7991(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
		class233 var5 = arg0.method5127(arg1);
		int var6 = var5.field2800 + arg2;
		int var7 = var5.field2795 + arg3;
		int var8 = var5.field2796 + arg4;
		int var9 = var5.field2797;
		int var10 = var5.field2798;
		int var11 = var5.field2793;
		int var12 = Statics.field2209 - var6;
		int var13 = Statics.field2249 - var7;
		int var14 = Statics.field1968 - var8;
		if (Math.abs(var12) > Statics.field1114 + var9) {
			return false;
		} else if (Math.abs(var13) > Statics.field5751 + var10) {
			return false;
		} else if (Math.abs(var14) > Statics.field3501 + var11) {
			return false;
		} else if (Math.abs(Statics.field1966 * var14 - Statics.field1592 * var13) > Statics.field5751 * var11 + Statics.field3501 * var10) {
			return false;
		} else if (Math.abs(Statics.field1592 * var12 - Statics.field5167 * var14) > Statics.field3501 * var9 + Statics.field1114 * var11) {
			return false;
		} else {
			return Math.abs(Statics.field5167 * var13 - Statics.field1966 * var12) <= Statics.field5751 * var9 + Statics.field1114 * var10;
		}
	}

	@ObfuscatedName("sq.ay(IIIIIIII)Z")
	public static final boolean method9129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var7 = field2966 + arg6;
		if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
			return false;
		}
		int var8 = field2966 - arg6;
		if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
			return false;
		}
		int var9 = field2965 + arg6;
		if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
			return false;
		} else {
			int var10 = field2965 - arg6;
			return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
		}
	}

	@ObfuscatedName("il.ad(Lit;IIIIIIII)Lre;")
	public static final class453 method4260(class231 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		float var8 = 1.0E-5F;
		field2958 = false;
		method4007(arg0.field2748, arg0.field2775, arg0.field2733, arg0.field2751, arg5, arg6, arg7);
		class453 var9 = class453.method6269(0.0F, 1.0F, 0.0F);
		float var10 = Statics.method2374(var9, field2963);
		if (Math.abs(var10) < 1.0E-5F) {
			var9.method8336();
			return null;
		}
		class453 var11 = class453.method6269((float) arg2, (float) arg3, (float) arg4);
		class453 var12 = class453.method6269(var11.field5176, var11.field5177 - (float) arg1, var11.field5170);
		float var13 = -Statics.method2374(var9, var12) / var10;
		var9.method8336();
		if (var13 < 0.0F) {
			var12.method8336();
			var11.method8336();
			return null;
		}
		class453 var14 = field2963;
		class453 var15 = class453.method6495(var14);
		var15.method8347(var13);
		class453 var18 = class453.method15(var11, var15);
		var15.method8336();
		var12.method8336();
		var11.method8336();
		return var18;
	}
}
