package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.client.Client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.config.VarbitType;

@ObfuscatedName("NRPYRAWK")
public class ClientLocAnim extends ModelSource {

	@ObfuscatedName("NRPYRAWK.s")
	public int field1153;

	@ObfuscatedName("NRPYRAWK.t")
	public int field1154;

	@ObfuscatedName("NRPYRAWK.u")
	public int field1155;

	@ObfuscatedName("NRPYRAWK.n")
	public int field1149;

	@ObfuscatedName("NRPYRAWK.o")
	public int field1150;

	@ObfuscatedName("NRPYRAWK.p")
	public int field1151;

	@ObfuscatedName("NRPYRAWK.q")
	public int field1152;

	@ObfuscatedName("NRPYRAWK.w")
	public SeqType field1157;

	@ObfuscatedName("NRPYRAWK.C")
	public int field1162;

	@ObfuscatedName("NRPYRAWK.B")
	public int field1161;

	@ObfuscatedName("NRPYRAWK.x")
	public int field1158;

	@ObfuscatedName("NRPYRAWK.y")
	public int field1159;

	@ObfuscatedName("NRPYRAWK.z")
	public int[] field1160;

	@ObfuscatedName("NRPYRAWK.v")
	public static Client field1156;

	@ObfuscatedName("NRPYRAWK.a(I)LYMYTDPVW;")
	public final LocType method440() {
		int var1 = -1;
		if (field1158 != -1) {
			VarbitType var2 = VarbitType.field1502[field1158];
			int var3 = var2.field1504;
			int var4 = var2.field1505;
			int var5 = var2.field1506;
			int var6 = Client.field450[var5 - var4];
			var1 = field1156.field296[var3] >> var4 & var6;
		} else if (field1159 != -1) {
			var1 = field1156.field296[field1159];
		}

		if (var1 >= 0 && var1 < field1160.length && field1160[var1] != -1) {
			return LocType.method561(field1160[var1]);
		}

		return null;
	}

	public ClientLocAnim(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
		field1153 = arg5;
		field1154 = arg4;
		field1155 = arg8;
		field1149 = arg7;
		field1150 = arg3;
		field1151 = arg1;
		field1152 = arg2;

		if (arg0 != -1) {
			field1157 = SeqType.field680[arg0];
			field1162 = 0;
			field1161 = Client.field553 - 1;
			if (arg6 && field1157.field685 != -1) {
				field1162 = (int) (Math.random() * field1157.field681);
				field1161 -= (int) (Math.random() * field1157.method214(field1162));
			}
		}

		LocType var10 = LocType.method561(field1153);
		field1158 = var10.field1397;
		field1159 = var10.field1400;
		field1160 = var10.field1420;
	}

	@ObfuscatedName("NRPYRAWK.a(B)LLZYQDKJV;")
	public final Model method239() {
		int var1 = -1;
		if (field1157 != null) {
			int var2 = Client.field553 - field1161;
			if (var2 > 100 && field1157.field685 > 0) {
				var2 = 100;
			}

			while (var2 > field1157.method214(field1162)) {
				var2 -= field1157.method214(field1162);
				field1162++;
				if (field1162 >= field1157.field681) {
					field1162 -= field1157.field685;
					if (field1162 < 0 || field1162 >= field1157.field681) {
						break;
					}
				}
			}

			field1157 = null;
			field1161 = Client.field553 - var2;

			if (field1157 != null) {
				var1 = field1157.field682[field1162];
			}
		}

		LocType var3;
		if (field1160 == null) {
			var3 = LocType.method561(field1153);
		} else {
			var3 = method440();
		}

		if (var3 == null) {
			return null;
		}

		return var3.method569(field1154, field1155, field1149, field1150, field1151, field1152, var1);
	}
}
