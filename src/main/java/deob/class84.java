package deob;

@ObfuscatedName("cy")
public final class class84 extends class141 {

    @ObfuscatedName("cy.d")
    public int field1287;

    @ObfuscatedName("cy.x")
    public int field1282;

    @ObfuscatedName("cy.k")
    public int field1280;

    @ObfuscatedName("cy.z")
    public int field1284;

    @ObfuscatedName("cy.v")
    public int field1281;

    @ObfuscatedName("cy.m")
    public int field1283;

    @ObfuscatedName("cy.b")
    public class268 field1285;

    @ObfuscatedName("cy.t")
    public int field1286 = 0;

    @ObfuscatedName("cy.p")
    public int field1279 = 0;

    @ObfuscatedName("cy.r")
    public boolean field1288 = false;

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1287 = arg0;
        this.field1281 = arg1;
        this.field1283 = arg2;
        this.field1282 = arg3;
        this.field1284 = arg4;
        this.field1280 = arg5 + arg6;
        int var8 = class253.method3903(this.field1287).field3394;
        if (var8 == -1) {
            this.field1288 = true;
        } else {
            this.field1288 = false;
            this.field1285 = class268.method76(var8);
        }
    }

    @ObfuscatedName("cy.d(II)V")
    public final void method1594(int arg0) {
        if (this.field1288) {
            return;
        }
        this.field1279 += arg0;
        while (this.field1279 > this.field1285.field3671[this.field1286]) {
            this.field1279 -= this.field1285.field3671[this.field1286];
            this.field1286++;
            if (this.field1286 >= this.field1285.field3669.length) {
                this.field1288 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cy.k(I)Leh;")
    public final class133 method1060() {
        class253 var1 = class253.method3903(this.field1287);
        class133 var2;
        if (this.field1288) {
            var2 = var1.method4151(-1);
        } else {
            var2 = var1.method4151(this.field1286);
        }
        return var2 == null ? null : var2;
    }
}
