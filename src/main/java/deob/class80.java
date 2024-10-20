package deob;

@ObfuscatedName("dl")
public class class80 extends class232 {

    @ObfuscatedName("dl.at")
    public int field1004;

    @ObfuscatedName("dl.an")
    public int field1001;

    @ObfuscatedName("dl.av")
    public int field1002;

    @ObfuscatedName("dl.as")
    public int field1006;

    @ObfuscatedName("dl.ax")
    public int field1007;

    @ObfuscatedName("dl.ap")
    public int field1005;

    @ObfuscatedName("dl.ab")
    public class208 field1000;

    @ObfuscatedName("dl.ak")
    public int field1003;

    @ObfuscatedName("dl.ae")
    public int field1008;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class232 arg8) {
        this.field1004 = arg0;
        this.field1001 = arg1;
        this.field1002 = arg2;
        this.field1006 = arg3;
        this.field1007 = arg4;
        this.field1005 = arg5;
        if (arg6 != -1) {
            this.field1000 = class208.method4648(arg6);
            this.field1003 = 0;
            this.field1008 = client.field506 - 1;
            if (this.field1000.field2300 == 0 && arg8 != null && arg8 instanceof class80) {
                class80 var10 = (class80) arg8;
                if (this.field1000 == var10.field1000) {
                    this.field1003 = var10.field1003;
                    this.field1008 = var10.field1008;
                    return;
                }
            }
            if (arg7 && this.field1000.field2289 != -1) {
                if (this.field1000.method3754()) {
                    this.field1003 = (int) (Math.random() * (double) this.field1000.method3757());
                } else {
                    this.field1003 = (int) (Math.random() * (double) this.field1000.field2285.length);
                    this.field1008 -= (int) (Math.random() * (double) this.field1000.field2287[this.field1003]);
                }
            }
        }
    }

    @ObfuscatedName("dl.an(I)Ljd;")
    public final class239 method1952() {
        if (this.field1000 != null) {
            int var1 = client.field506 - this.field1008;
            if (var1 > 100 && this.field1000.field2289 > 0) {
                var1 = 100;
            }
            if (this.field1000.method3754()) {
                int var2 = this.field1000.method3757();
                this.field1003 += var1;
                var1 = 0;
                if (this.field1003 >= var2) {
                    this.field1003 = var2 - this.field1000.field2289;
                    if (this.field1003 < 0 || this.field1003 > var2) {
                        this.field1000 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1000.field2287[this.field1003]) {
                                break label69;
                            }
                            var1 -= this.field1000.field2287[this.field1003];
                            this.field1003++;
                        } while (this.field1003 < this.field1000.field2285.length);
                        this.field1003 -= this.field1000.field2289;
                    } while (this.field1003 >= 0 && this.field1003 < this.field1000.field2285.length);
                    this.field1000 = null;
                }
            }
            this.field1008 = client.field506 - var1;
        }
        class205 var3 = class205.method3219(this.field1004);
        if (var3.field2152 != null) {
            var3 = var3.method3578();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1002 == 1 || this.field1002 == 3) {
            var4 = var3.field2161;
            var5 = var3.field2160;
        } else {
            var4 = var3.field2160;
            var5 = var3.field2161;
        }
        int var6 = (var4 >> 1) + this.field1007;
        int var7 = (var4 + 1 >> 1) + this.field1007;
        int var8 = (var5 >> 1) + this.field1005;
        int var9 = (var5 + 1 >> 1) + this.field1005;
        int[][] var10 = class82.field1016[this.field1006];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1007 << 7) + (var4 << 6);
        int var13 = (this.field1005 << 7) + (var5 << 6);
        return var3.method3617(this.field1001, this.field1002, var10, var12, var11, var13, this.field1000, this.field1003);
    }
}
