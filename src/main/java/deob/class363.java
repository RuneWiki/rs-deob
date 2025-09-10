package deob;

@ObfuscatedName("nt")
public class class363 {

	public class363() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ne.af(ID)I")
	public static int method6747(int arg0, double arg1) {
		double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var7 = (double) (arg0 & 0xFF) / 256.0D;
		double var9 = Math.pow(var3, arg1);
		double var11 = Math.pow(var5, arg1);
		double var13 = Math.pow(var7, arg1);
		int var15 = (int) (var9 * 256.0D);
		int var16 = (int) (var11 * 256.0D);
		int var17 = (int) (var13 * 256.0D);
		return (var16 << 8) + (var15 << 16) + -16777216 + var17;
	}
}
