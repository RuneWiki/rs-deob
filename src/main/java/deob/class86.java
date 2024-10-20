package deob;

@ObfuscatedName("ct")
public final class class86 extends class135 {

    @ObfuscatedName("ct.a")
    public int field1205;

    @ObfuscatedName("ct.s")
    public int field1210;

    @ObfuscatedName("ct.g")
    public int field1214;

    @ObfuscatedName("ct.x")
    public int field1198;

    @ObfuscatedName("ct.h")
    public int field1199;

    @ObfuscatedName("ct.f")
    public int field1200;

    @ObfuscatedName("ct.p")
    public int field1209;

    @ObfuscatedName("ct.m")
    public int field1202;

    @ObfuscatedName("ct.q")
    public int field1203;

    @ObfuscatedName("ct.b")
    public int field1204;

    @ObfuscatedName("ct.n")
    public int field1196;

    @ObfuscatedName("ct.e")
    public boolean field1206 = false;

    @ObfuscatedName("ct.r")
    public double field1207;

    @ObfuscatedName("ct.t")
    public double field1208;

    @ObfuscatedName("ct.l")
    public double field1201;

    @ObfuscatedName("ct.o")
    public double field1213;

    @ObfuscatedName("ct.u")
    public double field1211;

    @ObfuscatedName("ct.y")
    public double field1212;

    @ObfuscatedName("ct.k")
    public double field1218;

    @ObfuscatedName("ct.v")
    public double field1195;

    @ObfuscatedName("ct.d")
    public int field1197;

    @ObfuscatedName("ct.w")
    public int field1216;

    @ObfuscatedName("ct.i")
    public class280 field1217;

    @ObfuscatedName("ct.c")
    public int field1215 = 0;

    @ObfuscatedName("ct.j")
    public int field1219 = 0;

    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1205 = arg0;
        this.field1210 = arg1;
        this.field1214 = arg2;
        this.field1198 = arg3;
        this.field1199 = arg4;
        this.field1209 = arg5;
        this.field1202 = arg6;
        this.field1203 = arg7;
        this.field1204 = arg8;
        this.field1196 = arg9;
        this.field1200 = arg10;
        this.field1206 = false;
        int var12 = class265.method2303(this.field1205).field3359;
        if (var12 == -1) {
            this.field1217 = null;
        } else {
            this.field1217 = class280.method3173(var12);
        }
    }

    @ObfuscatedName("ct.a(IIIII)V")
    public final void method1957(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1206) {
            double var5 = (double) (arg0 - this.field1214);
            double var7 = (double) (arg1 - this.field1198);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1207 = (double) this.field1204 * var5 / var9 + (double) this.field1214;
            this.field1208 = (double) this.field1204 * var7 / var9 + (double) this.field1198;
            this.field1201 = (double) this.field1199;
        }
        double var11 = (double) (this.field1202 + 1 - arg3);
        this.field1213 = ((double) arg0 - this.field1207) / var11;
        this.field1211 = ((double) arg1 - this.field1208) / var11;
        this.field1212 = Math.sqrt(this.field1213 * this.field1213 + this.field1211 * this.field1211);
        if (!this.field1206) {
            this.field1218 = -this.field1212 * Math.tan((double) this.field1203 * 0.02454369D);
        }
        this.field1195 = ((double) arg2 - this.field1201 - this.field1218 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ct.s(II)V")
    public final void method1960(int arg0) {
        this.field1206 = true;
        this.field1207 += (double) arg0 * this.field1213;
        this.field1208 += (double) arg0 * this.field1211;
        this.field1201 += this.field1195 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1218;
        this.field1218 += (double) arg0 * this.field1195;
        this.field1197 = (int) (Math.atan2(this.field1213, this.field1211) * 325.949D) + 1024 & 0x7FF;
        this.field1216 = (int) (Math.atan2(this.field1218, this.field1212) * 325.949D) & 0x7FF;
        if (this.field1217 == null) {
            return;
        }
        this.field1219 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1219 <= this.field1217.field3622[this.field1215]) {
                        return;
                    }
                    this.field1219 -= this.field1217.field3622[this.field1215];
                    this.field1215++;
                } while (this.field1215 < this.field1217.field3620.length);
                this.field1215 -= this.field1217.field3624;
            } while (this.field1215 >= 0 && this.field1215 < this.field1217.field3620.length);
            this.field1215 = 0;
        }
    }

    @ObfuscatedName("ct.q(I)Ldv;")
    public final class127 method1112() {
        class265 var1 = class265.method2303(this.field1205);
        class127 var2 = var1.method4644(this.field1215);
        if (var2 == null) {
            return null;
        } else {
            var2.method2737(this.field1216);
            return var2;
        }
    }
}
