package deob;

@ObfuscatedName("ev")
public class class134 extends class120 {

    @ObfuscatedName("ev.b")
    public long field2075 = System.nanoTime();

    @ObfuscatedName("ev.b(I)V")
    public void method2464() {
        this.field2075 = System.nanoTime();
    }

    @ObfuscatedName("ev.u(III)I")
    public int method2466(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2075 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method2914(var5 / 1000000L);
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
