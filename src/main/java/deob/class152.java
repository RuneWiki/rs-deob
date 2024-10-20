package deob;

@ObfuscatedName("eu")
public class class152 extends class160 {

    @ObfuscatedName("eu.j")
    public long field2208 = System.nanoTime();

    @ObfuscatedName("eu.j(B)V")
    public void method2686() {
        this.field2208 = System.nanoTime();
    }

    @ObfuscatedName("eu.h(III)I")
    public int method2693(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2208 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class183.method40(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2208 < var7)) {
            var9++;
            this.field2208 += (long) arg0 * 1000000L;
        }
        if (this.field2208 < var7) {
            this.field2208 = var7;
        }
        return var9;
    }
}
