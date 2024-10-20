package deob;

@ObfuscatedName("ed")
public class class148 extends class134 {

    @ObfuscatedName("ed.t")
    public long field2255 = System.nanoTime();

    @ObfuscatedName("ed.t(B)V")
    public void method2657() {
        this.field2255 = System.nanoTime();
    }

    @ObfuscatedName("ed.i(IIS)I")
    public int method2658(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2255 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class128.method894(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2255 < var7)) {
            var9++;
            this.field2255 += (long) arg0 * 1000000L;
        }
        if (this.field2255 < var7) {
            this.field2255 = var7;
        }
        return var9;
    }
}
