package deob;

import java.awt.Component;

@ObfuscatedName("as")
public class class52 {

    @ObfuscatedName("as.r")
    public int[] field1097;

    @ObfuscatedName("as.d")
    public class48 field1098;

    @ObfuscatedName("as.a")
    public int field1116 = 32;

    @ObfuscatedName("as.q")
    public long field1100 = class121.method711();

    @ObfuscatedName("as.u")
    public int field1101;

    @ObfuscatedName("as.w")
    public int field1102;

    @ObfuscatedName("as.s")
    public int field1103;

    @ObfuscatedName("as.e")
    public long field1104 = 0L;

    @ObfuscatedName("as.b")
    public int field1099 = 0;

    @ObfuscatedName("as.j")
    public int field1109 = 0;

    @ObfuscatedName("as.h")
    public int field1106 = 0;

    @ObfuscatedName("as.m")
    public long field1108 = 0L;

    @ObfuscatedName("as.y")
    public boolean field1113 = true;

    @ObfuscatedName("as.ae")
    public int field1111 = 0;

    @ObfuscatedName("as.af")
    public class48[] field1107 = new class48[8];

    @ObfuscatedName("as.ao")
    public class48[] field1094 = new class48[8];

    @ObfuscatedName("ex.m(IZII)V")
    public static final void method2728(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1112 = arg0;
        Statics.field1095 = arg1;
        Statics.field360 = arg2;
    }

