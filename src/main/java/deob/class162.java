package deob;

@ObfuscatedName("fm")
public class class162 extends class173 {

    @ObfuscatedName("fm.o")
    public long field2180 = System.nanoTime();

    @ObfuscatedName("fm.o(S)V")
    public void method2934() {
        this.field2180 = System.nanoTime();
    }

    @ObfuscatedName("fm.k(III)I")
    public int method2933(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2180 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class204.method12(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2180 < var7)) {
            var9++;
            this.field2180 += (long) arg0 * 1000000L;
        }
        if (this.field2180 < var7) {
            this.field2180 = var7;
        }
        return var9;
    }
}
