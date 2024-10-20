package deob;

@ObfuscatedName("es")
public class class134 extends class120 {

    @ObfuscatedName("es.t")
    public long field2041 = System.nanoTime();

    @ObfuscatedName("es.o(I)V")
    public void method2427() {
        this.field2041 = System.nanoTime();
    }

    @ObfuscatedName("es.i(III)I")
    public int method2426(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2041 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method1854(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2041 < var7)) {
            var9++;
            this.field2041 += (long) arg0 * 1000000L;
        }
        if (this.field2041 < var7) {
            this.field2041 = var7;
        }
        return var9;
    }
}
