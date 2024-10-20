package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class50 {

    @ObfuscatedName("az.n")
    public int[] field1089;

    @ObfuscatedName("az.f")
    public class60 field1077;

    @ObfuscatedName("az.a")
    public int field1083 = 32;

    @ObfuscatedName("az.i")
    public long field1078 = class103.method19();

    @ObfuscatedName("az.y")
    public int field1080;

    @ObfuscatedName("az.p")
    public int field1081;

    @ObfuscatedName("az.q")
    public int field1082;

    @ObfuscatedName("az.t")
    public long field1076 = 0L;

    @ObfuscatedName("az.r")
    public int field1084 = 0;

    @ObfuscatedName("az.x")
    public int field1085 = 0;

    @ObfuscatedName("az.s")
    public int field1086 = 0;

    @ObfuscatedName("az.d")
    public long field1087 = 0L;

    @ObfuscatedName("az.m")
    public boolean field1088 = true;

    @ObfuscatedName("az.ac")
    public int field1090 = 0;

    @ObfuscatedName("az.ap")
    public class60[] field1091 = new class60[8];

    @ObfuscatedName("az.ai")
    public class60[] field1092 = new class60[8];

    @ObfuscatedName("e.ac(IZII)V")
    public static final void method84(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1074 = arg0;
        Statics.field1079 = arg1;
        Statics.field1922 = arg2;
    }

    @ObfuscatedName("bu.ap(Ldl;Ljava/awt/Component;III)Laz;")
    public static final class50 method1077(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1074 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1089 = new int[(Statics.field1079 ? 2 : 1) * 256];
                var4.field1081 = arg3;
                var4.method950(arg1);
                var4.field1080 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1080 > 16384) {
                    var4.field1080 = 16384;
                }
                var4.method951(var4.field1080);
                if (Statics.field1922 > 0 && Statics.field997 == null) {
                    Statics.field997 = new class66();
                    Statics.field997.field1245 = arg0;
                    arg0.method2472(Statics.field997, Statics.field1922);
                }
                if (Statics.field997 != null) {
                    if (Statics.field997.field1242[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field997.field1242[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1089 = new int[(Statics.field1079 ? 2 : 1) * 256];
                    var6.field1081 = arg3;
                    var6.method950(arg1);
                    var6.field1080 = 16384;
                    var6.method951(var6.field1080);
                    if (Statics.field1922 > 0 && Statics.field997 == null) {
                        Statics.field997 = new class66();
                        Statics.field997.field1245 = arg0;
                        arg0.method2472(Statics.field997, Statics.field1922);
                    }
                    if (Statics.field997 != null) {
                        if (Statics.field997.field1242[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field997.field1242[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("az.ai(Lbn;B)V")
    public final synchronized void method1015(class60 arg0) {
        this.field1077 = arg0;
    }

    @ObfuscatedName("az.as(I)V")
    public final synchronized void method1016() {
        if (this.field1089 == null) {
            return;
        }
        long var1 = class103.method19();
        try {
            if (this.field1076 != 0L) {
                if (var1 < this.field1076) {
                    return;
                }
                this.method951(this.field1080);
                this.field1076 = 0L;
                this.field1088 = true;
            }
            int var3 = this.method952();
            if (this.field1086 - var3 > this.field1084) {
                this.field1084 = this.field1086 - var3;
            }
            int var4 = this.field1082 + this.field1081;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1080) {
                this.field1080 += 1024;
                if (this.field1080 > 16384) {
                    this.field1080 = 16384;
                }
                this.method954();
                this.method951(this.field1080);
                var3 = 0;
                this.field1088 = true;
                if (var4 + 256 > this.field1080) {
                    var4 = this.field1080 - 256;
                    this.field1082 = var4 - this.field1081;
                }
            }
            while (var3 < var4) {
                this.method1027(this.field1089, 256);
                this.method949();
                var3 += 256;
            }
            if (var1 > this.field1087) {
                if (this.field1088) {
                    this.field1088 = false;
                } else if (this.field1084 == 0 && this.field1085 == 0) {
                    this.method954();
                    this.field1076 = var1 + 2000L;
                    return;
                } else {
                    this.field1082 = Math.min(this.field1085, this.field1084);
                    this.field1085 = this.field1084;
                }
                this.field1084 = 0;
                this.field1087 = var1 + 2000L;
            }
            this.field1086 = var3;
        } catch (Exception var8) {
            this.method954();
            this.field1076 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1078 + 500000L) {
                var1 = this.field1078;
            }
            while (var1 > this.field1078 + 5000L) {
                this.method1020(256);
                this.field1078 += (long) (256000 / Statics.field1074);
            }
        } catch (Exception var7) {
            this.field1078 = var1;
        }
    }

    @ObfuscatedName("az.aa(B)V")
    public final void method1017() {
        this.field1088 = true;
    }

    @ObfuscatedName("az.aq(I)V")
    public final synchronized void method1018() {
        this.field1088 = true;
        try {
            this.method956();
        } catch (Exception var2) {
            this.method954();
            this.field1076 = class103.method19() + 2000L;
        }
    }

    @ObfuscatedName("az.aw(B)V")
    public final synchronized void method1019() {
        if (Statics.field997 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field997.field1242[var2] == this) {
                    Statics.field997.field1242[var2] = null;
                }
                if (Statics.field997.field1242[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field997.field1243 = true;
                while (Statics.field997.field1244) {
                    class114.method2962(50L);
                }
                Statics.field997 = null;
            }
        }
        this.method954();
        this.field1089 = null;
    }

    @ObfuscatedName("az.am(IS)V")
    public final void method1020(int arg0) {
        this.field1090 -= arg0;
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1077 != null) {
            this.field1077.method994(arg0);
        }
    }

    @ObfuscatedName("az.av([II)V")
    public final void method1027(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1079) {
            var3 = arg1 << 1;
        }
        class108.method2331(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1077 != null && this.field1090 <= 0) {
            this.field1090 += Statics.field1074 >> 4;
            method2422(this.field1077);
            this.method1022(this.field1077, this.field1077.method1147());
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
                        class60 var10 = null;
                        class60 var11 = this.field1091[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1159;
                                if (var12 == null || var12.field1156 <= var8) {
                                    var11.field1160 = true;
                                    int var13 = var11.method983();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1156 += var13;
                                    }
                                    if (var4 >= this.field1083) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method1004();
                                    if (var14 != null) {
                                        int var15 = var11.field1157;
                                        while (var14 != null) {
                                            this.method1022(var14, var15 * var14.method1147() >> 8);
                                            var14 = var11.method998();
                                        }
                                    }
                                    class60 var16 = var11.field1158;
                                    var11.field1158 = null;
                                    if (var10 == null) {
                                        this.field1091[var7] = var16;
                                    } else {
                                        var10.field1158 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1092[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1158;
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
                class60 var18 = this.field1091[var17];
                class60[] var19 = this.field1091;
                this.field1092[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1158;
                    var18.field1158 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1077 != null) {
            this.field1077.method984(arg0, 0, arg1);
        }
        this.field1078 = class103.method19();
    }

    @ObfuscatedName("dz.an(Lbn;B)V")
    public static final void method2422(class60 arg0) {
        arg0.field1160 = false;
        if (arg0.field1159 != null) {
            arg0.field1159.field1156 = 0;
        }
        for (class60 var1 = arg0.method1004(); var1 != null; var1 = arg0.method998()) {
            method2422(var1);
        }
    }

    @ObfuscatedName("az.at(Lbn;II)V")
    public final void method1022(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1092[var3];
        if (var4 == null) {
            this.field1091[var3] = arg0;
        } else {
            var4.field1158 = arg0;
        }
        this.field1092[var3] = arg0;
        arg0.field1157 = arg1;
    }

    @ObfuscatedName("az.g(Ljava/awt/Component;)V")
    public void method950(Component arg0) throws Exception {
    }

    @ObfuscatedName("az.v(I)V")
    public void method951(int arg0) throws Exception {
    }

    @ObfuscatedName("az.z()I")
    public int method952() throws Exception {
        return this.field1080;
    }

    @ObfuscatedName("az.h()V")
    public void method949() throws Exception {
    }

    @ObfuscatedName("az.k()V")
    public void method954() {
    }

    @ObfuscatedName("az.l()V")
    public void method956() throws Exception {
    }
}
