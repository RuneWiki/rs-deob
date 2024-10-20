package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class51 {

    @ObfuscatedName("at.l")
    public int[] field1073;

    @ObfuscatedName("at.o")
    public class47 field1075;

    @ObfuscatedName("at.h")
    public int field1080 = 32;

    @ObfuscatedName("at.p")
    public long field1077 = class120.method1383();

    @ObfuscatedName("at.d")
    public int field1078;

    @ObfuscatedName("at.m")
    public int field1079;

    @ObfuscatedName("at.z")
    public int field1082;

    @ObfuscatedName("at.t")
    public long field1081 = 0L;

    @ObfuscatedName("at.i")
    public int field1084 = 0;

    @ObfuscatedName("at.j")
    public int field1085 = 0;

    @ObfuscatedName("at.a")
    public int field1074 = 0;

    @ObfuscatedName("at.g")
    public long field1092 = 0L;

    @ObfuscatedName("at.x")
    public boolean field1086 = true;

    @ObfuscatedName("at.ak")
    public int field1087 = 0;

    @ObfuscatedName("at.ah")
    public class47[] field1088 = new class47[8];

    @ObfuscatedName("at.aa")
    public class47[] field1089 = new class47[8];

    @ObfuscatedName("au.az(IZIB)V")
    public static final void method550(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1076 = arg0;
        Statics.field2772 = arg1;
        Statics.field138 = arg2;
    }

    @ObfuscatedName("az.ak(Lbr;Ljava/awt/Component;IIB)Lat;")
    public static final class51 method574(class73 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1076 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class50 var4 = new class50();
                var4.field1073 = new int[(Statics.field2772 ? 2 : 1) * 256];
                var4.field1079 = arg3;
                var4.method947(arg1);
                var4.field1078 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1078 > 16384) {
                    var4.field1078 = 16384;
                }
                var4.method948(var4.field1078);
                if (Statics.field138 > 0 && Statics.field1415 == null) {
                    Statics.field1415 = new class54();
                    Statics.field1415.field1163 = arg0;
                    arg0.method1522(Statics.field1415, Statics.field138);
                }
                if (Statics.field1415 != null) {
                    if (Statics.field1415.field1156[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1415.field1156[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class43 var6 = new class43(arg0, arg2);
                    var6.field1073 = new int[256 * (Statics.field2772 ? 2 : 1)];
                    var6.field1079 = arg3;
                    var6.method947(arg1);
                    var6.field1078 = 16384;
                    var6.method948(var6.field1078);
                    if (Statics.field138 > 0 && Statics.field1415 == null) {
                        Statics.field1415 = new class54();
                        Statics.field1415.field1163 = arg0;
                        arg0.method1522(Statics.field1415, Statics.field138);
                    }
                    if (Statics.field1415 != null) {
                        if (Statics.field1415.field1156[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1415.field1156[arg2] = var6;
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

    @ObfuscatedName("at.ah(Lag;I)V")
    public final synchronized void method1174(class47 arg0) {
        this.field1075 = arg0;
    }

    @ObfuscatedName("at.aa(B)V")
    public final synchronized void method1175() {
        if (this.field1073 == null) {
            return;
        }
        long var1 = class120.method1383();
        try {
            if (this.field1081 != 0L) {
                if (var1 < this.field1081) {
                    return;
                }
                this.method948(this.field1078);
                this.field1081 = 0L;
                this.field1086 = true;
            }
            int var3 = this.method934();
            if (this.field1074 - var3 > this.field1084) {
                this.field1084 = this.field1074 - var3;
            }
            int var4 = this.field1082 + this.field1079;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1078) {
                this.field1078 += 1024;
                if (this.field1078 > 16384) {
                    this.field1078 = 16384;
                }
                this.method936();
                this.method948(this.field1078);
                var3 = 0;
                this.field1086 = true;
                if (var4 + 256 > this.field1078) {
                    var4 = this.field1078 - 256;
                    this.field1082 = var4 - this.field1079;
                }
            }
            while (var3 < var4) {
                this.method1179(this.field1073, 256);
                this.method935();
                var3 += 256;
            }
            if (var1 > this.field1092) {
                if (this.field1086) {
                    this.field1086 = false;
                } else if (this.field1084 == 0 && this.field1085 == 0) {
                    this.method936();
                    this.field1081 = var1 + 2000L;
                    return;
                } else {
                    this.field1082 = Math.min(this.field1085, this.field1084);
                    this.field1085 = this.field1084;
                }
                this.field1084 = 0;
                this.field1092 = var1 + 2000L;
            }
            this.field1074 = var3;
        } catch (Exception var8) {
            this.method936();
            this.field1081 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1077 + 500000L) {
                var1 = this.field1077;
            }
            while (var1 > this.field1077 + 5000L) {
                this.method1207(256);
                this.field1077 += (long) (256000 / Statics.field1076);
            }
        } catch (Exception var7) {
            this.field1077 = var1;
        }
    }

    @ObfuscatedName("at.am(B)V")
    public final void method1181() {
        this.field1086 = true;
    }

    @ObfuscatedName("at.al(I)V")
    public final synchronized void method1173() {
        this.field1086 = true;
        try {
            this.method933();
        } catch (Exception var2) {
            this.method936();
            this.field1081 = class120.method1383() + 2000L;
        }
    }

    @ObfuscatedName("at.ae(B)V")
    public final synchronized void method1177() {
        if (Statics.field1415 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1415.field1156[var2] == this) {
                    Statics.field1415.field1156[var2] = null;
                }
                if (Statics.field1415.field1156[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1415.field1157 = true;
                while (Statics.field1415.field1160) {
                    class125.method2683(50L);
                }
                Statics.field1415 = null;
            }
        }
        this.method936();
        this.field1073 = null;
    }

    @ObfuscatedName("at.ab(IB)V")
    public final void method1207(int arg0) {
        this.field1087 -= arg0;
        if (this.field1087 < 0) {
            this.field1087 = 0;
        }
        if (this.field1075 != null) {
            this.field1075.method986(arg0);
        }
    }

    @ObfuscatedName("at.as([II)V")
    public final void method1179(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2772) {
            var3 = arg1 << 1;
        }
        class127.method2656(arg0, 0, var3);
        this.field1087 -= arg1;
        if (this.field1075 != null && this.field1087 <= 0) {
            this.field1087 += Statics.field1076 >> 4;
            method38(this.field1075);
            this.method1180(this.field1075, this.field1075.method961());
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
                        class47 var11 = this.field1088[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class46 var12 = var11.field1050;
                                if (var12 == null || var12.field1047 <= var8) {
                                    var11.field1048 = true;
                                    int var13 = var11.method984();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1047 += var13;
                                    }
                                    if (var4 >= this.field1080) {
                                        break label105;
                                    }
                                    class47 var14 = var11.method962();
                                    if (var14 != null) {
                                        int var15 = var11.field1049;
                                        while (var14 != null) {
                                            this.method1180(var14, var15 * var14.method961() >> 8);
                                            var14 = var11.method983();
                                        }
                                    }
                                    class47 var16 = var11.field1051;
                                    var11.field1051 = null;
                                    if (var10 == null) {
                                        this.field1088[var7] = var16;
                                    } else {
                                        var10.field1051 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1089[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1051;
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
                class47 var18 = this.field1088[var17];
                class47[] var19 = this.field1088;
                this.field1089[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class47 var21 = var18.field1051;
                    var18.field1051 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1087 < 0) {
            this.field1087 = 0;
        }
        if (this.field1075 != null) {
            this.field1075.method969(arg0, 0, arg1);
        }
        this.field1077 = class120.method1383();
    }

    @ObfuscatedName("k.ai(Lag;B)V")
    public static final void method38(class47 arg0) {
        arg0.field1048 = false;
        if (arg0.field1050 != null) {
            arg0.field1050.field1047 = 0;
        }
        for (class47 var1 = arg0.method962(); var1 != null; var1 = arg0.method983()) {
            method38(var1);
        }
    }

    @ObfuscatedName("at.aj(Lag;II)V")
    public final void method1180(class47 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class47 var4 = this.field1089[var3];
        if (var4 == null) {
            this.field1088[var3] = arg0;
        } else {
            var4.field1051 = arg0;
        }
        this.field1089[var3] = arg0;
        arg0.field1049 = arg1;
    }

    @ObfuscatedName("at.v(Ljava/awt/Component;)V")
    public void method947(Component arg0) throws Exception {
    }

    @ObfuscatedName("at.f(I)V")
    public void method948(int arg0) throws Exception {
    }

    @ObfuscatedName("at.n()I")
    public int method934() throws Exception {
        return this.field1078;
    }

    @ObfuscatedName("at.c()V")
    public void method935() throws Exception {
    }

    @ObfuscatedName("at.r()V")
    public void method936() {
    }

    @ObfuscatedName("at.k()V")
    public void method933() throws Exception {
    }
}
