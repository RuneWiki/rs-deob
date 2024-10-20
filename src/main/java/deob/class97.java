package deob;

@ObfuscatedName("cy")
public class class97 {

    @ObfuscatedName("cy.w")
    public int field1348 = 2;

    @ObfuscatedName("cy.m")
    public int[] field1345 = new int[2];

    @ObfuscatedName("cy.q")
    public int[] field1346 = new int[2];

    @ObfuscatedName("cy.b")
    public int field1347;

    @ObfuscatedName("cy.f")
    public int field1349;

    @ObfuscatedName("cy.n")
    public int field1354;

    @ObfuscatedName("cy.h")
    public int field1344;

    @ObfuscatedName("cy.j")
    public int field1351;

    @ObfuscatedName("cy.a")
    public int field1350;

    @ObfuscatedName("cy.l")
    public int field1353;

    @ObfuscatedName("cy.d")
    public int field1352;

    public class97() {
        this.field1345[0] = 0;
        this.field1345[1] = 65535;
        this.field1346[0] = 0;
        this.field1346[1] = 65535;
    }

    @ObfuscatedName("cy.w(Lgy;)V")
    public final void method2092(class183 arg0) {
        this.field1354 = arg0.method3436();
        this.field1347 = arg0.method3267();
        this.field1349 = arg0.method3267();
        this.method2084(arg0);
    }

    @ObfuscatedName("cy.m(Lgy;)V")
    public final void method2084(class183 arg0) {
        this.field1348 = arg0.method3436();
        this.field1345 = new int[this.field1348];
        this.field1346 = new int[this.field1348];
        for (int var2 = 0; var2 < this.field1348; var2++) {
            this.field1345[var2] = arg0.method3268();
            this.field1346[var2] = arg0.method3268();
        }
    }

    @ObfuscatedName("cy.q()V")
    public final void method2085() {
        this.field1344 = 0;
        this.field1351 = 0;
        this.field1350 = 0;
        this.field1353 = 0;
        this.field1352 = 0;
    }

    @ObfuscatedName("cy.x(I)I")
    public final int method2088(int arg0) {
        if (this.field1352 >= this.field1344) {
            this.field1353 = this.field1346[this.field1351++] << 15;
            if (this.field1351 >= this.field1348) {
                this.field1351 = this.field1348 - 1;
            }
            this.field1344 = (int) ((double) this.field1345[this.field1351] / 65536.0D * (double) arg0);
            if (this.field1344 > this.field1352) {
                this.field1350 = ((this.field1346[this.field1351] << 15) - this.field1353) / (this.field1344 - this.field1352);
            }
        }
        this.field1353 += this.field1350;
        this.field1352++;
        return this.field1353 - this.field1350 >> 15;
    }
}
