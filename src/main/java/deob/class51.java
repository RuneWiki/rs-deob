package deob;

import java.awt.Component;

@ObfuscatedName("as")
public class class51 {

    @ObfuscatedName("as.z")
    public int[] field1097;

    @ObfuscatedName("as.w")
    public class61 field1098;

    @ObfuscatedName("as.j")
    public int field1117 = 32;

    @ObfuscatedName("as.p")
    public long field1111 = class104.method567();

    @ObfuscatedName("as.n")
    public int field1101;

    @ObfuscatedName("as.r")
    public int field1100;

    @ObfuscatedName("as.s")
    public int field1103;

    @ObfuscatedName("as.f")
    public long field1104 = 0L;

    @ObfuscatedName("as.c")
    public int field1105 = 0;

    @ObfuscatedName("as.t")
    public int field1106 = 0;

    @ObfuscatedName("as.i")
    public int field1107 = 0;

    @ObfuscatedName("as.u")
    public long field1110 = 0L;

    @ObfuscatedName("as.y")
    public boolean field1109 = true;

    @ObfuscatedName("as.ac")
    public int field1112 = 0;

    @ObfuscatedName("as.ax")
    public class61[] field1113 = new class61[8];

    @ObfuscatedName("as.am")
    public class61[] field1114 = new class61[8];

    @ObfuscatedName("go.m(IZIB)V")
    public static final void method3341(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1108 = arg0;
        Statics.field1092 = arg1;
        Statics.field1093 = arg2;
    }

