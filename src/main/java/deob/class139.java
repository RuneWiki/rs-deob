package deob;

@ObfuscatedName("ff")
public class class139 {

	@ObfuscatedName("ff.af")
	public boolean field1681;

	@ObfuscatedName("ff.aw")
	public boolean field1677;

	@ObfuscatedName("ff.at")
	public class137 field1660;

	@ObfuscatedName("ff.ac")
	public class137 field1661;

	@ObfuscatedName("ff.ap")
	public class134[] field1674;

	@ObfuscatedName("ff.aq")
	public boolean field1663;

	@ObfuscatedName("ff.ao")
	public float field1664;

	@ObfuscatedName("ff.as")
	public float field1662;

	@ObfuscatedName("ff.al")
	public float field1665;

	@ObfuscatedName("ff.au")
	public float field1658;

	@ObfuscatedName("ff.ai")
	public float field1668;

	@ObfuscatedName("ff.aa")
	public float field1669;

	@ObfuscatedName("ff.am")
	public float field1670;

	@ObfuscatedName("ff.an")
	public float field1671;

	@ObfuscatedName("ff.ar")
	public float field1672;

	@ObfuscatedName("ff.ae")
	public float field1673;

	@ObfuscatedName("ff.ay")
	public boolean field1659 = true;

	@ObfuscatedName("ff.ad")
	public int field1675 = 0;

	@ObfuscatedName("ff.ag")
	public float[] field1676;

	@ObfuscatedName("ff.av")
	public int field1666;

	@ObfuscatedName("ff.ah")
	public int field1667;

	@ObfuscatedName("ff.ab")
	public float field1679;

	@ObfuscatedName("ff.ax")
	public float field1680;

	@ObfuscatedName("ff.af(Lwb;II)I")
	public int method3529(class591 arg0, int arg1) {
		int var3 = arg0.method10341();
		class148.method785(arg0.method10339());
		int var4 = arg0.method10339();
		class137[] var5 = new class137[] { class137.field1648, class137.field1642, class137.field1643, class137.field1644, class137.field1645 };
		class137 var6 = (class137) class432.method3817(var5, var4);
		if (var6 == null) {
			var6 = class137.field1648;
		}
		this.field1660 = var6;
		int var8 = arg0.method10339();
		class137[] var9 = new class137[] { class137.field1648, class137.field1642, class137.field1643, class137.field1644, class137.field1645 };
		class137 var10 = (class137) class432.method3817(var9, var8);
		if (var10 == null) {
			var10 = class137.field1648;
		}
		this.field1661 = var10;
		this.field1681 = arg0.method10339() != 0;
		this.field1674 = new class134[var3];
		class134 var12 = null;
		for (int var13 = 0; var13 < var3; var13++) {
			class134 var14 = new class134();
			var14.method3463(arg0, arg1);
			this.field1674[var13] = var14;
			if (var12 != null) {
				var12.field1610 = var14;
			}
			var12 = var14;
		}
		return var3;
	}

	@ObfuscatedName("ff.aw(I)V")
	public void method3530() {
		this.field1666 = this.field1674[0].field1613;
		this.field1667 = this.field1674[this.method3556() - 1].field1613;
		this.field1676 = new float[this.method3534() + 1];
		for (int var1 = this.method3532(); var1 <= this.method3541(); var1++) {
			this.field1676[var1 - this.method3532()] = class135.method3455(this, (float) var1);
		}
		this.field1674 = null;
		this.field1679 = class135.method3455(this, (float) (this.method3532() - 1));
		this.field1680 = class135.method3455(this, (float) (this.method3541() + 1));
	}

	@ObfuscatedName("ff.at(IB)F")
	public float method3531(int arg0) {
		if (arg0 < this.method3532()) {
			return this.field1679;
		} else if (arg0 > this.method3541()) {
			return this.field1680;
		} else {
			return this.field1676[arg0 - this.method3532()];
		}
	}

	@ObfuscatedName("ff.ac(B)I")
	public int method3532() {
		return this.field1666;
	}

	@ObfuscatedName("ff.ap(I)I")
	public int method3541() {
		return this.field1667;
	}

	@ObfuscatedName("ff.aq(B)I")
	public int method3534() {
		return this.method3541() - this.method3532();
	}

	@ObfuscatedName("ff.ao(FI)I")
	public int method3535(float arg0) {
		if (this.field1675 >= 0 && (float) this.field1674[this.field1675].field1613 <= arg0 && (this.field1674[this.field1675].field1610 == null || (float) this.field1674[this.field1675].field1610.field1613 > arg0)) {
			return this.field1675;
		} else if (arg0 < (float) this.method3532() || arg0 > (float) this.method3541()) {
			return -1;
		} else {
			int var2 = this.method3556();
			int var3 = this.field1675;
			if (var2 > 0) {
				int var4 = 0;
				int var5 = var2 - 1;
				do {
					int var6 = var4 + var5 >> 1;
					if (arg0 < (float) this.field1674[var6].field1613) {
						if (arg0 > (float) this.field1674[var6 - 1].field1613) {
							var3 = var6 - 1;
							break;
						}
						var5 = var6 - 1;
					} else {
						if (!(arg0 > (float) this.field1674[var6].field1613)) {
							var3 = var6;
							break;
						}
						if (arg0 < (float) this.field1674[var6 + 1].field1613) {
							var3 = var6;
							break;
						}
						var4 = var6 + 1;
					}
				} while (var4 <= var5);
			}
			if (this.field1675 != var3) {
				this.field1675 = var3;
				this.field1659 = true;
			}
			return this.field1675;
		}
	}

	@ObfuscatedName("ff.as(FI)Lfd;")
	public class134 method3536(float arg0) {
		int var2 = this.method3535(arg0);
		return var2 >= 0 && var2 < this.field1674.length ? this.field1674[var2] : null;
	}

	@ObfuscatedName("ff.al(B)I")
	public int method3556() {
		return this.field1674 == null ? 0 : this.field1674.length;
	}
}
