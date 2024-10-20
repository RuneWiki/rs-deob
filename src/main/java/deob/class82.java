package deob;

@ObfuscatedName("cd")
public class class82 extends class69 {

    @ObfuscatedName("cd.i")
    public long field1445 = System.nanoTime();

    @ObfuscatedName("cd.i(B)V")
    public void method1336() {
        this.field1445 = System.nanoTime();
    }

    @ObfuscatedName("cd.b(IIB)I")
    public int method1338(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1445 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class127.method1642(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1445 < var7)) {
            var9++;
            this.field1445 += (long) arg0 * 1000000L;
        }
        if (this.field1445 < var7) {
            this.field1445 = var7;
        }
        return var9;
    }
}
