package deob;

@ObfuscatedName("ed")
public class class142 extends class128 {

    @ObfuscatedName("ed.j")
    public long field2127 = System.nanoTime();

    @ObfuscatedName("ed.y(I)V")
    public void method2670() {
        this.field2127 = System.nanoTime();
    }

    @ObfuscatedName("ed.z(III)I")
    public int method2660(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2127 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class122.method558(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2127 < var7)) {
            var9++;
            this.field2127 += (long) arg0 * 1000000L;
        }
        if (this.field2127 < var7) {
            this.field2127 = var7;
        }
        return var9;
    }
}
