package deob;

import java.util.Arrays;

@ObfuscatedName("ni")
public class class344 {

    @ObfuscatedName("ni.ac")
    public int[] field3620;

    @ObfuscatedName("ni.al")
    public int[] field3613;

    @ObfuscatedName("ni.ak")
    public int[] field3626;

    @ObfuscatedName("ni.ax")
    public int field3615 = -1;

    @ObfuscatedName("ni.ao")
    public int field3612 = 0;

    @ObfuscatedName("ni.ah")
    public int field3617;

    @ObfuscatedName("ni.ar")
    public long field3618;

    @ObfuscatedName("ni.ab")
    public long field3619;

    @ObfuscatedName("ni.am")
    public class186[] field3614;

    @ObfuscatedName("ni.av")
    public boolean field3621 = false;

    @ObfuscatedName("ni.as")
    public static final int[] field3623 = new int[] { class224.field2348.field2343, class224.field2349.field2343, class224.field2347.field2343, class224.field2355.field2343, class224.field2352.field2343, class224.field2350.field2343, class224.field2353.field2343 };

    @ObfuscatedName("ni.au")
    public static class302 field3625 = new class302(260);

    @ObfuscatedName("ni.ai")
    public static class439 field3629 = new class439(16, class437.field4652);

    @ObfuscatedName("ni.ae")
    public static int field3627 = 0;

    public class344() {
    }

