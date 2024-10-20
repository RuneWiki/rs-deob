package deob;

@ObfuscatedName("er")
public class class152 extends class160 {

    @ObfuscatedName("er.i")
    public long field2215 = System.nanoTime();

    @ObfuscatedName("er.i(B)V")
    public void method2749() {
        this.field2215 = System.nanoTime();
    }

    @ObfuscatedName("er.j(III)I")
    public int method2748(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2215 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        Statics.method1558(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2215 < var7)) {
            var9++;
            this.field2215 += (long) arg0 * 1000000L;
        }
        if (this.field2215 < var7) {
            this.field2215 = var7;
        }
        return var9;
    }
}
