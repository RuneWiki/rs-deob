package deob;

@ObfuscatedName("cu")
public class class81 extends class68 {

    @ObfuscatedName("cu.i")
    public long field1425 = System.nanoTime();

    @ObfuscatedName("cu.i(B)V")
    public void method1372() {
        this.field1425 = System.nanoTime();
    }

    @ObfuscatedName("cu.v(III)I")
    public int method1373(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1425 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method1440(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1425 < var7)) {
            var9++;
            this.field1425 += (long) arg0 * 1000000L;
        }
        if (this.field1425 < var7) {
            this.field1425 = var7;
        }
        return var9;
    }
}