    public class344(class344 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3613, arg0.field3613.length);
        int[] var3 = Arrays.copyOf(arg0.field3620, arg0.field3620.length);
        class186[] var4 = (class186[]) (arg0.field3614 == null ? null : (class186[]) Arrays.copyOf(arg0.field3614, arg0.field3614.length));
        int[] var5 = Arrays.copyOf(arg0.field3626, arg0.field3626.length);
        this.method5665(var3, var2, var4, false, var5, arg0.field3612, arg0.field3617, arg0.field3615);
    }

    @ObfuscatedName("ni.ac([I[I[Lhy;Z[IIIII)V")
    public void method5665(int[] arg0, int[] arg1, class186[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3614 = arg2;
        this.field3621 = arg3;
        this.field3615 = arg7;
        this.method5666(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("ni.al([I[I[IIIB)V")
    public void method5666(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5667(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5667(arg3);
        }
        this.field3620 = arg0;
        this.field3613 = arg1;
        this.field3626 = arg2;
        this.field3612 = arg3;
        this.field3617 = arg4;
        this.method5672();
    }

    @ObfuscatedName("ni.ak(IB)[I")
    public int[] method5667(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field4490; var4++) {
                class197 var5 = class197.method2016(var4);
                if (var5 != null && !var5.field1976 && var3 + (arg0 == 1 ? 7 : 0) == var5.field1973) {
                    var2[field3623[var3]] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("ni.ax(IZI)V")
    public void method5668(int arg0, boolean arg1) {
        int var3 = this.field3613[field3623[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class197 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field4490) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field4490 - 1;
                }
            }
            var4 = class197.method2016(var3);
        } while (var4 == null || var4.field1976 || (this.field3612 == 1 ? 7 : 0) + arg0 != var4.field1973);
        this.field3613[field3623[arg0]] = var3 + 256;
        this.method5672();
    }

    @ObfuscatedName("ni.ao(IZI)V")
    public void method5669(int arg0, boolean arg1) {
        int var3 = this.field3626[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1343[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1343[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3626[arg0] = var3;
        this.method5672();
    }

    @ObfuscatedName("ni.ah(II)V")
    public void method5664(int arg0) {
        if (this.field3612 != arg0) {
            this.method5666((int[]) null, (int[]) null, this.field3626, arg0, -1);
        }
    }

    @ObfuscatedName("ni.ar(Lul;B)V")
    public void method5671(class530 arg0) {
        arg0.method8348(this.field3612);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3613[field3623[var2]];
            if (var3 == 0) {
                arg0.method8348(-1);
            } else {
                arg0.method8348(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8348(this.field3626[var4]);
        }
    }

    @ObfuscatedName("ni.ab(B)V")
    public void method5672() {
        long var1 = this.field3618;
        int var3 = this.field3613[5];
        int var4 = this.field3613[9];
        this.field3613[5] = var4;
        this.field3613[9] = var3;
        this.field3618 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3618 <<= 0x4;
            if (this.field3613[var5] >= 256) {
                this.field3618 += (long) (this.field3613[var5] - 256);
            }
        }
        if (this.field3613[0] >= 256) {
            this.field3618 += (long) (this.field3613[0] - 256 >> 4);
        }
        if (this.field3613[1] >= 256) {
            this.field3618 += (long) (this.field3613[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3618 <<= 0x3;
            this.field3618 += (long) this.field3626[var6];
        }
        this.field3618 <<= 0x1;
        this.field3618 += (long) (this.field3612 * -746905677) * 539928443L;
        this.field3613[5] = var3;
        this.field3613[9] = var4;
        if (var1 != 0L && this.field3618 != var1 || this.field3621) {
            field3625.method5285(var1);
        }
    }

    @ObfuscatedName("ni.am(Lif;ILif;II)Ljn;")
    public class254 method5679(class223 arg0, int arg1, class223 arg2, int arg3) {
        if (this.field3617 != -1) {
            return class206.method3320(this.field3617).method3472(arg0, arg1, arg2, arg3, (class205) null);
        }
        long var5 = this.field3618;
        int[] var7 = this.field3613;
        if (arg0 != null && (arg0.field2335 >= 0 || arg0.field2337 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3613[var8];
            }
            if (arg0.field2335 >= 0) {
                var5 += (long) (arg0.field2335 - this.field3613[5] << 40);
                var7[5] = arg0.field2335;
            }
            if (arg0.field2337 >= 0) {
                var5 += (long) (arg0.field2337 - this.field3613[3] << 48);
                var7[3] = arg0.field2337;
            }
        }
        class254 var9 = (class254) field3625.method5286(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class197.method2016(var12 - 256).method3380()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class221.method3594(var12 - 512).method3742(this.field3612)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3619 != -1L) {
                    var9 = (class254) field3625.method5286(this.field3619);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class236[] var13 = new class236[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class236 var17 = class197.method2016(var16 - 256).method3381();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class221 var18 = class221.method3594(var16 - 512);
                        class236 var19 = var18.method3811(this.field3612);
                        if (var19 != null) {
                            if (this.field3614 != null) {
                                class186 var20 = this.field3614[var15];
                                if (var20 != null) {
                                    if (var20.field1895 != null && var18.field2252 != null && var18.field2253.length == var20.field1895.length) {
                                        for (int var21 = 0; var21 < var18.field2252.length; var21++) {
                                            var19.method4132(var18.field2253[var21], var20.field1895[var21]);
                                        }
                                    }
                                    if (var20.field1894 != null && var18.field2287 != null && var18.field2288.length == var20.field1894.length) {
                                        for (int var22 = 0; var22 < var18.field2287.length; var22++) {
                                            var19.method4074(var18.field2288[var22], var20.field1894[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class236 var23 = new class236(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3626[var24] < Statics.field1343[var24].length) {
                        var23.method4132(Statics.field3616[var24], Statics.field1343[var24][this.field3626[var24]]);
                    }
                    if (this.field3626[var24] < Statics.field188[var24].length) {
                        var23.method4132(Statics.field3573[var24], Statics.field188[var24][this.field3626[var24]]);
                    }
                }
                var9 = var23.method4080(64, 850, -30, -50, -30);
                field3625.method5289(var9, var5);
                this.field3619 = var5;
            }
        }
        class254 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4534(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3841(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3845(var9, arg3);
        } else {
            var25 = arg0.method3845(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ni.av(I)Ljw;")
    public class236 method5674() {
        if (this.field3617 != -1) {
            return class206.method3320(this.field3617).method3473((class205) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3613[var2];
            if (var3 >= 256 && var3 < 512 && !class197.method2016(var3 - 256).method3382()) {
                var1 = true;
            }
            if (var3 >= 512 && !class221.method3594(var3 - 512).method3744(this.field3612)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class236[] var4 = new class236[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3613[var6];
            if (var7 >= 256 && var7 < 512) {
                class236 var8 = class197.method2016(var7 - 256).method3383();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class236 var9 = class221.method3594(var7 - 512).method3745(this.field3612);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class236 var10 = new class236(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3626[var11] < Statics.field1343[var11].length) {
                var10.method4132(Statics.field3616[var11], Statics.field1343[var11][this.field3626[var11]]);
            }
            if (this.field3626[var11] < Statics.field188[var11].length) {
                var10.method4132(Statics.field3573[var11], Statics.field188[var11][this.field3626[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ni.ag(I)I")
    public int method5680() {
        long var1 = this.field3618;
        if (this.field3617 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3617;
        }
        Integer var3 = (Integer) field3629.method7237(var1);
        if (var3 == null) {
            var3 = ++field3627 - 1;
            field3629.method7228(var1, var3);
            field3627 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("ni.aa(B)V")
    public void method5690() {
        this.method5666(this.field3620, this.field3613, this.field3626, this.field3612, this.field3617);
    }
}
