package deob;

@ObfuscatedName("ea")
public class class134 extends class120 {

    @ObfuscatedName("ea.g")
    public long field2058 = System.nanoTime();

    @ObfuscatedName("ea.g(I)V")
    public void method2419() {
        this.field2058 = System.nanoTime();
    }

    @ObfuscatedName("ea.s(IIB)I")
    public int method2418(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2058 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method2036(var5 / 1000000L);
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
