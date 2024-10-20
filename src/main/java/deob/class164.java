package deob;

@ObfuscatedName("fz")
public class class164 extends class171 {

    @ObfuscatedName("fz.u")
    public long field2017 = System.nanoTime();

    @ObfuscatedName("fz.u(I)V")
    public void method3196() {
        this.field2017 = System.nanoTime();
    }

    @ObfuscatedName("fz.f(IIB)I")
    public int method3197(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2017 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        long var7 = var5 / 1000000L;
        if (var7 > 0L) {
            if (var7 % 10L == 0L) {
                long var9 = var7 - 1L;
                try {
                    Thread.sleep(var9);
                } catch (InterruptedException var19) {
                }
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var18) {
                }
            } else {
                try {
                    Thread.sleep(var7);
                } catch (InterruptedException var17) {
                }
            }
        }
        long var14 = System.nanoTime();
        int var16 = 0;
        while (var16 < 10 && (var16 < 1 || this.field2017 < var14)) {
            var16++;
            this.field2017 += (long) arg0 * 1000000L;
        }
        if (this.field2017 < var14) {
            this.field2017 = var14;
        }
        return var16;
    }
}
