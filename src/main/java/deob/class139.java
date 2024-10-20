package deob;

@ObfuscatedName("ew")
public class class139 extends class125 {

    @ObfuscatedName("ew.b")
    public long field2121 = System.nanoTime();

    @ObfuscatedName("ew.b(I)V")
    public void method2474() {
        this.field2121 = System.nanoTime();
    }

    @ObfuscatedName("ew.e(IIB)I")
    public int method2475(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2121 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method555(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2121 < var7)) {
            var9++;
            this.field2121 += (long) arg0 * 1000000L;
        }
        if (this.field2121 < var7) {
            this.field2121 = var7;
        }
        return var9;
    }
}