    @ObfuscatedName("ay.y(Lbl;Ljava/awt/Component;III)Las;")
    public static final class52 method576(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1112 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1097 = new int[(Statics.field1095 ? 2 : 1) * 256];
                var4.field1102 = arg3;
                var4.method947(arg1);
                var4.field1101 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1101 > 16384) {
                    var4.field1101 = 16384;
                }
                var4.method949(var4.field1101);
                if (Statics.field360 > 0 && Statics.field246 == null) {
                    Statics.field246 = new class55();
                    Statics.field246.field1183 = arg0;
                    arg0.method1521(Statics.field246, Statics.field360);
                }
                if (Statics.field246 != null) {
                    if (Statics.field246.field1182[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field246.field1182[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1097 = new int[(Statics.field1095 ? 2 : 1) * 256];
                    var6.field1102 = arg3;
                    var6.method947(arg1);
                    var6.field1101 = 16384;
                    var6.method949(var6.field1101);
                    if (Statics.field360 > 0 && Statics.field246 == null) {
                        Statics.field246 = new class55();
                        Statics.field246.field1183 = arg0;
                        arg0.method1521(Statics.field246, Statics.field360);
                    }
                    if (Statics.field246 != null) {
                        if (Statics.field246.field1182[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field246.field1182[arg2] = var6;
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

    @ObfuscatedName("as.t(Law;B)V")
    public final synchronized void method1209(class48 arg0) {
        this.field1098 = arg0;
    }

    @ObfuscatedName("as.k(B)V")
    public final synchronized void method1192() {
        if (this.field1097 == null) {
            return;
        }
        long var1 = class121.method711();
        try {
            if (this.field1104 != 0L) {
                if (var1 < this.field1104) {
                    return;
                }
                this.method949(this.field1101);
                this.field1104 = 0L;
                this.field1113 = true;
            }
            int var3 = this.method953();
            if (this.field1106 - var3 > this.field1099) {
                this.field1099 = this.field1106 - var3;
            }
            int var4 = this.field1103 + this.field1102;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1101) {
                this.field1101 += 1024;
                if (this.field1101 > 16384) {
                    this.field1101 = 16384;
                }
                this.method951();
                this.method949(this.field1101);
                var3 = 0;
                this.field1113 = true;
                if (var4 + 256 > this.field1101) {
                    var4 = this.field1101 - 256;
                    this.field1103 = var4 - this.field1102;
                }
            }
            while (var3 < var4) {
                this.method1210(this.field1097, 256);
                this.method950();
                var3 += 256;
            }
            if (var1 > this.field1108) {
                if (this.field1113) {
                    this.field1113 = false;
                } else if (this.field1099 == 0 && this.field1109 == 0) {
                    this.method951();
                    this.field1104 = var1 + 2000L;
                    return;
                } else {
                    this.field1103 = Math.min(this.field1109, this.field1099);
                    this.field1109 = this.field1099;
                }
                this.field1099 = 0;
                this.field1108 = var1 + 2000L;
            }
            this.field1106 = var3;
        } catch (Exception var8) {
            this.method951();
            this.field1104 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1100 + 500000L) {
                var1 = this.field1100;
            }
            while (var1 > this.field1100 + 5000L) {
                this.method1190(256);
                this.field1100 += (long) (256000 / Statics.field1112);
            }
        } catch (Exception var7) {
            this.field1100 = var1;
        }
    }

    @ObfuscatedName("as.z(I)V")
    public final void method1193() {
        this.field1113 = true;
    }

    @ObfuscatedName("as.at(I)V")
    public final synchronized void method1194() {
        this.field1113 = true;
        try {
            this.method952();
        } catch (Exception var2) {
            this.method951();
            this.field1104 = class121.method711() + 2000L;
        }
    }

    @ObfuscatedName("as.ay(I)V")
    public final synchronized void method1200() {
        if (Statics.field246 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field246.field1182[var2] == this) {
                    Statics.field246.field1182[var2] = null;
                }
                if (Statics.field246.field1182[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field246.field1179 = true;
                while (Statics.field246.field1180) {
                    class126.method2420(50L);
                }
                Statics.field246 = null;
            }
        }
        this.method951();
        this.field1097 = null;
    }

    @ObfuscatedName("as.ae(II)V")
    public final void method1190(int arg0) {
        this.field1111 -= arg0;
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1098 != null) {
            this.field1098.method988(arg0);
        }
    }

    @ObfuscatedName("as.af([II)V")
    public final void method1210(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1095) {
            var3 = arg1 << 1;
        }
        class128.method2717(arg0, 0, var3);
        this.field1111 -= arg1;
        if (this.field1098 != null && this.field1111 <= 0) {
            this.field1111 += Statics.field1112 >> 4;
            method2537(this.field1098);
            this.method1197(this.field1098, this.field1098.method969());
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
                        class48 var11 = this.field1107[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1073;
                                if (var12 == null || var12.field1069 <= var8) {
                                    var11.field1070 = true;
                                    int var13 = var11.method1046();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1069 += var13;
                                    }
                                    if (var4 >= this.field1116) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method990();
                                    if (var14 != null) {
                                        int var15 = var11.field1071;
                                        while (var14 != null) {
                                            this.method1197(var14, var15 * var14.method969() >> 8);
                                            var14 = var11.method989();
                                        }
                                    }
                                    class48 var16 = var11.field1072;
                                    var11.field1072 = null;
                                    if (var10 == null) {
                                        this.field1107[var7] = var16;
                                    } else {
                                        var10.field1072 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1094[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1072;
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
                class48 var18 = this.field1107[var17];
                class48[] var19 = this.field1107;
                this.field1094[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1072;
                    var18.field1072 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1098 != null) {
            this.field1098.method1044(arg0, 0, arg1);
        }
        this.field1100 = class121.method711();
    }

    @ObfuscatedName("dt.ao(Law;S)V")
    public static final void method2537(class48 arg0) {
        arg0.field1070 = false;
        if (arg0.field1073 != null) {
            arg0.field1073.field1069 = 0;
        }
        for (class48 var1 = arg0.method990(); var1 != null; var1 = arg0.method989()) {
            method2537(var1);
        }
    }

    @ObfuscatedName("as.ad(Law;IS)V")
    public final void method1197(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1094[var3];
        if (var4 == null) {
            this.field1107[var3] = arg0;
        } else {
            var4.field1072 = arg0;
        }
        this.field1094[var3] = arg0;
        arg0.field1071 = arg1;
    }

    @ObfuscatedName("as.p(Ljava/awt/Component;)V")
    public void method947(Component arg0) throws Exception {
    }

    @ObfuscatedName("as.i(I)V")
    public void method949(int arg0) throws Exception {
    }

    @ObfuscatedName("as.o()I")
    public int method953() throws Exception {
        return this.field1101;
    }

    @ObfuscatedName("as.n()V")
    public void method950() throws Exception {
    }

    @ObfuscatedName("as.l()V")
    public void method951() {
    }

    @ObfuscatedName("as.v()V")
    public void method952() throws Exception {
    }
}
