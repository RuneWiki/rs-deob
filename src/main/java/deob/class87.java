package deob;

@ObfuscatedName("cy")
public final class class87 extends class136 {

    @ObfuscatedName("cy.z")
    public int field1210;

    @ObfuscatedName("cy.n")
    public int field1206;

    @ObfuscatedName("cy.v")
    public int field1209;

    @ObfuscatedName("cy.u")
    public int field1200;

    @ObfuscatedName("cy.r")
    public int field1199;

    @ObfuscatedName("cy.p")
    public int field1202;

    @ObfuscatedName("cy.q")
    public int field1213;

    @ObfuscatedName("cy.m")
    public int field1204;

    @ObfuscatedName("cy.y")
    public int field1205;

    @ObfuscatedName("cy.i")
    public int field1216;

    @ObfuscatedName("cy.c")
    public int field1207;

    @ObfuscatedName("cy.b")
    public boolean field1208 = false;

    @ObfuscatedName("cy.o")
    public double field1201;

    @ObfuscatedName("cy.a")
    public double field1220;

    @ObfuscatedName("cy.e")
    public double field1211;

    @ObfuscatedName("cy.w")
    public double field1212;

    @ObfuscatedName("cy.t")
    public double field1222;

    @ObfuscatedName("cy.g")
    public double field1203;

    @ObfuscatedName("cy.x")
    public double field1215;

    @ObfuscatedName("cy.h")
    public double field1214;

    @ObfuscatedName("cy.s")
    public int field1217;

    @ObfuscatedName("cy.f")
    public int field1218;

    @ObfuscatedName("cy.j")
    public class259 field1219;

    @ObfuscatedName("cy.d")
    public int field1197 = 0;

    @ObfuscatedName("cy.l")
    public int field1221 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1210 = arg0;
        this.field1206 = arg1;
        this.field1209 = arg2;
        this.field1200 = arg3;
        this.field1199 = arg4;
        this.field1213 = arg5;
        this.field1204 = arg6;
        this.field1205 = arg7;
        this.field1216 = arg8;
        this.field1207 = arg9;
        this.field1202 = arg10;
        this.field1208 = false;
        int var12 = class244.method1038(this.field1210).field3224;
        if (var12 == -1) {
            this.field1219 = null;
        } else {
            this.field1219 = class259.method122(var12);
        }
    }

    @ObfuscatedName("cy.z(IIIII)V")
    public final void method1920(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1208) {
            double var5 = (double) (arg0 - this.field1209);
            double var7 = (double) (arg1 - this.field1200);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1201 = (double) this.field1216 * var5 / var9 + (double) this.field1209;
            this.field1220 = (double) this.field1216 * var7 / var9 + (double) this.field1200;
            this.field1211 = (double) this.field1199;
        }
        double var11 = (double) (this.field1204 + 1 - arg3);
        this.field1212 = ((double) arg0 - this.field1201) / var11;
        this.field1222 = ((double) arg1 - this.field1220) / var11;
        this.field1203 = Math.sqrt(this.field1222 * this.field1222 + this.field1212 * this.field1212);
        if (!this.field1208) {
            this.field1215 = -this.field1203 * Math.tan((double) this.field1205 * 0.02454369D);
        }
        this.field1214 = ((double) arg2 - this.field1211 - this.field1215 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cy.n(IS)V")
    public final void method1919(int arg0) {
        this.field1208 = true;
        this.field1201 += (double) arg0 * this.field1212;
        this.field1220 += (double) arg0 * this.field1222;
        this.field1211 += this.field1214 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1215;
        this.field1215 += (double) arg0 * this.field1214;
        this.field1217 = (int) (Math.atan2(this.field1212, this.field1222) * 325.949D) + 1024 & 0x7FF;
        this.field1218 = (int) (Math.atan2(this.field1215, this.field1203) * 325.949D) & 0x7FF;
        if (this.field1219 == null) {
            return;
        }
        this.field1221 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1221 <= this.field1219.field3507[this.field1197]) {
                        return;
                    }
                    this.field1221 -= this.field1219.field3507[this.field1197];
                    this.field1197++;
                } while (this.field1197 < this.field1219.field3515.length);
                this.field1197 -= this.field1219.field3509;
            } while (this.field1197 >= 0 && this.field1197 < this.field1219.field3515.length);
            this.field1197 = 0;
        }
    }

    @ObfuscatedName("cy.y(I)Ldh;")
    public final class128 method1115() {
        class244 var1 = class244.method1038(this.field1210);
        class128 var2 = var1.method3979(this.field1197);
        if (var2 == null) {
            return null;
        } else {
            var2.method2602(this.field1218);
            return var2;
        }
    }
}
