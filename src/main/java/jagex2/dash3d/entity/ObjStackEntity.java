package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.ObjType;
import jagex2.graphics.Model;

public class ObjStackEntity extends Entity {

	@ObfuscatedName("HNKCWGJM.m")
	public int type;

	@ObfuscatedName("HNKCWGJM.n")
	public int count;

	@ObfuscatedName("HNKCWGJM.a(I)LZKARKDQW;")
	public final Model getModel(int arg0) {
		ObjType var2 = ObjType.get(this.type);
		if (arg0 != 4016) {
			throw new NullPointerException();
		}
		return var2.getModel(this.count);
	}
}
