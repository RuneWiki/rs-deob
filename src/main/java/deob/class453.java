package deob;

@ObfuscatedName("re")
public class class453 {

	@ObfuscatedName("re.af")
	public static final class453 field5175;

	@ObfuscatedName("re.aw")
	public static final class453 field5171;

	@ObfuscatedName("re.at")
	public static class453[] field5172;

	@ObfuscatedName("re.ac")
	public static int field5173;

	@ObfuscatedName("re.ap")
	public static int field5174;

	@ObfuscatedName("re.aq")
	public float field5176;

	@ObfuscatedName("re.ao")
	public float field5177;

	@ObfuscatedName("re.as")
	public float field5170;

	static {
		new class453(0.0F, 0.0F, 0.0F);
		new class453(1.0F, 1.0F, 1.0F);
		new class453(1.0F, 0.0F, 0.0F);
		field5175 = new class453(0.0F, 1.0F, 0.0F);
		new class453(0.0F, 0.0F, 1.0F);
		new class453(1.0F, 0.0F, 0.0F);
		new class453(-1.0F, 0.0F, 0.0F);
		new class453(0.0F, 0.0F, 1.0F);
		field5171 = new class453(0.0F, 0.0F, -1.0F);
		new class453(0.0F, 1.0F, 0.0F);
		new class453(0.0F, -1.0F, 0.0F);
		field5172 = new class453[0];
		field5173 = 16;
		field5172 = new class453[16];
		field5174 = 0;
	}

	public class453() {
	}

	public class453(float arg0, float arg1, float arg2) {
		this.field5176 = arg0;
		this.field5177 = arg1;
		this.field5170 = arg2;
	}

	public class453(class453 arg0) {
		this.field5176 = arg0.field5176;
		this.field5177 = arg0.field5177;
		this.field5170 = arg0.field5170;
	}

	@ObfuscatedName("lx.af(FFFI)Lre;")
	public static class453 method6269(float arg0, float arg1, float arg2) {
		class453[] var3 = field5172;
		synchronized (field5172) {
			if (field5174 == 0) {
				return new class453(arg0, arg1, arg2);
			} else {
				field5172[--field5174].method8337(arg0, arg1, arg2);
				return field5172[field5174];
			}
		}
	}

	@ObfuscatedName("ms.aw(Lre;I)Lre;")
	public static class453 method6495(class453 arg0) {
		class453[] var1 = field5172;
		synchronized (field5172) {
			if (field5174 == 0) {
				return new class453(arg0);
			} else {
				field5172[--field5174].method8362(arg0);
				return field5172[field5174];
			}
		}
	}

	@ObfuscatedName("ap.at(Lre;Lre;I)Lre;")
	public static final class453 method15(class453 arg0, class453 arg1) {
		class453 var2 = method6495(arg0);
		var2.method8341(arg1);
		return var2;
	}

	@ObfuscatedName("qr.ap(Lre;Lre;B)Lre;")
	public static final class453 method7886(class453 arg0, class453 arg1) {
		class453 var2 = method6495(arg0);
		var2.method8364(arg1);
		return var2;
	}

	@ObfuscatedName("re.aq(B)V")
	public void method8336() {
		class453[] var1 = field5172;
		synchronized (field5172) {
			if (field5174 < field5173) {
				field5172[++field5174 - 1] = this;
			}
		}
	}

	@ObfuscatedName("re.ao(FFFI)V")
	public void method8337(float arg0, float arg1, float arg2) {
		this.field5176 = arg0;
		this.field5177 = arg1;
		this.field5170 = arg2;
	}

	@ObfuscatedName("re.as(Lre;I)V")
	public void method8362(class453 arg0) {
		this.method8337(arg0.field5176, arg0.field5177, arg0.field5170);
	}

	@ObfuscatedName("re.al(B)V")
	public final void method8348() {
		this.field5170 = 0.0F;
		this.field5177 = 0.0F;
		this.field5176 = 0.0F;
	}

	@ObfuscatedName("re.au(Lre;I)Z")
	public boolean method8340(class453 arg0) {
		return this.field5176 == arg0.field5176 && this.field5177 == arg0.field5177 && this.field5170 == arg0.field5170;
	}

	@ObfuscatedName("re.ai(I)V")
	public final void method8386() {
		float var1 = 1.0F / this.method8346();
		this.field5176 *= var1;
		this.field5177 *= var1;
		this.field5170 *= var1;
	}

	@ObfuscatedName("re.aa(Lre;I)V")
	public final void method8341(class453 arg0) {
		this.field5176 += arg0.field5176;
		this.field5177 += arg0.field5177;
		this.field5170 += arg0.field5170;
	}

	@ObfuscatedName("re.am(FFFI)V")
	public final void method8350(float arg0, float arg1, float arg2) {
		this.field5176 += arg0;
		this.field5177 += arg1;
		this.field5170 += arg2;
	}

	@ObfuscatedName("re.an(Lre;B)V")
	public final void method8396(class453 arg0) {
		this.field5176 -= arg0.field5176;
		this.field5177 -= arg0.field5177;
		this.field5170 -= arg0.field5170;
	}

	@ObfuscatedName("re.ar(Lre;B)F")
	public final float method8343(class453 arg0) {
		return this.field5170 * arg0.field5170 + this.field5177 * arg0.field5177 + this.field5176 * arg0.field5176;
	}

	@ObfuscatedName("re.ae(Lre;I)V")
	public final void method8364(class453 arg0) {
		this.method8337(this.field5177 * arg0.field5170 - this.field5170 * arg0.field5177, this.field5170 * arg0.field5176 - this.field5176 * arg0.field5170, this.field5176 * arg0.field5177 - this.field5177 * arg0.field5176);
	}

	@ObfuscatedName("re.ay(I)F")
	public final float method8346() {
		return (float) Math.sqrt((double) (this.field5170 * this.field5170 + this.field5177 * this.field5177 + this.field5176 * this.field5176));
	}

	@ObfuscatedName("re.ad(FI)V")
	public final void method8347(float arg0) {
		this.field5176 *= arg0;
		this.field5177 *= arg0;
		this.field5170 *= arg0;
	}

	public String toString() {
		return this.field5176 + ", " + this.field5177 + ", " + this.field5170;
	}
}
