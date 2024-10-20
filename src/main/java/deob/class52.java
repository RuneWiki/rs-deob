package deob;

import java.awt.Component;

@ObfuscatedName("au")
public class class52 {

    @ObfuscatedName("au.q")
    public int[] field1084;

    @ObfuscatedName("au.w")
    public class48 field1099;

    @ObfuscatedName("au.v")
    public int field1086 = 32;

    @ObfuscatedName("au.z")
    public long field1098 = class121.method2();

    @ObfuscatedName("au.m")
    public int field1088;

    @ObfuscatedName("au.r")
    public int field1085;

    @ObfuscatedName("au.u")
    public int field1096;

    @ObfuscatedName("au.i")
    public long field1091 = 0L;

    @ObfuscatedName("au.x")
    public int field1092 = 0;

    @ObfuscatedName("au.s")
    public int field1093 = 0;

    @ObfuscatedName("au.o")
    public int field1094 = 0;

    @ObfuscatedName("au.g")
    public long field1095 = 0L;

    @ObfuscatedName("au.d")
    public boolean field1103 = true;

    @ObfuscatedName("au.am")
    public int field1097 = 0;

    @ObfuscatedName("au.az")
    public class48[] field1082 = new class48[8];

    @ObfuscatedName("au.ax")
    public class48[] field1090 = new class48[8];

    @ObfuscatedName("dj.aw(IZII)V")
    public static final void method2524(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2457 = arg0;
        Statics.field1089 = arg1;
        Statics.field1425 = arg2;
    }

