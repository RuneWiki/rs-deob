package deob;

@ObfuscatedName("fn")
public class class164 extends class171 {

    @ObfuscatedName("fn.a")
    public long field1994 = System.nanoTime();

    @ObfuscatedName("fn.a(I)V")
    public void method3253() {
        this.field1994 = System.nanoTime();
    }

    @ObfuscatedName("fn.t(III)I")
    public int method3250(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1994 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        Statics.method4888(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1994 < var7)) {
            var9++;
            this.field1994 += (long) arg0 * 1000000L;
        }
        if (this.field1994 < var7) {
            this.field1994 = var7;
        }
        return var9;
    }
}
