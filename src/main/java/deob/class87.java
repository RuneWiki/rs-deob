package deob;

@ObfuscatedName("cy")
public final class class87 extends class136 {

    @ObfuscatedName("cy.a")
    public int field1194;

    @ObfuscatedName("cy.t")
    public int field1193;

    @ObfuscatedName("cy.n")
    public int field1215;

    @ObfuscatedName("cy.q")
    public int field1206;

    @ObfuscatedName("cy.v")
    public int field1196;

    @ObfuscatedName("cy.l")
    public int field1192;

    @ObfuscatedName("cy.c")
    public int field1198;

    @ObfuscatedName("cy.o")
    public int field1202;

    @ObfuscatedName("cy.i")
    public int field1195;

    @ObfuscatedName("cy.d")
    public int field1201;

    @ObfuscatedName("cy.m")
    public int field1203;

    @ObfuscatedName("cy.p")
    public boolean field1208 = false;

    @ObfuscatedName("cy.h")
    public double field1204;

    @ObfuscatedName("cy.k")
    public double field1199;

    @ObfuscatedName("cy.x")
    public double field1197;

    @ObfuscatedName("cy.j")
    public double field1207;

    @ObfuscatedName("cy.r")
    public double field1205;

    @ObfuscatedName("cy.e")
    public double field1209;

    @ObfuscatedName("cy.s")
    public double field1210;

    @ObfuscatedName("cy.b")
    public double field1211;

    @ObfuscatedName("cy.z")
    public int field1212;

    @ObfuscatedName("cy.f")
    public int field1213;

    @ObfuscatedName("cy.g")
    public class259 field1214;

    @ObfuscatedName("cy.w")
    public int field1200 = 0;

    @ObfuscatedName("cy.u")
    public int field1216 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1194 = arg0;
        this.field1193 = arg1;
        this.field1215 = arg2;
        this.field1206 = arg3;
        this.field1196 = arg4;
        this.field1198 = arg5;
        this.field1202 = arg6;
        this.field1195 = arg7;
        this.field1201 = arg8;
        this.field1203 = arg9;
        this.field1192 = arg10;
        this.field1208 = false;
        int var12 = class244.method1992(this.field1194).field3225;
        if (var12 == -1) {
            this.field1214 = null;
        } else {
            this.field1214 = class259.method3856(var12);
        }
    }

    @ObfuscatedName("cy.a(IIIII)V")
    public final void method2039(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1208) {
            double var5 = (double) (arg0 - this.field1215);
            double var7 = (double) (arg1 - this.field1206);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1204 = (double) this.field1201 * var5 / var9 + (double) this.field1215;
            this.field1199 = (double) this.field1201 * var7 / var9 + (double) this.field1206;
            this.field1197 = (double) this.field1196;
        }
        double var11 = (double) (this.field1202 + 1 - arg3);
        this.field1207 = ((double) arg0 - this.field1204) / var11;
        this.field1205 = ((double) arg1 - this.field1199) / var11;
        this.field1209 = Math.sqrt(this.field1207 * this.field1207 + this.field1205 * this.field1205);
        if (!this.field1208) {
            this.field1210 = -this.field1209 * Math.tan((double) this.field1195 * 0.02454369D);
        }
        this.field1211 = ((double) arg2 - this.field1197 - this.field1210 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cy.t(II)V")
    public final void method2040(int arg0) {
        this.field1208 = true;
        this.field1204 += (double) arg0 * this.field1207;
        this.field1199 += (double) arg0 * this.field1205;
        this.field1197 += this.field1211 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1210;
        this.field1210 += (double) arg0 * this.field1211;
        this.field1212 = (int) (Math.atan2(this.field1207, this.field1205) * 325.949D) + 1024 & 0x7FF;
        this.field1213 = (int) (Math.atan2(this.field1210, this.field1209) * 325.949D) & 0x7FF;
        if (this.field1214 == null) {
            return;
        }
        this.field1216 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1216 <= this.field1214.field3511[this.field1200]) {
                        return;
                    }
                    this.field1216 -= this.field1214.field3511[this.field1200];
                    this.field1200++;
                } while (this.field1200 < this.field1214.field3521.length);
                this.field1200 -= this.field1214.field3513;
            } while (this.field1200 >= 0 && this.field1200 < this.field1214.field3521.length);
            this.field1200 = 0;
        }
    }

    @ObfuscatedName("cy.i(B)Ldv;")
    public final class128 method1159() {
        class244 var1 = class244.method1992(this.field1194);
        class128 var2 = var1.method4119(this.field1200);
        if (var2 == null) {
            return null;
        } else {
            var2.method2744(this.field1213);
            return var2;
        }
    }
}
