package deob;

@ObfuscatedName("ee")
public class class152 extends class160 {

    @ObfuscatedName("ee.b")
    public long field2111 = System.nanoTime();

    @ObfuscatedName("ee.b(S)V")
    public void method2709() {
        this.field2111 = System.nanoTime();
    }

    @ObfuscatedName("ee.s(III)I")
    public int method2706(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2111 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class189.method2888(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2111 < var7)) {
            var9++;
            this.field2111 += (long) arg0 * 1000000L;
        }
        if (this.field2111 < var7) {
            this.field2111 = var7;
        }
        return var9;
    }
}
