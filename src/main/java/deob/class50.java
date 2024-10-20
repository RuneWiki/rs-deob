package deob;

@ObfuscatedName("av")
public class class50 extends class90 {

    @ObfuscatedName("av.k")
    public int field955;

    @ObfuscatedName("av.y")
    public int field949;

    @ObfuscatedName("av.o")
    public int field950;

    @ObfuscatedName("av.r")
    public int field948;

    @ObfuscatedName("av.w")
    public int field952;

    @ObfuscatedName("av.j")
    public int field957;

    @ObfuscatedName("av.q")
    public class202 field954;

    @ObfuscatedName("av.d")
    public int field951;

    @ObfuscatedName("av.n")
    public int field956;

    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class90 arg8) {
        this.field955 = arg0;
        this.field949 = arg1;
        this.field950 = arg2;
        this.field948 = arg3;
        this.field952 = arg4;
        this.field957 = arg5;
        if (arg6 != -1) {
            this.field954 = class202.method1368(arg6);
            this.field951 = 0;
            this.field956 = client.field454 - 1;
            if (this.field954.field3051 == 0 && arg8 != null && arg8 instanceof class50) {
                class50 var10 = (class50) arg8;
                if (this.field954 == var10.field954) {
                    this.field951 = var10.field951;
                    this.field956 = var10.field956;
                    return;
                }
            }
            if (arg7 && this.field954.field3042 != -1) {
                this.field951 = (int) (Math.random() * (double) this.field954.field3038.length);
                this.field956 -= (int) (Math.random() * (double) this.field954.field3040[this.field951]);
            }
        }
    }

    @ObfuscatedName("av.o(I)Lcu;")
    public final class83 method258() {
        if (this.field954 != null) {
            int var1 = client.field454 - this.field956;
            if (var1 > 100 && this.field954.field3042 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field954.field3040[this.field951]) {
                            break label47;
                        }
                        var1 -= this.field954.field3040[this.field951];
                        this.field951++;
                    } while (this.field951 < this.field954.field3038.length);
                    this.field951 -= this.field954.field3042;
                } while (this.field951 >= 0 && this.field951 < this.field954.field3038.length);
                this.field954 = null;
            }
            this.field956 = client.field454 - var1;
        }
        class198 var2 = class198.method2703(this.field955);
        if (var2.field2916 != null) {
            var2 = var2.method3409();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field950 == 1 || this.field950 == 3) {
            var3 = var2.field2891;
            var4 = var2.field2919;
        } else {
            var3 = var2.field2919;
            var4 = var2.field2891;
        }
        int var5 = (var3 >> 1) + this.field952;
        int var6 = (var3 + 1 >> 1) + this.field952;
        int var7 = (var4 >> 1) + this.field957;
        int var8 = (var4 + 1 >> 1) + this.field957;
        int[][] var9 = class12.field115[this.field948];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field952 << 7) + (var3 << 6);
        int var12 = (this.field957 << 7) + (var4 << 6);
        return var2.method3389(this.field949, this.field950, var9, var11, var10, var12, this.field954, this.field951);
    }
}
