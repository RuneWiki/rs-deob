package deob;

@ObfuscatedName("ci")
public class class80 extends class67 {

    @ObfuscatedName("ci.c")
    public long field1393 = System.nanoTime();

    @ObfuscatedName("ci.c(B)V")
    public void method1298() {
        this.field1393 = System.nanoTime();
    }

    @ObfuscatedName("ci.j(III)I")
    public int method1299(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1393 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method2308(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1393 < var7)) {
            var9++;
            this.field1393 += (long) arg0 * 1000000L;
        }
        if (this.field1393 < var7) {
            this.field1393 = var7;
        }
        return var9;
    }
}
