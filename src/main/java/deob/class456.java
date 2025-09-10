package deob;

@ObfuscatedName("ra")
public class class456 {

	@ObfuscatedName("ra.af")
	public float field5202;

	@ObfuscatedName("ra.aw")
	public float field5192;

	@ObfuscatedName("ra.at")
	public float field5193;

	@ObfuscatedName("ra.ac")
	public float field5191;

	@ObfuscatedName("ra.ap")
	public float field5195;

	@ObfuscatedName("ra.aq")
	public float field5196;

	@ObfuscatedName("ra.ao")
	public float field5197;

	@ObfuscatedName("ra.as")
	public float field5198;

	@ObfuscatedName("ra.al")
	public float field5199;

	@ObfuscatedName("ra.au")
	public float field5200;

	@ObfuscatedName("ra.ai")
	public float field5201;

	@ObfuscatedName("ra.aa")
	public float field5194;

	static {
		new class456();
	}

	public class456() {
		this.method8537();
	}

	@ObfuscatedName("ra.af(I)V")
	public void method8537() {
		this.field5194 = 0.0F;
		this.field5201 = 0.0F;
		this.field5200 = 0.0F;
		this.field5198 = 0.0F;
		this.field5197 = 0.0F;
		this.field5196 = 0.0F;
		this.field5191 = 0.0F;
		this.field5193 = 0.0F;
		this.field5192 = 0.0F;
		this.field5199 = 1.0F;
		this.field5195 = 1.0F;
		this.field5202 = 1.0F;
	}

	@ObfuscatedName("ra.aw(FB)V")
	public void method8525(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.field5192;
		float var5 = this.field5195;
		float var6 = this.field5198;
		float var7 = this.field5201;
		this.field5192 = var2 * var4 - this.field5193 * var3;
		this.field5193 = this.field5193 * var2 + var3 * var4;
		this.field5195 = var2 * var5 - this.field5196 * var3;
		this.field5196 = this.field5196 * var2 + var3 * var5;
		this.field5198 = var2 * var6 - this.field5199 * var3;
		this.field5199 = this.field5199 * var2 + var3 * var6;
		this.field5201 = var2 * var7 - this.field5194 * var3;
		this.field5194 = this.field5194 * var2 + var3 * var7;
	}

	@ObfuscatedName("ra.at(FS)V")
	public void method8526(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.field5202;
		float var5 = this.field5191;
		float var6 = this.field5197;
		float var7 = this.field5200;
		this.field5202 = this.field5193 * var3 + var2 * var4;
		this.field5193 = this.field5193 * var2 - var3 * var4;
		this.field5191 = this.field5196 * var3 + var2 * var5;
		this.field5196 = this.field5196 * var2 - var3 * var5;
		this.field5197 = this.field5199 * var3 + var2 * var6;
		this.field5199 = this.field5199 * var2 - var3 * var6;
		this.field5200 = this.field5194 * var3 + var2 * var7;
		this.field5194 = this.field5194 * var2 - var3 * var7;
	}

	@ObfuscatedName("ra.ac(FB)V")
	public void method8527(float arg0) {
		float var2 = (float) Math.cos((double) arg0);
		float var3 = (float) Math.sin((double) arg0);
		float var4 = this.field5202;
		float var5 = this.field5191;
		float var6 = this.field5197;
		float var7 = this.field5200;
		this.field5202 = var2 * var4 - this.field5192 * var3;
		this.field5192 = this.field5192 * var2 + var3 * var4;
		this.field5191 = var2 * var5 - this.field5195 * var3;
		this.field5195 = this.field5195 * var2 + var3 * var5;
		this.field5197 = var2 * var6 - this.field5198 * var3;
		this.field5198 = this.field5198 * var2 + var3 * var6;
		this.field5200 = var2 * var7 - this.field5201 * var3;
		this.field5201 = this.field5201 * var2 + var3 * var7;
	}

	@ObfuscatedName("ra.ap(FFFB)V")
	public void method8541(float arg0, float arg1, float arg2) {
		this.field5200 += arg0;
		this.field5201 += arg1;
		this.field5194 += arg2;
	}

	public String toString() {
		return this.field5202 + "," + this.field5191 + "," + this.field5197 + "," + this.field5200 + "\n" + this.field5192 + "," + this.field5195 + "," + this.field5198 + "," + this.field5201 + "\n" + this.field5193 + "," + this.field5196 + "," + this.field5199 + "," + this.field5194;
	}
}
