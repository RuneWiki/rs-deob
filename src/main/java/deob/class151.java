package deob;

@ObfuscatedName("ei")
public class class151 extends class137 {

    @ObfuscatedName("ei.l")
    public long field2282 = System.nanoTime();

    @ObfuscatedName("ei.g(B)V")
    public void method2847() {
        this.field2282 = System.nanoTime();
    }

    @ObfuscatedName("ei.r(III)I")
    public int method2849(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2282 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class131.method587(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2282 < var7)) {
            var9++;
            this.field2282 += (long) arg0 * 1000000L;
        }
        if (this.field2282 < var7) {
            this.field2282 = var7;
        }
        return var9;
    }
}
