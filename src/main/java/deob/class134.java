package deob;

@ObfuscatedName("ef")
public class class134 extends class120 {

    @ObfuscatedName("ef.e")
    public long field2076 = System.nanoTime();

    @ObfuscatedName("ef.p(I)V")
    public void method2454() {
        this.field2076 = System.nanoTime();
    }

    @ObfuscatedName("ef.a(III)I")
    public int method2453(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2076 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method658(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2076 < var7)) {
            var9++;
            this.field2076 += (long) arg0 * 1000000L;
        }
        if (this.field2076 < var7) {
            this.field2076 = var7;
        }
        return var9;
    }
}
