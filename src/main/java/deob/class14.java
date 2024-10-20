package deob;

@ObfuscatedName("o")
public class class14 extends class94 {

    @ObfuscatedName("o.y")
    public int field216;

    @ObfuscatedName("o.m")
    public int field203;

    @ObfuscatedName("o.d")
    public int field204;

    @ObfuscatedName("o.k")
    public int field212;

    @ObfuscatedName("o.n")
    public int field206;

    @ObfuscatedName("o.s")
    public int field207;

    @ObfuscatedName("o.x")
    public class34 field208;

    @ObfuscatedName("o.b")
    public int field214;

    @ObfuscatedName("o.j")
    public int field209;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field216 = arg0;
        this.field203 = arg1;
        this.field204 = arg2;
        this.field212 = arg3;
        this.field206 = arg4;
        this.field207 = arg5;
        if (arg6 != -1) {
            this.field208 = class34.method540(arg6);
            this.field214 = 0;
            this.field209 = client.field691 - 1;
            if (this.field208.field879 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field208 == var10.field208) {
                    this.field214 = var10.field214;
                    this.field209 = var10.field209;
                    return;
                }
            }
            if (arg7 && this.field208.field870 != -1) {
                this.field214 = (int) (Math.random() * (double) this.field208.field863.length);
                this.field209 -= (int) (Math.random() * (double) this.field208.field868[this.field214]);
            }
        }
    }

    @ObfuscatedName("o.m(I)Ldw;")
    public final class112 method20() {
        if (this.field208 != null) {
            int var1 = client.field691 - this.field209;
            if (var1 > 100 && this.field208.field870 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field208.field868[this.field214]) {
                            break label47;
                        }
                        var1 -= this.field208.field868[this.field214];
                        this.field214++;
                    } while (this.field214 < this.field208.field863.length);
                    this.field214 -= this.field208.field870;
                } while (this.field214 >= 0 && this.field214 < this.field208.field863.length);
                this.field208 = null;
            }
            this.field209 = client.field691 - var1;
        }
        class32 var2 = class32.method211(this.field216);
        if (var2.field838 != null) {
            var2 = var2.method684();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field204 == 1 || this.field204 == 3) {
            var3 = var2.field812;
            var4 = var2.field811;
        } else {
            var3 = var2.field811;
            var4 = var2.field812;
        }
        int var5 = (var3 >> 1) + this.field206;
        int var6 = (var3 + 1 >> 1) + this.field206;
        int var7 = (var4 >> 1) + this.field207;
        int var8 = (var4 + 1 >> 1) + this.field207;
        int[][] var9 = class9.field120[this.field212];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field206 << 7) + (var3 << 6);
        int var12 = (this.field207 << 7) + (var4 << 6);
        return var2.method639(this.field203, this.field204, var9, var11, var10, var12, this.field208, this.field214);
    }
}
