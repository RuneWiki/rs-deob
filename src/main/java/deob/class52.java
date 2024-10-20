package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class52 {

    @ObfuscatedName("aa.f")
    public int[] field1100;

    @ObfuscatedName("aa.a")
    public class48 field1106;

    @ObfuscatedName("aa.d")
    public int field1102 = 32;

    @ObfuscatedName("aa.e")
    public long field1103 = class121.method142();

    @ObfuscatedName("aa.y")
    public int field1119;

    @ObfuscatedName("aa.k")
    public int field1105;

    @ObfuscatedName("aa.h")
    public int field1095;

    @ObfuscatedName("aa.x")
    public long field1107 = 0L;

    @ObfuscatedName("aa.b")
    public int field1108 = 0;

    @ObfuscatedName("aa.n")
    public int field1109 = 0;

    @ObfuscatedName("aa.q")
    public int field1110 = 0;

    @ObfuscatedName("aa.r")
    public long field1099 = 0L;

    @ObfuscatedName("aa.u")
    public boolean field1113 = true;

    @ObfuscatedName("aa.ac")
    public int field1111 = 0;

    @ObfuscatedName("aa.as")
    public class48[] field1116 = new class48[8];

    @ObfuscatedName("aa.ag")
    public class48[] field1117 = new class48[8];

    @ObfuscatedName("dd.q(Lby;Ljava/awt/Component;III)Laa;")
    public static final class52 method2378(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field87 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1100 = new int[(Statics.field1112 ? 2 : 1) * 256];
                var4.field1105 = arg3;
                var4.method957(arg1);
                var4.field1119 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1119 > 16384) {
                    var4.field1119 = 16384;
                }
                var4.method969(var4.field1119);
                if (Statics.field1120 > 0 && Statics.field1097 == null) {
                    Statics.field1097 = new class55();
                    Statics.field1097.field1188 = arg0;
                    arg0.method1525(Statics.field1097, Statics.field1120);
                }
                if (Statics.field1097 != null) {
                    if (Statics.field1097.field1182[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1097.field1182[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1100 = new int[256 * (Statics.field1112 ? 2 : 1)];
                    var6.field1105 = arg3;
                    var6.method957(arg1);
                    var6.field1119 = 16384;
                    var6.method969(var6.field1119);
                    if (Statics.field1120 > 0 && Statics.field1097 == null) {
                        Statics.field1097 = new class55();
                        Statics.field1097.field1188 = arg0;
                        arg0.method1525(Statics.field1097, Statics.field1120);
                    }
                    if (Statics.field1097 != null) {
                        if (Statics.field1097.field1182[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1097.field1182[arg2] = var6;
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

    @ObfuscatedName("aa.r(Lan;I)V")
    public final synchronized void method1182(class48 arg0) {
        this.field1106 = arg0;
    }

    @ObfuscatedName("aa.u(I)V")
    public final synchronized void method1193() {
        if (this.field1100 == null) {
            return;
        }
        long var1 = class121.method142();
        try {
            if (this.field1107 != 0L) {
                if (var1 < this.field1107) {
                    return;
                }
                this.method969(this.field1119);
                this.field1107 = 0L;
                this.field1113 = true;
            }
            int var3 = this.method959();
            if (this.field1110 - var3 > this.field1108) {
                this.field1108 = this.field1110 - var3;
            }
            int var4 = this.field1105 + this.field1095;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1119) {
                this.field1119 += 1024;
                if (this.field1119 > 16384) {
                    this.field1119 = 16384;
                }
                this.method960();
                this.method969(this.field1119);
                var3 = 0;
                this.field1113 = true;
                if (var4 + 256 > this.field1119) {
                    var4 = this.field1119 - 256;
                    this.field1095 = var4 - this.field1105;
                }
            }
            while (var3 < var4) {
                this.method1187(this.field1100, 256);
                this.method968();
                var3 += 256;
            }
            if (var1 > this.field1099) {
                if (this.field1113) {
                    this.field1113 = false;
                } else if (this.field1108 == 0 && this.field1109 == 0) {
                    this.method960();
                    this.field1107 = var1 + 2000L;
                    return;
                } else {
                    this.field1095 = Math.min(this.field1109, this.field1108);
                    this.field1109 = this.field1108;
                }
                this.field1108 = 0;
                this.field1099 = var1 + 2000L;
            }
            this.field1110 = var3;
        } catch (Exception var8) {
            this.method960();
            this.field1107 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1103 + 500000L) {
                var1 = this.field1103;
            }
            while (var1 > this.field1103 + 5000L) {
                this.method1183(256);
                this.field1103 += (long) (256000 / Statics.field87);
            }
        } catch (Exception var7) {
            this.field1103 = var1;
        }
    }

    @ObfuscatedName("aa.p(B)V")
    public final void method1184() {
        this.field1113 = true;
    }

    @ObfuscatedName("aa.t(I)V")
    public final synchronized void method1185() {
        this.field1113 = true;
        try {
            this.method961();
        } catch (Exception var2) {
            this.method960();
            this.field1107 = class121.method142() + 2000L;
        }
    }

    @ObfuscatedName("aa.s(B)V")
    public final synchronized void method1186() {
        if (Statics.field1097 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1097.field1182[var2] == this) {
                    Statics.field1097.field1182[var2] = null;
                }
                if (Statics.field1097.field1182[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1097.field1183 = true;
                while (Statics.field1097.field1186) {
                    class126.method1440(50L);
                }
                Statics.field1097 = null;
            }
        }
        this.method960();
        this.field1100 = null;
    }

    @ObfuscatedName("aa.ah(II)V")
    public final void method1183(int arg0) {
        this.field1111 -= arg0;
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1106 != null) {
            this.field1106.method1002(arg0);
        }
    }

    @ObfuscatedName("aa.ar([II)V")
    public final void method1187(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1112) {
            var3 = arg1 << 1;
        }
        class128.method2711(arg0, 0, var3);
        this.field1111 -= arg1;
        if (this.field1106 != null && this.field1111 <= 0) {
            this.field1111 += Statics.field87 >> 4;
            method46(this.field1106);
            this.method1192(this.field1106, this.field1106.method978());
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
                                class47 var12 = var11.field1073;
                                if (var12 == null || var12.field1070 <= var8) {
                                    var11.field1074 = true;
                                    int var13 = var11.method1000();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1070 += var13;
                                    }
                                    if (var4 >= this.field1102) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method998();
                                    if (var14 != null) {
                                        int var15 = var11.field1071;
                                        while (var14 != null) {
                                            this.method1192(var14, var15 * var14.method978() >> 8);
                                            var14 = var11.method1003();
                                        }
                                    }
                                    class48 var16 = var11.field1072;
                                    var11.field1072 = null;
                                    if (var10 == null) {
                                        this.field1116[var7] = var16;
                                    } else {
                                        var10.field1072 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1117[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1072;
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
                    class48 var21 = var18.field1072;
                    var18.field1072 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1111 < 0) {
            this.field1111 = 0;
        }
        if (this.field1106 != null) {
            this.field1106.method990(arg0, 0, arg1);
        }
        this.field1103 = class121.method142();
    }

    @ObfuscatedName("g.ac(Lan;I)V")
    public static final void method46(class48 arg0) {
        arg0.field1074 = false;
        if (arg0.field1073 != null) {
            arg0.field1073.field1070 = 0;
        }
        for (class48 var1 = arg0.method998(); var1 != null; var1 = arg0.method1003()) {
            method46(var1);
        }
    }

    @ObfuscatedName("aa.as(Lan;II)V")
    public final void method1192(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1117[var3];
        if (var4 == null) {
            this.field1116[var3] = arg0;
        } else {
            var4.field1072 = arg0;
        }
        this.field1117[var3] = arg0;
        arg0.field1071 = arg1;
    }

    @ObfuscatedName("aa.i(Ljava/awt/Component;)V")
    public void method957(Component arg0) throws Exception {
    }

    @ObfuscatedName("aa.v(I)V")
    public void method969(int arg0) throws Exception {
    }

    @ObfuscatedName("aa.m()I")
    public int method959() throws Exception {
        return this.field1119;
    }

    @ObfuscatedName("aa.j()V")
    public void method968() throws Exception {
    }

    @ObfuscatedName("aa.o()V")
    public void method960() {
    }

    @ObfuscatedName("aa.l()V")
    public void method961() throws Exception {
    }
}
