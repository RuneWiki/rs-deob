package deob;

@ObfuscatedName("ej")
public class class138 extends class124 {

    @ObfuscatedName("ej.v")
    public long field2083 = System.nanoTime();

    @ObfuscatedName("ej.t(B)V")
    public void method2497() {
        this.field2083 = System.nanoTime();
    }

    @ObfuscatedName("ej.f(IIS)I")
    public int method2492(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2083 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class118.method2729(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2083 < var7)) {
            var9++;
            this.field2083 += (long) arg0 * 1000000L;
        }
        if (this.field2083 < var7) {
            this.field2083 = var7;
        }
        return var9;
    }
}
