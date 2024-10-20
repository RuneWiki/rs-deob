package deob;

import java.awt.Component;

@ObfuscatedName("aq")
public class class51 {

    @ObfuscatedName("aq.o")
    public int[] field1092;

    @ObfuscatedName("aq.b")
    public class47 field1093;

    @ObfuscatedName("aq.d")
    public int field1100 = 32;

    @ObfuscatedName("aq.k")
    public long field1095 = class120.method228();

    @ObfuscatedName("aq.f")
    public int field1096;

    @ObfuscatedName("aq.e")
    public int field1103;

    @ObfuscatedName("aq.u")
    public int field1098;

    @ObfuscatedName("aq.n")
    public long field1099 = 0L;

    @ObfuscatedName("aq.q")
    public int field1106 = 0;

    @ObfuscatedName("aq.y")
    public int field1101 = 0;

    @ObfuscatedName("aq.a")
    public int field1102 = 0;

    @ObfuscatedName("aq.r")
    public long field1094 = 0L;

    @ObfuscatedName("aq.x")
    public boolean field1104 = true;

    @ObfuscatedName("aq.ar")
    public int field1097 = 0;

    @ObfuscatedName("aq.aj")
    public class47[] field1111 = new class47[8];

    @ObfuscatedName("aq.ad")
    public class47[] field1107 = new class47[8];

    @ObfuscatedName("i.j(IZII)V")
    public static final void method31(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2409 = arg0;
        Statics.field955 = arg1;
        Statics.field1105 = arg2;
    }

