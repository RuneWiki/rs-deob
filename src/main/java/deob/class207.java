package deob;

@ObfuscatedName("he")
public class class207 extends class221 {

    @ObfuscatedName("he.at")
    public long field2248 = System.nanoTime();

    @ObfuscatedName("he.at(I)V")
    public void method3790() {
        this.field2248 = System.nanoTime();
    }

    @ObfuscatedName("he.ah(III)I")
    public int method3785(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2248 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class314.method3920(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2248 < var7)) {
            var9++;
            this.field2248 += (long) arg0 * 1000000L;
        }
        if (this.field2248 < var7) {
            this.field2248 = var7;
        }
        return var9;
    }
}
