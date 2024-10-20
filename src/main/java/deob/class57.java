package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class57 {

    @ObfuscatedName("bf.w")
    public int[] field1168;

    @ObfuscatedName("bf.h")
    public class67 field1185;

    @ObfuscatedName("bf.d")
    public int field1170 = 32;

    @ObfuscatedName("bf.l")
    public long field1167 = class115.method102();

    @ObfuscatedName("bf.n")
    public int field1172;

    @ObfuscatedName("bf.q")
    public int field1173;

    @ObfuscatedName("bf.f")
    public int field1174;

    @ObfuscatedName("bf.v")
    public long field1179 = 0L;

    @ObfuscatedName("bf.a")
    public int field1176 = 0;

    @ObfuscatedName("bf.k")
    public int field1177 = 0;

    @ObfuscatedName("bf.r")
    public int field1178 = 0;

    @ObfuscatedName("bf.i")
    public long field1190 = 0L;

    @ObfuscatedName("bf.j")
    public boolean field1180 = true;

    @ObfuscatedName("bf.ah")
    public int field1188 = 0;

    @ObfuscatedName("bf.ap")
    public class67[] field1183 = new class67[8];

    @ObfuscatedName("bf.aa")
    public class67[] field1184 = new class67[8];

    @ObfuscatedName("gk.g(IZIB)V")
    public static final void method3483(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2641 = arg0;
        Statics.field1182 = arg1;
        Statics.field2717 = arg2;
    }

    @ObfuscatedName("ar.c(Led;Ljava/awt/Component;III)Lbf;")
    public static final class57 method894(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2641 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1168 = new int[256 * (Statics.field1182 ? 2 : 1)];
                var4.field1173 = arg3;
                var4.method1067(arg1);
                var4.field1172 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1172 > 16384) {
                    var4.field1172 = 16384;
                }
                var4.method1068(var4.field1172);
                if (Statics.field2717 > 0 && Statics.field1166 == null) {
                    Statics.field1166 = new class73();
                    Statics.field1166.field1342 = arg0;
                    arg0.method2710(Statics.field1166, Statics.field2717);
                }
                if (Statics.field1166 != null) {
                    if (Statics.field1166.field1349[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1166.field1349[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1168 = new int[256 * (Statics.field1182 ? 2 : 1)];
                    var6.field1173 = arg3;
                    var6.method1067(arg1);
                    var6.field1172 = 16384;
                    var6.method1068(var6.field1172);
                    if (Statics.field2717 > 0 && Statics.field1166 == null) {
                        Statics.field1166 = new class73();
                        Statics.field1166.field1342 = arg0;
                        arg0.method2710(Statics.field1166, Statics.field2717);
                    }
                    if (Statics.field1166 != null) {
                        if (Statics.field1166.field1349[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1166.field1349[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class57();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bf.x(Lby;I)V")
    public final synchronized void method1130(class67 arg0) {
        this.field1185 = arg0;
    }

    @ObfuscatedName("bf.ah(S)V")
    public final synchronized void method1131() {
        if (this.field1168 == null) {
            return;
        }
        long var1 = class115.method102();
        try {
            if (this.field1179 != 0L) {
                if (var1 < this.field1179) {
                    return;
                }
                this.method1068(this.field1172);
                this.field1179 = 0L;
                this.field1180 = true;
            }
            int var3 = this.method1069();
            if (this.field1178 - var3 > this.field1176) {
                this.field1176 = this.field1178 - var3;
            }
            int var4 = this.field1174 + this.field1173;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1172) {
                this.field1172 += 1024;
                if (this.field1172 > 16384) {
                    this.field1172 = 16384;
                }
                this.method1066();
                this.method1068(this.field1172);
                var3 = 0;
                this.field1180 = true;
                if (var4 + 256 > this.field1172) {
                    var4 = this.field1172 - 256;
                    this.field1174 = var4 - this.field1173;
                }
            }
            while (var3 < var4) {
                this.method1135(this.field1168, 256);
                this.method1070();
                var3 += 256;
            }
            if (var1 > this.field1190) {
                if (this.field1180) {
                    this.field1180 = false;
                } else if (this.field1176 == 0 && this.field1177 == 0) {
                    this.method1066();
                    this.field1179 = var1 + 2000L;
                    return;
                } else {
                    this.field1174 = Math.min(this.field1177, this.field1176);
                    this.field1177 = this.field1176;
                }
                this.field1176 = 0;
                this.field1190 = var1 + 2000L;
            }
            this.field1178 = var3;
        } catch (Exception var8) {
            this.method1066();
            this.field1179 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1167 + 500000L) {
                var1 = this.field1167;
            }
            while (var1 > this.field1167 + 5000L) {
                this.method1134(256);
                this.field1167 += (long) (256000 / Statics.field2641);
            }
        } catch (Exception var7) {
            this.field1167 = var1;
        }
    }

    @ObfuscatedName("bf.ap(I)V")
    public final void method1132() {
        this.field1180 = true;
    }

    @ObfuscatedName("bf.aa(B)V")
    public final synchronized void method1133() {
        this.field1180 = true;
        try {
            this.method1072();
        } catch (Exception var2) {
            this.method1066();
            this.field1179 = class115.method102() + 2000L;
        }
    }

    @ObfuscatedName("bf.ay(B)V")
    public final synchronized void method1142() {
        if (Statics.field1166 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1166.field1349[var2] == this) {
                    Statics.field1166.field1349[var2] = null;
                }
                if (Statics.field1166.field1349[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1166.field1344 = true;
                while (Statics.field1166.field1345) {
                    class127.method2614(50L);
                }
                Statics.field1166 = null;
            }
        }
        this.method1066();
        this.field1168 = null;
    }

    @ObfuscatedName("bf.ak(II)V")
    public final void method1134(int arg0) {
        this.field1188 -= arg0;
        if (this.field1188 < 0) {
            this.field1188 = 0;
        }
        if (this.field1185 != null) {
            this.field1185.method1098(arg0);
        }
    }

    @ObfuscatedName("bf.an([II)V")
    public final void method1135(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1182) {
            var3 = arg1 << 1;
        }
        class120.method2569(arg0, 0, var3);
        this.field1188 -= arg1;
        if (this.field1185 != null && this.field1188 <= 0) {
            this.field1188 += Statics.field2641 >> 4;
            method2034(this.field1185);
            this.method1136(this.field1185, this.field1185.method1237());
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
                        class67 var10 = null;
                        class67 var11 = this.field1183[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1259;
                                if (var12 == null || var12.field1257 <= var8) {
                                    var11.field1260 = true;
                                    int var13 = var11.method1091();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1257 += var13;
                                    }
                                    if (var4 >= this.field1170) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1126();
                                    if (var14 != null) {
                                        int var15 = var11.field1258;
                                        while (var14 != null) {
                                            this.method1136(var14, var15 * var14.method1237() >> 8);
                                            var14 = var11.method1096();
                                        }
                                    }
                                    class67 var16 = var11.field1261;
                                    var11.field1261 = null;
                                    if (var10 == null) {
                                        this.field1183[var7] = var16;
                                    } else {
                                        var10.field1261 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1184[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1261;
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
                class67 var18 = this.field1183[var17];
                class67[] var19 = this.field1183;
                this.field1184[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1261;
                    var18.field1261 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1188 < 0) {
            this.field1188 = 0;
        }
        if (this.field1185 != null) {
            this.field1185.method1105(arg0, 0, arg1);
        }
        this.field1167 = class115.method102();
    }

    @ObfuscatedName("ca.af(Lby;B)V")
    public static final void method2034(class67 arg0) {
        arg0.field1260 = false;
        if (arg0.field1259 != null) {
            arg0.field1259.field1257 = 0;
        }
        for (class67 var1 = arg0.method1126(); var1 != null; var1 = arg0.method1096()) {
            method2034(var1);
        }
    }

    @ObfuscatedName("bf.ao(Lby;IB)V")
    public final void method1136(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1184[var3];
        if (var4 == null) {
            this.field1183[var3] = arg0;
        } else {
            var4.field1261 = arg0;
        }
        this.field1184[var3] = arg0;
        arg0.field1258 = arg1;
    }

    @ObfuscatedName("bf.o(Ljava/awt/Component;)V")
    public void method1067(Component arg0) throws Exception {
    }

    @ObfuscatedName("bf.e(I)V")
    public void method1068(int arg0) throws Exception {
    }

    @ObfuscatedName("bf.u()I")
    public int method1069() throws Exception {
        return this.field1172;
    }

    @ObfuscatedName("bf.b()V")
    public void method1070() throws Exception {
    }

    @ObfuscatedName("bf.p()V")
    public void method1066() {
    }

    @ObfuscatedName("bf.s()V")
    public void method1072() throws Exception {
    }
}
