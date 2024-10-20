package deob;

import java.awt.Component;

@ObfuscatedName("aq")
public class class51 {

    @ObfuscatedName("aq.w")
    public int[] field1072;

    @ObfuscatedName("aq.k")
    public class47 field1073;

    @ObfuscatedName("aq.v")
    public int field1071 = 32;

    @ObfuscatedName("aq.o")
    public long field1075 = class120.method2616();

    @ObfuscatedName("aq.m")
    public int field1076;

    @ObfuscatedName("aq.u")
    public int field1068;

    @ObfuscatedName("aq.r")
    public int field1078;

    @ObfuscatedName("aq.d")
    public long field1074 = 0L;

    @ObfuscatedName("aq.n")
    public int field1080 = 0;

    @ObfuscatedName("aq.b")
    public int field1081 = 0;

    @ObfuscatedName("aq.p")
    public int field1082 = 0;

    @ObfuscatedName("aq.t")
    public long field1083 = 0L;

    @ObfuscatedName("aq.l")
    public boolean field1070 = true;

    @ObfuscatedName("aq.au")
    public int field1090 = 0;

    @ObfuscatedName("aq.aw")
    public class47[] field1087 = new class47[8];

    @ObfuscatedName("aq.ad")
    public class47[] field1088 = new class47[8];

