package deob;

@ObfuscatedName("es")
public class class152 extends class160 {

    @ObfuscatedName("es.c")
    public long field1672 = System.nanoTime();

    @ObfuscatedName("es.c(B)V")
    public void method2770() {
        this.field1672 = System.nanoTime();
    }

    @ObfuscatedName("es.b(III)I")
    public int method2761(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1672 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class417.method5965(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1672 < var7)) {
            var9++;
            this.field1672 += (long) arg0 * 1000000L;
        }
        if (this.field1672 < var7) {
            this.field1672 = var7;
        }
        return var9;
    }
}
