package deob;

@ObfuscatedName("ec")
public class class152 extends class160 {

    @ObfuscatedName("ec.c")
    public long field1684 = System.nanoTime();

    @ObfuscatedName("ec.c(I)V")
    public void method2737() {
        this.field1684 = System.nanoTime();
    }

    @ObfuscatedName("ec.l(IIB)I")
    public int method2738(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1684 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class263.method5249(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1684 < var7)) {
            var9++;
            this.field1684 += (long) arg0 * 1000000L;
        }
        if (this.field1684 < var7) {
            this.field1684 = var7;
        }
        return var9;
    }
}
