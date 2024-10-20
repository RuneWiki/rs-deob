package deob;

import java.awt.Component;

@ObfuscatedName("ar")
public class class52 {

    @ObfuscatedName("ar.d")
    public int[] field1081;

    @ObfuscatedName("ar.z")
    public class48 field1082;

    @ObfuscatedName("ar.n")
    public int field1103 = 32;

    @ObfuscatedName("ar.t")
    public long field1084 = class121.method2221();

    @ObfuscatedName("ar.w")
    public int field1085;

    @ObfuscatedName("ar.r")
    public int field1086;

    @ObfuscatedName("ar.x")
    public int field1087;

    @ObfuscatedName("ar.v")
    public long field1097 = 0L;

    @ObfuscatedName("ar.y")
    public int field1089 = 0;

    @ObfuscatedName("ar.k")
    public int field1090 = 0;

    @ObfuscatedName("ar.p")
    public int field1091 = 0;

    @ObfuscatedName("ar.s")
    public long field1092 = 0L;

    @ObfuscatedName("ar.m")
    public boolean field1077 = true;

    @ObfuscatedName("ar.ax")
    public int field1083 = 0;

    @ObfuscatedName("ar.ao")
    public class48[] field1088 = new class48[8];

    @ObfuscatedName("ar.aq")
    public class48[] field1099 = new class48[8];

    @ObfuscatedName("db.s(IZIS)V")
    public static final void method2220(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1093 = arg0;
        Statics.field1078 = arg1;
        Statics.field1079 = arg2;
    }

