package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.ObjType;
import jagex2.graphics.Model;

@ObfuscatedName("HNKCWGJM")
public final class ObjStackEntity extends Entity {

	@ObfuscatedName("HNKCWGJM.m")
	public int type;

	@ObfuscatedName("HNKCWGJM.n")
	public int count;

	@ObfuscatedName("HNKCWGJM.a(I)LZKARKDQW;")
	public final Model getModel() {
		ObjType var1 = ObjType.get(type);
		return var1.getModel(count);
	}
}
