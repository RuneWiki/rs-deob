package deob;

@ObfuscatedName("cm")
public final class class96 extends class145 {

    @ObfuscatedName("cm.f")
    public int field1266;

    @ObfuscatedName("cm.b")
    public int field1262;

    @ObfuscatedName("cm.l")
    public int field1246;

    @ObfuscatedName("cm.m")
    public int field1247;

    @ObfuscatedName("cm.z")
    public int field1268;

    @ObfuscatedName("cm.q")
    public int field1249;

    @ObfuscatedName("cm.k")
    public int field1253;

    @ObfuscatedName("cm.c")
    public int field1251;

    @ObfuscatedName("cm.u")
    public int field1252;

    @ObfuscatedName("cm.t")
    public int field1248;

    @ObfuscatedName("cm.e")
    public int field1254;

    @ObfuscatedName("cm.o")
    public boolean field1255 = false;

    @ObfuscatedName("cm.n")
    public double field1256;

    @ObfuscatedName("cm.x")
    public double field1257;

    @ObfuscatedName("cm.p")
    public double field1244;

    @ObfuscatedName("cm.r")
    public double field1259;

    @ObfuscatedName("cm.y")
    public double field1258;

    @ObfuscatedName("cm.s")
    public double field1261;

    @ObfuscatedName("cm.j")
    public double field1265;

    @ObfuscatedName("cm.w")
    public double field1263;

    @ObfuscatedName("cm.v")
    public int field1264;

    @ObfuscatedName("cm.d")
    public int field1250;

    @ObfuscatedName("cm.a")
    public class270 field1245;

    @ObfuscatedName("cm.g")
    public int field1260 = 0;

    @ObfuscatedName("cm.h")
    public int field1267 = 0;

    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1266 = arg0;
        this.field1262 = arg1;
        this.field1246 = arg2;
        this.field1247 = arg3;
        this.field1268 = arg4;
        this.field1253 = arg5;
        this.field1251 = arg6;
        this.field1252 = arg7;
        this.field1248 = arg8;
        this.field1254 = arg9;
        this.field1249 = arg10;
        this.field1255 = false;
        int var12 = class255.method1685(this.field1266).field3272;
        if (var12 == -1) {
            this.field1245 = null;
        } else {
            this.field1245 = class270.method2219(var12);
        }
    }

    @ObfuscatedName("cm.f(IIIII)V")
    public final void method2024(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1255) {
            double var5 = (double) (arg0 - this.field1246);
            double var7 = (double) (arg1 - this.field1247);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1256 = (double) this.field1248 * var5 / var9 + (double) this.field1246;
            this.field1257 = (double) this.field1248 * var7 / var9 + (double) this.field1247;
            this.field1244 = (double) this.field1268;
        }
        double var11 = (double) (this.field1251 + 1 - arg3);
        this.field1259 = ((double) arg0 - this.field1256) / var11;
        this.field1258 = ((double) arg1 - this.field1257) / var11;
        this.field1261 = Math.sqrt(this.field1259 * this.field1259 + this.field1258 * this.field1258);
        if (!this.field1255) {
            this.field1265 = -this.field1261 * Math.tan((double) this.field1252 * 0.02454369D);
        }
        this.field1263 = ((double) arg2 - this.field1244 - this.field1265 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cm.b(II)V")
    public final void method2022(int arg0) {
        this.field1255 = true;
        this.field1256 += (double) arg0 * this.field1259;
        this.field1257 += (double) arg0 * this.field1258;
        this.field1244 += this.field1263 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1265;
        this.field1265 += (double) arg0 * this.field1263;
        this.field1264 = (int) (Math.atan2(this.field1259, this.field1258) * 325.949D) + 1024 & 0x7FF;
        this.field1250 = (int) (Math.atan2(this.field1265, this.field1261) * 325.949D) & 0x7FF;
        if (this.field1245 == null) {
            return;
        }
        this.field1267 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1267 <= this.field1245.field3541[this.field1260]) {
                        return;
                    }
                    this.field1267 -= this.field1245.field3541[this.field1260];
                    this.field1260++;
                } while (this.field1260 < this.field1245.field3539.length);
                this.field1260 -= this.field1245.field3543;
            } while (this.field1260 >= 0 && this.field1260 < this.field1245.field3539.length);
            this.field1260 = 0;
        }
    }

    @ObfuscatedName("cm.u(I)Leh;")
    public final class137 method1175() {
        class255 var1 = class255.method1685(this.field1266);
        class137 var2 = var1.method4158(this.field1260);
        if (var2 == null) {
            return null;
        } else {
            var2.method2795(this.field1250);
            return var2;
        }
    }
}
