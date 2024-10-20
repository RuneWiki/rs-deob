package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class58 {

    @ObfuscatedName("bf.l")
    public int[] field1039;

    @ObfuscatedName("bf.c")
    public class69 field1044;

    @ObfuscatedName("bf.u")
    public int field1041 = 32;

    @ObfuscatedName("bf.k")
    public long field1046 = class156.method2009();

    @ObfuscatedName("bf.z")
    public int field1047;

    @ObfuscatedName("bf.y")
    public int field1048;

    @ObfuscatedName("bf.j")
    public int field1054;

    @ObfuscatedName("bf.f")
    public long field1052 = 0L;

    @ObfuscatedName("bf.p")
    public int field1051 = 0;

    @ObfuscatedName("bf.i")
    public int field1056 = 0;

    @ObfuscatedName("bf.s")
    public int field1053 = 0;

    @ObfuscatedName("bf.x")
    public long field1040 = 0L;

    @ObfuscatedName("bf.d")
    public boolean field1055 = true;

    @ObfuscatedName("bf.a")
    public int field1050 = 0;

    @ObfuscatedName("bf.e")
    public class69[] field1058 = new class69[8];

    @ObfuscatedName("bf.am")
    public class69[] field1059 = new class69[8];

    @ObfuscatedName("a.o(Lcz;Ljava/awt/Component;III)Lbf;")
    public static final class58 method237(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1043 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1039 = new int[256 * (Statics.field1045 ? 2 : 1)];
                var4.field1048 = arg3;
                var4.method1012(arg1);
                var4.field1047 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1047 > 16384) {
                    var4.field1047 = 16384;
                }
                var4.method1010(var4.field1047);
                if (Statics.field1 > 0 && Statics.field1049 == null) {
                    Statics.field1049 = new class64();
                    Statics.field1049.field1089 = arg0;
                    arg0.method1833(Statics.field1049, Statics.field1);
                }
                if (Statics.field1049 != null) {
                    if (Statics.field1049.field1093[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1049.field1093[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bf.m(Lbi;B)V")
    public final synchronized void method1001(class69 arg0) {
        this.field1044 = arg0;
    }

    @ObfuscatedName("bf.b(I)V")
    public final synchronized void method1002() {
        if (this.field1039 == null) {
            return;
        }
        long var1 = class156.method2009();
        try {
            if (this.field1052 != 0L) {
                if (var1 < this.field1052) {
                    return;
                }
                this.method1010(this.field1047);
                this.field1052 = 0L;
                this.field1055 = true;
            }
            int var3 = this.method1011();
            if (this.field1053 - var3 > this.field1051) {
                this.field1051 = this.field1053 - var3;
            }
            int var4 = this.field1054 + this.field1048;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1047) {
                this.field1047 += 1024;
                if (this.field1047 > 16384) {
                    this.field1047 = 16384;
                }
                this.method1035();
                this.method1010(this.field1047);
                var3 = 0;
                this.field1055 = true;
                if (var4 + 256 > this.field1047) {
                    var4 = this.field1047 - 256;
                    this.field1054 = var4 - this.field1048;
                }
            }
            while (var3 < var4) {
                this.method1000(this.field1039, 256);
                this.method1054();
                var3 += 256;
            }
            if (var1 > this.field1040) {
                if (this.field1055) {
                    this.field1055 = false;
                } else if (this.field1051 == 0 && this.field1056 == 0) {
                    this.method1035();
                    this.field1052 = var1 + 2000L;
                    return;
                } else {
                    this.field1054 = Math.min(this.field1056, this.field1051);
                    this.field1056 = this.field1051;
                }
                this.field1051 = 0;
                this.field1040 = var1 + 2000L;
            }
            this.field1053 = var3;
        } catch (Exception var8) {
            this.method1035();
            this.field1052 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1046 + 500000L) {
                var1 = this.field1046;
            }
            while (var1 > this.field1046 + 5000L) {
                this.method1033(256);
                this.field1046 += (long) (256000 / Statics.field1043);
            }
        } catch (Exception var7) {
            this.field1046 = var1;
        }
    }

    @ObfuscatedName("bf.g(I)V")
    public final void method1003() {
        this.field1055 = true;
    }

    @ObfuscatedName("bf.l(I)V")
    public final synchronized void method1004() {
        this.field1055 = true;
        try {
            this.method1014();
        } catch (Exception var2) {
            this.method1035();
            this.field1052 = class156.method2009() + 2000L;
        }
    }

    @ObfuscatedName("bf.c(I)V")
    public final synchronized void method1025() {
        if (Statics.field1049 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1049.field1093[var2] == this) {
                    Statics.field1049.field1093[var2] = null;
                }
                if (Statics.field1049.field1093[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1049.field1091 = true;
                while (Statics.field1049.field1092) {
                    class162.method238(50L);
                }
                Statics.field1049 = null;
            }
        }
        this.method1035();
        this.field1039 = null;
    }

    @ObfuscatedName("bf.u(II)V")
    public final void method1033(int arg0) {
        this.field1050 -= arg0;
        if (this.field1050 < 0) {
            this.field1050 = 0;
        }
        if (this.field1044 != null) {
            this.field1044.method889(arg0);
        }
    }

    @ObfuscatedName("bf.k([II)V")
    public final void method1000(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1045) {
            var3 = arg1 << 1;
        }
        class164.method2839(arg0, 0, var3);
        this.field1050 -= arg1;
        if (this.field1044 != null && this.field1050 <= 0) {
            this.field1050 += Statics.field1043 >> 4;
            method559(this.field1044);
            this.method1008(this.field1044, this.field1044.method1119());
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
                        class69 var10 = null;
                        class69 var11 = this.field1058[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1144;
                                if (var12 == null || var12.field1178 <= var8) {
                                    var11.field1147 = true;
                                    int var13 = var11.method886();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1178 += var13;
                                    }
                                    if (var4 >= this.field1041) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method882();
                                    if (var14 != null) {
                                        int var15 = var11.field1146;
                                        while (var14 != null) {
                                            this.method1008(var14, var15 * var14.method1119() >> 8);
                                            var14 = var11.method885();
                                        }
                                    }
                                    class69 var16 = var11.field1145;
                                    var11.field1145 = null;
                                    if (var10 == null) {
                                        this.field1058[var7] = var16;
                                    } else {
                                        var10.field1145 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1059[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1145;
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
                class69 var18 = this.field1058[var17];
                class69[] var19 = this.field1058;
                this.field1059[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1145;
                    var18.field1145 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1050 < 0) {
            this.field1050 = 0;
        }
        if (this.field1044 != null) {
            this.field1044.method887(arg0, 0, arg1);
        }
        this.field1046 = class156.method2009();
    }

    @ObfuscatedName("e.z(Lbi;I)V")
    public static final void method559(class69 arg0) {
        arg0.field1147 = false;
        if (arg0.field1144 != null) {
            arg0.field1144.field1178 = 0;
        }
        for (class69 var1 = arg0.method882(); var1 != null; var1 = arg0.method885()) {
            method559(var1);
        }
    }

    @ObfuscatedName("bf.y(Lbi;II)V")
    public final void method1008(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1059[var3];
        if (var4 == null) {
            this.field1058[var3] = arg0;
        } else {
            var4.field1145 = arg0;
        }
        this.field1059[var3] = arg0;
        arg0.field1146 = arg1;
    }

    @ObfuscatedName("bf.j(Ljava/awt/Component;B)V")
    public void method1012(Component arg0) throws Exception {
    }

    @ObfuscatedName("bf.f(II)V")
    public void method1010(int arg0) throws Exception {
    }

    @ObfuscatedName("bf.p(I)I")
    public int method1011() throws Exception {
        return this.field1047;
    }

    @ObfuscatedName("bf.i()V")
    public void method1054() throws Exception {
    }

    @ObfuscatedName("bf.s(I)V")
    public void method1035() {
    }

    @ObfuscatedName("bf.x(I)V")
    public void method1014() throws Exception {
    }
}
