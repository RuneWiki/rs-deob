package deob;

@ObfuscatedName("cn")
public class class81 extends class68 {

    @ObfuscatedName("cn.x")
    public long field1397 = System.nanoTime();

    @ObfuscatedName("cn.x(B)V")
    public void method1318() {
        this.field1397 = System.nanoTime();
    }

    @ObfuscatedName("cn.p(III)I")
    public int method1319(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1397 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method731(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1397 < var7)) {
            var9++;
            this.field1397 += (long) arg0 * 1000000L;
        }
        if (this.field1397 < var7) {
            this.field1397 = var7;
        }
        return var9;
    }
}
