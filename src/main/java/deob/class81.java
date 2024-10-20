package deob;

@ObfuscatedName("cf")
public class class81 extends class68 {

    @ObfuscatedName("cf.d")
    public long field1424 = System.nanoTime();

    @ObfuscatedName("cf.d(B)V")
    public void method1311() {
        this.field1424 = System.nanoTime();
    }

    @ObfuscatedName("cf.g(III)I")
    public int method1310(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1424 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method112(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1424 < var7)) {
            var9++;
            this.field1424 += (long) arg0 * 1000000L;
        }
        if (this.field1424 < var7) {
            this.field1424 = var7;
        }
        return var9;
    }
}
