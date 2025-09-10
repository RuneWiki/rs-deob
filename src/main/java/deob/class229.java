package deob;

@ObfuscatedName("ih")
public abstract class class229 extends class602 {

	@ObfuscatedName("ih.ao")
	public static int field2666 = 0;

	@ObfuscatedName("ih.as")
	public boolean field2660 = false;

	@ObfuscatedName("ih.al")
	public int[] field2668 = class226.field2640;

	@ObfuscatedName("ih.au")
	public class248 field2669;

	public class229(class248 arg0) {
		this.field2669 = arg0;
	}

	@ObfuscatedName("ih.af(IBBBB)I")
	public static int method4789(int arg0, byte arg1, byte arg2, byte arg3, byte arg4) {
		int var5 = arg0 >> 10 & 0x3F;
		int var6 = arg0 >> 7 & 0x7;
		int var7 = arg0 & 0x7F;
		int var8 = arg4 & 0xFF;
		if (arg1 != -1) {
			var5 += (arg1 - var5) * var8 >> 7;
		}
		if (arg2 != -1) {
			var6 += (arg2 - var6) * var8 >> 7;
		}
		if (arg3 != -1) {
			var7 += (arg3 - var7) * var8 >> 7;
		}
		return (var5 << 10 | var6 << 7 | var7) & 0xFFFF;
	}

	@ObfuscatedName("ih.aw(II)I")
	public static final int method4786(int arg0, int arg1) {
		int var2 = (arg0 & 0x7F) * arg1 >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("ih.at()I")
	public static final int method4749() {
		return field2666;
	}

	@ObfuscatedName("ih.ac(I)V")
	public static void method4750(int arg0) {
		field2666 = arg0;
	}

	@ObfuscatedName("ih.ap(I)V")
	public static void method4751(int arg0) {
		int var1 = arg0 * 210;
		method4750(var1);
	}

	@ObfuscatedName("ih.ao([III[F)V")
	public void method4753(int[] arg0, int arg1, int arg2, float[] arg3) {
		method10672(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ih.as(FFFFFFFFFIII)V")
	public void method4758(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11) {
		byte var13 = this.field2669.field3002.field2984;
		if (var13 > 0) {
			byte var14 = this.field2669.field3002.field2983;
			byte var15 = this.field2669.field3002.field2982;
			byte var16 = this.field2669.field3002.field2981;
			arg9 = method4789(arg9, var14, var15, var16, var13);
			arg10 = method4789(arg10, var14, var15, var16, var13);
			arg11 = method4789(arg11, var14, var15, var16, var13);
		}
		this.method4755(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
	}

	@ObfuscatedName("ih.al(FFFFFFFFFI)V")
	public void method4754(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9) {
		byte var11 = this.field2669.field3002.field2984;
		if (var11 > 0) {
			int var12 = method4789(arg9, this.field2669.field3002.field2983, this.field2669.field3002.field2982, this.field2669.field3002.field2981, this.field2669.field3002.field2984);
			arg9 = this.field2668[var12];
		}
		this.method4756(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@ObfuscatedName("ih.am(FFFFFFFFFIIIIIIIIIIIII)V")
	public abstract void method4746(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);

	@ObfuscatedName("ih.aq()Z")
	public abstract boolean method4752();

	@ObfuscatedName("ih.au(FFFFFFFFFIII)V")
	public abstract void method4755(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11);

	@ObfuscatedName("ih.ai(FFFFFFFFFI)V")
	public abstract void method4756(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9);

	@ObfuscatedName("ih.aa(FFFFFFFFFIIIIIIIIIIIII)V")
	public abstract void method4787(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21);
}
