package deob;

import java.awt.Component;

@ObfuscatedName("ak")
public class class51 {

    @ObfuscatedName("ak.u")
    public int[] field1086;

    @ObfuscatedName("ak.z")
    public class47 field1087;

    @ObfuscatedName("ak.e")
    public int field1106 = 32;

    @ObfuscatedName("ak.l")
    public long field1107 = class120.method1322();

    @ObfuscatedName("ak.m")
    public int field1090;

    @ObfuscatedName("ak.s")
    public int field1091;

    @ObfuscatedName("ak.i")
    public int field1100;

    @ObfuscatedName("ak.y")
    public long field1096 = 0L;

    @ObfuscatedName("ak.d")
    public int field1094 = 0;

    @ObfuscatedName("ak.f")
    public int field1095 = 0;

    @ObfuscatedName("ak.a")
    public int field1084 = 0;

    @ObfuscatedName("ak.x")
    public long field1097 = 0L;

    @ObfuscatedName("ak.r")
    public boolean field1098 = true;

    @ObfuscatedName("ak.aj")
    public int field1101 = 0;

    @ObfuscatedName("ak.aq")
    public class47[] field1102 = new class47[8];

    @ObfuscatedName("ak.ac")
    public class47[] field1103 = new class47[8];

    @ObfuscatedName("bk.x(IZII)V")
    public static final void method1504(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1265 = arg0;
        Statics.field1031 = arg1;
        Statics.field1764 = arg2;
    }

