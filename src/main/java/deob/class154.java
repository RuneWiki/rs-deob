package deob;

@ObfuscatedName("er")
public class class154 extends class167 {

    @ObfuscatedName("er.c")
    public long field1720 = System.nanoTime();

    @ObfuscatedName("er.c(I)V")
    public void method2871() {
        this.field1720 = System.nanoTime();
    }

    @ObfuscatedName("er.v(IIB)I")
    public int method2872(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1720 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class270.method1896(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1720 < var7)) {
            var9++;
            this.field1720 += (long) arg0 * 1000000L;
        }
        if (this.field1720 < var7) {
            this.field1720 = var7;
        }
        return var9;
    }
}
