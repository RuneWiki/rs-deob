package deob;

import java.awt.Component;

@ObfuscatedName("bc")
public class class58 {

    @ObfuscatedName("bc.q")
    public int[] field1052;

    @ObfuscatedName("bc.d")
    public class69 field1042;

    @ObfuscatedName("bc.n")
    public int field1047 = 32;

    @ObfuscatedName("bc.c")
    public long field1048 = class163.method225();

    @ObfuscatedName("bc.s")
    public int field1049;

    @ObfuscatedName("bc.g")
    public int field1061;

    @ObfuscatedName("bc.i")
    public int field1051;

    @ObfuscatedName("bc.v")
    public long field1043 = 0L;

    @ObfuscatedName("bc.a")
    public int field1045 = 0;

    @ObfuscatedName("bc.h")
    public int field1054 = 0;

    @ObfuscatedName("bc.p")
    public int field1055 = 0;

    @ObfuscatedName("bc.t")
    public long field1056 = 0L;

    @ObfuscatedName("bc.f")
    public boolean field1057 = true;

    @ObfuscatedName("bc.l")
    public int field1059 = 0;

    @ObfuscatedName("bc.x")
    public class69[] field1060 = new class69[8];

    @ObfuscatedName("bc.ap")
    public class69[] field1041 = new class69[8];

