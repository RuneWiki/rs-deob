package deob;

@ObfuscatedName("cy")
public class class97 implements Runnable {

    @ObfuscatedName("cy.f")
    public boolean field1164 = true;

    @ObfuscatedName("cy.o")
    public Object field1158 = new Object();

    @ObfuscatedName("cy.u")
    public int field1160 = 0;

    @ObfuscatedName("cy.p")
    public int[] field1161 = new int[500];

    @ObfuscatedName("cy.b")
    public int[] field1162 = new int[500];

    @ObfuscatedName("cy.e")
    public long[] field1163 = new long[500];

    public void run() {
        while (this.field1164) {
            Object var1 = this.field1158;
            synchronized (this.field1158) {
                if (this.field1160 < 500) {
                    this.field1161[this.field1160] = class48.field342;
                    this.field1162[this.field1160] = class48.field357;
                    this.field1163[this.field1160] = class48.field350;
                    this.field1160++;
                }
            }
            class380.method4072(50L);
        }
    }
}
