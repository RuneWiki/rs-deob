package deob;

@ObfuscatedName("cy")
public class class81 extends class68 {

    @ObfuscatedName("cy.i")
    public long field1443 = System.nanoTime();

    @ObfuscatedName("cy.i(I)V")
    public void method1298() {
        this.field1443 = System.nanoTime();
    }

    @ObfuscatedName("cy.p(III)I")
    public int method1297(int arg0, int arg1) {
        long var3 = (long) arg1 * 1000000L;
        long var5 = this.field1443 - System.nanoTime();
        if (var5 < var3) {
            var5 = var3;
        }
        class126.method1489(var5 / 1000000L);
        long var7 = System.nanoTime();
        int var9 = 0;
        while (var9 < 10 && (var9 < 1 || this.field1443 < var7)) {
            var9++;
            this.field1443 += (long) arg0 * 1000000L;
        }
        if (this.field1443 < var7) {
            this.field1443 = var7;
        }
        return var9;
    }
}
