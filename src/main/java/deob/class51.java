package deob;

import java.awt.Component;

@ObfuscatedName("ar")
public class class51 {

    @ObfuscatedName("ar.g")
    public int[] field1082;

    @ObfuscatedName("ar.v")
    public class61 field1083;

    @ObfuscatedName("ar.i")
    public int field1084 = 32;

    @ObfuscatedName("ar.x")
    public long field1089 = class104.method1388();

    @ObfuscatedName("ar.h")
    public int field1086;

    @ObfuscatedName("ar.w")
    public int field1087;

    @ObfuscatedName("ar.s")
    public int field1088;

    @ObfuscatedName("ar.p")
    public long field1091 = 0L;

    @ObfuscatedName("ar.z")
    public int field1092 = 0;

    @ObfuscatedName("ar.n")
    public int field1080 = 0;

    @ObfuscatedName("ar.u")
    public int field1097 = 0;

    @ObfuscatedName("ar.a")
    public long field1093 = 0L;

    @ObfuscatedName("ar.d")
    public boolean field1094 = true;

    @ObfuscatedName("ar.at")
    public int field1090 = 0;

    @ObfuscatedName("ar.ag")
    public class61[] field1085 = new class61[8];

    @ObfuscatedName("ar.ae")
    public class61[] field1098 = new class61[8];

