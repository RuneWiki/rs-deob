package deob;

@ObfuscatedName("ed")
public class class134 extends class120 {

    @ObfuscatedName("ed.t")
    public long field2066 = System.nanoTime();

    @ObfuscatedName("ed.s(I)V")
    public void method2436() {
        this.field2066 = System.nanoTime();
    }

    @ObfuscatedName("ed.f(III)I")
    public int method2435(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2066 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method2031(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2066 < var7)) {
            var9++;
            this.field2066 += (long) arg0 * 1000000L;
        }
        if (this.field2066 < var7) {
            this.field2066 = var7;
        }
        return var9;
    }
}
