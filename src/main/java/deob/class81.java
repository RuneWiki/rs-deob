package deob;

@ObfuscatedName("ce")
public class class81 extends class68 {

    @ObfuscatedName("ce.j")
    public long field1433 = System.nanoTime();

    @ObfuscatedName("ce.j(I)V")
    public void method1352() {
        this.field1433 = System.nanoTime();
    }

    @ObfuscatedName("ce.f(III)I")
    public int method1353(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1433 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method768(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1433 < var7)) {
            var9++;
            this.field1433 += (long) arg0 * 1000000L;
        }
        if (this.field1433 < var7) {
            this.field1433 = var7;
        }
        return var9;
    }
}
