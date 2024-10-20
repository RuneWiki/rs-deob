package deob;

import java.awt.Component;

@ObfuscatedName("ak")
public class class52 {

    @ObfuscatedName("ak.g")
    public int[] field1078;

    @ObfuscatedName("ak.s")
    public class48 field1079;

    @ObfuscatedName("ak.b")
    public int field1098 = 32;

    @ObfuscatedName("ak.v")
    public long field1081 = class121.method133();

    @ObfuscatedName("ak.j")
    public int field1082;

    @ObfuscatedName("ak.q")
    public int field1085;

    @ObfuscatedName("ak.a")
    public int field1084;

    @ObfuscatedName("ak.c")
    public long field1083 = 0L;

    @ObfuscatedName("ak.m")
    public int field1086 = 0;

    @ObfuscatedName("ak.z")
    public int field1075 = 0;

    @ObfuscatedName("ak.w")
    public int field1088 = 0;

    @ObfuscatedName("ak.h")
    public long field1080 = 0L;

    @ObfuscatedName("ak.y")
    public boolean field1090 = true;

    @ObfuscatedName("ak.ad")
    public int field1093 = 0;

    @ObfuscatedName("ak.af")
    public class48[] field1094 = new class48[8];

    @ObfuscatedName("ak.ai")
    public class48[] field1095 = new class48[8];

    @ObfuscatedName("ad.y(IZII)V")
    public static final void method573(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1089 = arg0;
        Statics.field1778 = arg1;
        Statics.field2027 = arg2;
    }