    @ObfuscatedName("dg.o(Ldw;Ljava/awt/Component;III)Lar;")
    public static final class51 method2493(class125 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1814 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class64 var4 = new class64();
                var4.field1082 = new int[256 * (Statics.field1099 ? 2 : 1)];
                var4.field1087 = arg3;
                var4.method941(arg1);
                var4.field1086 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1086 > 16384) {
                    var4.field1086 = 16384;
                }
                var4.method932(var4.field1086);
                if (Statics.field1079 > 0 && Statics.field2680 == null) {
                    Statics.field2680 = new class67();
                    Statics.field2680.field1250 = arg0;
                    arg0.method2500(Statics.field2680, Statics.field1079);
                }
                if (Statics.field2680 != null) {
                    if (Statics.field2680.field1247[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2680.field1247[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class49 var6 = new class49(arg0, arg2);
                    var6.field1082 = new int[256 * (Statics.field1099 ? 2 : 1)];
                    var6.field1087 = arg3;
                    var6.method941(arg1);
                    var6.field1086 = 16384;
                    var6.method932(var6.field1086);
                    if (Statics.field1079 > 0 && Statics.field2680 == null) {
                        Statics.field2680 = new class67();
                        Statics.field2680.field1250 = arg0;
                        arg0.method2500(Statics.field2680, Statics.field1079);
                    }
                    if (Statics.field2680 != null) {
                        if (Statics.field2680.field1247[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2680.field1247[arg2] = var6;
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

    @ObfuscatedName("ar.at(Lbr;B)V")
    public final synchronized void method1033(class61 arg0) {
        this.field1083 = arg0;
    }

    @ObfuscatedName("ar.ag(I)V")
    public final synchronized void method1005() {
        if (this.field1082 == null) {
            return;
        }
        long var1 = class104.method1388();
        try {
            if (this.field1091 != 0L) {
                if (var1 < this.field1091) {
                    return;
                }
                this.method932(this.field1086);
                this.field1091 = 0L;
                this.field1094 = true;
            }
            int var3 = this.method953();
            if (this.field1097 - var3 > this.field1092) {
                this.field1092 = this.field1097 - var3;
            }
            int var4 = this.field1088 + this.field1087;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1086) {
                this.field1086 += 1024;
                if (this.field1086 > 16384) {
                    this.field1086 = 16384;
                }
                this.method940();
                this.method932(this.field1086);
                var3 = 0;
                this.field1094 = true;
                if (var4 + 256 > this.field1086) {
                    var4 = this.field1086 - 256;
                    this.field1088 = var4 - this.field1087;
                }
            }
            while (var3 < var4) {
                this.method1037(this.field1082, 256);
                this.method934();
                var3 += 256;
            }
            if (var1 > this.field1093) {
                if (this.field1094) {
                    this.field1094 = false;
                } else if (this.field1092 == 0 && this.field1080 == 0) {
                    this.method940();
                    this.field1091 = var1 + 2000L;
                    return;
                } else {
                    this.field1088 = Math.min(this.field1080, this.field1092);
                    this.field1080 = this.field1092;
                }
                this.field1092 = 0;
                this.field1093 = var1 + 2000L;
            }
            this.field1097 = var3;
        } catch (Exception var8) {
            this.method940();
            this.field1091 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1089 + 500000L) {
                var1 = this.field1089;
            }
            while (var1 > this.field1089 + 5000L) {
                this.method1009(256);
                this.field1089 += (long) (256000 / Statics.field1814);
            }
        } catch (Exception var7) {
            this.field1089 = var1;
        }
    }

    @ObfuscatedName("ar.ae(B)V")
    public final void method1003() {
        this.field1094 = true;
    }

    @ObfuscatedName("ar.ak(I)V")
    public final synchronized void method1006() {
        this.field1094 = true;
        try {
            this.method933();
        } catch (Exception var2) {
            this.method940();
            this.field1091 = class104.method1388() + 2000L;
        }
    }

    @ObfuscatedName("ar.ap(I)V")
    public final synchronized void method1007() {
        if (Statics.field2680 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2680.field1247[var2] == this) {
                    Statics.field2680.field1247[var2] = null;
                }
                if (Statics.field2680.field1247[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2680.field1248 = true;
                while (Statics.field2680.field1249) {
                    class116.method2713(50L);
                }
                Statics.field2680 = null;
            }
        }
        this.method940();
        this.field1082 = null;
    }

    @ObfuscatedName("ar.ao(II)V")
    public final void method1009(int arg0) {
        this.field1090 -= arg0;
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1083 != null) {
            this.field1083.method964(arg0);
        }
    }

    @ObfuscatedName("ar.ac([II)V")
    public final void method1037(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1099) {
            var3 = arg1 << 1;
        }
        class109.method2370(arg0, 0, var3);
        this.field1090 -= arg1;
        if (this.field1083 != null && this.field1090 <= 0) {
            this.field1090 += Statics.field1814 >> 4;
            method472(this.field1083);
            this.method1010(this.field1083, this.field1083.method1126());
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
                        class61 var11 = this.field1085[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class60 var12 = var11.field1164;
                                if (var12 == null || var12.field1161 <= var8) {
                                    var11.field1163 = true;
                                    int var13 = var11.method963();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1161 += var13;
                                    }
                                    if (var4 >= this.field1084) {
                                        break label105;
                                    }
                                    class61 var14 = var11.method961();
                                    if (var14 != null) {
                                        int var15 = var11.field1165;
                                        while (var14 != null) {
                                            this.method1010(var14, var15 * var14.method1126() >> 8);
                                            var14 = var11.method962();
                                        }
                                    }
                                    class61 var16 = var11.field1162;
                                    var11.field1162 = null;
                                    if (var10 == null) {
                                        this.field1085[var7] = var16;
                                    } else {
                                        var10.field1162 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1098[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1162;
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
                class61 var18 = this.field1085[var17];
                class61[] var19 = this.field1085;
                this.field1098[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class61 var21 = var18.field1162;
                    var18.field1162 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1090 < 0) {
            this.field1090 = 0;
        }
        if (this.field1083 != null) {
            this.field1083.method986(arg0, 0, arg1);
        }
        this.field1089 = class104.method1388();
    }

    @ObfuscatedName("u.as(Lbr;I)V")
    public static final void method472(class61 arg0) {
        arg0.field1163 = false;
        if (arg0.field1164 != null) {
            arg0.field1164.field1161 = 0;
        }
        for (class61 var1 = arg0.method961(); var1 != null; var1 = arg0.method962()) {
            method472(var1);
        }
    }

    @ObfuscatedName("ar.ai(Lbr;II)V")
    public final void method1010(class61 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class61 var4 = this.field1098[var3];
        if (var4 == null) {
            this.field1085[var3] = arg0;
        } else {
            var4.field1162 = arg0;
        }
        this.field1098[var3] = arg0;
        arg0.field1165 = arg1;
    }

    @ObfuscatedName("ar.c(Ljava/awt/Component;)V")
    public void method941(Component arg0) throws Exception {
    }

    @ObfuscatedName("ar.j(I)V")
    public void method932(int arg0) throws Exception {
    }

    @ObfuscatedName("ar.y()I")
    public int method953() throws Exception {
        return this.field1086;
    }

    @ObfuscatedName("ar.r()V")
    public void method934() throws Exception {
    }

    @ObfuscatedName("ar.f()V")
    public void method940() {
    }

    @ObfuscatedName("ar.l()V")
    public void method933() throws Exception {
    }
}
