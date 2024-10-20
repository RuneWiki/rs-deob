package deob;

import java.io.IOException;

@ObfuscatedName("cy")
public class class96 {

    @ObfuscatedName("cy.s")
    public class305 field1289;

    @ObfuscatedName("cy.j")
    public class261 field1286 = new class261();

    @ObfuscatedName("cy.i")
    public int field1287 = 0;

    @ObfuscatedName("cy.k")
    public class300 field1288 = new class300(5000);

    @ObfuscatedName("cy.u")
    public class328 field1300;

    @ObfuscatedName("cy.n")
    public class299 field1293 = new class299(40000);

    @ObfuscatedName("cy.t")
    public class183 field1291 = null;

    @ObfuscatedName("cy.q")
    public int field1290 = 0;

    @ObfuscatedName("cy.x")
    public boolean field1285 = true;

    @ObfuscatedName("cy.d")
    public int field1294 = 0;

    @ObfuscatedName("cy.f")
    public int field1298 = 0;

    @ObfuscatedName("cy.c")
    public class183 field1296;

    @ObfuscatedName("cy.r")
    public class183 field1297;

    @ObfuscatedName("cy.y")
    public class183 field1292;

    @ObfuscatedName("cy.s(I)V")
    public final void method2058() {
        this.field1286.method4405();
        this.field1287 = 0;
    }

    @ObfuscatedName("cy.j(S)V")
    public final void method2048() throws IOException {
        if (this.field1289 == null || this.field1287 <= 0) {
            return;
        }
        this.field1288.field3704 = 0;
        while (true) {
            class188 var1 = (class188) this.field1286.method4426();
            if (var1 == null || var1.field2315 > this.field1288.field3701.length - this.field1288.field3704) {
                this.field1289.method3229(this.field1288.field3701, 0, this.field1288.field3704);
                this.field1298 = 0;
                break;
            }
            this.field1288.method5158(var1.field2321.field3701, 0, var1.field2315);
            this.field1287 -= var1.field2315;
            var1.method3304();
            var1.field2321.method5035();
            var1.method3328();
        }
    }

    @ObfuscatedName("cy.i(Lgq;I)V")
    public final void method2049(class188 arg0) {
        this.field1286.method4465(arg0);
        arg0.field2315 = arg0.field2321.field3704;
        arg0.field2321.field3704 = 0;
        this.field1287 += arg0.field2315;
    }

    @ObfuscatedName("cy.k(Lkg;I)V")
    public void method2052(class305 arg0) {
        this.field1289 = arg0;
    }

    @ObfuscatedName("cy.u(B)V")
    public void method2056() {
        if (this.field1289 != null) {
            this.field1289.method3223();
            this.field1289 = null;
        }
    }

    @ObfuscatedName("cy.n(I)V")
    public void method2070() {
        this.field1289 = null;
    }

    @ObfuscatedName("cy.t(S)Lkg;")
    public class305 method2055() {
        return this.field1289;
    }
}
