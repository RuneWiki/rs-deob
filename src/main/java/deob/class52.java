package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class52 {

    @ObfuscatedName("az.i")
    public int[] field1081;

    @ObfuscatedName("az.p")
    public class48 field1094;

    @ObfuscatedName("az.e")
    public int field1083 = 32;

    @ObfuscatedName("az.o")
    public long field1084 = class121.method1471();

    @ObfuscatedName("az.j")
    public int field1087;

    @ObfuscatedName("az.s")
    public int field1086;

    @ObfuscatedName("az.b")
    public int field1099;

    @ObfuscatedName("az.c")
    public long field1088 = 0L;

    @ObfuscatedName("az.m")
    public int field1079 = 0;

    @ObfuscatedName("az.z")
    public int field1090 = 0;

    @ObfuscatedName("az.h")
    public int field1091 = 0;

    @ObfuscatedName("az.f")
    public long field1092 = 0L;

    @ObfuscatedName("az.w")
    public boolean field1093 = true;

    @ObfuscatedName("az.au")
    public int field1095 = 0;

    @ObfuscatedName("az.as")
    public class48[] field1096 = new class48[8];

    @ObfuscatedName("az.ag")
    public class48[] field1097 = new class48[8];

    @ObfuscatedName("ay.b(Lbn;Ljava/awt/Component;III)Laz;")
    public static final class52 method698(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1080 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1081 = new int[256 * (Statics.field2456 ? 2 : 1)];
                var4.field1086 = arg3;
                var4.method874(arg1);
                var4.field1087 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1087 > 16384) {
                    var4.field1087 = 16384;
                }
                var4.method870(var4.field1087);
                if (Statics.field1085 > 0 && Statics.field2459 == null) {
                    Statics.field2459 = new class55();
                    Statics.field2459.field1167 = arg0;
                    arg0.method1424(Statics.field2459, Statics.field1085);
                }
                if (Statics.field2459 != null) {
                    if (Statics.field2459.field1161[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2459.field1161[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1081 = new int[256 * (Statics.field2456 ? 2 : 1)];
                    var6.field1086 = arg3;
                    var6.method874(arg1);
                    var6.field1087 = 16384;
                    var6.method870(var6.field1087);
                    if (Statics.field1085 > 0 && Statics.field2459 == null) {
                        Statics.field2459 = new class55();
                        Statics.field2459.field1167 = arg0;
                        arg0.method1424(Statics.field2459, Statics.field1085);
                    }
                    if (Statics.field2459 != null) {
                        if (Statics.field2459.field1161[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2459.field1161[arg2] = var6;
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

    @ObfuscatedName("az.c(Lam;I)V")
    public final synchronized void method1101(class48 arg0) {
        this.field1094 = arg0;
    }

    @ObfuscatedName("az.m(B)V")
    public final synchronized void method1087() {
        if (this.field1081 == null) {
            return;
        }
        long var1 = class121.method1471();
        try {
            if (this.field1088 != 0L) {
                if (var1 < this.field1088) {
                    return;
                }
                this.method870(this.field1087);
                this.field1088 = 0L;
                this.field1093 = true;
            }
            int var3 = this.method871();
            if (this.field1091 - var3 > this.field1079) {
                this.field1079 = this.field1091 - var3;
            }
            int var4 = this.field1099 + this.field1086;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1087) {
                this.field1087 += 1024;
                if (this.field1087 > 16384) {
                    this.field1087 = 16384;
                }
                this.method873();
                this.method870(this.field1087);
                var3 = 0;
                this.field1093 = true;
                if (var4 + 256 > this.field1087) {
                    var4 = this.field1087 - 256;
                    this.field1099 = var4 - this.field1086;
                }
            }
            while (var3 < var4) {
                this.method1091(this.field1081, 256);
                this.method872();
                var3 += 256;
            }
            if (var1 > this.field1092) {
                if (this.field1093) {
                    this.field1093 = false;
                } else if (this.field1079 == 0 && this.field1090 == 0) {
                    this.method873();
                    this.field1088 = var1 + 2000L;
                    return;
                } else {
                    this.field1099 = Math.min(this.field1090, this.field1079);
                    this.field1090 = this.field1079;
                }
                this.field1079 = 0;
                this.field1092 = var1 + 2000L;
            }
            this.field1091 = var3;
        } catch (Exception var8) {
            this.method873();
            this.field1088 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1084 + 500000L) {
                var1 = this.field1084;
            }
            while (var1 > this.field1084 + 5000L) {
                this.method1090(256);
                this.field1084 += (long) (256000 / Statics.field1080);
            }
        } catch (Exception var7) {
            this.field1084 = var1;
        }
    }

    @ObfuscatedName("az.z(B)V")
    public final void method1098() {
        this.field1093 = true;
    }

    @ObfuscatedName("az.h(I)V")
    public final synchronized void method1108() {
        this.field1093 = true;
        try {
            this.method877();
        } catch (Exception var2) {
            this.method873();
            this.field1088 = class121.method1471() + 2000L;
        }
    }

    @ObfuscatedName("az.f(S)V")
    public final synchronized void method1089() {
        if (Statics.field2459 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2459.field1161[var2] == this) {
                    Statics.field2459.field1161[var2] = null;
                }
                if (Statics.field2459.field1161[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2459.field1160 = true;
                while (Statics.field2459.field1163) {
                    class127.method1598(50L);
                }
                Statics.field2459 = null;
            }
        }
        this.method873();
        this.field1081 = null;
    }

    @ObfuscatedName("az.w(II)V")
    public final void method1090(int arg0) {
        this.field1095 -= arg0;
        if (this.field1095 < 0) {
            this.field1095 = 0;
        }
        if (this.field1094 != null) {
            this.field1094.method912(arg0);
        }
    }

    @ObfuscatedName("az.l([II)V")
    public final void method1091(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2456) {
            var3 = arg1 << 1;
        }
        class128.method2607(arg0, 0, var3);
        this.field1095 -= arg1;
        if (this.field1094 != null && this.field1095 <= 0) {
            this.field1095 += Statics.field1080 >> 4;
            method15(this.field1094);
            this.method1092(this.field1094, this.field1094.method887());
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
                        class48 var11 = this.field1096[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1055;
                                if (var12 == null || var12.field1053 <= var8) {
                                    var11.field1056 = true;
                                    int var13 = var11.method945();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1053 += var13;
                                    }
                                    if (var4 >= this.field1083) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method908();
                                    if (var14 != null) {
                                        int var15 = var11.field1054;
                                        while (var14 != null) {
                                            this.method1092(var14, var15 * var14.method887() >> 8);
                                            var14 = var11.method1015();
                                        }
                                    }
                                    class48 var16 = var11.field1057;
                                    var11.field1057 = null;
                                    if (var10 == null) {
                                        this.field1096[var7] = var16;
                                    } else {
                                        var10.field1057 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1097[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1057;
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
                class48 var18 = this.field1096[var17];
                class48[] var19 = this.field1096;
                this.field1097[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1057;
                    var18.field1057 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1095 < 0) {
            this.field1095 = 0;
        }
        if (this.field1094 != null) {
            this.field1094.method955(arg0, 0, arg1);
        }
        this.field1084 = class121.method1471();
    }

    @ObfuscatedName("r.d(Lam;B)V")
    public static final void method15(class48 arg0) {
        arg0.field1056 = false;
        if (arg0.field1055 != null) {
            arg0.field1055.field1053 = 0;
        }
        for (class48 var1 = arg0.method908(); var1 != null; var1 = arg0.method1015()) {
            method15(var1);
        }
    }

    @ObfuscatedName("az.y(Lam;II)V")
    public final void method1092(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1097[var3];
        if (var4 == null) {
            this.field1096[var3] = arg0;
        } else {
            var4.field1057 = arg0;
        }
        this.field1097[var3] = arg0;
        arg0.field1054 = arg1;
    }

    @ObfuscatedName("az.a(Ljava/awt/Component;)V")
    public void method874(Component arg0) throws Exception {
    }

    @ObfuscatedName("az.r(I)V")
    public void method870(int arg0) throws Exception {
    }

    @ObfuscatedName("az.u()I")
    public int method871() throws Exception {
        return this.field1087;
    }

    @ObfuscatedName("az.t()V")
    public void method872() throws Exception {
    }

    @ObfuscatedName("az.k()V")
    public void method873() {
    }

    @ObfuscatedName("az.x()V")
    public void method877() throws Exception {
    }
}
