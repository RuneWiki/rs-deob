package deob;

import java.awt.Component;

@ObfuscatedName("am")
public class class50 {

    @ObfuscatedName("am.w")
    public int[] field1091;

    @ObfuscatedName("am.e")
    public class60 field1079;

    @ObfuscatedName("am.o")
    public int field1074 = 32;

    @ObfuscatedName("am.v")
    public long field1075 = class103.method1066();

    @ObfuscatedName("am.z")
    public int field1083;

    @ObfuscatedName("am.j")
    public int field1077;

    @ObfuscatedName("am.r")
    public int field1078;

    @ObfuscatedName("am.c")
    public long field1087 = 0L;

    @ObfuscatedName("am.u")
    public int field1080 = 0;

    @ObfuscatedName("am.h")
    public int field1081 = 0;

    @ObfuscatedName("am.t")
    public int field1072 = 0;

    @ObfuscatedName("am.f")
    public long field1070 = 0L;

    @ObfuscatedName("am.g")
    public boolean field1084 = true;

    @ObfuscatedName("am.al")
    public int field1076 = 0;

    @ObfuscatedName("am.aa")
    public class60[] field1088 = new class60[8];

    @ObfuscatedName("am.ar")
    public class60[] field1089 = new class60[8];

    @ObfuscatedName("h.b(IZIB)V")
    public static final void method484(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1082 = arg0;
        Statics.field1071 = arg1;
        Statics.field1799 = arg2;
    }

