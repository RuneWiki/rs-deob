package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class51 {

    @ObfuscatedName("az.g")
    public int[] field1108;

    @ObfuscatedName("az.o")
    public class61 field1090;

    @ObfuscatedName("az.p")
    public int field1091 = 32;

    @ObfuscatedName("az.v")
    public long field1092 = class104.method1417();

    @ObfuscatedName("az.w")
    public int field1093;

    @ObfuscatedName("az.t")
    public int field1094;

    @ObfuscatedName("az.s")
    public int field1095;

    @ObfuscatedName("az.b")
    public long field1096 = 0L;

    @ObfuscatedName("az.u")
    public int field1101 = 0;

    @ObfuscatedName("az.j")
    public int field1098 = 0;

    @ObfuscatedName("az.d")
    public int field1099 = 0;

    @ObfuscatedName("az.l")
    public long field1100 = 0L;

    @ObfuscatedName("az.m")
    public boolean field1089 = true;

    @ObfuscatedName("az.ah")
    public int field1103 = 0;

    @ObfuscatedName("az.aj")
    public class61[] field1111 = new class61[8];

    @ObfuscatedName("az.ar")
    public class61[] field1086 = new class61[8];

    @ObfuscatedName("br.m(IZII)V")
    public static final void method1098(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1105 = arg0;
        Statics.field1097 = arg1;
        Statics.field1087 = arg2;
    }

    @ObfuscatedName("z.q(Ldj;Ljava/awt/Component;III)Laz;")
    public static final class51 method543(class125 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1105 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1108 = new int[256 * (Statics.field1097 ? 2 : 1)];
                var4.field1094 = arg3;
                var4.method975(arg1);
                var4.field1093 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1093 > 16384) {
                    var4.field1093 = 16384;
                }
                var4.method976(var4.field1093);
                if (Statics.field1087 > 0 && Statics.field707 == null) {
                    Statics.field707 = new class67();
                    Statics.field707.field1270 = arg0;
                    arg0.method2526(Statics.field707, Statics.field1087);
                }
                if (Statics.field707 != null) {
                    if (Statics.field707.field1263[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field707.field1263[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1108 = new int[(Statics.field1097 ? 2 : 1) * 256];
                    var6.field1094 = arg3;
                    var6.method975(arg1);
                    var6.field1093 = 16384;
                    var6.method976(var6.field1093);
                    if (Statics.field1087 > 0 && Statics.field707 == null) {
                        Statics.field707 = new class67();
                        Statics.field707.field1270 = arg0;
                        arg0.method2526(Statics.field707, Statics.field1087);
                    }
                    if (Statics.field707 != null) {
                        if (Statics.field707.field1263[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field707.field1263[arg2] = var6;
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

    @ObfuscatedName("az.h(Lbh;I)V")
    public final synchronized void method1055(class61 arg0) {
        this.field1090 = arg0;
    }

    @ObfuscatedName("az.c(I)V")
    public final synchronized void method1032() {
        if (this.field1108 == null) {
            return;
        }
        long var1 = class104.method1417();
        try {
            if (this.field1096 != 0L) {
                if (var1 < this.field1096) {
                    return;
                }
                this.method976(this.field1093);
                this.field1096 = 0L;
                this.field1089 = true;
            }
            int var3 = this.method986();
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
                this.method974();
                this.method976(this.field1093);
                var3 = 0;
                this.field1089 = true;
                if (var4 + 256 > this.field1093) {
                    var4 = this.field1093 - 256;
                    this.field1095 = var4 - this.field1094;
                }
            }
            while (var3 < var4) {
                this.method1037(this.field1108, 256);
                this.method978();
                var3 += 256;
            }
            if (var1 > this.field1100) {
                if (this.field1089) {
                    this.field1089 = false;
                } else if (this.field1101 == 0 && this.field1098 == 0) {
                    this.method974();
                    this.field1096 = var1 + 2000L;
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
            this.method974();
            this.field1096 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1092 + 500000L) {
                var1 = this.field1092;
            }
            while (var1 > this.field1092 + 5000L) {
                this.method1036(256);
                this.field1092 += (long) (256000 / Statics.field1105);
            }
        } catch (Exception var7) {
            this.field1092 = var1;
        }
    }

    @ObfuscatedName("az.z(I)V")
    public final void method1033() {
        this.field1089 = true;
    }

    @ObfuscatedName("az.i(B)V")
    public final synchronized void method1034() {
        this.field1089 = true;
        try {
            this.method980();
        } catch (Exception var2) {
            this.method974();
            this.field1096 = class104.method1417() + 2000L;
        }
    }

    @ObfuscatedName("az.ah(B)V")
    public final synchronized void method1035() {
        if (Statics.field707 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field707.field1263[var2] == this) {
                    Statics.field707.field1263[var2] = null;
                }
                if (Statics.field707.field1263[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field707.field1265 = true;
                while (Statics.field707.field1266) {
                    class116.method557(50L);
                }
                Statics.field707 = null;
            }
        }
        this.method974();
        this.field1108 = null;
    }

    @ObfuscatedName("az.aj(IB)V")
    public final void method1036(int arg0) {
        this.field1103 -= arg0;
        if (this.field1103 < 0) {
            this.field1103 = 0;
        }
        if (this.field1090 != null) {
            this.field1090.method1004(arg0);
        }
    }

    @ObfuscatedName("az.ar([II)V")
    public final void method1037(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1097) {
            var3 = arg1 << 1;
        }
        class109.method2361(arg0, 0, var3);
        this.field1103 -= arg1;
        if (this.field1090 != null && this.field1103 <= 0) {
            this.field1103 += Statics.field1105 >> 4;
            method35(this.field1090);
            this.method1038(this.field1090, this.field1090.method1128());
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
                        class61 var11 = this.field1111[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1180;
                                if (var12 == null || var12.field1178 <= var8) {
                                    var11.field1182 = true;
                                    int var13 = var11.method1009();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1178 += var13;
                                    }
                                    if (var4 >= this.field1091) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method1000();
                                    if (var14 != null) {
                                        int var15 = var11.field1179;
                                        while (var14 != null) {
                                            this.method1038(var14, var15 * var14.method1128() >> 8);
                                            var14 = var11.method1001();
                                        }
                                    }
                                    class61 var16 = var11.field1181;
                                    var11.field1181 = null;
                                    if (var10 == null) {
                                        this.field1111[var7] = var16;
                                    } else {
                                        var10.field1181 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1086[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1181;
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
                class61 var18 = this.field1111[var17];
                class61[] var19 = this.field1111;
                this.field1086[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1181;
                    var18.field1181 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1103 < 0) {
            this.field1103 = 0;
        }
        if (this.field1090 != null) {
            this.field1090.method994(arg0, 0, arg1);
        }
        this.field1092 = class104.method1417();
    }

    @ObfuscatedName("r.al(Lbh;I)V")
    public static final void method35(class61 arg0) {
        arg0.field1182 = false;
        if (arg0.field1180 != null) {
            arg0.field1180.field1178 = 0;
        }
        for (class61 var1 = arg0.method1000(); var1 != null; var1 = arg0.method1001()) {
            method35(var1);
        }
    }

    @ObfuscatedName("az.aw(Lbh;IB)V")
    public final void method1038(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1086[var3];
        if (var4 == null) {
            this.field1111[var3] = arg0;
        } else {
            var4.field1181 = arg0;
        }
        this.field1086[var3] = arg0;
        arg0.field1179 = arg1;
    }

    @ObfuscatedName("az.f(Ljava/awt/Component;)V")
    public void method975(Component arg0) throws Exception {
    }

    @ObfuscatedName("az.k(I)V")
    public void method976(int arg0) throws Exception {
    }

    @ObfuscatedName("az.y()I")
    public int method986() throws Exception {
        return this.field1093;
    }

    @ObfuscatedName("az.e()V")
    public void method978() throws Exception {
    }

    @ObfuscatedName("az.r()V")
    public void method974() {
    }

    @ObfuscatedName("az.a()V")
    public void method980() throws Exception {
    }
}
