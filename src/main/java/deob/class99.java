package deob;

@ObfuscatedName("ca")
public class class99 extends class110 {

    @ObfuscatedName("ca.p")
    public long field1641 = System.nanoTime();

    @ObfuscatedName("ca.p(I)V")
    public void method1802() {
        this.field1641 = System.nanoTime();
    }

    @ObfuscatedName("ca.g(III)I")
    public int method1803(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1641 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method1858(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1641 < var7)) {
            var9++;
            this.field1641 += (long) arg0 * 1000000L;
        }
        if (this.field1641 < var7) {
            this.field1641 = var7;
        }
        return var9;
    }
}