    @ObfuscatedName("cm.ap(Lbb;Ljava/awt/Component;III)Lau;")
    public static final class52 method1882(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2457 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1084 = new int[(Statics.field1089 ? 2 : 1) * 256];
                var4.field1085 = arg3;
                var4.method937(arg1);
                var4.field1088 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1088 > 16384) {
                    var4.field1088 = 16384;
                }
                var4.method939(var4.field1088);
                if (Statics.field1425 > 0 && Statics.field1448 == null) {
                    Statics.field1448 = new class55();
                    Statics.field1448.field1175 = arg0;
                    arg0.method1517(Statics.field1448, Statics.field1425);
                }
                if (Statics.field1448 != null) {
                    if (Statics.field1448.field1166[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1448.field1166[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1084 = new int[256 * (Statics.field1089 ? 2 : 1)];
                    var6.field1085 = arg3;
                    var6.method937(arg1);
                    var6.field1088 = 16384;
                    var6.method939(var6.field1088);
                    if (Statics.field1425 > 0 && Statics.field1448 == null) {
                        Statics.field1448 = new class55();
                        Statics.field1448.field1175 = arg0;
                        arg0.method1517(Statics.field1448, Statics.field1425);
                    }
                    if (Statics.field1448 != null) {
                        if (Statics.field1448.field1166[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1448.field1166[arg2] = var6;
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

    @ObfuscatedName("au.am(Las;S)V")
    public final synchronized void method1172(class48 arg0) {
        this.field1099 = arg0;
    }

    @ObfuscatedName("au.az(I)V")
    public final synchronized void method1169() {
        if (this.field1084 == null) {
            return;
        }
        long var1 = class121.method2();
        try {
            if (this.field1091 != 0L) {
                if (var1 < this.field1091) {
                    return;
                }
                this.method939(this.field1088);
                this.field1091 = 0L;
                this.field1103 = true;
            }
            int var3 = this.method940();
            if (this.field1094 - var3 > this.field1092) {
                this.field1092 = this.field1094 - var3;
            }
            int var4 = this.field1096 + this.field1085;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1088) {
                this.field1088 += 1024;
                if (this.field1088 > 16384) {
                    this.field1088 = 16384;
                }
                this.method959();
                this.method939(this.field1088);
                var3 = 0;
                this.field1103 = true;
                if (var4 + 256 > this.field1088) {
                    var4 = this.field1088 - 256;
                    this.field1096 = var4 - this.field1085;
                }
            }
            while (var3 < var4) {
                this.method1176(this.field1084, 256);
                this.method941();
                var3 += 256;
            }
            if (var1 > this.field1095) {
                if (this.field1103) {
                    this.field1103 = false;
                } else if (this.field1092 == 0 && this.field1093 == 0) {
                    this.method959();
                    this.field1091 = var1 + 2000L;
                    return;
                } else {
                    this.field1096 = Math.min(this.field1093, this.field1092);
                    this.field1093 = this.field1092;
                }
                this.field1092 = 0;
                this.field1095 = var1 + 2000L;
            }
            this.field1094 = var3;
        } catch (Exception var8) {
            this.method959();
            this.field1091 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1098 + 500000L) {
                var1 = this.field1098;
            }
            while (var1 > this.field1098 + 5000L) {
                this.method1173(256);
                this.field1098 += (long) (256000 / Statics.field2457);
            }
        } catch (Exception var7) {
            this.field1098 = var1;
        }
    }

    @ObfuscatedName("au.ax(B)V")
    public final void method1170() {
        this.field1103 = true;
    }

    @ObfuscatedName("au.af(I)V")
    public final synchronized void method1171() {
        this.field1103 = true;
        try {
            this.method953();
        } catch (Exception var2) {
            this.method959();
            this.field1091 = class121.method2() + 2000L;
        }
    }

    @ObfuscatedName("au.aa(I)V")
    public final synchronized void method1195() {
        if (Statics.field1448 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1448.field1166[var2] == this) {
                    Statics.field1448.field1166[var2] = null;
                }
                if (Statics.field1448.field1166[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1448.field1169 = true;
                while (Statics.field1448.field1168) {
                    class126.method47(50L);
                }
                Statics.field1448 = null;
            }
        }
        this.method959();
        this.field1084 = null;
    }

    @ObfuscatedName("au.ag(II)V")
    public final void method1173(int arg0) {
        this.field1097 -= arg0;
        if (this.field1097 < 0) {
            this.field1097 = 0;
        }
        if (this.field1099 != null) {
            this.field1099.method1061(arg0);
        }
    }

    @ObfuscatedName("au.aj([II)V")
    public final void method1176(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1089) {
            var3 = arg1 << 1;
        }
        class128.method2685(arg0, 0, var3);
        this.field1097 -= arg1;
        if (this.field1099 != null && this.field1097 <= 0) {
            this.field1097 += Statics.field2457 >> 4;
            method1344(this.field1099);
            this.method1179(this.field1099, this.field1099.method965());
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
                        class48 var11 = this.field1082[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1060;
                                if (var12 == null || var12.field1057 <= var8) {
                                    var11.field1059 = true;
                                    int var13 = var11.method1041();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1057 += var13;
                                    }
                                    if (var4 >= this.field1086) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method985();
                                    if (var14 != null) {
                                        int var15 = var11.field1058;
                                        while (var14 != null) {
                                            this.method1179(var14, var15 * var14.method965() >> 8);
                                            var14 = var11.method986();
                                        }
                                    }
                                    class48 var16 = var11.field1061;
                                    var11.field1061 = null;
                                    if (var10 == null) {
                                        this.field1082[var7] = var16;
                                    } else {
                                        var10.field1061 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1090[var7] = var10;
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
                class48 var18 = this.field1082[var17];
                class48[] var19 = this.field1082;
                this.field1090[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1061;
                    var18.field1061 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1097 < 0) {
            this.field1097 = 0;
        }
        if (this.field1099 != null) {
            this.field1099.method994(arg0, 0, arg1);
        }
        this.field1098 = class121.method2();
    }

    @ObfuscatedName("bj.aq(Las;I)V")
    public static final void method1344(class48 arg0) {
        arg0.field1059 = false;
        if (arg0.field1060 != null) {
            arg0.field1060.field1057 = 0;
        }
        for (class48 var1 = arg0.method985(); var1 != null; var1 = arg0.method986()) {
            method1344(var1);
        }
    }

    @ObfuscatedName("au.ah(Las;IB)V")
    public final void method1179(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1090[var3];
        if (var4 == null) {
            this.field1082[var3] = arg0;
        } else {
            var4.field1061 = arg0;
        }
        this.field1090[var3] = arg0;
        arg0.field1058 = arg1;
    }

    @ObfuscatedName("au.p(Ljava/awt/Component;)V")
    public void method937(Component arg0) throws Exception {
    }

    @ObfuscatedName("au.e(I)V")
    public void method939(int arg0) throws Exception {
    }

    @ObfuscatedName("au.a()I")
    public int method940() throws Exception {
        return this.field1088;
    }

    @ObfuscatedName("au.h()V")
    public void method941() throws Exception {
    }

    @ObfuscatedName("au.y()V")
    public void method959() {
    }

    @ObfuscatedName("au.j()V")
    public void method953() throws Exception {
    }
}
