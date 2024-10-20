package deob;

@ObfuscatedName("cg")
public class class81 extends class68 {

    @ObfuscatedName("cg.p")
    public long field1430 = System.nanoTime();

    @ObfuscatedName("cg.p(I)V")
    public void method1376() {
        this.field1430 = System.nanoTime();
    }

    @ObfuscatedName("cg.i(III)I")
    public int method1374(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1430 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method2420(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1430 < var7)) {
            var9++;
            this.field1430 += (long) arg0 * 1000000L;
        }
        if (this.field1430 < var7) {
            this.field1430 = var7;
        }
        return var9;
    }
}
