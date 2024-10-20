package deob;

@ObfuscatedName("es")
public class class147 extends class133 {

    @ObfuscatedName("es.j")
    public long field2206 = System.nanoTime();

    @ObfuscatedName("es.j(I)V")
    public void method2712() {
        this.field2206 = System.nanoTime();
    }

    @ObfuscatedName("es.m(III)I")
    public int method2714(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2206 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method692(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2206 < var7)) {
            var9++;
            this.field2206 += (long) arg0 * 1000000L;
        }
        if (this.field2206 < var7) {
            this.field2206 = var7;
        }
        return var9;
    }
}
