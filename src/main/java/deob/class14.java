package deob;

@ObfuscatedName("r")
public class class14 extends class94 {

    @ObfuscatedName("r.p")
    public int field209;

    @ObfuscatedName("r.l")
    public int field211;

    @ObfuscatedName("r.d")
    public int field205;

    @ObfuscatedName("r.x")
    public int field198;

    @ObfuscatedName("r.o")
    public int field199;

    @ObfuscatedName("r.a")
    public int field203;

    @ObfuscatedName("r.w")
    public class34 field201;

    @ObfuscatedName("r.i")
    public int field202;

    @ObfuscatedName("r.y")
    public int field200;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field209 = arg0;
        this.field211 = arg1;
        this.field205 = arg2;
        this.field198 = arg3;
        this.field199 = arg4;
        this.field203 = arg5;
        if (arg6 != -1) {
            this.field201 = class34.method93(arg6);
            this.field202 = 0;
            this.field200 = client.field465 - 1;
            if (this.field201.field864 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field201 == var10.field201) {
                    this.field202 = var10.field202;
                    this.field200 = var10.field200;
                    return;
                }
            }
            if (arg7 && this.field201.field873 != -1) {
                this.field202 = (int) (Math.random() * (double) this.field201.field869.length);
                this.field200 -= (int) (Math.random() * (double) this.field201.field871[this.field202]);
            }
        }
    }

    @ObfuscatedName("r.l(I)Ldl;")
    public final class112 method9() {
        if (this.field201 != null) {
            int var1 = client.field465 - this.field200;
            if (var1 > 100 && this.field201.field873 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field201.field871[this.field202]) {
                            break label47;
                        }
                        var1 -= this.field201.field871[this.field202];
                        this.field202++;
                    } while (this.field202 < this.field201.field869.length);
                    this.field202 -= this.field201.field873;
                } while (this.field202 >= 0 && this.field202 < this.field201.field869.length);
                this.field201 = null;
            }
            this.field200 = client.field465 - var1;
        }
        class32 var2 = class32.method1332(this.field209);
        if (var2.field836 != null) {
            var2 = var2.method684();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field205 == 1 || this.field205 == 3) {
            var3 = var2.field837;
            var4 = var2.field810;
        } else {
            var3 = var2.field810;
            var4 = var2.field837;
        }
        int var5 = (var3 >> 1) + this.field199;
        int var6 = (var3 + 1 >> 1) + this.field199;
        int var7 = (var4 >> 1) + this.field203;
        int var8 = (var4 + 1 >> 1) + this.field203;
        int[][] var9 = class9.field126[this.field198];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field199 << 7) + (var3 << 6);
        int var12 = (this.field203 << 7) + (var4 << 6);
        return var2.method650(this.field211, this.field205, var9, var11, var10, var12, this.field201, this.field202);
    }
}
