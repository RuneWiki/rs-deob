package deob;

@ObfuscatedName("cg")
public class class154 extends class115 {

    @ObfuscatedName("cg.v")
    public long field2322 = System.nanoTime();

    @ObfuscatedName("cg.c(III)I")
    public int method2068(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2322 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class134.method1468(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2322 < var7)) {
            var9++;
            this.field2322 += (long) arg0 * 1000000L;
        }
        if (this.field2322 < var7) {
            this.field2322 = var7;
        }
        return var9;
    }

    @ObfuscatedName("cg.v(I)V")
    public void method2069() {
        this.field2322 = System.nanoTime();
    }
}
