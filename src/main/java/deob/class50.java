package deob;

@ObfuscatedName("ah")
public class class50 extends class90 {

    @ObfuscatedName("ah.d")
    public int field949;

    @ObfuscatedName("ah.c")
    public int field947;

    @ObfuscatedName("ah.n")
    public int field948;

    @ObfuscatedName("ah.q")
    public int field956;

    @ObfuscatedName("ah.t")
    public int field950;

    @ObfuscatedName("ah.p")
    public int field951;

    @ObfuscatedName("ah.u")
    public class207 field952;

    @ObfuscatedName("ah.z")
    public int field959;

    @ObfuscatedName("ah.l")
    public int field954;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field949 = arg0;
        this.field947 = arg1;
        this.field948 = arg2;
        this.field956 = arg3;
        this.field950 = arg4;
        this.field951 = arg5;
        if (arg6 != -1) {
            this.field952 = class207.method3621(arg6);
            this.field959 = 0;
            this.field954 = client.field291 - 1;
            if (this.field952.field3103 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field952 == var10.field952) {
                    this.field959 = var10.field959;
                    this.field954 = var10.field954;
                    return;
                }
            }
            if (arg7 && this.field952.field3094 != -1) {
                this.field959 = (int) (Math.random() * (double) this.field952.field3093.length);
                this.field954 -= (int) (Math.random() * (double) this.field952.field3092[this.field959]);
            }
        }
    }

    @ObfuscatedName("ah.n(B)Lcf;")
    public final class83 method230() {
        if (this.field952 != null) {
            int var1 = client.field291 - this.field954;
            if (var1 > 100 && this.field952.field3094 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field952.field3092[this.field959]) {
                            break label47;
                        }
                        var1 -= this.field952.field3092[this.field959];
                        this.field959++;
                    } while (this.field959 < this.field952.field3093.length);
                    this.field959 -= this.field952.field3094;
                } while (this.field959 >= 0 && this.field959 < this.field952.field3093.length);
                this.field952 = null;
            }
            this.field954 = client.field291 - var1;
        }
        class203 var2 = class203.method579(this.field949);
        if (var2.field2966 != null) {
            var2 = var2.method3475();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field948 == 1 || this.field948 == 3) {
            var3 = var2.field2941;
            var4 = var2.field2964;
        } else {
            var3 = var2.field2964;
            var4 = var2.field2941;
        }
        int var5 = (var3 >> 1) + this.field950;
        int var6 = (var3 + 1 >> 1) + this.field950;
        int var7 = (var4 >> 1) + this.field951;
        int var8 = (var4 + 1 >> 1) + this.field951;
        int[][] var9 = class11.field103[this.field956];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field950 << 7) + (var3 << 6);
        int var12 = (this.field951 << 7) + (var4 << 6);
        return var2.method3473(this.field947, this.field948, var9, var11, var10, var12, this.field952, this.field959);
    }
}
