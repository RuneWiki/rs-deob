package deob;

import java.awt.Component;

@ObfuscatedName("bx")
public class class58 {

    @ObfuscatedName("bx.a")
    public int[] field1067;

    @ObfuscatedName("bx.q")
    public class69 field1042;

    @ObfuscatedName("bx.w")
    public int field1047 = 32;

    @ObfuscatedName("bx.v")
    public long field1048 = class156.method1307();

    @ObfuscatedName("bx.h")
    public int field1049;

    @ObfuscatedName("bx.p")
    public int field1040;

    @ObfuscatedName("bx.l")
    public int field1051;

    @ObfuscatedName("bx.c")
    public long field1052 = 0L;

    @ObfuscatedName("bx.m")
    public int field1050 = 0;

    @ObfuscatedName("bx.r")
    public int field1041 = 0;

    @ObfuscatedName("bx.u")
    public int field1055 = 0;

    @ObfuscatedName("bx.j")
    public long field1056 = 0L;

    @ObfuscatedName("bx.x")
    public boolean field1045 = true;

    @ObfuscatedName("bx.b")
    public int field1060 = 0;

    @ObfuscatedName("bx.o")
    public class69[] field1061 = new class69[8];

    @ObfuscatedName("bx.ak")
    public class69[] field1062 = new class69[8];

