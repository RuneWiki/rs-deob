package deob;

@ObfuscatedName("eo")
public class class147 extends class133 {

    @ObfuscatedName("eo.j")
    public long field2228 = System.nanoTime();

    @ObfuscatedName("eo.l(I)V")
    public void method2636() {
        this.field2228 = System.nanoTime();
    }

    @ObfuscatedName("eo.a(IIB)I")
    public int method2644(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2228 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method2202(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2228 < var7)) {
            var9++;
            this.field2228 += (long) arg0 * 1000000L;
        }
        if (this.field2228 < var7) {
            this.field2228 = var7;
        }
        return var9;
    }
}
