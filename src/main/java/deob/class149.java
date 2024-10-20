package deob;

@ObfuscatedName("cn")
public class class149 extends class123 {

    @ObfuscatedName("cn.b")
    public long field2245 = System.nanoTime();

    @ObfuscatedName("cn.h(III)I")
    public int method2188(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2245 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class134.method600(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2245 < var7)) {
            var9++;
            this.field2245 += (long) arg0 * 1000000L;
        }
        if (this.field2245 < var7) {
            this.field2245 = var7;
        }
        return var9;
    }

    @ObfuscatedName("cn.b(I)V")
    public void method2187() {
        this.field2245 = System.nanoTime();
    }
}
