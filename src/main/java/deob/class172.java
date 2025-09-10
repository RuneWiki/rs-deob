package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gm")
public class class172 extends class545 {

	@ObfuscatedName("gm.af")
	public List field1919;

	@ObfuscatedName("gm.aw")
	public long field1923;

	@ObfuscatedName("gm.at")
	public String field1920 = null;

	@ObfuscatedName("gm.ac")
	public byte field1918;

	@ObfuscatedName("gm.ap")
	public byte field1922;

	@ObfuscatedName("gm.aq")
	public boolean field1925;

	@ObfuscatedName("gm.ao")
	public boolean field1924 = true;

	@ObfuscatedName("gm.as")
	public int[] field1921;

	static {
		new BitSet(65536);
	}

	public class172(class591 arg0) {
		this.method3797(arg0);
	}

	@ObfuscatedName("gm.af(B)[I")
	public int[] method3796() {
		if (this.field1921 == null) {
			String[] var1 = new String[this.field1919.size()];
			this.field1921 = new int[this.field1919.size()];
			int var2 = 0;
			while (var2 < this.field1919.size()) {
				var1[var2] = ((class154) this.field1919.get(var2)).field1780.method11023();
				this.field1921[var2] = var2++;
			}
			Statics.method5411(var1, this.field1921);
		}
		return this.field1921;
	}

	@ObfuscatedName("gm.aw(Lfx;I)V")
	public void method3793(class154 arg0) {
		this.field1919.add(arg0);
		this.field1921 = null;
	}

	@ObfuscatedName("gm.at(II)V")
	public void method3794(int arg0) {
		this.field1919.remove(arg0);
		this.field1921 = null;
	}

	@ObfuscatedName("gm.ac(I)I")
	public int method3801() {
		return this.field1919.size();
	}

	@ObfuscatedName("gm.ap(Ljava/lang/String;I)I")
	public int method3795(String arg0) {
		if (!this.field1924) {
			throw new RuntimeException("Displaynames not available");
		}
		for (int var2 = 0; var2 < this.field1919.size(); var2++) {
			if (((class154) this.field1919.get(var2)).field1780.method11022().equalsIgnoreCase(arg0)) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("gm.aq(Lwb;I)V")
	public void method3797(class591 arg0) {
		int var2 = arg0.method10339();
		if ((var2 & 0x1) != 0) {
			this.field1925 = true;
		}
		if ((var2 & 0x2) != 0) {
			this.field1924 = true;
		}
		int var3 = 2;
		if ((var2 & 0x4) != 0) {
			var3 = arg0.method10339();
		}
		this.field5601 = arg0.method10346();
		this.field1923 = arg0.method10346();
		this.field1920 = arg0.method10350();
		arg0.method10553();
		this.field1922 = arg0.method10340();
		this.field1918 = arg0.method10340();
		int var4 = arg0.method10341();
		if (var4 <= 0) {
			return;
		}
		this.field1919 = new ArrayList(var4);
		for (int var5 = 0; var5 < var4; var5++) {
			class154 var6 = new class154();
			if (this.field1925) {
				arg0.method10346();
			}
			if (this.field1924) {
				var6.field1780 = new class614(arg0.method10350());
			}
			var6.field1783 = arg0.method10340();
			var6.field1782 = arg0.method10341();
			if (var3 >= 3) {
				arg0.method10553();
			}
			this.field1919.add(var5, var6);
		}
	}
}
