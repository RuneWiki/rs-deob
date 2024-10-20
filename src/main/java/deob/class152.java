package deob;

@ObfuscatedName("en")
public class class152 extends class163 {

    @ObfuscatedName("en.a")
    public long field2096 = System.nanoTime();

    @ObfuscatedName("en.a(I)V")
    public void method2694() {
        this.field2096 = System.nanoTime();
    }

    @ObfuscatedName("en.w(III)I")
    public int method2699(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2096 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class193.method1373(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2096 < var7)) {
            var9++;
            this.field2096 += (long) arg0 * 1000000L;
        }
        if (this.field2096 < var7) {
            this.field2096 = var7;
        }
        return var9;
    }
}
