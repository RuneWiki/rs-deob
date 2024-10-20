package deob;

@ObfuscatedName("av")
public class class50 extends class90 {

    @ObfuscatedName("av.q")
    public int field975;

    @ObfuscatedName("av.d")
    public int field974;

    @ObfuscatedName("av.h")
    public int field979;

    @ObfuscatedName("av.p")
    public int field976;

    @ObfuscatedName("av.j")
    public int field984;

    @ObfuscatedName("av.n")
    public int field978;

    @ObfuscatedName("av.r")
    public class202 field983;

    @ObfuscatedName("av.c")
    public int field980;

    @ObfuscatedName("av.i")
    public int field981;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field975 = arg0;
        this.field974 = arg1;
        this.field979 = arg2;
        this.field976 = arg3;
        this.field984 = arg4;
        this.field978 = arg5;
        if (arg6 != -1) {
            this.field983 = class202.method3379(arg6);
            this.field980 = 0;
            this.field981 = client.field450 - 1;
            if (this.field983.field3070 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field983 == var10.field983) {
                    this.field980 = var10.field980;
                    this.field981 = var10.field981;
                    return;
                }
            }
            if (arg7 && this.field983.field3068 != -1) {
                this.field980 = (int) (Math.random() * (double) this.field983.field3057.length);
                this.field981 -= (int) (Math.random() * (double) this.field983.field3064[this.field980]);
            }
        }
    }

    @ObfuscatedName("av.h(I)Lcf;")
    public final class83 method229() {
        if (this.field983 != null) {
            int var1 = client.field450 - this.field981;
            if (var1 > 100 && this.field983.field3068 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field983.field3064[this.field980]) {
                            break label47;
                        }
                        var1 -= this.field983.field3064[this.field980];
                        this.field980++;
                    } while (this.field980 < this.field983.field3057.length);
                    this.field980 -= this.field983.field3068;
                } while (this.field980 >= 0 && this.field980 < this.field983.field3057.length);
                this.field983 = null;
            }
            this.field981 = client.field450 - var1;
        }
        class198 var2 = class198.method3257(this.field975);
        if (var2.field2935 != null) {
            var2 = var2.method3432();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field979 == 1 || this.field979 == 3) {
            var3 = var2.field2917;
            var4 = var2.field2909;
        } else {
            var3 = var2.field2909;
            var4 = var2.field2917;
        }
        int var5 = (var3 >> 1) + this.field984;
        int var6 = (var3 + 1 >> 1) + this.field984;
        int var7 = (var4 >> 1) + this.field978;
        int var8 = (var4 + 1 >> 1) + this.field978;
        int[][] var9 = class11.field114[this.field976];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field984 << 7) + (var3 << 6);
        int var12 = (this.field978 << 7) + (var4 << 6);
        return var2.method3430(this.field974, this.field979, var9, var11, var10, var12, this.field983, this.field980);
    }
}
