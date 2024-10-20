package deob;

@ObfuscatedName("ep")
public class class139 extends class125 {

    @ObfuscatedName("ep.n")
    public long field2120 = System.nanoTime();

    @ObfuscatedName("ep.n(B)V")
    public void method2580() {
        this.field2120 = System.nanoTime();
    }

    @ObfuscatedName("ep.o(III)I")
    public int method2581(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2120 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method2156(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2120 < var7)) {
            var9++;
            this.field2120 += (long) arg0 * 1000000L;
        }
        if (this.field2120 < var7) {
            this.field2120 = var7;
        }
        return var9;
    }
}
