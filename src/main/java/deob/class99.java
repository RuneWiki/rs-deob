package deob;

@ObfuscatedName("co")
public class class99 extends class110 {

    @ObfuscatedName("co.n")
    public long field1634 = System.nanoTime();

    @ObfuscatedName("co.n(I)V")
    public void method1840() {
        this.field1634 = System.nanoTime();
    }

    @ObfuscatedName("co.d(III)I")
    public int method1841(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1634 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        Statics.method13(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1634 < var7)) {
            var9++;
            this.field1634 += (long) arg0 * 1000000L;
        }
        if (this.field1634 < var7) {
            this.field1634 = var7;
        }
        return var9;
    }
}
