package deob;

@ObfuscatedName("cf")
public class class81 extends class68 {

    @ObfuscatedName("cf.c")
    public long field1438 = System.nanoTime();

    @ObfuscatedName("cf.c(B)V")
    public void method1295() {
        this.field1438 = System.nanoTime();
    }

    @ObfuscatedName("cf.q(III)I")
    public int method1294(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1438 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method577(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1438 < var7)) {
            var9++;
            this.field1438 += (long) arg0 * 1000000L;
        }
        if (this.field1438 < var7) {
            this.field1438 = var7;
        }
        return var9;
    }
}
