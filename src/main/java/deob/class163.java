package deob;

@ObfuscatedName("fp")
public class class163 extends class174 {

    @ObfuscatedName("fp.m")
    public long field1993 = System.nanoTime();

    @ObfuscatedName("fp.m(B)V")
    public void method3112() {
        this.field1993 = System.nanoTime();
    }

    @ObfuscatedName("fp.f(III)I")
    public int method3111(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1993 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class211.method3659(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1993 < var7)) {
            var9++;
            this.field1993 += (long) arg0 * 1000000L;
        }
        if (this.field1993 < var7) {
            this.field1993 = var7;
        }
        return var9;
    }
}
