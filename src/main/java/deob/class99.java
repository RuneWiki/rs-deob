package deob;

@ObfuscatedName("cl")
public class class99 extends class110 {

    @ObfuscatedName("cl.i")
    public long field1626 = System.nanoTime();

    @ObfuscatedName("cl.i(I)V")
    public void method1796() {
        this.field1626 = System.nanoTime();
    }

    @ObfuscatedName("cl.e(IIB)I")
    public int method1797(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1626 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method150(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1626 < var7)) {
            var9++;
            this.field1626 += (long) arg0 * 1000000L;
        }
        if (this.field1626 < var7) {
            this.field1626 = var7;
        }
        return var9;
    }
}
