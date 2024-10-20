package deob;

@ObfuscatedName("cc")
public class class81 extends class68 {

    @ObfuscatedName("cc.j")
    public long field1404 = System.nanoTime();

    @ObfuscatedName("cc.j(B)V")
    public void method1347() {
        this.field1404 = System.nanoTime();
    }

    @ObfuscatedName("cc.r(IIB)I")
    public int method1340(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1404 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method1316(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1404 < var7)) {
            var9++;
            this.field1404 += (long) arg0 * 1000000L;
        }
        if (this.field1404 < var7) {
            this.field1404 = var7;
        }
        return var9;
    }
}
