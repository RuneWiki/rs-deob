package deob;

import java.awt.Component;

@ObfuscatedName("ac")
public class class51 {

    @ObfuscatedName("ac.t")
    public int[] field1072;

    @ObfuscatedName("ac.n")
    public class61 field1093;

    @ObfuscatedName("ac.p")
    public int field1074 = 32;

    @ObfuscatedName("ac.a")
    public long field1077 = class104.method2616();

    @ObfuscatedName("ac.o")
    public int field1076;

    @ObfuscatedName("ac.b")
    public int field1069;

    @ObfuscatedName("ac.r")
    public int field1078;

    @ObfuscatedName("ac.z")
    public long field1083 = 0L;

    @ObfuscatedName("ac.u")
    public int field1080 = 0;

    @ObfuscatedName("ac.s")
    public int field1081 = 0;

    @ObfuscatedName("ac.i")
    public int field1082 = 0;

    @ObfuscatedName("ac.e")
    public long field1073 = 0L;

    @ObfuscatedName("ac.h")
    public boolean field1084 = true;

    @ObfuscatedName("ac.ak")
    public int field1087 = 0;

    @ObfuscatedName("ac.ah")
    public class61[] field1088 = new class61[8];

    @ObfuscatedName("ac.an")
    public class61[] field1079 = new class61[8];

