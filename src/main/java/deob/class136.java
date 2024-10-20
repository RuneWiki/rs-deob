package deob;

@ObfuscatedName("eq")
public class class136 extends class122 {

    @ObfuscatedName("eq.l")
    public long field2058 = System.nanoTime();

    @ObfuscatedName("eq.l(I)V")
    public void method2463() {
        this.field2058 = System.nanoTime();
    }

    @ObfuscatedName("eq.y(III)I")
    public int method2464(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2058 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class116.method71(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2058 < var7)) {
            var9++;
            this.field2058 += (long) arg0 * 1000000L;
        }
        if (this.field2058 < var7) {
            this.field2058 = var7;
        }
        return var9;
    }
}
