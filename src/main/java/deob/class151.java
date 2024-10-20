package deob;

@ObfuscatedName("ee")
public class class151 extends class137 {

    @ObfuscatedName("ee.a")
    public long field2289 = System.nanoTime();

    @ObfuscatedName("ee.a(I)V")
    public void method2757() {
        this.field2289 = System.nanoTime();
    }

    @ObfuscatedName("ee.d(III)I")
    public int method2753(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2289 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method674(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2289 < var7)) {
            var9++;
            this.field2289 += (long) arg0 * 1000000L;
        }
        if (this.field2289 < var7) {
            this.field2289 = var7;
        }
        return var9;
    }
}
