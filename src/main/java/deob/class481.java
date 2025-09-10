package deob;

import java.util.Random;

@ObfuscatedName("sa")
public class class481 {

	public class481() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("sa.af([BI[BII)V")
	public static void method8994(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				int var9 = arg4 - 1;
				int var5 = arg1 + var9;
				int var6 = arg3 + var9;
				int var7 = var5 - var9;
				int var10 = var7 + 7;
				while (var5 >= var10) {
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
				}
				var7 = var10 - 7;
				while (var5 >= var7) {
					arg2[var6--] = arg0[var5--];
				}
				return;
			}
		}
		int var8 = arg1 + arg4;
		int var11 = var8 - 7;
		while (arg1 < var11) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		var8 = var11 + 7;
		while (arg1 < var8) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@ObfuscatedName("sa.au([III)V")
	public static void method9003(int[] arg0, int arg1, int arg2) {
		int var3 = arg1 + arg2 - 7;
		while (arg1 < var3) {
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
			arg0[arg1++] = 0;
		}
		var3 += 7;
		while (arg1 < var3) {
			arg0[arg1++] = 0;
		}
	}

	@ObfuscatedName("sa.ai(II)Ljava/util/Random;")
	public static Random method9040(int arg0, int arg1) {
		if (arg0 == 0 && arg1 == 0) {
			arg0 = (int) (Math.random() * 2.147483647E9D);
			arg1 = (int) (Math.random() * 2.147483647E9D);
		}
		long var2 = (long) arg0 << 32 | (long) arg1;
		return new Random(var2);
	}

	@ObfuscatedName("sa.aa([IIII)V")
	public static void method9009(int[] arg0, int arg1, int arg2, int arg3) {
		Random var4 = method9040(arg2, arg3);
		for (int var5 = arg1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				int var7 = arg0[var5];
				arg0[var5] = arg0[var6];
				arg0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("sa.am([JIII)V")
	public static void method9006(long[] arg0, int arg1, int arg2, int arg3) {
		Random var4 = method9040(arg2, arg3);
		for (int var5 = arg1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				long var7 = arg0[var5];
				arg0[var5] = arg0[var6];
				arg0[var6] = var7;
			}
		}
	}

	@ObfuscatedName("sa.an([Ljava/lang/Object;III)V")
	public static void method9026(Object[] arg0, int arg1, int arg2, int arg3) {
		Random var4 = method9040(arg2, arg3);
		for (int var5 = arg1 - 1; var5 > 0; var5--) {
			int var6 = var4.nextInt(var5 + 1);
			if (var5 != var6) {
				Object var7 = arg0[var5];
				arg0[var5] = arg0[var6];
				arg0[var6] = var7;
			}
		}
	}
}
