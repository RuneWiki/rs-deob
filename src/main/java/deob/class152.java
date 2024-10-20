package deob;

@ObfuscatedName("ev")
public class class152 extends class163 {

    @ObfuscatedName("ev.p")
    public long field2084 = System.nanoTime();

    @ObfuscatedName("ev.p(B)V")
    public void method2834() {
        this.field2084 = System.nanoTime();
    }

    @ObfuscatedName("ev.i(III)I")
    public int method2831(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2084 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class193.method4(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2084 < var7)) {
            var9++;
            this.field2084 += (long) arg0 * 1000000L;
        }
        if (this.field2084 < var7) {
            this.field2084 = var7;
        }
        return var9;
    }
}
