package deob;

@ObfuscatedName("fk")
public class class157 extends class168 {

    @ObfuscatedName("fk.n")
    public long field1996 = System.nanoTime();

    @ObfuscatedName("fk.n(I)V")
    public void method3211() {
        this.field1996 = System.nanoTime();
    }

    @ObfuscatedName("fk.h(IIB)I")
    public int method3210(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1996 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class199.method3065(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1996 < var7)) {
            var9++;
            this.field1996 += (long) arg0 * 1000000L;
        }
        if (this.field1996 < var7) {
            this.field1996 = var7;
        }
        return var9;
    }
}
