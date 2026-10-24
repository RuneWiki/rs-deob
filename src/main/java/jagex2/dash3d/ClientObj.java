package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("db")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("db.m")
	public int id;

	@ObfuscatedName("db.n")
	public int count;

	@ObfuscatedName("db.a(I)Lfb;")
	public final Model getTempModel() {
		ObjType var1 = ObjType.list(id);
		return var1.getModelLit(count);
	}
}
