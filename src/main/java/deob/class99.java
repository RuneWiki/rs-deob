package deob;

@ObfuscatedName("cw")
public class class99 extends class110 {

    @ObfuscatedName("cw.s")
    public long field1644 = System.nanoTime();

    @ObfuscatedName("cw.s(I)V")
    public void method1775() {
        this.field1644 = System.nanoTime();
    }

    @ObfuscatedName("cw.c(III)I")
    public int method1776(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1644 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method746(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1644 < var7)) {
            var9++;
            this.field1644 += (long) arg0 * 1000000L;
        }
        if (this.field1644 < var7) {
            this.field1644 = var7;
        }
        return var9;
    }
}
