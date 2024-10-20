package deob;

@ObfuscatedName("ey")
public class class139 extends class125 {

    @ObfuscatedName("ey.e")
    public long field2075 = System.nanoTime();

    @ObfuscatedName("ey.a(I)V")
    public void method2532() {
        this.field2075 = System.nanoTime();
    }

    @ObfuscatedName("ey.l(III)I")
    public int method2534(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2075 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method837(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2075 < var7)) {
            var9++;
            this.field2075 += (long) arg0 * 1000000L;
        }
        if (this.field2075 < var7) {
            this.field2075 = var7;
        }
        return var9;
    }
}
