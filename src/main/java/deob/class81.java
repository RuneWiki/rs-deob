package deob;

@ObfuscatedName("cs")
public class class81 extends class68 {

    @ObfuscatedName("cs.g")
    public long field1410 = System.nanoTime();

    @ObfuscatedName("cs.g(I)V")
    public void method1353() {
        this.field1410 = System.nanoTime();
    }

    @ObfuscatedName("cs.h(IIB)I")
    public int method1354(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1410 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method2355(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1410 < var7)) {
            var9++;
            this.field1410 += (long) arg0 * 1000000L;
        }
        if (this.field1410 < var7) {
            this.field1410 = var7;
        }
        return var9;
    }
}
