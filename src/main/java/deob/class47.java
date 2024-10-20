package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class47 {

    @ObfuscatedName("ax.w")
    public int[] field1050;

    @ObfuscatedName("ax.u")
    public class57 field1051;

    @ObfuscatedName("ax.d")
    public int field1052 = 32;

    @ObfuscatedName("ax.t")
    public long field1053 = class100.method100();

    @ObfuscatedName("ax.j")
    public int field1048;

    @ObfuscatedName("ax.q")
    public int field1059;

    @ObfuscatedName("ax.p")
    public int field1066;

    @ObfuscatedName("ax.v")
    public long field1057 = 0L;

    @ObfuscatedName("ax.n")
    public int field1055 = 0;

    @ObfuscatedName("ax.l")
    public int field1045 = 0;

    @ObfuscatedName("ax.c")
    public int field1060 = 0;

    @ObfuscatedName("ax.b")
    public long field1046 = 0L;

    @ObfuscatedName("ax.s")
    public boolean field1061 = true;

    @ObfuscatedName("ax.az")
    public int field1063 = 0;

    @ObfuscatedName("ax.av")
    public class57[] field1064 = new class57[8];

    @ObfuscatedName("ax.ay")
    public class57[] field1065 = new class57[8];

    @ObfuscatedName("ee.c(IZII)V")
    public static final void method2680(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1056 = arg0;
        Statics.field1062 = arg1;
        Statics.field1047 = arg2;
    }

    @ObfuscatedName("dk.b(Ldv;Ljava/awt/Component;IIB)Lax;")
    public static final class47 method2420(class120 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1056 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1050 = new int[(Statics.field1062 ? 2 : 1) * 256];
                var4.field1059 = arg3;
                var4.method896(arg1);
                var4.field1048 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1048 > 16384) {
                    var4.field1048 = 16384;
                }
                var4.method905(var4.field1048);
                if (Statics.field1047 > 0 && Statics.field1054 == null) {
                    Statics.field1054 = new class63();
                    Statics.field1054.field1222 = arg0;
                    arg0.method2468(Statics.field1054, Statics.field1047);
                }
                if (Statics.field1054 != null) {
                    if (Statics.field1054.field1218[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1054.field1218[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class45 var6 = new class45(arg0, arg2);
                    var6.field1050 = new int[256 * (Statics.field1062 ? 2 : 1)];
                    var6.field1059 = arg3;
                    var6.method896(arg1);
                    var6.field1048 = 16384;
                    var6.method905(var6.field1048);
                    if (Statics.field1047 > 0 && Statics.field1054 == null) {
                        Statics.field1054 = new class63();
                        Statics.field1054.field1222 = arg0;
                        arg0.method2468(Statics.field1054, Statics.field1047);
                    }
                    if (Statics.field1054 != null) {
                        if (Statics.field1054.field1218[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1054.field1218[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class47();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ax.s(Lbm;I)V")
    public final synchronized void method955(class57 arg0) {
        this.field1051 = arg0;
    }

    @ObfuscatedName("ax.o(S)V")
    public final synchronized void method956() {
        if (this.field1050 == null) {
            return;
        }
        long var1 = class100.method100();
        try {
            if (this.field1057 != 0L) {
                if (var1 < this.field1057) {
                    return;
                }
                this.method905(this.field1048);
                this.field1057 = 0L;
                this.field1061 = true;
            }
            int var3 = this.method898();
            if (this.field1060 - var3 > this.field1055) {
                this.field1055 = this.field1060 - var3;
            }
            int var4 = this.field1066 + this.field1059;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1048) {
                this.field1048 += 1024;
                if (this.field1048 > 16384) {
                    this.field1048 = 16384;
                }
                this.method900();
                this.method905(this.field1048);
                var3 = 0;
                this.field1061 = true;
                if (var4 + 256 > this.field1048) {
                    var4 = this.field1048 - 256;
                    this.field1066 = var4 - this.field1059;
                }
            }
            while (var3 < var4) {
                this.method960(this.field1050, 256);
                this.method897();
                var3 += 256;
            }
            if (var1 > this.field1046) {
                if (this.field1061) {
                    this.field1061 = false;
                } else if (this.field1055 == 0 && this.field1045 == 0) {
                    this.method900();
                    this.field1057 = var1 + 2000L;
                    return;
                } else {
                    this.field1066 = Math.min(this.field1045, this.field1055);
                    this.field1045 = this.field1055;
                }
                this.field1055 = 0;
                this.field1046 = var1 + 2000L;
            }
            this.field1060 = var3;
        } catch (Exception var8) {
            this.method900();
            this.field1057 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1053 + 500000L) {
                var1 = this.field1053;
            }
            while (var1 > this.field1053 + 5000L) {
                this.method968(256);
                this.field1053 += (long) (256000 / Statics.field1056);
            }
        } catch (Exception var7) {
            this.field1053 = var1;
        }
    }

    @ObfuscatedName("ax.h(I)V")
    public final void method957() {
        this.field1061 = true;
    }

    @ObfuscatedName("ax.x(S)V")
    public final synchronized void method958() {
        this.field1061 = true;
        try {
            this.method901();
        } catch (Exception var2) {
            this.method900();
            this.field1057 = class100.method100() + 2000L;
        }
    }

    @ObfuscatedName("ax.e(B)V")
    public final synchronized void method963() {
        if (Statics.field1054 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1054.field1218[var2] == this) {
                    Statics.field1054.field1218[var2] = null;
                }
                if (Statics.field1054.field1218[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1054.field1220 = true;
                while (Statics.field1054.field1219) {
                    class111.method59(50L);
                }
                Statics.field1054 = null;
            }
        }
        this.method900();
        this.field1050 = null;
    }

    @ObfuscatedName("ax.z(IB)V")
    public final void method968(int arg0) {
        this.field1063 -= arg0;
        if (this.field1063 < 0) {
            this.field1063 = 0;
        }
        if (this.field1051 != null) {
            this.field1051.method924(arg0);
        }
    }

    @ObfuscatedName("ax.az([II)V")
    public final void method960(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1062) {
            var3 = arg1 << 1;
        }
        class105.method2341(arg0, 0, var3);
        this.field1063 -= arg1;
        if (this.field1051 != null && this.field1063 <= 0) {
            this.field1063 += Statics.field1056 >> 4;
            method128(this.field1051);
            this.method961(this.field1051, this.field1051.method1187());
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
                        class57 var10 = null;
                        class57 var11 = this.field1064[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field1134;
                                if (var12 == null || var12.field1133 <= var8) {
                                    var11.field1137 = true;
                                    int var13 = var11.method921();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1133 += var13;
                                    }
                                    if (var4 >= this.field1052) {
                                        break label105;
                                    }
                                    class57 var14 = var11.method919();
                                    if (var14 != null) {
                                        int var15 = var11.field1135;
                                        while (var14 != null) {
                                            this.method961(var14, var15 * var14.method1187() >> 8);
                                            var14 = var11.method920();
                                        }
                                    }
                                    class57 var16 = var11.field1136;
                                    var11.field1136 = null;
                                    if (var10 == null) {
                                        this.field1064[var7] = var16;
                                    } else {
                                        var10.field1136 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1065[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1136;
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
                class57 var18 = this.field1064[var17];
                class57[] var19 = this.field1064;
                this.field1065[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class57 var21 = var18.field1136;
                    var18.field1136 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1063 < 0) {
            this.field1063 = 0;
        }
        if (this.field1051 != null) {
            this.field1051.method922(arg0, 0, arg1);
        }
        this.field1053 = class100.method100();
    }

    @ObfuscatedName("d.av(Lbm;I)V")
    public static final void method128(class57 arg0) {
        arg0.field1137 = false;
        if (arg0.field1134 != null) {
            arg0.field1134.field1133 = 0;
        }
        for (class57 var1 = arg0.method919(); var1 != null; var1 = arg0.method920()) {
            method128(var1);
        }
    }

    @ObfuscatedName("ax.ay(Lbm;II)V")
    public final void method961(class57 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class57 var4 = this.field1065[var3];
        if (var4 == null) {
            this.field1064[var3] = arg0;
        } else {
            var4.field1136 = arg0;
        }
        this.field1065[var3] = arg0;
        arg0.field1135 = arg1;
    }

    @ObfuscatedName("ax.m(Ljava/awt/Component;)V")
    public void method896(Component arg0) throws Exception {
    }

    @ObfuscatedName("ax.k(I)V")
    public void method905(int arg0) throws Exception {
    }

    @ObfuscatedName("ax.y()I")
    public int method898() throws Exception {
        return this.field1048;
    }

    @ObfuscatedName("ax.g()V")
    public void method897() throws Exception {
    }

    @ObfuscatedName("ax.r()V")
    public void method900() {
    }

    @ObfuscatedName("ax.i()V")
    public void method901() throws Exception {
    }
}
