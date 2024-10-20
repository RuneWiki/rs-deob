package deob;

@ObfuscatedName("fx")
public class class173 extends class180 {

    @ObfuscatedName("fx.n")
    public long field2026 = System.nanoTime();

    @ObfuscatedName("fx.n(B)V")
    public void method3365() {
        this.field2026 = System.nanoTime();
    }

    @ObfuscatedName("fx.v(III)I")
    public int method3360(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2026 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class309.method1173(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2026 < var7)) {
            var9++;
            this.field2026 += (long) arg0 * 1000000L;
        }
        if (this.field2026 < var7) {
            this.field2026 = var7;
        }
        return var9;
    }
}
