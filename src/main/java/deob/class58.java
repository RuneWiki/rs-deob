package deob;

import java.awt.Component;

@ObfuscatedName("bu")
public class class58 {

    @ObfuscatedName("bu.l")
    public int[] field1065;

    @ObfuscatedName("bu.n")
    public class69 field1072;

    @ObfuscatedName("bu.m")
    public int field1067 = 32;

    @ObfuscatedName("bu.w")
    public long field1068 = class156.method848();

    @ObfuscatedName("bu.j")
    public int field1085;

    @ObfuscatedName("bu.s")
    public int field1070;

    @ObfuscatedName("bu.q")
    public int field1071;

    @ObfuscatedName("bu.d")
    public long field1082 = 0L;

    @ObfuscatedName("bu.p")
    public int field1073 = 0;

    @ObfuscatedName("bu.y")
    public int field1074 = 0;

    @ObfuscatedName("bu.a")
    public int field1075 = 0;

    @ObfuscatedName("bu.v")
    public long field1076 = 0L;

    @ObfuscatedName("bu.z")
    public boolean field1077 = true;

    @ObfuscatedName("bu.c")
    public int field1062 = 0;

    @ObfuscatedName("bu.e")
    public class69[] field1069 = new class69[8];

    @ObfuscatedName("bu.am")
    public class69[] field1080 = new class69[8];

