package deob;

import java.util.Arrays;

@ObfuscatedName("mw")
public class class314 {

    @ObfuscatedName("mw.af")
    public int[] field3523;

    @ObfuscatedName("mw.an")
    public int[] field3519;

    @ObfuscatedName("mw.aw")
    public int[] field3510;

    @ObfuscatedName("mw.ac")
    public int field3512 = -1;

    @ObfuscatedName("mw.au")
    public int field3522 = 0;

    @ObfuscatedName("mw.ab")
    public int field3513;

    @ObfuscatedName("mw.aq")
    public long field3514;

    @ObfuscatedName("mw.al")
    public long field3515;

    @ObfuscatedName("mw.at")
    public class180[] field3516;

    @ObfuscatedName("mw.aa")
    public boolean field3517 = false;

    @ObfuscatedName("mw.ag")
    public static final int[] field3520 = new int[] { class205.field2324.field2316, class205.field2325.field2316, class205.field2320.field2316, class205.field2322.field2316, class205.field2319.field2316, class205.field2323.field2316, class205.field2328.field2316 };

    @ObfuscatedName("mw.ar")
    public static class280 field3509 = new class280(260);

    public class314() {
    }

    public class314(class314 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3519, arg0.field3519.length);
        int[] var3 = Arrays.copyOf(arg0.field3523, arg0.field3523.length);
        class180[] var4 = (class180[]) (arg0.field3516 == null ? null : (class180[]) Arrays.copyOf(arg0.field3516, arg0.field3516.length));
        int[] var5 = Arrays.copyOf(arg0.field3510, arg0.field3510.length);
        this.method5442(var3, var2, var4, false, var5, arg0.field3522, arg0.field3513, arg0.field3512);
    }

    @ObfuscatedName("mw.af([I[I[Lgx;Z[IIIIB)V")
    public void method5442(int[] arg0, int[] arg1, class180[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3516 = arg2;
        this.field3517 = arg3;
        this.field3512 = arg7;
        this.method5443(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("mw.an([I[I[IIII)V")
    public void method5443(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5451(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5451(arg3);
        }
        this.field3523 = arg0;
        this.field3519 = arg1;
        this.field3510 = arg2;
        this.field3522 = arg3;
        this.field3513 = arg4;
        this.method5463();
    }

    @ObfuscatedName("mw.aw(II)[I")
    public int[] method5451(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            method3184(arg0, var2, var3);
        }
        return var2;
    }

    @ObfuscatedName("gt.ac(I[III)V")
    public static void method3184(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < Statics.field1944; var3++) {
            class185 var4 = class185.method2539(var3);
            if (var4 != null && !var4.field1953 && (arg0 == 1 ? 7 : 0) + arg2 == var4.field1952) {
                arg1[field3520[arg2]] = var3 + 256;
                break;
            }
        }
    }

    @ObfuscatedName("mw.au(IZI)V")
    public void method5440(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3522 == 1) {
            return;
        }
        int var3 = this.field3519[field3520[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class185 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1944) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1944 - 1;
                }
            }
            var4 = class185.method2539(var3);
        } while (var4 == null || var4.field1953 || var4.field1952 != arg0 + (this.field3522 == 1 ? 7 : 0));
        this.field3519[field3520[arg0]] = var3 + 256;
        this.method5463();
    }

    @ObfuscatedName("mw.ab(IZI)V")
    public void method5462(int arg0, boolean arg1) {
        int var3 = this.field3510[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3508[arg0].length) {
                    var3 = 0;
                }
            } while (!class316.method3135(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3508[arg0].length - 1;
                }
            } while (!class316.method3135(arg0, var3));
        }
        this.field3510[arg0] = var3;
        this.method5463();
    }

    @ObfuscatedName("mw.aq(II)V")
    public void method5447(int arg0) {
        if (this.field3522 != arg0) {
            this.method5443((int[]) null, (int[]) null, this.field3510, arg0, -1);
        }
    }

    @ObfuscatedName("mw.al(Lsg;B)V")
    public void method5448(class489 arg0) {
        arg0.method8285(this.field3522);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3519[field3520[var2]];
            if (var3 == 0) {
                arg0.method8285(-1);
            } else {
                arg0.method8285(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8285(this.field3510[var4]);
        }
    }

    @ObfuscatedName("mw.at(I)V")
    public void method5463() {
        long var1 = this.field3514;
        int var3 = this.field3519[5];
        int var4 = this.field3519[9];
        this.field3519[5] = var4;
        this.field3519[9] = var3;
        this.field3514 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3514 <<= 0x4;
            if (this.field3519[var5] >= 256) {
                this.field3514 += (long) (this.field3519[var5] - 256);
            }
        }
        if (this.field3519[0] >= 256) {
            this.field3514 += (long) (this.field3519[0] - 256 >> 4);
        }
        if (this.field3519[1] >= 256) {
            this.field3514 += (long) (this.field3519[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3514 <<= 0x3;
            this.field3514 += (long) this.field3510[var6];
        }
        this.field3514 <<= 0x1;
        this.field3514 += (long) (this.field3522 * 325591525) * 1693987821L;
        this.field3519[5] = var3;
        this.field3519[9] = var4;
        if (var1 != 0L && this.field3514 != var1 || this.field3517) {
            field3509.method5118(var1);
        }
    }

    @ObfuscatedName("mw.aa(Lha;ILha;IB)Lit;")
    public class232 method5450(class204 arg0, int arg1, class204 arg2, int arg3) {
        if (this.field3513 != -1) {
            return class191.method6098(this.field3513).method3455(arg0, arg1, arg2, arg3, (class190) null);
        }
        long var5 = this.field3514;
        int[] var7 = this.field3519;
        if (arg0 != null && (arg0.field2309 >= 0 || arg0.field2310 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3519[var8];
            }
            if (arg0.field2309 >= 0) {
                var5 += (long) (arg0.field2309 - this.field3519[5] << 40);
                var7[5] = arg0.field2309;
            }
            if (arg0.field2310 >= 0) {
                var5 += (long) (arg0.field2310 - this.field3519[3] << 48);
                var7[3] = arg0.field2310;
            }
        }
        class232 var9 = (class232) field3509.method5119(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class185.method2539(var12 - 256).method3384()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class202.method2286(var12 - 512).method3721(this.field3522)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3515 != -1L) {
                    var9 = (class232) field3509.method5119(this.field3515);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class214[] var13 = new class214[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class214 var17 = class185.method2539(var16 - 256).method3378();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class202 var18 = class202.method2286(var16 - 512);
                        class214 var19 = var18.method3734(this.field3522);
                        if (var19 != null) {
                            if (this.field3516 != null) {
                                class180 var20 = this.field3516[var15];
                                if (var20 != null) {
                                    if (var20.field1900 != null && var18.field2222 != null && var18.field2221.length == var20.field1900.length) {
                                        for (int var21 = 0; var21 < var18.field2222.length; var21++) {
                                            var19.method3971(var18.field2221[var21], var20.field1900[var21]);
                                        }
                                    }
                                    if (var20.field1899 != null && var18.field2233 != null && var18.field2223.length == var20.field1899.length) {
                                        for (int var22 = 0; var22 < var18.field2233.length; var22++) {
                                            var19.method4022(var18.field2223[var22], var20.field1899[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class214 var23 = new class214(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3510[var24] < Statics.field3508[var24].length) {
                        var23.method3971(Statics.field3518[var24], Statics.field3508[var24][this.field3510[var24]]);
                    }
                    if (this.field3510[var24] < Statics.field4708[var24].length) {
                        var23.method3971(Statics.field2957[var24], Statics.field4708[var24][this.field3510[var24]]);
                    }
                }
                var9 = var23.method3979(64, 850, -30, -50, -30);
                field3509.method5121(var9, var5);
                this.field3515 = var5;
            }
        }
        class232 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4390(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3857(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3810(var9, arg3);
        } else {
            var25 = arg0.method3810(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("mw.ay(B)Liz;")
    public class214 method5468() {
        if (this.field3513 != -1) {
            return class191.method6098(this.field3513).method3456((class190) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3519[var2];
            if (var3 >= 256 && var3 < 512 && !class185.method2539(var3 - 256).method3379()) {
                var1 = true;
            }
            if (var3 >= 512 && !class202.method2286(var3 - 512).method3723(this.field3522)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class214[] var4 = new class214[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3519[var6];
            if (var7 >= 256 && var7 < 512) {
                class214 var8 = class185.method2539(var7 - 256).method3380();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class214 var9 = class202.method2286(var7 - 512).method3724(this.field3522);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class214 var10 = new class214(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3510[var11] < Statics.field3508[var11].length) {
                var10.method3971(Statics.field3518[var11], Statics.field3508[var11][this.field3510[var11]]);
            }
            if (this.field3510[var11] < Statics.field4708[var11].length) {
                var10.method3971(Statics.field2957[var11], Statics.field4708[var11][this.field3510[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("mw.ao(S)I")
    public int method5452() {
        return this.field3513 == -1 ? (this.field3519[11] << 5) + (this.field3519[8] << 10) + (this.field3519[0] << 15) + (this.field3510[0] << 25) + (this.field3510[4] << 20) + this.field3519[1] : 305419896 + class191.method6098(this.field3513).field2012;
    }

    @ObfuscatedName("mw.ax(I)V")
    public void method5473() {
        this.method5443(this.field3523, this.field3519, this.field3510, this.field3522, this.field3513);
    }

    @ObfuscatedName("nn.ai(I)V")
    public static void method6181() {
        field3509.method5125();
    }
}
