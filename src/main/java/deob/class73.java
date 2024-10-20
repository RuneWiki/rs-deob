package deob;

@ObfuscatedName("bo")
public class class73 extends class205 {

    @ObfuscatedName("bo.c")
    public int field990;

    @ObfuscatedName("bo.v")
    public int field981;

    @ObfuscatedName("bo.q")
    public int field985;

    @ObfuscatedName("bo.f")
    public int field983;

    @ObfuscatedName("bo.j")
    public int field984;

    @ObfuscatedName("bo.e")
    public int field987;

    @ObfuscatedName("bo.g")
    public class190 field986;

    @ObfuscatedName("bo.w")
    public int field982;

    @ObfuscatedName("bo.y")
    public int field988;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class205 arg8) {
        this.field990 = arg0;
        this.field981 = arg1;
        this.field985 = arg2;
        this.field983 = arg3;
        this.field984 = arg4;
        this.field987 = arg5;
        if (arg6 != -1) {
            this.field986 = class190.method983(arg6);
            this.field982 = 0;
            this.field988 = client.field552 - 1;
            if (this.field986.field2175 == 0 && arg8 != null && arg8 instanceof class73) {
                class73 var10 = (class73) arg8;
                if (this.field986 == var10.field986) {
                    this.field982 = var10.field982;
                    this.field988 = var10.field988;
                    return;
                }
            }
            if (arg7 && this.field986.field2178 != -1) {
                if (this.field986.method3509()) {
                    this.field982 = (int) (Math.random() * (double) this.field986.method3510());
                } else {
                    this.field982 = (int) (Math.random() * (double) this.field986.field2176.length);
                    this.field988 -= (int) (Math.random() * (double) this.field986.field2180[this.field982]);
                }
            }
        }
    }

    @ObfuscatedName("bo.v(I)Lhy;")
    public final class211 method1782() {
        if (this.field986 != null) {
            int var1 = client.field552 - this.field988;
            if (var1 > 100 && this.field986.field2178 > 0) {
                var1 = 100;
            }
            if (this.field986.method3509()) {
                int var2 = this.field986.method3510();
                this.field982 += var1;
                var1 = 0;
                if (this.field982 >= var2) {
                    this.field982 = var2 - this.field986.field2178;
                    if (this.field982 < 0 || this.field982 > var2) {
                        this.field986 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field986.field2180[this.field982]) {
                                break label69;
                            }
                            var1 -= this.field986.field2180[this.field982];
                            this.field982++;
                        } while (this.field982 < this.field986.field2176.length);
                        this.field982 -= this.field986.field2178;
                    } while (this.field982 >= 0 && this.field982 < this.field986.field2176.length);
                    this.field986 = null;
                }
            }
            this.field988 = client.field552 - var1;
        }
        class187 var3 = class187.method3000(this.field990);
        if (var3.field2082 != null) {
            var3 = var3.method3361();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field985 == 1 || this.field985 == 3) {
            var4 = var3.field2057;
            var5 = var3.field2046;
        } else {
            var4 = var3.field2046;
            var5 = var3.field2057;
        }
        int var6 = (var4 >> 1) + this.field984;
        int var7 = (var4 + 1 >> 1) + this.field984;
        int var8 = (var5 >> 1) + this.field987;
        int var9 = (var5 + 1 >> 1) + this.field987;
        int[][] var10 = class75.field1011[this.field983];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field984 << 7) + (var4 << 6);
        int var13 = (this.field987 << 7) + (var5 << 6);
        return var3.method3337(this.field981, this.field985, var10, var12, var11, var13, this.field986, this.field982);
    }
}
