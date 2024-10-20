package deob;

@ObfuscatedName("f")
public class class14 extends class94 {

    @ObfuscatedName("f.j")
    public int field200;

    @ObfuscatedName("f.r")
    public int field212;

    @ObfuscatedName("f.v")
    public int field201;

    @ObfuscatedName("f.p")
    public int field202;

    @ObfuscatedName("f.e")
    public int field211;

    @ObfuscatedName("f.d")
    public int field203;

    @ObfuscatedName("f.y")
    public class34 field205;

    @ObfuscatedName("f.x")
    public int field216;

    @ObfuscatedName("f.t")
    public int field199;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field200 = arg0;
        this.field212 = arg1;
        this.field201 = arg2;
        this.field202 = arg3;
        this.field211 = arg4;
        this.field203 = arg5;
        if (arg6 != -1) {
            this.field205 = class34.method2349(arg6);
            this.field216 = 0;
            this.field199 = client.field482 - 1;
            if (this.field205.field889 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field205 == var10.field205) {
                    this.field216 = var10.field216;
                    this.field199 = var10.field199;
                    return;
                }
            }
            if (arg7 && this.field205.field880 != -1) {
                this.field216 = (int) (Math.random() * (double) this.field205.field876.length);
                this.field199 -= (int) (Math.random() * (double) this.field205.field878[this.field216]);
            }
        }
    }

    @ObfuscatedName("f.r(B)Ldt;")
    public final class112 method18() {
        if (this.field205 != null) {
            int var1 = client.field482 - this.field199;
            if (var1 > 100 && this.field205.field880 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field205.field878[this.field216]) {
                            break label47;
                        }
                        var1 -= this.field205.field878[this.field216];
                        this.field216++;
                    } while (this.field216 < this.field205.field876.length);
                    this.field216 -= this.field205.field880;
                } while (this.field216 >= 0 && this.field216 < this.field205.field876.length);
                this.field205 = null;
            }
            this.field199 = client.field482 - var1;
        }
        class32 var2 = class32.method606(this.field200);
        if (var2.field857 != null) {
            var2 = var2.method642();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field201 == 1 || this.field201 == 3) {
            var3 = var2.field856;
            var4 = var2.field825;
        } else {
            var3 = var2.field825;
            var4 = var2.field856;
        }
        int var5 = (var3 >> 1) + this.field211;
        int var6 = (var3 + 1 >> 1) + this.field211;
        int var7 = (var4 >> 1) + this.field203;
        int var8 = (var4 + 1 >> 1) + this.field203;
        int[][] var9 = class9.field141[this.field202];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field211 << 7) + (var3 << 6);
        int var12 = (this.field203 << 7) + (var4 << 6);
        return var2.method640(this.field212, this.field201, var9, var11, var10, var12, this.field205, this.field216);
    }
}
