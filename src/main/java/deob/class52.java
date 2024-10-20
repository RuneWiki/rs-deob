package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class52 {

    @ObfuscatedName("aa.f")
    public int[] field1059;

    @ObfuscatedName("aa.g")
    public class62 field1060;

    @ObfuscatedName("aa.o")
    public int field1061 = 32;

    @ObfuscatedName("aa.h")
    public long field1058 = class107.method635();

    @ObfuscatedName("aa.s")
    public int field1063;

    @ObfuscatedName("aa.j")
    public int field1066;

    @ObfuscatedName("aa.m")
    public int field1065;

    @ObfuscatedName("aa.t")
    public long field1056 = 0L;

    @ObfuscatedName("aa.z")
    public int field1067 = 0;

    @ObfuscatedName("aa.y")
    public int field1068 = 0;

    @ObfuscatedName("aa.q")
    public int field1071 = 0;

    @ObfuscatedName("aa.d")
    public long field1070 = 0L;

    @ObfuscatedName("aa.b")
    public boolean field1069 = true;

    @ObfuscatedName("aa.ax")
    public int field1072 = 0;

    @ObfuscatedName("aa.ap")
    public class62[] field1073 = new class62[8];

    @ObfuscatedName("aa.ao")
    public class62[] field1074 = new class62[8];

    @ObfuscatedName("dn.p(Ldz;Ljava/awt/Component;III)Laa;")
    public static final class52 method2507(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1064 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1059 = new int[(Statics.field1057 ? 2 : 1) * 256];
                var4.field1066 = arg3;
                var4.method975(arg1);
                var4.field1063 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1063 > 16384) {
                    var4.field1063 = 16384;
                }
                var4.method990(var4.field1063);
                if (Statics.field1876 > 0 && Statics.field1075 == null) {
                    Statics.field1075 = new class68();
                    Statics.field1075.field1232 = arg0;
                    arg0.method2566(Statics.field1075, Statics.field1876);
                }
                if (Statics.field1075 != null) {
                    if (Statics.field1075.field1228[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1075.field1228[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1059 = new int[256 * (Statics.field1057 ? 2 : 1)];
                    var6.field1066 = arg3;
                    var6.method975(arg1);
                    var6.field1063 = 16384;
                    var6.method990(var6.field1063);
                    if (Statics.field1876 > 0 && Statics.field1075 == null) {
                        Statics.field1075 = new class68();
                        Statics.field1075.field1232 = arg0;
                        arg0.method2566(Statics.field1075, Statics.field1876);
                    }
                    if (Statics.field1075 != null) {
                        if (Statics.field1075.field1228[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1075.field1228[arg2] = var6;
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

    @ObfuscatedName("aa.k(Lbu;I)V")
    public final synchronized void method1034(class62 arg0) {
        this.field1060 = arg0;
    }

    @ObfuscatedName("aa.ax(I)V")
    public final synchronized void method1042() {
        if (this.field1059 == null) {
            return;
        }
        long var1 = class107.method635();
        try {
            if (this.field1056 != 0L) {
                if (var1 < this.field1056) {
                    return;
                }
                this.method990(this.field1063);
                this.field1056 = 0L;
                this.field1069 = true;
            }
            int var3 = this.method977();
            if (this.field1071 - var3 > this.field1067) {
                this.field1067 = this.field1071 - var3;
            }
            int var4 = this.field1066 + this.field1065;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1063) {
                this.field1063 += 1024;
                if (this.field1063 > 16384) {
                    this.field1063 = 16384;
                }
                this.method979();
                this.method990(this.field1063);
                var3 = 0;
                this.field1069 = true;
                if (var4 + 256 > this.field1063) {
                    var4 = this.field1063 - 256;
                    this.field1065 = var4 - this.field1066;
                }
            }
            while (var3 < var4) {
                this.method1039(this.field1059, 256);
                this.method995();
                var3 += 256;
            }
            if (var1 > this.field1070) {
                if (this.field1069) {
                    this.field1069 = false;
                } else if (this.field1067 == 0 && this.field1068 == 0) {
                    this.method979();
                    this.field1056 = var1 + 2000L;
                    return;
                } else {
                    this.field1065 = Math.min(this.field1068, this.field1067);
                    this.field1068 = this.field1067;
                }
                this.field1067 = 0;
                this.field1070 = var1 + 2000L;
            }
            this.field1071 = var3;
        } catch (Exception var8) {
            this.method979();
            this.field1056 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1058 + 500000L) {
                var1 = this.field1058;
            }
            while (var1 > this.field1058 + 5000L) {
                this.method1065(256);
                this.field1058 += (long) (256000 / Statics.field1064);
            }
        } catch (Exception var7) {
            this.field1058 = var1;
        }
    }

    @ObfuscatedName("aa.ap(B)V")
    public final void method1036() {
        this.field1069 = true;
    }

    @ObfuscatedName("aa.ao(I)V")
    public final synchronized void method1037() {
        this.field1069 = true;
        try {
            this.method976();
        } catch (Exception var2) {
            this.method979();
            this.field1056 = class107.method635() + 2000L;
        }
    }

    @ObfuscatedName("aa.ai(B)V")
    public final synchronized void method1038() {
        if (Statics.field1075 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1075.field1228[var2] == this) {
                    Statics.field1075.field1228[var2] = null;
                }
                if (Statics.field1075.field1228[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1075.field1229 = true;
                while (Statics.field1075.field1227) {
                    class119.method837(50L);
                }
                Statics.field1075 = null;
            }
        }
        this.method979();
        this.field1059 = null;
    }

    @ObfuscatedName("aa.aw(II)V")
    public final void method1065(int arg0) {
        this.field1072 -= arg0;
        if (this.field1072 < 0) {
            this.field1072 = 0;
        }
        if (this.field1060 != null) {
            this.field1060.method1030(arg0);
        }
    }

    @ObfuscatedName("aa.am([II)V")
    public final void method1039(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1057) {
            var3 = arg1 << 1;
        }
        class112.method2399(arg0, 0, var3);
        this.field1072 -= arg1;
        if (this.field1060 != null && this.field1072 <= 0) {
            this.field1072 += Statics.field1064 >> 4;
            method171(this.field1060);
            this.method1054(this.field1060, this.field1060.method1155());
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
                        class62 var11 = this.field1073[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1143;
                                if (var12 == null || var12.field1142 <= var8) {
                                    var11.field1146 = true;
                                    int var13 = var11.method1006();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1142 += var13;
                                    }
                                    if (var4 >= this.field1061) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1004();
                                    if (var14 != null) {
                                        int var15 = var11.field1144;
                                        while (var14 != null) {
                                            this.method1054(var14, var15 * var14.method1155() >> 8);
                                            var14 = var11.method1009();
                                        }
                                    }
                                    class62 var16 = var11.field1145;
                                    var11.field1145 = null;
                                    if (var10 == null) {
                                        this.field1073[var7] = var16;
                                    } else {
                                        var10.field1145 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1074[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1145;
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
                class62 var18 = this.field1073[var17];
                class62[] var19 = this.field1073;
                this.field1074[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1145;
                    var18.field1145 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1072 < 0) {
            this.field1072 = 0;
        }
        if (this.field1060 != null) {
            this.field1060.method1007(arg0, 0, arg1);
        }
        this.field1058 = class107.method635();
    }

    @ObfuscatedName("j.au(Lbu;B)V")
    public static final void method171(class62 arg0) {
        arg0.field1146 = false;
        if (arg0.field1143 != null) {
            arg0.field1143.field1142 = 0;
        }
        for (class62 var1 = arg0.method1004(); var1 != null; var1 = arg0.method1009()) {
            method171(var1);
        }
    }

    @ObfuscatedName("aa.ae(Lbu;IB)V")
    public final void method1054(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1074[var3];
        if (var4 == null) {
            this.field1073[var3] = arg0;
        } else {
            var4.field1145 = arg0;
        }
        this.field1074[var3] = arg0;
        arg0.field1144 = arg1;
    }

    @ObfuscatedName("aa.e(Ljava/awt/Component;)V")
    public void method975(Component arg0) throws Exception {
    }

    @ObfuscatedName("aa.a(I)V")
    public void method990(int arg0) throws Exception {
    }

    @ObfuscatedName("aa.l()I")
    public int method977() throws Exception {
        return this.field1063;
    }

    @ObfuscatedName("aa.c()V")
    public void method995() throws Exception {
    }

    @ObfuscatedName("aa.u()V")
    public void method979() {
    }

    @ObfuscatedName("aa.w()V")
    public void method976() throws Exception {
    }
}
