package deob;

@ObfuscatedName("ea")
public class class151 extends class137 {

    @ObfuscatedName("ea.i")
    public long field2272 = System.nanoTime();

    @ObfuscatedName("ea.h(B)V")
    public void method2746() {
        this.field2272 = System.nanoTime();
    }

    @ObfuscatedName("ea.e(III)I")
    public int method2738(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2272 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method3297(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2272 < var7)) {
            var9++;
            this.field2272 += (long) arg0 * 1000000L;
        }
        if (this.field2272 < var7) {
            this.field2272 = var7;
        }
        return var9;
    }
}
