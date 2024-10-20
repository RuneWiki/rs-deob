package deob;

@ObfuscatedName("eq")
public class class148 extends class134 {

    @ObfuscatedName("eq.j")
    public long field2201 = System.nanoTime();

    @ObfuscatedName("eq.j(B)V")
    public void method2677() {
        this.field2201 = System.nanoTime();
    }

    @ObfuscatedName("eq.h(III)I")
    public int method2678(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2201 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class128.method167(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2201 < var7)) {
            var9++;
            this.field2201 += (long) arg0 * 1000000L;
        }
        if (this.field2201 < var7) {
            this.field2201 = var7;
        }
        return var9;
    }
}
