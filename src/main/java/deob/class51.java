package deob;

import java.awt.Component;

@ObfuscatedName("au")
public class class51 {

    @ObfuscatedName("au.n")
    public int[] field1082;

    @ObfuscatedName("au.d")
    public class61 field1083;

    @ObfuscatedName("au.h")
    public int field1096 = 32;

    @ObfuscatedName("au.y")
    public long field1101 = class104.method528();

    @ObfuscatedName("au.p")
    public int field1086;

    @ObfuscatedName("au.i")
    public int field1087;

    @ObfuscatedName("au.s")
    public int field1095;

    @ObfuscatedName("au.f")
    public long field1102 = 0L;

    @ObfuscatedName("au.u")
    public int field1085 = 0;

    @ObfuscatedName("au.v")
    public int field1091 = 0;

    @ObfuscatedName("au.r")
    public int field1092 = 0;

    @ObfuscatedName("au.q")
    public long field1090 = 0L;

    @ObfuscatedName("au.x")
    public boolean field1094 = true;

    @ObfuscatedName("au.am")
    public int field1080 = 0;

    @ObfuscatedName("au.ac")
    public class61[] field1098 = new class61[8];

    @ObfuscatedName("au.ap")
    public class61[] field1088 = new class61[8];

    @ObfuscatedName("hc.q(IZII)V")
    public static final void method3554(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1093 = arg0;
        Statics.field1079 = arg1;
        Statics.field1081 = arg2;
    }

