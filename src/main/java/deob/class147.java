package deob;

@ObfuscatedName("eo")
public class class147 extends class133 {

    @ObfuscatedName("eo.m")
    public long field2192 = System.nanoTime();

    @ObfuscatedName("eo.l(B)V")
    public void method2726() {
        this.field2192 = System.nanoTime();
    }

    @ObfuscatedName("eo.y(IIS)I")
    public int method2721(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2192 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method3199(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2192 < var7)) {
            var9++;
            this.field2192 += (long) arg0 * 1000000L;
        }
        if (this.field2192 < var7) {
            this.field2192 = var7;
        }
        return var9;
    }
}
