package deob;

@ObfuscatedName("fz")
public class class164 extends class171 {

    @ObfuscatedName("fz.c")
    public long field1982 = System.nanoTime();

    @ObfuscatedName("fz.c(I)V")
    public void method3183() {
        this.field1982 = System.nanoTime();
    }

    @ObfuscatedName("fz.x(III)I")
    public int method3185(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1982 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class298.method4811(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1982 < var7)) {
            var9++;
            this.field1982 += (long) arg0 * 1000000L;
        }
        if (this.field1982 < var7) {
            this.field1982 = var7;
        }
        return var9;
    }
}