    @ObfuscatedName("aw.q(Ldu;Ljava/awt/Component;IIB)Lac;")
    public static final class51 method571(class125 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1086 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1072 = new int[256 * (Statics.field2900 ? 2 : 1)];
                var4.field1069 = arg3;
                var4.method925(arg1);
                var4.field1076 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1076 > 16384) {
                    var4.field1076 = 16384;
                }
                var4.method944(var4.field1076);
                if (Statics.field1070 > 0 && Statics.field2890 == null) {
                    Statics.field2890 = new class67();
                    Statics.field2890.field1244 = arg0;
                    arg0.method2497(Statics.field2890, Statics.field1070);
                }
                if (Statics.field2890 != null) {
                    if (Statics.field2890.field1250[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2890.field1250[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1072 = new int[(Statics.field2900 ? 2 : 1) * 256];
                    var6.field1069 = arg3;
                    var6.method925(arg1);
                    var6.field1076 = 16384;
                    var6.method944(var6.field1076);
                    if (Statics.field1070 > 0 && Statics.field2890 == null) {
                        Statics.field2890 = new class67();
                        Statics.field2890.field1244 = arg0;
                        arg0.method2497(Statics.field2890, Statics.field1070);
                    }
                    if (Statics.field2890 != null) {
                        if (Statics.field2890.field1250[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2890.field1250[arg2] = var6;
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

    @ObfuscatedName("ac.ak(Lbc;B)V")
    public final synchronized void method997(class61 arg0) {
        this.field1093 = arg0;
    }

    @ObfuscatedName("ac.ah(I)V")
    public final synchronized void method981() {
        if (this.field1072 == null) {
            return;
        }
        long var1 = class104.method2616();
        try {
            if (this.field1083 != 0L) {
                if (var1 < this.field1083) {
                    return;
                }
                this.method944(this.field1076);
                this.field1083 = 0L;
                this.field1084 = true;
            }
            int var3 = this.method922();
            if (this.field1082 - var3 > this.field1080) {
                this.field1080 = this.field1082 - var3;
            }
            int var4 = this.field1078 + this.field1069;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1076) {
                this.field1076 += 1024;
                if (this.field1076 > 16384) {
                    this.field1076 = 16384;
                }
                this.method926();
                this.method944(this.field1076);
                var3 = 0;
                this.field1084 = true;
                if (var4 + 256 > this.field1076) {
                    var4 = this.field1076 - 256;
                    this.field1078 = var4 - this.field1069;
                }
            }
            while (var3 < var4) {
                this.method985(this.field1072, 256);
                this.method929();
                var3 += 256;
            }
            if (var1 > this.field1073) {
                if (this.field1084) {
                    this.field1084 = false;
                } else if (this.field1080 == 0 && this.field1081 == 0) {
                    this.method926();
                    this.field1083 = var1 + 2000L;
                    return;
                } else {
                    this.field1078 = Math.min(this.field1081, this.field1080);
                    this.field1081 = this.field1080;
                }
                this.field1080 = 0;
                this.field1073 = var1 + 2000L;
            }
            this.field1082 = var3;
        } catch (Exception var8) {
            this.method926();
            this.field1083 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1077 + 500000L) {
                var1 = this.field1077;
            }
            while (var1 > this.field1077 + 5000L) {
                this.method984(256);
                this.field1077 += (long) (256000 / Statics.field1086);
            }
        } catch (Exception var7) {
            this.field1077 = var1;
        }
    }

    @ObfuscatedName("ac.an(B)V")
    public final void method1003() {
        this.field1084 = true;
    }

    @ObfuscatedName("ac.aw(I)V")
    public final synchronized void method998() {
        this.field1084 = true;
        try {
            this.method928();
        } catch (Exception var2) {
            this.method926();
            this.field1083 = class104.method2616() + 2000L;
        }
    }

    @ObfuscatedName("ac.az(I)V")
    public final synchronized void method996() {
        if (Statics.field2890 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2890.field1250[var2] == this) {
                    Statics.field2890.field1250[var2] = null;
                }
                if (Statics.field2890.field1250[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2890.field1243 = true;
                while (Statics.field2890.field1245) {
                    class116.method71(50L);
                }
                Statics.field2890 = null;
            }
        }
        this.method926();
        this.field1072 = null;
    }

    @ObfuscatedName("ac.ad(II)V")
    public final void method984(int arg0) {
        this.field1087 -= arg0;
        if (this.field1087 < 0) {
            this.field1087 = 0;
        }
        if (this.field1093 != null) {
            this.field1093.method958(arg0);
        }
    }

    @ObfuscatedName("ac.ag([II)V")
    public final void method985(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2900) {
            var3 = arg1 << 1;
        }
        class109.method2373(arg0, 0, var3);
        this.field1087 -= arg1;
        if (this.field1093 != null && this.field1087 <= 0) {
            this.field1087 += Statics.field1086 >> 4;
            method2945(this.field1093);
            this.method1012(this.field1093, this.field1093.method1106());
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
                        class61 var11 = this.field1088[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1160;
                                if (var12 == null || var12.field1158 <= var8) {
                                    var11.field1162 = true;
                                    int var13 = var11.method955();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1158 += var13;
                                    }
                                    if (var4 >= this.field1074) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method953();
                                    if (var14 != null) {
                                        int var15 = var11.field1159;
                                        while (var14 != null) {
                                            this.method1012(var14, var15 * var14.method1106() >> 8);
                                            var14 = var11.method954();
                                        }
                                    }
                                    class61 var16 = var11.field1161;
                                    var11.field1161 = null;
                                    if (var10 == null) {
                                        this.field1088[var7] = var16;
                                    } else {
                                        var10.field1161 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1079[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1161;
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
                class61 var18 = this.field1088[var17];
                class61[] var19 = this.field1088;
                this.field1079[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1161;
                    var18.field1161 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1087 < 0) {
            this.field1087 = 0;
        }
        if (this.field1093 != null) {
            this.field1093.method978(arg0, 0, arg1);
        }
        this.field1077 = class104.method2616();
    }

    @ObfuscatedName("fk.aa(Lbc;I)V")
    public static final void method2945(class61 arg0) {
        arg0.field1162 = false;
        if (arg0.field1160 != null) {
            arg0.field1160.field1158 = 0;
        }
        for (class61 var1 = arg0.method953(); var1 != null; var1 = arg0.method954()) {
            method2945(var1);
        }
    }

    @ObfuscatedName("ac.au(Lbc;II)V")
    public final void method1012(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1079[var3];
        if (var4 == null) {
            this.field1088[var3] = arg0;
        } else {
            var4.field1161 = arg0;
        }
        this.field1079[var3] = arg0;
        arg0.field1159 = arg1;
    }

    @ObfuscatedName("ac.l(Ljava/awt/Component;)V")
    public void method925(Component arg0) throws Exception {
    }

    @ObfuscatedName("ac.y(I)V")
    public void method944(int arg0) throws Exception {
    }

    @ObfuscatedName("ac.g()I")
    public int method922() throws Exception {
        return this.field1076;
    }

    @ObfuscatedName("ac.j()V")
    public void method929() throws Exception {
    }

    @ObfuscatedName("ac.w()V")
    public void method926() {
    }

    @ObfuscatedName("ac.c()V")
    public void method928() throws Exception {
    }
}