    @ObfuscatedName("f.i(Lcm;Ljava/awt/Component;IIB)Lbx;")
    public static final class58 method26(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1054 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1067 = new int[256 * (Statics.field1063 ? 2 : 1)];
                var4.field1040 = arg3;
                var4.method1047(arg1);
                var4.field1049 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1049 > 16384) {
                    var4.field1049 = 16384;
                }
                var4.method997(var4.field1049);
                if (Statics.field1057 > 0 && Statics.field2771 == null) {
                    Statics.field2771 = new class64();
                    Statics.field2771.field1093 = arg0;
                    arg0.method1820(Statics.field2771, Statics.field1057);
                }
                if (Statics.field2771 != null) {
                    if (Statics.field2771.field1091[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2771.field1091[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bx.e(Lbg;I)V")
    public final synchronized void method998(class69 arg0) {
        this.field1042 = arg0;
    }

    @ObfuscatedName("bx.f(I)V")
    public final synchronized void method999() {
        if (this.field1067 == null) {
            return;
        }
        long var1 = class156.method1307();
        try {
            if (this.field1052 != 0L) {
                if (var1 < this.field1052) {
                    return;
                }
                this.method997(this.field1049);
                this.field1052 = 0L;
                this.field1045 = true;
            }
            int var3 = this.method1008();
            if (this.field1055 - var3 > this.field1050) {
                this.field1050 = this.field1055 - var3;
            }
            int var4 = this.field1051 + this.field1040;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1049) {
                this.field1049 += 1024;
                if (this.field1049 > 16384) {
                    this.field1049 = 16384;
                }
                this.method1010();
                this.method997(this.field1049);
                var3 = 0;
                this.field1045 = true;
                if (var4 + 256 > this.field1049) {
                    var4 = this.field1049 - 256;
                    this.field1051 = var4 - this.field1040;
                }
            }
            while (var3 < var4) {
                this.method1004(this.field1067, 256);
                this.method1048();
                var3 += 256;
            }
            if (var1 > this.field1056) {
                if (this.field1045) {
                    this.field1045 = false;
                } else if (this.field1050 == 0 && this.field1041 == 0) {
                    this.method1010();
                    this.field1052 = var1 + 2000L;
                    return;
                } else {
                    this.field1051 = Math.min(this.field1041, this.field1050);
                    this.field1041 = this.field1050;
                }
                this.field1050 = 0;
                this.field1056 = var1 + 2000L;
            }
            this.field1055 = var3;
        } catch (Exception var8) {
            this.method1010();
            this.field1052 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1048 + 500000L) {
                var1 = this.field1048;
            }
            while (var1 > this.field1048 + 5000L) {
                this.method1026(256);
                this.field1048 += (long) (256000 / Statics.field1054);
            }
        } catch (Exception var7) {
            this.field1048 = var1;
        }
    }

    @ObfuscatedName("bx.k(I)V")
    public final void method1000() {
        this.field1045 = true;
    }

    @ObfuscatedName("bx.a(B)V")
    public final synchronized void method1001() {
        this.field1045 = true;
        try {
            this.method1033();
        } catch (Exception var2) {
            this.method1010();
            this.field1052 = class156.method1307() + 2000L;
        }
    }

    @ObfuscatedName("bx.q(I)V")
    public final synchronized void method1002() {
        if (Statics.field2771 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2771.field1091[var2] == this) {
                    Statics.field2771.field1091[var2] = null;
                }
                if (Statics.field2771.field1091[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2771.field1090 = true;
                while (Statics.field2771.field1092) {
                    class162.method150(50L);
                }
                Statics.field2771 = null;
            }
        }
        this.method1010();
        this.field1067 = null;
    }

    @ObfuscatedName("bx.w(IB)V")
    public final void method1026(int arg0) {
        this.field1060 -= arg0;
        if (this.field1060 < 0) {
            this.field1060 = 0;
        }
        if (this.field1042 != null) {
            this.field1042.method875(arg0);
        }
    }

    @ObfuscatedName("bx.v([II)V")
    public final void method1004(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1063) {
            var3 = arg1 << 1;
        }
        class164.method2823(arg0, 0, var3);
        this.field1060 -= arg1;
        if (this.field1042 != null && this.field1060 <= 0) {
            this.field1060 += Statics.field1054 >> 4;
            method2008(this.field1042);
            this.method1046(this.field1042, this.field1042.method1120());
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
                                class72 var12 = var11.field1148;
                                if (var12 == null || var12.field1180 <= var8) {
                                    var11.field1146 = true;
                                    int var13 = var11.method872();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1180 += var13;
                                    }
                                    if (var4 >= this.field1047) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method868();
                                    if (var14 != null) {
                                        int var15 = var11.field1149;
                                        while (var14 != null) {
                                            this.method1046(var14, var15 * var14.method1120() >> 8);
                                            var14 = var11.method871();
                                        }
                                    }
                                    class69 var16 = var11.field1147;
                                    var11.field1147 = null;
                                    if (var10 == null) {
                                        this.field1061[var7] = var16;
                                    } else {
                                        var10.field1147 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1062[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1147;
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
                    class69 var21 = var18.field1147;
                    var18.field1147 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1060 < 0) {
            this.field1060 = 0;
        }
        if (this.field1042 != null) {
            this.field1042.method873(arg0, 0, arg1);
        }
        this.field1048 = class156.method1307();
    }

    @ObfuscatedName("dc.h(Lbg;B)V")
    public static final void method2008(class69 arg0) {
        arg0.field1146 = false;
        if (arg0.field1148 != null) {
            arg0.field1148.field1180 = 0;
        }
        for (class69 var1 = arg0.method868(); var1 != null; var1 = arg0.method871()) {
            method2008(var1);
        }
    }

    @ObfuscatedName("bx.p(Lbg;II)V")
    public final void method1046(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1062[var3];
        if (var4 == null) {
            this.field1061[var3] = arg0;
        } else {
            var4.field1147 = arg0;
        }
        this.field1062[var3] = arg0;
        arg0.field1149 = arg1;
    }

    @ObfuscatedName("bx.l(Ljava/awt/Component;I)V")
    public void method1047(Component arg0) throws Exception {
    }

    @ObfuscatedName("bx.c(IS)V")
    public void method997(int arg0) throws Exception {
    }

    @ObfuscatedName("bx.m(I)I")
    public int method1008() throws Exception {
        return this.field1049;
    }

    @ObfuscatedName("bx.r()V")
    public void method1048() throws Exception {
    }

    @ObfuscatedName("bx.u(B)V")
    public void method1010() {
    }

    @ObfuscatedName("bx.j(I)V")
    public void method1033() throws Exception {
    }
}
