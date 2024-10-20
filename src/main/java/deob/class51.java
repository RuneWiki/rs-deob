package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class51 {

    @ObfuscatedName("aa.k")
    public int[] field1065;

    @ObfuscatedName("aa.s")
    public class61 field1066;

    @ObfuscatedName("aa.h")
    public int field1075 = 32;

    @ObfuscatedName("aa.m")
    public long field1068 = class106.method870();

    @ObfuscatedName("aa.w")
    public int field1069;

    @ObfuscatedName("aa.q")
    public int field1070;

    @ObfuscatedName("aa.u")
    public int field1063;

    @ObfuscatedName("aa.e")
    public long field1072 = 0L;

    @ObfuscatedName("aa.b")
    public int field1074 = 0;

    @ObfuscatedName("aa.g")
    public int field1081 = 0;

    @ObfuscatedName("aa.j")
    public int field1064 = 0;

    @ObfuscatedName("aa.a")
    public long field1076 = 0L;

    @ObfuscatedName("aa.x")
    public boolean field1077 = true;

    @ObfuscatedName("aa.aw")
    public int field1079 = 0;

    @ObfuscatedName("aa.ar")
    public class61[] field1080 = new class61[8];

    @ObfuscatedName("aa.am")
    public class61[] field1073 = new class61[8];

    @ObfuscatedName("cf.l(Ldf;Ljava/awt/Component;IIS)Laa;")
    public static final class51 method1891(class127 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1071 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1065 = new int[256 * (Statics.field1067 ? 2 : 1)];
                var4.field1070 = arg3;
                var4.method956(arg1);
                var4.field1069 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1069 > 16384) {
                    var4.field1069 = 16384;
                }
                var4.method957(var4.field1069);
                if (Statics.field2959 > 0 && Statics.field1816 == null) {
                    Statics.field1816 = new class67();
                    Statics.field1816.field1251 = arg0;
                    arg0.method2500(Statics.field1816, Statics.field2959);
                }
                if (Statics.field1816 != null) {
                    if (Statics.field1816.field1243[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1816.field1243[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1065 = new int[(Statics.field1067 ? 2 : 1) * 256];
                    var6.field1070 = arg3;
                    var6.method956(arg1);
                    var6.field1069 = 16384;
                    var6.method957(var6.field1069);
                    if (Statics.field2959 > 0 && Statics.field1816 == null) {
                        Statics.field1816 = new class67();
                        Statics.field1816.field1251 = arg0;
                        arg0.method2500(Statics.field1816, Statics.field2959);
                    }
                    if (Statics.field1816 != null) {
                        if (Statics.field1816.field1243[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1816.field1243[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class51();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("aa.t(Lbw;S)V")
    public final synchronized void method1014(class61 arg0) {
        this.field1066 = arg0;
    }

    @ObfuscatedName("aa.i(I)V")
    public final synchronized void method1015() {
        if (this.field1065 == null) {
            return;
        }
        long var1 = class106.method870();
        try {
            if (this.field1072 != 0L) {
                if (var1 < this.field1072) {
                    return;
                }
                this.method957(this.field1069);
                this.field1072 = 0L;
                this.field1077 = true;
            }
            int var3 = this.method973();
            if (this.field1064 - var3 > this.field1074) {
                this.field1074 = this.field1064 - var3;
            }
            int var4 = this.field1070 + this.field1063;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1069) {
                this.field1069 += 1024;
                if (this.field1069 > 16384) {
                    this.field1069 = 16384;
                }
                this.method959();
                this.method957(this.field1069);
                var3 = 0;
                this.field1077 = true;
                if (var4 + 256 > this.field1069) {
                    var4 = this.field1069 - 256;
                    this.field1063 = var4 - this.field1070;
                }
            }
            while (var3 < var4) {
                this.method1019(this.field1065, 256);
                this.method958();
                var3 += 256;
            }
            if (var1 > this.field1076) {
                if (this.field1077) {
                    this.field1077 = false;
                } else if (this.field1074 == 0 && this.field1081 == 0) {
                    this.method959();
                    this.field1072 = var1 + 2000L;
                    return;
                } else {
                    this.field1063 = Math.min(this.field1081, this.field1074);
                    this.field1081 = this.field1074;
                }
                this.field1074 = 0;
                this.field1076 = var1 + 2000L;
            }
            this.field1064 = var3;
        } catch (Exception var8) {
            this.method959();
            this.field1072 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1068 + 500000L) {
                var1 = this.field1068;
            }
            while (var1 > this.field1068 + 5000L) {
                this.method1018(256);
                this.field1068 += (long) (256000 / Statics.field1071);
            }
        } catch (Exception var7) {
            this.field1068 = var1;
        }
    }

    @ObfuscatedName("aa.aw(I)V")
    public final void method1021() {
        this.field1077 = true;
    }

    @ObfuscatedName("aa.ar(I)V")
    public final synchronized void method1016() {
        this.field1077 = true;
        try {
            this.method960();
        } catch (Exception var2) {
            this.method959();
            this.field1072 = class106.method870() + 2000L;
        }
    }

    @ObfuscatedName("aa.af(I)V")
    public final synchronized void method1024() {
        if (Statics.field1816 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1816.field1243[var2] == this) {
                    Statics.field1816.field1243[var2] = null;
                }
                if (Statics.field1816.field1243[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1816.field1246 = true;
                while (Statics.field1816.field1245) {
                    class118.method1901(50L);
                }
                Statics.field1816 = null;
            }
        }
        this.method959();
        this.field1065 = null;
    }

    @ObfuscatedName("aa.am(IB)V")
    public final void method1018(int arg0) {
        this.field1079 -= arg0;
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1066 != null) {
            this.field1066.method977(arg0);
        }
    }

    @ObfuscatedName("aa.ax([II)V")
    public final void method1019(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1067) {
            var3 = arg1 << 1;
        }
        class111.method2334(arg0, 0, var3);
        this.field1079 -= arg1;
        if (this.field1066 != null && this.field1079 <= 0) {
            this.field1079 += Statics.field1071 >> 4;
            method531(this.field1066);
            this.method1020(this.field1066, this.field1066.method1126());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class61 var10 = null;
                        class61 var11 = this.field1080[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1160;
                                if (var12 == null || var12.field1157 <= var8) {
                                    var11.field1159 = true;
                                    int var13 = var11.method985();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1157 += var13;
                                    }
                                    if (var4 >= this.field1075) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method983();
                                    if (var14 != null) {
                                        int var15 = var11.field1161;
                                        while (var14 != null) {
                                            this.method1020(var14, var15 * var14.method1126() >> 8);
                                            var14 = var11.method984();
                                        }
                                    }
                                    class61 var16 = var11.field1158;
                                    var11.field1158 = null;
                                    if (var10 == null) {
                                        this.field1080[var7] = var16;
                                    } else {
                                        var10.field1158 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1073[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1158;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class61 var18 = this.field1080[var17];
                class61[] var19 = this.field1080;
                this.field1073[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1158;
                    var18.field1158 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1066 != null) {
            this.field1066.method986(arg0, 0, arg1);
        }
        this.field1068 = class106.method870();
    }

    @ObfuscatedName("l.av(Lbw;I)V")
    public static final void method531(class61 arg0) {
        arg0.field1159 = false;
        if (arg0.field1160 != null) {
            arg0.field1160.field1157 = 0;
        }
        for (class61 var1 = arg0.method983(); var1 != null; var1 = arg0.method984()) {
            method531(var1);
        }
    }

    @ObfuscatedName("aa.al(Lbw;IB)V")
    public final void method1020(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1073[var3];
        if (var4 == null) {
            this.field1080[var3] = arg0;
        } else {
            var4.field1158 = arg0;
        }
        this.field1073[var3] = arg0;
        arg0.field1161 = arg1;
    }

    @ObfuscatedName("aa.p(Ljava/awt/Component;)V")
    public void method956(Component arg0) throws Exception {
    }

    @ObfuscatedName("aa.y(I)V")
    public void method957(int arg0) throws Exception {
    }

    @ObfuscatedName("aa.d()I")
    public int method973() throws Exception {
        return this.field1069;
    }

    @ObfuscatedName("aa.c()V")
    public void method958() throws Exception {
    }

    @ObfuscatedName("aa.r()V")
    public void method959() {
    }

    @ObfuscatedName("aa.f()V")
    public void method960() throws Exception {
    }
}
