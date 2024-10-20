package deob;

@ObfuscatedName("gy")
public class class169 extends class183 {

    @ObfuscatedName("gy.aw")
    public long field1801 = System.nanoTime();

    @ObfuscatedName("gy.aw(I)V")
    public void method3120() {
        this.field1801 = System.nanoTime();
    }

    @ObfuscatedName("gy.ay(IIB)I")
    public int method3121(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1801 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class304.method173(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1801 < var7)) {
            var9++;
            this.field1801 += (long) arg0 * 1000000L;
        }
        if (this.field1801 < var7) {
            this.field1801 = var7;
        }
        return var9;
    }
}
