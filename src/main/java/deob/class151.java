package deob;

@ObfuscatedName("ey")
public class class151 extends class159 {

    @ObfuscatedName("ey.d")
    public long field2216 = System.nanoTime();

    @ObfuscatedName("ey.d(B)V")
    public void method2747() {
        this.field2216 = System.nanoTime();
    }

    @ObfuscatedName("ey.k(III)I")
    public int method2741(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2216 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method3711(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2216 < var7)) {
            var9++;
            this.field2216 += (long) arg0 * 1000000L;
        }
        if (this.field2216 < var7) {
            this.field2216 = var7;
        }
        return var9;
    }
}
