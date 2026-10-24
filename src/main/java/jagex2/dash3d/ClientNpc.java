package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;

@ObfuscatedName("RGHBDSIJ")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("RGHBDSIJ.rb")
	public NpcType field1183;

	@ObfuscatedName("RGHBDSIJ.b(B)LLZYQDKJV;")
	public final Model method457() {
		if (field1020 < 0 || field1023 != 0) {
			int var3 = -1;
			if (field984 >= 0) {
				var3 = SeqType.field680[field984].field682[field985];
			}

			return field1183.method475(var3, -1, null);
		}

		int var1 = SeqType.field680[field1020].field682[field1021];
		int var2 = -1;
		if (field984 >= 0 && field984 != field1030) {
			var2 = SeqType.field680[field984].field682[field985];
		}

		return field1183.method475(var1, var2, SeqType.field680[field1020].field686);
	}

	@ObfuscatedName("RGHBDSIJ.a(B)LLZYQDKJV;")
	public final Model method239() {
		if (field1183 == null) {
			return null;
		}

		Model var1 = method457();
		if (var1 == null) {
			return null;
		}

		field990 = var1.field1461;

		if (field1010 != -1 && field1011 != -1) {
			SpotAnimType var2 = SpotAnimType.field1118[field1010];
			Model var3 = var2.method439();
			if (var3 != null) {
				int var4 = var2.field1122.field682[field1011];
				Model var5 = new Model(false, true, var3, AnimFrame.method265(var4));
				var5.method372(0, 0, -field1014);
				var5.method366();
				var5.method367(var4);
				var5.field1069 = null;
				var5.field1068 = null;

				if (var2.field1125 != 128 || var2.field1126 != 128) {
					var5.method375(var2.field1126, var2.field1125, var2.field1125);
				}

				var5.method376(var2.field1128 + 64, var2.field1129 + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var1, var5 };
				var1 = new Model(2, true, var6);
			}
		}

		if (field1183.field1248 == 1) {
			var1.field1070 = true;
		}

		return var1;
	}

	@ObfuscatedName("RGHBDSIJ.b(I)Z")
	public final boolean method351() {
		if (field1183 == null) {
			return false;
		}

		return true;
	}
}
