package deob;

@ObfuscatedName("cw")
public class class81 extends class68 {

    @ObfuscatedName("cw.t")
    public long field1462 = System.nanoTime();

    @ObfuscatedName("cw.t(I)V")
    public void method1366() {
        this.field1462 = System.nanoTime();
    }

    @ObfuscatedName("cw.l(III)I")
    public int method1361(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1462 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method3086(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1462 < var7)) {
            var9++;
            this.field1462 += (long) arg0 * 1000000L;
        }
        if (this.field1462 < var7) {
            this.field1462 = var7;
        }
        return var9;
    }
}
