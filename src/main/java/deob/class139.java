package deob;

@ObfuscatedName("ek")
public class class139 extends class125 {

    @ObfuscatedName("ek.n")
    public long field2107 = System.nanoTime();

    @ObfuscatedName("ek.n(I)V")
    public void method2494() {
        this.field2107 = System.nanoTime();
    }

    @ObfuscatedName("ek.w(III)I")
    public int method2496(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2107 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        Statics.method849(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2107 < var7)) {
            var9++;
            this.field2107 += (long) arg0 * 1000000L;
        }
        if (this.field2107 < var7) {
            this.field2107 = var7;
        }
        return var9;
    }
}
