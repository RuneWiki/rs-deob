package deob;

import java.awt.Component;

@ObfuscatedName("bs")
public class class57 {

    @ObfuscatedName("bs.t")
    public int[] field1163;

    @ObfuscatedName("bs.w")
    public class67 field1175;

    @ObfuscatedName("bs.x")
    public int field1173 = 32;

    @ObfuscatedName("bs.k")
    public long field1166 = class115.method2266();

    @ObfuscatedName("bs.z")
    public int field1180;

    @ObfuscatedName("bs.v")
    public int field1168;

    @ObfuscatedName("bs.j")
    public int field1169;

    @ObfuscatedName("bs.f")
    public long field1170 = 0L;

    @ObfuscatedName("bs.c")
    public int field1171 = 0;

    @ObfuscatedName("bs.s")
    public int field1164 = 0;

    @ObfuscatedName("bs.r")
    public int field1159 = 0;

    @ObfuscatedName("bs.u")
    public long field1160 = 0L;

    @ObfuscatedName("bs.a")
    public boolean field1176 = true;

    @ObfuscatedName("bs.ad")
    public int field1178 = 0;

    @ObfuscatedName("bs.aq")
    public class67[] field1179 = new class67[8];

    @ObfuscatedName("bs.ak")
    public class67[] field1174 = new class67[8];

    @ObfuscatedName("cu.n(IZII)V")
    public static final void method2171(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1167 = arg0;
        Statics.field1946 = arg1;
        Statics.field1172 = arg2;
    }

