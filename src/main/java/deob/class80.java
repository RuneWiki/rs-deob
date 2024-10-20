package deob;

@ObfuscatedName("cs")
public class class80 extends class67 {

    @ObfuscatedName("cs.p")
    public long field1424 = System.nanoTime();

    @ObfuscatedName("cs.p(I)V")
    public void method1303() {
        this.field1424 = System.nanoTime();
    }

    @ObfuscatedName("cs.j(IIB)I")
    public int method1304(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1424 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class125.method123(var5 / 1000000L);
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
