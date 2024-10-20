package deob;

@ObfuscatedName("ep")
public class class151 extends class137 {

    @ObfuscatedName("ep.s")
    public long field2263 = System.nanoTime();

    @ObfuscatedName("ep.z(I)V")
    public void method2732() {
        this.field2263 = System.nanoTime();
    }

    @ObfuscatedName("ep.t(III)I")
    public int method2729(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2263 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method182(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2263 < var7)) {
            var9++;
            this.field2263 += (long) arg0 * 1000000L;
        }
        if (this.field2263 < var7) {
            this.field2263 = var7;
        }
        return var9;
    }
}
