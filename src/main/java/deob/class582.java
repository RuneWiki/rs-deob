package deob;

@ObfuscatedName("wx")
public class class582 {

	public class582() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("hn.af([Ljava/lang/String;[SI)V")
	public static void method4103(String[] arg0, short[] arg1) {
		method7602(arg0, arg1, 0, arg0.length - 1);
	}

	@ObfuscatedName("pu.aw([Ljava/lang/String;[SIII)V")
	public static void method7602(String[] arg0, short[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		String var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		short var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		for (int var8 = arg2; var8 < arg3; var8++) {
			if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
				String var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5] = var9;
				short var10 = arg1[var8];
				arg1[var8] = arg1[var5];
				arg1[var5++] = var10;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method7602(arg0, arg1, arg2, var5 - 1);
		method7602(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("vb.ac([Ljava/lang/String;[IIIB)V")
	public static void method10135(String[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		String var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		for (int var8 = arg2; var8 < arg3; var8++) {
			if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
				String var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5] = var9;
				int var10 = arg1[var8];
				arg1[var8] = arg1[var5];
				arg1[var5++] = var10;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method10135(arg0, arg1, arg2, var5 - 1);
		method10135(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("ge.aq([Ljava/lang/String;[Ljava/lang/Object;III)V")
	public static void method3772(String[] arg0, Object[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		String var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		Object var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		for (int var8 = arg2; var8 < arg3; var8++) {
			if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
				String var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5] = var9;
				Object var10 = arg1[var8];
				arg1[var8] = arg1[var5];
				arg1[var5++] = var10;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method3772(arg0, arg1, arg2, var5 - 1);
		method3772(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("jq.ao([I[IIII)V")
	public static void method5404(int[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		int var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;
		for (int var9 = arg2; var9 < arg3; var9++) {
			if (arg0[var9] < (var9 & var8) + var6) {
				int var10 = arg0[var9];
				arg0[var9] = arg0[var5];
				arg0[var5] = var10;
				int var11 = arg1[var9];
				arg1[var9] = arg1[var5];
				arg1[var5++] = var11;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method5404(arg0, arg1, arg2, var5 - 1);
		method5404(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("ht.as([I[JIIB)V")
	public static void method4099(int[] arg0, long[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		int var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		long var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		int var9 = var6 == Integer.MAX_VALUE ? 0 : 1;
		for (int var10 = arg2; var10 < arg3; var10++) {
			if (arg0[var10] < (var10 & var9) + var6) {
				int var11 = arg0[var10];
				arg0[var10] = arg0[var5];
				arg0[var5] = var11;
				long var12 = arg1[var10];
				arg1[var10] = arg1[var5];
				arg1[var5++] = var12;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method4099(arg0, arg1, arg2, var5 - 1);
		method4099(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("ub.al([J[IIII)V")
	public static void method9737(long[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		long var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var8 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var8;
		int var9 = var6 == Long.MAX_VALUE ? 0 : 1;
		for (int var10 = arg2; var10 < arg3; var10++) {
			if (arg0[var10] < (long) (var10 & var9) + var6) {
				long var11 = arg0[var10];
				arg0[var10] = arg0[var5];
				arg0[var5] = var11;
				int var13 = arg1[var10];
				arg1[var10] = arg1[var5];
				arg1[var5++] = var13;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var8;
		method9737(arg0, arg1, arg2, var5 - 1);
		method9737(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("qi.au([J[JIII)V")
	public static void method7859(long[] arg0, long[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		long var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		long var8 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var8;
		long var10 = var6 == Long.MAX_VALUE ? 0L : 1L;
		for (int var12 = arg2; var12 < arg3; var12++) {
			if (arg0[var12] < ((long) var12 & var10) + var6) {
				long var13 = arg0[var12];
				arg0[var12] = arg0[var5];
				arg0[var5] = var13;
				long var15 = arg1[var12];
				arg1[var12] = arg1[var5];
				arg1[var5++] = var15;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var8;
		method7859(arg0, arg1, arg2, var5 - 1);
		method7859(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("lb.ai([F[II)V")
	public static void method6190(float[] arg0, int[] arg1) {
		method7686(arg0, arg1, 0, arg0.length - 1);
	}

	@ObfuscatedName("py.aa([F[IIII)V")
	public static void method7686(float[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		float var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		for (int var8 = arg2; var8 < arg3; var8++) {
			if (arg0[var8] < var6) {
				float var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5] = var9;
				int var10 = arg1[var8];
				arg1[var8] = arg1[var5];
				arg1[var5++] = var10;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method7686(arg0, arg1, arg2, var5 - 1);
		method7686(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("od.am([I[Ljava/lang/Object;III)V")
	public static void method7286(int[] arg0, Object[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		int var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		Object var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;
		for (int var9 = arg2; var9 < arg3; var9++) {
			if (arg0[var9] < (var9 & var8) + var6) {
				int var10 = arg0[var9];
				arg0[var9] = arg0[var5];
				arg0[var5] = var10;
				Object var11 = arg1[var9];
				arg1[var9] = arg1[var5];
				arg1[var5++] = var11;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method7286(arg0, arg1, arg2, var5 - 1);
		method7286(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("bp.an([J[Ljava/lang/Object;III)V")
	public static void method1504(long[] arg0, Object[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		long var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		Object var8 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var8;
		int var9 = var6 == Long.MAX_VALUE ? 0 : 1;
		for (int var10 = arg2; var10 < arg3; var10++) {
			if (arg0[var10] < (long) (var10 & var9) + var6) {
				long var11 = arg0[var10];
				arg0[var10] = arg0[var5];
				arg0[var5] = var11;
				Object var13 = arg1[var10];
				arg1[var10] = arg1[var5];
				arg1[var5++] = var13;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var8;
		method1504(arg0, arg1, arg2, var5 - 1);
		method1504(arg0, arg1, var5 + 1, arg3);
	}
}
