package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("WHUAOHZM")
public final class MapSpotAnim extends ModelSource {

	@ObfuscatedName("WHUAOHZM.r")
	public boolean field1322 = false;

	@ObfuscatedName("WHUAOHZM.u")
	public SpotAnimType field1325;

	@ObfuscatedName("WHUAOHZM.m")
	public int field1318;

	@ObfuscatedName("WHUAOHZM.n")
	public int field1319;

	@ObfuscatedName("WHUAOHZM.o")
	public int field1320;

	@ObfuscatedName("WHUAOHZM.p")
	public int field1321;

	@ObfuscatedName("WHUAOHZM.v")
	public int field1326;

	@ObfuscatedName("WHUAOHZM.s")
	public int field1323;

	@ObfuscatedName("WHUAOHZM.t")
	public int field1324;

	@ObfuscatedName("WHUAOHZM.a(BI)V")
	public final void method486(int arg0) {
		field1324 += arg0;
		while (field1324 > field1325.field1122.method214(field1323)) {
			field1324 -= field1325.field1122.method214(field1323);
			field1323++;
			if (field1323 >= field1325.field1122.field681 && (field1323 < 0 || field1323 >= field1325.field1122.field681)) {
				field1323 = 0;
				field1322 = true;
			}
		}
	}

	public MapSpotAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1325 = SpotAnimType.field1118[arg4];
		field1318 = arg1;
		field1319 = arg0;
		field1320 = arg6;
		field1321 = arg2;
		field1326 = arg3 + arg5;
		field1322 = false;
	}

	@ObfuscatedName("WHUAOHZM.a(B)LLZYQDKJV;")
	public final Model method239() {
		Model var1 = field1325.method439();
		if (var1 == null) {
			return null;
		}

		int var2 = field1325.field1122.field682[field1323];
		Model var3 = new Model(false, true, var1, AnimFrame.method265(var2));
		if (!field1322) {
			var3.method366();
			var3.method367(var2);
			var3.field1069 = null;
			var3.field1068 = null;
		}

		if (field1325.field1125 != 128 || field1325.field1126 != 128) {
			var3.method375(field1325.field1126, field1325.field1125, field1325.field1125);
		}

		if (field1325.field1127 != 0) {
			if (field1325.field1127 == 90) {
				var3.method370();
			}

			if (field1325.field1127 == 180) {
				var3.method370();
				var3.method370();
			}

			if (field1325.field1127 == 270) {
				var3.method370();
				var3.method370();
				var3.method370();
			}
		}

		var3.method376(field1325.field1128 + 64, field1325.field1129 + 850, -30, -50, -30, true);
		return var3;
	}
}
