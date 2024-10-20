package deob;

@ObfuscatedName("ey")
public class class134 extends class120 {

    @ObfuscatedName("ey.j")
    public long field2080 = System.nanoTime();

    @ObfuscatedName("ey.z(I)V")
    public void method2462() {
        this.field2080 = System.nanoTime();
    }

    @ObfuscatedName("ey.y(III)I")
    public int method2458(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2080 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method589(var5 / 1000000L);
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
