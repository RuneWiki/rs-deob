package deob;

@ObfuscatedName("fu")
public class class162 extends class173 {

    @ObfuscatedName("fu.d")
    public long field2152 = System.nanoTime();

    @ObfuscatedName("fu.d(I)V")
    public void method2990() {
        this.field2152 = System.nanoTime();
    }

    @ObfuscatedName("fu.z(III)I")
    public int method2991(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2152 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class204.method3573(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2152 < var7)) {
            var9++;
            this.field2152 += (long) arg0 * 1000000L;
        }
        if (this.field2152 < var7) {
            this.field2152 = var7;
        }
        return var9;
    }
}
