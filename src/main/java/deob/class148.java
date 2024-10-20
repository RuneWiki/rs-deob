package deob;

@ObfuscatedName("ej")
public class class148 extends class134 {

    @ObfuscatedName("ej.e")
    public long field2218 = System.nanoTime();

    @ObfuscatedName("ej.e(S)V")
    public void method2673() {
        this.field2218 = System.nanoTime();
    }

    @ObfuscatedName("ej.w(III)I")
    public int method2674(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2218 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class128.method2645(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2218 < var7)) {
            var9++;
            this.field2218 += (long) arg0 * 1000000L;
        }
        if (this.field2218 < var7) {
            this.field2218 = var7;
        }
        return var9;
    }
}
