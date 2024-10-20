package deob;

@ObfuscatedName("ce")
public class class81 extends class68 {

    @ObfuscatedName("ce.f")
    public long field1409 = System.nanoTime();

    @ObfuscatedName("ce.f(I)V")
    public void method1369() {
        this.field1409 = System.nanoTime();
    }

    @ObfuscatedName("ce.t(III)I")
    public int method1372(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1409 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method815(var5 / 1000000L);
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
