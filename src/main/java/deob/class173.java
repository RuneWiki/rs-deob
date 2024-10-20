package deob;

@ObfuscatedName("gv")
public class class173 extends class190 {

    @ObfuscatedName("gv.ak")
    public long field1850 = System.nanoTime();

    @ObfuscatedName("gv.ak(I)V")
    public void method3220() {
        this.field1850 = System.nanoTime();
    }

    @ObfuscatedName("gv.al(IIB)I")
    public int method3221(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1850 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class327.method8101(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1850 < var7)) {
            var9++;
            this.field1850 += (long) arg0 * 1000000L;
        }
        if (this.field1850 < var7) {
            this.field1850 = var7;
        }
        return var9;
    }
}
