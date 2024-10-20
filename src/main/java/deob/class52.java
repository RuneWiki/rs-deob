package deob;

import java.awt.Component;

@ObfuscatedName("an")
public class class52 {

    @ObfuscatedName("an.c")
    public int[] field1096;

    @ObfuscatedName("an.b")
    public class48 field1099;

    @ObfuscatedName("an.m")
    public int field1100 = 32;

    @ObfuscatedName("an.g")
    public long field1101 = class121.method2140();

    @ObfuscatedName("an.x")
    public int field1102;

    @ObfuscatedName("an.r")
    public int field1103;

    @ObfuscatedName("an.s")
    public int field1104;

    @ObfuscatedName("an.l")
    public long field1117 = 0L;

    @ObfuscatedName("an.k")
    public int field1106 = 0;

    @ObfuscatedName("an.w")
    public int field1107 = 0;

    @ObfuscatedName("an.z")
    public int field1105 = 0;

    @ObfuscatedName("an.p")
    public long field1109 = 0L;

    @ObfuscatedName("an.v")
    public boolean field1110 = true;

    @ObfuscatedName("an.ah")
    public int field1113 = 0;

    @ObfuscatedName("an.ad")
    public class48[] field1114 = new class48[8];

    @ObfuscatedName("an.ak")
    public class48[] field1118 = new class48[8];

    @ObfuscatedName("cb.v(IZIB)V")
    public static final void method2062(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field277 = arg0;
        Statics.field2015 = arg1;
        Statics.field1115 = arg2;
    }

