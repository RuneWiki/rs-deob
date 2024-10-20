package deob;

@ObfuscatedName("el")
public class class155 extends class168 {

    @ObfuscatedName("el.c")
    public long field1733 = System.nanoTime();

    @ObfuscatedName("el.c(I)V")
    public void method3000() {
        this.field1733 = System.nanoTime();
    }

    @ObfuscatedName("el.p(IIB)I")
    public int method2998(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1733 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class272.method406(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1733 < var7)) {
            var9++;
            this.field1733 += (long) arg0 * 1000000L;
        }
        if (this.field1733 < var7) {
            this.field1733 = var7;
        }
        return var9;
    }
}
