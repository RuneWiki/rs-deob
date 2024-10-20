package deob;

@ObfuscatedName("fp")
public class class162 extends class173 {

    @ObfuscatedName("fp.g")
    public long field2148 = System.nanoTime();

    @ObfuscatedName("fp.g(I)V")
    public void method3036() {
        this.field2148 = System.nanoTime();
    }

    @ObfuscatedName("fp.e(III)I")
    public int method3037(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2148 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class204.method48(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2148 < var7)) {
            var9++;
            this.field2148 += (long) arg0 * 1000000L;
        }
        if (this.field2148 < var7) {
            this.field2148 = var7;
        }
        return var9;
    }
}
