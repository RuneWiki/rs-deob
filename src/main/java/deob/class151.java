package deob;

@ObfuscatedName("ey")
public class class151 extends class162 {

    @ObfuscatedName("ey.s")
    public long field2202 = System.nanoTime();

    @ObfuscatedName("ey.s(B)V")
    public void method2711() {
        this.field2202 = System.nanoTime();
    }

    @ObfuscatedName("ey.c(III)I")
    public int method2712(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2202 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class185.method631(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2202 < var7)) {
            var9++;
            this.field2202 += (long) arg0 * 1000000L;
        }
        if (this.field2202 < var7) {
            this.field2202 = var7;
        }
        return var9;
    }
}
