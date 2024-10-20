package deob;

@ObfuscatedName("e")
public class class14 extends class94 {

    @ObfuscatedName("e.i")
    public int field221;

    @ObfuscatedName("e.v")
    public int field219;

    @ObfuscatedName("e.m")
    public int field220;

    @ObfuscatedName("e.j")
    public int field227;

    @ObfuscatedName("e.o")
    public int field222;

    @ObfuscatedName("e.l")
    public int field223;

    @ObfuscatedName("e.g")
    public class34 field225;

    @ObfuscatedName("e.w")
    public int field230;

    @ObfuscatedName("e.c")
    public int field226;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field221 = arg0;
        this.field219 = arg1;
        this.field220 = arg2;
        this.field227 = arg3;
        this.field222 = arg4;
        this.field223 = arg5;
        if (arg6 != -1) {
            this.field225 = class34.method1443(arg6);
            this.field230 = 0;
            this.field226 = client.field491 - 1;
            if (this.field225.field911 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field225 == var10.field225) {
                    this.field230 = var10.field230;
                    this.field226 = var10.field226;
                    return;
                }
            }
            if (arg7 && this.field225.field906 != -1) {
                this.field230 = (int) (Math.random() * (double) this.field225.field893.length);
                this.field226 -= (int) (Math.random() * (double) this.field225.field895[this.field230]);
            }
        }
    }

    @ObfuscatedName("e.v(I)Ldl;")
    public final class112 method15() {
        if (this.field225 != null) {
            int var1 = client.field491 - this.field226;
            if (var1 > 100 && this.field225.field906 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field225.field895[this.field230]) {
                            break label47;
                        }
                        var1 -= this.field225.field895[this.field230];
                        this.field230++;
                    } while (this.field230 < this.field225.field893.length);
                    this.field230 -= this.field225.field906;
                } while (this.field230 >= 0 && this.field230 < this.field225.field893.length);
                this.field225 = null;
            }
            this.field226 = client.field491 - var1;
        }
        class32 var2 = class32.method701(this.field221);
        if (var2.field866 != null) {
            var2 = var2.method668();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field220 == 1 || this.field220 == 3) {
            var3 = var2.field840;
            var4 = var2.field842;
        } else {
            var3 = var2.field842;
            var4 = var2.field840;
        }
        int var5 = (var3 >> 1) + this.field222;
        int var6 = (var3 + 1 >> 1) + this.field222;
        int var7 = (var4 >> 1) + this.field223;
        int var8 = (var4 + 1 >> 1) + this.field223;
        int[][] var9 = class9.field136[this.field227];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field222 << 7) + (var3 << 6);
        int var12 = (this.field223 << 7) + (var4 << 6);
        return var2.method664(this.field219, this.field220, var9, var11, var10, var12, this.field225, this.field230);
    }
}
