package jagex2.dash3d.entity;

import deob.ObfuscatedName;
import jagex2.config.ObjType;
import jagex2.graphics.Model;

@ObfuscatedName("db")
public final class ObjStackEntity extends Entity {

	@ObfuscatedName("db.m")
	public int field453;

	@ObfuscatedName("db.n")
	public int field454;

	@ObfuscatedName("db.a(I)Lfb;")
	public final Model method122() {
		ObjType var1 = ObjType.method348(field453);
		return var1.method352(field454);
	}
}
