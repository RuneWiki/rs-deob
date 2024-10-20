package deob;

@ObfuscatedName("eo")
public class class154 extends class167 {

    @ObfuscatedName("eo.s")
    public long field1699 = System.nanoTime();

    @ObfuscatedName("eo.s(I)V")
    public void method2790() {
        this.field1699 = System.nanoTime();
    }

    @ObfuscatedName("eo.h(IIB)I")
    public int method2788(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1699 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class271.method2748(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1699 < var7)) {
            var9++;
            this.field1699 += (long) arg0 * 1000000L;
        }
        if (this.field1699 < var7) {
            this.field1699 = var7;
        }
        return var9;
    }
}
