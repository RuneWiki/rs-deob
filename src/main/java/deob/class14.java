package deob;

@ObfuscatedName("t")
public class class14 extends class94 {

    @ObfuscatedName("t.b")
    public int field222;

    @ObfuscatedName("t.e")
    public int field214;

    @ObfuscatedName("t.g")
    public int field215;

    @ObfuscatedName("t.o")
    public int field216;

    @ObfuscatedName("t.a")
    public int field213;

    @ObfuscatedName("t.h")
    public int field221;

    @ObfuscatedName("t.j")
    public class34 field219;

    @ObfuscatedName("t.f")
    public int field218;

    @ObfuscatedName("t.q")
    public int field217;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field222 = arg0;
        this.field214 = arg1;
        this.field215 = arg2;
        this.field216 = arg3;
        this.field213 = arg4;
        this.field221 = arg5;
        if (arg6 != -1) {
            this.field219 = class34.method215(arg6);
            this.field218 = 0;
            this.field217 = client.field477 - 1;
            if (this.field219.field880 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field219 == var10.field219) {
                    this.field218 = var10.field218;
                    this.field217 = var10.field217;
                    return;
                }
            }
            if (arg7 && this.field219.field874 != -1) {
                this.field218 = (int) (Math.random() * (double) this.field219.field867.length);
                this.field217 -= (int) (Math.random() * (double) this.field219.field869[this.field218]);
            }
        }
    }

    @ObfuscatedName("t.e(I)Ldp;")
    public final class112 method15() {
        if (this.field219 != null) {
            int var1 = client.field477 - this.field217;
            if (var1 > 100 && this.field219.field874 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field219.field869[this.field218]) {
                            break label47;
                        }
                        var1 -= this.field219.field869[this.field218];
                        this.field218++;
                    } while (this.field218 < this.field219.field867.length);
                    this.field218 -= this.field219.field874;
                } while (this.field218 >= 0 && this.field218 < this.field219.field867.length);
                this.field219 = null;
            }
            this.field217 = client.field477 - var1;
        }
        class32 var2 = class32.method48(this.field222);
        if (var2.field842 != null) {
            var2 = var2.method641();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field215 == 1 || this.field215 == 3) {
            var3 = var2.field817;
            var4 = var2.field809;
        } else {
            var3 = var2.field809;
            var4 = var2.field817;
        }
        int var5 = (var3 >> 1) + this.field213;
        int var6 = (var3 + 1 >> 1) + this.field213;
        int var7 = (var4 >> 1) + this.field221;
        int var8 = (var4 + 1 >> 1) + this.field221;
        int[][] var9 = class9.field130[this.field216];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field213 << 7) + (var3 << 6);
        int var12 = (this.field221 << 7) + (var4 << 6);
        return var2.method639(this.field214, this.field215, var9, var11, var10, var12, this.field219, this.field218);
    }
}
