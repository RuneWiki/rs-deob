package deob;

@ObfuscatedName("ez")
public class class150 extends class161 {

    @ObfuscatedName("ez.z")
    public long field1919 = System.nanoTime();

    @ObfuscatedName("ez.z(I)V")
    public void method2967() {
        this.field1919 = System.nanoTime();
    }

    @ObfuscatedName("ez.w(III)I")
    public int method2970(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1919 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class192.method1435(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1919 < var7)) {
            var9++;
            this.field1919 += (long) arg0 * 1000000L;
        }
        if (this.field1919 < var7) {
            this.field1919 = var7;
        }
        return var9;
    }
}