    @ObfuscatedName("ay.m(Lbs;Ljava/awt/Component;III)Lar;")
    public static final class52 method800(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1093 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1081 = new int[256 * (Statics.field1078 ? 2 : 1)];
                var4.field1086 = arg3;
                var4.method915(arg1);
                var4.field1085 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1085 > 16384) {
                    var4.field1085 = 16384;
                }
                var4.method900(var4.field1085);
                if (Statics.field1079 > 0 && Statics.field316 == null) {
                    Statics.field316 = new class55();
                    Statics.field316.field1167 = arg0;
                    arg0.method1480(Statics.field316, Statics.field1079);
                }
                if (Statics.field316 != null) {
                    if (Statics.field316.field1165[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field316.field1165[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1081 = new int[(Statics.field1078 ? 2 : 1) * 256];
                    var6.field1086 = arg3;
                    var6.method915(arg1);
                    var6.field1085 = 16384;
                    var6.method900(var6.field1085);
                    if (Statics.field1079 > 0 && Statics.field316 == null) {
                        Statics.field316 = new class55();
                        Statics.field316.field1167 = arg0;
                        arg0.method1480(Statics.field316, Statics.field1079);
                    }
                    if (Statics.field316 != null) {
                        if (Statics.field316.field1165[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field316.field1165[arg2] = var6;
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

    @ObfuscatedName("ar.c(Lai;I)V")
    public final synchronized void method1132(class48 arg0) {
        this.field1082 = arg0;
    }

    @ObfuscatedName("ar.i(I)V")
    public final synchronized void method1133() {
        if (this.field1081 == null) {
            return;
        }
        long var1 = class121.method2221();
        try {
            if (this.field1097 != 0L) {
                if (var1 < this.field1097) {
                    return;
                }
                this.method900(this.field1085);
                this.field1097 = 0L;
                this.field1077 = true;
            }
            int var3 = this.method901();
            if (this.field1091 - var3 > this.field1089) {
                this.field1089 = this.field1091 - var3;
            }
            int var4 = this.field1087 + this.field1086;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1085) {
                this.field1085 += 1024;
                if (this.field1085 > 16384) {
                    this.field1085 = 16384;
                }
                this.method904();
                this.method900(this.field1085);
                var3 = 0;
                this.field1077 = true;
                if (var4 + 256 > this.field1085) {
                    var4 = this.field1085 - 256;
                    this.field1087 = var4 - this.field1086;
                }
            }
            while (var3 < var4) {
                this.method1136(this.field1081, 256);
                this.method902();
                var3 += 256;
            }
            if (var1 > this.field1092) {
                if (this.field1077) {
                    this.field1077 = false;
                } else if (this.field1089 == 0 && this.field1090 == 0) {
                    this.method904();
                    this.field1097 = var1 + 2000L;
                    return;
                } else {
                    this.field1087 = Math.min(this.field1090, this.field1089);
                    this.field1090 = this.field1089;
                }
                this.field1089 = 0;
                this.field1092 = var1 + 2000L;
            }
            this.field1091 = var3;
        } catch (Exception var8) {
            this.method904();
            this.field1097 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1084 + 500000L) {
                var1 = this.field1084;
            }
            while (var1 > this.field1084 + 5000L) {
                this.method1140(256);
                this.field1084 += (long) (256000 / Statics.field1093);
            }
        } catch (Exception var7) {
            this.field1084 = var1;
        }
    }

    @ObfuscatedName("ar.u(I)V")
    public final void method1134() {
        this.field1077 = true;
    }

    @ObfuscatedName("ar.at(I)V")
    public final synchronized void method1144() {
        this.field1077 = true;
        try {
            this.method912();
        } catch (Exception var2) {
            this.method904();
            this.field1097 = class121.method2221() + 2000L;
        }
    }

    @ObfuscatedName("ar.as(I)V")
    public final synchronized void method1135() {
        if (Statics.field316 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field316.field1165[var2] == this) {
                    Statics.field316.field1165[var2] = null;
                }
                if (Statics.field316.field1165[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field316.field1166 = true;
                while (Statics.field316.field1171) {
                    class127.method686(50L);
                }
                Statics.field316 = null;
            }
        }
        this.method904();
        this.field1081 = null;
    }

    @ObfuscatedName("ar.ax(II)V")
    public final void method1140(int arg0) {
        this.field1083 -= arg0;
        if (this.field1083 < 0) {
            this.field1083 = 0;
        }
        if (this.field1082 != null) {
            this.field1082.method945(arg0);
        }
    }

    @ObfuscatedName("ar.ao([II)V")
    public final void method1136(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1078) {
            var3 = arg1 << 1;
        }
        class128.method2636(arg0, 0, var3);
        this.field1083 -= arg1;
        if (this.field1082 != null && this.field1083 <= 0) {
            this.field1083 += Statics.field1093 >> 4;
            method211(this.field1082);
            this.method1138(this.field1082, this.field1082.method921());
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
                        class48 var11 = this.field1088[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1055;
                                if (var12 == null || var12.field1052 <= var8) {
                                    var11.field1056 = true;
                                    int var13 = var11.method957();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1052 += var13;
                                    }
                                    if (var4 >= this.field1103) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method942();
                                    if (var14 != null) {
                                        int var15 = var11.field1054;
                                        while (var14 != null) {
                                            this.method1138(var14, var15 * var14.method921() >> 8);
                                            var14 = var11.method943();
                                        }
                                    }
                                    class48 var16 = var11.field1053;
                                    var11.field1053 = null;
                                    if (var10 == null) {
                                        this.field1088[var7] = var16;
                                    } else {
                                        var10.field1053 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1099[var7] = var10;
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
                class48 var18 = this.field1088[var17];
                class48[] var19 = this.field1088;
                this.field1099[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1053;
                    var18.field1053 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1083 < 0) {
            this.field1083 = 0;
        }
        if (this.field1082 != null) {
            this.field1082.method984(arg0, 0, arg1);
        }
        this.field1084 = class121.method2221();
    }

    @ObfuscatedName("m.aq(Lai;I)V")
    public static final void method211(class48 arg0) {
        arg0.field1056 = false;
        if (arg0.field1055 != null) {
            arg0.field1055.field1052 = 0;
        }
        for (class48 var1 = arg0.method942(); var1 != null; var1 = arg0.method943()) {
            method211(var1);
        }
    }

    @ObfuscatedName("ar.am(Lai;IS)V")
    public final void method1138(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1099[var3];
        if (var4 == null) {
            this.field1088[var3] = arg0;
        } else {
            var4.field1053 = arg0;
        }
        this.field1099[var3] = arg0;
        arg0.field1054 = arg1;
    }

    @ObfuscatedName("ar.b(Ljava/awt/Component;)V")
    public void method915(Component arg0) throws Exception {
    }

    @ObfuscatedName("ar.e(I)V")
    public void method900(int arg0) throws Exception {
    }

    @ObfuscatedName("ar.g()I")
    public int method901() throws Exception {
        return this.field1085;
    }

    @ObfuscatedName("ar.o()V")
    public void method902() throws Exception {
    }

    @ObfuscatedName("ar.a()V")
    public void method904() {
    }

    @ObfuscatedName("ar.h()V")
    public void method912() throws Exception {
    }
}
