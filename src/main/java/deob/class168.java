package deob;

@ObfuscatedName("gm")
public class class168 extends class182 {

    @ObfuscatedName("gm.at")
    public long field1791 = System.nanoTime();

    @ObfuscatedName("gm.at(I)V")
    public void method3100() {
        this.field1791 = System.nanoTime();
    }

    @ObfuscatedName("gm.an(IIB)I")
    public int method3101(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1791 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class302.method3997(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1791 < var7)) {
            var9++;
            this.field1791 += (long) arg0 * 1000000L;
        }
        if (this.field1791 < var7) {
            this.field1791 = var7;
        }
        return var9;
    }
}
