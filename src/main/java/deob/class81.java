package deob;

@ObfuscatedName("cy")
public final class class81 extends class130 {

    @ObfuscatedName("cy.f")
    public int field1173;

    @ObfuscatedName("cy.h")
    public int field1163;

    @ObfuscatedName("cy.e")
    public int field1164;

    @ObfuscatedName("cy.b")
    public int field1165;

    @ObfuscatedName("cy.l")
    public int field1172;

    @ObfuscatedName("cy.w")
    public int field1176;

    @ObfuscatedName("cy.d")
    public int field1162;

    @ObfuscatedName("cy.n")
    public int field1167;

    @ObfuscatedName("cy.s")
    public int field1170;

    @ObfuscatedName("cy.g")
    public int field1171;

    @ObfuscatedName("cy.a")
    public int field1187;

    @ObfuscatedName("cy.r")
    public boolean field1184 = false;

    @ObfuscatedName("cy.k")
    public double field1174;

    @ObfuscatedName("cy.m")
    public double field1175;

    @ObfuscatedName("cy.q")
    public double field1182;

    @ObfuscatedName("cy.x")
    public double field1169;

    @ObfuscatedName("cy.u")
    public double field1178;

    @ObfuscatedName("cy.o")
    public double field1179;

    @ObfuscatedName("cy.t")
    public double field1180;

    @ObfuscatedName("cy.v")
    public double field1181;

    @ObfuscatedName("cy.p")
    public int field1177;

    @ObfuscatedName("cy.z")
    public int field1183;

    @ObfuscatedName("cy.j")
    public class276 field1168;

    @ObfuscatedName("cy.i")
    public int field1185 = 0;

    @ObfuscatedName("cy.c")
    public int field1186 = 0;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1173 = arg0;
        this.field1163 = arg1;
        this.field1164 = arg2;
        this.field1165 = arg3;
        this.field1172 = arg4;
        this.field1162 = arg5;
        this.field1167 = arg6;
        this.field1170 = arg7;
        this.field1171 = arg8;
        this.field1187 = arg9;
        this.field1176 = arg10;
        this.field1184 = false;
        int var12 = class261.method2874(this.field1173).field3321;
        if (var12 == -1) {
            this.field1168 = null;
        } else {
            this.field1168 = class276.method2865(var12);
        }
    }

    @ObfuscatedName("cy.f(IIIII)V")
    public final void method1767(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1184) {
            double var5 = (double) (arg0 - this.field1164);
            double var7 = (double) (arg1 - this.field1165);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1174 = (double) this.field1171 * var5 / var9 + (double) this.field1164;
            this.field1175 = (double) this.field1171 * var7 / var9 + (double) this.field1165;
            this.field1182 = (double) this.field1172;
        }
        double var11 = (double) (this.field1167 + 1 - arg3);
        this.field1169 = ((double) arg0 - this.field1174) / var11;
        this.field1178 = ((double) arg1 - this.field1175) / var11;
        this.field1179 = Math.sqrt(this.field1178 * this.field1178 + this.field1169 * this.field1169);
        if (!this.field1184) {
            this.field1180 = -this.field1179 * Math.tan((double) this.field1170 * 0.02454369D);
        }
        this.field1181 = ((double) arg2 - this.field1182 - this.field1180 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cy.h(IB)V")
    public final void method1773(int arg0) {
        this.field1184 = true;
        this.field1174 += (double) arg0 * this.field1169;
        this.field1175 += (double) arg0 * this.field1178;
        this.field1182 += this.field1181 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1180;
        this.field1180 += (double) arg0 * this.field1181;
        this.field1177 = (int) (Math.atan2(this.field1169, this.field1178) * 325.949D) + 1024 & 0x7FF;
        this.field1183 = (int) (Math.atan2(this.field1180, this.field1179) * 325.949D) & 0x7FF;
        if (this.field1168 == null) {
            return;
        }
        this.field1186 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1186 <= this.field1168.field3599[this.field1185]) {
                        return;
                    }
                    this.field1186 -= this.field1168.field3599[this.field1185];
                    this.field1185++;
                } while (this.field1185 < this.field1168.field3597.length);
                this.field1185 -= this.field1168.field3601;
            } while (this.field1185 >= 0 && this.field1185 < this.field1168.field3597.length);
            this.field1185 = 0;
        }
    }

    @ObfuscatedName("cy.s(B)Lds;")
    public final class122 method1038() {
        class261 var1 = class261.method2874(this.field1173);
        class122 var2 = var1.method4493(this.field1185);
        if (var2 == null) {
            return null;
        } else {
            var2.method2500(this.field1183);
            return var2;
        }
    }
}
