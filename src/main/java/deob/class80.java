package deob;

@ObfuscatedName("cg")
public class class80 extends class67 {

    @ObfuscatedName("cg.u")
    public long field1401 = System.nanoTime();

    @ObfuscatedName("cg.u(I)V")
    public void method1333() {
        this.field1401 = System.nanoTime();
    }

    @ObfuscatedName("cg.k(III)I")
    public int method1334(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1401 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class125.method1228(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1401 < var7)) {
            var9++;
            this.field1401 += (long) arg0 * 1000000L;
        }
        if (this.field1401 < var7) {
            this.field1401 = var7;
        }
        return var9;
    }
}
