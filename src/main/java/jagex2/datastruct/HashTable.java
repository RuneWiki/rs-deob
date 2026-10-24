package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("u")
public final class HashTable {

	@ObfuscatedName("u.b")
	public int field334;

	@ObfuscatedName("u.c")
	public Linkable[] field335;

	public HashTable(int arg0) {
		field334 = arg0;
		field335 = new Linkable[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = field335[var2] = new Linkable();
			var3.field337 = var3;
			var3.field338 = var3;
		}
	}

	@ObfuscatedName("u.a(J)Lv;")
	public Linkable method117(long arg0) {
		Linkable var3 = field335[(int) (arg0 & field334 - 1)];
		for (Linkable var4 = var3.field337; var4 != var3; var4 = var4.field337) {
			if (var4.field336 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("u.a(IJLv;)V")
	public void method118(long arg0, Linkable arg1) {
		if (arg1.field338 != null) {
			arg1.method119();
		}

		Linkable var4 = field335[(int) (arg0 & field334 - 1)];
		arg1.field338 = var4.field338;
		arg1.field337 = var4;
		arg1.field338.field337 = arg1;
		arg1.field337.field338 = arg1;
		arg1.field336 = arg0;
	}
}
