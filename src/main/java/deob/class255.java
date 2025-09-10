package deob;

@ObfuscatedName("ju")
public class class255 extends class272 {

	@ObfuscatedName("ju.af")
	public long field3064 = System.nanoTime();

	@ObfuscatedName("ju.af(I)V")
	public void method5414() {
		this.field3064 = System.nanoTime();
	}

	@ObfuscatedName("ju.aw(III)I")
	public int method5416(int arg0, int arg1) {
		long var3 = (long) arg1 * 1000000L;
		long var5 = this.field3064 - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}
		class336.method3770(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9 = 0;
		while (var9 < 10 && (var9 < 1 || this.field3064 < var7)) {
			var9++;
			this.field3064 += (long) arg0 * 1000000L;
		}
		if (this.field3064 < var7) {
			this.field3064 = var7;
		}
		return var9;
	}
}