    @ObfuscatedName("cg.x(Lbj;Ljava/awt/Component;III)Lak;")
    public static final class52 method2049(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1089 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1078 = new int[(Statics.field1778 ? 2 : 1) * 256];
                var4.field1085 = arg3;
                var4.method919(arg1);
                var4.field1082 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1082 > 16384) {
                    var4.field1082 = 16384;
                }
                var4.method930(var4.field1082);
                if (Statics.field2027 > 0 && Statics.field1076 == null) {
                    Statics.field1076 = new class55();
                    Statics.field1076.field1170 = arg0;
                    arg0.method1507(Statics.field1076, Statics.field2027);
                }
                if (Statics.field1076 != null) {
                    if (Statics.field1076.field1162[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1076.field1162[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1078 = new int[256 * (Statics.field1778 ? 2 : 1)];
                    var6.field1085 = arg3;
                    var6.method919(arg1);
                    var6.field1082 = 16384;
                    var6.method930(var6.field1082);
                    if (Statics.field2027 > 0 && Statics.field1076 == null) {
                        Statics.field1076 = new class55();
                        Statics.field1076.field1170 = arg0;
                        arg0.method1507(Statics.field1076, Statics.field2027);
                    }
                    if (Statics.field1076 != null) {
                        if (Statics.field1076.field1162[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1076.field1162[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class52();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ak.p(Laj;I)V")
    public final synchronized void method1142(class48 arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("ak.i(I)V")
    public final synchronized void method1143() {
        if (this.field1078 == null) {
            return;
        }
        long var1 = class121.method133();
        try {
            if (this.field1083 != 0L) {
                if (var1 < this.field1083) {
                    return;
                }
                this.method930(this.field1082);
                this.field1083 = 0L;
                this.field1090 = true;
            }
            int var3 = this.method921();
            if (this.field1088 - var3 > this.field1086) {
                this.field1086 = this.field1088 - var3;
            }
            int var4 = this.field1085 + this.field1084;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1082) {
                this.field1082 += 1024;
                if (this.field1082 > 16384) {
                    this.field1082 = 16384;
                }
                this.method939();
                this.method930(this.field1082);
                var3 = 0;
                this.field1090 = true;
                if (var4 + 256 > this.field1082) {
                    var4 = this.field1082 - 256;
                    this.field1084 = var4 - this.field1085;
                }
            }
            while (var3 < var4) {
                this.method1147(this.field1078, 256);
                this.method922();
                var3 += 256;
            }
            if (var1 > this.field1080) {
                if (this.field1090) {
                    this.field1090 = false;
                } else if (this.field1086 == 0 && this.field1075 == 0) {
                    this.method939();
                    this.field1083 = var1 + 2000L;
                    return;
                } else {
                    this.field1084 = Math.min(this.field1075, this.field1086);
                    this.field1075 = this.field1086;
                }
                this.field1086 = 0;
                this.field1080 = var1 + 2000L;
            }
            this.field1088 = var3;
        } catch (Exception var8) {
            this.method939();
            this.field1083 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1081 + 500000L) {
                var1 = this.field1081;
            }
            while (var1 > this.field1081 + 5000L) {
                this.method1167(256);
                this.field1081 += (long) (256000 / Statics.field1089);
            }
        } catch (Exception var7) {
            this.field1081 = var1;
        }
    }

    @ObfuscatedName("ak.aa(B)V")
    public final void method1173() {
        this.field1090 = true;
    }

    @ObfuscatedName("ak.ax(I)V")
    public final synchronized void method1152() {
        this.field1090 = true;
        try {
            this.method924();
        } catch (Exception var2) {
            this.method939();
            this.field1083 = class121.method133() + 2000L;
        }
    }

    @ObfuscatedName("ak.ad(I)V")
    public final synchronized void method1145() {
        if (Statics.field1076 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1076.field1162[var2] == this) {
                    Statics.field1076.field1162[var2] = null;
                }
                if (Statics.field1076.field1162[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1076.field1163 = true;
                while (Statics.field1076.field1164) {
                    class126.method815(50L);
                }
                Statics.field1076 = null;
            }
        }
        this.method939();
        this.field1078 = null;
    }

    @ObfuscatedName("ak.af(IB)V")
    public final void method1167(int arg0) {
        this.field1093 -= arg0;
        if (this.field1093 < 0) {
            this.field1093 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method1085(arg0);
        }
    }

    @ObfuscatedName("ak.ai([II)V")
    public final void method1147(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1778) {
            var3 = arg1 << 1;
        }
        class128.method2662(arg0, 0, var3);
        this.field1093 -= arg1;
        if (this.field1079 != null && this.field1093 <= 0) {
            this.field1093 += Statics.field1089 >> 4;
            method245(this.field1079);
            this.method1148(this.field1079, this.field1079.method942());
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
                        class48 var10 = null;
                        class48 var11 = this.field1094[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1054;
                                if (var12 == null || var12.field1050 <= var8) {
                                    var11.field1052 = true;
                                    int var13 = var11.method1000();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1050 += var13;
                                    }
                                    if (var4 >= this.field1098) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method1069();
                                    if (var14 != null) {
                                        int var15 = var11.field1051;
                                        while (var14 != null) {
                                            this.method1148(var14, var15 * var14.method942() >> 8);
                                            var14 = var11.method964();
                                        }
                                    }
                                    class48 var16 = var11.field1053;
                                    var11.field1053 = null;
                                    if (var10 == null) {
                                        this.field1094[var7] = var16;
                                    } else {
                                        var10.field1053 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1095[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1053;
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
                class48 var18 = this.field1094[var17];
                class48[] var19 = this.field1094;
                this.field1095[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1053;
                    var18.field1053 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1093 < 0) {
            this.field1093 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method954(arg0, 0, arg1);
        }
        this.field1081 = class121.method133();
    }

    @ObfuscatedName("aa.ag(Laj;I)V")
    public static final void method245(class48 arg0) {
        arg0.field1052 = false;
        if (arg0.field1054 != null) {
            arg0.field1054.field1050 = 0;
        }
        for (class48 var1 = arg0.method1069(); var1 != null; var1 = arg0.method964()) {
            method245(var1);
        }
    }

    @ObfuscatedName("ak.an(Laj;II)V")
    public final void method1148(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1095[var3];
        if (var4 == null) {
            this.field1094[var3] = arg0;
        } else {
            var4.field1053 = arg0;
        }
        this.field1095[var3] = arg0;
        arg0.field1051 = arg1;
    }

    @ObfuscatedName("ak.f(Ljava/awt/Component;)V")
    public void method919(Component arg0) throws Exception {
    }

    @ObfuscatedName("ak.t(I)V")
    public void method930(int arg0) throws Exception {
    }

    @ObfuscatedName("ak.n()I")
    public int method921() throws Exception {
        return this.field1082;
    }

    @ObfuscatedName("ak.e()V")
    public void method922() throws Exception {
    }

    @ObfuscatedName("ak.l()V")
    public void method939() {
    }

    @ObfuscatedName("ak.d()V")
    public void method924() throws Exception {
    }
}
