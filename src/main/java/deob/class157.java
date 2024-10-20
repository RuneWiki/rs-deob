package deob;

@ObfuscatedName("fp")
public class class157 extends class168 {

    @ObfuscatedName("fp.a")
    public long field1996 = System.nanoTime();

    @ObfuscatedName("fp.a(B)V")
    public void method3180() {
        this.field1996 = System.nanoTime();
    }

    @ObfuscatedName("fp.s(III)I")
    public int method3183(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1996 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class199.method3774(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1996 < var7)) {
            var9++;
            this.field1996 += (long) arg0 * 1000000L;
        }
        if (this.field1996 < var7) {
            this.field1996 = var7;
        }
        return var9;
    }
}
