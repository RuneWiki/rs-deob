package deob;

import java.awt.Component;

@ObfuscatedName("al")
public class class52 {

    @ObfuscatedName("al.c")
    public int[] field1127;

    @ObfuscatedName("al.z")
    public class48 field1112;

    @ObfuscatedName("al.s")
    public int field1126 = 32;

    @ObfuscatedName("al.h")
    public long field1114 = class121.method245();

    @ObfuscatedName("al.f")
    public int field1115;

    @ObfuscatedName("al.w")
    public int field1122;

    @ObfuscatedName("al.d")
    public int field1117;

    @ObfuscatedName("al.y")
    public long field1107 = 0L;

    @ObfuscatedName("al.g")
    public int field1119 = 0;

    @ObfuscatedName("al.v")
    public int field1120 = 0;

    @ObfuscatedName("al.b")
    public int field1113 = 0;

    @ObfuscatedName("al.j")
    public long field1121 = 0L;

    @ObfuscatedName("al.m")
    public boolean field1123 = true;

    @ObfuscatedName("al.ay")
    public int field1111 = 0;

    @ObfuscatedName("al.as")
    public class48[] field1116 = new class48[8];

    @ObfuscatedName("al.aq")
    public class48[] field1118 = new class48[8];

    @ObfuscatedName("r.i(Lbh;Ljava/awt/Component;III)Lal;")
    public static final class52 method28(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1989 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1127 = new int[(Statics.field1125 ? 2 : 1) * 256];
                var4.field1122 = arg3;
                var4.method924(arg1);
                var4.field1115 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1115 > 16384) {
                    var4.field1115 = 16384;
                }
                var4.method926(var4.field1115);
                if (Statics.field1108 > 0 && Statics.field2312 == null) {
                    Statics.field2312 = new class55();
                    Statics.field2312.field1196 = arg0;
                    arg0.method1454(Statics.field2312, Statics.field1108);
                }
                if (Statics.field2312 != null) {
                    if (Statics.field2312.field1191[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2312.field1191[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1127 = new int[(Statics.field1125 ? 2 : 1) * 256];
                    var6.field1122 = arg3;
                    var6.method924(arg1);
                    var6.field1115 = 16384;
                    var6.method926(var6.field1115);
                    if (Statics.field1108 > 0 && Statics.field2312 == null) {
                        Statics.field2312 = new class55();
                        Statics.field2312.field1196 = arg0;
                        arg0.method1454(Statics.field2312, Statics.field1108);
                    }
                    if (Statics.field2312 != null) {
                        if (Statics.field2312.field1191[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2312.field1191[arg2] = var6;
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

    @ObfuscatedName("al.ah(Law;B)V")
    public final synchronized void method1159(class48 arg0) {
        this.field1112 = arg0;
    }

    @ObfuscatedName("al.ag(B)V")
    public final synchronized void method1158() {
        if (this.field1127 == null) {
            return;
        }
        long var1 = class121.method245();
        try {
            if (this.field1107 != 0L) {
                if (var1 < this.field1107) {
                    return;
                }
                this.method926(this.field1115);
                this.field1107 = 0L;
                this.field1123 = true;
            }
            int var3 = this.method927();
            if (this.field1113 - var3 > this.field1119) {
                this.field1119 = this.field1113 - var3;
            }
            int var4 = this.field1122 + this.field1117;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1115) {
                this.field1115 += 1024;
                if (this.field1115 > 16384) {
                    this.field1115 = 16384;
                }
                this.method929();
                this.method926(this.field1115);
                var3 = 0;
                this.field1123 = true;
                if (var4 + 256 > this.field1115) {
                    var4 = this.field1115 - 256;
                    this.field1117 = var4 - this.field1122;
                }
            }
            while (var3 < var4) {
                this.method1174(this.field1127, 256);
                this.method928();
                var3 += 256;
            }
            if (var1 > this.field1121) {
                if (this.field1123) {
                    this.field1123 = false;
                } else if (this.field1119 == 0 && this.field1120 == 0) {
                    this.method929();
                    this.field1107 = var1 + 2000L;
                    return;
                } else {
                    this.field1117 = Math.min(this.field1120, this.field1119);
                    this.field1120 = this.field1119;
                }
                this.field1119 = 0;
                this.field1121 = var1 + 2000L;
            }
            this.field1113 = var3;
        } catch (Exception var8) {
            this.method929();
            this.field1107 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1114 + 500000L) {
                var1 = this.field1114;
            }
            while (var1 > this.field1114 + 5000L) {
                this.method1154(256);
                this.field1114 += (long) (256000 / Statics.field1989);
            }
        } catch (Exception var7) {
            this.field1114 = var1;
        }
    }

    @ObfuscatedName("al.ay(I)V")
    public final void method1152() {
        this.field1123 = true;
    }

    @ObfuscatedName("al.as(I)V")
    public final synchronized void method1153() {
        this.field1123 = true;
        try {
            this.method940();
        } catch (Exception var2) {
            this.method929();
            this.field1107 = class121.method245() + 2000L;
        }
    }

    @ObfuscatedName("al.aq(I)V")
    public final synchronized void method1157() {
        if (Statics.field2312 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2312.field1191[var2] == this) {
                    Statics.field2312.field1191[var2] = null;
                }
                if (Statics.field2312.field1191[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2312.field1192 = true;
                while (Statics.field2312.field1193) {
                    class126.method164(50L);
                }
                Statics.field2312 = null;
            }
        }
        this.method929();
        this.field1127 = null;
    }

    @ObfuscatedName("al.am(IB)V")
    public final void method1154(int arg0) {
        this.field1111 -= arg0;
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1112 != null) {
            this.field1112.method976(arg0);
        }
    }

    @ObfuscatedName("al.an([II)V")
    public final void method1174(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1125) {
            var3 = arg1 << 1;
        }
        class128.method2625(arg0, 0, var3);
        this.field1111 -= arg1;
        if (this.field1112 != null && this.field1111 <= 0) {
            this.field1111 += Statics.field1989 >> 4;
            method2908(this.field1112);
            this.method1156(this.field1112, this.field1112.method951());
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
                                class47 var12 = var11.field1085;
                                if (var12 == null || var12.field1082 <= var8) {
                                    var11.field1086 = true;
                                    int var13 = var11.method974();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1082 += var13;
                                    }
                                    if (var4 >= this.field1126) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method972();
                                    if (var14 != null) {
                                        int var15 = var11.field1083;
                                        while (var14 != null) {
                                            this.method1156(var14, var15 * var14.method951() >> 8);
                                            var14 = var11.method1041();
                                        }
                                    }
                                    class48 var16 = var11.field1084;
                                    var11.field1084 = null;
                                    if (var10 == null) {
                                        this.field1116[var7] = var16;
                                    } else {
                                        var10.field1084 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1118[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1084;
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
                this.field1118[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1084;
                    var18.field1084 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1112 != null) {
            this.field1112.method992(arg0, 0, arg1);
        }
        this.field1114 = class121.method245();
    }

    @ObfuscatedName("eh.av(Law;B)V")
    public static final void method2908(class48 arg0) {
        arg0.field1086 = false;
        if (arg0.field1085 != null) {
            arg0.field1085.field1082 = 0;
        }
        for (class48 var1 = arg0.method972(); var1 != null; var1 = arg0.method1041()) {
            method2908(var1);
        }
    }

    @ObfuscatedName("al.at(Law;IB)V")
    public final void method1156(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1118[var3];
        if (var4 == null) {
            this.field1116[var3] = arg0;
        } else {
            var4.field1084 = arg0;
        }
        this.field1118[var3] = arg0;
        arg0.field1083 = arg1;
    }

    @ObfuscatedName("al.a(Ljava/awt/Component;)V")
    public void method924(Component arg0) throws Exception {
    }

    @ObfuscatedName("al.x(I)V")
    public void method926(int arg0) throws Exception {
    }

    @ObfuscatedName("al.e()I")
    public int method927() throws Exception {
        return this.field1115;
    }

    @ObfuscatedName("al.r()V")
    public void method928() throws Exception {
    }

    @ObfuscatedName("al.p()V")
    public void method929() {
    }

    @ObfuscatedName("al.n()V")
    public void method940() throws Exception {
    }
}
