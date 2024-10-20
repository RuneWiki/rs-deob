package deob;

@ObfuscatedName("cu")
public class class99 extends class110 {

    @ObfuscatedName("cu.f")
    public long field1663 = System.nanoTime();

    @ObfuscatedName("cu.f(I)V")
    public void method1855() {
        this.field1663 = System.nanoTime();
    }

    @ObfuscatedName("cu.i(III)I")
    public int method1856(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1663 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method2141(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1663 < var7)) {
            var9++;
            this.field1663 += (long) arg0 * 1000000L;
        }
        if (this.field1663 < var7) {
            this.field1663 = var7;
        }
        return var9;
    }
}
