package deob;

@ObfuscatedName("em")
public class class139 extends class125 {

    @ObfuscatedName("em.n")
    public long field2128 = System.nanoTime();

    @ObfuscatedName("em.g(I)V")
    public void method2548() {
        this.field2128 = System.nanoTime();
    }

    @ObfuscatedName("em.a(IIB)I")
    public int method2544(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2128 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class119.method2154(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2128 < var7)) {
            var9++;
            this.field2128 += (long) arg0 * 1000000L;
        }
        if (this.field2128 < var7) {
            this.field2128 = var7;
        }
        return var9;
    }
}
