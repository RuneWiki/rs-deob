package deob;

@ObfuscatedName("en")
public class class151 extends class137 {

    @ObfuscatedName("en.m")
    public long field2284 = System.nanoTime();

    @ObfuscatedName("en.m(B)V")
    public void method2741() {
        this.field2284 = System.nanoTime();
    }

    @ObfuscatedName("en.w(III)I")
    public int method2742(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2284 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method2828(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2284 < var7)) {
            var9++;
            this.field2284 += (long) arg0 * 1000000L;
        }
        if (this.field2284 < var7) {
            this.field2284 = var7;
        }
        return var9;
    }
}
