package deob;

import java.awt.Component;

@ObfuscatedName("am")
public class class52 {

    @ObfuscatedName("am.l")
    public int[] field1128;

    @ObfuscatedName("am.f")
    public class62 field1129;

    @ObfuscatedName("am.e")
    public int field1130 = 32;

    @ObfuscatedName("am.z")
    public long field1131 = class107.method1430();

    @ObfuscatedName("am.v")
    public int field1132;

    @ObfuscatedName("am.x")
    public int field1138;

    @ObfuscatedName("am.q")
    public int field1134;

    @ObfuscatedName("am.b")
    public long field1133 = 0L;

    @ObfuscatedName("am.u")
    public int field1136 = 0;

    @ObfuscatedName("am.t")
    public int field1137 = 0;

    @ObfuscatedName("am.s")
    public int field1135 = 0;

    @ObfuscatedName("am.p")
    public long field1139 = 0L;

    @ObfuscatedName("am.d")
    public boolean field1140 = true;

    @ObfuscatedName("am.av")
    public int field1147 = 0;

    @ObfuscatedName("am.ag")
    public class62[] field1144 = new class62[8];

    @ObfuscatedName("am.aq")
    public class62[] field1145 = new class62[8];

    @ObfuscatedName("client.j(Ldz;Ljava/awt/Component;IIB)Lam;")
    public static final class52 method330(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1141 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1128 = new int[(Statics.field1126 ? 2 : 1) * 256];
                var4.field1138 = arg3;
                var4.method1010(arg1);
                var4.field1132 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1132 > 16384) {
                    var4.field1132 = 16384;
                }
                var4.method1012(var4.field1132);
                if (Statics.field1125 > 0 && Statics.field1146 == null) {
                    Statics.field1146 = new class68();
                    Statics.field1146.field1297 = arg0;
                    arg0.method2610(Statics.field1146, Statics.field1125);
                }
                if (Statics.field1146 != null) {
                    if (Statics.field1146.field1298[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1146.field1298[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1128 = new int[(Statics.field1126 ? 2 : 1) * 256];
                    var6.field1138 = arg3;
                    var6.method1010(arg1);
                    var6.field1132 = 16384;
                    var6.method1012(var6.field1132);
                    if (Statics.field1125 > 0 && Statics.field1146 == null) {
                        Statics.field1146 = new class68();
                        Statics.field1146.field1297 = arg0;
                        arg0.method2610(Statics.field1146, Statics.field1125);
                    }
                    if (Statics.field1146 != null) {
                        if (Statics.field1146.field1298[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1146.field1298[arg2] = var6;
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

    @ObfuscatedName("am.k(Lby;B)V")
    public final synchronized void method1071(class62 arg0) {
        this.field1129 = arg0;
    }

    @ObfuscatedName("am.y(I)V")
    public final synchronized void method1072() {
        if (this.field1128 == null) {
            return;
        }
        long var1 = class107.method1430();
        try {
            if (this.field1133 != 0L) {
                if (var1 < this.field1133) {
                    return;
                }
                this.method1012(this.field1132);
                this.field1133 = 0L;
                this.field1140 = true;
            }
            int var3 = this.method1018();
            if (this.field1135 - var3 > this.field1136) {
                this.field1136 = this.field1135 - var3;
            }
            int var4 = this.field1138 + this.field1134;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1132) {
                this.field1132 += 1024;
                if (this.field1132 > 16384) {
                    this.field1132 = 16384;
                }
                this.method1009();
                this.method1012(this.field1132);
                var3 = 0;
                this.field1140 = true;
                if (var4 + 256 > this.field1132) {
                    var4 = this.field1132 - 256;
                    this.field1134 = var4 - this.field1138;
                }
            }
            while (var3 < var4) {
                this.method1076(this.field1128, 256);
                this.method1022();
                var3 += 256;
            }
            if (var1 > this.field1139) {
                if (this.field1140) {
                    this.field1140 = false;
                } else if (this.field1136 == 0 && this.field1137 == 0) {
                    this.method1009();
                    this.field1133 = var1 + 2000L;
                    return;
                } else {
                    this.field1134 = Math.min(this.field1137, this.field1136);
                    this.field1137 = this.field1136;
                }
                this.field1136 = 0;
                this.field1139 = var1 + 2000L;
            }
            this.field1135 = var3;
        } catch (Exception var8) {
            this.method1009();
            this.field1133 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1131 + 500000L) {
                var1 = this.field1131;
            }
            while (var1 > this.field1131 + 5000L) {
                this.method1080(256);
                this.field1131 += (long) (256000 / Statics.field1141);
            }
        } catch (Exception var7) {
            this.field1131 = var1;
        }
    }

    @ObfuscatedName("am.c(B)V")
    public final void method1101() {
        this.field1140 = true;
    }

    @ObfuscatedName("am.g(I)V")
    public final synchronized void method1077() {
        this.field1140 = true;
        try {
            this.method1025();
        } catch (Exception var2) {
            this.method1009();
            this.field1133 = class107.method1430() + 2000L;
        }
    }

    @ObfuscatedName("am.av(I)V")
    public final synchronized void method1074() {
        if (Statics.field1146 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1146.field1298[var2] == this) {
                    Statics.field1146.field1298[var2] = null;
                }
                if (Statics.field1146.field1298[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1146.field1299 = true;
                while (Statics.field1146.field1304) {
                    class119.method2156(50L);
                }
                Statics.field1146 = null;
            }
        }
        this.method1009();
        this.field1128 = null;
    }

    @ObfuscatedName("am.ag(II)V")
    public final void method1080(int arg0) {
        this.field1147 -= arg0;
        if (this.field1147 < 0) {
            this.field1147 = 0;
        }
        if (this.field1129 != null) {
            this.field1129.method1041(arg0);
        }
    }

    @ObfuscatedName("am.aq([II)V")
    public final void method1076(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1126) {
            var3 = arg1 << 1;
        }
        class112.method2463(arg0, 0, var3);
        this.field1147 -= arg1;
        if (this.field1129 != null && this.field1147 <= 0) {
            this.field1147 += Statics.field1141 >> 4;
            method2844(this.field1129);
            this.method1084(this.field1129, this.field1129.method1185());
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
                        class62 var10 = null;
                        class62 var11 = this.field1144[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1214;
                                if (var12 == null || var12.field1212 <= var8) {
                                    var11.field1216 = true;
                                    int var13 = var11.method1048();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1212 += var13;
                                    }
                                    if (var4 >= this.field1130) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1045();
                                    if (var14 != null) {
                                        int var15 = var11.field1213;
                                        while (var14 != null) {
                                            this.method1084(var14, var15 * var14.method1185() >> 8);
                                            var14 = var11.method1037();
                                        }
                                    }
                                    class62 var16 = var11.field1215;
                                    var11.field1215 = null;
                                    if (var10 == null) {
                                        this.field1144[var7] = var16;
                                    } else {
                                        var10.field1215 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1145[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1215;
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
                class62 var18 = this.field1144[var17];
                class62[] var19 = this.field1144;
                this.field1145[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1215;
                    var18.field1215 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1147 < 0) {
            this.field1147 = 0;
        }
        if (this.field1129 != null) {
            this.field1129.method1030(arg0, 0, arg1);
        }
        this.field1131 = class107.method1430();
    }

    @ObfuscatedName("eu.an(Lby;I)V")
    public static final void method2844(class62 arg0) {
        arg0.field1216 = false;
        if (arg0.field1214 != null) {
            arg0.field1214.field1212 = 0;
        }
        for (class62 var1 = arg0.method1045(); var1 != null; var1 = arg0.method1037()) {
            method2844(var1);
        }
    }

    @ObfuscatedName("am.ao(Lby;IB)V")
    public final void method1084(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1145[var3];
        if (var4 == null) {
            this.field1144[var3] = arg0;
        } else {
            var4.field1215 = arg0;
        }
        this.field1145[var3] = arg0;
        arg0.field1213 = arg1;
    }

    @ObfuscatedName("am.n(Ljava/awt/Component;)V")
    public void method1010(Component arg0) throws Exception {
    }

    @ObfuscatedName("am.o(I)V")
    public void method1012(int arg0) throws Exception {
    }

    @ObfuscatedName("am.a()I")
    public int method1018() throws Exception {
        return this.field1132;
    }

    @ObfuscatedName("am.w()V")
    public void method1022() throws Exception {
    }

    @ObfuscatedName("am.m()V")
    public void method1009() {
    }

    @ObfuscatedName("am.h()V")
    public void method1025() throws Exception {
    }
}
