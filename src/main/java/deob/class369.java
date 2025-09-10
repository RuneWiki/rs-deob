package deob;

import java.util.Arrays;

@ObfuscatedName("on")
public class class369 {

	@ObfuscatedName("on.ac")
	public class370 field4129;

	@ObfuscatedName("on.ap")
	public int field4130;

	@ObfuscatedName("on.aq")
	public int[] field4127 = new int[32];

	@ObfuscatedName("on.ao")
	public int[] field4131 = new int[32];

	@ObfuscatedName("on.as")
	public int field4133 = 0;

	@ObfuscatedName("on.af(ILoi;II)V")
	public void method7304(int arg0, class370 arg1, int arg2) {
		this.field4129 = arg1;
		this.field4130 = 0;
		this.field4133 = 0;
		if (arg0 < 0 || arg0 >= 3) {
			throw new RuntimeException("");
		} else if (arg1 != null && (arg1.field4146 != -1 || arg1.field4148 != 0)) {
			throw new RuntimeException("");
		} else if (arg1 != null && arg1.field4287 != null) {
			if (arg0 == 0) {
				class370[] var4 = arg1.field4287;
				for (int var5 = 0; var5 < var4.length; var5++) {
					class370 var6 = var4[var5];
					if (var6 != null) {
						this.method7289(var6.field4146);
					}
				}
			} else {
				boolean var7 = arg0 != 1;
				if (arg2 == -1) {
					this.method7316(arg1, var7);
				} else if (arg2 >= 0 && arg2 < arg1.field4287.length && arg1.field4287[arg2] != null) {
					this.method7316(arg1.field4287[arg2], var7);
				}
			}
		}
	}

	@ObfuscatedName("on.aw(II)V")
	public final void method7289(int arg0) {
		if (this.field4130 == this.field4127.length) {
			this.field4127 = Arrays.copyOf(this.field4127, this.field4127.length * 2);
		}
		this.field4127[++this.field4130 - 1] = arg0;
	}

	@ObfuscatedName("on.at(Loi;ZI)V")
	public final void method7316(class370 arg0, boolean arg1) {
		int var3 = this.field4129 == arg0 ? 0 : arg0.field4249;
		int var4 = this.field4129 == arg0 ? arg0.field4287.length - 1 : arg0.field4215;
		for (int var5 = var3; var5 <= var4; var5++) {
			class370 var6 = this.field4129.field4287[var5];
			if (var6 != null && arg0.field4146 == var6.field4166) {
				this.method7289(var6.field4146);
				if (arg1 && var6.field4249 <= var6.field4215) {
					this.method7316(var6, true);
				}
			}
		}
	}

	@ObfuscatedName("on.ac(I)I")
	public int method7291() {
		return this.field4130;
	}

	@ObfuscatedName("on.ap(I)Loi;")
	public class370 method7293() {
		int var1 = this.method7306();
		return var1 >= 0 ? this.field4129.field4287[var1] : null;
	}

	@ObfuscatedName("on.aq(I)I")
	public int method7306() {
		return this.field4133 >= this.field4130 ? -1 : this.field4127[++this.field4133 - 1];
	}

	@ObfuscatedName("on.ao(I)[I")
	public int[] method7294() {
		return Arrays.copyOf(this.field4127, this.field4130);
	}

	@ObfuscatedName("on.as(ILjava/lang/Object;Ljava/lang/Object;I)V")
	public void method7295(int arg0, Object arg1, Object arg2) {
		int[] var4 = this.field4127;
		int var5 = this.field4130;
		this.field4127 = this.field4131;
		this.field4130 = 0;
		this.field4131 = var4;
		for (int var6 = 0; var6 < var5; var6++) {
			class370 var7 = this.field4129.field4287[var4[var6]];
			if (var7 != null) {
				Object var8 = var7.method7391(arg0, arg2);
				if (arg1 == var8 || var8 != null && var8.equals(arg1)) {
					this.method7289(var4[var6]);
				}
			}
		}
	}
}
