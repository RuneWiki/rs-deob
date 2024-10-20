package deob;

import java.awt.Component;

@ObfuscatedName("ac")
public class class51 {

    @ObfuscatedName("ac.r")
    public int[] field1091;

    @ObfuscatedName("ac.n")
    public class47 field1087;

    @ObfuscatedName("ac.b")
    public int field1079 = 32;

    @ObfuscatedName("ac.z")
    public long field1083 = class120.method774();

    @ObfuscatedName("ac.h")
    public int field1084;

    @ObfuscatedName("ac.q")
    public int field1085;

    @ObfuscatedName("ac.l")
    public int field1086;

    @ObfuscatedName("ac.t")
    public long field1076 = 0L;

    @ObfuscatedName("ac.g")
    public int field1088 = 0;

    @ObfuscatedName("ac.a")
    public int field1089 = 0;

    @ObfuscatedName("ac.v")
    public int field1081 = 0;

    @ObfuscatedName("ac.i")
    public long field1080 = 0L;

    @ObfuscatedName("ac.k")
    public boolean field1092 = true;

    @ObfuscatedName("ac.ao")
    public int field1093 = 0;

    @ObfuscatedName("ac.av")
    public class47[] field1082 = new class47[8];

    @ObfuscatedName("ac.af")
    public class47[] field1095 = new class47[8];

    @ObfuscatedName("j.v(IZIB)V")
    public static final void method10(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1090 = arg0;
        Statics.field1077 = arg1;
        Statics.field2429 = arg2;
    }

