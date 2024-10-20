package deob;

@ObfuscatedName("ei")
public class class139 extends class125 {

    @ObfuscatedName("ei.p")
    public long field2126 = System.nanoTime();

    @ObfuscatedName("ei.p(I)V")
    public void method2519() {
        this.field2126 = System.nanoTime();
    }

    @ObfuscatedName("ei.k(III)I")
    public int method2518(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2126 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method1371(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2126 < var7)) {
            var9++;
            this.field2126 += (long) arg0 * 1000000L;
        }
        if (this.field2126 < var7) {
            this.field2126 = var7;
        }
        return var9;
    }
}
