package deob;

@ObfuscatedName("ck")
public class class81 extends class68 {

    @ObfuscatedName("ck.i")
    public long field1421 = System.nanoTime();

    @ObfuscatedName("ck.i(I)V")
    public void method1333() {
        this.field1421 = System.nanoTime();
    }

    @ObfuscatedName("ck.w(IIB)I")
    public int method1340(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1421 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method738(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1421 < var7)) {
            var9++;
            this.field1421 += (long) arg0 * 1000000L;
        }
        if (this.field1421 < var7) {
            this.field1421 = var7;
        }
        return var9;
    }
}
