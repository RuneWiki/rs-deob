package deob;

@ObfuscatedName("di")
public class class80 extends class273 {

    @ObfuscatedName("di.at")
    public int field985;

    @ObfuscatedName("di.ah")
    public int field986;

    @ObfuscatedName("di.ar")
    public int field991;

    @ObfuscatedName("di.ao")
    public int field987;

    @ObfuscatedName("di.ab")
    public int field989;

    @ObfuscatedName("di.au")
    public int field990;

    @ObfuscatedName("di.aa")
    public class205 field988;

    @ObfuscatedName("di.ac")
    public int field992;

    @ObfuscatedName("di.al")
    public int field993;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class273 arg8) {
        this.field985 = arg0;
        this.field986 = arg1;
        this.field991 = arg2;
        this.field987 = arg3;
        this.field989 = arg4;
        this.field990 = arg5;
        if (arg6 != -1) {
            this.field988 = class205.method2129(arg6);
            this.field992 = 0;
            this.field993 = client.field500 - 1;
            if (this.field988.field2231 == 0 && arg8 != null && arg8 instanceof class80) {
                class80 var10 = (class80) arg8;
                if (this.field988 == var10.field988) {
                    this.field992 = var10.field992;
                    this.field993 = var10.field993;
                    return;
                }
            }
            if (arg7 && this.field988.field2228 != -1) {
                if (this.field988.method3733()) {
                    this.field992 = (int) (Math.random() * (double) this.field988.method3749());
                } else {
                    this.field992 = (int) (Math.random() * (double) this.field988.field2216.length);
                    this.field993 -= (int) (Math.random() * (double) this.field988.field2218[this.field992]);
                }
            }
        }
    }

    @ObfuscatedName("di.ah(B)Lka;")
    public final class280 method2019() {
        if (this.field988 != null) {
            int var1 = client.field500 - this.field993;
            if (var1 > 100 && this.field988.field2228 > 0) {
                var1 = 100;
            }
            if (this.field988.method3733()) {
                int var2 = this.field988.method3749();
                this.field992 += var1;
                var1 = 0;
                if (this.field992 >= var2) {
                    this.field992 = var2 - this.field988.field2228;
                    if (this.field992 < 0 || this.field992 > var2) {
                        this.field988 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field988.field2218[this.field992]) {
                                break label69;
                            }
                            var1 -= this.field988.field2218[this.field992];
                            this.field992++;
                        } while (this.field992 < this.field988.field2216.length);
                        this.field992 -= this.field988.field2228;
                    } while (this.field992 >= 0 && this.field992 < this.field988.field2216.length);
                    this.field988 = null;
                }
            }
            this.field993 = client.field500 - var1;
        }
        class202 var3 = Statics.method4138(this.field985);
        if (var3.field2114 != null) {
            var3 = var3.method3592();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field991 == 1 || this.field991 == 3) {
            var4 = var3.field2100;
            var5 = var3.field2091;
        } else {
            var4 = var3.field2091;
            var5 = var3.field2100;
        }
        int var6 = (var4 >> 1) + this.field989;
        int var7 = (var4 + 1 >> 1) + this.field989;
        int var8 = (var5 >> 1) + this.field990;
        int var9 = (var5 + 1 >> 1) + this.field990;
        int[][] var10 = class82.field1014[this.field987];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field989 << 7) + (var4 << 6);
        int var13 = (this.field990 << 7) + (var5 << 6);
        return var3.method3581(this.field986, this.field991, var10, var12, var11, var13, this.field988, this.field992);
    }
}
