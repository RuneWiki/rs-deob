package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import deob.client;
import jagex2.config.LocType;
import jagex2.config.SeqType;
import jagex2.config.VarbitType;
import jagex2.graphics.Model;

public class LocEntity extends Entity {

	@ObfuscatedName("WBWOBAFW.m")
	public byte _flowObfuscator6 = 7;

	@ObfuscatedName("WBWOBAFW.y")
	public int type;

	@ObfuscatedName("WBWOBAFW.z")
	public int shape;

	@ObfuscatedName("WBWOBAFW.A")
	public int rotation;

	@ObfuscatedName("WBWOBAFW.r")
	public int heightmapSW;

	@ObfuscatedName("WBWOBAFW.s")
	public int heightmapSE;

	@ObfuscatedName("WBWOBAFW.t")
	public int heightmapNE;

	@ObfuscatedName("WBWOBAFW.u")
	public int heightmapNW;

	@ObfuscatedName("WBWOBAFW.v")
	public SeqType anim;

	@ObfuscatedName("WBWOBAFW.n")
	public int animFrame;

	@ObfuscatedName("WBWOBAFW.w")
	public int animCycle;

	@ObfuscatedName("WBWOBAFW.p")
	public int multivarbit;

	@ObfuscatedName("WBWOBAFW.q")
	public int mutlivarp;

	@ObfuscatedName("WBWOBAFW.o")
	public int[] multiloc;

	@ObfuscatedName("WBWOBAFW.B")
	public int _flowObfuscator7;

	@ObfuscatedName("WBWOBAFW.x")
	public static client varProvider;

	@ObfuscatedName("WBWOBAFW.a(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		int var2 = -1;
		if (arg0 != 4016) {
			this._flowObfuscator7 = -272;
		}
		if (this.anim != null) {
			int var3 = client.loopCycle - this.animCycle;
			if (var3 > 100 && this.anim.replayoff > 0) {
				var3 = 100;
			}
			label44: {
				do {
					do {
						if (var3 <= this.anim.getFrameDuration(this.animFrame, (byte) -39)) {
							break label44;
						}
						var3 -= this.anim.getFrameDuration(this.animFrame, (byte) -39);
						this.animFrame++;
					} while (this.animFrame < this.anim.frameCount);
					this.animFrame -= this.anim.replayoff;
				} while (this.animFrame >= 0 && this.animFrame < this.anim.frameCount);
				this.anim = null;
			}
			this.animCycle = client.loopCycle - var3;
			if (this.anim != null) {
				var2 = this.anim.frames[this.animFrame];
			}
		}
		LocType var4;
		if (this.multiloc == null) {
			var4 = LocType.get(this.type);
		} else {
			var4 = this.getMultiLoc(true);
		}
		return var4 == null ? null : var4.getModel(this.shape, this.rotation, this.heightmapSW, this.heightmapSE, this.heightmapNE, this.heightmapNW, var2);
	}

	@ObfuscatedName("WBWOBAFW.a(Z)LYZDBYLRM;")
	public final LocType getMultiLoc(boolean arg0) {
		int var2 = -1;
		if (!arg0) {
			for (int var3 = 1; var3 > 0; var3++) {
			}
		}
		if (this.multivarbit != -1) {
			VarbitType var4 = VarbitType.instances[this.multivarbit];
			int var5 = var4.basevar;
			int var6 = var4.startbit;
			int var7 = var4.endbit;
			int var8 = client.BITMASK[var7 - var6];
			var2 = varProvider.varps[var5] >> var6 & var8;
		} else if (this.mutlivarp != -1) {
			var2 = varProvider.varps[this.mutlivarp];
		}
		return var2 < 0 || var2 >= this.multiloc.length || this.multiloc[var2] == -1 ? null : LocType.get(this.multiloc[var2]);
	}

	public LocEntity(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
		if (this._flowObfuscator6 != arg4) {
			for (int var11 = 1; var11 > 0; var11++) {
			}
		}
		this.type = arg0;
		this.shape = arg2;
		this.rotation = arg1;
		this.heightmapSW = arg6;
		this.heightmapSE = arg3;
		this.heightmapNE = arg5;
		this.heightmapNW = arg7;
		if (arg8 != -1) {
			this.anim = SeqType.instances[arg8];
			this.animFrame = 0;
			this.animCycle = client.loopCycle;
			if (arg9 && this.anim.replayoff != -1) {
				this.animFrame = (int) (Math.random() * (double) this.anim.frameCount);
				this.animCycle -= (int) (Math.random() * (double) this.anim.getFrameDuration(this.animFrame, (byte) -39));
			}
		}
		LocType var12 = LocType.get(this.type);
		this.multivarbit = var12.multivarbit;
		this.mutlivarp = var12.multivarp;
		this.multiloc = var12.multiloc;
	}
}
