package deob;

@ObfuscatedName("gq")
public class class177 {

	@ObfuscatedName("gq.ap")
	public short[] field1948;

	@ObfuscatedName("gq.aq")
	public short[] field1950;

	@ObfuscatedName("gq.ao")
	public int field1951 = -1;

	@ObfuscatedName("gq.as")
	public int field1952 = -1;

	@ObfuscatedName("gq.al")
	public int field1945 = -1;

	@ObfuscatedName("gq.au")
	public int field1953 = -1;

	@ObfuscatedName("gq.ai")
	public int field1954;

	@ObfuscatedName("gq.aa")
	public class242 field1956;

	public class177(int arg0) {
		class214 var2 = class214.method2737(arg0);
		if (var2.method4371()) {
			this.field1948 = new short[var2.field2389.length];
			System.arraycopy(var2.field2389, 0, this.field1948, 0, this.field1948.length);
		}
		if (var2.method4372()) {
			this.field1950 = new short[var2.field2374.length];
			System.arraycopy(var2.field2374, 0, this.field1950, 0, this.field1950.length);
		}
		this.field1954 = var2.field2385;
	}

	@ObfuscatedName("gz.af(ILwb;B)Lgq;")
	public static class177 method3678(int arg0, class591 arg1) {
		int var2 = arg1.method10339();
		boolean var3 = (var2 & 0x1) != 0;
		boolean var4 = (var2 & 0x2) != 0;
		boolean var5 = (var2 & 0x4) != 0;
		boolean var6 = (var2 & 0x8) != 0;
		class177 var7 = new class177(arg0);
		if (var3) {
			int var8 = arg1.method10339();
			int[] var9 = new int[] { var8 & 0xF, var8 >> 4 & 0xF };
			boolean var10 = var7.field1948 != null && var7.field1948.length == var9.length;
			for (int var11 = 0; var11 < 2; var11++) {
				if (var9[var11] != 15) {
					short var12 = (short) arg1.method10341();
					if (var10) {
						var7.field1948[var9[var11]] = var12;
					}
				}
			}
		}
		if (var4) {
			int var13 = arg1.method10339();
			int[] var14 = new int[] { var13 & 0xF, var13 >> 4 & 0xF };
			boolean var15 = var7.field1950 != null && var7.field1950.length == var14.length;
			for (int var16 = 0; var16 < 2; var16++) {
				if (var14[var16] != 15) {
					short var17 = (short) arg1.method10341();
					if (var15) {
						var7.field1950[var14[var16]] = var17;
					}
				}
			}
		}
		if (var5) {
			var7.field1951 = arg1.method10341();
			var7.field1952 = arg1.method10341();
		}
		if (var6) {
			var7.field1945 = arg1.method10341();
			var7.field1953 = arg1.method10341();
		}
		return var7;
	}

	@ObfuscatedName("gq.aw(B)Z")
	public boolean method3824() {
		return this.field1948 != null;
	}

	@ObfuscatedName("gq.at(B)Z")
	public boolean method3825() {
		return this.field1950 != null;
	}

	@ObfuscatedName("gq.ac(II)Z")
	public boolean method3826(int arg0) {
		return arg0 == 0 && this.field1951 != -1 || arg0 == 1 && this.field1952 != -1;
	}

	@ObfuscatedName("gq.ap(II)Z")
	public boolean method3842(int arg0) {
		return arg0 == 0 && this.field1945 != -1 || arg0 == 1 && this.field1953 != -1;
	}

	@ObfuscatedName("gq.aq(IB)I")
	public int method3844(int arg0) {
		return arg0 == 0 ? this.field1951 : this.field1952;
	}

	@ObfuscatedName("gq.ao(II)I")
	public int method3845(int arg0) {
		return arg0 == 0 ? this.field1945 : this.field1953;
	}
}
