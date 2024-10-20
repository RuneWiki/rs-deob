package deob;

@ObfuscatedName("fy")
public class class164 extends class171 {

    @ObfuscatedName("fy.s")
    public long field1998 = System.nanoTime();

    @ObfuscatedName("fy.s(I)V")
    public void method3170() {
        this.field1998 = System.nanoTime();
    }

    @ObfuscatedName("fy.j(III)I")
    public int method3173(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1998 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class298.method4739(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1998 < var7)) {
            var9++;
            this.field1998 += (long) arg0 * 1000000L;
        }
        if (this.field1998 < var7) {
            this.field1998 = var7;
        }
        return var9;
    }
}