    @ObfuscatedName("cg.x(Ldj;Ljava/awt/Component;IIB)Lau;")
    public static final class51 method1841(class125 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1093 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1082 = new int[256 * (Statics.field1079 ? 2 : 1)];
                var4.field1087 = arg3;
                var4.method894(arg1);
                var4.field1086 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1086 > 16384) {
                    var4.field1086 = 16384;
                }
                var4.method902(var4.field1086);
                if (Statics.field1081 > 0 && Statics.field1896 == null) {
                    Statics.field1896 = new class67();
                    Statics.field1896.field1262 = arg0;
                    arg0.method2442(Statics.field1896, Statics.field1081);
                }
                if (Statics.field1896 != null) {
                    if (Statics.field1896.field1255[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1896.field1255[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1082 = new int[(Statics.field1079 ? 2 : 1) * 256];
                    var6.field1087 = arg3;
                    var6.method894(arg1);
                    var6.field1086 = 16384;
                    var6.method902(var6.field1086);
                    if (Statics.field1081 > 0 && Statics.field1896 == null) {
                        Statics.field1896 = new class67();
                        Statics.field1896.field1262 = arg0;
                        arg0.method2442(Statics.field1896, Statics.field1081);
                    }
                    if (Statics.field1896 != null) {
                        if (Statics.field1896.field1255[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1896.field1255[arg2] = var6;
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

    @ObfuscatedName("au.t(Lbr;S)V")
    public final synchronized void method967(class61 arg0) {
        this.field1083 = arg0;
    }

    @ObfuscatedName("au.e(B)V")
    public final synchronized void method978() {
        if (this.field1082 == null) {
            return;
        }
        long var1 = class104.method528();
        try {
            if (this.field1102 != 0L) {
                if (var1 < this.field1102) {
                    return;
                }
                this.method902(this.field1086);
                this.field1102 = 0L;
                this.field1094 = true;
            }
            int var3 = this.method895();
            if (this.field1092 - var3 > this.field1085) {
                this.field1085 = this.field1092 - var3;
            }
            int var4 = this.field1095 + this.field1087;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1086) {
                this.field1086 += 1024;
                if (this.field1086 > 16384) {
                    this.field1086 = 16384;
                }
                this.method909();
                this.method902(this.field1086);
                var3 = 0;
                this.field1094 = true;
                if (var4 + 256 > this.field1086) {
                    var4 = this.field1086 - 256;
                    this.field1095 = var4 - this.field1087;
                }
            }
            while (var3 < var4) {
                this.method963(this.field1082, 256);
                this.method896();
                var3 += 256;
            }
            if (var1 > this.field1090) {
                if (this.field1094) {
                    this.field1094 = false;
                } else if (this.field1085 == 0 && this.field1091 == 0) {
                    this.method909();
                    this.field1102 = var1 + 2000L;
                    return;
                } else {
                    this.field1095 = Math.min(this.field1091, this.field1085);
                    this.field1091 = this.field1085;
                }
                this.field1085 = 0;
                this.field1090 = var1 + 2000L;
            }
            this.field1092 = var3;
        } catch (Exception var8) {
            this.method909();
            this.field1102 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1101 + 500000L) {
                var1 = this.field1101;
            }
            while (var1 > this.field1101 + 5000L) {
                this.method962(256);
                this.field1101 += (long) (256000 / Statics.field1093);
            }
        } catch (Exception var7) {
            this.field1101 = var1;
        }
    }

    @ObfuscatedName("au.m(I)V")
    public final void method991() {
        this.field1094 = true;
    }

    @ObfuscatedName("au.o(I)V")
    public final synchronized void method960() {
        this.field1094 = true;
        try {
            this.method898();
        } catch (Exception var2) {
            this.method909();
            this.field1102 = class104.method528() + 2000L;
        }
    }

    @ObfuscatedName("au.a(I)V")
    public final synchronized void method961() {
        if (Statics.field1896 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1896.field1255[var2] == this) {
                    Statics.field1896.field1255[var2] = null;
                }
                if (Statics.field1896.field1255[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1896.field1256 = true;
                while (Statics.field1896.field1257) {
                    class116.method154(50L);
                }
                Statics.field1896 = null;
            }
        }
        this.method909();
        this.field1082 = null;
    }

    @ObfuscatedName("au.am(II)V")
    public final void method962(int arg0) {
        this.field1080 -= arg0;
        if (this.field1080 < 0) {
            this.field1080 = 0;
        }
        if (this.field1083 != null) {
            this.field1083.method949(arg0);
        }
    }

    @ObfuscatedName("au.ac([II)V")
    public final void method963(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1079) {
            var3 = arg1 << 1;
        }
        class109.method2282(arg0, 0, var3);
        this.field1080 -= arg1;
        if (this.field1083 != null && this.field1080 <= 0) {
            this.field1080 += Statics.field1093 >> 4;
            Statics.method2611(this.field1083);
            this.method964(this.field1083, this.field1083.method1065());
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
                        class61 var11 = this.field1098[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1172;
                                if (var12 == null || var12.field1169 <= var8) {
                                    var11.field1173 = true;
                                    int var13 = var11.method914();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1169 += var13;
                                    }
                                    if (var4 >= this.field1096) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method936();
                                    if (var14 != null) {
                                        int var15 = var11.field1170;
                                        while (var14 != null) {
                                            this.method964(var14, var15 * var14.method1065() >> 8);
                                            var14 = var11.method919();
                                        }
                                    }
                                    class61 var16 = var11.field1171;
                                    var11.field1171 = null;
                                    if (var10 == null) {
                                        this.field1098[var7] = var16;
                                    } else {
                                        var10.field1171 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1088[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1171;
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
                class61 var18 = this.field1098[var17];
                class61[] var19 = this.field1098;
                this.field1088[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1171;
                    var18.field1171 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1080 < 0) {
            this.field1080 = 0;
        }
        if (this.field1083 != null) {
            this.field1083.method912(arg0, 0, arg1);
        }
        this.field1101 = class104.method528();
    }

    @ObfuscatedName("au.aq(Lbr;II)V")
    public final void method964(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1088[var3];
        if (var4 == null) {
            this.field1098[var3] = arg0;
        } else {
            var4.field1171 = arg0;
        }
        this.field1088[var3] = arg0;
        arg0.field1170 = arg1;
    }

    @ObfuscatedName("au.g(Ljava/awt/Component;)V")
    public void method894(Component arg0) throws Exception {
    }

    @ObfuscatedName("au.j(I)V")
    public void method902(int arg0) throws Exception {
    }

    @ObfuscatedName("au.z()I")
    public int method895() throws Exception {
        return this.field1086;
    }

    @ObfuscatedName("au.b()V")
    public void method896() throws Exception {
    }

    @ObfuscatedName("au.k()V")
    public void method909() {
    }

    @ObfuscatedName("au.c()V")
    public void method898() throws Exception {
    }
}
