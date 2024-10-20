package deob;

@ObfuscatedName("em")
public class class147 extends class133 {

    @ObfuscatedName("em.l")
    public long field2220 = System.nanoTime();

    @ObfuscatedName("em.e(I)V")
    public void method2700() {
        this.field2220 = System.nanoTime();
    }

    @ObfuscatedName("em.q(IIB)I")
    public int method2701(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2220 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method2667(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2220 < var7)) {
            var9++;
            this.field2220 += (long) arg0 * 1000000L;
        }
        if (this.field2220 < var7) {
            this.field2220 = var7;
        }
        return var9;
    }
}
