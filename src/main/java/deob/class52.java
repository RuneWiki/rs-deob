package deob;

import java.awt.Component;

@ObfuscatedName("ay")
public class class52 {

    @ObfuscatedName("ay.a")
    public int[] field1104;

    @ObfuscatedName("ay.z")
    public class48 field1102;

    @ObfuscatedName("ay.s")
    public int field1103 = 32;

    @ObfuscatedName("ay.m")
    public long field1107 = class121.method145();

    @ObfuscatedName("ay.u")
    public int field1101;

    @ObfuscatedName("ay.g")
    public int field1106;

    @ObfuscatedName("ay.o")
    public int field1114;

    @ObfuscatedName("ay.v")
    public long field1108 = 0L;

    @ObfuscatedName("ay.j")
    public int field1109 = 0;

    @ObfuscatedName("ay.n")
    public int field1105 = 0;

    @ObfuscatedName("ay.q")
    public int field1098 = 0;

    @ObfuscatedName("ay.c")
    public long field1112 = 0L;

    @ObfuscatedName("ay.h")
    public boolean field1113 = true;

    @ObfuscatedName("ay.aa")
    public int field1115 = 0;

    @ObfuscatedName("ay.ah")
    public class48[] field1116 = new class48[8];

    @ObfuscatedName("ay.aw")
    public class48[] field1117 = new class48[8];