    @ObfuscatedName("t.l(Ldt;Ljava/awt/Component;III)Lam;")
    public static final class50 method493(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1082 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1091 = new int[(Statics.field1071 ? 2 : 1) * 256];
                var4.field1077 = arg3;
                var4.method947(arg1);
                var4.field1083 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1083 > 16384) {
                    var4.field1083 = 16384;
                }
                var4.method934(var4.field1083);
                if (Statics.field1799 > 0 && Statics.field216 == null) {
                    Statics.field216 = new class66();
                    Statics.field216.field1246 = arg0;
                    arg0.method2458(Statics.field216, Statics.field1799);
                }
                if (Statics.field216 != null) {
                    if (Statics.field216.field1244[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field216.field1244[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1091 = new int[(Statics.field1071 ? 2 : 1) * 256];
                    var6.field1077 = arg3;
                    var6.method947(arg1);
                    var6.field1083 = 16384;
                    var6.method934(var6.field1083);
                    if (Statics.field1799 > 0 && Statics.field216 == null) {
                        Statics.field216 = new class66();
                        Statics.field216.field1246 = arg0;
                        arg0.method2458(Statics.field216, Statics.field1799);
                    }
                    if (Statics.field216 != null) {
                        if (Statics.field216.field1244[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field216.field1244[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("am.al(Lbn;B)V")
    public final synchronized void method1004(class60 arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("am.aa(B)V")
    public final synchronized void method1005() {
        if (this.field1091 == null) {
            return;
        }
        long var1 = class103.method1066();
        try {
            if (this.field1087 != 0L) {
                if (var1 < this.field1087) {
                    return;
                }
                this.method934(this.field1083);
                this.field1087 = 0L;
                this.field1084 = true;
            }
            int var3 = this.method935();
            if (this.field1072 - var3 > this.field1080) {
                this.field1080 = this.field1072 - var3;
            }
            int var4 = this.field1078 + this.field1077;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1083) {
                this.field1083 += 1024;
                if (this.field1083 > 16384) {
                    this.field1083 = 16384;
                }
                this.method937();
                this.method934(this.field1083);
                var3 = 0;
                this.field1084 = true;
                if (var4 + 256 > this.field1083) {
                    var4 = this.field1083 - 256;
                    this.field1078 = var4 - this.field1077;
                }
            }
            while (var3 < var4) {
                this.method1009(this.field1091, 256);
                this.method936();
                var3 += 256;
            }
            if (var1 > this.field1070) {
                if (this.field1084) {
                    this.field1084 = false;
                } else if (this.field1080 == 0 && this.field1081 == 0) {
                    this.method937();
                    this.field1087 = var1 + 2000L;
                    return;
                } else {
                    this.field1078 = Math.min(this.field1081, this.field1080);
                    this.field1081 = this.field1080;
                }
                this.field1080 = 0;
                this.field1070 = var1 + 2000L;
            }
            this.field1072 = var3;
        } catch (Exception var8) {
            this.method937();
            this.field1087 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1075 + 500000L) {
                var1 = this.field1075;
            }
            while (var1 > this.field1075 + 5000L) {
                this.method1018(256);
                this.field1075 += (long) (256000 / Statics.field1082);
            }
        } catch (Exception var7) {
            this.field1075 = var1;
        }
    }

    @ObfuscatedName("am.ar(I)V")
    public final void method1008() {
        this.field1084 = true;
    }

    @ObfuscatedName("am.ak(B)V")
    public final synchronized void method1006() {
        this.field1084 = true;
        try {
            this.method949();
        } catch (Exception var2) {
            this.method937();
            this.field1087 = class103.method1066() + 2000L;
        }
    }

    @ObfuscatedName("am.ay(I)V")
    public final synchronized void method1007() {
        if (Statics.field216 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field216.field1244[var2] == this) {
                    Statics.field216.field1244[var2] = null;
                }
                if (Statics.field216.field1244[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field216.field1245 = true;
                while (Statics.field216.field1249) {
                    class114.method25(50L);
                }
                Statics.field216 = null;
            }
        }
        this.method937();
        this.field1091 = null;
    }

    @ObfuscatedName("am.aw(II)V")
    public final void method1018(int arg0) {
        this.field1076 -= arg0;
        if (this.field1076 < 0) {
            this.field1076 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method966(arg0);
        }
    }

    @ObfuscatedName("am.av([II)V")
    public final void method1009(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1071) {
            var3 = arg1 << 1;
        }
        class108.method2321(arg0, 0, var3);
        this.field1076 -= arg1;
        if (this.field1079 != null && this.field1076 <= 0) {
            this.field1076 += Statics.field1082 >> 4;
            method772(this.field1079);
            this.method1010(this.field1079, this.field1079.method1215());
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
                        class60 var10 = null;
                        class60 var11 = this.field1088[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1162;
                                if (var12 == null || var12.field1158 <= var8) {
                                    var11.field1161 = true;
                                    int var13 = var11.method967();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1158 += var13;
                                    }
                                    if (var4 >= this.field1074) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method961();
                                    if (var14 != null) {
                                        int var15 = var11.field1160;
                                        while (var14 != null) {
                                            this.method1010(var14, var15 * var14.method1215() >> 8);
                                            var14 = var11.method962();
                                        }
                                    }
                                    class60 var16 = var11.field1159;
                                    var11.field1159 = null;
                                    if (var10 == null) {
                                        this.field1088[var7] = var16;
                                    } else {
                                        var10.field1159 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1089[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1159;
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
                class60 var18 = this.field1088[var17];
                class60[] var19 = this.field1088;
                this.field1089[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1159;
                    var18.field1159 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1076 < 0) {
            this.field1076 = 0;
        }
        if (this.field1079 != null) {
            this.field1079.method963(arg0, 0, arg1);
        }
        this.field1075 = class103.method1066();
    }

    @ObfuscatedName("aj.at(Lbn;I)V")
    public static final void method772(class60 arg0) {
        arg0.field1161 = false;
        if (arg0.field1162 != null) {
            arg0.field1162.field1158 = 0;
        }
        for (class60 var1 = arg0.method961(); var1 != null; var1 = arg0.method962()) {
            method772(var1);
        }
    }

    @ObfuscatedName("am.af(Lbn;IB)V")
    public final void method1010(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1089[var3];
        if (var4 == null) {
            this.field1088[var3] = arg0;
        } else {
            var4.field1159 = arg0;
        }
        this.field1089[var3] = arg0;
        arg0.field1160 = arg1;
    }

    @ObfuscatedName("am.n(Ljava/awt/Component;)V")
    public void method947(Component arg0) throws Exception {
    }

    @ObfuscatedName("am.x(I)V")
    public void method934(int arg0) throws Exception {
    }

    @ObfuscatedName("am.k()I")
    public int method935() throws Exception {
        return this.field1083;
    }

    @ObfuscatedName("am.i()V")
    public void method936() throws Exception {
    }

    @ObfuscatedName("am.d()V")
    public void method937() {
    }

    @ObfuscatedName("am.q()V")
    public void method949() throws Exception {
    }
}