    @ObfuscatedName("bh.a(Lbo;Ljava/awt/Component;III)Laq;")
    public static final class51 method1336(class73 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1091 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class50 var4 = new class50();
                var4.field1072 = new int[(Statics.field2033 ? 2 : 1) * 256];
                var4.field1068 = arg3;
                var4.method911(arg1);
                var4.field1076 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1076 > 16384) {
                    var4.field1076 = 16384;
                }
                var4.method903(var4.field1076);
                if (Statics.field2306 > 0 && Statics.field1069 == null) {
                    Statics.field1069 = new class54();
                    Statics.field1069.field1158 = arg0;
                    arg0.method1455(Statics.field1069, Statics.field2306);
                }
                if (Statics.field1069 != null) {
                    if (Statics.field1069.field1156[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1069.field1156[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class43 var6 = new class43(arg0, arg2);
                    var6.field1072 = new int[256 * (Statics.field2033 ? 2 : 1)];
                    var6.field1068 = arg3;
                    var6.method911(arg1);
                    var6.field1076 = 16384;
                    var6.method903(var6.field1076);
                    if (Statics.field2306 > 0 && Statics.field1069 == null) {
                        Statics.field1069 = new class54();
                        Statics.field1069.field1158 = arg0;
                        arg0.method1455(Statics.field1069, Statics.field2306);
                    }
                    if (Statics.field1069 != null) {
                        if (Statics.field1069.field1156[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1069.field1156[arg2] = var6;
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

    @ObfuscatedName("aq.f(Lak;B)V")
    public final synchronized void method1128(class47 arg0) {
        this.field1073 = arg0;
    }

    @ObfuscatedName("aq.h(S)V")
    public final synchronized void method1129() {
        if (this.field1072 == null) {
            return;
        }
        long var1 = class120.method2616();
        try {
            if (this.field1074 != 0L) {
                if (var1 < this.field1074) {
                    return;
                }
                this.method903(this.field1076);
                this.field1074 = 0L;
                this.field1070 = true;
            }
            int var3 = this.method905();
            if (this.field1082 - var3 > this.field1080) {
                this.field1080 = this.field1082 - var3;
            }
            int var4 = this.field1078 + this.field1068;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1076) {
                this.field1076 += 1024;
                if (this.field1076 > 16384) {
                    this.field1076 = 16384;
                }
                this.method907();
                this.method903(this.field1076);
                var3 = 0;
                this.field1070 = true;
                if (var4 + 256 > this.field1076) {
                    var4 = this.field1076 - 256;
                    this.field1078 = var4 - this.field1068;
                }
            }
            while (var3 < var4) {
                this.method1132(this.field1072, 256);
                this.method906();
                var3 += 256;
            }
            if (var1 > this.field1083) {
                if (this.field1070) {
                    this.field1070 = false;
                } else if (this.field1080 == 0 && this.field1081 == 0) {
                    this.method907();
                    this.field1074 = var1 + 2000L;
                    return;
                } else {
                    this.field1078 = Math.min(this.field1081, this.field1080);
                    this.field1081 = this.field1080;
                }
                this.field1080 = 0;
                this.field1083 = var1 + 2000L;
            }
            this.field1082 = var3;
        } catch (Exception var8) {
            this.method907();
            this.field1074 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1075 + 500000L) {
                var1 = this.field1075;
            }
            while (var1 > this.field1075 + 5000L) {
                this.method1137(256);
                this.field1075 += (long) (256000 / Statics.field1091);
            }
        } catch (Exception var7) {
            this.field1075 = var1;
        }
    }

    @ObfuscatedName("aq.az(I)V")
    public final void method1130() {
        this.field1070 = true;
    }

    @ObfuscatedName("aq.ao(I)V")
    public final synchronized void method1131() {
        this.field1070 = true;
        try {
            this.method908();
        } catch (Exception var2) {
            this.method907();
            this.field1074 = class120.method2616() + 2000L;
        }
    }

    @ObfuscatedName("aq.au(B)V")
    public final synchronized void method1133() {
        if (Statics.field1069 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1069.field1156[var2] == this) {
                    Statics.field1069.field1156[var2] = null;
                }
                if (Statics.field1069.field1156[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1069.field1157 = true;
                while (Statics.field1069.field1160) {
                    class125.method112(50L);
                }
                Statics.field1069 = null;
            }
        }
        this.method907();
        this.field1072 = null;
    }

    @ObfuscatedName("aq.aw(II)V")
    public final void method1137(int arg0) {
        this.field1090 -= arg0;
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1073 != null) {
            this.field1073.method951(arg0);
        }
    }

    @ObfuscatedName("aq.ad([II)V")
    public final void method1132(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2033) {
            var3 = arg1 << 1;
        }
        class127.method2597(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1073 != null && this.field1090 <= 0) {
            this.field1090 += Statics.field1091 >> 4;
            method786(this.field1073);
            this.method1135(this.field1073, this.field1073.method927());
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
                        class47 var11 = this.field1087[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class46 var12 = var11.field1045;
                                if (var12 == null || var12.field1043 <= var8) {
                                    var11.field1047 = true;
                                    int var13 = var11.method981();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1043 += var13;
                                    }
                                    if (var4 >= this.field1071) {
                                        break label105;
                                    }
                                    class47 var14 = var11.method947();
                                    if (var14 != null) {
                                        int var15 = var11.field1046;
                                        while (var14 != null) {
                                            this.method1135(var14, var15 * var14.method927() >> 8);
                                            var14 = var11.method977();
                                        }
                                    }
                                    class47 var16 = var11.field1044;
                                    var11.field1044 = null;
                                    if (var10 == null) {
                                        this.field1087[var7] = var16;
                                    } else {
                                        var10.field1044 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1088[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1044;
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
                class47 var18 = this.field1087[var17];
                class47[] var19 = this.field1087;
                this.field1088[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class47 var21 = var18.field1044;
                    var18.field1044 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1073 != null) {
            this.field1073.method1077(arg0, 0, arg1);
        }
        this.field1075 = class120.method2616();
    }

    @ObfuscatedName("ax.av(Lak;I)V")
    public static final void method786(class47 arg0) {
        arg0.field1047 = false;
        if (arg0.field1045 != null) {
            arg0.field1045.field1043 = 0;
        }
        for (class47 var1 = arg0.method947(); var1 != null; var1 = arg0.method977()) {
            method786(var1);
        }
    }

    @ObfuscatedName("aq.am(Lak;II)V")
    public final void method1135(class47 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class47 var4 = this.field1088[var3];
        if (var4 == null) {
            this.field1087[var3] = arg0;
        } else {
            var4.field1044 = arg0;
        }
        this.field1088[var3] = arg0;
        arg0.field1046 = arg1;
    }

    @ObfuscatedName("aq.j(Ljava/awt/Component;)V")
    public void method911(Component arg0) throws Exception {
    }

    @ObfuscatedName("aq.y(I)V")
    public void method903(int arg0) throws Exception {
    }

    @ObfuscatedName("aq.x()I")
    public int method905() throws Exception {
        return this.field1076;
    }

    @ObfuscatedName("aq.z()V")
    public void method906() throws Exception {
    }

    @ObfuscatedName("aq.c()V")
    public void method907() {
    }

    @ObfuscatedName("aq.e()V")
    public void method908() throws Exception {
    }
}
