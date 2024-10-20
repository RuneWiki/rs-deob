package deob;

@ObfuscatedName("eb")
public class class139 extends class125 {

    @ObfuscatedName("eb.y")
    public long field2143 = System.nanoTime();

    @ObfuscatedName("eb.y(I)V")
    public void method2512() {
        this.field2143 = System.nanoTime();
    }

    @ObfuscatedName("eb.k(IIB)I")
    public int method2513(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2143 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method488(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2143 < var7)) {
            var9++;
            this.field2143 += (long) arg0 * 1000000L;
        }
        if (this.field2143 < var7) {
            this.field2143 = var7;
        }
        return var9;
    }
}
