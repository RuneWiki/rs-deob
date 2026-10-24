package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.SpotAnimType;

@ObfuscatedName("KFJRVZCI")
public final class ClientProj extends ModelSource {

	@ObfuscatedName("KFJRVZCI.I")
	public boolean field870 = false;

	@ObfuscatedName("KFJRVZCI.m")
	public SpotAnimType field851;

	@ObfuscatedName("KFJRVZCI.n")
	public int field852;

	@ObfuscatedName("KFJRVZCI.J")
	public int field871;

	@ObfuscatedName("KFJRVZCI.K")
	public int field872;

	@ObfuscatedName("KFJRVZCI.L")
	public int field873;

	@ObfuscatedName("KFJRVZCI.y")
	public int field861;

	@ObfuscatedName("KFJRVZCI.z")
	public int field862;

	@ObfuscatedName("KFJRVZCI.r")
	public int field856;

	@ObfuscatedName("KFJRVZCI.s")
	public int field857;

	@ObfuscatedName("KFJRVZCI.t")
	public int field858;

	@ObfuscatedName("KFJRVZCI.M")
	public int field874;

	@ObfuscatedName("KFJRVZCI.o")
	public double field853;

	@ObfuscatedName("KFJRVZCI.p")
	public double field854;

	@ObfuscatedName("KFJRVZCI.q")
	public double field855;

	@ObfuscatedName("KFJRVZCI.C")
	public double field865;

	@ObfuscatedName("KFJRVZCI.D")
	public double field866;

	@ObfuscatedName("KFJRVZCI.E")
	public double field867;

	@ObfuscatedName("KFJRVZCI.F")
	public double field868;

	@ObfuscatedName("KFJRVZCI.H")
	public double field869;

	@ObfuscatedName("KFJRVZCI.v")
	public int field859;

	@ObfuscatedName("KFJRVZCI.w")
	public int field860;

	@ObfuscatedName("KFJRVZCI.A")
	public int field863;

	@ObfuscatedName("KFJRVZCI.B")
	public int field864;

	@ObfuscatedName("KFJRVZCI.a(IIIII)V")
	public final void method271(int arg0, int arg1, int arg2, int arg3) {
		if (!field870) {
			double var5 = (double) (arg0 - field871);
			double var7 = (double) (arg1 - field872);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field853 = field857 * var5 / var9 + field871;
			field854 = field857 * var7 / var9 + field872;
			field855 = field873;
		}

		double var11 = (double) (field862 + 1 - arg3);
		field865 = (arg0 - field853) / var11;
		field866 = (arg1 - field854) / var11;
		field867 = Math.sqrt(field866 * field866 + field865 * field865);
		if (!field870) {
			field868 = -field867 * Math.tan(field856 * 0.02454369D);
		}

		field869 = (arg2 - field855 - field868 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("KFJRVZCI.a(IZ)V")
	public final void method272(int arg0) {
		field870 = true;
		field853 += arg0 * field865;
		field854 += arg0 * field866;
		field855 += field869 * 0.5D * arg0 * arg0 + arg0 * field868;
		field868 += arg0 * field869;
		field859 = (int) (Math.atan2(field865, field866) * 325.949D) + 1024 & 0x7FF;
		field860 = (int) (Math.atan2(field868, field867) * 325.949D) & 0x7FF;

		if (field851.field1122 != null) {
			field864 += arg0;
			while (field864 > field851.field1122.method214(field863)) {
				field864 -= field851.field1122.method214(field863);
				field863++;
				if (field863 >= field851.field1122.field681) {
					field863 = 0;
				}
			}
		}
	}

	@ObfuscatedName("KFJRVZCI.a(B)LLZYQDKJV;")
	public final Model method239() {
		Model var1 = field851.method439();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field851.field1122 != null) {
			var2 = field851.field1122.field682[field863];
		}

		Model var3 = new Model(false, true, var1, AnimFrame.method265(var2));
		if (var2 != -1) {
			var3.method366();
			var3.method367(var2);
			var3.field1069 = null;
			var3.field1068 = null;
		}

		if (field851.field1125 != 128 || field851.field1126 != 128) {
			var3.method375(field851.field1126, field851.field1125, field851.field1125);
		}

		var3.method371(field860);
		var3.method376(field851.field1128 + 64, field851.field1129 + 850, -30, -50, -30, true);
		return var3;
	}

	public ClientProj(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field851 = SpotAnimType.field1118[arg4];
		field852 = arg0;
		field871 = arg9;
		field872 = arg3;
		field873 = arg8;
		field861 = arg10;
		field862 = arg5;
		field856 = arg6;
		field857 = arg2;
		field858 = arg7;
		field874 = arg1;
		field870 = false;
	}
}
