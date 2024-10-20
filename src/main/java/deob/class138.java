package deob;

@ObfuscatedName("em")
public class class138 extends class124 {

    @ObfuscatedName("em.b")
    public long field2090 = System.nanoTime();

    @ObfuscatedName("em.e(B)V")
    public void method2478() {
        this.field2090 = System.nanoTime();
    }

    @ObfuscatedName("em.i(III)I")
    public int method2473(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2090 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class118.method2490(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2090 < var7)) {
            var9++;
            this.field2090 += (long) arg0 * 1000000L;
        }
        if (this.field2090 < var7) {
            this.field2090 = var7;
        }
        return var9;
    }
}
