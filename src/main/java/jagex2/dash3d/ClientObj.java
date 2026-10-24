package jagex2.dash3d;

import deob.ObfuscatedName;
import jagex2.config.ObjType;

@ObfuscatedName("cb")
public final class ClientObj extends ModelSource {

	@ObfuscatedName("cb.n")
	public int id;

	@ObfuscatedName("cb.o")
	public int count;

	@ObfuscatedName("cb.a(Z)Leb;")
	public final Model getTempModel() {
		ObjType var1 = ObjType.list(id);
		return var1.getModelLit(count);
	}
}
