package deob;

@ObfuscatedName("ek")
public class class152 extends class163 {

    @ObfuscatedName("ek.v")
    public long field1964 = System.nanoTime();

    @ObfuscatedName("ek.v(I)V")
    public void method2959() {
        this.field1964 = System.nanoTime();
    }

    @ObfuscatedName("ek.s(III)I")
    public int method2960(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1964 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class194.method668(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1964 < var7)) {
            var9++;
            this.field1964 += (long) arg0 * 1000000L;
        }
        if (this.field1964 < var7) {
            this.field1964 = var7;
        }
        return var9;
    }
}
