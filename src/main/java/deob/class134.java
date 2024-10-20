package deob;

@ObfuscatedName("eh")
public class class134 extends class120 {

    @ObfuscatedName("eh.k")
    public long field2071 = System.nanoTime();

    @ObfuscatedName("eh.k(I)V")
    public void method2433() {
        this.field2071 = System.nanoTime();
    }

    @ObfuscatedName("eh.r(III)I")
    public int method2432(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2071 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method2808(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2071 < var7)) {
            var9++;
            this.field2071 += (long) arg0 * 1000000L;
        }
        if (this.field2071 < var7) {
            this.field2071 = var7;
        }
        return var9;
    }
}
