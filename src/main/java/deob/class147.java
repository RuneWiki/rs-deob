package deob;

@ObfuscatedName("ev")
public class class147 extends class133 {

    @ObfuscatedName("ev.c")
    public long field2189 = System.nanoTime();

    @ObfuscatedName("ev.h(I)V")
    public void method2633() {
        this.field2189 = System.nanoTime();
    }

    @ObfuscatedName("ev.k(III)I")
    public int method2634(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2189 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method2079(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2189 < var7)) {
            var9++;
            this.field2189 += (long) arg0 * 1000000L;
        }
        if (this.field2189 < var7) {
            this.field2189 = var7;
        }
        return var9;
    }
}
