package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class52 {

    @ObfuscatedName("ay.t")
    public int[] field1112;

    @ObfuscatedName("ay.m")
    public class48 field1132;

    @ObfuscatedName("ay.s")
    public int field1114 = 32;

    @ObfuscatedName("ay.j")
    public long field1115 = class121.method2119();

    @ObfuscatedName("ay.b")
    public int field1113;

    @ObfuscatedName("ay.n")
    public int field1117;

    @ObfuscatedName("ay.z")
    public int field1128;

    @ObfuscatedName("ay.d")
    public long field1119 = 0L;

    @ObfuscatedName("ay.f")
    public int field1120 = 0;

    @ObfuscatedName("ay.o")
    public int field1121 = 0;

    @ObfuscatedName("ay.r")
    public int field1124 = 0;

    @ObfuscatedName("ay.k")
    public long field1123 = 0L;

    @ObfuscatedName("ay.w")
    public boolean field1122 = true;

    @ObfuscatedName("ay.ak")
    public int field1109 = 0;

    @ObfuscatedName("ay.af")
    public class48[] field1127 = new class48[8];

    @ObfuscatedName("ay.ag")
    public class48[] field1116 = new class48[8];

    @ObfuscatedName("l.r(IZII)V")
    public static final void method53(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1118 = arg0;
        Statics.field1110 = arg1;
        Statics.field1111 = arg2;
    }

    @ObfuscatedName("cr.k(Lbz;Ljava/awt/Component;III)Lay;")
    public static final class52 method1530(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1118 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1112 = new int[(Statics.field1110 ? 2 : 1) * 256];
                var4.field1117 = arg3;
                var4.method891(arg1);
                var4.field1113 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1113 > 16384) {
                    var4.field1113 = 16384;
                }
                var4.method897(var4.field1113);
                if (Statics.field1111 > 0 && Statics.field2102 == null) {
                    Statics.field2102 = new class55();
                    Statics.field2102.field1201 = arg0;
                    arg0.method1433(Statics.field2102, Statics.field1111);
                }
                if (Statics.field2102 != null) {
                    if (Statics.field2102.field1193[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2102.field1193[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1112 = new int[(Statics.field1110 ? 2 : 1) * 256];
                    var6.field1117 = arg3;
                    var6.method891(arg1);
                    var6.field1113 = 16384;
                    var6.method897(var6.field1113);
                    if (Statics.field1111 > 0 && Statics.field2102 == null) {
                        Statics.field2102 = new class55();
                        Statics.field2102.field1201 = arg0;
                        arg0.method1433(Statics.field2102, Statics.field1111);
                    }
                    if (Statics.field2102 != null) {
                        if (Statics.field2102.field1193[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2102.field1193[arg2] = var6;
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

    @ObfuscatedName("ay.w(Lab;I)V")
    public final synchronized void method1111(class48 arg0) {
        this.field1132 = arg0;
    }

    @ObfuscatedName("ay.e(I)V")
    public final synchronized void method1134() {
        if (this.field1112 == null) {
            return;
        }
        long var1 = class121.method2119();
        try {
            if (this.field1119 != 0L) {
                if (var1 < this.field1119) {
                    return;
                }
                this.method897(this.field1113);
                this.field1119 = 0L;
                this.field1122 = true;
            }
            int var3 = this.method893();
            if (this.field1124 - var3 > this.field1120) {
                this.field1120 = this.field1124 - var3;
            }
            int var4 = this.field1128 + this.field1117;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1113) {
                this.field1113 += 1024;
                if (this.field1113 > 16384) {
                    this.field1113 = 16384;
                }
                this.method899();
                this.method897(this.field1113);
                var3 = 0;
                this.field1122 = true;
                if (var4 + 256 > this.field1113) {
                    var4 = this.field1113 - 256;
                    this.field1128 = var4 - this.field1117;
                }
            }
            while (var3 < var4) {
                this.method1120(this.field1112, 256);
                this.method894();
                var3 += 256;
            }
            if (var1 > this.field1123) {
                if (this.field1122) {
                    this.field1122 = false;
                } else if (this.field1120 == 0 && this.field1121 == 0) {
                    this.method899();
                    this.field1119 = var1 + 2000L;
                    return;
                } else {
                    this.field1128 = Math.min(this.field1121, this.field1120);
                    this.field1121 = this.field1120;
                }
                this.field1120 = 0;
                this.field1123 = var1 + 2000L;
            }
            this.field1124 = var3;
        } catch (Exception var8) {
            this.method899();
            this.field1119 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1115 + 500000L) {
                var1 = this.field1115;
            }
            while (var1 > this.field1115 + 5000L) {
                this.method1115(256);
                this.field1115 += (long) (256000 / Statics.field1118);
            }
        } catch (Exception var7) {
            this.field1115 = var1;
        }
    }

    @ObfuscatedName("ay.p(I)V")
    public final void method1117() {
        this.field1122 = true;
    }

    @ObfuscatedName("ay.i(I)V")
    public final synchronized void method1113() {
        this.field1122 = true;
        try {
            this.method896();
        } catch (Exception var2) {
            this.method899();
            this.field1119 = class121.method2119() + 2000L;
        }
    }

    @ObfuscatedName("ay.ap(I)V")
    public final synchronized void method1114() {
        if (Statics.field2102 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2102.field1193[var2] == this) {
                    Statics.field2102.field1193[var2] = null;
                }
                if (Statics.field2102.field1193[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2102.field1195 = true;
                while (Statics.field2102.field1196) {
                    class126.method577(50L);
                }
                Statics.field2102 = null;
            }
        }
        this.method899();
        this.field1112 = null;
    }

    @ObfuscatedName("ay.as(II)V")
    public final void method1115(int arg0) {
        this.field1109 -= arg0;
        if (this.field1109 < 0) {
            this.field1109 = 0;
        }
        if (this.field1132 != null) {
            this.field1132.method937(arg0);
        }
    }

    @ObfuscatedName("ay.ak([II)V")
    public final void method1120(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1110) {
            var3 = arg1 << 1;
        }
        class128.method2530(arg0, 0, var3);
        this.field1109 -= arg1;
        if (this.field1132 != null && this.field1109 <= 0) {
            this.field1109 += Statics.field1118 >> 4;
            method43(this.field1132);
            this.method1116(this.field1132, this.field1132.method912());
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
                        class48 var11 = this.field1127[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1087;
                                if (var12 == null || var12.field1084 <= var8) {
                                    var11.field1085 = true;
                                    int var13 = var11.method935();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1084 += var13;
                                    }
                                    if (var4 >= this.field1114) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method933();
                                    if (var14 != null) {
                                        int var15 = var11.field1086;
                                        while (var14 != null) {
                                            this.method1116(var14, var15 * var14.method912() >> 8);
                                            var14 = var11.method974();
                                        }
                                    }
                                    class48 var16 = var11.field1088;
                                    var11.field1088 = null;
                                    if (var10 == null) {
                                        this.field1127[var7] = var16;
                                    } else {
                                        var10.field1088 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1116[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1088;
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
                class48 var18 = this.field1127[var17];
                class48[] var19 = this.field1127;
                this.field1116[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1088;
                    var18.field1088 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1109 < 0) {
            this.field1109 = 0;
        }
        if (this.field1132 != null) {
            this.field1132.method976(arg0, 0, arg1);
        }
        this.field1115 = class121.method2119();
    }

    @ObfuscatedName("u.af(Lab;I)V")
    public static final void method43(class48 arg0) {
        arg0.field1085 = false;
        if (arg0.field1087 != null) {
            arg0.field1087.field1084 = 0;
        }
        for (class48 var1 = arg0.method933(); var1 != null; var1 = arg0.method974()) {
            method43(var1);
        }
    }

    @ObfuscatedName("ay.ag(Lab;II)V")
    public final void method1116(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1116[var3];
        if (var4 == null) {
            this.field1127[var3] = arg0;
        } else {
            var4.field1088 = arg0;
        }
        this.field1116[var3] = arg0;
        arg0.field1086 = arg1;
    }

    @ObfuscatedName("ay.c(Ljava/awt/Component;)V")
    public void method891(Component arg0) throws Exception {
    }

    @ObfuscatedName("ay.q(I)V")
    public void method897(int arg0) throws Exception {
    }

    @ObfuscatedName("ay.y()I")
    public int method893() throws Exception {
        return this.field1113;
    }

    @ObfuscatedName("ay.v()V")
    public void method894() throws Exception {
    }

    @ObfuscatedName("ay.g()V")
    public void method899() {
    }

    @ObfuscatedName("ay.x()V")
    public void method896() throws Exception {
    }
}
