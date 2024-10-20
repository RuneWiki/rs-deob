package deob;

@ObfuscatedName("e")
public class class60 extends class145 {

    @ObfuscatedName("e.f")
    public int field660;

    @ObfuscatedName("e.d")
    public int field648;

    @ObfuscatedName("e.b")
    public int field658;

    @ObfuscatedName("e.l")
    public class173 field649;

    @ObfuscatedName("e.k")
    public int field645;

    @ObfuscatedName("e.h")
    public int field655;

    @ObfuscatedName("e.w")
    public int field646;

    @ObfuscatedName("e.t")
    public int field647;

    @ObfuscatedName("e.s")
    public int field651;

    @ObfuscatedName("e.h(I)Ldu;")
    public final class27 method1087() {
        if (this.field649 != null) {
            int var1 = client.field1541 - this.field651;
            if (var1 > 100 && this.field649.field2575 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field649.field2588[this.field660]) {
                            break label47;
                        }
                        var1 -= this.field649.field2588[this.field660];
                        this.field660++;
                    } while (this.field660 < this.field649.field2584.length);
                    this.field660 -= this.field649.field2575;
                } while (this.field660 >= 0 && this.field660 < this.field649.field2584.length);
                this.field649 = null;
            }
            this.field651 = client.field1541 - var1;
        }
        class182 var2 = class182.method3383(this.field658);
        if (var2.field2796 != null) {
            var2 = var2.method3297();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field645 == 1 || this.field645 == 3) {
            var3 = var2.field2769;
            var4 = var2.field2777;
        } else {
            var3 = var2.field2777;
            var4 = var2.field2769;
        }
        int var5 = (var3 >> 1) + this.field647;
        int var6 = (var3 + 1 >> 1) + this.field647;
        int var7 = (var4 >> 1) + this.field648;
        int var8 = (var4 + 1 >> 1) + this.field648;
        int[][] var9 = class88.field1247[this.field646];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field647 << 7) + (var3 << 6);
        int var12 = (this.field648 << 7) + (var4 << 6);
        return var2.method3287(this.field655, this.field645, var9, var11, var10, var12, this.field649, this.field660);
    }

    public class60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class145 arg8) {
        this.field658 = arg0;
        this.field655 = arg1;
        this.field645 = arg2;
        this.field646 = arg3;
        this.field647 = arg4;
        this.field648 = arg5;
        if (arg6 != -1) {
            this.field649 = class173.method3098(arg6);
            this.field660 = 0;
            this.field651 = client.field1541 - 1;
            if (this.field649.field2585 == 0 && arg8 != null && arg8 instanceof class60) {
                class60 var10 = (class60) arg8;
                if (this.field649 == var10.field649) {
                    this.field660 = var10.field660;
                    this.field651 = var10.field651;
                    return;
                }
            }
            if (arg7 && this.field649.field2575 != -1) {
                this.field660 = (int) (Math.random() * (double) this.field649.field2584.length);
                this.field651 -= (int) (Math.random() * (double) this.field649.field2588[this.field660]);
            }
        }
    }
}
