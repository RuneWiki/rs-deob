package deob;

import java.awt.Component;

@ObfuscatedName("ak")
public class class52 {

    @ObfuscatedName("ak.c")
    public int[] field1086;

    @ObfuscatedName("ak.m")
    public class48 field1087;

    @ObfuscatedName("ak.a")
    public int field1088 = 32;

    @ObfuscatedName("ak.e")
    public long field1089 = class121.method1435();

    @ObfuscatedName("ak.q")
    public int field1090;

    @ObfuscatedName("ak.y")
    public int field1091;

    @ObfuscatedName("ak.v")
    public int field1085;

    @ObfuscatedName("ak.s")
    public long field1102 = 0L;

    @ObfuscatedName("ak.u")
    public int field1094 = 0;

    @ObfuscatedName("ak.d")
    public int field1095 = 0;

    @ObfuscatedName("ak.i")
    public int field1093 = 0;

    @ObfuscatedName("ak.p")
    public long field1097 = 0L;

    @ObfuscatedName("ak.h")
    public boolean field1098 = true;

    @ObfuscatedName("ak.an")
    public int field1100 = 0;

    @ObfuscatedName("ak.ad")
    public class48[] field1101 = new class48[8];

    @ObfuscatedName("ak.at")
    public class48[] field1107 = new class48[8];

    @ObfuscatedName("v.d(IZIB)V")
    public static final void method154(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field745 = arg0;
        Statics.field1731 = arg1;
        Statics.field1106 = arg2;
    }

