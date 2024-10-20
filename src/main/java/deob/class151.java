package deob;

@ObfuscatedName("ez")
public class class151 extends class159 {

    @ObfuscatedName("ez.i")
    public long field2222 = System.nanoTime();

    @ObfuscatedName("ez.i(B)V")
    public void method2652() {
        this.field2222 = System.nanoTime();
    }

    @ObfuscatedName("ez.w(IIB)I")
    public int method2653(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2222 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method1004(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2222 < var7)) {
            var9++;
            this.field2222 += (long) arg0 * 1000000L;
        }
        if (this.field2222 < var7) {
            this.field2222 = var7;
        }
        return var9;
    }
}
