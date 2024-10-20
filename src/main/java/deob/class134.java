package deob;

@ObfuscatedName("ey")
public class class134 extends class120 {

    @ObfuscatedName("ey.z")
    public long field2062 = System.nanoTime();

    @ObfuscatedName("ey.z(S)V")
    public void method2457() {
        this.field2062 = System.nanoTime();
    }

    @ObfuscatedName("ey.j(III)I")
    public int method2458(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2062 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method1960(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2062 < var7)) {
            var9++;
            this.field2062 += (long) arg0 * 1000000L;
        }
        if (this.field2062 < var7) {
            this.field2062 = var7;
        }
        return var9;
    }
}
