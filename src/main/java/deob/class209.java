package deob;

@ObfuscatedName("iu")
public class class209 extends class226 {

    @ObfuscatedName("iu.ab")
    public long field2316 = System.nanoTime();

    @ObfuscatedName("iu.ab(I)V")
    public void method4134() {
        this.field2316 = System.nanoTime();
    }

    @ObfuscatedName("iu.ay(III)I")
    public int method4130(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2316 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class330.method3326(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2316 < var7)) {
            var9++;
            this.field2316 += (long) arg0 * 1000000L;
        }
        if (this.field2316 < var7) {
            this.field2316 = var7;
        }
        return var9;
    }
}
