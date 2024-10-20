package deob;

@ObfuscatedName("g")
public class class14 extends class95 {

    @ObfuscatedName("g.e")
    public int field219;

    @ObfuscatedName("g.i")
    public int field220;

    @ObfuscatedName("g.k")
    public int field221;

    @ObfuscatedName("g.q")
    public int field225;

    @ObfuscatedName("g.j")
    public int field223;

    @ObfuscatedName("g.z")
    public int field229;

    @ObfuscatedName("g.m")
    public class35 field222;

    @ObfuscatedName("g.w")
    public int field226;

    @ObfuscatedName("g.a")
    public int field227;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class95 arg8) {
        this.field219 = arg0;
        this.field220 = arg1;
        this.field221 = arg2;
        this.field225 = arg3;
        this.field223 = arg4;
        this.field229 = arg5;
        if (arg6 != -1) {
            this.field222 = class35.method28(arg6);
            this.field226 = 0;
            this.field227 = client.field569 - 1;
            if (this.field222.field913 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field222 == var10.field222) {
                    this.field226 = var10.field226;
                    this.field227 = var10.field227;
                    return;
                }
            }
            if (arg7 && this.field222.field914 != -1) {
                this.field226 = (int) (Math.random() * (double) this.field222.field900.length);
                this.field227 -= (int) (Math.random() * (double) this.field222.field902[this.field226]);
            }
        }
    }

    @ObfuscatedName("g.i(B)Ldo;")
    public final class113 method16() {
        if (this.field222 != null) {
            int var1 = client.field569 - this.field227;
            if (var1 > 100 && this.field222.field914 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field222.field902[this.field226]) {
                            break label47;
                        }
                        var1 -= this.field222.field902[this.field226];
                        this.field226++;
                    } while (this.field226 < this.field222.field900.length);
                    this.field226 -= this.field222.field914;
                } while (this.field226 >= 0 && this.field226 < this.field222.field900.length);
                this.field222 = null;
            }
            this.field227 = client.field569 - var1;
        }
        class33 var2 = class33.method266(this.field219);
        if (var2.field874 != null) {
            var2 = var2.method692();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field221 == 1 || this.field221 == 3) {
            var3 = var2.field865;
            var4 = var2.field848;
        } else {
            var3 = var2.field848;
            var4 = var2.field865;
        }
        int var5 = (var3 >> 1) + this.field223;
        int var6 = (var3 + 1 >> 1) + this.field223;
        int var7 = (var4 >> 1) + this.field229;
        int var8 = (var4 + 1 >> 1) + this.field229;
        int[][] var9 = class9.field153[this.field225];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field223 << 7) + (var3 << 6);
        int var12 = (this.field229 << 7) + (var4 << 6);
        return var2.method690(this.field220, this.field221, var9, var11, var10, var12, this.field222, this.field226);
    }
}
