package deob;

@ObfuscatedName("cn")
public class class80 extends class67 {

    @ObfuscatedName("cn.z")
    public long field1420 = System.nanoTime();

    @ObfuscatedName("cn.z(B)V")
    public void method1327() {
        this.field1420 = System.nanoTime();
    }

    @ObfuscatedName("cn.h(III)I")
    public int method1331(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1420 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class125.method2379(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1420 < var7)) {
            var9++;
            this.field1420 += (long) arg0 * 1000000L;
        }
        if (this.field1420 < var7) {
            this.field1420 = var7;
        }
        return var9;
    }
}
