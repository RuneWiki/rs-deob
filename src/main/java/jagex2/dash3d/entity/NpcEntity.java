package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.NpcType;
import jagex2.config.SeqType;
import jagex2.config.SpotAnimType;
import jagex2.graphics.AnimFrame;
import jagex2.graphics.Model;

public class NpcEntity extends PathingEntity {

	@ObfuscatedName("CWNCPMLX.tb")
	public boolean _flowObfuscator10 = false;

	@ObfuscatedName("CWNCPMLX.ub")
	public int _flowObfuscator11 = 9;

	@ObfuscatedName("CWNCPMLX.sb")
	public int _flowObfuscator9;

	@ObfuscatedName("CWNCPMLX.vb")
	public NpcType type;

	@ObfuscatedName("CWNCPMLX.b(I)LZKARKDQW;")
	public final Model getAnimatedModel(int arg0) {
		if (arg0 != 0) {
			for (int var2 = 1; var2 > 0; var2++) {
			}
		}
		if (super.primarySeqId < 0 || super.primarySeqDelay != 0) {
			int var5 = -1;
			if (super.secondarySeqId >= 0) {
				var5 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
			}
			return this.type.getModel(0, -1, var5, null);
		}
		int var3 = SeqType.instances[super.primarySeqId].frames[super.primarySeqFrame];
		int var4 = -1;
		if (super.secondarySeqId >= 0 && super.secondarySeqId != super.seqStandId) {
			var4 = SeqType.instances[super.secondarySeqId].frames[super.secondarySeqFrame];
		}
		return this.type.getModel(0, var4, var3, SeqType.instances[super.primarySeqId].walkmerge);
	}

	@ObfuscatedName("CWNCPMLX.a(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		if (this.type == null) {
			return null;
		}
		Model var2 = this.getAnimatedModel(0);
		if (var2 == null) {
			return null;
		}
		super.height = var2.minY;
		if (arg0 != 4016) {
			this._flowObfuscator9 = -403;
		}
		if (super.spotanimId != -1 && super.spotanimFrame != -1) {
			SpotAnimType var3 = SpotAnimType.instances[super.spotanimId];
			Model var4 = var3.getModel();
			if (var4 != null) {
				int var5 = var3.seq.frames[super.spotanimFrame];
				Model var6 = new Model(9, true, AnimFrame.isNull(var5, false), false, var4);
				var6.translate(0, -super.spotanimHeight, 16384, 0);
				var6.createLabelReferences((byte) -71);
				var6.applyTransform(var5, 40542);
				var6.labelFaces = null;
				var6.labelVertices = null;
				if (var3.resizeh != 128 || var3.resizev != 128) {
					var6.scale(var3.resizeh, var3.resizeh, this._flowObfuscator11, var3.resizev);
				}
				var6.calculateNormals(var3.ambient + 64, var3.contrast + 850, -30, -50, -30, true);
				Model[] var7 = new Model[] { var2, var6 };
				var2 = new Model(2, -819, true, var7);
			}
		}
		if (this.type.size == 1) {
			var2.picking = true;
		}
		return var2;
	}

	@ObfuscatedName("CWNCPMLX.b(Z)Z")
	public final boolean isVisible(boolean arg0) {
		if (!arg0) {
			this._flowObfuscator10 = !this._flowObfuscator10;
		}
		return this.type != null;
	}
}
