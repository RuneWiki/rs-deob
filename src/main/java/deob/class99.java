package deob;

@ObfuscatedName("cd")
public class class99 extends class110 {

    @ObfuscatedName("cd.b")
    public long field1631 = System.nanoTime();

    @ObfuscatedName("cd.b(B)V")
    public void method1871() {
        this.field1631 = System.nanoTime();
    }

    @ObfuscatedName("cd.e(IIB)I")
    public int method1873(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1631 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method2120(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1631 < var7)) {
            var9++;
            this.field1631 += (long) arg0 * 1000000L;
        }
        if (this.field1631 < var7) {
            this.field1631 = var7;
        }
        return var9;
    }
}
