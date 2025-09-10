package deob;

import java.util.Arrays;

@ObfuscatedName("kh")
public class class275 implements class30 {

	@ObfuscatedName("kh.aw")
	public int[] field3208 = new int[128];

	@ObfuscatedName("kh.at")
	public int field3207 = 0;

	@ObfuscatedName("kh.ac")
	public int[] field3210 = new int[128];

	@ObfuscatedName("kh.ap")
	public int field3211 = 0;

	@ObfuscatedName("kh.aq")
	public char field3216;

	@ObfuscatedName("kh.ao")
	public int field3213;

	@ObfuscatedName("kh.as")
	public char[] field3214 = new char[128];

	@ObfuscatedName("kh.al")
	public int[] field3215 = new int[128];

	@ObfuscatedName("kh.au")
	public int field3218 = 0;

	@ObfuscatedName("kh.ai")
	public int field3212 = 0;

	@ObfuscatedName("kh.aa")
	public int field3223 = 0;

	@ObfuscatedName("kh.am")
	public boolean[] field3219 = new boolean[112];

	@ObfuscatedName("kh.an")
	public boolean[] field3220 = new boolean[112];

	@ObfuscatedName("kh.ar")
	public boolean[] field3221 = new boolean[112];

	@ObfuscatedName("kh.af(IB)Z")
	public boolean method461(int arg0) {
		this.method5689(arg0);
		this.field3219[arg0] = true;
		this.field3220[arg0] = true;
		this.field3221[arg0] = false;
		if (this.field3207 < 128) {
			this.field3208[++this.field3207 - 1] = arg0;
		}
		return true;
	}

	@ObfuscatedName("kh.aw(II)Z")
	public boolean method450(int arg0) {
		this.field3219[arg0] = false;
		this.field3220[arg0] = false;
		this.field3221[arg0] = true;
		if (this.field3211 < 128) {
			this.field3210[++this.field3211 - 1] = arg0;
		}
		return true;
	}

	@ObfuscatedName("kh.at(CI)Z")
	public boolean method451(char arg0) {
		int var2 = this.field3212 + 1 & 0x7F;
		if (this.field3218 != var2) {
			this.field3215[this.field3212] = -1;
			this.field3214[this.field3212] = arg0;
			this.field3212 = var2;
		}
		return false;
	}

	@ObfuscatedName("kh.an(II)V")
	public void method5689(int arg0) {
		int var2 = this.field3212 + 1 & 0x7F;
		if (this.field3218 != var2) {
			this.field3215[this.field3212] = arg0;
			this.field3214[this.field3212] = 0;
			this.field3212 = var2;
		}
	}

	@ObfuscatedName("kh.ac(ZB)Z")
	public boolean method452(boolean arg0) {
		return false;
	}

	@ObfuscatedName("kh.ar(I)V")
	public void method5690() {
		this.field3218 = this.field3223;
		this.field3223 = this.field3212;
		this.field3207 = 0;
		this.field3211 = 0;
		Arrays.fill(this.field3220, false);
		Arrays.fill(this.field3221, false);
	}

	@ObfuscatedName("kh.ae(I)Z")
	public final boolean method5691() {
		if (this.field3223 == this.field3218) {
			return false;
		} else {
			this.field3213 = this.field3215[this.field3218];
			this.field3216 = this.field3214[this.field3218];
			this.field3218 = this.field3218 + 1 & 0x7F;
			return true;
		}
	}

	@ObfuscatedName("kh.ay(II)Z")
	public boolean method5692(int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.field3220[arg0] : false;
	}

	@ObfuscatedName("kh.ad(II)Z")
	public boolean method5701(int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.field3219[arg0] : false;
	}

	@ObfuscatedName("kh.ag(II)Z")
	public boolean method5693(int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.field3221[arg0] : false;
	}

	@ObfuscatedName("kh.av(I)[I")
	public int[] method5698() {
		int[] var1 = new int[this.field3207];
		for (int var2 = 0; var2 < this.field3207; var2++) {
			var1[var2] = this.field3208[var2];
		}
		return var1;
	}

	@ObfuscatedName("kh.ah(B)[I")
	public int[] method5695() {
		int[] var1 = new int[this.field3211];
		for (int var2 = 0; var2 < this.field3211; var2++) {
			var1[var2] = this.field3210[var2];
		}
		return var1;
	}
}
