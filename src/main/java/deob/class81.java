package deob;

@ObfuscatedName("cb")
public class class81 extends class68 {

    @ObfuscatedName("cb.p")
    public long field1412 = System.nanoTime();

    @ObfuscatedName("cb.p(B)V")
    public void method1398() {
        this.field1412 = System.nanoTime();
    }

    @ObfuscatedName("cb.l(III)I")
    public int method1390(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1412 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method1463(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1412 < var7)) {
            var9++;
            this.field1412 += (long) arg0 * 1000000L;
        }
        if (this.field1412 < var7) {
            this.field1412 = var7;
        }
        return var9;
    }
}
