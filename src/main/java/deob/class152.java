package deob;

@ObfuscatedName("et")
public class class152 extends class160 {

    @ObfuscatedName("et.d")
    public long field2118 = System.nanoTime();

    @ObfuscatedName("et.d(I)V")
    public void method2803() {
        this.field2118 = System.nanoTime();
    }

    @ObfuscatedName("et.x(III)I")
    public int method2804(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2118 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class189.method13(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2118 < var7)) {
            var9++;
            this.field2118 += (long) arg0 * 1000000L;
        }
        if (this.field2118 < var7) {
            this.field2118 = var7;
        }
        return var9;
    }
}