    @ObfuscatedName("bd.s(Lbb;Ljava/awt/Component;III)Laq;")
    public static final class51 method1355(class73 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2409 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class50 var4 = new class50();
                var4.field1092 = new int[(Statics.field955 ? 2 : 1) * 256];
                var4.field1103 = arg3;
                var4.method916(arg1);
                var4.field1096 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1096 > 16384) {
                    var4.field1096 = 16384;
                }
                var4.method917(var4.field1096);
                if (Statics.field1105 > 0 && Statics.field118 == null) {
                    Statics.field118 = new class54();
                    Statics.field118.field1172 = arg0;
                    arg0.method1475(Statics.field118, Statics.field1105);
                }
                if (Statics.field118 != null) {
                    if (Statics.field118.field1173[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field118.field1173[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class43 var6 = new class43(arg0, arg2);
                    var6.field1092 = new int[256 * (Statics.field955 ? 2 : 1)];
                    var6.field1103 = arg3;
                    var6.method916(arg1);
                    var6.field1096 = 16384;
                    var6.method917(var6.field1096);
                    if (Statics.field1105 > 0 && Statics.field118 == null) {
                        Statics.field118 = new class54();
                        Statics.field118.field1172 = arg0;
                        arg0.method1475(Statics.field118, Statics.field1105);
                    }
                    if (Statics.field118 != null) {
                        if (Statics.field118.field1173[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field118.field1173[arg2] = var6;
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

    @ObfuscatedName("aq.au(Laa;I)V")
    public final synchronized void method1165(class47 arg0) {
        this.field1093 = arg0;
    }

    @ObfuscatedName("aq.ay(B)V")
    public final synchronized void method1151() {
        if (this.field1092 == null) {
            return;
        }
        long var1 = class120.method228();
        try {
            if (this.field1099 != 0L) {
                if (var1 < this.field1099) {
                    return;
                }
                this.method917(this.field1096);
                this.field1099 = 0L;
                this.field1104 = true;
            }
            int var3 = this.method918();
            if (this.field1102 - var3 > this.field1106) {
                this.field1106 = this.field1102 - var3;
            }
            int var4 = this.field1103 + this.field1098;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1096) {
                this.field1096 += 1024;
                if (this.field1096 > 16384) {
                    this.field1096 = 16384;
                }
                this.method923();
                this.method917(this.field1096);
                var3 = 0;
                this.field1104 = true;
                if (var4 + 256 > this.field1096) {
                    var4 = this.field1096 - 256;
                    this.field1098 = var4 - this.field1103;
                }
            }
            while (var3 < var4) {
                this.method1155(this.field1092, 256);
                this.method932();
                var3 += 256;
            }
            if (var1 > this.field1094) {
                if (this.field1104) {
                    this.field1104 = false;
                } else if (this.field1106 == 0 && this.field1101 == 0) {
                    this.method923();
                    this.field1099 = var1 + 2000L;
                    return;
                } else {
                    this.field1098 = Math.min(this.field1101, this.field1106);
                    this.field1101 = this.field1106;
                }
                this.field1106 = 0;
                this.field1094 = var1 + 2000L;
            }
            this.field1102 = var3;
        } catch (Exception var8) {
            this.method923();
            this.field1099 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1095 + 500000L) {
                var1 = this.field1095;
            }
            while (var1 > this.field1095 + 5000L) {
                this.method1175(256);
                this.field1095 += (long) (256000 / Statics.field2409);
            }
        } catch (Exception var7) {
            this.field1095 = var1;
        }
    }

    @ObfuscatedName("aq.ar(I)V")
    public final void method1152() {
        this.field1104 = true;
    }

    @ObfuscatedName("aq.aj(I)V")
    public final synchronized void method1153() {
        this.field1104 = true;
        try {
            this.method921();
        } catch (Exception var2) {
            this.method923();
            this.field1099 = class120.method228() + 2000L;
        }
    }

    @ObfuscatedName("aq.ad(I)V")
    public final synchronized void method1159() {
        if (Statics.field118 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field118.field1173[var2] == this) {
                    Statics.field118.field1173[var2] = null;
                }
                if (Statics.field118.field1173[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field118.field1174 = true;
                while (Statics.field118.field1178) {
                    class125.method2379(50L);
                }
                Statics.field118 = null;
            }
        }
        this.method923();
        this.field1092 = null;
    }

    @ObfuscatedName("aq.at(IB)V")
    public final void method1175(int arg0) {
        this.field1097 -= arg0;
        if (this.field1097 < 0) {
            this.field1097 = 0;
        }
        if (this.field1093 != null) {
            this.field1093.method965(arg0);
        }
    }

    @ObfuscatedName("aq.as([II)V")
    public final void method1155(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field955) {
            var3 = arg1 << 1;
        }
        class127.method2639(arg0, 0, var3);
        this.field1097 -= arg1;
        if (this.field1093 != null && this.field1097 <= 0) {
            this.field1097 += Statics.field2409 >> 4;
            method24(this.field1093);
            this.method1158(this.field1093, this.field1093.method941());
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
                        class47 var10 = null;
                        class47 var11 = this.field1111[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class46 var12 = var11.field1069;
                                if (var12 == null || var12.field1066 <= var8) {
                                    var11.field1068 = true;
                                    int var13 = var11.method963();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1066 += var13;
                                    }
                                    if (var4 >= this.field1100) {
                                        break label105;
                                    }
                                    class47 var14 = var11.method987();
                                    if (var14 != null) {
                                        int var15 = var11.field1067;
                                        while (var14 != null) {
                                            this.method1158(var14, var15 * var14.method941() >> 8);
                                            var14 = var11.method962();
                                        }
                                    }
                                    class47 var16 = var11.field1070;
                                    var11.field1070 = null;
                                    if (var10 == null) {
                                        this.field1111[var7] = var16;
                                    } else {
                                        var10.field1070 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1107[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1070;
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
                class47 var18 = this.field1111[var17];
                class47[] var19 = this.field1111;
                this.field1107[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class47 var21 = var18.field1070;
                    var18.field1070 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1097 < 0) {
            this.field1097 = 0;
        }
        if (this.field1093 != null) {
            this.field1093.method976(arg0, 0, arg1);
        }
        this.field1095 = class120.method228();
    }

    @ObfuscatedName("c.aw(Laa;I)V")
    public static final void method24(class47 arg0) {
        arg0.field1068 = false;
        if (arg0.field1069 != null) {
            arg0.field1069.field1066 = 0;
        }
        for (class47 var1 = arg0.method987(); var1 != null; var1 = arg0.method962()) {
            method24(var1);
        }
    }

    @ObfuscatedName("aq.ax(Laa;IB)V")
    public final void method1158(class47 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class47 var4 = this.field1107[var3];
        if (var4 == null) {
            this.field1111[var3] = arg0;
        } else {
            var4.field1070 = arg0;
        }
        this.field1107[var3] = arg0;
        arg0.field1067 = arg1;
    }

    @ObfuscatedName("aq.z(Ljava/awt/Component;)V")
    public void method916(Component arg0) throws Exception {
    }

    @ObfuscatedName("aq.h(I)V")
    public void method917(int arg0) throws Exception {
    }

    @ObfuscatedName("aq.c()I")
    public int method918() throws Exception {
        return this.field1096;
    }

    @ObfuscatedName("aq.p()V")
    public void method932() throws Exception {
    }

    @ObfuscatedName("aq.i()V")
    public void method923() {
    }

    @ObfuscatedName("aq.v()V")
    public void method921() throws Exception {
    }
}