    @ObfuscatedName("aa.q(Lbx;Ljava/awt/Component;III)Lay;")
    public static final class52 method554(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1100 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1104 = new int[256 * (Statics.field1099 ? 2 : 1)];
                var4.field1106 = arg3;
                var4.method943(arg1);
                var4.field1101 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1101 > 16384) {
                    var4.field1101 = 16384;
                }
                var4.method944(var4.field1101);
                if (Statics.field1826 > 0 && Statics.field276 == null) {
                    Statics.field276 = new class55();
                    Statics.field276.field1182 = arg0;
                    arg0.method1475(Statics.field276, Statics.field1826);
                }
                if (Statics.field276 != null) {
                    if (Statics.field276.field1185[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field276.field1185[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1104 = new int[(Statics.field1099 ? 2 : 1) * 256];
                    var6.field1106 = arg3;
                    var6.method943(arg1);
                    var6.field1101 = 16384;
                    var6.method944(var6.field1101);
                    if (Statics.field1826 > 0 && Statics.field276 == null) {
                        Statics.field276 = new class55();
                        Statics.field276.field1182 = arg0;
                        arg0.method1475(Statics.field276, Statics.field1826);
                    }
                    if (Statics.field276 != null) {
                        if (Statics.field276.field1185[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field276.field1185[arg2] = var6;
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

    @ObfuscatedName("ay.c(Lar;I)V")
    public final synchronized void method1145(class48 arg0) {
        this.field1102 = arg0;
    }

    @ObfuscatedName("ay.h(I)V")
    public final synchronized void method1146() {
        if (this.field1104 == null) {
            return;
        }
        long var1 = class121.method145();
        try {
            if (this.field1108 != 0L) {
                if (var1 < this.field1108) {
                    return;
                }
                this.method944(this.field1101);
                this.field1108 = 0L;
                this.field1113 = true;
            }
            int var3 = this.method935();
            if (this.field1098 - var3 > this.field1109) {
                this.field1109 = this.field1098 - var3;
            }
            int var4 = this.field1114 + this.field1106;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1101) {
                this.field1101 += 1024;
                if (this.field1101 > 16384) {
                    this.field1101 = 16384;
                }
                this.method938();
                this.method944(this.field1101);
                var3 = 0;
                this.field1113 = true;
                if (var4 + 256 > this.field1101) {
                    var4 = this.field1101 - 256;
                    this.field1114 = var4 - this.field1106;
                }
            }
            while (var3 < var4) {
                this.method1153(this.field1104, 256);
                this.method936();
                var3 += 256;
            }
            if (var1 > this.field1112) {
                if (this.field1113) {
                    this.field1113 = false;
                } else if (this.field1109 == 0 && this.field1105 == 0) {
                    this.method938();
                    this.field1108 = var1 + 2000L;
                    return;
                } else {
                    this.field1114 = Math.min(this.field1105, this.field1109);
                    this.field1105 = this.field1109;
                }
                this.field1109 = 0;
                this.field1112 = var1 + 2000L;
            }
            this.field1098 = var3;
        } catch (Exception var8) {
            this.method938();
            this.field1108 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1107 + 500000L) {
                var1 = this.field1107;
            }
            while (var1 > this.field1107 + 5000L) {
                this.method1149(256);
                this.field1107 += (long) (256000 / Statics.field1100);
            }
        } catch (Exception var7) {
            this.field1107 = var1;
        }
    }

    @ObfuscatedName("ay.b(I)V")
    public final void method1147() {
        this.field1113 = true;
    }

    @ObfuscatedName("ay.y(I)V")
    public final synchronized void method1174() {
        this.field1113 = true;
        try {
            this.method949();
        } catch (Exception var2) {
            this.method938();
            this.field1108 = class121.method145() + 2000L;
        }
    }

    @ObfuscatedName("ay.x(I)V")
    public final synchronized void method1172() {
        if (Statics.field276 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field276.field1185[var2] == this) {
                    Statics.field276.field1185[var2] = null;
                }
                if (Statics.field276.field1185[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field276.field1184 = true;
                while (Statics.field276.field1183) {
                    class126.method738(50L);
                }
                Statics.field276 = null;
            }
        }
        this.method938();
        this.field1104 = null;
    }

    @ObfuscatedName("ay.ao(II)V")
    public final void method1149(int arg0) {
        this.field1115 -= arg0;
        if (this.field1115 < 0) {
            this.field1115 = 0;
        }
        if (this.field1102 != null) {
            this.field1102.method988(arg0);
        }
    }

    @ObfuscatedName("ay.ae([II)V")
    public final void method1153(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1099) {
            var3 = arg1 << 1;
        }
        class128.method2653(arg0, 0, var3);
        this.field1115 -= arg1;
        if (this.field1102 != null && this.field1115 <= 0) {
            this.field1115 += Statics.field1100 >> 4;
            method877(this.field1102);
            this.method1148(this.field1102, this.field1102.method954());
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
                        class48 var11 = this.field1116[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1076;
                                if (var12 == null || var12.field1073 <= var8) {
                                    var11.field1074 = true;
                                    int var13 = var11.method976();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1073 += var13;
                                    }
                                    if (var4 >= this.field1103) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method974();
                                    if (var14 != null) {
                                        int var15 = var11.field1075;
                                        while (var14 != null) {
                                            this.method1148(var14, var15 * var14.method954() >> 8);
                                            var14 = var11.method975();
                                        }
                                    }
                                    class48 var16 = var11.field1077;
                                    var11.field1077 = null;
                                    if (var10 == null) {
                                        this.field1116[var7] = var16;
                                    } else {
                                        var10.field1077 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1117[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1077;
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
                class48 var18 = this.field1116[var17];
                class48[] var19 = this.field1116;
                this.field1117[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1077;
                    var18.field1077 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1115 < 0) {
            this.field1115 = 0;
        }
        if (this.field1102 != null) {
            this.field1102.method1005(arg0, 0, arg1);
        }
        this.field1107 = class121.method145();
    }

    @ObfuscatedName("aq.aa(Lar;I)V")
    public static final void method877(class48 arg0) {
        arg0.field1074 = false;
        if (arg0.field1076 != null) {
            arg0.field1076.field1073 = 0;
        }
        for (class48 var1 = arg0.method974(); var1 != null; var1 = arg0.method975()) {
            method877(var1);
        }
    }

    @ObfuscatedName("ay.ah(Lar;IB)V")
    public final void method1148(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1117[var3];
        if (var4 == null) {
            this.field1116[var3] = arg0;
        } else {
            var4.field1077 = arg0;
        }
        this.field1117[var3] = arg0;
        arg0.field1075 = arg1;
    }

    @ObfuscatedName("ay.i(Ljava/awt/Component;)V")
    public void method943(Component arg0) throws Exception {
    }

    @ObfuscatedName("ay.w(I)V")
    public void method944(int arg0) throws Exception {
    }

    @ObfuscatedName("ay.f()I")
    public int method935() throws Exception {
        return this.field1101;
    }

    @ObfuscatedName("ay.e()V")
    public void method936() throws Exception {
    }

    @ObfuscatedName("ay.t()V")
    public void method938() {
    }

    @ObfuscatedName("ay.d()V")
    public void method949() throws Exception {
    }
}
