package deob;

@ObfuscatedName("eq")
public class class136 extends class122 {

    @ObfuscatedName("eq.f")
    public long field2098 = System.nanoTime();

    @ObfuscatedName("eq.f(B)V")
    public void method2505() {
        this.field2098 = System.nanoTime();
    }

    @ObfuscatedName("eq.k(IIB)I")
    public int method2493(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2098 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class116.method557(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2098 < var7)) {
            var9++;
            this.field2098 += (long) arg0 * 1000000L;
        }
        if (this.field2098 < var7) {
            this.field2098 = var7;
        }
        return var9;
    }
}
