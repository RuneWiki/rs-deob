package deob;

import java.awt.Component;

@ObfuscatedName("bh")
public class class57 {

    @ObfuscatedName("bh.u")
    public int[] field1171;

    @ObfuscatedName("bh.c")
    public class67 field1174;

    @ObfuscatedName("bh.v")
    public int field1175 = 32;

    @ObfuscatedName("bh.o")
    public long field1186 = class115.method579();

    @ObfuscatedName("bh.n")
    public int field1191;

    @ObfuscatedName("bh.k")
    public int field1178;

    @ObfuscatedName("bh.f")
    public int field1173;

    @ObfuscatedName("bh.x")
    public long field1179 = 0L;

    @ObfuscatedName("bh.j")
    public int field1181 = 0;

    @ObfuscatedName("bh.r")
    public int field1182 = 0;

    @ObfuscatedName("bh.y")
    public int field1183 = 0;

    @ObfuscatedName("bh.t")
    public long field1184 = 0L;

    @ObfuscatedName("bh.a")
    public boolean field1180 = true;

    @ObfuscatedName("bh.ay")
    public int field1188 = 0;

    @ObfuscatedName("bh.ak")
    public class67[] field1172 = new class67[8];

    @ObfuscatedName("bh.ai")
    public class67[] field1190 = new class67[8];

