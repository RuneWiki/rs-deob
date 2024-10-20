package deob;

@ObfuscatedName("eb")
public class class148 extends class134 {

    @ObfuscatedName("eb.w")
    public long field2241 = System.nanoTime();

    @ObfuscatedName("eb.w(B)V")
    public void method2714() {
        this.field2241 = System.nanoTime();
    }

    @ObfuscatedName("eb.x(III)I")
    public int method2708(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2241 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class128.method2158(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2241 < var7)) {
            var9++;
            this.field2241 += (long) arg0 * 1000000L;
        }
        if (this.field2241 < var7) {
            this.field2241 = var7;
        }
        return var9;
    }
}
