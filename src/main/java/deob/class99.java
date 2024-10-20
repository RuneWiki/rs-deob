package deob;

@ObfuscatedName("ca")
public class class99 extends class110 {

    @ObfuscatedName("ca.u")
    public long field1629 = System.nanoTime();

    @ObfuscatedName("ca.u(I)V")
    public void method1787() {
        this.field1629 = System.nanoTime();
    }

    @ObfuscatedName("ca.x(IIB)I")
    public int method1789(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1629 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class162.method1528(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1629 < var7)) {
            var9++;
            this.field1629 += (long) arg0 * 1000000L;
        }
        if (this.field1629 < var7) {
            this.field1629 = var7;
        }
        return var9;
    }
}
