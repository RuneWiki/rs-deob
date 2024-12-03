package jagex2.dash3d;

import deob.ObfuscatedName;

public class WorldRegion {

	@ObfuscatedName("CDEJWOSB.a")
	public static int _flowObfuscator1 = -12499;

	@ObfuscatedName("CDEJWOSB.b")
	public static int _flowObfuscator2 = -192;

	@ObfuscatedName("CDEJWOSB.a(IIIZ)I")
	public static int rotateX(int arg0, int arg1, int arg2, boolean arg3) {
		int var4 = arg0 & 0x3;
		if (arg3) {
			for (int var5 = 1; var5 > 0; var5++) {
			}
		}
		if (var4 == 0) {
			return arg2;
		} else if (var4 == 1) {
			return arg1;
		} else if (var4 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg1;
		}
	}

	@ObfuscatedName("CDEJWOSB.a(IIII)I")
	public static int rotateZ(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= 0) {
			_flowObfuscator2 = -146;
		}
		int var4 = arg1 & 0x3;
		if (var4 == 0) {
			return arg0;
		} else if (var4 == 1) {
			return 7 - arg3;
		} else if (var4 == 2) {
			return 7 - arg0;
		} else {
			return arg3;
		}
	}

	@ObfuscatedName("CDEJWOSB.a(IIIBII)I")
	public static int rotateLocX(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
		if (arg3 != 113) {
			return _flowObfuscator1;
		}
		int var6 = arg0 & 0x3;
		if (var6 == 0) {
			return arg2;
		} else if (var6 == 1) {
			return arg4;
		} else if (var6 == 2) {
			return 7 - arg2 - (arg5 - 1);
		} else {
			return 7 - arg4 - (arg1 - 1);
		}
	}

	@ObfuscatedName("CDEJWOSB.a(IIIIII)I")
	public static int rotateLocZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = arg3 & 0x3;
		if (arg0 >= 0) {
			return _flowObfuscator2;
		} else if (var6 == 0) {
			return arg1;
		} else if (var6 == 1) {
			return 7 - arg5 - (arg4 - 1);
		} else if (var6 == 2) {
			return 7 - arg1 - (arg2 - 1);
		} else {
			return arg5;
		}
	}
}
