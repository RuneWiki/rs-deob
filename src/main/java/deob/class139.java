package deob;

@ObfuscatedName("ew")
public class class139 extends class125 {

    @ObfuscatedName("ew.q")
    public long field2068 = System.nanoTime();

    @ObfuscatedName("ew.q(B)V")
    public void method2471() {
        this.field2068 = System.nanoTime();
    }

    @ObfuscatedName("ew.s(III)I")
    public int method2475(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2068 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method587(var5 / 1000000L);
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
