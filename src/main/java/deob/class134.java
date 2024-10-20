package deob;

@ObfuscatedName("em")
public class class134 extends class120 {

    @ObfuscatedName("em.i")
    public long field2065 = System.nanoTime();

    @ObfuscatedName("em.i(I)V")
    public void method2470() {
        this.field2065 = System.nanoTime();
    }

    @ObfuscatedName("em.c(III)I")
    public int method2472(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field2065 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class114.method743(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field2065 < var7)) {
            var9++;
            this.field2065 += (long) arg0 * 1000000L;
        }
        if (this.field2065 < var7) {
            this.field2065 = var7;
        }
        return var9;
    }
}