    @ObfuscatedName("w.s(Leq;Ljava/awt/Component;III)Lbh;")
    public static final class57 method23(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1189 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1171 = new int[(Statics.field1185 ? 2 : 1) * 256];
                var4.field1178 = arg3;
                var4.method1122(arg1);
                var4.field1191 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1191 > 16384) {
                    var4.field1191 = 16384;
                }
                var4.method1123(var4.field1191);
                if (Statics.field1962 > 0 && Statics.field1375 == null) {
                    Statics.field1375 = new class73();
                    Statics.field1375.field1344 = arg0;
                    arg0.method2742(Statics.field1375, Statics.field1962);
                }
                if (Statics.field1375 != null) {
                    if (Statics.field1375.field1342[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1375.field1342[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1171 = new int[256 * (Statics.field1185 ? 2 : 1)];
                    var6.field1178 = arg3;
                    var6.method1122(arg1);
                    var6.field1191 = 16384;
                    var6.method1123(var6.field1191);
                    if (Statics.field1962 > 0 && Statics.field1375 == null) {
                        Statics.field1375 = new class73();
                        Statics.field1375.field1344 = arg0;
                        arg0.method2742(Statics.field1375, Statics.field1962);
                    }
                    if (Statics.field1375 != null) {
                        if (Statics.field1375.field1342[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1375.field1342[arg2] = var6;
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

    @ObfuscatedName("bh.e(Lby;I)V")
    public final synchronized void method1191(class67 arg0) {
        this.field1174 = arg0;
    }

    @ObfuscatedName("bh.q(B)V")
    public final synchronized void method1200() {
        if (this.field1171 == null) {
            return;
        }
        long var1 = class115.method579();
        try {
            if (this.field1179 != 0L) {
                if (var1 < this.field1179) {
                    return;
                }
                this.method1123(this.field1191);
                this.field1179 = 0L;
                this.field1180 = true;
            }
            int var3 = this.method1124();
            if (this.field1183 - var3 > this.field1181) {
                this.field1181 = this.field1183 - var3;
            }
            int var4 = this.field1178 + this.field1173;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1191) {
                this.field1191 += 1024;
                if (this.field1191 > 16384) {
                    this.field1191 = 16384;
                }
                this.method1135();
                this.method1123(this.field1191);
                var3 = 0;
                this.field1180 = true;
                if (var4 + 256 > this.field1191) {
                    var4 = this.field1191 - 256;
                    this.field1173 = var4 - this.field1178;
                }
            }
            while (var3 < var4) {
                this.method1197(this.field1171, 256);
                this.method1121();
                var3 += 256;
            }
            if (var1 > this.field1184) {
                if (this.field1180) {
                    this.field1180 = false;
                } else if (this.field1181 == 0 && this.field1182 == 0) {
                    this.method1135();
                    this.field1179 = var1 + 2000L;
                    return;
                } else {
                    this.field1173 = Math.min(this.field1182, this.field1181);
                    this.field1182 = this.field1181;
                }
                this.field1181 = 0;
                this.field1184 = var1 + 2000L;
            }
            this.field1183 = var3;
        } catch (Exception var8) {
            this.method1135();
            this.field1179 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1186 + 500000L) {
                var1 = this.field1186;
            }
            while (var1 > this.field1186 + 5000L) {
                this.method1196(256);
                this.field1186 += (long) (256000 / Statics.field1189);
            }
        } catch (Exception var7) {
            this.field1186 = var1;
        }
    }

    @ObfuscatedName("bh.i(I)V")
    public final void method1193() {
        this.field1180 = true;
    }

    @ObfuscatedName("bh.h(I)V")
    public final synchronized void method1194() {
        this.field1180 = true;
        try {
            this.method1125();
        } catch (Exception var2) {
            this.method1135();
            this.field1179 = class115.method579() + 2000L;
        }
    }

    @ObfuscatedName("bh.ay(I)V")
    public final synchronized void method1195() {
        if (Statics.field1375 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1375.field1342[var2] == this) {
                    Statics.field1375.field1342[var2] = null;
                }
                if (Statics.field1375.field1342[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1375.field1341 = true;
                while (Statics.field1375.field1343) {
                    class127.method2632(50L);
                }
                Statics.field1375 = null;
            }
        }
        this.method1135();
        this.field1171 = null;
    }

    @ObfuscatedName("bh.ak(II)V")
    public final void method1196(int arg0) {
        this.field1188 -= arg0;
        if (this.field1188 < 0) {
            this.field1188 = 0;
        }
        if (this.field1174 != null) {
            this.field1174.method1173(arg0);
        }
    }

    @ObfuscatedName("bh.ai([II)V")
    public final void method1197(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1185) {
            var3 = arg1 << 1;
        }
        class120.method2594(arg0, 0, var3);
        this.field1188 -= arg1;
        if (this.field1174 != null && this.field1188 <= 0) {
            this.field1188 += Statics.field1189 >> 4;
            method2736(this.field1174);
            this.method1198(this.field1174, this.field1174.method1342());
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
                        class67 var11 = this.field1172[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1259;
                                if (var12 == null || var12.field1256 <= var8) {
                                    var11.field1260 = true;
                                    int var13 = var11.method1177();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1256 += var13;
                                    }
                                    if (var4 >= this.field1175) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1174();
                                    if (var14 != null) {
                                        int var15 = var11.field1257;
                                        while (var14 != null) {
                                            this.method1198(var14, var15 * var14.method1342() >> 8);
                                            var14 = var11.method1149();
                                        }
                                    }
                                    class67 var16 = var11.field1258;
                                    var11.field1258 = null;
                                    if (var10 == null) {
                                        this.field1172[var7] = var16;
                                    } else {
                                        var10.field1258 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1190[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1258;
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
                class67 var18 = this.field1172[var17];
                class67[] var19 = this.field1172;
                this.field1190[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1258;
                    var18.field1258 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1188 < 0) {
            this.field1188 = 0;
        }
        if (this.field1174 != null) {
            this.field1174.method1151(arg0, 0, arg1);
        }
        this.field1186 = class115.method579();
    }

    @ObfuscatedName("ez.ag(Lby;I)V")
    public static final void method2736(class67 arg0) {
        arg0.field1260 = false;
        if (arg0.field1259 != null) {
            arg0.field1259.field1256 = 0;
        }
        for (class67 var1 = arg0.method1174(); var1 != null; var1 = arg0.method1149()) {
            method2736(var1);
        }
    }

    @ObfuscatedName("bh.ab(Lby;II)V")
    public final void method1198(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1190[var3];
        if (var4 == null) {
            this.field1172[var3] = arg0;
        } else {
            var4.field1258 = arg0;
        }
        this.field1190[var3] = arg0;
        arg0.field1257 = arg1;
    }

    @ObfuscatedName("bh.g(Ljava/awt/Component;)V")
    public void method1122(Component arg0) throws Exception {
    }

    @ObfuscatedName("bh.b(I)V")
    public void method1123(int arg0) throws Exception {
    }

    @ObfuscatedName("bh.w()I")
    public int method1124() throws Exception {
        return this.field1191;
    }

    @ObfuscatedName("bh.d()V")
    public void method1121() throws Exception {
    }

    @ObfuscatedName("bh.z()V")
    public void method1135() {
    }

    @ObfuscatedName("bh.l()V")
    public void method1125() throws Exception {
    }
}
