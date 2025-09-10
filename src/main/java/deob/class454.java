package deob;

@ObfuscatedName("rl")
public class class454 {

	@ObfuscatedName("rl.af")
	public static class454[] field5179;

	@ObfuscatedName("rl.ac")
	public float field5183;

	@ObfuscatedName("rl.ap")
	public float field5180;

	@ObfuscatedName("rl.aq")
	public float field5181;

	@ObfuscatedName("rl.ao")
	public float field5182;

	static {
		new class454();
		field5179 = new class454[0];
		method497(16);
	}

	public class454() {
		this.method8402();
	}

	@ObfuscatedName("bo.af(II)V")
	public static void method497(int arg0) {
		Statics.field5141 = arg0;
		field5179 = new class454[arg0];
		Statics.field92 = 0;
	}

	@ObfuscatedName("ck.aw(I)Lrl;")
	public static class454 method2375() {
		class454[] var0 = field5179;
		synchronized (field5179) {
			if (Statics.field92 == 0) {
				return new class454();
			} else {
				field5179[--Statics.field92].method8402();
				return field5179[Statics.field92];
			}
		}
	}

	@ObfuscatedName("rl.at(I)V")
	public void method8398() {
		class454[] var1 = field5179;
		synchronized (field5179) {
			if (Statics.field92 < Statics.field5141) {
				field5179[++Statics.field92 - 1] = this;
			}
		}
	}

	@ObfuscatedName("rl.ac(FFFFI)V")
	public void method8421(float arg0, float arg1, float arg2, float arg3) {
		this.field5183 = arg0;
		this.field5180 = arg1;
		this.field5181 = arg2;
		this.field5182 = arg3;
	}

	@ObfuscatedName("rl.ap(FFFFI)V")
	public void method8400(float arg0, float arg1, float arg2, float arg3) {
		float var5 = (float) Math.sin((double) (arg3 * 0.5F));
		float var6 = (float) Math.cos((double) (arg3 * 0.5F));
		this.field5183 = arg0 * var5;
		this.field5180 = arg1 * var5;
		this.field5181 = arg2 * var5;
		this.field5182 = var6;
	}

	@ObfuscatedName("rl.aq(FFFI)V")
	public void method8416(float arg0, float arg1, float arg2) {
		this.method8400(0.0F, 1.0F, 0.0F, arg0);
		class454 var4 = method2375();
		var4.method8400(1.0F, 0.0F, 0.0F, arg1);
		this.method8403(var4);
		var4.method8400(0.0F, 0.0F, 1.0F, arg2);
		this.method8403(var4);
		var4.method8398();
	}

	@ObfuscatedName("rl.ao(I)V")
	public final void method8402() {
		this.field5181 = 0.0F;
		this.field5180 = 0.0F;
		this.field5183 = 0.0F;
		this.field5182 = 1.0F;
	}

	@ObfuscatedName("rl.as(Lrl;I)V")
	public final void method8403(class454 arg0) {
		this.method8421(this.field5181 * arg0.field5180 + this.field5183 * arg0.field5182 + this.field5182 * arg0.field5183 - this.field5180 * arg0.field5181, this.field5183 * arg0.field5181 + this.field5182 * arg0.field5180 + (this.field5180 * arg0.field5182 - this.field5181 * arg0.field5183), this.field5182 * arg0.field5181 + (this.field5181 * arg0.field5182 + this.field5180 * arg0.field5183 - this.field5183 * arg0.field5180), this.field5182 * arg0.field5182 - this.field5183 * arg0.field5183 - this.field5180 * arg0.field5180 - this.field5181 * arg0.field5181);
	}

	public boolean equals(Object arg0) {
		if (arg0 instanceof class454) {
			class454 var2 = (class454) arg0;
			return this.field5183 == var2.field5183 && this.field5180 == var2.field5180 && this.field5181 == var2.field5181 && this.field5182 == var2.field5182;
		} else {
			return false;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		float var3 = var2 * 31.0F + this.field5183;
		float var4 = var3 * 31.0F + this.field5180;
		float var5 = var4 * 31.0F + this.field5181;
		float var6 = var5 * 31.0F + this.field5182;
		return (int) var6;
	}

	public String toString() {
		return this.field5183 + "," + this.field5180 + "," + this.field5181 + "," + this.field5182;
	}
}
