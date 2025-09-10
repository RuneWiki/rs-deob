package deob;

@ObfuscatedName("kp")
public class class279 {

	@ObfuscatedName("kp.af")
	public final int[][] field3266;

	@ObfuscatedName("kp.aw")
	public final int[][] field3264;

	@ObfuscatedName("kp.at")
	public final int[] field3265;

	@ObfuscatedName("kp.ac")
	public final int[] field3267;

	@ObfuscatedName("kp.ap")
	public final int field3268;

	@ObfuscatedName("kp.aq")
	public int field3263;

	@ObfuscatedName("kp.ao")
	public int field3269;

	public class279(int arg0, int arg1) {
		this.field3266 = new int[arg0][arg1];
		this.field3264 = new int[arg0][arg1];
		int var3 = arg0 * arg1;
		int var4 = class337.method3774(var3 / 4);
		this.field3265 = new int[var4];
		this.field3267 = new int[var4];
		this.field3268 = var4 - 1;
	}

	@ObfuscatedName("kp.af(I)V")
	public void method5819() {
		for (int var1 = 0; var1 < this.field3266.length; var1++) {
			for (int var2 = 0; var2 < this.field3266[var1].length; var2++) {
				this.field3266[var1][var2] = 0;
				this.field3264[var1][var2] = 99999999;
			}
		}
	}

	@ObfuscatedName("kp.aw(III)V")
	public void method5797(int arg0, int arg1) {
		this.field3263 = arg0;
		this.field3269 = arg1;
	}

	@ObfuscatedName("kp.at(B)I")
	public int method5796() {
		return this.field3263;
	}

	@ObfuscatedName("kp.ac(B)I")
	public int method5800() {
		return this.field3269;
	}

	@ObfuscatedName("kp.ap(I)I")
	public int method5801() {
		return this.field3266.length;
	}

	@ObfuscatedName("kp.aq(I)I")
	public int method5814() {
		return this.field3266[0].length;
	}

	@ObfuscatedName("kp.ao(I)[[I")
	public int[][] method5803() {
		return this.field3266;
	}

	@ObfuscatedName("kp.as(I)[[I")
	public int[][] method5804() {
		return this.field3264;
	}

	@ObfuscatedName("kp.al(I)[I")
	public int[] method5805() {
		return this.field3265;
	}

	@ObfuscatedName("kp.au(I)[I")
	public int[] method5806() {
		return this.field3267;
	}

	@ObfuscatedName("kp.ai(B)I")
	public int method5807() {
		return this.field3268;
	}
}
