package deob;

@ObfuscatedName("gu")
public class class165 extends class179 {

    @ObfuscatedName("gu.af")
    public long field1796 = System.nanoTime();

    @ObfuscatedName("gu.af(I)V")
    public void method3186() {
        this.field1796 = System.nanoTime();
    }

    @ObfuscatedName("gu.an(III)I")
    public int method3190(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1796 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class295.method5489(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1796 < var7)) {
            var9++;
            this.field1796 += (long) arg0 * 1000000L;
        }
        if (this.field1796 < var7) {
            this.field1796 = var7;
        }
        return var9;
    }
}
