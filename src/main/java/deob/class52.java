package deob;

import java.awt.Component;

@ObfuscatedName("ak")
public class class52 {

    @ObfuscatedName("ak.g")
    public int[] field1103;

    @ObfuscatedName("ak.s")
    public class48 field1098;

    @ObfuscatedName("ak.n")
    public int field1100 = 32;

    @ObfuscatedName("ak.x")
    public long field1101 = class121.method2318();

    @ObfuscatedName("ak.o")
    public int field1120;

    @ObfuscatedName("ak.l")
    public int field1096;

    @ObfuscatedName("ak.u")
    public int field1104;

    @ObfuscatedName("ak.z")
    public long field1105 = 0L;

    @ObfuscatedName("ak.d")
    public int field1106 = 0;

    @ObfuscatedName("ak.m")
    public int field1107 = 0;

    @ObfuscatedName("ak.f")
    public int field1108 = 0;

    @ObfuscatedName("ak.a")
    public long field1099 = 0L;

    @ObfuscatedName("ak.h")
    public boolean field1102 = true;

    @ObfuscatedName("ak.ae")
    public int field1094 = 0;

    @ObfuscatedName("ak.au")
    public class48[] field1110 = new class48[8];

    @ObfuscatedName("ak.ag")
    public class48[] field1116 = new class48[8];

    @ObfuscatedName("ay.p(IZIB)V")
    public static final void method807(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1117 = arg0;
        Statics.field1109 = arg1;
        Statics.field260 = arg2;
    }

