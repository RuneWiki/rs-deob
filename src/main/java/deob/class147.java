package deob;

@ObfuscatedName("eu")
public class class147 extends class133 {

    @ObfuscatedName("eu.n")
    public long field2206 = System.nanoTime();

    @ObfuscatedName("eu.n(B)V")
    public void method2677() {
        this.field2206 = System.nanoTime();
    }

    @ObfuscatedName("eu.d(III)I")
    public int method2678(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2206 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method1160(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2206 < var7)) {
            var9++;
            this.field2206 += (long) arg0 * 1000000L;
        }
        if (this.field2206 < var7) {
            this.field2206 = var7;
        }
        return var9;
    }
}
