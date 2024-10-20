package deob;

@ObfuscatedName("cv")
public class class99 extends class110 {

    @ObfuscatedName("cv.d")
    public long field1630 = System.nanoTime();

    @ObfuscatedName("cv.d(B)V")
    public void method1824() {
        this.field1630 = System.nanoTime();
    }

    @ObfuscatedName("cv.c(IIB)I")
    public int method1826(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1630 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class138.method15(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1630 < var7)) {
            var9++;
            this.field1630 += (long) arg0 * 1000000L;
        }
        if (this.field1630 < var7) {
            this.field1630 = var7;
        }
        return var9;
    }
}
