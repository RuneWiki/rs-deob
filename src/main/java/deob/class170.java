package deob;

@ObfuscatedName("gv")
public class class170 extends class187 {

    @ObfuscatedName("gv.az")
    public long field1836 = System.nanoTime();

    @ObfuscatedName("gv.az(I)V")
    public void method3134() {
        this.field1836 = System.nanoTime();
    }

    @ObfuscatedName("gv.ah(III)I")
    public int method3133(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1836 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class319.method7909(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1836 < var7)) {
            var9++;
            this.field1836 += (long) arg0 * 1000000L;
        }
        if (this.field1836 < var7) {
            this.field1836 = var7;
        }
        return var9;
    }
}
