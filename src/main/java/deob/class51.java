package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class51 {

    @ObfuscatedName("at.w")
    public int[] field1085;

    @ObfuscatedName("at.z")
    public class47 field1086;

    @ObfuscatedName("at.e")
    public int field1087 = 32;

    @ObfuscatedName("at.b")
    public long field1088 = class120.method2609();

    @ObfuscatedName("at.c")
    public int field1089;

    @ObfuscatedName("at.d")
    public int field1090;

    @ObfuscatedName("at.h")
    public int field1081;

    @ObfuscatedName("at.i")
    public long field1092 = 0L;

    @ObfuscatedName("at.v")
    public int field1082 = 0;

    @ObfuscatedName("at.s")
    public int field1094 = 0;

    @ObfuscatedName("at.f")
    public int field1095 = 0;

    @ObfuscatedName("at.y")
    public long field1096 = 0L;

    @ObfuscatedName("at.t")
    public boolean field1097 = true;

    @ObfuscatedName("at.af")
    public int field1099 = 0;

    @ObfuscatedName("at.al")
    public class47[] field1100 = new class47[8];

    @ObfuscatedName("at.av")
    public class47[] field1093 = new class47[8];

    @ObfuscatedName("cw.o(Lbz;Ljava/awt/Component;III)Lat;")
    public static final class51 method1629(class73 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1083 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class50 var4 = new class50();
                var4.field1085 = new int[(Statics.field1091 ? 2 : 1) * 256];
                var4.field1090 = arg3;
                var4.method921(arg1);
                var4.field1089 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1089 > 16384) {
                    var4.field1089 = 16384;
                }
                var4.method918(var4.field1089);
                if (Statics.field1102 > 0 && Statics.field2451 == null) {
                    Statics.field2451 = new class54();
                    Statics.field2451.field1170 = arg0;
                    arg0.method1483(Statics.field2451, Statics.field1102);
                }
                if (Statics.field2451 != null) {
                    if (Statics.field2451.field1167[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2451.field1167[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class43 var6 = new class43(arg0, arg2);
                    var6.field1085 = new int[(Statics.field1091 ? 2 : 1) * 256];
                    var6.field1090 = arg3;
                    var6.method921(arg1);
                    var6.field1089 = 16384;
                    var6.method918(var6.field1089);
                    if (Statics.field1102 > 0 && Statics.field2451 == null) {
                        Statics.field2451 = new class54();
                        Statics.field2451.field1170 = arg0;
                        arg0.method1483(Statics.field2451, Statics.field1102);
                    }
                    if (Statics.field2451 != null) {
                        if (Statics.field2451.field1167[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2451.field1167[arg2] = var6;
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

    @ObfuscatedName("at.ax(Lac;I)V")
    public final synchronized void method1136(class47 arg0) {
        this.field1086 = arg0;
    }

    @ObfuscatedName("at.aa(I)V")
    public final synchronized void method1137() {
        if (this.field1085 == null) {
            return;
        }
        long var1 = class120.method2609();
        try {
            if (this.field1092 != 0L) {
                if (var1 < this.field1092) {
                    return;
                }
                this.method918(this.field1089);
                this.field1092 = 0L;
                this.field1097 = true;
            }
            int var3 = this.method919();
            if (this.field1095 - var3 > this.field1082) {
                this.field1082 = this.field1095 - var3;
            }
            int var4 = this.field1090 + this.field1081;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1089) {
                this.field1089 += 1024;
                if (this.field1089 > 16384) {
                    this.field1089 = 16384;
                }
                this.method939();
                this.method918(this.field1089);
                var3 = 0;
                this.field1097 = true;
                if (var4 + 256 > this.field1089) {
                    var4 = this.field1089 - 256;
                    this.field1081 = var4 - this.field1090;
                }
            }
            while (var3 < var4) {
                this.method1141(this.field1085, 256);
                this.method920();
                var3 += 256;
            }
            if (var1 > this.field1096) {
                if (this.field1097) {
                    this.field1097 = false;
                } else if (this.field1082 == 0 && this.field1094 == 0) {
                    this.method939();
                    this.field1092 = var1 + 2000L;
                    return;
                } else {
                    this.field1081 = Math.min(this.field1094, this.field1082);
                    this.field1094 = this.field1082;
                }
                this.field1082 = 0;
                this.field1096 = var1 + 2000L;
            }
            this.field1095 = var3;
        } catch (Exception var8) {
            this.method939();
            this.field1092 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1088 + 500000L) {
                var1 = this.field1088;
            }
            while (var1 > this.field1088 + 5000L) {
                this.method1140(256);
                this.field1088 += (long) (256000 / Statics.field1083);
            }
        } catch (Exception var7) {
            this.field1088 = var1;
        }
    }

    @ObfuscatedName("at.af(I)V")
    public final void method1138() {
        this.field1097 = true;
    }

    @ObfuscatedName("at.al(I)V")
    public final synchronized void method1139() {
        this.field1097 = true;
        try {
            this.method930();
        } catch (Exception var2) {
            this.method939();
            this.field1092 = class120.method2609() + 2000L;
        }
    }

    @ObfuscatedName("at.av(B)V")
    public final synchronized void method1148() {
        if (Statics.field2451 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2451.field1167[var2] == this) {
                    Statics.field2451.field1167[var2] = null;
                }
                if (Statics.field2451.field1167[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2451.field1166 = true;
                while (Statics.field2451.field1164) {
                    class125.method1228(50L);
                }
                Statics.field2451 = null;
            }
        }
        this.method939();
        this.field1085 = null;
    }

    @ObfuscatedName("at.ab(II)V")
    public final void method1140(int arg0) {
        this.field1099 -= arg0;
        if (this.field1099 < 0) {
            this.field1099 = 0;
        }
        if (this.field1086 != null) {
            this.field1086.method968(arg0);
        }
    }

    @ObfuscatedName("at.ad([II)V")
    public final void method1141(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1091) {
            var3 = arg1 << 1;
        }
        class127.method2654(arg0, 0, var3);
        this.field1099 -= arg1;
        if (this.field1086 != null && this.field1099 <= 0) {
            this.field1099 += Statics.field1083 >> 4;
            method2685(this.field1086);
            this.method1143(this.field1086, this.field1086.method969());
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
                        class47 var11 = this.field1100[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class46 var12 = var11.field1059;
                                if (var12 == null || var12.field1056 <= var8) {
                                    var11.field1057 = true;
                                    int var13 = var11.method1056();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1056 += var13;
                                    }
                                    if (var4 >= this.field1087) {
                                        break label105;
                                    }
                                    class47 var14 = var11.method964();
                                    if (var14 != null) {
                                        int var15 = var11.field1058;
                                        while (var14 != null) {
                                            this.method1143(var14, var15 * var14.method969() >> 8);
                                            var14 = var11.method970();
                                        }
                                    }
                                    class47 var16 = var11.field1060;
                                    var11.field1060 = null;
                                    if (var10 == null) {
                                        this.field1100[var7] = var16;
                                    } else {
                                        var10.field1060 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1093[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1060;
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
                class47 var18 = this.field1100[var17];
                class47[] var19 = this.field1100;
                this.field1093[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class47 var21 = var18.field1060;
                    var18.field1060 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1099 < 0) {
            this.field1099 = 0;
        }
        if (this.field1086 != null) {
            this.field1086.method1066(arg0, 0, arg1);
        }
        this.field1088 = class120.method2609();
    }

    @ObfuscatedName("eq.ai(Lac;B)V")
    public static final void method2685(class47 arg0) {
        arg0.field1057 = false;
        if (arg0.field1059 != null) {
            arg0.field1059.field1056 = 0;
        }
        for (class47 var1 = arg0.method964(); var1 != null; var1 = arg0.method970()) {
            method2685(var1);
        }
    }

    @ObfuscatedName("at.ak(Lac;II)V")
    public final void method1143(class47 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class47 var4 = this.field1093[var3];
        if (var4 == null) {
            this.field1100[var3] = arg0;
        } else {
            var4.field1060 = arg0;
        }
        this.field1093[var3] = arg0;
        arg0.field1058 = arg1;
    }

    @ObfuscatedName("at.u(Ljava/awt/Component;)V")
    public void method921(Component arg0) throws Exception {
    }

    @ObfuscatedName("at.k(I)V")
    public void method918(int arg0) throws Exception {
    }

    @ObfuscatedName("at.x()I")
    public int method919() throws Exception {
        return this.field1089;
    }

    @ObfuscatedName("at.m()V")
    public void method920() throws Exception {
    }

    @ObfuscatedName("at.n()V")
    public void method939() {
    }

    @ObfuscatedName("at.q()V")
    public void method930() throws Exception {
    }
}
