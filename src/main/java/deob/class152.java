package deob;

@ObfuscatedName("ek")
public class class152 extends class163 {

    @ObfuscatedName("ek.g")
    public long field1976 = System.nanoTime();

    @ObfuscatedName("ek.g(I)V")
    public void method3147() {
        this.field1976 = System.nanoTime();
    }

    @ObfuscatedName("ek.r(III)I")
    public int method3148(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1976 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class194.method4976(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1976 < var7)) {
            var9++;
            this.field1976 += (long) arg0 * 1000000L;
        }
        if (this.field1976 < var7) {
            this.field1976 = var7;
        }
        return var9;
    }
}
