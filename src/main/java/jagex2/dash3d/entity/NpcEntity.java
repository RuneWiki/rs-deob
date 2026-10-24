package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.graphics.Model;

@ObfuscatedName("ab")
public final class NpcEntity extends PathingEntity {

	@ObfuscatedName("ab.sb")
	public NpcType field420;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final Model method122() {
		if (field420 == null) {
			return null;
		}

		Model var1 = method128();
		if (var1 == null) {
			return null;
		}

		field412 = var1.field365;

		if (field399 != -1 && field400 != -1) {
			SpotAnimType var2 = SpotAnimType.field989[field399];
			Model var3 = var2.method386();
			if (var3 != null) {
				Model var4 = new Model(var3, true, false, !var2.field994);
				var4.method151(-field403, 0, 0);
				var4.method145();
				var4.method146(var2.field993.field975[field400]);
				var4.field517 = null;
				var4.field516 = null;

				if (var2.field997 != 128 || var2.field998 != 128) {
					var4.method154(var2.field998, var2.field997, var2.field997);
				}

				var4.method155(var2.field1000 + 64, var2.field1001 + 850, -30, -50, -30, true);
				Model[] var5 = new Model[] { var1, var4 };
				var1 = new Model(true, 2, var5);
			}
		}

		if (field420.field864 == 1) {
			var1.field518 = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final Model method128() {
		if (field394 < 0 || field397 != 0) {
			int var3 = -1;
			if (field391 >= 0) {
				var3 = SeqType.field973[field391].field975[field392];
			}

			return field420.method344(var3, -1, null);
		}

		int var1 = SeqType.field973[field394].field975[field395];
		int var2 = -1;
		if (field391 >= 0 && field391 != field371) {
			var2 = SeqType.field973[field391].field975[field392];
		}

		return field420.method344(var1, var2, SeqType.field973[field394].field979);
	}

	@ObfuscatedName("ab.a(B)Z")
	public final boolean method126() {
		if (field420 == null) {
			return false;
		}

		return true;
	}
}
