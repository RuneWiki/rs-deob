package deob;

@ObfuscatedName("ez")
public class class147 extends class133 {

    @ObfuscatedName("ez.i")
    public long field2213 = System.nanoTime();

    @ObfuscatedName("ez.v(I)V")
    public void method2640() {
        this.field2213 = System.nanoTime();
    }

    @ObfuscatedName("ez.f(III)I")
    public int method2643(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2213 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method848(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2213 < var7)) {
            var9++;
            this.field2213 += (long) arg0 * 1000000L;
        }
        if (this.field2213 < var7) {
            this.field2213 = var7;
        }
        return var9;
    }
}
