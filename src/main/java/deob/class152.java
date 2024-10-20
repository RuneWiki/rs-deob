package deob;

@ObfuscatedName("ez")
public class class152 extends class163 {

    @ObfuscatedName("ez.f")
    public long field1975 = System.nanoTime();

    @ObfuscatedName("ez.f(I)V")
    public void method3030() {
        this.field1975 = System.nanoTime();
    }

    @ObfuscatedName("ez.l(III)I")
    public int method3031(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1975 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class194.method1752(var5 / 1000000L);
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
