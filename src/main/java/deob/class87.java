package deob;

@ObfuscatedName("ch")
public final class class87 extends class136 {

    @ObfuscatedName("ch.f")
    public int field1209;

    @ObfuscatedName("ch.i")
    public int field1210;

    @ObfuscatedName("ch.y")
    public int field1193;

    @ObfuscatedName("ch.w")
    public int field1203;

    @ObfuscatedName("ch.p")
    public int field1195;

    @ObfuscatedName("ch.b")
    public int field1196;

    @ObfuscatedName("ch.e")
    public int field1197;

    @ObfuscatedName("ch.x")
    public int field1201;

    @ObfuscatedName("ch.a")
    public int field1199;

    @ObfuscatedName("ch.d")
    public int field1200;

    @ObfuscatedName("ch.c")
    public int field1191;

    @ObfuscatedName("ch.o")
    public boolean field1216 = false;

    @ObfuscatedName("ch.v")
    public double field1192;

    @ObfuscatedName("ch.k")
    public double field1204;

    @ObfuscatedName("ch.s")
    public double field1205;

    @ObfuscatedName("ch.l")
    public double field1206;

    @ObfuscatedName("ch.t")
    public double field1208;

    @ObfuscatedName("ch.j")
    public double field1219;

    @ObfuscatedName("ch.n")
    public double field1202;

    @ObfuscatedName("ch.u")
    public double field1198;

    @ObfuscatedName("ch.z")
    public int field1211;

    @ObfuscatedName("ch.h")
    public int field1212;

    @ObfuscatedName("ch.m")
    public class259 field1213;

    @ObfuscatedName("ch.g")
    public int field1214 = 0;

    @ObfuscatedName("ch.r")
    public int field1215 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1209 = arg0;
        this.field1210 = arg1;
        this.field1193 = arg2;
        this.field1203 = arg3;
        this.field1195 = arg4;
        this.field1197 = arg5;
        this.field1201 = arg6;
        this.field1199 = arg7;
        this.field1200 = arg8;
        this.field1191 = arg9;
        this.field1196 = arg10;
        this.field1216 = false;
        int var12 = class244.method3267(this.field1209).field3215;
        if (var12 == -1) {
            this.field1213 = null;
        } else {
            this.field1213 = class259.method209(var12);
        }
    }

    @ObfuscatedName("ch.f(IIIIS)V")
    public final void method1939(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1216) {
            double var5 = (double) (arg0 - this.field1193);
            double var7 = (double) (arg1 - this.field1203);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1192 = (double) this.field1200 * var5 / var9 + (double) this.field1193;
            this.field1204 = (double) this.field1200 * var7 / var9 + (double) this.field1203;
            this.field1205 = (double) this.field1195;
        }
        double var11 = (double) (this.field1201 + 1 - arg3);
        this.field1206 = ((double) arg0 - this.field1192) / var11;
        this.field1208 = ((double) arg1 - this.field1204) / var11;
        this.field1219 = Math.sqrt(this.field1208 * this.field1208 + this.field1206 * this.field1206);
        if (!this.field1216) {
            this.field1202 = -this.field1219 * Math.tan((double) this.field1199 * 0.02454369D);
        }
        this.field1198 = ((double) arg2 - this.field1205 - this.field1202 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ch.i(II)V")
    public final void method1940(int arg0) {
        this.field1216 = true;
        this.field1192 += (double) arg0 * this.field1206;
        this.field1204 += (double) arg0 * this.field1208;
        this.field1205 += this.field1198 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1202;
        this.field1202 += (double) arg0 * this.field1198;
        this.field1211 = (int) (Math.atan2(this.field1206, this.field1208) * 325.949D) + 1024 & 0x7FF;
        this.field1212 = (int) (Math.atan2(this.field1202, this.field1219) * 325.949D) & 0x7FF;
        if (this.field1213 == null) {
            return;
        }
        this.field1215 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1215 <= this.field1213.field3485[this.field1214]) {
                        return;
                    }
                    this.field1215 -= this.field1213.field3485[this.field1214];
                    this.field1214++;
                } while (this.field1214 < this.field1213.field3483.length);
                this.field1214 -= this.field1213.field3490;
            } while (this.field1214 >= 0 && this.field1214 < this.field1213.field3483.length);
            this.field1214 = 0;
        }
    }

    @ObfuscatedName("ch.a(I)Ldw;")
    public final class128 method1101() {
        class244 var1 = class244.method3267(this.field1209);
        class128 var2 = var1.method4025(this.field1214);
        if (var2 == null) {
            return null;
        } else {
            var2.method2688(this.field1212);
            return var2;
        }
    }
}
