package deob;

@ObfuscatedName("rm")
public class class452 {

	public class452() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ot.af(IIB)I")
	public static int method7505(int arg0, int arg1) {
		return (int) (Math.atan2((double) arg0, (double) arg1) * 325.94932345220167D) & 0x7FF;
	}

	@ObfuscatedName("pd.aw(IIIIIII)I")
	public static int method7591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = 0;
		if (arg0 < arg2) {
			var6 += arg2 - arg0;
		} else if (arg0 > arg4) {
			var6 += arg0 - arg4;
		}
		if (arg1 < arg3) {
			var6 += arg3 - arg1;
		} else if (arg1 > arg5) {
			var6 += arg1 - arg5;
		}
		return var6;
	}
}
