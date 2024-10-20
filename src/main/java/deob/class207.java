package deob;

@ObfuscatedName("hx")
public class class207 extends class224 {

    @ObfuscatedName("hx.am")
    public long field2264 = System.nanoTime();

    @ObfuscatedName("hx.am(I)V")
    public void method3802() {
        this.field2264 = System.nanoTime();
    }

    @ObfuscatedName("hx.ap(III)I")
    public int method3804(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2264 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class317.method2871(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2264 < var7)) {
            var9++;
            this.field2264 += (long) arg0 * 1000000L;
        }
        if (this.field2264 < var7) {
            this.field2264 = var7;
        }
        return var9;
    }
}
