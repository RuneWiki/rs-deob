package deob;

@ObfuscatedName("ez")
public class class148 extends class134 {

    @ObfuscatedName("ez.b")
    public long field2205 = System.nanoTime();

    @ObfuscatedName("ez.b(B)V")
    public void method2714() {
        this.field2205 = System.nanoTime();
    }

    @ObfuscatedName("ez.g(IIB)I")
    public int method2719(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2205 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class128.method2289(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2205 < var7)) {
            var9++;
            this.field2205 += (long) arg0 * 1000000L;
        }
        if (this.field2205 < var7) {
            this.field2205 = var7;
        }
        return var9;
    }
}
