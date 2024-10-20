package deob;

@ObfuscatedName("ep")
public class class151 extends class159 {

    @ObfuscatedName("ep.w")
    public long field2203 = System.nanoTime();

    @ObfuscatedName("ep.w(B)V")
    public void method2722() {
        this.field2203 = System.nanoTime();
    }

    @ObfuscatedName("ep.s(III)I")
    public int method2723(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2203 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method1687(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2203 < var7)) {
            var9++;
            this.field2203 += (long) arg0 * 1000000L;
        }
        if (this.field2203 < var7) {
            this.field2203 = var7;
        }
        return var9;
    }
}
