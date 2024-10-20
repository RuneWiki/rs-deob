package deob;

@ObfuscatedName("ey")
public class class147 extends class133 {

    @ObfuscatedName("ey.o")
    public long field2209 = System.nanoTime();

    @ObfuscatedName("ey.o(I)V")
    public void method2625() {
        this.field2209 = System.nanoTime();
    }

    @ObfuscatedName("ey.f(III)I")
    public int method2626(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2209 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method16(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2209 < var7)) {
            var9++;
            this.field2209 += (long) arg0 * 1000000L;
        }
        if (this.field2209 < var7) {
            this.field2209 = var7;
        }
        return var9;
    }
}
