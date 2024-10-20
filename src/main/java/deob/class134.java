package deob;

@ObfuscatedName("ec")
public class class134 extends class120 {

    @ObfuscatedName("ec.g")
    public long field2078 = System.nanoTime();

    @ObfuscatedName("ec.g(I)V")
    public void method2430() {
        this.field2078 = System.nanoTime();
    }

    @ObfuscatedName("ec.i(III)I")
    public int method2431(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2078 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method1935(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2078 < var7)) {
            var9++;
            this.field2078 += (long) arg0 * 1000000L;
        }
        if (this.field2078 < var7) {
            this.field2078 = var7;
        }
        return var9;
    }
}
