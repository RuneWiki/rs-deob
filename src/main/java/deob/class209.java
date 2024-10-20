package deob;

@ObfuscatedName("is")
public class class209 extends class226 {

    @ObfuscatedName("is.aq")
    public long field2294 = System.nanoTime();

    @ObfuscatedName("is.aq(I)V")
    public void method3776() {
        this.field2294 = System.nanoTime();
    }

    @ObfuscatedName("is.aw(IIB)I")
    public int method3777(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2294 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class319.method3040(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2294 < var7)) {
            var9++;
            this.field2294 += (long) arg0 * 1000000L;
        }
        if (this.field2294 < var7) {
            this.field2294 = var7;
        }
        return var9;
    }
}