    @ObfuscatedName("dn.e(Lbg;Ljava/awt/Component;III)Lak;")
    public static final class52 method2191(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1117 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1103 = new int[(Statics.field1109 ? 2 : 1) * 256];
                var4.field1096 = arg3;
                var4.method914(arg1);
                var4.field1120 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1120 > 16384) {
                    var4.field1120 = 16384;
                }
                var4.method917(var4.field1120);
                if (Statics.field260 > 0 && Statics.field1095 == null) {
                    Statics.field1095 = new class55();
                    Statics.field1095.field1186 = arg0;
                    arg0.method1463(Statics.field1095, Statics.field260);
                }
                if (Statics.field1095 != null) {
                    if (Statics.field1095.field1190[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1095.field1190[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1103 = new int[256 * (Statics.field1109 ? 2 : 1)];
                    var6.field1096 = arg3;
                    var6.method914(arg1);
                    var6.field1120 = 16384;
                    var6.method917(var6.field1120);
                    if (Statics.field260 > 0 && Statics.field1095 == null) {
                        Statics.field1095 = new class55();
                        Statics.field1095.field1186 = arg0;
                        arg0.method1463(Statics.field1095, Statics.field260);
                    }
                    if (Statics.field1095 != null) {
                        if (Statics.field1095.field1190[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1095.field1190[arg2] = var6;
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

    @ObfuscatedName("ak.r(Lao;I)V")
    public final synchronized void method1144(class48 arg0) {
        this.field1098 = arg0;
    }

    @ObfuscatedName("ak.av(I)V")
    public final synchronized void method1152() {
        if (this.field1103 == null) {
            return;
        }
        long var1 = class121.method2318();
        try {
            if (this.field1105 != 0L) {
                if (var1 < this.field1105) {
                    return;
                }
                this.method917(this.field1120);
                this.field1105 = 0L;
                this.field1102 = true;
            }
            int var3 = this.method916();
            if (this.field1108 - var3 > this.field1106) {
                this.field1106 = this.field1108 - var3;
            }
            int var4 = this.field1104 + this.field1096;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1120) {
                this.field1120 += 1024;
                if (this.field1120 > 16384) {
                    this.field1120 = 16384;
                }
                this.method918();
                this.method917(this.field1120);
                var3 = 0;
                this.field1102 = true;
                if (var4 + 256 > this.field1120) {
                    var4 = this.field1120 - 256;
                    this.field1104 = var4 - this.field1096;
                }
            }
            while (var3 < var4) {
                this.method1171(this.field1103, 256);
                this.method931();
                var3 += 256;
            }
            if (var1 > this.field1099) {
                if (this.field1102) {
                    this.field1102 = false;
                } else if (this.field1106 == 0 && this.field1107 == 0) {
                    this.method918();
                    this.field1105 = var1 + 2000L;
                    return;
                } else {
                    this.field1104 = Math.min(this.field1107, this.field1106);
                    this.field1107 = this.field1106;
                }
                this.field1106 = 0;
                this.field1099 = var1 + 2000L;
            }
            this.field1108 = var3;
        } catch (Exception var8) {
            this.method918();
            this.field1105 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1101 + 500000L) {
                var1 = this.field1101;
            }
            while (var1 > this.field1101 + 5000L) {
                this.method1146(256);
                this.field1101 += (long) (256000 / Statics.field1117);
            }
        } catch (Exception var7) {
            this.field1101 = var1;
        }
    }

    @ObfuscatedName("ak.an(B)V")
    public final void method1141() {
        this.field1102 = true;
    }

    @ObfuscatedName("ak.ae(I)V")
    public final synchronized void method1142() {
        this.field1102 = true;
        try {
            this.method919();
        } catch (Exception var2) {
            this.method918();
            this.field1105 = class121.method2318() + 2000L;
        }
    }

    @ObfuscatedName("ak.au(I)V")
    public final synchronized void method1143() {
        if (Statics.field1095 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1095.field1190[var2] == this) {
                    Statics.field1095.field1190[var2] = null;
                }
                if (Statics.field1095.field1190[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1095.field1187 = true;
                while (Statics.field1095.field1191) {
                    class126.method874(50L);
                }
                Statics.field1095 = null;
            }
        }
        this.method918();
        this.field1103 = null;
    }

    @ObfuscatedName("ak.ag(II)V")
    public final void method1146(int arg0) {
        this.field1094 -= arg0;
        if (this.field1094 < 0) {
            this.field1094 = 0;
        }
        if (this.field1098 != null) {
            this.field1098.method963(arg0);
        }
    }

    @ObfuscatedName("ak.at([II)V")
    public final void method1171(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1109) {
            var3 = arg1 << 1;
        }
        class128.method2631(arg0, 0, var3);
        this.field1094 -= arg1;
        if (this.field1098 != null && this.field1094 <= 0) {
            this.field1094 += Statics.field1117 >> 4;
            method1266(this.field1098);
            this.method1147(this.field1098, this.field1098.method938());
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
                        class48 var11 = this.field1110[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1070;
                                if (var12 == null || var12.field1069 <= var8) {
                                    var11.field1073 = true;
                                    int var13 = var11.method961();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1069 += var13;
                                    }
                                    if (var4 >= this.field1100) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method959();
                                    if (var14 != null) {
                                        int var15 = var11.field1072;
                                        while (var14 != null) {
                                            this.method1147(var14, var15 * var14.method938() >> 8);
                                            var14 = var11.method960();
                                        }
                                    }
                                    class48 var16 = var11.field1071;
                                    var11.field1071 = null;
                                    if (var10 == null) {
                                        this.field1110[var7] = var16;
                                    } else {
                                        var10.field1071 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1116[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1071;
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
                class48 var18 = this.field1110[var17];
                class48[] var19 = this.field1110;
                this.field1116[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1071;
                    var18.field1071 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1094 < 0) {
            this.field1094 = 0;
        }
        if (this.field1098 != null) {
            this.field1098.method962(arg0, 0, arg1);
        }
        this.field1101 = class121.method2318();
    }

    @ObfuscatedName("bo.ac(Lao;I)V")
    public static final void method1266(class48 arg0) {
        arg0.field1073 = false;
        if (arg0.field1070 != null) {
            arg0.field1070.field1069 = 0;
        }
        for (class48 var1 = arg0.method959(); var1 != null; var1 = arg0.method960()) {
            method1266(var1);
        }
    }

    @ObfuscatedName("ak.aw(Lao;II)V")
    public final void method1147(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1116[var3];
        if (var4 == null) {
            this.field1110[var3] = arg0;
        } else {
            var4.field1071 = arg0;
        }
        this.field1116[var3] = arg0;
        arg0.field1072 = arg1;
    }

    @ObfuscatedName("ak.b(Ljava/awt/Component;)V")
    public void method914(Component arg0) throws Exception {
    }

    @ObfuscatedName("ak.c(I)V")
    public void method917(int arg0) throws Exception {
    }

    @ObfuscatedName("ak.j()I")
    public int method916() throws Exception {
        return this.field1120;
    }

    @ObfuscatedName("ak.i()V")
    public void method931() throws Exception {
    }

    @ObfuscatedName("ak.k()V")
    public void method918() {
    }

    @ObfuscatedName("ak.q()V")
    public void method919() throws Exception {
    }
}
