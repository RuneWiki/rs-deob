package deob;

import java.awt.Component;

@ObfuscatedName("ap")
public class class51 {

    @ObfuscatedName("ap.n")
    public int[] field1087;

    @ObfuscatedName("ap.s")
    public class61 field1088;

    @ObfuscatedName("ap.k")
    public int field1100 = 32;

    @ObfuscatedName("ap.f")
    public long field1094 = class106.method2471();

    @ObfuscatedName("ap.d")
    public int field1091;

    @ObfuscatedName("ap.x")
    public int field1098;

    @ObfuscatedName("ap.o")
    public int field1097;

    @ObfuscatedName("ap.q")
    public long field1093 = 0L;

    @ObfuscatedName("ap.t")
    public int field1095 = 0;

    @ObfuscatedName("ap.h")
    public int field1096 = 0;

    @ObfuscatedName("ap.u")
    public int field1085 = 0;

    @ObfuscatedName("ap.j")
    public long field1090 = 0L;

    @ObfuscatedName("ap.g")
    public boolean field1099 = true;

    @ObfuscatedName("ap.an")
    public int field1101 = 0;

    @ObfuscatedName("ap.as")
    public class61[] field1102 = new class61[8];

    @ObfuscatedName("ap.ah")
    public class61[] field1103 = new class61[8];

    @ObfuscatedName("gy.g(IZII)V")
    public static final void method3356(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1084 = arg0;
        Statics.field1083 = arg1;
        Statics.field1082 = arg2;
    }

