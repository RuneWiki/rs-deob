package deob;

@ObfuscatedName("fx")
public class class173 extends class180 {

    @ObfuscatedName("fx.f")
    public long field2039 = System.nanoTime();

    @ObfuscatedName("fx.f(I)V")
    public void method3274() {
        this.field2039 = System.nanoTime();
    }

    @ObfuscatedName("fx.b(III)I")
    public int method3280(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2039 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class309.method735(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2039 < var7)) {
            var9++;
            this.field2039 += (long) arg0 * 1000000L;
        }
        if (this.field2039 < var7) {
            this.field2039 = var7;
        }
        return var9;
    }
}
