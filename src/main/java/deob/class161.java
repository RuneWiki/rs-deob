package deob;

@ObfuscatedName("fg")
public class class161 extends class172 {

    @ObfuscatedName("fg.b")
    public long field2126 = System.nanoTime();

    @ObfuscatedName("fg.b(I)V")
    public void method2935() {
        this.field2126 = System.nanoTime();
    }

    @ObfuscatedName("fg.q(IIB)I")
    public int method2940(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2126 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class202.method141(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2126 < var7)) {
            var9++;
            this.field2126 += (long) arg0 * 1000000L;
        }
        if (this.field2126 < var7) {
            this.field2126 = var7;
        }
        return var9;
    }
}
