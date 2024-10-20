package deob;

@ObfuscatedName("eb")
public class class152 extends class163 {

    @ObfuscatedName("eb.f")
    public long field1959 = System.nanoTime();

    @ObfuscatedName("eb.f(B)V")
    public void method3019() {
        this.field1959 = System.nanoTime();
    }

    @ObfuscatedName("eb.h(III)I")
    public int method3015(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1959 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class194.method3013(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1959 < var7)) {
            var9++;
            this.field1959 += (long) arg0 * 1000000L;
        }
        if (this.field1959 < var7) {
            this.field1959 = var7;
        }
        return var9;
    }
}
