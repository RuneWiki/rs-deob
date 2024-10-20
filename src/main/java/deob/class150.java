package deob;

@ObfuscatedName("eu")
public class class150 extends class161 {

    @ObfuscatedName("eu.w")
    public long field1941 = System.nanoTime();

    @ObfuscatedName("eu.w(I)V")
    public void method2972() {
        this.field1941 = System.nanoTime();
    }

    @ObfuscatedName("eu.m(III)I")
    public int method2974(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1941 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class192.method196(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1941 < var7)) {
            var9++;
            this.field1941 += (long) arg0 * 1000000L;
        }
        if (this.field1941 < var7) {
            this.field1941 = var7;
        }
        return var9;
    }
}
