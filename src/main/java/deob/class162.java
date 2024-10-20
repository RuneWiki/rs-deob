package deob;

@ObfuscatedName("fo")
public class class162 extends class173 {

    @ObfuscatedName("fo.c")
    public long field2162 = System.nanoTime();

    @ObfuscatedName("fo.c(I)V")
    public void method2956() {
        this.field2162 = System.nanoTime();
    }

    @ObfuscatedName("fo.i(IIB)I")
    public int method2957(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2162 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class204.method2982(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2162 < var7)) {
            var9++;
            this.field2162 += (long) arg0 * 1000000L;
        }
        if (this.field2162 < var7) {
            this.field2162 = var7;
        }
        return var9;
    }
}
