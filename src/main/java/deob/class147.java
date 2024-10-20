package deob;

@ObfuscatedName("eu")
public class class147 extends class133 {

    @ObfuscatedName("eu.h")
    public long field2220 = System.nanoTime();

    @ObfuscatedName("eu.h(I)V")
    public void method2663() {
        this.field2220 = System.nanoTime();
    }

    @ObfuscatedName("eu.m(III)I")
    public int method2659(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2220 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method952(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2220 < var7)) {
            var9++;
            this.field2220 += (long) arg0 * 1000000L;
        }
        if (this.field2220 < var7) {
            this.field2220 = var7;
        }
        return var9;
    }
}
