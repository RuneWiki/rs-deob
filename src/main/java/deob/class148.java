package deob;

@ObfuscatedName("ed")
public class class148 extends class134 {

    @ObfuscatedName("ed.s")
    public long field2232 = System.nanoTime();

    @ObfuscatedName("ed.j(B)V")
    public void method2679() {
        this.field2232 = System.nanoTime();
    }

    @ObfuscatedName("ed.p(III)I")
    public int method2680(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2232 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class128.method2294(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2232 < var7)) {
            var9++;
            this.field2232 += (long) arg0 * 1000000L;
        }
        if (this.field2232 < var7) {
            this.field2232 = var7;
        }
        return var9;
    }
}
