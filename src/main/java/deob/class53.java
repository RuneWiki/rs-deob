package deob;

import java.awt.Component;

@ObfuscatedName("bi")
public class class53 {

    @ObfuscatedName("bi.v")
    public int[] field1103;

    @ObfuscatedName("bi.m")
    public class49 field1109;

    @ObfuscatedName("bi.x")
    public int field1105 = 32;

    @ObfuscatedName("bi.w")
    public long field1101 = class122.method195();

    @ObfuscatedName("bi.p")
    public int field1107;

    @ObfuscatedName("bi.z")
    public int field1108;

    @ObfuscatedName("bi.h")
    public int field1120;

    @ObfuscatedName("bi.a")
    public long field1110 = 0L;

    @ObfuscatedName("bi.c")
    public int field1112 = 0;

    @ObfuscatedName("bi.k")
    public int field1106 = 0;

    @ObfuscatedName("bi.n")
    public int field1113 = 0;

    @ObfuscatedName("bi.t")
    public long field1114 = 0L;

    @ObfuscatedName("bi.y")
    public boolean field1115 = true;

    @ObfuscatedName("bi.ax")
    public int field1111 = 0;

    @ObfuscatedName("bi.at")
    public class49[] field1121 = new class49[8];

    @ObfuscatedName("bi.ah")
    public class49[] field1118 = new class49[8];

