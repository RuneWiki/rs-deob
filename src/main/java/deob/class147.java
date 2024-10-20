package deob;

@ObfuscatedName("ee")
public class class147 extends class133 {

    @ObfuscatedName("ee.d")
    public long field2196 = System.nanoTime();

    @ObfuscatedName("ee.p(I)V")
    public void method2713() {
        this.field2196 = System.nanoTime();
    }

    @ObfuscatedName("ee.v(IIB)I")
    public int method2715(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2196 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method724(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2196 < var7)) {
            var9++;
            this.field2196 += (long) arg0 * 1000000L;
        }
        if (this.field2196 < var7) {
            this.field2196 = var7;
        }
        return var9;
    }
}
