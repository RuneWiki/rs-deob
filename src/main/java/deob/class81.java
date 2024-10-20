package deob;

@ObfuscatedName("ci")
public class class81 extends class68 {

    @ObfuscatedName("ci.a")
    public long field1396 = System.nanoTime();

    @ObfuscatedName("ci.a(I)V")
    public void method1283() {
        this.field1396 = System.nanoTime();
    }

    @ObfuscatedName("ci.r(III)I")
    public int method1281(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1396 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method1598(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1396 < var7)) {
            var9++;
            this.field1396 += (long) arg0 * 1000000L;
        }
        if (this.field1396 < var7) {
            this.field1396 = var7;
        }
        return var9;
    }
}
