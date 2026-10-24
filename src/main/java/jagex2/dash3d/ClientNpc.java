package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;

@ObfuscatedName("ab")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("ab.rb")
	public NpcType type;

	@ObfuscatedName("ab.a(I)Lfb;")
	public final Model getTempModel() {
		if (type == null) {
			return null;
		}

		Model var1 = getTempModel2();
		if (var1 == null) {
			return null;
		}

		height = var1.minY;

		if (spotanimId != -1 && spotanimFrame != -1) {
			SpotType var2 = SpotType.list[spotanimId];
			Model var3 = var2.getTempModel2();
			if (var3 != null) {
				int var4 = var2.seq.frames[spotanimFrame];
				Model var5 = new Model(AnimFrame.animateTransparencies(var4), false, true, var3);
				var5.translate(0, 0, -spotanimHeight);
				var5.prepareAnim();
				var5.animate(var4);
				var5.labelFaces = null;
				var5.labelVertices = null;

				if (var2.resizeh != 128 || var2.resizev != 128) {
					var5.resize(var2.resizeh, var2.resizeh, var2.resizev);
				}

				var5.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var1, var5 };
				var1 = new Model(2, var6, true);
			}
		}

		if (type.size == 1) {
			var1.useAABBMouseCheck = true;
		}

		return var1;
	}

	@ObfuscatedName("ab.c(I)Lfb;")
	public final Model getTempModel2() {
		if (primaryAnim < 0 || primaryAnimDelay != 0) {
			int var3 = -1;
			if (secondaryAnim >= 0) {
				var3 = SeqType.list[secondaryAnim].frames[secondaryFrame];
			}

			return type.getTempModel(var3, null, -1);
		}

		int var1 = SeqType.list[primaryAnim].frames[primaryFrame];
		int var2 = -1;
		if (secondaryAnim >= 0 && secondaryAnim != readyanim) {
			var2 = SeqType.list[secondaryAnim].frames[secondaryFrame];
		}

		return type.getTempModel(var1, SeqType.list[primaryAnim].walkmerge, var2);
	}

	@ObfuscatedName("ab.b(I)Z")
	public final boolean isReady() {
		if (type == null) {
			return false;
		}

		return true;
	}
}
