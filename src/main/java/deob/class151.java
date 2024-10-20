package deob;

@ObfuscatedName("el")
public class class151 extends class159 {

    @ObfuscatedName("el.e")
    public long field2193 = System.nanoTime();

    @ObfuscatedName("el.e(I)V")
    public void method2669() {
        this.field2193 = System.nanoTime();
    }

    @ObfuscatedName("el.o(III)I")
    public int method2673(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2193 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method1535(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2193 < var7)) {
            var9++;
            this.field2193 += (long) arg0 * 1000000L;
        }
        if (this.field2193 < var7) {
            this.field2193 = var7;
        }
        return var9;
    }
}
