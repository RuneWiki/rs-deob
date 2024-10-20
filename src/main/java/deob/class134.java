package deob;

@ObfuscatedName("ef")
public class class134 extends class120 {

    @ObfuscatedName("ef.k")
    public long field2078 = System.nanoTime();

    @ObfuscatedName("ef.b(I)V")
    public void method2439() {
        this.field2078 = System.nanoTime();
    }

    @ObfuscatedName("ef.e(III)I")
    public int method2437(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2078 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method500(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2078 < var7)) {
            var9++;
            this.field2078 += (long) arg0 * 1000000L;
        }
        if (this.field2078 < var7) {
            this.field2078 = var7;
        }
        return var9;
    }
}
