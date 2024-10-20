package deob;

@ObfuscatedName("eh")
public class class136 extends class122 {

    @ObfuscatedName("eh.c")
    public long field2063 = System.nanoTime();

    @ObfuscatedName("eh.c(I)V")
    public void method2467() {
        this.field2063 = System.nanoTime();
    }

    @ObfuscatedName("eh.j(III)I")
    public int method2465(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2063 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class116.method2713(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2063 < var7)) {
            var9++;
            this.field2063 += (long) arg0 * 1000000L;
        }
        if (this.field2063 < var7) {
            this.field2063 = var7;
        }
        return var9;
    }
}
