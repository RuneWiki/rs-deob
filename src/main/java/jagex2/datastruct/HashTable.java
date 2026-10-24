package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("JLFXAIRK")
public final class HashTable {

	@ObfuscatedName("JLFXAIRK.c")
	public int field785;

	@ObfuscatedName("JLFXAIRK.d")
	public Linkable[] field786;

	public HashTable(int arg0) {
		field785 = arg0;
		field786 = new Linkable[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			Linkable var3 = field786[var2] = new Linkable();
			var3.field1512 = var3;
			var3.field1513 = var3;
		}
	}

	@ObfuscatedName("JLFXAIRK.a(J)LZUOIJLRD;")
	public Linkable method259(long arg0) {
		Linkable var3 = field786[(int) (arg0 & field785 - 1)];
		for (Linkable var4 = var3.field1512; var4 != var3; var4 = var4.field1512) {
			if (var4.field1511 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("JLFXAIRK.a(ILZUOIJLRD;J)V")
	public void method260(Linkable arg0, long arg1) {
		if (arg0.field1513 != null) {
			arg0.method604();
		}

		Linkable var4 = field786[(int) (arg1 & field785 - 1)];
		arg0.field1513 = var4.field1513;
		arg0.field1512 = var4;
		arg0.field1513.field1512 = arg0;
		arg0.field1512.field1513 = arg0;
		arg0.field1511 = arg1;
	}
}
