package deob;

@ObfuscatedName("ev")
public class class151 extends class159 {

    @ObfuscatedName("ev.p")
    public long field2213 = System.nanoTime();

    @ObfuscatedName("ev.p(I)V")
    public void method2594() {
        this.field2213 = System.nanoTime();
    }

    @ObfuscatedName("ev.m(III)I")
    public int method2596(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2213 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method2791(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2213 < var7)) {
            var9++;
            this.field2213 += (long) arg0 * 1000000L;
        }
        if (this.field2213 < var7) {
            this.field2213 = var7;
        }
        return var9;
    }
}
