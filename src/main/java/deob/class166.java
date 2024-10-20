package deob;

@ObfuscatedName("gy")
public class class166 extends class180 {

    @ObfuscatedName("gy.aj")
    public long field1782 = System.nanoTime();

    @ObfuscatedName("gy.aj(I)V")
    public void method3089() {
        this.field1782 = System.nanoTime();
    }

    @ObfuscatedName("gy.al(III)I")
    public int method3095(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1782 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class291.method1994(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1782 < var7)) {
            var9++;
            this.field1782 += (long) arg0 * 1000000L;
        }
        if (this.field1782 < var7) {
            this.field1782 = var7;
        }
        return var9;
    }
}
