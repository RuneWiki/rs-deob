package deob;

@ObfuscatedName("ey")
public class class154 extends class168 {

    @ObfuscatedName("ey.v")
    public long field1688 = System.nanoTime();

    @ObfuscatedName("ey.v(I)V")
    public void method2866() {
        this.field1688 = System.nanoTime();
    }

    @ObfuscatedName("ey.c(III)I")
    public int method2869(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1688 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class271.method2274(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1688 < var7)) {
            var9++;
            this.field1688 += (long) arg0 * 1000000L;
        }
        if (this.field1688 < var7) {
            this.field1688 = var7;
        }
        return var9;
    }
}
