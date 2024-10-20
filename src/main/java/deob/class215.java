package deob;

@ObfuscatedName("ia")
public class class215 extends class232 {

    @ObfuscatedName("ia.ap")
    public long field2347 = System.nanoTime();

    @ObfuscatedName("ia.ap(I)V")
    public void method4141() {
        this.field2347 = System.nanoTime();
    }

    @ObfuscatedName("ia.aw(IIB)I")
    public int method4142(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2347 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class331.method1920(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2347 < var7)) {
            var9++;
            this.field2347 += (long) arg0 * 1000000L;
        }
        if (this.field2347 < var7) {
            this.field2347 = var7;
        }
        return var9;
    }
}
