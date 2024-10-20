package deob;

import java.awt.Component;

@ObfuscatedName("bl")
public class class58 {

    @ObfuscatedName("bl.j")
    public int[] field1046;

    @ObfuscatedName("bl.s")
    public class69 field1042;

    @ObfuscatedName("bl.o")
    public int field1047 = 32;

    @ObfuscatedName("bl.a")
    public long field1049 = class156.method1597();

    @ObfuscatedName("bl.c")
    public int field1050;

    @ObfuscatedName("bl.m")
    public int field1041;

    @ObfuscatedName("bl.h")
    public int field1052;

    @ObfuscatedName("bl.r")
    public long field1053 = 0L;

    @ObfuscatedName("bl.u")
    public int field1054 = 0;

    @ObfuscatedName("bl.i")
    public int field1055 = 0;

    @ObfuscatedName("bl.z")
    public int field1051 = 0;

    @ObfuscatedName("bl.n")
    public long field1058 = 0L;

    @ObfuscatedName("bl.w")
    public boolean field1044 = true;

    @ObfuscatedName("bl.b")
    public int field1060 = 0;

    @ObfuscatedName("bl.e")
    public class69[] field1061 = new class69[8];

    @ObfuscatedName("bl.ai")
    public class69[] field1062 = new class69[8];

    @ObfuscatedName("q.p(IZII)V")
    public static final void method37(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1048 = arg0;
        Statics.field1043 = arg1;
        Statics.field3123 = arg2;
    }

