package deob;

@ObfuscatedName("fb")
public class class173 extends class180 {

    @ObfuscatedName("fb.h")
    public long field2030 = System.nanoTime();

    @ObfuscatedName("fb.h(I)V")
    public void method3259() {
        this.field2030 = System.nanoTime();
    }

    @ObfuscatedName("fb.v(III)I")
    public int method3260(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2030 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class309.method3812(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2030 < var7)) {
            var9++;
            this.field2030 += (long) arg0 * 1000000L;
        }
        if (this.field2030 < var7) {
            this.field2030 = var7;
        }
        return var9;
    }
}
