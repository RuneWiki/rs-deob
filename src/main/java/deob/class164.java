package deob;

@ObfuscatedName("fz")
public class class164 extends class171 {

    @ObfuscatedName("fz.c")
    public long field2008 = System.nanoTime();

    @ObfuscatedName("fz.c(B)V")
    public void method3223() {
        this.field2008 = System.nanoTime();
    }

    @ObfuscatedName("fz.t(III)I")
    public int method3222(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2008 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class299.method4884(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2008 < var7)) {
            var9++;
            this.field2008 += (long) arg0 * 1000000L;
        }
        if (this.field2008 < var7) {
            this.field2008 = var7;
        }
        return var9;
    }
}
