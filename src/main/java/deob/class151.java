package deob;

@ObfuscatedName("en")
public class class151 extends class137 {

    @ObfuscatedName("en.x")
    public long field2276 = System.nanoTime();

    @ObfuscatedName("en.x(I)V")
    public void method2748() {
        this.field2276 = System.nanoTime();
    }

    @ObfuscatedName("en.r(IIB)I")
    public int method2749(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2276 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method2672(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2276 < var7)) {
            var9++;
            this.field2276 += (long) arg0 * 1000000L;
        }
        if (this.field2276 < var7) {
            this.field2276 = var7;
        }
        return var9;
    }
}
