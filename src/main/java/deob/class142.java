package deob;

@ObfuscatedName("ex")
public class class142 extends class150 {

    @ObfuscatedName("ex.i")
    public long field1538 = System.nanoTime();

    @ObfuscatedName("ex.i(I)V")
    public void method2560() {
        this.field1538 = System.nanoTime();
    }

    @ObfuscatedName("ex.w(III)I")
    public int method2562(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1538 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class399.method2872(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1538 < var7)) {
            var9++;
            this.field1538 += (long) arg0 * 1000000L;
        }
        if (this.field1538 < var7) {
            this.field1538 = var7;
        }
        return var9;
    }
}