    @ObfuscatedName("aq.r(Lbt;Ljava/awt/Component;III)Lak;")
    public static final class51 method596(class73 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1265 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class50 var4 = new class50();
                var4.field1086 = new int[(Statics.field1031 ? 2 : 1) * 256];
                var4.field1091 = arg3;
                var4.method892(arg1);
                var4.field1090 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1090 > 16384) {
                    var4.field1090 = 16384;
                }
                var4.method891(var4.field1090);
                if (Statics.field1764 > 0 && Statics.field1093 == null) {
                    Statics.field1093 = new class54();
                    Statics.field1093.field1177 = arg0;
                    arg0.method1458(Statics.field1093, Statics.field1764);
                }
                if (Statics.field1093 != null) {
                    if (Statics.field1093.field1176[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1093.field1176[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class43 var6 = new class43(arg0, arg2);
                    var6.field1086 = new int[256 * (Statics.field1031 ? 2 : 1)];
                    var6.field1091 = arg3;
                    var6.method892(arg1);
                    var6.field1090 = 16384;
                    var6.method891(var6.field1090);
                    if (Statics.field1764 > 0 && Statics.field1093 == null) {
                        Statics.field1093 = new class54();
                        Statics.field1093.field1177 = arg0;
                        arg0.method1458(Statics.field1093, Statics.field1764);
                    }
                    if (Statics.field1093 != null) {
                        if (Statics.field1093.field1176[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1093.field1176[arg2] = var6;
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

    @ObfuscatedName("ak.t(Lau;I)V")
    public final synchronized void method1135(class47 arg0) {
        this.field1087 = arg0;
    }

    @ObfuscatedName("ak.b(I)V")
    public final synchronized void method1117() {
        if (this.field1086 == null) {
            return;
        }
        long var1 = class120.method1322();
        try {
            if (this.field1096 != 0L) {
                if (var1 < this.field1096) {
                    return;
                }
                this.method891(this.field1090);
                this.field1096 = 0L;
                this.field1098 = true;
            }
            int var3 = this.method894();
            if (this.field1084 - var3 > this.field1094) {
                this.field1094 = this.field1084 - var3;
            }
            int var4 = this.field1100 + this.field1091;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1090) {
                this.field1090 += 1024;
                if (this.field1090 > 16384) {
                    this.field1090 = 16384;
                }
                this.method896();
                this.method891(this.field1090);
                var3 = 0;
                this.field1098 = true;
                if (var4 + 256 > this.field1090) {
                    var4 = this.field1090 - 256;
                    this.field1100 = var4 - this.field1091;
                }
            }
            while (var3 < var4) {
                this.method1122(this.field1086, 256);
                this.method899();
                var3 += 256;
            }
            if (var1 > this.field1097) {
                if (this.field1098) {
                    this.field1098 = false;
                } else if (this.field1094 == 0 && this.field1095 == 0) {
                    this.method896();
                    this.field1096 = var1 + 2000L;
                    return;
                } else {
                    this.field1100 = Math.min(this.field1095, this.field1094);
                    this.field1095 = this.field1094;
                }
                this.field1094 = 0;
                this.field1097 = var1 + 2000L;
            }
            this.field1084 = var3;
        } catch (Exception var8) {
            this.method896();
            this.field1096 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1107 + 500000L) {
                var1 = this.field1107;
            }
            while (var1 > this.field1107 + 5000L) {
                this.method1121(256);
                this.field1107 += (long) (256000 / Statics.field1265);
            }
        } catch (Exception var7) {
            this.field1107 = var1;
        }
    }

    @ObfuscatedName("ak.q(B)V")
    public final void method1118() {
        this.field1098 = true;
    }

    @ObfuscatedName("ak.ae(I)V")
    public final synchronized void method1119() {
        this.field1098 = true;
        try {
            this.method897();
        } catch (Exception var2) {
            this.method896();
            this.field1096 = class120.method1322() + 2000L;
        }
    }

    @ObfuscatedName("ak.at(I)V")
    public final synchronized void method1120() {
        if (Statics.field1093 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1093.field1176[var2] == this) {
                    Statics.field1093.field1176[var2] = null;
                }
                if (Statics.field1093.field1176[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1093.field1171 = true;
                while (Statics.field1093.field1168) {
                    class125.method123(50L);
                }
                Statics.field1093 = null;
            }
        }
        this.method896();
        this.field1086 = null;
    }

    @ObfuscatedName("ak.aj(IB)V")
    public final void method1121(int arg0) {
        this.field1101 -= arg0;
        if (this.field1101 < 0) {
            this.field1101 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method1039(arg0);
        }
    }

    @ObfuscatedName("ak.aq([II)V")
    public final void method1122(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1031) {
            var3 = arg1 << 1;
        }
        class127.method2594(arg0, 0, var3);
        this.field1101 -= arg1;
        if (this.field1087 != null && this.field1101 <= 0) {
            this.field1101 += Statics.field1265 >> 4;
            method1993(this.field1087);
            this.method1123(this.field1087, this.field1087.method914());
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
                        class47 var10 = null;
                        class47 var11 = this.field1102[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class46 var12 = var11.field1060;
                                if (var12 == null || var12.field1059 <= var8) {
                                    var11.field1062 = true;
                                    int var13 = var11.method936();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1059 += var13;
                                    }
                                    if (var4 >= this.field1106) {
                                        break label105;
                                    }
                                    class47 var14 = var11.method934();
                                    if (var14 != null) {
                                        int var15 = var11.field1063;
                                        while (var14 != null) {
                                            this.method1123(var14, var15 * var14.method914() >> 8);
                                            var14 = var11.method935();
                                        }
                                    }
                                    class47 var16 = var11.field1061;
                                    var11.field1061 = null;
                                    if (var10 == null) {
                                        this.field1102[var7] = var16;
                                    } else {
                                        var10.field1061 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1103[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1061;
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
                class47 var18 = this.field1102[var17];
                class47[] var19 = this.field1102;
                this.field1103[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class47 var21 = var18.field1061;
                    var18.field1061 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1101 < 0) {
            this.field1101 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method972(arg0, 0, arg1);
        }
        this.field1107 = class120.method1322();
    }

    @ObfuscatedName("ce.ac(Lau;I)V")
    public static final void method1993(class47 arg0) {
        arg0.field1062 = false;
        if (arg0.field1060 != null) {
            arg0.field1060.field1059 = 0;
        }
        for (class47 var1 = arg0.method934(); var1 != null; var1 = arg0.method935()) {
            method1993(var1);
        }
    }

    @ObfuscatedName("ak.az(Lau;IB)V")
    public final void method1123(class47 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class47 var4 = this.field1103[var3];
        if (var4 == null) {
            this.field1102[var3] = arg0;
        } else {
            var4.field1061 = arg0;
        }
        this.field1103[var3] = arg0;
        arg0.field1063 = arg1;
    }

    @ObfuscatedName("ak.p(Ljava/awt/Component;)V")
    public void method892(Component arg0) throws Exception {
    }

    @ObfuscatedName("ak.j(I)V")
    public void method891(int arg0) throws Exception {
    }

    @ObfuscatedName("ak.w()I")
    public int method894() throws Exception {
        return this.field1090;
    }

    @ObfuscatedName("ak.h()V")
    public void method899() throws Exception {
    }

    @ObfuscatedName("ak.v()V")
    public void method896() {
    }

    @ObfuscatedName("ak.k()V")
    public void method897() throws Exception {
    }
}
