package deob;

@ObfuscatedName("j")
public class class14 extends class94 {

    @ObfuscatedName("j.c")
    public int field231;

    @ObfuscatedName("j.q")
    public int field219;

    @ObfuscatedName("j.y")
    public int field232;

    @ObfuscatedName("j.v")
    public int field221;

    @ObfuscatedName("j.g")
    public int field222;

    @ObfuscatedName("j.x")
    public int field218;

    @ObfuscatedName("j.u")
    public class34 field224;

    @ObfuscatedName("j.l")
    public int field225;

    @ObfuscatedName("j.a")
    public int field226;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field231 = arg0;
        this.field219 = arg1;
        this.field232 = arg2;
        this.field221 = arg3;
        this.field222 = arg4;
        this.field218 = arg5;
        if (arg6 != -1) {
            this.field224 = Statics.method1425(arg6);
            this.field225 = 0;
            this.field226 = client.field503 - 1;
            if (this.field224.field916 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field224 == var10.field224) {
                    this.field225 = var10.field225;
                    this.field226 = var10.field226;
                    return;
                }
            }
            if (arg7 && this.field224.field908 != -1) {
                this.field225 = (int) (Math.random() * (double) this.field224.field899.length);
                this.field226 -= (int) (Math.random() * (double) this.field224.field906[this.field225]);
            }
        }
    }

    @ObfuscatedName("j.q(B)Ldl;")
    public final class112 method13() {
        if (this.field224 != null) {
            int var1 = client.field503 - this.field226;
            if (var1 > 100 && this.field224.field908 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field224.field906[this.field225]) {
                            break label47;
                        }
                        var1 -= this.field224.field906[this.field225];
                        this.field225++;
                    } while (this.field225 < this.field224.field899.length);
                    this.field225 -= this.field224.field908;
                } while (this.field225 >= 0 && this.field225 < this.field224.field899.length);
                this.field224 = null;
            }
            this.field226 = client.field503 - var1;
        }
        class32 var2 = class32.method1446(this.field231);
        if (var2.field868 != null) {
            var2 = var2.method628();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field232 == 1 || this.field232 == 3) {
            var3 = var2.field835;
            var4 = var2.field842;
        } else {
            var3 = var2.field842;
            var4 = var2.field835;
        }
        int var5 = (var3 >> 1) + this.field222;
        int var6 = (var3 + 1 >> 1) + this.field222;
        int var7 = (var4 >> 1) + this.field218;
        int var8 = (var4 + 1 >> 1) + this.field218;
        int[][] var9 = class9.field150[this.field221];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field222 << 7) + (var3 << 6);
        int var12 = (this.field218 << 7) + (var4 << 6);
        return var2.method615(this.field219, this.field232, var9, var11, var10, var12, this.field224, this.field225);
    }
}
