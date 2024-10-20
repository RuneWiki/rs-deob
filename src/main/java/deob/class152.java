package deob;

@ObfuscatedName("ek")
public class class152 extends class160 {

    @ObfuscatedName("ek.m")
    public long field2123 = System.nanoTime();

    @ObfuscatedName("ek.m(B)V")
    public void method2778() {
        this.field2123 = System.nanoTime();
    }

    @ObfuscatedName("ek.p(III)I")
    public int method2779(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2123 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class189.method1011(var5 / 1000000L);
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
