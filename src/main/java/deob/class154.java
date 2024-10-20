package deob;

@ObfuscatedName("eu")
public class class154 extends class168 {

    @ObfuscatedName("eu.o")
    public long field1737 = System.nanoTime();

    @ObfuscatedName("eu.o(I)V")
    public void method2789() {
        this.field1737 = System.nanoTime();
    }

    @ObfuscatedName("eu.q(III)I")
    public int method2790(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1737 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class271.method4446(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1737 < var7)) {
            var9++;
            this.field1737 += (long) arg0 * 1000000L;
        }
        if (this.field1737 < var7) {
            this.field1737 = var7;
        }
        return var9;
    }
}
