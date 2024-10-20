package deob;

@ObfuscatedName("ek")
public class class151 extends class159 {

    @ObfuscatedName("ek.i")
    public long field2223 = System.nanoTime();

    @ObfuscatedName("ek.i(B)V")
    public void method2659() {
        this.field2223 = System.nanoTime();
    }

    @ObfuscatedName("ek.c(III)I")
    public int method2660(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2223 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method10(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2223 < var7)) {
            var9++;
            this.field2223 += (long) arg0 * 1000000L;
        }
        if (this.field2223 < var7) {
            this.field2223 = var7;
        }
        return var9;
    }
}
