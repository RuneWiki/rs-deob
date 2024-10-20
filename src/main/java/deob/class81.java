package deob;

@ObfuscatedName("ci")
public class class81 extends class68 {

    @ObfuscatedName("ci.b")
    public long field1444 = System.nanoTime();

    @ObfuscatedName("ci.b(B)V")
    public void method1321() {
        this.field1444 = System.nanoTime();
    }

    @ObfuscatedName("ci.c(III)I")
    public int method1322(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1444 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method874(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1444 < var7)) {
            var9++;
            this.field1444 += (long) arg0 * 1000000L;
        }
        if (this.field1444 < var7) {
            this.field1444 = var7;
        }
        return var9;
    }
}
