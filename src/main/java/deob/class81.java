package deob;

@ObfuscatedName("ct")
public class class81 extends class68 {

    @ObfuscatedName("ct.b")
    public long field1410 = System.nanoTime();

    @ObfuscatedName("ct.b(I)V")
    public void method1324() {
        this.field1410 = System.nanoTime();
    }

    @ObfuscatedName("ct.e(III)I")
    public int method1330(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1410 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method686(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1410 < var7)) {
            var9++;
            this.field1410 += (long) arg0 * 1000000L;
        }
        if (this.field1410 < var7) {
            this.field1410 = var7;
        }
        return var9;
    }
}
