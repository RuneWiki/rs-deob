package deob;

@ObfuscatedName("ea")
public class class152 extends class163 {

    @ObfuscatedName("ea.c")
    public long field1975 = System.nanoTime();

    @ObfuscatedName("ea.c(I)V")
    public void method2950() {
        this.field1975 = System.nanoTime();
    }

    @ObfuscatedName("ea.q(III)I")
    public int method2955(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1975 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class194.method672(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1975 < var7)) {
            var9++;
            this.field1975 += (long) arg0 * 1000000L;
        }
        if (this.field1975 < var7) {
            this.field1975 = var7;
        }
        return var9;
    }
}
