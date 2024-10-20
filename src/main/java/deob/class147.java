package deob;

@ObfuscatedName("eh")
public class class147 extends class133 {

    @ObfuscatedName("eh.z")
    public long field2226 = System.nanoTime();

    @ObfuscatedName("eh.q(I)V")
    public void method2647() {
        this.field2226 = System.nanoTime();
    }

    @ObfuscatedName("eh.k(III)I")
    public int method2655(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2226 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method712(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2226 < var7)) {
            var9++;
            this.field2226 += (long) arg0 * 1000000L;
        }
        if (this.field2226 < var7) {
            this.field2226 = var7;
        }
        return var9;
    }
}
