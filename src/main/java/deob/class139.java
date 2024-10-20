package deob;

@ObfuscatedName("ee")
public class class139 extends class125 {

    @ObfuscatedName("ee.o")
    public long field2110 = System.nanoTime();

    @ObfuscatedName("ee.l(B)V")
    public void method2586() {
        this.field2110 = System.nanoTime();
    }

    @ObfuscatedName("ee.g(III)I")
    public int method2581(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2110 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        Statics.method832(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2110 < var7)) {
            var9++;
            this.field2110 += (long) arg0 * 1000000L;
        }
        if (this.field2110 < var7) {
            this.field2110 = var7;
        }
        return var9;
    }
}
