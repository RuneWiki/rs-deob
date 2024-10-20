package deob;

@ObfuscatedName("cb")
public class class80 extends class67 {

    @ObfuscatedName("cb.g")
    public long field1413 = System.nanoTime();

    @ObfuscatedName("cb.g(B)V")
    public void method1335() {
        this.field1413 = System.nanoTime();
    }

    @ObfuscatedName("cb.e(III)I")
    public int method1338(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1413 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class125.method2058(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1413 < var7)) {
            var9++;
            this.field1413 += (long) arg0 * 1000000L;
        }
        if (this.field1413 < var7) {
            this.field1413 = var7;
        }
        return var9;
    }
}
