package deob;

@ObfuscatedName("ec")
public class class138 extends class124 {

    @ObfuscatedName("ec.a")
    public long field2102 = System.nanoTime();

    @ObfuscatedName("ec.v(B)V")
    public void method2459() {
        this.field2102 = System.nanoTime();
    }

    @ObfuscatedName("ec.i(III)I")
    public int method2453(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2102 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class118.method2072(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2102 < var7)) {
            var9++;
            this.field2102 += (long) arg0 * 1000000L;
        }
        if (this.field2102 < var7) {
            this.field2102 = var7;
        }
        return var9;
    }
}
