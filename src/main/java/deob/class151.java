package deob;

@ObfuscatedName("ec")
public class class151 extends class159 {

    @ObfuscatedName("ec.a")
    public long field2198 = System.nanoTime();

    @ObfuscatedName("ec.a(B)V")
    public void method2648() {
        this.field2198 = System.nanoTime();
    }

    @ObfuscatedName("ec.j(III)I")
    public int method2650(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2198 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class182.method318(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2198 < var7)) {
            var9++;
            this.field2198 += (long) arg0 * 1000000L;
        }
        if (this.field2198 < var7) {
            this.field2198 = var7;
        }
        return var9;
    }
}
