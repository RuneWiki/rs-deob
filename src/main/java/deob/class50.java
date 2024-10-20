package deob;

import java.awt.Component;

@ObfuscatedName("ai")
public class class50 {

    @ObfuscatedName("ai.j")
    public int[] field1060;

    @ObfuscatedName("ai.u")
    public class60 field1066;

    @ObfuscatedName("ai.g")
    public int field1067 = 32;

    @ObfuscatedName("ai.a")
    public long field1068 = class103.method2037();

    @ObfuscatedName("ai.c")
    public int field1069;

    @ObfuscatedName("ai.w")
    public int field1065;

    @ObfuscatedName("ai.l")
    public int field1078;

    @ObfuscatedName("ai.q")
    public long field1080 = 0L;

    @ObfuscatedName("ai.x")
    public int field1073 = 0;

    @ObfuscatedName("ai.p")
    public int field1074 = 0;

    @ObfuscatedName("ai.y")
    public int field1075 = 0;

    @ObfuscatedName("ai.r")
    public long field1076 = 0L;

    @ObfuscatedName("ai.k")
    public boolean field1077 = true;

    @ObfuscatedName("ai.ak")
    public int field1079 = 0;

    @ObfuscatedName("ai.aw")
    public class60[] field1070 = new class60[8];

    @ObfuscatedName("ai.ab")
    public class60[] field1081 = new class60[8];

