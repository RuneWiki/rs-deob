package deob;

@ObfuscatedName("ch")
public class class80 extends class67 {

    @ObfuscatedName("ch.v")
    public long field1409 = System.nanoTime();

    @ObfuscatedName("ch.v(B)V")
    public void method1373() {
        this.field1409 = System.nanoTime();
    }

    @ObfuscatedName("ch.f(IIB)I")
    public int method1374(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1409 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class125.method2683(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1409 < var7)) {
            var9++;
            this.field1409 += (long) arg0 * 1000000L;
        }
        if (this.field1409 < var7) {
            this.field1409 = var7;
        }
        return var9;
    }
}
