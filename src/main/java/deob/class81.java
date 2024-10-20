package deob;

@ObfuscatedName("cg")
public final class class81 extends class130 {

    @ObfuscatedName("cg.y")
    public int field1198;

    @ObfuscatedName("cg.c")
    public int field1202;

    @ObfuscatedName("cg.n")
    public int field1177;

    @ObfuscatedName("cg.u")
    public int field1178;

    @ObfuscatedName("cg.i")
    public int field1191;

    @ObfuscatedName("cg.r")
    public int field1180;

    @ObfuscatedName("cg.j")
    public int field1181;

    @ObfuscatedName("cg.p")
    public int field1186;

    @ObfuscatedName("cg.e")
    public int field1183;

    @ObfuscatedName("cg.s")
    public int field1184;

    @ObfuscatedName("cg.v")
    public int field1185;

    @ObfuscatedName("cg.k")
    public boolean field1179 = false;

    @ObfuscatedName("cg.o")
    public double field1187;

    @ObfuscatedName("cg.q")
    public double field1175;

    @ObfuscatedName("cg.l")
    public double field1189;

    @ObfuscatedName("cg.f")
    public double field1190;

    @ObfuscatedName("cg.z")
    public double field1200;

    @ObfuscatedName("cg.a")
    public double field1176;

    @ObfuscatedName("cg.x")
    public double field1193;

    @ObfuscatedName("cg.b")
    public double field1194;

    @ObfuscatedName("cg.w")
    public int field1195;

    @ObfuscatedName("cg.g")
    public int field1196;

    @ObfuscatedName("cg.d")
    public class276 field1197;

    @ObfuscatedName("cg.m")
    public int field1192 = 0;

    @ObfuscatedName("cg.t")
    public int field1199 = 0;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1198 = arg0;
        this.field1202 = arg1;
        this.field1177 = arg2;
        this.field1178 = arg3;
        this.field1191 = arg4;
        this.field1181 = arg5;
        this.field1186 = arg6;
        this.field1183 = arg7;
        this.field1184 = arg8;
        this.field1185 = arg9;
        this.field1180 = arg10;
        this.field1179 = false;
        int var12 = class261.method1754(this.field1198).field3323;
        if (var12 == -1) {
            this.field1197 = null;
        } else {
            this.field1197 = class276.method3241(var12);
        }
    }

    @ObfuscatedName("cg.y(IIIIB)V")
    public final void method1759(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1179) {
            double var5 = (double) (arg0 - this.field1177);
            double var7 = (double) (arg1 - this.field1178);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1187 = (double) this.field1184 * var5 / var9 + (double) this.field1177;
            this.field1175 = (double) this.field1184 * var7 / var9 + (double) this.field1178;
            this.field1189 = (double) this.field1191;
        }
        double var11 = (double) (this.field1186 + 1 - arg3);
        this.field1190 = ((double) arg0 - this.field1187) / var11;
        this.field1200 = ((double) arg1 - this.field1175) / var11;
        this.field1176 = Math.sqrt(this.field1200 * this.field1200 + this.field1190 * this.field1190);
        if (!this.field1179) {
            this.field1193 = -this.field1176 * Math.tan((double) this.field1183 * 0.02454369D);
        }
        this.field1194 = ((double) arg2 - this.field1189 - this.field1193 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cg.c(II)V")
    public final void method1757(int arg0) {
        this.field1179 = true;
        this.field1187 += (double) arg0 * this.field1190;
        this.field1175 += (double) arg0 * this.field1200;
        this.field1189 += this.field1194 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1193;
        this.field1193 += (double) arg0 * this.field1194;
        this.field1195 = (int) (Math.atan2(this.field1190, this.field1200) * 325.949D) + 1024 & 0x7FF;
        this.field1196 = (int) (Math.atan2(this.field1193, this.field1176) * 325.949D) & 0x7FF;
        if (this.field1197 == null) {
            return;
        }
        this.field1199 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1199 <= this.field1197.field3586[this.field1192]) {
                        return;
                    }
                    this.field1199 -= this.field1197.field3586[this.field1192];
                    this.field1192++;
                } while (this.field1192 < this.field1197.field3594.length);
                this.field1192 -= this.field1197.field3592;
            } while (this.field1192 >= 0 && this.field1192 < this.field1197.field3594.length);
            this.field1192 = 0;
        }
    }

    @ObfuscatedName("cg.v(I)Lde;")
    public final class122 method1059() {
        class261 var1 = class261.method1754(this.field1198);
        class122 var2 = var1.method4499(this.field1192);
        if (var2 == null) {
            return null;
        } else {
            var2.method2532(this.field1196);
            return var2;
        }
    }
}
