package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class52 {

    @ObfuscatedName("az.z")
    public int[] field1089;

    @ObfuscatedName("az.o")
    public class48 field1090;

    @ObfuscatedName("az.u")
    public int field1091 = 32;

    @ObfuscatedName("az.f")
    public long field1105 = Statics.method2045();

    @ObfuscatedName("az.k")
    public int field1093;

    @ObfuscatedName("az.q")
    public int field1094;

    @ObfuscatedName("az.a")
    public int field1095;

    @ObfuscatedName("az.w")
    public long field1097 = 0L;

    @ObfuscatedName("az.g")
    public int field1101 = 0;

    @ObfuscatedName("az.l")
    public int field1098 = 0;

    @ObfuscatedName("az.m")
    public int field1099 = 0;

    @ObfuscatedName("az.b")
    public long field1100 = 0L;

    @ObfuscatedName("az.h")
    public boolean field1102 = true;

    @ObfuscatedName("az.au")
    public int field1106 = 0;

    @ObfuscatedName("az.ab")
    public class48[] field1103 = new class48[8];

    @ObfuscatedName("az.ae")
    public class48[] field1104 = new class48[8];

    @ObfuscatedName("ax.s(IZII)V")
    public static final void method783(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1205 = arg0;
        Statics.field1086 = arg1;
        Statics.field264 = arg2;
    }

    @ObfuscatedName("ao.c(Lbw;Ljava/awt/Component;III)Laz;")
    public static final class52 method801(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1205 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1089 = new int[256 * (Statics.field1086 ? 2 : 1)];
                var4.field1094 = arg3;
                var4.method922(arg1);
                var4.field1093 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1093 > 16384) {
                    var4.field1093 = 16384;
                }
                var4.method918(var4.field1093);
                if (Statics.field264 > 0 && Statics.field1174 == null) {
                    Statics.field1174 = new class55();
                    Statics.field1174.field1171 = arg0;
                    arg0.method1479(Statics.field1174, Statics.field264);
                }
                if (Statics.field1174 != null) {
                    if (Statics.field1174.field1170[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1174.field1170[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1089 = new int[256 * (Statics.field1086 ? 2 : 1)];
                    var6.field1094 = arg3;
                    var6.method922(arg1);
                    var6.field1093 = 16384;
                    var6.method918(var6.field1093);
                    if (Statics.field264 > 0 && Statics.field1174 == null) {
                        Statics.field1174 = new class55();
                        Statics.field1174.field1171 = arg0;
                        arg0.method1479(Statics.field1174, Statics.field264);
                    }
                    if (Statics.field1174 != null) {
                        if (Statics.field1174.field1170[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1174.field1170[arg2] = var6;
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

    @ObfuscatedName("az.am(Law;B)V")
    public final synchronized void method1153(class48 arg0) {
        this.field1090 = arg0;
    }

    @ObfuscatedName("az.ap(I)V")
    public final synchronized void method1154() {
        if (this.field1089 == null) {
            return;
        }
        long var1 = Statics.method2045();
        try {
            if (this.field1097 != 0L) {
                if (var1 < this.field1097) {
                    return;
                }
                this.method918(this.field1093);
                this.field1097 = 0L;
                this.field1102 = true;
            }
            int var3 = this.method919();
            if (this.field1099 - var3 > this.field1101) {
                this.field1101 = this.field1099 - var3;
            }
            int var4 = this.field1095 + this.field1094;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1093) {
                this.field1093 += 1024;
                if (this.field1093 > 16384) {
                    this.field1093 = 16384;
                }
                this.method938();
                this.method918(this.field1093);
                var3 = 0;
                this.field1102 = true;
                if (var4 + 256 > this.field1093) {
                    var4 = this.field1093 - 256;
                    this.field1095 = var4 - this.field1094;
                }
            }
            while (var3 < var4) {
                this.method1158(this.field1089, 256);
                this.method920();
                var3 += 256;
            }
            if (var1 > this.field1100) {
                if (this.field1102) {
                    this.field1102 = false;
                } else if (this.field1101 == 0 && this.field1098 == 0) {
                    this.method938();
                    this.field1097 = var1 + 2000L;
                    return;
                } else {
                    this.field1095 = Math.min(this.field1098, this.field1101);
                    this.field1098 = this.field1101;
                }
                this.field1101 = 0;
                this.field1100 = var1 + 2000L;
            }
            this.field1099 = var3;
        } catch (Exception var8) {
            this.method938();
            this.field1097 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1105 + 500000L) {
                var1 = this.field1105;
            }
            while (var1 > this.field1105 + 5000L) {
                this.method1183(256);
                this.field1105 += (long) (256000 / Statics.field1205);
            }
        } catch (Exception var7) {
            this.field1105 = var1;
        }
    }

    @ObfuscatedName("az.au(I)V")
    public final void method1181() {
        this.field1102 = true;
    }

    @ObfuscatedName("az.ab(B)V")
    public final synchronized void method1165() {
        this.field1102 = true;
        try {
            this.method916();
        } catch (Exception var2) {
            this.method938();
            this.field1097 = Statics.method2045() + 2000L;
        }
    }

    @ObfuscatedName("az.ae(B)V")
    public final synchronized void method1156() {
        if (Statics.field1174 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1174.field1170[var2] == this) {
                    Statics.field1174.field1170[var2] = null;
                }
                if (Statics.field1174.field1170[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1174.field1176 = true;
                while (Statics.field1174.field1172) {
                    class126.method1316(50L);
                }
                Statics.field1174 = null;
            }
        }
        this.method938();
        this.field1089 = null;
    }

    @ObfuscatedName("az.as(II)V")
    public final void method1183(int arg0) {
        this.field1106 -= arg0;
        if (this.field1106 < 0) {
            this.field1106 = 0;
        }
        if (this.field1090 != null) {
            this.field1090.method966(arg0);
        }
    }

    @ObfuscatedName("az.av([II)V")
    public final void method1158(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1086) {
            var3 = arg1 << 1;
        }
        class128.method2647(arg0, 0, var3);
        this.field1106 -= arg1;
        if (this.field1090 != null && this.field1106 <= 0) {
            this.field1106 += Statics.field1205 >> 4;
            method153(this.field1090);
            this.method1159(this.field1090, this.field1090.method1078());
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
                        class48 var11 = this.field1103[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1062;
                                if (var12 == null || var12.field1061 <= var8) {
                                    var11.field1065 = true;
                                    int var13 = var11.method1080();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1061 += var13;
                                    }
                                    if (var4 >= this.field1091) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method962();
                                    if (var14 != null) {
                                        int var15 = var11.field1063;
                                        while (var14 != null) {
                                            this.method1159(var14, var15 * var14.method1078() >> 8);
                                            var14 = var11.method963();
                                        }
                                    }
                                    class48 var16 = var11.field1064;
                                    var11.field1064 = null;
                                    if (var10 == null) {
                                        this.field1103[var7] = var16;
                                    } else {
                                        var10.field1064 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1104[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1064;
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
                class48 var18 = this.field1103[var17];
                class48[] var19 = this.field1103;
                this.field1104[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1064;
                    var18.field1064 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1106 < 0) {
            this.field1106 = 0;
        }
        if (this.field1090 != null) {
            this.field1090.method965(arg0, 0, arg1);
        }
        this.field1105 = Statics.method2045();
    }

    @ObfuscatedName("f.ar(Law;I)V")
    public static final void method153(class48 arg0) {
        arg0.field1065 = false;
        if (arg0.field1062 != null) {
            arg0.field1062.field1061 = 0;
        }
        for (class48 var1 = arg0.method962(); var1 != null; var1 = arg0.method963()) {
            method153(var1);
        }
    }

    @ObfuscatedName("az.ad(Law;II)V")
    public final void method1159(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1104[var3];
        if (var4 == null) {
            this.field1103[var3] = arg0;
        } else {
            var4.field1064 = arg0;
        }
        this.field1104[var3] = arg0;
        arg0.field1063 = arg1;
    }

    @ObfuscatedName("az.j(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
    }

    @ObfuscatedName("az.r(I)V")
    public void method918(int arg0) throws Exception {
    }

    @ObfuscatedName("az.v()I")
    public int method919() throws Exception {
        return this.field1093;
    }

    @ObfuscatedName("az.p()V")
    public void method920() throws Exception {
    }

    @ObfuscatedName("az.e()V")
    public void method938() {
    }

    @ObfuscatedName("az.d()V")
    public void method916() throws Exception {
    }
}