    @ObfuscatedName("y.h(Ldy;Ljava/awt/Component;III)Las;")
    public static final class51 method458(class125 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1108 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1097 = new int[256 * (Statics.field1092 ? 2 : 1)];
                var4.field1100 = arg3;
                var4.method925(arg1);
                var4.field1101 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1101 > 16384) {
                    var4.field1101 = 16384;
                }
                var4.method926(var4.field1101);
                if (Statics.field1093 > 0 && Statics.field1094 == null) {
                    Statics.field1094 = new class67();
                    Statics.field1094.field1276 = arg0;
                    arg0.method2487(Statics.field1094, Statics.field1093);
                }
                if (Statics.field1094 != null) {
                    if (Statics.field1094.field1271[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1094.field1271[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1097 = new int[256 * (Statics.field1092 ? 2 : 1)];
                    var6.field1100 = arg3;
                    var6.method925(arg1);
                    var6.field1101 = 16384;
                    var6.method926(var6.field1101);
                    if (Statics.field1093 > 0 && Statics.field1094 == null) {
                        Statics.field1094 = new class67();
                        Statics.field1094.field1276 = arg0;
                        arg0.method2487(Statics.field1094, Statics.field1093);
                    }
                    if (Statics.field1094 != null) {
                        if (Statics.field1094.field1271[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1094.field1271[arg2] = var6;
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

    @ObfuscatedName("as.x(Lbz;B)V")
    public final synchronized void method986(class61 arg0) {
        this.field1098 = arg0;
    }

    @ObfuscatedName("as.d(B)V")
    public final synchronized void method987() {
        if (this.field1097 == null) {
            return;
        }
        long var1 = class104.method567();
        try {
            if (this.field1104 != 0L) {
                if (var1 < this.field1104) {
                    return;
                }
                this.method926(this.field1101);
                this.field1104 = 0L;
                this.field1109 = true;
            }
            int var3 = this.method944();
            if (this.field1107 - var3 > this.field1105) {
                this.field1105 = this.field1107 - var3;
            }
            int var4 = this.field1103 + this.field1100;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1101) {
                this.field1101 += 1024;
                if (this.field1101 > 16384) {
                    this.field1101 = 16384;
                }
                this.method929();
                this.method926(this.field1101);
                var3 = 0;
                this.field1109 = true;
                if (var4 + 256 > this.field1101) {
                    var4 = this.field1101 - 256;
                    this.field1103 = var4 - this.field1100;
                }
            }
            while (var3 < var4) {
                this.method1008(this.field1097, 256);
                this.method927();
                var3 += 256;
            }
            if (var1 > this.field1110) {
                if (this.field1109) {
                    this.field1109 = false;
                } else if (this.field1105 == 0 && this.field1106 == 0) {
                    this.method929();
                    this.field1104 = var1 + 2000L;
                    return;
                } else {
                    this.field1103 = Math.min(this.field1106, this.field1105);
                    this.field1106 = this.field1105;
                }
                this.field1105 = 0;
                this.field1110 = var1 + 2000L;
            }
            this.field1107 = var3;
        } catch (Exception var8) {
            this.method929();
            this.field1104 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1111 + 500000L) {
                var1 = this.field1111;
            }
            while (var1 > this.field1111 + 5000L) {
                this.method1016(256);
                this.field1111 += (long) (256000 / Statics.field1108);
            }
        } catch (Exception var7) {
            this.field1111 = var1;
        }
    }

    @ObfuscatedName("as.ac(I)V")
    public final void method994() {
        this.field1109 = true;
    }

    @ObfuscatedName("as.ax(I)V")
    public final synchronized void method992() {
        this.field1109 = true;
        try {
            this.method930();
        } catch (Exception var2) {
            this.method929();
            this.field1104 = class104.method567() + 2000L;
        }
    }

    @ObfuscatedName("as.af(B)V")
    public final synchronized void method989() {
        if (Statics.field1094 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1094.field1271[var2] == this) {
                    Statics.field1094.field1271[var2] = null;
                }
                if (Statics.field1094.field1271[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1094.field1275 = true;
                while (Statics.field1094.field1273) {
                    class116.method7(50L);
                }
                Statics.field1094 = null;
            }
        }
        this.method929();
        this.field1097 = null;
    }

    @ObfuscatedName("as.am(II)V")
    public final void method1016(int arg0) {
        this.field1112 -= arg0;
        if (this.field1112 < 0) {
            this.field1112 = 0;
        }
        if (this.field1098 != null) {
            this.field1098.method957(arg0);
        }
    }

    @ObfuscatedName("as.ah([II)V")
    public final void method1008(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1092) {
            var3 = arg1 << 1;
        }
        class109.method2328(arg0, 0, var3);
        this.field1112 -= arg1;
        if (this.field1098 != null && this.field1112 <= 0) {
            this.field1112 += Statics.field1108 >> 4;
            method757(this.field1098);
            this.method991(this.field1098, this.field1098.method1108());
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
                        class61 var11 = this.field1113[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1188;
                                if (var12 == null || var12.field1185 <= var8) {
                                    var11.field1189 = true;
                                    int var13 = var11.method950();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1185 += var13;
                                    }
                                    if (var4 >= this.field1117) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method980();
                                    if (var14 != null) {
                                        int var15 = var11.field1187;
                                        while (var14 != null) {
                                            this.method991(var14, var15 * var14.method1108() >> 8);
                                            var14 = var11.method946();
                                        }
                                    }
                                    class61 var16 = var11.field1186;
                                    var11.field1186 = null;
                                    if (var10 == null) {
                                        this.field1113[var7] = var16;
                                    } else {
                                        var10.field1186 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1114[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1186;
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
                class61 var18 = this.field1113[var17];
                class61[] var19 = this.field1113;
                this.field1114[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1186;
                    var18.field1186 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1112 < 0) {
            this.field1112 = 0;
        }
        if (this.field1098 != null) {
            this.field1098.method952(arg0, 0, arg1);
        }
        this.field1111 = class104.method567();
    }

    @ObfuscatedName("az.ar(Lbz;I)V")
    public static final void method757(class61 arg0) {
        arg0.field1189 = false;
        if (arg0.field1188 != null) {
            arg0.field1188.field1185 = 0;
        }
        for (class61 var1 = arg0.method980(); var1 != null; var1 = arg0.method946()) {
            method757(var1);
        }
    }

    @ObfuscatedName("as.ad(Lbz;II)V")
    public final void method991(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1114[var3];
        if (var4 == null) {
            this.field1113[var3] = arg0;
        } else {
            var4.field1186 = arg0;
        }
        this.field1114[var3] = arg0;
        arg0.field1187 = arg1;
    }

    @ObfuscatedName("as.e(Ljava/awt/Component;)V")
    public void method925(Component arg0) throws Exception {
    }

    @ObfuscatedName("as.v(I)V")
    public void method926(int arg0) throws Exception {
    }

    @ObfuscatedName("as.k()I")
    public int method944() throws Exception {
        return this.field1101;
    }

    @ObfuscatedName("as.g()V")
    public void method927() throws Exception {
    }

    @ObfuscatedName("as.q()V")
    public void method929() {
    }

    @ObfuscatedName("as.l()V")
    public void method930() throws Exception {
    }
}
