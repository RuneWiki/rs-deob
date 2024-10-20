package deob;

@ObfuscatedName("eb")
public class class151 extends class159 {

    @ObfuscatedName("eb.c")
    public long field2165 = System.nanoTime();

    @ObfuscatedName("eb.c(I)V")
    public void method2626() {
        this.field2165 = System.nanoTime();
    }

    @ObfuscatedName("eb.o(III)I")
    public int method2624(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2165 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        Statics.method2614(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2165 < var7)) {
            var9++;
            this.field2165 += (long) arg0 * 1000000L;
        }
        if (this.field2165 < var7) {
            this.field2165 = var7;
        }
        return var9;
    }
}
