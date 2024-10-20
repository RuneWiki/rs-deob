package deob;

@ObfuscatedName("cv")
public class class99 extends class110 {

    @ObfuscatedName("cv.q")
    public long field1643 = System.nanoTime();

    @ObfuscatedName("cv.q(I)V")
    public void method1899() {
        this.field1643 = System.nanoTime();
    }

    @ObfuscatedName("cv.d(IIS)I")
    public int method1900(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1643 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method2156(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1643 < var7)) {
            var9++;
            this.field1643 += (long) arg0 * 1000000L;
        }
        if (this.field1643 < var7) {
            this.field1643 = var7;
        }
        return var9;
    }
}
