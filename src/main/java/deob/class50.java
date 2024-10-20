package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class50 {

    @ObfuscatedName("ax.j")
    public int[] field1054;

    @ObfuscatedName("ax.c")
    public class60 field1052;

    @ObfuscatedName("ax.d")
    public int field1056 = 32;

    @ObfuscatedName("ax.v")
    public long field1057 = class103.method16();

    @ObfuscatedName("ax.n")
    public int field1058;

    @ObfuscatedName("ax.z")
    public int field1059;

    @ObfuscatedName("ax.a")
    public int field1060;

    @ObfuscatedName("ax.t")
    public long field1061 = 0L;

    @ObfuscatedName("ax.p")
    public int field1062 = 0;

    @ObfuscatedName("ax.i")
    public int field1072 = 0;

    @ObfuscatedName("ax.r")
    public int field1055 = 0;

    @ObfuscatedName("ax.w")
    public long field1067 = 0L;

    @ObfuscatedName("ax.b")
    public boolean field1066 = true;

    @ObfuscatedName("ax.ab")
    public int field1063 = 0;

    @ObfuscatedName("ax.al")
    public class60[] field1069 = new class60[8];

    @ObfuscatedName("ax.an")
    public class60[] field1068 = new class60[8];

    @ObfuscatedName("ak.o(IZIB)V")
    public static final void method792(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1074 = arg0;
        Statics.field1053 = arg1;
        Statics.field686 = arg2;
    }

    @ObfuscatedName("ab.m(Ldo;Ljava/awt/Component;III)Lax;")
    public static final class50 method491(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1074 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1054 = new int[256 * (Statics.field1053 ? 2 : 1)];
                var4.field1059 = arg3;
                var4.method923(arg1);
                var4.field1058 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1058 > 16384) {
                    var4.field1058 = 16384;
                }
                var4.method933(var4.field1058);
                if (Statics.field686 > 0 && Statics.field1040 == null) {
                    Statics.field1040 = new class66();
                    Statics.field1040.field1228 = arg0;
                    arg0.method2481(Statics.field1040, Statics.field686);
                }
                if (Statics.field1040 != null) {
                    if (Statics.field1040.field1230[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1040.field1230[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1054 = new int[256 * (Statics.field1053 ? 2 : 1)];
                    var6.field1059 = arg3;
                    var6.method923(arg1);
                    var6.field1058 = 16384;
                    var6.method933(var6.field1058);
                    if (Statics.field686 > 0 && Statics.field1040 == null) {
                        Statics.field1040 = new class66();
                        Statics.field1040.field1228 = arg0;
                        arg0.method2481(Statics.field1040, Statics.field686);
                    }
                    if (Statics.field1040 != null) {
                        if (Statics.field1040.field1230[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1040.field1230[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ax.f(Lbl;B)V")
    public final synchronized void method998(class60 arg0) {
        this.field1052 = arg0;
    }

    @ObfuscatedName("ax.ab(I)V")
    public final synchronized void method1017() {
        if (this.field1054 == null) {
            return;
        }
        long var1 = class103.method16();
        try {
            if (this.field1061 != 0L) {
                if (var1 < this.field1061) {
                    return;
                }
                this.method933(this.field1058);
                this.field1061 = 0L;
                this.field1066 = true;
            }
            int var3 = this.method925();
            if (this.field1055 - var3 > this.field1062) {
                this.field1062 = this.field1055 - var3;
            }
            int var4 = this.field1060 + this.field1059;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1058) {
                this.field1058 += 1024;
                if (this.field1058 > 16384) {
                    this.field1058 = 16384;
                }
                this.method941();
                this.method933(this.field1058);
                var3 = 0;
                this.field1066 = true;
                if (var4 + 256 > this.field1058) {
                    var4 = this.field1058 - 256;
                    this.field1060 = var4 - this.field1059;
                }
            }
            while (var3 < var4) {
                this.method989(this.field1054, 256);
                this.method937();
                var3 += 256;
            }
            if (var1 > this.field1067) {
                if (this.field1066) {
                    this.field1066 = false;
                } else if (this.field1062 == 0 && this.field1072 == 0) {
                    this.method941();
                    this.field1061 = var1 + 2000L;
                    return;
                } else {
                    this.field1060 = Math.min(this.field1072, this.field1062);
                    this.field1072 = this.field1062;
                }
                this.field1062 = 0;
                this.field1067 = var1 + 2000L;
            }
            this.field1055 = var3;
        } catch (Exception var8) {
            this.method941();
            this.field1061 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1057 + 500000L) {
                var1 = this.field1057;
            }
            while (var1 > this.field1057 + 5000L) {
                this.method1023(256);
                this.field1057 += (long) (256000 / Statics.field1074);
            }
        } catch (Exception var7) {
            this.field1057 = var1;
        }
    }

    @ObfuscatedName("ax.al(I)V")
    public final void method991() {
        this.field1066 = true;
    }

    @ObfuscatedName("ax.an(B)V")
    public final synchronized void method992() {
        this.field1066 = true;
        try {
            this.method928();
        } catch (Exception var2) {
            this.method941();
            this.field1061 = class103.method16() + 2000L;
        }
    }

    @ObfuscatedName("ax.aw(S)V")
    public final synchronized void method990() {
        if (Statics.field1040 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1040.field1230[var2] == this) {
                    Statics.field1040.field1230[var2] = null;
                }
                if (Statics.field1040.field1230[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1040.field1226 = true;
                while (Statics.field1040.field1229) {
                    class114.method1888(50L);
                }
                Statics.field1040 = null;
            }
        }
        this.method941();
        this.field1054 = null;
    }

    @ObfuscatedName("ax.ar(II)V")
    public final void method1023(int arg0) {
        this.field1063 -= arg0;
        if (this.field1063 < 0) {
            this.field1063 = 0;
        }
        if (this.field1052 != null) {
            this.field1052.method956(arg0);
        }
    }

    @ObfuscatedName("ax.ai([II)V")
    public final void method989(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1053) {
            var3 = arg1 << 1;
        }
        class108.method2338(arg0, 0, var3);
        this.field1063 -= arg1;
        if (this.field1052 != null && this.field1063 <= 0) {
            this.field1063 += Statics.field1074 >> 4;
            method33(this.field1052);
            this.method994(this.field1052, this.field1052.method1107());
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
                        class60 var10 = null;
                        class60 var11 = this.field1069[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1144;
                                if (var12 == null || var12.field1141 <= var8) {
                                    var11.field1145 = true;
                                    int var13 = var11.method984();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1141 += var13;
                                    }
                                    if (var4 >= this.field1056) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method951();
                                    if (var14 != null) {
                                        int var15 = var11.field1143;
                                        while (var14 != null) {
                                            this.method994(var14, var15 * var14.method1107() >> 8);
                                            var14 = var11.method950();
                                        }
                                    }
                                    class60 var16 = var11.field1142;
                                    var11.field1142 = null;
                                    if (var10 == null) {
                                        this.field1069[var7] = var16;
                                    } else {
                                        var10.field1142 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1068[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1142;
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
                class60 var18 = this.field1069[var17];
                class60[] var19 = this.field1069;
                this.field1068[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1142;
                    var18.field1142 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1063 < 0) {
            this.field1063 = 0;
        }
        if (this.field1052 != null) {
            this.field1052.method954(arg0, 0, arg1);
        }
        this.field1057 = class103.method16();
    }

    @ObfuscatedName("h.aj(Lbl;S)V")
    public static final void method33(class60 arg0) {
        arg0.field1145 = false;
        if (arg0.field1144 != null) {
            arg0.field1144.field1141 = 0;
        }
        for (class60 var1 = arg0.method951(); var1 != null; var1 = arg0.method950()) {
            method33(var1);
        }
    }

    @ObfuscatedName("ax.ao(Lbl;II)V")
    public final void method994(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1068[var3];
        if (var4 == null) {
            this.field1069[var3] = arg0;
        } else {
            var4.field1142 = arg0;
        }
        this.field1068[var3] = arg0;
        arg0.field1143 = arg1;
    }

    @ObfuscatedName("ax.k(Ljava/awt/Component;)V")
    public void method923(Component arg0) throws Exception {
    }

    @ObfuscatedName("ax.y(I)V")
    public void method933(int arg0) throws Exception {
    }

    @ObfuscatedName("ax.s()I")
    public int method925() throws Exception {
        return this.field1058;
    }

    @ObfuscatedName("ax.g()V")
    public void method937() throws Exception {
    }

    @ObfuscatedName("ax.h()V")
    public void method941() {
    }

    @ObfuscatedName("ax.l()V")
    public void method928() throws Exception {
    }
}
