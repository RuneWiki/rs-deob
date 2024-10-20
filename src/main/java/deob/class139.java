package deob;

@ObfuscatedName("ee")
public class class139 extends class125 {

    @ObfuscatedName("ee.n")
    public long field2123 = System.nanoTime();

    @ObfuscatedName("ee.d(I)V")
    public void method2589() {
        this.field2123 = System.nanoTime();
    }

    @ObfuscatedName("ee.z(IIB)I")
    public int method2590(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2123 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method3147(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2123 < var7)) {
            var9++;
            this.field2123 += (long) arg0 * 1000000L;
        }
        if (this.field2123 < var7) {
            this.field2123 = var7;
        }
        return var9;
    }
}