    @ObfuscatedName("am.d(Lbn;Ljava/awt/Component;III)Lan;")
    public static final class52 method749(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field277 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1096 = new int[(Statics.field2015 ? 2 : 1) * 256];
                var4.field1103 = arg3;
                var4.method922(arg1);
                var4.field1102 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1102 > 16384) {
                    var4.field1102 = 16384;
                }
                var4.method923(var4.field1102);
                if (Statics.field1115 > 0 && Statics.field1098 == null) {
                    Statics.field1098 = new class55();
                    Statics.field1098.field1184 = arg0;
                    arg0.method1512(Statics.field1098, Statics.field1115);
                }
                if (Statics.field1098 != null) {
                    if (Statics.field1098.field1181[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1098.field1181[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1096 = new int[256 * (Statics.field2015 ? 2 : 1)];
                    var6.field1103 = arg3;
                    var6.method922(arg1);
                    var6.field1102 = 16384;
                    var6.method923(var6.field1102);
                    if (Statics.field1115 > 0 && Statics.field1098 == null) {
                        Statics.field1098 = new class55();
                        Statics.field1098.field1184 = arg0;
                        arg0.method1512(Statics.field1098, Statics.field1115);
                    }
                    if (Statics.field1098 != null) {
                        if (Statics.field1098.field1181[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1098.field1181[arg2] = var6;
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

    @ObfuscatedName("an.e(Lav;I)V")
    public final synchronized void method1155(class48 arg0) {
        this.field1099 = arg0;
    }

    @ObfuscatedName("an.y(I)V")
    public final synchronized void method1165() {
        if (this.field1096 == null) {
            return;
        }
        long var1 = class121.method2140();
        try {
            if (this.field1117 != 0L) {
                if (var1 < this.field1117) {
                    return;
                }
                this.method923(this.field1102);
                this.field1117 = 0L;
                this.field1110 = true;
            }
            int var3 = this.method934();
            if (this.field1105 - var3 > this.field1106) {
                this.field1106 = this.field1105 - var3;
            }
            int var4 = this.field1104 + this.field1103;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1102) {
                this.field1102 += 1024;
                if (this.field1102 > 16384) {
                    this.field1102 = 16384;
                }
                this.method924();
                this.method923(this.field1102);
                var3 = 0;
                this.field1110 = true;
                if (var4 + 256 > this.field1102) {
                    var4 = this.field1102 - 256;
                    this.field1104 = var4 - this.field1103;
                }
            }
            while (var3 < var4) {
                this.method1160(this.field1096, 256);
                this.method936();
                var3 += 256;
            }
            if (var1 > this.field1109) {
                if (this.field1110) {
                    this.field1110 = false;
                } else if (this.field1106 == 0 && this.field1107 == 0) {
                    this.method924();
                    this.field1117 = var1 + 2000L;
                    return;
                } else {
                    this.field1104 = Math.min(this.field1107, this.field1106);
                    this.field1107 = this.field1106;
                }
                this.field1106 = 0;
                this.field1109 = var1 + 2000L;
            }
            this.field1105 = var3;
        } catch (Exception var8) {
            this.method924();
            this.field1117 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1101 + 500000L) {
                var1 = this.field1101;
            }
            while (var1 > this.field1101 + 5000L) {
                this.method1179(256);
                this.field1101 += (long) (256000 / Statics.field277);
            }
        } catch (Exception var7) {
            this.field1101 = var1;
        }
    }

    @ObfuscatedName("an.aw(I)V")
    public final void method1156() {
        this.field1110 = true;
    }

    @ObfuscatedName("an.ai(I)V")
    public final synchronized void method1157() {
        this.field1110 = true;
        try {
            this.method927();
        } catch (Exception var2) {
            this.method924();
            this.field1117 = class121.method2140() + 2000L;
        }
    }

    @ObfuscatedName("an.ah(I)V")
    public final synchronized void method1158() {
        if (Statics.field1098 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1098.field1181[var2] == this) {
                    Statics.field1098.field1181[var2] = null;
                }
                if (Statics.field1098.field1181[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1098.field1180 = true;
                while (Statics.field1098.field1183) {
                    class126.method768(50L);
                }
                Statics.field1098 = null;
            }
        }
        this.method924();
        this.field1096 = null;
    }

    @ObfuscatedName("an.ad(II)V")
    public final void method1179(int arg0) {
        this.field1113 -= arg0;
        if (this.field1113 < 0) {
            this.field1113 = 0;
        }
        if (this.field1099 != null) {
            this.field1099.method969(arg0);
        }
    }

    @ObfuscatedName("an.ak([II)V")
    public final void method1160(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2015) {
            var3 = arg1 << 1;
        }
        class128.method2661(arg0, 0, var3);
        this.field1113 -= arg1;
        if (this.field1099 != null && this.field1113 <= 0) {
            this.field1113 += Statics.field277 >> 4;
            Statics.method2771(this.field1099);
            this.method1174(this.field1099, this.field1099.method945());
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
                        class48 var10 = null;
                        class48 var11 = this.field1114[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1075;
                                if (var12 == null || var12.field1071 <= var8) {
                                    var11.field1072 = true;
                                    int var13 = var11.method967();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1071 += var13;
                                    }
                                    if (var4 >= this.field1100) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method1009();
                                    if (var14 != null) {
                                        int var15 = var11.field1073;
                                        while (var14 != null) {
                                            this.method1174(var14, var15 * var14.method945() >> 8);
                                            var14 = var11.method966();
                                        }
                                    }
                                    class48 var16 = var11.field1074;
                                    var11.field1074 = null;
                                    if (var10 == null) {
                                        this.field1114[var7] = var16;
                                    } else {
                                        var10.field1074 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1118[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1074;
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
                class48 var18 = this.field1114[var17];
                class48[] var19 = this.field1114;
                this.field1118[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1074;
                    var18.field1074 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1113 < 0) {
            this.field1113 = 0;
        }
        if (this.field1099 != null) {
            this.field1099.method1029(arg0, 0, arg1);
        }
        this.field1101 = class121.method2140();
    }

    @ObfuscatedName("an.al(Lav;II)V")
    public final void method1174(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1118[var3];
        if (var4 == null) {
            this.field1114[var3] = arg0;
        } else {
            var4.field1074 = arg0;
        }
        this.field1118[var3] = arg0;
        arg0.field1073 = arg1;
    }

    @ObfuscatedName("an.j(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
    }

    @ObfuscatedName("an.f(I)V")
    public void method923(int arg0) throws Exception {
    }

    @ObfuscatedName("an.o()I")
    public int method934() throws Exception {
        return this.field1102;
    }

    @ObfuscatedName("an.h()V")
    public void method936() throws Exception {
    }

    @ObfuscatedName("an.u()V")
    public void method924() {
    }

    @ObfuscatedName("an.a()V")
    public void method927() throws Exception {
    }
}
