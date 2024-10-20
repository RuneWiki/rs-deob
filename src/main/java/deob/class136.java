package deob;

@ObfuscatedName("ex")
public class class136 extends class122 {

    @ObfuscatedName("ex.x")
    public long field2075 = System.nanoTime();

    @ObfuscatedName("ex.x(I)V")
    public void method2468() {
        this.field2075 = System.nanoTime();
    }

    @ObfuscatedName("ex.v(III)I")
    public int method2469(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2075 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class116.method1361(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2075 < var7)) {
            var9++;
            this.field2075 += (long) arg0 * 1000000L;
        }
        if (this.field2075 < var7) {
            this.field2075 = var7;
        }
        return var9;
    }
}
