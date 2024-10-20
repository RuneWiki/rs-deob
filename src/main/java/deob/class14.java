package deob;

@ObfuscatedName("q")
public class class14 extends class94 {

    @ObfuscatedName("q.t")
    public int field234;

    @ObfuscatedName("q.l")
    public int field224;

    @ObfuscatedName("q.c")
    public int field225;

    @ObfuscatedName("q.d")
    public int field226;

    @ObfuscatedName("q.b")
    public int field227;

    @ObfuscatedName("q.i")
    public int field228;

    @ObfuscatedName("q.p")
    public class34 field229;

    @ObfuscatedName("q.y")
    public int field230;

    @ObfuscatedName("q.u")
    public int field231;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field234 = arg0;
        this.field224 = arg1;
        this.field225 = arg2;
        this.field226 = arg3;
        this.field227 = arg4;
        this.field228 = arg5;
        if (arg6 != -1) {
            this.field229 = Statics.method31(arg6);
            this.field230 = 0;
            this.field231 = client.field652 - 1;
            if (this.field229.field916 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field229 == var10.field229) {
                    this.field230 = var10.field230;
                    this.field231 = var10.field231;
                    return;
                }
            }
            if (arg7 && this.field229.field907 != -1) {
                this.field230 = (int) (Math.random() * (double) this.field229.field903.length);
                this.field231 -= (int) (Math.random() * (double) this.field229.field900[this.field230]);
            }
        }
    }

    @ObfuscatedName("q.l(I)Ldk;")
    public final class112 method18() {
        if (this.field229 != null) {
            int var1 = client.field652 - this.field231;
            if (var1 > 100 && this.field229.field907 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field229.field900[this.field230]) {
                            break label47;
                        }
                        var1 -= this.field229.field900[this.field230];
                        this.field230++;
                    } while (this.field230 < this.field229.field903.length);
                    this.field230 -= this.field229.field907;
                } while (this.field230 >= 0 && this.field230 < this.field229.field903.length);
                this.field229 = null;
            }
            this.field231 = client.field652 - var1;
        }
        class32 var2 = class32.method1876(this.field234);
        if (var2.field875 != null) {
            var2 = var2.method667();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field225 == 1 || this.field225 == 3) {
            var3 = var2.field849;
            var4 = var2.field847;
        } else {
            var3 = var2.field847;
            var4 = var2.field849;
        }
        int var5 = (var3 >> 1) + this.field227;
        int var6 = (var3 + 1 >> 1) + this.field227;
        int var7 = (var4 >> 1) + this.field228;
        int var8 = (var4 + 1 >> 1) + this.field228;
        int[][] var9 = class9.field138[this.field226];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field227 << 7) + (var3 << 6);
        int var12 = (this.field228 << 7) + (var4 << 6);
        return var2.method665(this.field224, this.field225, var9, var11, var10, var12, this.field229, this.field230);
    }
}
