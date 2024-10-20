package deob;

@ObfuscatedName("ei")
public class class138 extends class124 {

    @ObfuscatedName("ei.p")
    public long field2079 = System.nanoTime();

    @ObfuscatedName("ei.p(I)V")
    public void method2455() {
        this.field2079 = System.nanoTime();
    }

    @ObfuscatedName("ei.y(III)I")
    public int method2460(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2079 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class118.method1901(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2079 < var7)) {
            var9++;
            this.field2079 += (long) arg0 * 1000000L;
        }
        if (this.field2079 < var7) {
            this.field2079 = var7;
        }
        return var9;
    }
}
