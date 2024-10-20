package deob;

@ObfuscatedName("ez")
public class class151 extends class162 {

    @ObfuscatedName("ez.w")
    public long field2212 = System.nanoTime();

    @ObfuscatedName("ez.w(B)V")
    public void method2629() {
        this.field2212 = System.nanoTime();
    }

    @ObfuscatedName("ez.o(IIB)I")
    public int method2631(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2212 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class185.method7(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2212 < var7)) {
            var9++;
            this.field2212 += (long) arg0 * 1000000L;
        }
        if (this.field2212 < var7) {
            this.field2212 = var7;
        }
        return var9;
    }
}
