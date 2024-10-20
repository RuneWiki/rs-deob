package deob;

@ObfuscatedName("ij")
public class class240 {

    @ObfuscatedName("ij.d")
    public int[] field2799;

    @ObfuscatedName("ij.z")
    public int[] field2794;

    @ObfuscatedName("ij.n")
    public boolean field2795;

    @ObfuscatedName("ij.r")
    public int field2800;

    @ObfuscatedName("ij.e")
    public long field2796;

    @ObfuscatedName("ij.y")
    public long field2798;

    @ObfuscatedName("ij.m")
    public static final int[] field2793 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ij.h")
    public static class213 field2797 = new class213(260);

    @ObfuscatedName("ij.d([I[IZII)V")
    public void method4126(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3509; var6++) {
                    class275 var7 = class275.method5093(var6);
                    if (var7 != null && !var7.field3503 && var7.field3506 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2793[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2799 = arg0;
        this.field2794 = arg1;
        this.field2795 = arg2;
        this.field2800 = arg3;
        this.method4130();
    }

    @ObfuscatedName("ij.z(IZI)V")
    public void method4132(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2795) {
            return;
        }
        int var3 = this.field2799[field2793[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class275 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3509) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3509 - 1;
                }
            }
            var4 = class275.method5093(var3);
        } while (var4 == null || var4.field3503 || var4.field3506 != arg0 + (this.field2795 ? 7 : 0));
        this.field2799[field2793[arg0]] = var3 + 256;
        this.method4130();
    }

    @ObfuscatedName("ij.n(IZB)V")
    public void method4129(int arg0, boolean arg1) {
        int var3 = this.field2794[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2777[arg0].length) {
                    var3 = 0;
                }
            } while (!class241.method3072(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2777[arg0].length - 1;
                }
            } while (!class241.method3072(arg0, var3));
        }
        this.field2794[arg0] = var3;
        this.method4130();
    }

    @ObfuscatedName("ij.r(ZB)V")
    public void method4127(boolean arg0) {
        if (this.field2795 != arg0) {
            this.method4126((int[]) null, this.field2794, arg0, -1);
        }
    }

    @ObfuscatedName("ij.e(Lgy;I)V")
    public void method4145(class195 arg0) {
        arg0.method3243(this.field2795 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2799[field2793[var2]];
            if (var3 == 0) {
                arg0.method3243(-1);
            } else {
                arg0.method3243(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3243(this.field2794[var4]);
        }
    }

    @ObfuscatedName("ij.y(B)V")
    public void method4130() {
        long var1 = this.field2796;
        int var3 = this.field2799[5];
        int var4 = this.field2799[9];
        this.field2799[5] = var4;
        this.field2799[9] = var3;
        this.field2796 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2796 <<= 0x4;
            if (this.field2799[var5] >= 256) {
                this.field2796 += (long) (this.field2799[var5] - 256);
            }
        }
        if (this.field2799[0] >= 256) {
            this.field2796 += (long) (this.field2799[0] - 256 >> 4);
        }
        if (this.field2799[1] >= 256) {
            this.field2796 += (long) (this.field2799[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2796 <<= 0x3;
            this.field2796 += (long) this.field2794[var6];
        }
        this.field2796 <<= 0x1;
        this.field2796 += (long) (this.field2795 ? 1 : 0);
        this.field2799[5] = var3;
        this.field2799[9] = var4;
        if (var1 != 0L && this.field2796 != var1) {
            field2797.method3698(var1);
        }
    }

    @ObfuscatedName("ij.k(Lki;ILki;II)Lel;")
    public class132 method4131(class288 arg0, int arg1, class288 arg2, int arg3) {
        if (this.field2800 != -1) {
            return class286.method4254(this.field2800).method4819(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2796;
        int[] var7 = this.field2799;
        if (arg0 != null && (arg0.field3770 >= 0 || arg0.field3765 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2799[var8];
            }
            if (arg0.field3770 >= 0) {
                var5 += (long) (arg0.field3770 - this.field2799[5] << 40);
                var7[5] = arg0.field3770;
            }
            if (arg0.field3765 >= 0) {
                var5 += (long) (arg0.field3765 - this.field2799[3] << 48);
                var7[3] = arg0.field3765;
            }
        }
        class132 var9 = (class132) field2797.method3707(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class275.method5093(var12 - 256).method4562()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class284.method4245(var12 - 512).method4807(this.field2795)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2798 != -1L) {
                    var9 = (class132) field2797.method3707(this.field2798);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class126[] var13 = new class126[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class126 var17 = class275.method5093(var16 - 256).method4559();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class126 var18 = class284.method4245(var16 - 512).method4788(this.field2795);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class126 var19 = new class126(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2794[var20] < Statics.field2777[var20].length) {
                        var19.method2441(Statics.field315[var20], Statics.field2777[var20][this.field2794[var20]]);
                    }
                    if (this.field2794[var20] < Statics.field2581[var20].length) {
                        var19.method2441(Statics.field822[var20], Statics.field2581[var20][this.field2794[var20]]);
                    }
                }
                var9 = var19.method2449(64, 850, -30, -50, -30);
                field2797.method3697(var9, var5);
                this.field2798 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class132 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4878(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4875(var9, arg3);
        } else {
            var21 = arg0.method4875(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ij.s(B)Ldf;")
    public class126 method4159() {
        if (this.field2800 != -1) {
            return class286.method4254(this.field2800).method4852();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2799[var2];
            if (var3 >= 256 && var3 < 512 && !class275.method5093(var3 - 256).method4571()) {
                var1 = true;
            }
            if (var3 >= 512 && !class284.method4245(var3 - 512).method4760(this.field2795)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2799[var6];
            if (var7 >= 256 && var7 < 512) {
                class126 var8 = class275.method5093(var7 - 256).method4564();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class126 var9 = class284.method4245(var7 - 512).method4759(this.field2795);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class126 var10 = new class126(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2794[var11] < Statics.field2777[var11].length) {
                var10.method2441(Statics.field315[var11], Statics.field2777[var11][this.field2794[var11]]);
            }
            if (this.field2794[var11] < Statics.field2581[var11].length) {
                var10.method2441(Statics.field822[var11], Statics.field2581[var11][this.field2794[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ij.x(I)I")
    public int method4133() {
        return this.field2800 == -1 ? (this.field2799[11] << 5) + (this.field2799[8] << 10) + (this.field2799[0] << 15) + (this.field2794[0] << 25) + (this.field2794[4] << 20) + this.field2799[1] : 305419896 + class286.method4254(this.field2800).field3708;
    }
}
