package deob;

@ObfuscatedName("fs")
public class class173 extends class180 {

    @ObfuscatedName("fs.m")
    public long field2038 = System.nanoTime();

    @ObfuscatedName("fs.m(I)V")
    public void method3247() {
        this.field2038 = System.nanoTime();
    }

    @ObfuscatedName("fs.o(III)I")
    public int method3250(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2038 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        long var7 = var5 / 1000000L;
        if (var7 > 0L) {
            if (var7 % 10L == 0L) {
                class308.method3708(var7 - 1L);
                class308.method3708(1L);
            } else {
                class308.method3708(var7);
            }
        }
        long var9 = System.nanoTime();
        int var11 = 0;
        while (var11 < 10 && (var11 < 1 || this.field2038 < var9)) {
            var11++;
            this.field2038 += (long) arg0 * 1000000L;
        }
        if (this.field2038 < var9) {
            this.field2038 = var9;
        }
        return var11;
    }
}
