package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotType;

@ObfuscatedName("y")
public final class ClientNpc extends ClientEntity {

	@ObfuscatedName("y.ib")
	public NpcType type;

	@ObfuscatedName("y.a(Z)Leb;")
	public final Model getTempModel() {
		if (type == null) {
			return null;
		}

		if (spotanimId != -1 && spotanimFrame != -1) {
			Model var1 = getTempModel2();
			SpotType var2 = SpotType.list[spotanimId];
			Model var3 = new Model(var2.getTempModel2(), true, !var2.animateTransparencies, false);
			var3.translate(-spotanimHeight, 0, 0);
			var3.prepareAnim();
			var3.animate(var2.seq.frames[spotanimFrame]);
			var3.labelFaces = null;
			var3.labelVertices = null;

			if (var2.resizeh != 128 || var2.resizev != 128) {
				var3.resize(var2.resizeh, var2.resizev, var2.resizeh);
			}

			var3.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
			Model[] var4 = new Model[] { var1, var3 };
			Model var5 = new Model(var4, 2, true);
			if (type.size == 1) {
				var5.useAABBMouseCheck = true;
			}

			return var5;
		}

		return getTempModel2();
	}

	@ObfuscatedName("y.c(Z)Leb;")
	public final Model getTempModel2() {
		if (primaryAnim >= 0 && primaryAnimDelay == 0) {
			int var1 = SeqType.list[primaryAnim].frames[primaryFrame];
			int var2 = -1;
			if (secondaryAnim >= 0 && secondaryAnim != readyanim) {
				var2 = SeqType.list[secondaryAnim].frames[secondaryFrame];
			}

			return type.getTempModel(var1, var2, SeqType.list[primaryAnim].walkmerge);
		}

		int var3 = -1;
		if (secondaryAnim >= 0) {
			var3 = SeqType.list[secondaryAnim].frames[secondaryFrame];
		}

		Model var4 = type.getTempModel(var3, -1, null);
		height = var4.minY;
		return var4;
	}

	@ObfuscatedName("y.b(Z)Z")
	public final boolean isReady() {
		if (type == null) {
			return false;
		}

		return true;
	}
}
