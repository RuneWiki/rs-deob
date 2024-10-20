package deob;

@ObfuscatedName("fd")
public class class162 extends class175 {

    @ObfuscatedName("fd.h")
    public long field1822 = System.nanoTime();

    @ObfuscatedName("fd.h(I)V")
    public void method3043() {
        this.field1822 = System.nanoTime();
    }

    @ObfuscatedName("fd.e(III)I")
    public int method3044(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1822 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class284.method148(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1822 < var7)) {
            var9++;
            this.field1822 += (long) arg0 * 1000000L;
        }
        if (this.field1822 < var7) {
            this.field1822 = var7;
        }
        return var9;
    }
}
