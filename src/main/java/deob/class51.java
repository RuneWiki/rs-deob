package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class51 {

    @ObfuscatedName("ab.y")
    public int[] field1075;

    @ObfuscatedName("ab.m")
    public class61 field1076;

    @ObfuscatedName("ab.o")
    public int field1077 = 32;

    @ObfuscatedName("ab.c")
    public long field1087 = class106.method487();

    @ObfuscatedName("ab.r")
    public int field1079;

    @ObfuscatedName("ab.s")
    public int field1073;

    @ObfuscatedName("ab.n")
    public int field1081;

    @ObfuscatedName("ab.q")
    public long field1082 = 0L;

    @ObfuscatedName("ab.e")
    public int field1083 = 0;

    @ObfuscatedName("ab.d")
    public int field1084 = 0;

    @ObfuscatedName("ab.b")
    public int field1085 = 0;

    @ObfuscatedName("ab.a")
    public long field1092 = 0L;

    @ObfuscatedName("ab.i")
    public boolean field1093 = true;

    @ObfuscatedName("ab.ad")
    public int field1090 = 0;

    @ObfuscatedName("ab.ah")
    public class61[] field1091 = new class61[8];

    @ObfuscatedName("ab.ao")
    public class61[] field1094 = new class61[8];

    @ObfuscatedName("ca.i(Ldx;Ljava/awt/Component;III)Lab;")
    public static final class51 method1996(class127 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1819 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1075 = new int[(Statics.field1078 ? 2 : 1) * 256];
                var4.field1073 = arg3;
                var4.method948(arg1);
                var4.field1079 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1079 > 16384) {
                    var4.field1079 = 16384;
                }
                var4.method931(var4.field1079);
                if (Statics.field2844 > 0 && Statics.field68 == null) {
                    Statics.field68 = new class67();
                    Statics.field68.field1249 = arg0;
                    arg0.method2547(Statics.field68, Statics.field2844);
                }
                if (Statics.field68 != null) {
                    if (Statics.field68.field1250[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field68.field1250[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1075 = new int[256 * (Statics.field1078 ? 2 : 1)];
                    var6.field1073 = arg3;
                    var6.method948(arg1);
                    var6.field1079 = 16384;
                    var6.method931(var6.field1079);
                    if (Statics.field2844 > 0 && Statics.field68 == null) {
                        Statics.field68 = new class67();
                        Statics.field68.field1249 = arg0;
                        arg0.method2547(Statics.field68, Statics.field2844);
                    }
                    if (Statics.field68 != null) {
                        if (Statics.field68.field1250[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field68.field1250[arg2] = var6;
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

    @ObfuscatedName("ab.w(Lbc;I)V")
    public final synchronized void method996(class61 arg0) {
        this.field1076 = arg0;
    }

    @ObfuscatedName("ab.x(I)V")
    public final synchronized void method997() {
        if (this.field1075 == null) {
            return;
        }
        long var1 = class106.method487();
        try {
            if (this.field1082 != 0L) {
                if (var1 < this.field1082) {
                    return;
                }
                this.method931(this.field1079);
                this.field1082 = 0L;
                this.field1093 = true;
            }
            int var3 = this.method932();
            if (this.field1085 - var3 > this.field1083) {
                this.field1083 = this.field1085 - var3;
            }
            int var4 = this.field1081 + this.field1073;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1079) {
                this.field1079 += 1024;
                if (this.field1079 > 16384) {
                    this.field1079 = 16384;
                }
                this.method934();
                this.method931(this.field1079);
                var3 = 0;
                this.field1093 = true;
                if (var4 + 256 > this.field1079) {
                    var4 = this.field1079 - 256;
                    this.field1081 = var4 - this.field1073;
                }
            }
            while (var3 < var4) {
                this.method1000(this.field1075, 256);
                this.method933();
                var3 += 256;
            }
            if (var1 > this.field1092) {
                if (this.field1093) {
                    this.field1093 = false;
                } else if (this.field1083 == 0 && this.field1084 == 0) {
                    this.method934();
                    this.field1082 = var1 + 2000L;
                    return;
                } else {
                    this.field1081 = Math.min(this.field1084, this.field1083);
                    this.field1084 = this.field1083;
                }
                this.field1083 = 0;
                this.field1092 = var1 + 2000L;
            }
            this.field1085 = var3;
        } catch (Exception var8) {
            this.method934();
            this.field1082 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1087 + 500000L) {
                var1 = this.field1087;
            }
            while (var1 > this.field1087 + 5000L) {
                this.method1004(256);
                this.field1087 += (long) (256000 / Statics.field1819);
            }
        } catch (Exception var7) {
            this.field1087 = var1;
        }
    }

    @ObfuscatedName("ab.h(B)V")
    public final void method998() {
        this.field1093 = true;
    }

    @ObfuscatedName("ab.z(I)V")
    public final synchronized void method999() {
        this.field1093 = true;
        try {
            this.method939();
        } catch (Exception var2) {
            this.method934();
            this.field1082 = class106.method487() + 2000L;
        }
    }

    @ObfuscatedName("ab.u(I)V")
    public final synchronized void method1012() {
        if (Statics.field68 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field68.field1250[var2] == this) {
                    Statics.field68.field1250[var2] = null;
                }
                if (Statics.field68.field1250[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field68.field1248 = true;
                while (Statics.field68.field1246) {
                    class118.method2729(50L);
                }
                Statics.field68 = null;
            }
        }
        this.method934();
        this.field1075 = null;
    }

    @ObfuscatedName("ab.ad(II)V")
    public final void method1004(int arg0) {
        this.field1090 -= arg0;
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1076 != null) {
            this.field1076.method960(arg0);
        }
    }

    @ObfuscatedName("ab.ah([II)V")
    public final void method1000(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1078) {
            var3 = arg1 << 1;
        }
        class111.method2357(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1076 != null && this.field1090 <= 0) {
            this.field1090 += Statics.field1819 >> 4;
            method165(this.field1076);
            this.method1001(this.field1076, this.field1076.method1112());
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
                        class61 var11 = this.field1091[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1162;
                                if (var12 == null || var12.field1161 <= var8) {
                                    var11.field1164 = true;
                                    int var13 = var11.method957();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1161 += var13;
                                    }
                                    if (var4 >= this.field1077) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method958();
                                    if (var14 != null) {
                                        int var15 = var11.field1163;
                                        while (var14 != null) {
                                            this.method1001(var14, var15 * var14.method1112() >> 8);
                                            var14 = var11.method956();
                                        }
                                    }
                                    class61 var16 = var11.field1165;
                                    var11.field1165 = null;
                                    if (var10 == null) {
                                        this.field1091[var7] = var16;
                                    } else {
                                        var10.field1165 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1094[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1165;
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
                class61 var18 = this.field1091[var17];
                class61[] var19 = this.field1091;
                this.field1094[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1165;
                    var18.field1165 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1076 != null) {
            this.field1076.method949(arg0, 0, arg1);
        }
        this.field1087 = class106.method487();
    }

    @ObfuscatedName("e.ao(Lbc;B)V")
    public static final void method165(class61 arg0) {
        arg0.field1164 = false;
        if (arg0.field1162 != null) {
            arg0.field1162.field1161 = 0;
        }
        for (class61 var1 = arg0.method958(); var1 != null; var1 = arg0.method956()) {
            method165(var1);
        }
    }

    @ObfuscatedName("ab.as(Lbc;II)V")
    public final void method1001(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1094[var3];
        if (var4 == null) {
            this.field1091[var3] = arg0;
        } else {
            var4.field1165 = arg0;
        }
        this.field1094[var3] = arg0;
        arg0.field1163 = arg1;
    }

    @ObfuscatedName("ab.v(Ljava/awt/Component;)V")
    public void method948(Component arg0) throws Exception {
    }

    @ObfuscatedName("ab.t(I)V")
    public void method931(int arg0) throws Exception {
    }

    @ObfuscatedName("ab.f()I")
    public int method932() throws Exception {
        return this.field1079;
    }

    @ObfuscatedName("ab.j()V")
    public void method933() throws Exception {
    }

    @ObfuscatedName("ab.l()V")
    public void method934() {
    }

    @ObfuscatedName("ab.g()V")
    public void method939() throws Exception {
    }
}
