package deob;

@ObfuscatedName("ed")
public class class151 extends class137 {

    @ObfuscatedName("ed.f")
    public long field2268 = System.nanoTime();

    @ObfuscatedName("ed.e(B)V")
    public void method2738() {
        this.field2268 = System.nanoTime();
    }

    @ObfuscatedName("ed.n(III)I")
    public int method2733(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2268 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method2276(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2268 < var7)) {
            var9++;
            this.field2268 += (long) arg0 * 1000000L;
        }
        if (this.field2268 < var7) {
            this.field2268 = var7;
        }
        return var9;
    }
}
