package deob;

@ObfuscatedName("cp")
public class class81 extends class68 {

    @ObfuscatedName("cp.q")
    public long field1425 = System.nanoTime();

    @ObfuscatedName("cp.q(I)V")
    public void method1362() {
        this.field1425 = System.nanoTime();
    }

    @ObfuscatedName("cp.c(III)I")
    public int method1363(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1425 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method210(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1425 < var7)) {
            var9++;
            this.field1425 += (long) arg0 * 1000000L;
        }
        if (this.field1425 < var7) {
            this.field1425 = var7;
        }
        return var9;
    }
}