    @ObfuscatedName("u.g(Lct;Ljava/awt/Component;III)Lbl;")
    public static final class58 method180(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1048 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1046 = new int[(Statics.field1043 ? 2 : 1) * 256];
                var4.field1041 = arg3;
                var4.method1041(arg1);
                var4.field1050 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1050 > 16384) {
                    var4.field1050 = 16384;
                }
                var4.method1001(var4.field1050);
                if (Statics.field3123 > 0 && Statics.field1057 == null) {
                    Statics.field1057 = new class64();
                    Statics.field1057.field1094 = arg0;
                    arg0.method1838(Statics.field1057, Statics.field3123);
                }
                if (Statics.field1057 != null) {
                    if (Statics.field1057.field1093[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1057.field1093[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bl.x(Lbs;I)V")
    public final synchronized void method1000(class69 arg0) {
        this.field1042 = arg0;
    }

    @ObfuscatedName("bl.q(I)V")
    public final synchronized void method1031() {
        if (this.field1046 == null) {
            return;
        }
        long var1 = class156.method1597();
        try {
            if (this.field1053 != 0L) {
                if (var1 < this.field1053) {
                    return;
                }
                this.method1001(this.field1050);
                this.field1053 = 0L;
                this.field1044 = true;
            }
            int var3 = this.method1002();
            if (this.field1051 - var3 > this.field1054) {
                this.field1054 = this.field1051 - var3;
            }
            int var4 = this.field1052 + this.field1041;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1050) {
                this.field1050 += 1024;
                if (this.field1050 > 16384) {
                    this.field1050 = 16384;
                }
                this.method1028();
                this.method1001(this.field1050);
                var3 = 0;
                this.field1044 = true;
                if (var4 + 256 > this.field1050) {
                    var4 = this.field1050 - 256;
                    this.field1052 = var4 - this.field1041;
                }
            }
            while (var3 < var4) {
                this.method998(this.field1046, 256);
                this.method1003();
                var3 += 256;
            }
            if (var1 > this.field1058) {
                if (this.field1044) {
                    this.field1044 = false;
                } else if (this.field1054 == 0 && this.field1055 == 0) {
                    this.method1028();
                    this.field1053 = var1 + 2000L;
                    return;
                } else {
                    this.field1052 = Math.min(this.field1055, this.field1054);
                    this.field1055 = this.field1054;
                }
                this.field1054 = 0;
                this.field1058 = var1 + 2000L;
            }
            this.field1051 = var3;
        } catch (Exception var8) {
            this.method1028();
            this.field1053 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1049 + 500000L) {
                var1 = this.field1049;
            }
            while (var1 > this.field1049 + 5000L) {
                this.method993(256);
                this.field1049 += (long) (256000 / Statics.field1048);
            }
        } catch (Exception var7) {
            this.field1049 = var1;
        }
    }

    @ObfuscatedName("bl.d(I)V")
    public final void method1004() {
        this.field1044 = true;
    }

    @ObfuscatedName("bl.k(B)V")
    public final synchronized void method995() {
        this.field1044 = true;
        try {
            this.method1005();
        } catch (Exception var2) {
            this.method1028();
            this.field1053 = class156.method1597() + 2000L;
        }
    }

    @ObfuscatedName("bl.j(B)V")
    public final synchronized void method1037() {
        if (Statics.field1057 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1057.field1093[var2] == this) {
                    Statics.field1057.field1093[var2] = null;
                }
                if (Statics.field1057.field1093[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1057.field1095 = true;
                while (Statics.field1057.field1096) {
                    class162.method1858(50L);
                }
                Statics.field1057 = null;
            }
        }
        this.method1028();
        this.field1046 = null;
    }

    @ObfuscatedName("bl.s(II)V")
    public final void method993(int arg0) {
        this.field1060 -= arg0;
        if (this.field1060 < 0) {
            this.field1060 = 0;
        }
        if (this.field1042 != null) {
            this.field1042.method888(arg0);
        }
    }

    @ObfuscatedName("bl.o([II)V")
    public final void method998(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1043) {
            var3 = arg1 << 1;
        }
        class164.method2859(arg0, 0, var3);
        this.field1060 -= arg1;
        if (this.field1042 != null && this.field1060 <= 0) {
            this.field1060 += Statics.field1048 >> 4;
            method2922(this.field1042);
            this.method999(this.field1042, this.field1042.method1200());
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
                        class69 var11 = this.field1061[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1144;
                                if (var12 == null || var12.field1176 <= var8) {
                                    var11.field1142 = true;
                                    int var13 = var11.method877();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1176 += var13;
                                    }
                                    if (var4 >= this.field1047) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method875();
                                    if (var14 != null) {
                                        int var15 = var11.field1143;
                                        while (var14 != null) {
                                            this.method999(var14, var15 * var14.method1200() >> 8);
                                            var14 = var11.method876();
                                        }
                                    }
                                    class69 var16 = var11.field1145;
                                    var11.field1145 = null;
                                    if (var10 == null) {
                                        this.field1061[var7] = var16;
                                    } else {
                                        var10.field1145 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1062[var7] = var10;
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
                class69 var18 = this.field1061[var17];
                class69[] var19 = this.field1061;
                this.field1062[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1145;
                    var18.field1145 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1060 < 0) {
            this.field1060 = 0;
        }
        if (this.field1042 != null) {
            this.field1042.method878(arg0, 0, arg1);
        }
        this.field1049 = class156.method1597();
    }

    @ObfuscatedName("fp.a(Lbs;I)V")
    public static final void method2922(class69 arg0) {
        arg0.field1142 = false;
        if (arg0.field1144 != null) {
            arg0.field1144.field1176 = 0;
        }
        for (class69 var1 = arg0.method875(); var1 != null; var1 = arg0.method876()) {
            method2922(var1);
        }
    }

    @ObfuscatedName("bl.c(Lbs;II)V")
    public final void method999(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1062[var3];
        if (var4 == null) {
            this.field1061[var3] = arg0;
        } else {
            var4.field1145 = arg0;
        }
        this.field1062[var3] = arg0;
        arg0.field1143 = arg1;
    }

    @ObfuscatedName("bl.u(Ljava/awt/Component;B)V")
    public void method1041(Component arg0) throws Exception {
    }

    @ObfuscatedName("bl.i(II)V")
    public void method1001(int arg0) throws Exception {
    }

    @ObfuscatedName("bl.z(I)I")
    public int method1002() throws Exception {
        return this.field1050;
    }

    @ObfuscatedName("bl.n()V")
    public void method1003() throws Exception {
    }

    @ObfuscatedName("bl.w(I)V")
    public void method1028() {
    }

    @ObfuscatedName("bl.y(I)V")
    public void method1005() throws Exception {
    }
}
