package deob;

@ObfuscatedName("et")
public class class134 extends class120 {

    @ObfuscatedName("et.e")
    public long field2068 = System.nanoTime();

    @ObfuscatedName("et.o(B)V")
    public void method2383() {
        this.field2068 = System.nanoTime();
    }

    @ObfuscatedName("et.y(III)I")
    public int method2384(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2068 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method134(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2068 < var7)) {
            var9++;
            this.field2068 += (long) arg0 * 1000000L;
        }
        if (this.field2068 < var7) {
            this.field2068 = var7;
        }
        return var9;
    }
}
