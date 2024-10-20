package deob;

@ObfuscatedName("ej")
public class class142 extends class150 {

    @ObfuscatedName("ej.n")
    public long field1540 = System.nanoTime();

    @ObfuscatedName("ej.n(I)V")
    public void method2502() {
        this.field1540 = System.nanoTime();
    }

    @ObfuscatedName("ej.c(III)I")
    public int method2503(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1540 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class398.method4655(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1540 < var7)) {
            var9++;
            this.field1540 += (long) arg0 * 1000000L;
        }
        if (this.field1540 < var7) {
            this.field1540 = var7;
        }
        return var9;
    }
}
