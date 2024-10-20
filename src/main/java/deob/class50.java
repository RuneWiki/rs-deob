package deob;

@ObfuscatedName("ay")
public class class50 extends class90 {

    @ObfuscatedName("ay.f")
    public int field983;

    @ObfuscatedName("ay.i")
    public int field981;

    @ObfuscatedName("ay.u")
    public int field975;

    @ObfuscatedName("ay.h")
    public int field982;

    @ObfuscatedName("ay.r")
    public int field977;

    @ObfuscatedName("ay.o")
    public int field978;

    @ObfuscatedName("ay.l")
    public class202 field979;

    @ObfuscatedName("ay.n")
    public int field980;

    @ObfuscatedName("ay.m")
    public int field974;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field983 = arg0;
        this.field981 = arg1;
        this.field975 = arg2;
        this.field982 = arg3;
        this.field977 = arg4;
        this.field978 = arg5;
        if (arg6 != -1) {
            this.field979 = class202.method164(arg6);
            this.field980 = 0;
            this.field974 = client.field312 - 1;
            if (this.field979.field3074 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field979 == var10.field979) {
                    this.field980 = var10.field980;
                    this.field974 = var10.field974;
                    return;
                }
            }
            if (arg7 && this.field979.field3065 != -1) {
                this.field980 = (int) (Math.random() * (double) this.field979.field3061.length);
                this.field974 -= (int) (Math.random() * (double) this.field979.field3066[this.field980]);
            }
        }
    }

    @ObfuscatedName("ay.u(B)Lce;")
    public final class83 method209() {
        if (this.field979 != null) {
            int var1 = client.field312 - this.field974;
            if (var1 > 100 && this.field979.field3065 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field979.field3066[this.field980]) {
                            break label47;
                        }
                        var1 -= this.field979.field3066[this.field980];
                        this.field980++;
                    } while (this.field980 < this.field979.field3061.length);
                    this.field980 -= this.field979.field3065;
                } while (this.field980 >= 0 && this.field980 < this.field979.field3061.length);
                this.field979 = null;
            }
            this.field974 = client.field312 - var1;
        }
        class198 var2 = class198.method2502(this.field983);
        if (var2.field2939 != null) {
            var2 = var2.method3423();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field975 == 1 || this.field975 == 3) {
            var3 = var2.field2914;
            var4 = var2.field2943;
        } else {
            var3 = var2.field2943;
            var4 = var2.field2914;
        }
        int var5 = (var3 >> 1) + this.field977;
        int var6 = (var3 + 1 >> 1) + this.field977;
        int var7 = (var4 >> 1) + this.field978;
        int var8 = (var4 + 1 >> 1) + this.field978;
        int[][] var9 = class11.field103[this.field982];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field977 << 7) + (var3 << 6);
        int var12 = (this.field978 << 7) + (var4 << 6);
        return var2.method3421(this.field981, this.field975, var9, var11, var10, var12, this.field979, this.field980);
    }
}
