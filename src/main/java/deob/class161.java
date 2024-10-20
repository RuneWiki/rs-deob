package deob;

@ObfuscatedName("fl")
public class class161 extends class174 {

    @ObfuscatedName("fl.a")
    public long field1762 = System.nanoTime();

    @ObfuscatedName("fl.a(I)V")
    public void method2982() {
        this.field1762 = System.nanoTime();
    }

    @ObfuscatedName("fl.f(III)I")
    public int method2983(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1762 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class281.method3621(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1762 < var7)) {
            var9++;
            this.field1762 += (long) arg0 * 1000000L;
        }
        if (this.field1762 < var7) {
            this.field1762 = var7;
        }
        return var9;
    }
}
