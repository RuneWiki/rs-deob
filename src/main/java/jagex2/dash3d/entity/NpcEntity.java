package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;

@ObfuscatedName("CWNCPMLX")
public final class NpcEntity extends PathingEntity {

	@ObfuscatedName("CWNCPMLX.vb")
	public NpcType type;

	@ObfuscatedName("CWNCPMLX.b(I)LZKARKDQW;")
	public final Model getAnimatedModel() {
		if (primarySeqId < 0 || primarySeqDelay != 0) {
			int var3 = -1;
			if (secondarySeqId >= 0) {
				var3 = SeqType.instances[secondarySeqId].frames[secondarySeqFrame];
			}

			return type.getModel(-1, var3, null);
		}

		int var1 = SeqType.instances[primarySeqId].frames[primarySeqFrame];
		int var2 = -1;
		if (secondarySeqId >= 0 && secondarySeqId != seqStandId) {
			var2 = SeqType.instances[secondarySeqId].frames[secondarySeqFrame];
		}

		return type.getModel(var2, var1, SeqType.instances[primarySeqId].walkmerge);
	}

	@ObfuscatedName("CWNCPMLX.a(I)LZKARKDQW;")
	public final Model getModel() {
		if (type == null) {
			return null;
		}

		Model var1 = getAnimatedModel();
		if (var1 == null) {
			return null;
		}

		height = var1.minY;

		if (spotanimId != -1 && spotanimFrame != -1) {
			SpotAnimType var2 = SpotAnimType.instances[spotanimId];
			Model var3 = var2.getModel();
			if (var3 != null) {
				int var4 = var2.seq.frames[spotanimFrame];
				Model var5 = new Model(true, AnimFrame.isNull(var4), false, var3);
				var5.translate(0, -spotanimHeight, 0);
				var5.createLabelReferences();
				var5.applyTransform(var4);
				var5.labelFaces = null;
				var5.labelVertices = null;

				if (var2.resizeh != 128 || var2.resizev != 128) {
					var5.scale(var2.resizeh, var2.resizeh, var2.resizev);
				}

				var5.calculateNormals(var2.ambient + 64, var2.contrast + 850, -30, -50, -30, true);
				Model[] var6 = new Model[] { var1, var5 };
				var1 = new Model(2, true, var6);
			}
		}

		if (type.size == 1) {
			var1.picking = true;
		}

		return var1;
	}

	@ObfuscatedName("CWNCPMLX.b(Z)Z")
	public final boolean isVisible() {
		if (type == null) {
			return false;
		}

		return true;
	}
}
