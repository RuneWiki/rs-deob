package deob;

@ObfuscatedName("et")
public class class136 extends class122 {

    @ObfuscatedName("et.e")
    public long field2080 = System.nanoTime();

    @ObfuscatedName("et.e(I)V")
    public void method2467() {
        this.field2080 = System.nanoTime();
    }

    @ObfuscatedName("et.v(IIB)I")
    public int method2461(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2080 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class116.method7(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2080 < var7)) {
            var9++;
            this.field2080 += (long) arg0 * 1000000L;
        }
        if (this.field2080 < var7) {
            this.field2080 = var7;
        }
        return var9;
    }
}
