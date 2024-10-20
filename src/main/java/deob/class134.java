package deob;

@ObfuscatedName("ej")
public class class134 extends class120 {

    @ObfuscatedName("ej.k")
    public long field2077 = System.nanoTime();

    @ObfuscatedName("ej.k(I)V")
    public void method2453() {
        this.field2077 = System.nanoTime();
    }

    @ObfuscatedName("ej.y(III)I")
    public int method2454(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2077 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method1888(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2077 < var7)) {
            var9++;
            this.field2077 += (long) arg0 * 1000000L;
        }
        if (this.field2077 < var7) {
            this.field2077 = var7;
        }
        return var9;
    }
}