    @ObfuscatedName("fs.i(Len;Ljava/awt/Component;IIB)Lbs;")
    public static final class57 method3214(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1167 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1163 = new int[(Statics.field1946 ? 2 : 1) * 256];
                var4.field1168 = arg3;
                var4.method1113(arg1);
                var4.field1180 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1180 > 16384) {
                    var4.field1180 = 16384;
                }
                var4.method1120(var4.field1180);
                if (Statics.field1172 > 0 && Statics.field1161 == null) {
                    Statics.field1161 = new class73();
                    Statics.field1161.field1338 = arg0;
                    arg0.method2736(Statics.field1161, Statics.field1172);
                }
                if (Statics.field1161 != null) {
                    if (Statics.field1161.field1334[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1161.field1334[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1163 = new int[(Statics.field1946 ? 2 : 1) * 256];
                    var6.field1168 = arg3;
                    var6.method1113(arg1);
                    var6.field1180 = 16384;
                    var6.method1120(var6.field1180);
                    if (Statics.field1172 > 0 && Statics.field1161 == null) {
                        Statics.field1161 = new class73();
                        Statics.field1161.field1338 = arg0;
                        arg0.method2736(Statics.field1161, Statics.field1172);
                    }
                    if (Statics.field1161 != null) {
                        if (Statics.field1161.field1334[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1161.field1334[arg2] = var6;
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

    @ObfuscatedName("bs.ad(Lbt;I)V")
    public final synchronized void method1202(class67 arg0) {
        this.field1175 = arg0;
    }

    @ObfuscatedName("bs.aq(I)V")
    public final synchronized void method1193() {
        if (this.field1163 == null) {
            return;
        }
        long var1 = class115.method2266();
        try {
            if (this.field1170 != 0L) {
                if (var1 < this.field1170) {
                    return;
                }
                this.method1120(this.field1180);
                this.field1170 = 0L;
                this.field1176 = true;
            }
            int var3 = this.method1115();
            if (this.field1159 - var3 > this.field1171) {
                this.field1171 = this.field1159 - var3;
            }
            int var4 = this.field1169 + this.field1168;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1180) {
                this.field1180 += 1024;
                if (this.field1180 > 16384) {
                    this.field1180 = 16384;
                }
                this.method1117();
                this.method1120(this.field1180);
                var3 = 0;
                this.field1176 = true;
                if (var4 + 256 > this.field1180) {
                    var4 = this.field1180 - 256;
                    this.field1169 = var4 - this.field1168;
                }
            }
            while (var3 < var4) {
                this.method1180(this.field1163, 256);
                this.method1116();
                var3 += 256;
            }
            if (var1 > this.field1160) {
                if (this.field1176) {
                    this.field1176 = false;
                } else if (this.field1171 == 0 && this.field1164 == 0) {
                    this.method1117();
                    this.field1170 = var1 + 2000L;
                    return;
                } else {
                    this.field1169 = Math.min(this.field1164, this.field1171);
                    this.field1164 = this.field1171;
                }
                this.field1171 = 0;
                this.field1160 = var1 + 2000L;
            }
            this.field1159 = var3;
        } catch (Exception var8) {
            this.method1117();
            this.field1170 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1166 + 500000L) {
                var1 = this.field1166;
            }
            while (var1 > this.field1166 + 5000L) {
                this.method1207(256);
                this.field1166 += (long) (256000 / Statics.field1167);
            }
        } catch (Exception var7) {
            this.field1166 = var1;
        }
    }

    @ObfuscatedName("bs.ak(I)V")
    public final void method1177() {
        this.field1176 = true;
    }

    @ObfuscatedName("bs.au(I)V")
    public final synchronized void method1178() {
        this.field1176 = true;
        try {
            this.method1128();
        } catch (Exception var2) {
            this.method1117();
            this.field1170 = class115.method2266() + 2000L;
        }
    }

    @ObfuscatedName("bs.ao(B)V")
    public final synchronized void method1179() {
        if (Statics.field1161 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1161.field1334[var2] == this) {
                    Statics.field1161.field1334[var2] = null;
                }
                if (Statics.field1161.field1334[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1161.field1335 = true;
                while (Statics.field1161.field1336) {
                    class127.method2667(50L);
                }
                Statics.field1161 = null;
            }
        }
        this.method1117();
        this.field1163 = null;
    }

    @ObfuscatedName("bs.am(IB)V")
    public final void method1207(int arg0) {
        this.field1178 -= arg0;
        if (this.field1178 < 0) {
            this.field1178 = 0;
        }
        if (this.field1175 != null) {
            this.field1175.method1147(arg0);
        }
    }

    @ObfuscatedName("bs.ah([II)V")
    public final void method1180(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1946) {
            var3 = arg1 << 1;
        }
        class120.method2594(arg0, 0, var3);
        this.field1178 -= arg1;
        if (this.field1175 != null && this.field1178 <= 0) {
            this.field1178 += Statics.field1167 >> 4;
            method88(this.field1175);
            this.method1215(this.field1175, this.field1175.method1391());
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
                        class67 var11 = this.field1179[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1249;
                                if (var12 == null || var12.field1248 <= var8) {
                                    var11.field1252 = true;
                                    int var13 = var11.method1144();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1248 += var13;
                                    }
                                    if (var4 >= this.field1173) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1142();
                                    if (var14 != null) {
                                        int var15 = var11.field1250;
                                        while (var14 != null) {
                                            this.method1215(var14, var15 * var14.method1391() >> 8);
                                            var14 = var11.method1143();
                                        }
                                    }
                                    class67 var16 = var11.field1251;
                                    var11.field1251 = null;
                                    if (var10 == null) {
                                        this.field1179[var7] = var16;
                                    } else {
                                        var10.field1251 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1174[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1251;
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
                class67 var18 = this.field1179[var17];
                class67[] var19 = this.field1179;
                this.field1174[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1251;
                    var18.field1251 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1178 < 0) {
            this.field1178 = 0;
        }
        if (this.field1175 != null) {
            this.field1175.method1165(arg0, 0, arg1);
        }
        this.field1166 = class115.method2266();
    }

    @ObfuscatedName("m.aj(Lbt;I)V")
    public static final void method88(class67 arg0) {
        arg0.field1252 = false;
        if (arg0.field1249 != null) {
            arg0.field1249.field1248 = 0;
        }
        for (class67 var1 = arg0.method1142(); var1 != null; var1 = arg0.method1143()) {
            method88(var1);
        }
    }

    @ObfuscatedName("bs.ar(Lbt;II)V")
    public final void method1215(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1174[var3];
        if (var4 == null) {
            this.field1179[var3] = arg0;
        } else {
            var4.field1251 = arg0;
        }
        this.field1174[var3] = arg0;
        arg0.field1250 = arg1;
    }

    @ObfuscatedName("bs.l(Ljava/awt/Component;)V")
    public void method1113(Component arg0) throws Exception {
    }

    @ObfuscatedName("bs.e(I)V")
    public void method1120(int arg0) throws Exception {
    }

    @ObfuscatedName("bs.q()I")
    public int method1115() throws Exception {
        return this.field1180;
    }

    @ObfuscatedName("bs.o()V")
    public void method1116() throws Exception {
    }

    @ObfuscatedName("bs.g()V")
    public void method1117() {
    }

    @ObfuscatedName("bs.m()V")
    public void method1128() throws Exception {
    }
}
