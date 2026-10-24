package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("CDEJWOSB")
public class WorldRegion {

	@ObfuscatedName("CDEJWOSB.a(IIIZ)I")
	public static int rotateX(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return arg1;
		}

		if (arg0 == 2) {
			return 7 - arg2;
		}

		return 7 - arg1;
	}

	@ObfuscatedName("CDEJWOSB.a(IIII)I")
	public static int rotateZ(int arg0, int arg1, int arg2) {
		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg0;
		}

		if (arg1 == 1) {
			return 7 - arg2;
		}

		if (arg1 == 2) {
			return 7 - arg0;
		}

		return arg2;
	}

	@ObfuscatedName("CDEJWOSB.a(IIIBII)I")
	public static int rotateLocX(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg2;
		}

		if (arg0 == 1) {
			return arg3;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg2 - arg4;
		}

		return 7 + 1 - arg3 - arg1;
	}

	@ObfuscatedName("CDEJWOSB.a(IIIIII)I")
	public static int rotateLocZ(int arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return 7 + 1 - arg4 - arg3;
		}

		if (arg2 == 2) {
			return 7 + 1 - arg0 - arg1;
		}

		return arg4;
	}
}
