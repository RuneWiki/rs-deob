package deob;

@ObfuscatedName("fk")
public class class165 extends class179 {

    @ObfuscatedName("fk.f")
    public long field1814 = System.nanoTime();

    @ObfuscatedName("fk.f(I)V")
    public void method3151() {
        this.field1814 = System.nanoTime();
    }

    @ObfuscatedName("fk.w(III)I")
    public int method3146(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1814 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class288.method3270(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1814 < var7)) {
            var9++;
            this.field1814 += (long) arg0 * 1000000L;
        }
        if (this.field1814 < var7) {
            this.field1814 = var7;
        }
        return var9;
    }
}
