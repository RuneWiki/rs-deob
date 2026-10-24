package jagex2.dash3d;

import deob.ObfuscatedName;

@ObfuscatedName("RKBCLNKC")
public class WorldRegion {

	@ObfuscatedName("RKBCLNKC.a(BIII)I")
	public static int method461(int arg0, int arg1, int arg2) {
		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg1;
		}

		if (arg0 == 1) {
			return arg2;
		}

		if (arg0 == 2) {
			return 7 - arg1;
		}

		return 7 - arg2;
	}

	@ObfuscatedName("RKBCLNKC.a(IIIB)I")
	public static int method462(int arg0, int arg1, int arg2) {
		arg2 &= 0x3;
		if (arg2 == 0) {
			return arg0;
		}

		if (arg2 == 1) {
			return 7 - arg1;
		}

		if (arg2 == 2) {
			return 7 - arg0;
		}

		return arg1;
	}

	@ObfuscatedName("RKBCLNKC.a(IIIIBII)I")
	public static int method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg2 & 0x1) == 1) {
			int var6 = arg4;
			arg4 = arg1;
			arg1 = var6;
		}

		arg0 &= 0x3;
		if (arg0 == 0) {
			return arg3;
		}

		if (arg0 == 1) {
			return arg5;
		}

		if (arg0 == 2) {
			return 7 + 1 - arg3 - arg4;
		}

		return 7 + 1 - arg5 - arg1;
	}

	@ObfuscatedName("RKBCLNKC.a(IIIIIII)I")
	public static int method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg0;
			arg0 = arg4;
			arg4 = var6;
		}

		arg1 &= 0x3;
		if (arg1 == 0) {
			return arg3;
		}

		if (arg1 == 1) {
			return 7 + 1 - arg2 - arg0;
		}

		if (arg1 == 2) {
			return 7 + 1 - arg3 - arg4;
		}

		return arg2;
	}
}
