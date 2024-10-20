package deob;

@ObfuscatedName("ck")
public class class81 extends class68 {

    @ObfuscatedName("ck.l")
    public long field1405 = System.nanoTime();

    @ObfuscatedName("ck.l(B)V")
    public void method1360() {
        this.field1405 = System.nanoTime();
    }

    @ObfuscatedName("ck.b(III)I")
    public int method1374(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1405 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method46(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1405 < var7)) {
            var9++;
            this.field1405 += (long) arg0 * 1000000L;
        }
        if (this.field1405 < var7) {
            this.field1405 = var7;
        }
        return var9;
    }
}
