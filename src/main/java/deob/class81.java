package deob;

@ObfuscatedName("cu")
public final class class81 extends class130 {

    @ObfuscatedName("cu.f")
    public int field1198;

    @ObfuscatedName("cu.l")
    public int field1174;

    @ObfuscatedName("cu.w")
    public int field1175;

    @ObfuscatedName("cu.s")
    public int field1176;

    @ObfuscatedName("cu.e")
    public int field1182;

    @ObfuscatedName("cu.a")
    public int field1178;

    @ObfuscatedName("cu.c")
    public int field1179;

    @ObfuscatedName("cu.p")
    public int field1194;

    @ObfuscatedName("cu.r")
    public int field1181;

    @ObfuscatedName("cu.m")
    public int field1177;

    @ObfuscatedName("cu.d")
    public int field1183;

    @ObfuscatedName("cu.z")
    public boolean field1189 = false;

    @ObfuscatedName("cu.x")
    public double field1193;

    @ObfuscatedName("cu.v")
    public double field1186;

    @ObfuscatedName("cu.g")
    public double field1187;

    @ObfuscatedName("cu.j")
    public double field1188;

    @ObfuscatedName("cu.b")
    public double field1180;

    @ObfuscatedName("cu.u")
    public double field1190;

    @ObfuscatedName("cu.t")
    public double field1191;

    @ObfuscatedName("cu.n")
    public double field1192;

    @ObfuscatedName("cu.h")
    public int field1197;

    @ObfuscatedName("cu.o")
    public int field1185;

    @ObfuscatedName("cu.i")
    public class276 field1195;

    @ObfuscatedName("cu.k")
    public int field1196 = 0;

    @ObfuscatedName("cu.q")
    public int field1184 = 0;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1198 = arg0;
        this.field1174 = arg1;
        this.field1175 = arg2;
        this.field1176 = arg3;
        this.field1182 = arg4;
        this.field1179 = arg5;
        this.field1194 = arg6;
        this.field1181 = arg7;
        this.field1177 = arg8;
        this.field1183 = arg9;
        this.field1178 = arg10;
        this.field1189 = false;
        int var12 = class261.method2403(this.field1198).field3334;
        if (var12 == -1) {
            this.field1195 = null;
        } else {
            this.field1195 = class276.method3224(var12);
        }
    }

    @ObfuscatedName("cu.f(IIIII)V")
    public final void method1823(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1189) {
            double var5 = (double) (arg0 - this.field1175);
            double var7 = (double) (arg1 - this.field1176);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1193 = (double) this.field1177 * var5 / var9 + (double) this.field1175;
            this.field1186 = (double) this.field1177 * var7 / var9 + (double) this.field1176;
            this.field1187 = (double) this.field1182;
        }
        double var11 = (double) (this.field1194 + 1 - arg3);
        this.field1188 = ((double) arg0 - this.field1193) / var11;
        this.field1180 = ((double) arg1 - this.field1186) / var11;
        this.field1190 = Math.sqrt(this.field1188 * this.field1188 + this.field1180 * this.field1180);
        if (!this.field1189) {
            this.field1191 = -this.field1190 * Math.tan((double) this.field1181 * 0.02454369D);
        }
        this.field1192 = ((double) arg2 - this.field1187 - this.field1191 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cu.l(II)V")
    public final void method1820(int arg0) {
        this.field1189 = true;
        this.field1193 += (double) arg0 * this.field1188;
        this.field1186 += (double) arg0 * this.field1180;
        this.field1187 += this.field1192 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1191;
        this.field1191 += (double) arg0 * this.field1192;
        this.field1197 = (int) (Math.atan2(this.field1188, this.field1180) * 325.949D) + 1024 & 0x7FF;
        this.field1185 = (int) (Math.atan2(this.field1191, this.field1190) * 325.949D) & 0x7FF;
        if (this.field1195 == null) {
            return;
        }
        this.field1184 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1184 <= this.field1195.field3617[this.field1196]) {
                        return;
                    }
                    this.field1184 -= this.field1195.field3617[this.field1196];
                    this.field1196++;
                } while (this.field1196 < this.field1195.field3625.length);
                this.field1196 -= this.field1195.field3619;
            } while (this.field1196 >= 0 && this.field1196 < this.field1195.field3625.length);
            this.field1196 = 0;
        }
    }

    @ObfuscatedName("cu.m(S)Lds;")
    public final class122 method1042() {
        class261 var1 = class261.method2403(this.field1198);
        class122 var2 = var1.method4533(this.field1196);
        if (var2 == null) {
            return null;
        } else {
            var2.method2545(this.field1185);
            return var2;
        }
    }
}
