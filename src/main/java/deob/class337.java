package deob;

@ObfuscatedName("md")
public class class337 {

	@ObfuscatedName("md.af")
	public static int[] field3846;

	static {
		new Object();
		field3846 = new int[33];
		field3846[0] = 0;
		int var0 = 2;
		for (int var1 = 1; var1 < 33; var1++) {
			field3846[var1] = var0 - 1;
			var0 += var0;
		}
	}

	public class337() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("fu.af(IIS)I")
	public static int method3606(int arg0, int arg1) {
		int var2 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				var2 = arg0 * var2;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("client.aw(IB)I")
	public static int method1107(int arg0) {
		return field3846[arg0];
	}

	@ObfuscatedName("ge.at(IS)I")
	public static int method3773(int arg0) {
		int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
		int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
		int var4 = (var3 >>> 8) + var3;
		int var5 = (var4 >>> 16) + var4;
		return var5 & 0xFF;
	}

	@ObfuscatedName("lu.ac(IIII)I")
	public static int method6330(int arg0, int arg1, int arg2) {
		int var3 = method1107(arg2 - arg1 + 1);
		int var4 = var3 << arg1;
		return arg0 & ~var4;
	}

	@ObfuscatedName("mv.ap(IIII)I")
	public static int method6414(int arg0, int arg1, int arg2) {
		int var3 = method1107(arg2 - arg1 + 1);
		int var4 = var3 << arg1;
		return arg0 | var4;
	}

	@ObfuscatedName("gx.aq(IB)I")
	public static int method3774(int arg0) {
		int var6 = arg0 - 1;
		int var1 = var6 | var6 >>> 1;
		int var2 = var1 | var1 >>> 2;
		int var3 = var2 | var2 >>> 4;
		int var4 = var3 | var3 >>> 8;
		int var5 = var4 | var4 >>> 16;
		return var5 + 1;
	}

	@ObfuscatedName("tf.ao(II)I")
	public static int method9416(int arg0) {
		int var1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			var1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			var1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			var1 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			var1 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			var1++;
		}
		return arg0 + var1;
	}

	@ObfuscatedName("jc.as(III)I")
	public static int method5113(int arg0, int arg1) {
		int var2 = arg0 >>> 31;
		return (arg0 + var2) / arg1 - var2;
	}

	@ObfuscatedName("jx.al(IIB)I")
	public static int method5421(int arg0, int arg1) {
		return arg0 + (int) (Math.random() * (double) (arg1 - arg0));
	}

	@ObfuscatedName("ss.au(IB)J")
	public static long method8978(int arg0) {
		if (arg0 > 63) {
			throw new class458("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { arg0 });
		}
		return (long) Math.pow(2.0D, (double) arg0) - 1L;
	}

	@ObfuscatedName("tj.ai(IIII)I")
	public static int method9399(int arg0, int arg1, int arg2) {
		if (arg1 < arg0) {
			throw new IllegalArgumentException("max: " + arg1 + " can not be lower than min: " + arg0);
		}
		return Math.max(arg0, Math.min(arg2, arg1));
	}

	@ObfuscatedName("nf.aa(IIIIIIIIFFFI)F")
	public static float method6597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10) {
		float var11 = (float) ((arg2 - arg4) * (arg6 - arg7) + (arg4 - arg3) * (arg5 - arg7));
		float var12 = (float) ((arg0 - arg4) * (arg6 - arg7) + (arg1 - arg7) * (arg4 - arg3)) / var11;
		float var13 = (float) ((arg0 - arg4) * (arg7 - arg5) + (arg1 - arg7) * (arg2 - arg4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return arg10 * var14 + arg8 * var12 + arg9 * var13;
	}
}
