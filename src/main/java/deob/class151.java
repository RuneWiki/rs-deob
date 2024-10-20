package deob;

@ObfuscatedName("ex")
public class class151 extends class137 {

    @ObfuscatedName("ex.e")
    public long field2270 = System.nanoTime();

    @ObfuscatedName("ex.e(I)V")
    public void method2824() {
        this.field2270 = System.nanoTime();
    }

    @ObfuscatedName("ex.l(III)I")
    public int method2821(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2270 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method2735(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2270 < var7)) {
            var9++;
            this.field2270 += (long) arg0 * 1000000L;
        }
        if (this.field2270 < var7) {
            this.field2270 = var7;
        }
        return var9;
    }
}
