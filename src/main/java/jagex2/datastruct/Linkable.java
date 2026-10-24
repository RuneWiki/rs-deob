package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ZUOIJLRD")
public class Linkable {

	@ObfuscatedName("ZUOIJLRD.a")
	public long field1511;

	@ObfuscatedName("ZUOIJLRD.b")
	public Linkable field1512;

	@ObfuscatedName("ZUOIJLRD.c")
	public Linkable field1513;

	@ObfuscatedName("ZUOIJLRD.a()V")
	public void method604() {
		if (field1513 != null) {
			field1513.field1512 = field1512;
			field1512.field1513 = field1513;
			field1512 = null;
			field1513 = null;
		}
	}
}