    @ObfuscatedName("o.k(Lcb;Ljava/awt/Component;III)Lbc;")
    public static final class58 method31(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1046 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1052 = new int[256 * (Statics.field1058 ? 2 : 1)];
                var4.field1061 = arg3;
                var4.method1037(arg1);
                var4.field1049 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1049 > 16384) {
                    var4.field1049 = 16384;
                }
                var4.method1038(var4.field1049);
                if (Statics.field2921 > 0 && Statics.field1050 == null) {
                    Statics.field1050 = new class64();
                    Statics.field1050.field1099 = arg0;
                    arg0.method1831(Statics.field1050, Statics.field2921);
                }
                if (Statics.field1050 != null) {
                    if (Statics.field1050.field1096[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1050.field1096[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bc.y(Lbs;B)V")
    public final synchronized void method1029(class69 arg0) {
        this.field1042 = arg0;
    }

    @ObfuscatedName("bc.o(I)V")
    public final synchronized void method1067() {
        if (this.field1052 == null) {
            return;
        }
        long var1 = class163.method225();
        try {
            if (this.field1043 != 0L) {
                if (var1 < this.field1043) {
                    return;
                }
                this.method1038(this.field1049);
                this.field1043 = 0L;
                this.field1057 = true;
            }
            int var3 = this.method1032();
            if (this.field1055 - var3 > this.field1045) {
                this.field1045 = this.field1055 - var3;
            }
            int var4 = this.field1061 + this.field1051;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1049) {
                this.field1049 += 1024;
                if (this.field1049 > 16384) {
                    this.field1049 = 16384;
                }
                this.method1040();
                this.method1038(this.field1049);
                var3 = 0;
                this.field1057 = true;
                if (var4 + 256 > this.field1049) {
                    var4 = this.field1049 - 256;
                    this.field1051 = var4 - this.field1061;
                }
            }
            while (var3 < var4) {
                this.method1035(this.field1052, 256);
                this.method1031();
                var3 += 256;
            }
            if (var1 > this.field1056) {
                if (this.field1057) {
                    this.field1057 = false;
                } else if (this.field1045 == 0 && this.field1054 == 0) {
                    this.method1040();
                    this.field1043 = var1 + 2000L;
                    return;
                } else {
                    this.field1051 = Math.min(this.field1054, this.field1045);
                    this.field1054 = this.field1045;
                }
                this.field1045 = 0;
                this.field1056 = var1 + 2000L;
            }
            this.field1055 = var3;
        } catch (Exception var8) {
            this.method1040();
            this.field1043 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1048 + 500000L) {
                var1 = this.field1048;
            }
            while (var1 > this.field1048 + 5000L) {
                this.method1034(256);
                this.field1048 += (long) (256000 / Statics.field1046);
            }
        } catch (Exception var7) {
            this.field1048 = var1;
        }
    }

    @ObfuscatedName("bc.r(B)V")
    public final void method1069() {
        this.field1057 = true;
    }

    @ObfuscatedName("bc.w(B)V")
    public final synchronized void method1041() {
        this.field1057 = true;
        try {
            this.method1044();
        } catch (Exception var2) {
            this.method1040();
            this.field1043 = class163.method225() + 2000L;
        }
    }

    @ObfuscatedName("bc.j(I)V")
    public final synchronized void method1033() {
        if (Statics.field1050 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1050.field1096[var2] == this) {
                    Statics.field1050.field1096[var2] = null;
                }
                if (Statics.field1050.field1096[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1050.field1092 = true;
                while (Statics.field1050.field1093) {
                    class169.method3344(50L);
                }
                Statics.field1050 = null;
            }
        }
        this.method1040();
        this.field1052 = null;
    }

    @ObfuscatedName("bc.c(II)V")
    public final void method1034(int arg0) {
        this.field1059 -= arg0;
        if (this.field1059 < 0) {
            this.field1059 = 0;
        }
        if (this.field1042 != null) {
            this.field1042.method919(arg0);
        }
    }

    @ObfuscatedName("bc.g([II)V")
    public final void method1035(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1058) {
            var3 = arg1 << 1;
        }
        class171.method3022(arg0, 0, var3);
        this.field1059 -= arg1;
        if (this.field1042 != null && this.field1059 <= 0) {
            this.field1059 += Statics.field1046 >> 4;
            method1929(this.field1042);
            this.method1036(this.field1042, this.field1042.method1141());
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
                        class69 var11 = this.field1060[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1146;
                                if (var12 == null || var12.field1177 <= var8) {
                                    var11.field1143 = true;
                                    int var13 = var11.method898();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1177 += var13;
                                    }
                                    if (var4 >= this.field1047) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method896();
                                    if (var14 != null) {
                                        int var15 = var11.field1144;
                                        while (var14 != null) {
                                            this.method1036(var14, var15 * var14.method1141() >> 8);
                                            var14 = var11.method897();
                                        }
                                    }
                                    class69 var16 = var11.field1145;
                                    var11.field1145 = null;
                                    if (var10 == null) {
                                        this.field1060[var7] = var16;
                                    } else {
                                        var10.field1145 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1041[var7] = var10;
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
                class69 var18 = this.field1060[var17];
                class69[] var19 = this.field1060;
                this.field1041[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1145;
                    var18.field1145 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1059 < 0) {
            this.field1059 = 0;
        }
        if (this.field1042 != null) {
            this.field1042.method907(arg0, 0, arg1);
        }
        this.field1048 = class163.method225();
    }

    @ObfuscatedName("dd.i(Lbs;B)V")
    public static final void method1929(class69 arg0) {
        arg0.field1143 = false;
        if (arg0.field1146 != null) {
            arg0.field1146.field1177 = 0;
        }
        for (class69 var1 = arg0.method896(); var1 != null; var1 = arg0.method897()) {
            method1929(var1);
        }
    }

    @ObfuscatedName("bc.v(Lbs;II)V")
    public final void method1036(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1041[var3];
        if (var4 == null) {
            this.field1060[var3] = arg0;
        } else {
            var4.field1145 = arg0;
        }
        this.field1041[var3] = arg0;
        arg0.field1144 = arg1;
    }

    @ObfuscatedName("bc.a(Ljava/awt/Component;B)V")
    public void method1037(Component arg0) throws Exception {
    }

    @ObfuscatedName("bc.h(II)V")
    public void method1038(int arg0) throws Exception {
    }

    @ObfuscatedName("bc.p(I)I")
    public int method1032() throws Exception {
        return this.field1049;
    }

    @ObfuscatedName("bc.t()V")
    public void method1031() throws Exception {
    }

    @ObfuscatedName("bc.f(B)V")
    public void method1040() {
    }

    @ObfuscatedName("bc.z(I)V")
    public void method1044() throws Exception {
    }
}