    @ObfuscatedName("o.y(Ldb;Ljava/awt/Component;IIB)Lap;")
    public static final class51 method171(class127 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1084 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1087 = new int[(Statics.field1083 ? 2 : 1) * 256];
                var4.field1098 = arg3;
                var4.method966(arg1);
                var4.field1091 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1091 > 16384) {
                    var4.field1091 = 16384;
                }
                var4.method949(var4.field1091);
                if (Statics.field1082 > 0 && Statics.field1092 == null) {
                    Statics.field1092 = new class67();
                    Statics.field1092.field1256 = arg0;
                    arg0.method2481(Statics.field1092, Statics.field1082);
                }
                if (Statics.field1092 != null) {
                    if (Statics.field1092.field1257[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1092.field1257[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1087 = new int[256 * (Statics.field1083 ? 2 : 1)];
                    var6.field1098 = arg3;
                    var6.method966(arg1);
                    var6.field1091 = 16384;
                    var6.method949(var6.field1091);
                    if (Statics.field1082 > 0 && Statics.field1092 == null) {
                        Statics.field1092 = new class67();
                        Statics.field1092.field1256 = arg0;
                        arg0.method2481(Statics.field1092, Statics.field1082);
                    }
                    if (Statics.field1092 != null) {
                        if (Statics.field1092.field1257[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1092.field1257[arg2] = var6;
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

    @ObfuscatedName("ap.p(Lbz;I)V")
    public final synchronized void method1004(class61 arg0) {
        this.field1088 = arg0;
    }

    @ObfuscatedName("ap.r(B)V")
    public final synchronized void method1005() {
        if (this.field1087 == null) {
            return;
        }
        long var1 = class106.method2471();
        try {
            if (this.field1093 != 0L) {
                if (var1 < this.field1093) {
                    return;
                }
                this.method949(this.field1091);
                this.field1093 = 0L;
                this.field1099 = true;
            }
            int var3 = this.method947();
            if (this.field1085 - var3 > this.field1095) {
                this.field1095 = this.field1085 - var3;
            }
            int var4 = this.field1098 + this.field1097;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1091) {
                this.field1091 += 1024;
                if (this.field1091 > 16384) {
                    this.field1091 = 16384;
                }
                this.method955();
                this.method949(this.field1091);
                var3 = 0;
                this.field1099 = true;
                if (var4 + 256 > this.field1091) {
                    var4 = this.field1091 - 256;
                    this.field1097 = var4 - this.field1098;
                }
            }
            while (var3 < var4) {
                this.method1032(this.field1087, 256);
                this.method950();
                var3 += 256;
            }
            if (var1 > this.field1090) {
                if (this.field1099) {
                    this.field1099 = false;
                } else if (this.field1095 == 0 && this.field1096 == 0) {
                    this.method955();
                    this.field1093 = var1 + 2000L;
                    return;
                } else {
                    this.field1097 = Math.min(this.field1096, this.field1095);
                    this.field1096 = this.field1095;
                }
                this.field1095 = 0;
                this.field1090 = var1 + 2000L;
            }
            this.field1085 = var3;
        } catch (Exception var8) {
            this.method955();
            this.field1093 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1094 + 500000L) {
                var1 = this.field1094;
            }
            while (var1 > this.field1094 + 5000L) {
                this.method1008(256);
                this.field1094 += (long) (256000 / Statics.field1084);
            }
        } catch (Exception var7) {
            this.field1094 = var1;
        }
    }

    @ObfuscatedName("ap.z(I)V")
    public final void method1014() {
        this.field1099 = true;
    }

    @ObfuscatedName("ap.c(S)V")
    public final synchronized void method1006() {
        this.field1099 = true;
        try {
            this.method952();
        } catch (Exception var2) {
            this.method955();
            this.field1093 = class106.method2471() + 2000L;
        }
    }

    @ObfuscatedName("ap.an(I)V")
    public final synchronized void method1007() {
        if (Statics.field1092 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1092.field1257[var2] == this) {
                    Statics.field1092.field1257[var2] = null;
                }
                if (Statics.field1092.field1257[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1092.field1258 = true;
                while (Statics.field1092.field1259) {
                    class118.method2072(50L);
                }
                Statics.field1092 = null;
            }
        }
        this.method955();
        this.field1087 = null;
    }

    @ObfuscatedName("ap.as(IS)V")
    public final void method1008(int arg0) {
        this.field1101 -= arg0;
        if (this.field1101 < 0) {
            this.field1101 = 0;
        }
        if (this.field1088 != null) {
            this.field1088.method977(arg0);
        }
    }

    @ObfuscatedName("ap.ah([II)V")
    public final void method1032(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1083) {
            var3 = arg1 << 1;
        }
        class111.method2350(arg0, 0, var3);
        this.field1101 -= arg1;
        if (this.field1088 != null && this.field1101 <= 0) {
            this.field1101 += Statics.field1084 >> 4;
            method533(this.field1088);
            this.method1010(this.field1088, this.field1088.method1204());
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
                        class61 var10 = null;
                        class61 var11 = this.field1102[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1172;
                                if (var12 == null || var12.field1171 <= var8) {
                                    var11.field1175 = true;
                                    int var13 = var11.method987();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1171 += var13;
                                    }
                                    if (var4 >= this.field1100) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method978();
                                    if (var14 != null) {
                                        int var15 = var11.field1173;
                                        while (var14 != null) {
                                            this.method1010(var14, var15 * var14.method1204() >> 8);
                                            var14 = var11.method974();
                                        }
                                    }
                                    class61 var16 = var11.field1174;
                                    var11.field1174 = null;
                                    if (var10 == null) {
                                        this.field1102[var7] = var16;
                                    } else {
                                        var10.field1174 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1103[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1174;
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
                class61 var18 = this.field1102[var17];
                class61[] var19 = this.field1102;
                this.field1103[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1174;
                    var18.field1174 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1101 < 0) {
            this.field1101 = 0;
        }
        if (this.field1088 != null) {
            this.field1088.method975(arg0, 0, arg1);
        }
        this.field1094 = class106.method2471();
    }

    @ObfuscatedName("r.ar(Lbz;I)V")
    public static final void method533(class61 arg0) {
        arg0.field1175 = false;
        if (arg0.field1172 != null) {
            arg0.field1172.field1171 = 0;
        }
        for (class61 var1 = arg0.method978(); var1 != null; var1 = arg0.method974()) {
            method533(var1);
        }
    }

    @ObfuscatedName("ap.ae(Lbz;IS)V")
    public final void method1010(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1103[var3];
        if (var4 == null) {
            this.field1102[var3] = arg0;
        } else {
            var4.field1174 = arg0;
        }
        this.field1103[var3] = arg0;
        arg0.field1173 = arg1;
    }

    @ObfuscatedName("ap.a(Ljava/awt/Component;)V")
    public void method966(Component arg0) throws Exception {
    }

    @ObfuscatedName("ap.v(I)V")
    public void method949(int arg0) throws Exception {
    }

    @ObfuscatedName("ap.i()I")
    public int method947() throws Exception {
        return this.field1091;
    }

    @ObfuscatedName("ap.b()V")
    public void method950() throws Exception {
    }

    @ObfuscatedName("ap.l()V")
    public void method955() {
    }

    @ObfuscatedName("ap.m()V")
    public void method952() throws Exception {
    }
}
