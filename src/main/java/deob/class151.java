package deob;

@ObfuscatedName("eh")
public class class151 extends class159 {

    @ObfuscatedName("eh.d")
    public long field2180 = System.nanoTime();

    @ObfuscatedName("eh.d(B)V")
    public void method2668() {
        this.field2180 = System.nanoTime();
    }

    @ObfuscatedName("eh.q(III)I")
    public int method2669(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2180 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method2253(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2180 < var7)) {
            var9++;
            this.field2180 += (long) arg0 * 1000000L;
        }
        if (this.field2180 < var7) {
            this.field2180 = var7;
        }
        return var9;
    }
}
