package deob;

@ObfuscatedName("em")
public class class152 extends class163 {

    @ObfuscatedName("em.n")
    public long field2113 = System.nanoTime();

    @ObfuscatedName("em.n(I)V")
    public void method2743() {
        this.field2113 = System.nanoTime();
    }

    @ObfuscatedName("em.v(III)I")
    public int method2744(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2113 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class193.method980(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2113 < var7)) {
            var9++;
            this.field2113 += (long) arg0 * 1000000L;
        }
        if (this.field2113 < var7) {
            this.field2113 = var7;
        }
        return var9;
    }
}
