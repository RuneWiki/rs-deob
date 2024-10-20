package deob;

import java.awt.Component;

@ObfuscatedName("aq")
public class class51 {

    @ObfuscatedName("aq.u")
    public int[] field1087;

    @ObfuscatedName("aq.l")
    public class61 field1088;

    @ObfuscatedName("aq.k")
    public int field1089 = 32;

    @ObfuscatedName("aq.q")
    public long field1090 = class104.method27();

    @ObfuscatedName("aq.b")
    public int field1091;

    @ObfuscatedName("aq.w")
    public int field1100;

    @ObfuscatedName("aq.g")
    public int field1093;

    @ObfuscatedName("aq.s")
    public long field1086 = 0L;

    @ObfuscatedName("aq.c")
    public int field1095 = 0;

    @ObfuscatedName("aq.r")
    public int field1098 = 0;

    @ObfuscatedName("aq.f")
    public int field1097 = 0;

    @ObfuscatedName("aq.t")
    public long field1094 = 0L;

    @ObfuscatedName("aq.o")
    public boolean field1099 = true;

    @ObfuscatedName("aq.ae")
    public int field1101 = 0;

    @ObfuscatedName("aq.ay")
    public class61[] field1102 = new class61[8];

    @ObfuscatedName("aq.ac")
    public class61[] field1103 = new class61[8];