    @ObfuscatedName("w.i(Lby;Ljava/awt/Component;III)Lac;")
    public static final class51 method111(class73 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1090 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class50 var4 = new class50();
                var4.field1091 = new int[256 * (Statics.field1077 ? 2 : 1)];
                var4.field1085 = arg3;
                var4.method885(arg1);
                var4.field1084 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1084 > 16384) {
                    var4.field1084 = 16384;
                }
                var4.method886(var4.field1084);
                if (Statics.field2429 > 0 && Statics.field1908 == null) {
                    Statics.field1908 = new class54();
                    Statics.field1908.field1162 = arg0;
                    arg0.method1438(Statics.field1908, Statics.field2429);
                }
                if (Statics.field1908 != null) {
                    if (Statics.field1908.field1159[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1908.field1159[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class43 var6 = new class43(arg0, arg2);
                    var6.field1091 = new int[256 * (Statics.field1077 ? 2 : 1)];
                    var6.field1085 = arg3;
                    var6.method885(arg1);
                    var6.field1084 = 16384;
                    var6.method886(var6.field1084);
                    if (Statics.field2429 > 0 && Statics.field1908 == null) {
                        Statics.field1908 = new class54();
                        Statics.field1908.field1162 = arg0;
                        arg0.method1438(Statics.field1908, Statics.field2429);
                    }
                    if (Statics.field1908 != null) {
                        if (Statics.field1908.field1159[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1908.field1159[arg2] = var6;
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

    @ObfuscatedName("ac.k(Lau;B)V")
    public final synchronized void method1104(class47 arg0) {
        this.field1087 = arg0;
    }

    @ObfuscatedName("ac.o(B)V")
    public final synchronized void method1105() {
        if (this.field1091 == null) {
            return;
        }
        long var1 = class120.method774();
        try {
            if (this.field1076 != 0L) {
                if (var1 < this.field1076) {
                    return;
                }
                this.method886(this.field1084);
                this.field1076 = 0L;
                this.field1092 = true;
            }
            int var3 = this.method888();
            if (this.field1081 - var3 > this.field1088) {
                this.field1088 = this.field1081 - var3;
            }
            int var4 = this.field1086 + this.field1085;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1084) {
                this.field1084 += 1024;
                if (this.field1084 > 16384) {
                    this.field1084 = 16384;
                }
                this.method889();
                this.method886(this.field1084);
                var3 = 0;
                this.field1092 = true;
                if (var4 + 256 > this.field1084) {
                    var4 = this.field1084 - 256;
                    this.field1086 = var4 - this.field1085;
                }
            }
            while (var3 < var4) {
                this.method1110(this.field1091, 256);
                this.method902();
                var3 += 256;
            }
            if (var1 > this.field1080) {
                if (this.field1092) {
                    this.field1092 = false;
                } else if (this.field1088 == 0 && this.field1089 == 0) {
                    this.method889();
                    this.field1076 = var1 + 2000L;
                    return;
                } else {
                    this.field1086 = Math.min(this.field1089, this.field1088);
                    this.field1089 = this.field1088;
                }
                this.field1088 = 0;
                this.field1080 = var1 + 2000L;
            }
            this.field1081 = var3;
        } catch (Exception var8) {
            this.method889();
            this.field1076 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1083 + 500000L) {
                var1 = this.field1083;
            }
            while (var1 > this.field1083 + 5000L) {
                this.method1115(256);
                this.field1083 += (long) (256000 / Statics.field1090);
            }
        } catch (Exception var7) {
            this.field1083 = var1;
        }
    }

    @ObfuscatedName("ac.d(I)V")
    public final void method1106() {
        this.field1092 = true;
    }

    @ObfuscatedName("ac.u(I)V")
    public final synchronized void method1107() {
        this.field1092 = true;
        try {
            this.method890();
        } catch (Exception var2) {
            this.method889();
            this.field1076 = class120.method774() + 2000L;
        }
    }

    @ObfuscatedName("ac.ap(B)V")
    public final synchronized void method1108() {
        if (Statics.field1908 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1908.field1159[var2] == this) {
                    Statics.field1908.field1159[var2] = null;
                }
                if (Statics.field1908.field1159[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1908.field1160 = true;
                while (Statics.field1908.field1164) {
                    class126.method2308(50L);
                }
                Statics.field1908 = null;
            }
        }
        this.method889();
        this.field1091 = null;
    }

    @ObfuscatedName("ac.ad(II)V")
    public final void method1115(int arg0) {
        this.field1093 -= arg0;
        if (this.field1093 < 0) {
            this.field1093 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method1014(arg0);
        }
    }

    @ObfuscatedName("ac.ao([II)V")
    public final void method1110(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1077) {
            var3 = arg1 << 1;
        }
        class127.method2535(arg0, 0, var3);
        this.field1093 -= arg1;
        if (this.field1087 != null && this.field1093 <= 0) {
            this.field1093 += Statics.field1090 >> 4;
            method1273(this.field1087);
            this.method1109(this.field1087, this.field1087.method1044());
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
                        class47 var11 = this.field1082[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class46 var12 = var11.field1054;
                                if (var12 == null || var12.field1051 <= var8) {
                                    var11.field1052 = true;
                                    int var13 = var11.method928();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1051 += var13;
                                    }
                                    if (var4 >= this.field1079) {
                                        break label105;
                                    }
                                    class47 var14 = var11.method926();
                                    if (var14 != null) {
                                        int var15 = var11.field1053;
                                        while (var14 != null) {
                                            this.method1109(var14, var15 * var14.method1044() >> 8);
                                            var14 = var11.method927();
                                        }
                                    }
                                    class47 var16 = var11.field1055;
                                    var11.field1055 = null;
                                    if (var10 == null) {
                                        this.field1082[var7] = var16;
                                    } else {
                                        var10.field1055 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1095[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1055;
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
                class47 var18 = this.field1082[var17];
                class47[] var19 = this.field1082;
                this.field1095[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class47 var21 = var18.field1055;
                    var18.field1055 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1093 < 0) {
            this.field1093 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method929(arg0, 0, arg1);
        }
        this.field1083 = class120.method774();
    }

    @ObfuscatedName("br.av(Lau;I)V")
    public static final void method1273(class47 arg0) {
        arg0.field1052 = false;
        if (arg0.field1054 != null) {
            arg0.field1054.field1051 = 0;
        }
        for (class47 var1 = arg0.method926(); var1 != null; var1 = arg0.method927()) {
            method1273(var1);
        }
    }

    @ObfuscatedName("ac.af(Lau;II)V")
    public final void method1109(class47 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class47 var4 = this.field1095[var3];
        if (var4 == null) {
            this.field1082[var3] = arg0;
        } else {
            var4.field1055 = arg0;
        }
        this.field1095[var3] = arg0;
        arg0.field1053 = arg1;
    }

    @ObfuscatedName("ac.c(Ljava/awt/Component;)V")
    public void method885(Component arg0) throws Exception {
    }

    @ObfuscatedName("ac.j(I)V")
    public void method886(int arg0) throws Exception {
    }

    @ObfuscatedName("ac.f()I")
    public int method888() throws Exception {
        return this.field1084;
    }

    @ObfuscatedName("ac.y()V")
    public void method902() throws Exception {
    }

    @ObfuscatedName("ac.x()V")
    public void method889() {
    }

    @ObfuscatedName("ac.e()V")
    public void method890() throws Exception {
    }
}
