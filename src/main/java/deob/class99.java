package deob;

@ObfuscatedName("cu")
public class class99 extends class110 {

    @ObfuscatedName("cu.x")
    public long field1649 = System.nanoTime();

    @ObfuscatedName("cu.x(B)V")
    public void method1881() {
        this.field1649 = System.nanoTime();
    }

    @ObfuscatedName("cu.j(III)I")
    public int method1880(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1649 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method2485(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1649 < var7)) {
            var9++;
            this.field1649 += (long) arg0 * 1000000L;
        }
        if (this.field1649 < var7) {
            this.field1649 = var7;
        }
        return var9;
    }
}