    @ObfuscatedName("w.k(Lbm;Ljava/awt/Component;III)Lbi;")
    public static final class53 method147(class75 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2014 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class52 var4 = new class52();
                var4.field1103 = new int[256 * (Statics.field1104 ? 2 : 1)];
                var4.field1108 = arg3;
                var4.method945(arg1);
                var4.field1107 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1107 > 16384) {
                    var4.field1107 = 16384;
                }
                var4.method936(var4.field1107);
                if (Statics.field2856 > 0 && Statics.field1930 == null) {
                    Statics.field1930 = new class56();
                    Statics.field1930.field1190 = arg0;
                    arg0.method1495(Statics.field1930, Statics.field2856);
                }
                if (Statics.field1930 != null) {
                    if (Statics.field1930.field1187[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1930.field1187[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class45 var6 = new class45(arg0, arg2);
                    var6.field1103 = new int[(Statics.field1104 ? 2 : 1) * 256];
                    var6.field1108 = arg3;
                    var6.method945(arg1);
                    var6.field1107 = 16384;
                    var6.method936(var6.field1107);
                    if (Statics.field2856 > 0 && Statics.field1930 == null) {
                        Statics.field1930 = new class56();
                        Statics.field1930.field1190 = arg0;
                        arg0.method1495(Statics.field1930, Statics.field2856);
                    }
                    if (Statics.field1930 != null) {
                        if (Statics.field1930.field1187[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1930.field1187[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class53();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bi.n(Laz;I)V")
    public final synchronized void method1152(class49 arg0) {
        this.field1109 = arg0;
    }

    @ObfuscatedName("bi.t(B)V")
    public final synchronized void method1153() {
        if (this.field1103 == null) {
            return;
        }
        long var1 = class122.method195();
        try {
            if (this.field1110 != 0L) {
                if (var1 < this.field1110) {
                    return;
                }
                this.method936(this.field1107);
                this.field1110 = 0L;
                this.field1115 = true;
            }
            int var3 = this.method937();
            if (this.field1113 - var3 > this.field1112) {
                this.field1112 = this.field1113 - var3;
            }
            int var4 = this.field1120 + this.field1108;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1107) {
                this.field1107 += 1024;
                if (this.field1107 > 16384) {
                    this.field1107 = 16384;
                }
                this.method939();
                this.method936(this.field1107);
                var3 = 0;
                this.field1115 = true;
                if (var4 + 256 > this.field1107) {
                    var4 = this.field1107 - 256;
                    this.field1120 = var4 - this.field1108;
                }
            }
            while (var3 < var4) {
                this.method1158(this.field1103, 256);
                this.method935();
                var3 += 256;
            }
            if (var1 > this.field1114) {
                if (this.field1115) {
                    this.field1115 = false;
                } else if (this.field1112 == 0 && this.field1106 == 0) {
                    this.method939();
                    this.field1110 = var1 + 2000L;
                    return;
                } else {
                    this.field1120 = Math.min(this.field1106, this.field1112);
                    this.field1106 = this.field1112;
                }
                this.field1112 = 0;
                this.field1114 = var1 + 2000L;
            }
            this.field1113 = var3;
        } catch (Exception var8) {
            this.method939();
            this.field1110 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1101 + 500000L) {
                var1 = this.field1101;
            }
            while (var1 > this.field1101 + 5000L) {
                this.method1157(256);
                this.field1101 += (long) (256000 / Statics.field2014);
            }
        } catch (Exception var7) {
            this.field1101 = var1;
        }
    }

    @ObfuscatedName("bi.y(I)V")
    public final void method1162() {
        this.field1115 = true;
    }

    @ObfuscatedName("bi.g(B)V")
    public final synchronized void method1155() {
        this.field1115 = true;
        try {
            this.method940();
        } catch (Exception var2) {
            this.method939();
            this.field1110 = class122.method195() + 2000L;
        }
    }

    @ObfuscatedName("bi.f(S)V")
    public final synchronized void method1156() {
        if (Statics.field1930 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1930.field1187[var2] == this) {
                    Statics.field1930.field1187[var2] = null;
                }
                if (Statics.field1930.field1187[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1930.field1188 = true;
                while (Statics.field1930.field1189) {
                    class127.method1642(50L);
                }
                Statics.field1930 = null;
            }
        }
        this.method939();
        this.field1103 = null;
    }

    @ObfuscatedName("bi.j(IB)V")
    public final void method1157(int arg0) {
        this.field1111 -= arg0;
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1109 != null) {
            this.field1109.method974(arg0);
        }
    }

    @ObfuscatedName("bi.af([II)V")
    public final void method1158(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1104) {
            var3 = arg1 << 1;
        }
        class129.method2673(arg0, 0, var3);
        this.field1111 -= arg1;
        if (this.field1109 != null && this.field1111 <= 0) {
            this.field1111 += Statics.field2014 >> 4;
            method753(this.field1109);
            this.method1159(this.field1109, this.field1109.method1016());
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
                        class49 var10 = null;
                        class49 var11 = this.field1121[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class48 var12 = var11.field1079;
                                if (var12 == null || var12.field1076 <= var8) {
                                    var11.field1078 = true;
                                    int var13 = var11.method1068();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1076 += var13;
                                    }
                                    if (var4 >= this.field1105) {
                                        break label105;
                                    }
                                    class49 var14 = var11.method969();
                                    if (var14 != null) {
                                        int var15 = var11.field1077;
                                        while (var14 != null) {
                                            this.method1159(var14, var15 * var14.method1016() >> 8);
                                            var14 = var11.method1008();
                                        }
                                    }
                                    class49 var16 = var11.field1080;
                                    var11.field1080 = null;
                                    if (var10 == null) {
                                        this.field1121[var7] = var16;
                                    } else {
                                        var10.field1080 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1118[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1080;
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
                class49 var18 = this.field1121[var17];
                class49[] var19 = this.field1121;
                this.field1118[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class49 var21 = var18.field1080;
                    var18.field1080 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1109 != null) {
            this.field1109.method978(arg0, 0, arg1);
        }
        this.field1101 = class122.method195();
    }

    @ObfuscatedName("ai.ar(Laz;S)V")
    public static final void method753(class49 arg0) {
        arg0.field1078 = false;
        if (arg0.field1079 != null) {
            arg0.field1079.field1076 = 0;
        }
        for (class49 var1 = arg0.method969(); var1 != null; var1 = arg0.method1008()) {
            method753(var1);
        }
    }

    @ObfuscatedName("bi.ax(Laz;II)V")
    public final void method1159(class49 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class49 var4 = this.field1118[var3];
        if (var4 == null) {
            this.field1121[var3] = arg0;
        } else {
            var4.field1080 = arg0;
        }
        this.field1118[var3] = arg0;
        arg0.field1077 = arg1;
    }

    @ObfuscatedName("bi.i(Ljava/awt/Component;)V")
    public void method945(Component arg0) throws Exception {
    }

    @ObfuscatedName("bi.b(I)V")
    public void method936(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.r()I")
    public int method937() throws Exception {
        return this.field1107;
    }

    @ObfuscatedName("bi.l()V")
    public void method935() throws Exception {
    }

    @ObfuscatedName("bi.s()V")
    public void method939() {
    }

    @ObfuscatedName("bi.d()V")
    public void method940() throws Exception {
    }
}