    @ObfuscatedName("dr.f(Lcd;Ljava/awt/Component;IIB)Lbu;")
    public static final class58 method1993(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1078 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1065 = new int[256 * (Statics.field1079 ? 2 : 1)];
                var4.field1070 = arg3;
                var4.method1067(arg1);
                var4.field1085 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1085 > 16384) {
                    var4.field1085 = 16384;
                }
                var4.method1100(var4.field1085);
                if (Statics.field3187 > 0 && Statics.field908 == null) {
                    Statics.field908 = new class64();
                    Statics.field908.field1116 = arg0;
                    arg0.method1885(Statics.field908, Statics.field3187);
                }
                if (Statics.field908 != null) {
                    if (Statics.field908.field1115[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field908.field1115[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bu.i(Lbm;I)V")
    public final synchronized void method1059(class69 arg0) {
        this.field1072 = arg0;
    }

    @ObfuscatedName("bu.u(B)V")
    public final synchronized void method1060() {
        if (this.field1065 == null) {
            return;
        }
        long var1 = class156.method848();
        try {
            if (this.field1082 != 0L) {
                if (var1 < this.field1082) {
                    return;
                }
                this.method1100(this.field1085);
                this.field1082 = 0L;
                this.field1077 = true;
            }
            int var3 = this.method1098();
            if (this.field1075 - var3 > this.field1073) {
                this.field1073 = this.field1075 - var3;
            }
            int var4 = this.field1071 + this.field1070;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1085) {
                this.field1085 += 1024;
                if (this.field1085 > 16384) {
                    this.field1085 = 16384;
                }
                this.method1071();
                this.method1100(this.field1085);
                var3 = 0;
                this.field1077 = true;
                if (var4 + 256 > this.field1085) {
                    var4 = this.field1085 - 256;
                    this.field1071 = var4 - this.field1070;
                }
            }
            while (var3 < var4) {
                this.method1087(this.field1065, 256);
                this.method1070();
                var3 += 256;
            }
            if (var1 > this.field1076) {
                if (this.field1077) {
                    this.field1077 = false;
                } else if (this.field1073 == 0 && this.field1074 == 0) {
                    this.method1071();
                    this.field1082 = var1 + 2000L;
                    return;
                } else {
                    this.field1071 = Math.min(this.field1074, this.field1073);
                    this.field1074 = this.field1073;
                }
                this.field1073 = 0;
                this.field1076 = var1 + 2000L;
            }
            this.field1075 = var3;
        } catch (Exception var8) {
            this.method1071();
            this.field1082 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1068 + 500000L) {
                var1 = this.field1068;
            }
            while (var1 > this.field1068 + 5000L) {
                this.method1064(256);
                this.field1068 += (long) (256000 / Statics.field1078);
            }
        } catch (Exception var7) {
            this.field1068 = var1;
        }
    }

    @ObfuscatedName("bu.r(I)V")
    public final void method1061() {
        this.field1077 = true;
    }

    @ObfuscatedName("bu.o(I)V")
    public final synchronized void method1062() {
        this.field1077 = true;
        try {
            this.method1072();
        } catch (Exception var2) {
            this.method1071();
            this.field1082 = class156.method848() + 2000L;
        }
    }

    @ObfuscatedName("bu.l(I)V")
    public final synchronized void method1091() {
        if (Statics.field908 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field908.field1115[var2] == this) {
                    Statics.field908.field1115[var2] = null;
                }
                if (Statics.field908.field1115[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field908.field1114 = true;
                while (Statics.field908.field1117) {
                    class162.method2141(50L);
                }
                Statics.field908 = null;
            }
        }
        this.method1071();
        this.field1065 = null;
    }

    @ObfuscatedName("bu.n(II)V")
    public final void method1064(int arg0) {
        this.field1062 -= arg0;
        if (this.field1062 < 0) {
            this.field1062 = 0;
        }
        if (this.field1072 != null) {
            this.field1072.method929(arg0);
        }
    }

    @ObfuscatedName("bu.m([II)V")
    public final void method1087(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1079) {
            var3 = arg1 << 1;
        }
        class164.method2942(arg0, 0, var3);
        this.field1062 -= arg1;
        if (this.field1072 != null && this.field1062 <= 0) {
            this.field1062 += Statics.field1078 >> 4;
            method847(this.field1072);
            this.method1066(this.field1072, this.field1072.method1162());
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
                        class69 var11 = this.field1069[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1165;
                                if (var12 == null || var12.field1199 <= var8) {
                                    var11.field1168 = true;
                                    int var13 = var11.method960();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1199 += var13;
                                    }
                                    if (var4 >= this.field1067) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method936();
                                    if (var14 != null) {
                                        int var15 = var11.field1166;
                                        while (var14 != null) {
                                            this.method1066(var14, var15 * var14.method1162() >> 8);
                                            var14 = var11.method928();
                                        }
                                    }
                                    class69 var16 = var11.field1167;
                                    var11.field1167 = null;
                                    if (var10 == null) {
                                        this.field1069[var7] = var16;
                                    } else {
                                        var10.field1167 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1080[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1167;
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
                class69 var18 = this.field1069[var17];
                class69[] var19 = this.field1069;
                this.field1080[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1167;
                    var18.field1167 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1062 < 0) {
            this.field1062 = 0;
        }
        if (this.field1072 != null) {
            this.field1072.method930(arg0, 0, arg1);
        }
        this.field1068 = class156.method848();
    }

    @ObfuscatedName("aa.w(Lbm;B)V")
    public static final void method847(class69 arg0) {
        arg0.field1168 = false;
        if (arg0.field1165 != null) {
            arg0.field1165.field1199 = 0;
        }
        for (class69 var1 = arg0.method936(); var1 != null; var1 = arg0.method928()) {
            method847(var1);
        }
    }

    @ObfuscatedName("bu.j(Lbm;II)V")
    public final void method1066(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1080[var3];
        if (var4 == null) {
            this.field1069[var3] = arg0;
        } else {
            var4.field1167 = arg0;
        }
        this.field1080[var3] = arg0;
        arg0.field1166 = arg1;
    }

    @ObfuscatedName("bu.s(Ljava/awt/Component;I)V")
    public void method1067(Component arg0) throws Exception {
    }

    @ObfuscatedName("bu.q(II)V")
    public void method1100(int arg0) throws Exception {
    }

    @ObfuscatedName("bu.d(I)I")
    public int method1098() throws Exception {
        return this.field1085;
    }

    @ObfuscatedName("bu.p()V")
    public void method1070() throws Exception {
    }

    @ObfuscatedName("bu.y(I)V")
    public void method1071() {
    }

    @ObfuscatedName("bu.a(I)V")
    public void method1072() throws Exception {
    }
}
