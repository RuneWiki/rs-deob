package deob;

@ObfuscatedName("ek")
public class class142 extends class150 {

    @ObfuscatedName("ek.l")
    public long field1545 = System.nanoTime();

    @ObfuscatedName("ek.l(I)V")
    public void method2542() {
        this.field1545 = System.nanoTime();
    }

    @ObfuscatedName("ek.q(III)I")
    public int method2543(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1545 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class399.method2395(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1545 < var7)) {
            var9++;
            this.field1545 += (long) arg0 * 1000000L;
        }
        if (this.field1545 < var7) {
            this.field1545 = var7;
        }
        return var9;
    }
}
