package deob;

@ObfuscatedName("w")
public class class80 extends class144 {

    @ObfuscatedName("w.g")
    public int field897;

    @ObfuscatedName("w.e")
    public int field890;

    @ObfuscatedName("w.n")
    public class166 field902;

    @ObfuscatedName("w.o")
    public int field892;

    @ObfuscatedName("w.j")
    public int field895;

    @ObfuscatedName("w.h")
    public int field894;

    @ObfuscatedName("w.t")
    public int field893;

    @ObfuscatedName("w.r")
    public int field903;

    @ObfuscatedName("w.p")
    public int field901;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class144 arg8) {
        this.field895 = arg0;
        this.field901 = arg1;
        this.field892 = arg2;
        this.field893 = arg3;
        this.field894 = arg4;
        this.field903 = arg5;
        if (arg6 != -1) {
            this.field902 = class166.method274(arg6);
            this.field897 = 0;
            this.field890 = client.field1483 - 1;
            if (this.field902.field2524 == 0 && arg8 != null && arg8 instanceof class80) {
                class80 var10 = (class80) arg8;
                if (this.field902 == var10.field902) {
                    this.field897 = var10.field897;
                    this.field890 = var10.field890;
                    return;
                }
            }
            if (arg7 && this.field902.field2533 != -1) {
                this.field897 = (int) (Math.random() * (double) this.field902.field2529.length);
                this.field890 -= (int) (Math.random() * (double) this.field902.field2531[this.field897]);
            }
        }
    }

    @ObfuscatedName("w.p(B)Ldi;")
    public final class41 method784() {
        if (this.field902 != null) {
            int var1 = client.field1483 - this.field890;
            if (var1 > 100 && this.field902.field2533 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field902.field2531[this.field897]) {
                            break label47;
                        }
                        var1 -= this.field902.field2531[this.field897];
                        this.field897++;
                    } while (this.field897 < this.field902.field2529.length);
                    this.field897 -= this.field902.field2533;
                } while (this.field897 >= 0 && this.field897 < this.field902.field2529.length);
                this.field902 = null;
            }
            this.field890 = client.field1483 - var1;
        }
        class184 var2 = Statics.method2861(this.field895);
        if (var2.field2831 != null) {
            var2 = var2.method3503();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field892 == 1 || this.field892 == 3) {
            var3 = var2.field2834;
            var4 = var2.field2804;
        } else {
            var3 = var2.field2804;
            var4 = var2.field2834;
        }
        int var5 = (var3 >> 1) + this.field894;
        int var6 = (var3 + 1 >> 1) + this.field894;
        int var7 = (var4 >> 1) + this.field903;
        int var8 = (var4 + 1 >> 1) + this.field903;
        int[][] var9 = class60.field511[this.field893];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field894 << 7) + (var3 << 6);
        int var12 = (this.field903 << 7) + (var4 << 6);
        return var2.method3501(this.field901, this.field892, var9, var11, var10, var12, this.field902, this.field897);
    }
}
