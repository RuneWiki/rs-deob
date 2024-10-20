package deob;

@ObfuscatedName("ew")
public class class147 extends class133 {

    @ObfuscatedName("ew.k")
    public long field2198 = System.nanoTime();

    @ObfuscatedName("ew.h(B)V")
    public void method2672() {
        this.field2198 = System.nanoTime();
    }

    @ObfuscatedName("ew.o(IIB)I")
    public int method2673(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2198 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method890(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2198 < var7)) {
            var9++;
            this.field2198 += (long) arg0 * 1000000L;
        }
        if (this.field2198 < var7) {
            this.field2198 = var7;
        }
        return var9;
    }
}
