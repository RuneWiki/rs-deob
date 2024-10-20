package deob;

@ObfuscatedName("ft")
public class class164 extends class171 {

    @ObfuscatedName("ft.q")
    public long field2011 = System.nanoTime();

    @ObfuscatedName("ft.q(I)V")
    public void method3163() {
        this.field2011 = System.nanoTime();
    }

    @ObfuscatedName("ft.w(III)I")
    public int method3165(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2011 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class299.method4167(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2011 < var7)) {
            var9++;
            this.field2011 += (long) arg0 * 1000000L;
        }
        if (this.field2011 < var7) {
            this.field2011 = var7;
        }
        return var9;
    }
}
