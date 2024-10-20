package deob;

@ObfuscatedName("cl")
public class class82 extends class69 {

    @ObfuscatedName("cl.e")
    public long field1424 = System.nanoTime();

    @ObfuscatedName("cl.e(I)V")
    public void method1402() {
        this.field1424 = System.nanoTime();
    }

    @ObfuscatedName("cl.i(III)I")
    public int method1399(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1424 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method2200(var5 / 1000000L);
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
