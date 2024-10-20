package deob;

@ObfuscatedName("io")
public class class212 extends class229 {

    @ObfuscatedName("io.aq")
    public long field2323 = System.nanoTime();

    @ObfuscatedName("io.aq(I)V")
    public void method3803() {
        this.field2323 = System.nanoTime();
    }

    @ObfuscatedName("io.ad(III)I")
    public int method3802(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2323 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class328.method3390(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2323 < var7)) {
            var9++;
            this.field2323 += (long) arg0 * 1000000L;
        }
        if (this.field2323 < var7) {
            this.field2323 = var7;
        }
        return var9;
    }
}
