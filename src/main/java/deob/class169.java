package deob;

@ObfuscatedName("gs")
public class class169 extends class183 {

    @ObfuscatedName("gs.au")
    public long field1832 = System.nanoTime();

    @ObfuscatedName("gs.au(I)V")
    public void method3109() {
        this.field1832 = System.nanoTime();
    }

    @ObfuscatedName("gs.ae(IIB)I")
    public int method3105(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1832 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class303.method2265(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1832 < var7)) {
            var9++;
            this.field1832 += (long) arg0 * 1000000L;
        }
        if (this.field1832 < var7) {
            this.field1832 = var7;
        }
        return var9;
    }
}
