package deob;

@ObfuscatedName("cs")
public class class81 extends class68 {

    @ObfuscatedName("cs.p")
    public long field1429 = System.nanoTime();

    @ObfuscatedName("cs.p(I)V")
    public void method1368() {
        this.field1429 = System.nanoTime();
    }

    @ObfuscatedName("cs.e(III)I")
    public int method1376(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1429 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method47(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1429 < var7)) {
            var9++;
            this.field1429 += (long) arg0 * 1000000L;
        }
        if (this.field1429 < var7) {
            this.field1429 = var7;
        }
        return var9;
    }
}
