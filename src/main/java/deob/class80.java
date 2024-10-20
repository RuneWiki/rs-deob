package deob;

@ObfuscatedName("dq")
public class class80 extends class234 {

    @ObfuscatedName("dq.aw")
    public int field1013;

    @ObfuscatedName("dq.ay")
    public int field1006;

    @ObfuscatedName("dq.ar")
    public int field1007;

    @ObfuscatedName("dq.am")
    public int field1014;

    @ObfuscatedName("dq.as")
    public int field1009;

    @ObfuscatedName("dq.aj")
    public int field1010;

    @ObfuscatedName("dq.ag")
    public class210 field1008;

    @ObfuscatedName("dq.az")
    public int field1012;

    @ObfuscatedName("dq.av")
    public int field1011;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class234 arg8) {
        this.field1013 = arg0;
        this.field1006 = arg1;
        this.field1007 = arg2;
        this.field1014 = arg3;
        this.field1009 = arg4;
        this.field1010 = arg5;
        if (arg6 != -1) {
            this.field1008 = class210.method2904(arg6);
            this.field1012 = 0;
            this.field1011 = client.field530 - 1;
            if (this.field1008.field2275 == 0 && arg8 != null && arg8 instanceof class80) {
                class80 var10 = (class80) arg8;
                if (this.field1008 == var10.field1008) {
                    this.field1012 = var10.field1012;
                    this.field1011 = var10.field1011;
                    return;
                }
            }
            if (arg7 && this.field1008.field2284 != -1) {
                if (this.field1008.method3738()) {
                    this.field1012 = (int) (Math.random() * (double) this.field1008.method3739());
                } else {
                    this.field1012 = (int) (Math.random() * (double) this.field1008.field2265.length);
                    this.field1011 -= (int) (Math.random() * (double) this.field1008.field2273[this.field1012]);
                }
            }
        }
    }

    @ObfuscatedName("dq.ay(I)Ljo;")
    public final class241 method1986() {
        if (this.field1008 != null) {
            int var1 = client.field530 - this.field1011;
            if (var1 > 100 && this.field1008.field2284 > 0) {
                var1 = 100;
            }
            if (this.field1008.method3738()) {
                int var2 = this.field1008.method3739();
                this.field1012 += var1;
                var1 = 0;
                if (this.field1012 >= var2) {
                    this.field1012 = var2 - this.field1008.field2284;
                    if (this.field1012 < 0 || this.field1012 > var2) {
                        this.field1008 = null;
                    }
                }
            } else {
                label69: {
                    do {
                        do {
                            if (var1 <= this.field1008.field2273[this.field1012]) {
                                break label69;
                            }
                            var1 -= this.field1008.field2273[this.field1012];
                            this.field1012++;
                        } while (this.field1012 < this.field1008.field2265.length);
                        this.field1012 -= this.field1008.field2284;
                    } while (this.field1012 >= 0 && this.field1012 < this.field1008.field2265.length);
                    this.field1008 = null;
                }
            }
            this.field1011 = client.field530 - var1;
        }
        class207 var3 = Statics.method2211(this.field1013);
        if (var3.field2176 != null) {
            var3 = var3.method3592();
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field1007 == 1 || this.field1007 == 3) {
            var4 = var3.field2174;
            var5 = var3.field2170;
        } else {
            var4 = var3.field2170;
            var5 = var3.field2174;
        }
        int var6 = (var4 >> 1) + this.field1009;
        int var7 = (var4 + 1 >> 1) + this.field1009;
        int var8 = (var5 >> 1) + this.field1010;
        int var9 = (var5 + 1 >> 1) + this.field1010;
        int[][] var10 = class82.field1023[this.field1014];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var6][var9] + var10[var7][var9] >> 2;
        int var12 = (this.field1009 << 7) + (var4 << 6);
        int var13 = (this.field1010 << 7) + (var5 << 6);
        return var3.method3590(this.field1006, this.field1007, var10, var12, var11, var13, this.field1008, this.field1012);
    }
}