    @ObfuscatedName("bc.i(Lbk;Ljava/awt/Component;IIB)Lak;")
    public static final class52 method1371(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field745 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1086 = new int[(Statics.field1731 ? 2 : 1) * 256];
                var4.field1091 = arg3;
                var4.method940(arg1);
                var4.field1090 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1090 > 16384) {
                    var4.field1090 = 16384;
                }
                var4.method924(var4.field1090);
                if (Statics.field1106 > 0 && Statics.field1084 == null) {
                    Statics.field1084 = new class55();
                    Statics.field1084.field1168 = arg0;
                    arg0.method1517(Statics.field1084, Statics.field1106);
                }
                if (Statics.field1084 != null) {
                    if (Statics.field1084.field1169[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1084.field1169[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1086 = new int[256 * (Statics.field1731 ? 2 : 1)];
                    var6.field1091 = arg3;
                    var6.method940(arg1);
                    var6.field1090 = 16384;
                    var6.method924(var6.field1090);
                    if (Statics.field1106 > 0 && Statics.field1084 == null) {
                        Statics.field1084 = new class55();
                        Statics.field1084.field1168 = arg0;
                        arg0.method1517(Statics.field1084, Statics.field1106);
                    }
                    if (Statics.field1084 != null) {
                        if (Statics.field1084.field1169[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1084.field1169[arg2] = var6;
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

    @ObfuscatedName("ak.p(Las;I)V")
    public final synchronized void method1153(class48 arg0) {
        this.field1087 = arg0;
    }

    @ObfuscatedName("ak.h(I)V")
    public final synchronized void method1154() {
        if (this.field1086 == null) {
            return;
        }
        long var1 = class121.method1435();
        try {
            if (this.field1102 != 0L) {
                if (var1 < this.field1102) {
                    return;
                }
                this.method924(this.field1090);
                this.field1102 = 0L;
                this.field1098 = true;
            }
            int var3 = this.method925();
            if (this.field1093 - var3 > this.field1094) {
                this.field1094 = this.field1093 - var3;
            }
            int var4 = this.field1091 + this.field1085;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1090) {
                this.field1090 += 1024;
                if (this.field1090 > 16384) {
                    this.field1090 = 16384;
                }
                this.method922();
                this.method924(this.field1090);
                var3 = 0;
                this.field1098 = true;
                if (var4 + 256 > this.field1090) {
                    var4 = this.field1090 - 256;
                    this.field1085 = var4 - this.field1091;
                }
            }
            while (var3 < var4) {
                this.method1159(this.field1086, 256);
                this.method926();
                var3 += 256;
            }
            if (var1 > this.field1097) {
                if (this.field1098) {
                    this.field1098 = false;
                } else if (this.field1094 == 0 && this.field1095 == 0) {
                    this.method922();
                    this.field1102 = var1 + 2000L;
                    return;
                } else {
                    this.field1085 = Math.min(this.field1095, this.field1094);
                    this.field1095 = this.field1094;
                }
                this.field1094 = 0;
                this.field1097 = var1 + 2000L;
            }
            this.field1093 = var3;
        } catch (Exception var8) {
            this.method922();
            this.field1102 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1089 + 500000L) {
                var1 = this.field1089;
            }
            while (var1 > this.field1089 + 5000L) {
                this.method1158(256);
                this.field1089 += (long) (256000 / Statics.field745);
            }
        } catch (Exception var7) {
            this.field1089 = var1;
        }
    }

    @ObfuscatedName("ak.f(I)V")
    public final void method1157() {
        this.field1098 = true;
    }

    @ObfuscatedName("ak.t(I)V")
    public final synchronized void method1164() {
        this.field1098 = true;
        try {
            this.method930();
        } catch (Exception var2) {
            this.method922();
            this.field1102 = class121.method1435() + 2000L;
        }
    }

    @ObfuscatedName("ak.x(I)V")
    public final synchronized void method1163() {
        if (Statics.field1084 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1084.field1169[var2] == this) {
                    Statics.field1084.field1169[var2] = null;
                }
                if (Statics.field1084.field1169[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1084.field1170 = true;
                while (Statics.field1084.field1171) {
                    class126.method46(50L);
                }
                Statics.field1084 = null;
            }
        }
        this.method922();
        this.field1086 = null;
    }

    @ObfuscatedName("ak.ar(IS)V")
    public final void method1158(int arg0) {
        this.field1100 -= arg0;
        if (this.field1100 < 0) {
            this.field1100 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method967(arg0);
        }
    }

    @ObfuscatedName("ak.au([II)V")
    public final void method1159(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1731) {
            var3 = arg1 << 1;
        }
        class128.method2670(arg0, 0, var3);
        this.field1100 -= arg1;
        if (this.field1087 != null && this.field1100 <= 0) {
            this.field1100 += Statics.field745 >> 4;
            method2417(this.field1087);
            this.method1160(this.field1087, this.field1087.method943());
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
                        class48 var11 = this.field1101[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1059;
                                if (var12 == null || var12.field1058 <= var8) {
                                    var11.field1061 = true;
                                    int var13 = var11.method965();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1058 += var13;
                                    }
                                    if (var4 >= this.field1088) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method963();
                                    if (var14 != null) {
                                        int var15 = var11.field1060;
                                        while (var14 != null) {
                                            this.method1160(var14, var15 * var14.method943() >> 8);
                                            var14 = var11.method1090();
                                        }
                                    }
                                    class48 var16 = var11.field1062;
                                    var11.field1062 = null;
                                    if (var10 == null) {
                                        this.field1101[var7] = var16;
                                    } else {
                                        var10.field1062 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1107[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1062;
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
                class48 var18 = this.field1101[var17];
                class48[] var19 = this.field1101;
                this.field1107[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1062;
                    var18.field1062 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1100 < 0) {
            this.field1100 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method1095(arg0, 0, arg1);
        }
        this.field1089 = class121.method1435();
    }

    @ObfuscatedName("dj.an(Las;I)V")
    public static final void method2417(class48 arg0) {
        arg0.field1061 = false;
        if (arg0.field1059 != null) {
            arg0.field1059.field1058 = 0;
        }
        for (class48 var1 = arg0.method963(); var1 != null; var1 = arg0.method1090()) {
            method2417(var1);
        }
    }

    @ObfuscatedName("ak.ad(Las;II)V")
    public final void method1160(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1107[var3];
        if (var4 == null) {
            this.field1101[var3] = arg0;
        } else {
            var4.field1062 = arg0;
        }
        this.field1107[var3] = arg0;
        arg0.field1060 = arg1;
    }

    @ObfuscatedName("ak.l(Ljava/awt/Component;)V")
    public void method940(Component arg0) throws Exception {
    }

    @ObfuscatedName("ak.b(I)V")
    public void method924(int arg0) throws Exception {
    }

    @ObfuscatedName("ak.o()I")
    public int method925() throws Exception {
        return this.field1090;
    }

    @ObfuscatedName("ak.w()V")
    public void method926() throws Exception {
    }

    @ObfuscatedName("ak.r()V")
    public void method922() {
    }

    @ObfuscatedName("ak.k()V")
    public void method930() throws Exception {
    }
}