    @ObfuscatedName("ax.h(Ldy;Ljava/awt/Component;III)Lai;")
    public static final class50 method590(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1085 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1060 = new int[256 * (Statics.field1061 ? 2 : 1)];
                var4.field1065 = arg3;
                var4.method901(arg1);
                var4.field1069 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1069 > 16384) {
                    var4.field1069 = 16384;
                }
                var4.method902(var4.field1069);
                if (Statics.field1086 > 0 && Statics.field1063 == null) {
                    Statics.field1063 = new class66();
                    Statics.field1063.field1239 = arg0;
                    arg0.method2468(Statics.field1063, Statics.field1086);
                }
                if (Statics.field1063 != null) {
                    if (Statics.field1063.field1235[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1063.field1235[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1060 = new int[256 * (Statics.field1061 ? 2 : 1)];
                    var6.field1065 = arg3;
                    var6.method901(arg1);
                    var6.field1069 = 16384;
                    var6.method902(var6.field1069);
                    if (Statics.field1086 > 0 && Statics.field1063 == null) {
                        Statics.field1063 = new class66();
                        Statics.field1063.field1239 = arg0;
                        arg0.method2468(Statics.field1063, Statics.field1086);
                    }
                    if (Statics.field1063 != null) {
                        if (Statics.field1063.field1235[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1063.field1235[arg2] = var6;
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

    @ObfuscatedName("ai.i(Lbe;I)V")
    public final synchronized void method968(class60 arg0) {
        this.field1066 = arg0;
    }

    @ObfuscatedName("ai.o(I)V")
    public final synchronized void method974() {
        if (this.field1060 == null) {
            return;
        }
        long var1 = class103.method2037();
        try {
            if (this.field1080 != 0L) {
                if (var1 < this.field1080) {
                    return;
                }
                this.method902(this.field1069);
                this.field1080 = 0L;
                this.field1077 = true;
            }
            int var3 = this.method903();
            if (this.field1075 - var3 > this.field1073) {
                this.field1073 = this.field1075 - var3;
            }
            int var4 = this.field1078 + this.field1065;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1069) {
                this.field1069 += 1024;
                if (this.field1069 > 16384) {
                    this.field1069 = 16384;
                }
                this.method905();
                this.method902(this.field1069);
                var3 = 0;
                this.field1077 = true;
                if (var4 + 256 > this.field1069) {
                    var4 = this.field1069 - 256;
                    this.field1078 = var4 - this.field1065;
                }
            }
            while (var3 < var4) {
                this.method966(this.field1060, 256);
                this.method904();
                var3 += 256;
            }
            if (var1 > this.field1076) {
                if (this.field1077) {
                    this.field1077 = false;
                } else if (this.field1073 == 0 && this.field1074 == 0) {
                    this.method905();
                    this.field1080 = var1 + 2000L;
                    return;
                } else {
                    this.field1078 = Math.min(this.field1074, this.field1073);
                    this.field1074 = this.field1073;
                }
                this.field1073 = 0;
                this.field1076 = var1 + 2000L;
            }
            this.field1075 = var3;
        } catch (Exception var8) {
            this.method905();
            this.field1080 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1068 + 500000L) {
                var1 = this.field1068;
            }
            while (var1 > this.field1068 + 5000L) {
                this.method971(256);
                this.field1068 += (long) (256000 / Statics.field1085);
            }
        } catch (Exception var7) {
            this.field1068 = var1;
        }
    }

    @ObfuscatedName("ai.m(S)V")
    public final void method963() {
        this.field1077 = true;
    }

    @ObfuscatedName("ai.ak(I)V")
    public final synchronized void method975() {
        this.field1077 = true;
        try {
            this.method906();
        } catch (Exception var2) {
            this.method905();
            this.field1080 = class103.method2037() + 2000L;
        }
    }

    @ObfuscatedName("ai.aw(I)V")
    public final synchronized void method967() {
        if (Statics.field1063 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1063.field1235[var2] == this) {
                    Statics.field1063.field1235[var2] = null;
                }
                if (Statics.field1063.field1235[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1063.field1237 = true;
                while (Statics.field1063.field1236) {
                    class114.method2031(50L);
                }
                Statics.field1063 = null;
            }
        }
        this.method905();
        this.field1060 = null;
    }

    @ObfuscatedName("ai.af(II)V")
    public final void method971(int arg0) {
        this.field1079 -= arg0;
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1066 != null) {
            this.field1066.method934(arg0);
        }
    }

    @ObfuscatedName("ai.ab([II)V")
    public final void method966(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1061) {
            var3 = arg1 << 1;
        }
        class108.method2318(arg0, 0, var3);
        this.field1079 -= arg1;
        if (this.field1066 != null && this.field1079 <= 0) {
            this.field1079 += Statics.field1085 >> 4;
            method134(this.field1066);
            this.method965(this.field1066, this.field1066.method1071());
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
                        class60 var11 = this.field1070[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1151;
                                if (var12 == null || var12.field1150 <= var8) {
                                    var11.field1153 = true;
                                    int var13 = var11.method931();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1150 += var13;
                                    }
                                    if (var4 >= this.field1067) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method929();
                                    if (var14 != null) {
                                        int var15 = var11.field1152;
                                        while (var14 != null) {
                                            this.method965(var14, var15 * var14.method1071() >> 8);
                                            var14 = var11.method928();
                                        }
                                    }
                                    class60 var16 = var11.field1154;
                                    var11.field1154 = null;
                                    if (var10 == null) {
                                        this.field1070[var7] = var16;
                                    } else {
                                        var10.field1154 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1081[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1154;
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
                class60 var18 = this.field1070[var17];
                class60[] var19 = this.field1070;
                this.field1081[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1154;
                    var18.field1154 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1066 != null) {
            this.field1066.method932(arg0, 0, arg1);
        }
        this.field1068 = class103.method2037();
    }

    @ObfuscatedName("a.ao(Lbe;B)V")
    public static final void method134(class60 arg0) {
        arg0.field1153 = false;
        if (arg0.field1151 != null) {
            arg0.field1151.field1150 = 0;
        }
        for (class60 var1 = arg0.method929(); var1 != null; var1 = arg0.method928()) {
            method134(var1);
        }
    }

    @ObfuscatedName("ai.ah(Lbe;IB)V")
    public final void method965(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1081[var3];
        if (var4 == null) {
            this.field1070[var3] = arg0;
        } else {
            var4.field1154 = arg0;
        }
        this.field1081[var3] = arg0;
        arg0.field1152 = arg1;
    }

    @ObfuscatedName("ai.t(Ljava/awt/Component;)V")
    public void method901(Component arg0) throws Exception {
    }

    @ObfuscatedName("ai.s(I)V")
    public void method902(int arg0) throws Exception {
    }

    @ObfuscatedName("ai.f()I")
    public int method903() throws Exception {
        return this.field1069;
    }

    @ObfuscatedName("ai.e()V")
    public void method904() throws Exception {
    }

    @ObfuscatedName("ai.d()V")
    public void method905() {
    }

    @ObfuscatedName("ai.n()V")
    public void method906() throws Exception {
    }
}
