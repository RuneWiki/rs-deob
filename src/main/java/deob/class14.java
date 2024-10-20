package deob;

@ObfuscatedName("q")
public class class14 extends class94 {

    @ObfuscatedName("q.g")
    public int field232;

    @ObfuscatedName("q.h")
    public int field234;

    @ObfuscatedName("q.s")
    public int field226;

    @ObfuscatedName("q.o")
    public int field229;

    @ObfuscatedName("q.p")
    public int field230;

    @ObfuscatedName("q.x")
    public int field231;

    @ObfuscatedName("q.k")
    public class34 field227;

    @ObfuscatedName("q.r")
    public int field233;

    @ObfuscatedName("q.z")
    public int field228;

    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class94 arg8) {
        this.field232 = arg0;
        this.field234 = arg1;
        this.field226 = arg2;
        this.field229 = arg3;
        this.field230 = arg4;
        this.field231 = arg5;
        if (arg6 != -1) {
            this.field227 = class34.method152(arg6);
            this.field233 = 0;
            this.field228 = client.field496 - 1;
            if (this.field227.field900 == 0 && arg8 != null && arg8 instanceof class14) {
                class14 var10 = (class14) arg8;
                if (this.field227 == var10.field227) {
                    this.field233 = var10.field233;
                    this.field228 = var10.field228;
                    return;
                }
            }
            if (arg7 && this.field227.field891 != -1) {
                this.field233 = (int) (Math.random() * (double) this.field227.field887.length);
                this.field228 -= (int) (Math.random() * (double) this.field227.field901[this.field233]);
            }
        }
    }

    @ObfuscatedName("q.h(I)Ldn;")
    public final class112 method18() {
        if (this.field227 != null) {
            int var1 = client.field496 - this.field228;
            if (var1 > 100 && this.field227.field891 > 0) {
                var1 = 100;
            }
            label47: {
                do {
                    do {
                        if (var1 <= this.field227.field901[this.field233]) {
                            break label47;
                        }
                        var1 -= this.field227.field901[this.field233];
                        this.field233++;
                    } while (this.field233 < this.field227.field887.length);
                    this.field233 -= this.field227.field891;
                } while (this.field233 >= 0 && this.field233 < this.field227.field887.length);
                this.field227 = null;
            }
            this.field228 = client.field496 - var1;
        }
        class32 var2 = class32.method249(this.field232);
        if (var2.field816 != null) {
            var2 = var2.method656();
        }
        if (var2 == null) {
            return null;
        }
        int var3;
        int var4;
        if (this.field226 == 1 || this.field226 == 3) {
            var3 = var2.field833;
            var4 = var2.field823;
        } else {
            var3 = var2.field823;
            var4 = var2.field833;
        }
        int var5 = (var3 >> 1) + this.field230;
        int var6 = (var3 + 1 >> 1) + this.field230;
        int var7 = (var4 >> 1) + this.field231;
        int var8 = (var4 + 1 >> 1) + this.field231;
        int[][] var9 = class9.field135[this.field229];
        int var10 = var9[var5][var7] + var9[var6][var7] + var9[var5][var8] + var9[var6][var8] >> 2;
        int var11 = (this.field230 << 7) + (var3 << 6);
        int var12 = (this.field231 << 7) + (var4 << 6);
        return var2.method652(this.field234, this.field226, var9, var11, var10, var12, this.field227, this.field233);
    }
}
