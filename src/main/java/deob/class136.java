package deob;

@ObfuscatedName("em")
public class class136 extends class122 {

    @ObfuscatedName("em.g")
    public long field2060 = System.nanoTime();

    @ObfuscatedName("em.g(I)V")
    public void method2414() {
        this.field2060 = System.nanoTime();
    }

    @ObfuscatedName("em.j(III)I")
    public int method2415(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2060 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class116.method154(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2060 < var7)) {
            var9++;
            this.field2060 += (long) arg0 * 1000000L;
        }
        if (this.field2060 < var7) {
            this.field2060 = var7;
        }
        return var9;
    }
}
