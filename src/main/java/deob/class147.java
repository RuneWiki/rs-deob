package deob;

@ObfuscatedName("ek")
public class class147 extends class133 {

    @ObfuscatedName("ek.i")
    public long field2202 = System.nanoTime();

    @ObfuscatedName("ek.v(I)V")
    public void method2672() {
        this.field2202 = System.nanoTime();
    }

    @ObfuscatedName("ek.r(III)I")
    public int method2673(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2202 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method731(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2202 < var7)) {
            var9++;
            this.field2202 += (long) arg0 * 1000000L;
        }
        if (this.field2202 < var7) {
            this.field2202 = var7;
        }
        return var9;
    }
}
