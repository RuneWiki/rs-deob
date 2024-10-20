package deob;

@ObfuscatedName("fn")
public class class173 extends class180 {

    @ObfuscatedName("fn.x")
    public long field2019 = System.nanoTime();

    @ObfuscatedName("fn.x(I)V")
    public void method3246() {
        this.field2019 = System.nanoTime();
    }

    @ObfuscatedName("fn.m(III)I")
    public int method3249(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2019 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class308.method3243(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2019 < var7)) {
            var9++;
            this.field2019 += (long) arg0 * 1000000L;
        }
        if (this.field2019 < var7) {
            this.field2019 = var7;
        }
        return var9;
    }
}
