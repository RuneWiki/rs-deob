package deob;

@ObfuscatedName("en")
public class class134 extends class120 {

    @ObfuscatedName("en.n")
    public long field2050 = System.nanoTime();

    @ObfuscatedName("en.n(I)V")
    public void method2425() {
        this.field2050 = System.nanoTime();
    }

    @ObfuscatedName("en.x(IIB)I")
    public int method2426(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2050 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method25(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2050 < var7)) {
            var9++;
            this.field2050 += (long) arg0 * 1000000L;
        }
        if (this.field2050 < var7) {
            this.field2050 = var7;
        }
        return var9;
    }
}
