package deob;

@ObfuscatedName("tt")
public class class509 extends class508 {

	@ObfuscatedName("tt.af")
	public static final int field5440 = client.field363 + 3;

	@ObfuscatedName("tt.aw")
	public final class280 field5438 = new class280();

	@ObfuscatedName("tt.at")
	public final class280 field5439 = new class280();

	@ObfuscatedName("tt.ac")
	public int field5441 = 0;

	@ObfuscatedName("tt.ap")
	public int field5437 = 0;

	@ObfuscatedName("tt.aw(Lky;Ltn;II)V")
	public void method9401(class280 arg0, class507 arg1, int arg2) {
		this.field5438.method5837(arg0);
		this.field5439.method5837(arg1.field5435);
		this.field5441 = arg2 - 1;
		this.field5437 = field5440 + arg1.field5434;
	}

	@ObfuscatedName("tt.at(Lky;III)Z")
	public boolean method9406(class280 arg0, int arg1, int arg2) {
		if (this.field5441 >= this.field5437) {
			arg0.method5837(this.field5439);
			return true;
		}
		float var4 = class508.method501(arg1, this.field5441, this.field5437);
		class280 var5 = this.field5438;
		class280 var6 = this.field5439;
		float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
		int var10 = var6.method5831() - var5.method5831();
		int var11 = var6.method5833() - var5.method5833();
		int var12 = (int) ((float) var10 * var8);
		int var13 = (int) ((float) var11 * var8);
		arg0.method5830(var5.method5831() + var12, var5.method5833() + var13);
		int var14 = class537.method3777(var5.method5844(), var6.method5844());
		int var15 = (int) ((float) var14 * var8);
		arg0.method5841(var5.method5844() + var15);
		return var4 >= 1.0F;
	}

	@ObfuscatedName("tt.ac(III)V")
	public void method9403(int arg0, int arg1) {
		this.field5438.method5840(arg0, arg1);
		this.field5439.method5840(arg0, arg1);
	}
}
