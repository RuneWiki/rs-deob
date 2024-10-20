package deob;

@ObfuscatedName("ah")
public class class50 extends class90 {

    @ObfuscatedName("ah.x")
    public int field967;

    @ObfuscatedName("ah.n")
    public int field964;

    @ObfuscatedName("ah.g")
    public int field971;

    @ObfuscatedName("ah.v")
    public int field966;

    @ObfuscatedName("ah.y")
    public int field969;

    @ObfuscatedName("ah.p")
    public int field968;

    @ObfuscatedName("ah.j")
    public class202 field965;

    @ObfuscatedName("ah.m")
    public int field970;

    @ObfuscatedName("ah.a")
    public int field974;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field967 = arg0;
        this.field964 = arg1;
        this.field971 = arg2;
        this.field966 = arg3;
        this.field969 = arg4;
        this.field968 = arg5;
        if (arg6 != -1) {
            this.field965 = Statics.method1464(arg6);
            this.field970 = 0;
            this.field974 = client.field432 - 1;
            if (this.field965.field3076 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field965 == var10.field965) {
                    this.field970 = var10.field970;
                    this.field974 = var10.field974;
                    return;
                }
            }
            if (arg7 && this.field965.field3067 != -1) {
                this.field970 = (int) (Math.random() * (double) this.field965.field3063.length);
                this.field974 -= (int) (Math.random() * (double) this.field965.field3064[this.field970]);
            }
        }
    }

    @ObfuscatedName("ah.g(B)Lcj;")
    public final class83 method240() {
        if (this.field965 != null) {
            int var1 = client.field432 - this.field974;
            if (var1 > 100 && this.field965.field3067 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field965.field3064[this.field970]) {
                            break label47;
                        }
                        var1 -= this.field965.field3064[this.field970];
                        this.field970++;
                    } while (this.field970 < this.field965.field3063.length);
                    this.field970 -= this.field965.field3067;
                } while (this.field970 >= 0 && this.field970 < this.field965.field3063.length);
                this.field965 = null;
            }
            this.field974 = client.field432 - var1;
        }
        class198 var2 = Statics.method935(this.field967);
        if (var2.field2940 != null) {
            var2 = var2.method3493();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field971 == 1 || this.field971 == 3) {
            var3 = var2.field2933;
            var4 = var2.field2914;
        } else {
            var3 = var2.field2914;
            var4 = var2.field2933;
        }
        int var5 = (var3 >> 1) + this.field969;
        int var6 = (var3 + 1 >> 1) + this.field969;
        int var7 = (var4 >> 1) + this.field968;
        int var8 = (var4 + 1 >> 1) + this.field968;
        int[][] var9 = class11.field87[this.field966];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field969 << 7) + (var3 << 6);
        int var12 = (this.field968 << 7) + (var4 << 6);
        return var2.method3459(this.field964, this.field971, var9, var11, var10, var12, this.field965, this.field970);
    }
}
