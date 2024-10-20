package deob;

@ObfuscatedName("iz")
public class class215 extends class232 {

    @ObfuscatedName("iz.ac")
    public long field2349 = System.nanoTime();

    @ObfuscatedName("iz.ac(B)V")
    public void method4018() {
        this.field2349 = System.nanoTime();
    }

    @ObfuscatedName("iz.ae(III)I")
    public int method4014(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2349 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class332.method4128(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2349 < var7)) {
            var9++;
            this.field2349 += (long) arg0 * 1000000L;
        }
        if (this.field2349 < var7) {
            this.field2349 = var7;
        }
        return var9;
    }
}