    @ObfuscatedName("s.z(Ldg;Ljava/awt/Component;IIB)Laq;")
    public static final class51 method144(class125 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1096 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1087 = new int[256 * (Statics.field1092 ? 2 : 1)];
                var4.field1100 = arg3;
                var4.method963(arg1);
                var4.field1091 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1091 > 16384) {
                    var4.field1091 = 16384;
                }
                var4.method952(var4.field1091);
                if (Statics.field2929 > 0 && Statics.field695 == null) {
                    Statics.field695 = new class67();
                    Statics.field695.field1262 = arg0;
                    arg0.method2500(Statics.field695, Statics.field2929);
                }
                if (Statics.field695 != null) {
                    if (Statics.field695.field1267[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field695.field1267[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1087 = new int[(Statics.field1092 ? 2 : 1) * 256];
                    var6.field1100 = arg3;
                    var6.method963(arg1);
                    var6.field1091 = 16384;
                    var6.method952(var6.field1091);
                    if (Statics.field2929 > 0 && Statics.field695 == null) {
                        Statics.field695 = new class67();
                        Statics.field695.field1262 = arg0;
                        arg0.method2500(Statics.field695, Statics.field2929);
                    }
                    if (Statics.field695 != null) {
                        if (Statics.field695.field1267[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field695.field1267[arg2] = var6;
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

    @ObfuscatedName("aq.d(Lbh;B)V")
    public final synchronized void method1027(class61 arg0) {
        this.field1088 = arg0;
    }

    @ObfuscatedName("aq.y(B)V")
    public final synchronized void method1028() {
        if (this.field1087 == null) {
            return;
        }
        long var1 = class104.method27();
        try {
            if (this.field1086 != 0L) {
                if (var1 < this.field1086) {
                    return;
                }
                this.method952(this.field1091);
                this.field1086 = 0L;
                this.field1099 = true;
            }
            int var3 = this.method953();
            if (this.field1097 - var3 > this.field1095) {
                this.field1095 = this.field1097 - var3;
            }
            int var4 = this.field1100 + this.field1093;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1091) {
                this.field1091 += 1024;
                if (this.field1091 > 16384) {
                    this.field1091 = 16384;
                }
                this.method955();
                this.method952(this.field1091);
                var3 = 0;
                this.field1099 = true;
                if (var4 + 256 > this.field1091) {
                    var4 = this.field1091 - 256;
                    this.field1093 = var4 - this.field1100;
                }
            }
            while (var3 < var4) {
                this.method1033(this.field1087, 256);
                this.method964();
                var3 += 256;
            }
            if (var1 > this.field1094) {
                if (this.field1099) {
                    this.field1099 = false;
                } else if (this.field1095 == 0 && this.field1098 == 0) {
                    this.method955();
                    this.field1086 = var1 + 2000L;
                    return;
                } else {
                    this.field1093 = Math.min(this.field1098, this.field1095);
                    this.field1098 = this.field1095;
                }
                this.field1095 = 0;
                this.field1094 = var1 + 2000L;
            }
            this.field1097 = var3;
        } catch (Exception var8) {
            this.method955();
            this.field1086 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1090 + 500000L) {
                var1 = this.field1090;
            }
            while (var1 > this.field1090 + 5000L) {
                this.method1032(256);
                this.field1090 += (long) (256000 / Statics.field1096);
            }
        } catch (Exception var7) {
            this.field1090 = var1;
        }
    }

    @ObfuscatedName("aq.a(I)V")
    public final void method1029() {
        this.field1099 = true;
    }

    @ObfuscatedName("aq.n(I)V")
    public final synchronized void method1030() {
        this.field1099 = true;
        try {
            this.method950();
        } catch (Exception var2) {
            this.method955();
            this.field1086 = class104.method27() + 2000L;
        }
    }

    @ObfuscatedName("aq.ae(I)V")
    public final synchronized void method1031() {
        if (Statics.field695 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field695.field1267[var2] == this) {
                    Statics.field695.field1267[var2] = null;
                }
                if (Statics.field695.field1267[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field695.field1263 = true;
                while (Statics.field695.field1264) {
                    class116.method1361(50L);
                }
                Statics.field695 = null;
            }
        }
        this.method955();
        this.field1087 = null;
    }

    @ObfuscatedName("aq.ay(II)V")
    public final void method1032(int arg0) {
        this.field1101 -= arg0;
        if (this.field1101 < 0) {
            this.field1101 = 0;
        }
        if (this.field1088 != null) {
            this.field1088.method982(arg0);
        }
    }

    @ObfuscatedName("aq.ac([II)V")
    public final void method1033(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1092) {
            var3 = arg1 << 1;
        }
        class109.method2349(arg0, 0, var3);
        this.field1101 -= arg1;
        if (this.field1088 != null && this.field1101 <= 0) {
            this.field1101 += Statics.field1096 >> 4;
            method767(this.field1088);
            this.method1034(this.field1088, this.field1088.method1181());
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
                        class61 var11 = this.field1102[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1180;
                                if (var12 == null || var12.field1176 <= var8) {
                                    var11.field1177 = true;
                                    int var13 = var11.method979();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1176 += var13;
                                    }
                                    if (var4 >= this.field1089) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method977();
                                    if (var14 != null) {
                                        int var15 = var11.field1178;
                                        while (var14 != null) {
                                            this.method1034(var14, var15 * var14.method1181() >> 8);
                                            var14 = var11.method975();
                                        }
                                    }
                                    class61 var16 = var11.field1179;
                                    var11.field1179 = null;
                                    if (var10 == null) {
                                        this.field1102[var7] = var16;
                                    } else {
                                        var10.field1179 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1103[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1179;
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
                class61 var18 = this.field1102[var17];
                class61[] var19 = this.field1102;
                this.field1103[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1179;
                    var18.field1179 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1101 < 0) {
            this.field1101 = 0;
        }
        if (this.field1088 != null) {
            this.field1088.method980(arg0, 0, arg1);
        }
        this.field1090 = class104.method27();
    }

    @ObfuscatedName("ar.ag(Lbh;I)V")
    public static final void method767(class61 arg0) {
        arg0.field1177 = false;
        if (arg0.field1180 != null) {
            arg0.field1180.field1176 = 0;
        }
        for (class61 var1 = arg0.method977(); var1 != null; var1 = arg0.method975()) {
            method767(var1);
        }
    }

    @ObfuscatedName("aq.am(Lbh;II)V")
    public final void method1034(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1103[var3];
        if (var4 == null) {
            this.field1102[var3] = arg0;
        } else {
            var4.field1179 = arg0;
        }
        this.field1103[var3] = arg0;
        arg0.field1178 = arg1;
    }

    @ObfuscatedName("aq.x(Ljava/awt/Component;)V")
    public void method963(Component arg0) throws Exception {
    }

    @ObfuscatedName("aq.v(I)V")
    public void method952(int arg0) throws Exception {
    }

    @ObfuscatedName("aq.m()I")
    public int method953() throws Exception {
        return this.field1091;
    }

    @ObfuscatedName("aq.e()V")
    public void method964() throws Exception {
    }

    @ObfuscatedName("aq.h()V")
    public void method955() {
    }

    @ObfuscatedName("aq.p()V")
    public void method950() throws Exception {
    }
}
