package deob;

@ObfuscatedName("ec")
public class class147 extends class133 {

    @ObfuscatedName("ec.f")
    public long field2208 = System.nanoTime();

    @ObfuscatedName("ec.s(I)V")
    public void method2677() {
        this.field2208 = System.nanoTime();
    }

    @ObfuscatedName("ec.q(III)I")
    public int method2680(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2208 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method1962(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2208 < var7)) {
            var9++;
            this.field2208 += (long) arg0 * 1000000L;
        }
        if (this.field2208 < var7) {
            this.field2208 = var7;
        }
        return var9;
    }
}
