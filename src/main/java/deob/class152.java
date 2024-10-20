package deob;

@ObfuscatedName("ek")
public class class152 extends class163 {

    @ObfuscatedName("ek.y")
    public long field1961 = System.nanoTime();

    @ObfuscatedName("ek.y(I)V")
    public void method2951() {
        this.field1961 = System.nanoTime();
    }

    @ObfuscatedName("ek.c(III)I")
    public int method2952(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1961 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class194.method1689(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1961 < var7)) {
            var9++;
            this.field1961 += (long) arg0 * 1000000L;
        }
        if (this.field1961 < var7) {
            this.field1961 = var7;
        }
        return var9;
    }
}
