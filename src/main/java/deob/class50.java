package deob;

@ObfuscatedName("au")
public class class50 extends class90 {

    @ObfuscatedName("au.s")
    public int field959;

    @ObfuscatedName("au.c")
    public int field947;

    @ObfuscatedName("au.f")
    public int field948;

    @ObfuscatedName("au.h")
    public int field949;

    @ObfuscatedName("au.a")
    public int field950;

    @ObfuscatedName("au.g")
    public int field952;

    @ObfuscatedName("au.k")
    public class202 field951;

    @ObfuscatedName("au.u")
    public int field953;

    @ObfuscatedName("au.b")
    public int field946;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field959 = arg0;
        this.field947 = arg1;
        this.field948 = arg2;
        this.field949 = arg3;
        this.field950 = arg4;
        this.field952 = arg5;
        if (arg6 != -1) {
            this.field951 = class202.method1914(arg6);
            this.field953 = 0;
            this.field946 = client.field304 - 1;
            if (this.field951.field3070 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field951 == var10.field951) {
                    this.field953 = var10.field953;
                    this.field946 = var10.field946;
                    return;
                }
            }
            if (arg7 && this.field951.field3066 != -1) {
                this.field953 = (int) (Math.random() * (double) this.field951.field3076.length);
                this.field946 -= (int) (Math.random() * (double) this.field951.field3064[this.field953]);
            }
        }
    }

    @ObfuscatedName("au.f(I)Lcz;")
    public final class83 method195() {
        if (this.field951 != null) {
            int var1 = client.field304 - this.field946;
            if (var1 > 100 && this.field951.field3066 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field951.field3064[this.field953]) {
                            break label47;
                        }
                        var1 -= this.field951.field3064[this.field953];
                        this.field953++;
                    } while (this.field953 < this.field951.field3076.length);
                    this.field953 -= this.field951.field3066;
                } while (this.field953 >= 0 && this.field953 < this.field951.field3076.length);
                this.field951 = null;
            }
            this.field946 = client.field304 - var1;
        }
        class198 var2 = class198.method2454(this.field959);
        if (var2.field2939 != null) {
            var2 = var2.method3288();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field948 == 1 || this.field948 == 3) {
            var3 = var2.field2916;
            var4 = var2.field2915;
        } else {
            var3 = var2.field2915;
            var4 = var2.field2916;
        }
        int var5 = (var3 >> 1) + this.field950;
        int var6 = (var3 + 1 >> 1) + this.field950;
        int var7 = (var4 >> 1) + this.field952;
        int var8 = (var4 + 1 >> 1) + this.field952;
        int[][] var9 = class11.field93[this.field949];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field950 << 7) + (var3 << 6);
        int var12 = (this.field952 << 7) + (var4 << 6);
        return var2.method3286(this.field947, this.field948, var9, var11, var10, var12, this.field951, this.field953);
    }
}
