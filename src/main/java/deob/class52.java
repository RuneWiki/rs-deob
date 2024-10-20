package deob;

import java.awt.Component;

@ObfuscatedName("am")
public class class52 {

    @ObfuscatedName("am.j")
    public int[] field1092;

    @ObfuscatedName("am.x")
    public class62 field1093;

    @ObfuscatedName("am.v")
    public int field1094 = 32;

    @ObfuscatedName("am.a")
    public long field1095 = class107.method591();

    @ObfuscatedName("am.l")
    public int field1096;

    @ObfuscatedName("am.h")
    public int field1103;

    @ObfuscatedName("am.c")
    public int field1098;

    @ObfuscatedName("am.u")
    public long field1111 = 0L;

    @ObfuscatedName("am.r")
    public int field1100 = 0;

    @ObfuscatedName("am.k")
    public int field1101 = 0;

    @ObfuscatedName("am.w")
    public int field1088 = 0;

    @ObfuscatedName("am.q")
    public long field1099 = 0L;

    @ObfuscatedName("am.g")
    public boolean field1104 = true;

    @ObfuscatedName("am.ac")
    public int field1105 = 0;

    @ObfuscatedName("am.au")
    public class62[] field1109 = new class62[8];

    @ObfuscatedName("am.ap")
    public class62[] field1107 = new class62[8];

    @ObfuscatedName("dw.g(IZII)V")
    public static final void method2616(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1106 = arg0;
        Statics.field1089 = arg1;
        Statics.field1102 = arg2;
    }

    @ObfuscatedName("aq.z(Ldp;Ljava/awt/Component;IIB)Lam;")
    public static final class52 method927(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1106 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1092 = new int[256 * (Statics.field1089 ? 2 : 1)];
                var4.field1103 = arg3;
                var4.method1014(arg1);
                var4.field1096 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1096 > 16384) {
                    var4.field1096 = 16384;
                }
                var4.method1015(var4.field1096);
                if (Statics.field1102 > 0 && Statics.field3046 == null) {
                    Statics.field3046 = new class68();
                    Statics.field3046.field1265 = arg0;
                    arg0.method2551(Statics.field3046, Statics.field1102);
                }
                if (Statics.field3046 != null) {
                    if (Statics.field3046.field1259[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3046.field1259[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1092 = new int[(Statics.field1089 ? 2 : 1) * 256];
                    var6.field1103 = arg3;
                    var6.method1014(arg1);
                    var6.field1096 = 16384;
                    var6.method1015(var6.field1096);
                    if (Statics.field1102 > 0 && Statics.field3046 == null) {
                        Statics.field3046 = new class68();
                        Statics.field3046.field1265 = arg0;
                        arg0.method2551(Statics.field3046, Statics.field1102);
                    }
                    if (Statics.field3046 != null) {
                        if (Statics.field3046.field1259[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field3046.field1259[arg2] = var6;
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

    @ObfuscatedName("am.m(Lbw;B)V")
    public final synchronized void method1081(class62 arg0) {
        this.field1093 = arg0;
    }

    @ObfuscatedName("am.y(B)V")
    public final synchronized void method1082() {
        if (this.field1092 == null) {
            return;
        }
        long var1 = class107.method591();
        try {
            if (this.field1111 != 0L) {
                if (var1 < this.field1111) {
                    return;
                }
                this.method1015(this.field1096);
                this.field1111 = 0L;
                this.field1104 = true;
            }
            int var3 = this.method1013();
            if (this.field1088 - var3 > this.field1100) {
                this.field1100 = this.field1088 - var3;
            }
            int var4 = this.field1103 + this.field1098;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1096) {
                this.field1096 += 1024;
                if (this.field1096 > 16384) {
                    this.field1096 = 16384;
                }
                this.method1019();
                this.method1015(this.field1096);
                var3 = 0;
                this.field1104 = true;
                if (var4 + 256 > this.field1096) {
                    var4 = this.field1096 - 256;
                    this.field1098 = var4 - this.field1103;
                }
            }
            while (var3 < var4) {
                this.method1086(this.field1092, 256);
                this.method1017();
                var3 += 256;
            }
            if (var1 > this.field1099) {
                if (this.field1104) {
                    this.field1104 = false;
                } else if (this.field1100 == 0 && this.field1101 == 0) {
                    this.method1019();
                    this.field1111 = var1 + 2000L;
                    return;
                } else {
                    this.field1098 = Math.min(this.field1101, this.field1100);
                    this.field1101 = this.field1100;
                }
                this.field1100 = 0;
                this.field1099 = var1 + 2000L;
            }
            this.field1088 = var3;
        } catch (Exception var8) {
            this.method1019();
            this.field1111 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1095 + 500000L) {
                var1 = this.field1095;
            }
            while (var1 > this.field1095 + 5000L) {
                this.method1085(256);
                this.field1095 += (long) (256000 / Statics.field1106);
            }
        } catch (Exception var7) {
            this.field1095 = var1;
        }
    }

    @ObfuscatedName("am.n(I)V")
    public final void method1083() {
        this.field1104 = true;
    }

    @ObfuscatedName("am.s(I)V")
    public final synchronized void method1092() {
        this.field1104 = true;
        try {
            this.method1018();
        } catch (Exception var2) {
            this.method1019();
            this.field1111 = class107.method591() + 2000L;
        }
    }

    @ObfuscatedName("am.ac(B)V")
    public final synchronized void method1107() {
        if (Statics.field3046 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3046.field1259[var2] == this) {
                    Statics.field3046.field1259[var2] = null;
                }
                if (Statics.field3046.field1259[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3046.field1260 = true;
                while (Statics.field3046.field1261) {
                    class119.method172(50L);
                }
                Statics.field3046 = null;
            }
        }
        this.method1019();
        this.field1092 = null;
    }

    @ObfuscatedName("am.au(II)V")
    public final void method1085(int arg0) {
        this.field1105 -= arg0;
        if (this.field1105 < 0) {
            this.field1105 = 0;
        }
        if (this.field1093 != null) {
            this.field1093.method1043(arg0);
        }
    }

    @ObfuscatedName("am.ap([II)V")
    public final void method1086(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1089) {
            var3 = arg1 << 1;
        }
        class112.method2386(arg0, 0, var3);
        this.field1105 -= arg1;
        if (this.field1093 != null && this.field1105 <= 0) {
            this.field1105 += Statics.field1106 >> 4;
            method646(this.field1093);
            this.method1087(this.field1093, this.field1093.method1184());
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
                        class62 var10 = null;
                        class62 var11 = this.field1109[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1174;
                                if (var12 == null || var12.field1173 <= var8) {
                                    var11.field1177 = true;
                                    int var13 = var11.method1040();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1173 += var13;
                                    }
                                    if (var4 >= this.field1094) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1038();
                                    if (var14 != null) {
                                        int var15 = var11.field1176;
                                        while (var14 != null) {
                                            this.method1087(var14, var15 * var14.method1184() >> 8);
                                            var14 = var11.method1047();
                                        }
                                    }
                                    class62 var16 = var11.field1175;
                                    var11.field1175 = null;
                                    if (var10 == null) {
                                        this.field1109[var7] = var16;
                                    } else {
                                        var10.field1175 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1107[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1175;
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
                class62 var18 = this.field1109[var17];
                class62[] var19 = this.field1109;
                this.field1107[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1175;
                    var18.field1175 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1105 < 0) {
            this.field1105 = 0;
        }
        if (this.field1093 != null) {
            this.field1093.method1041(arg0, 0, arg1);
        }
        this.field1095 = class107.method591();
    }

    @ObfuscatedName("ag.ah(Lbw;I)V")
    public static final void method646(class62 arg0) {
        arg0.field1177 = false;
        if (arg0.field1174 != null) {
            arg0.field1174.field1173 = 0;
        }
        for (class62 var1 = arg0.method1038(); var1 != null; var1 = arg0.method1047()) {
            method646(var1);
        }
    }

    @ObfuscatedName("am.ae(Lbw;II)V")
    public final void method1087(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1107[var3];
        if (var4 == null) {
            this.field1109[var3] = arg0;
        } else {
            var4.field1175 = arg0;
        }
        this.field1107[var3] = arg0;
        arg0.field1176 = arg1;
    }

    @ObfuscatedName("am.t(Ljava/awt/Component;)V")
    public void method1014(Component arg0) throws Exception {
    }

    @ObfuscatedName("am.b(I)V")
    public void method1015(int arg0) throws Exception {
    }

    @ObfuscatedName("am.p()I")
    public int method1013() throws Exception {
        return this.field1096;
    }

    @ObfuscatedName("am.e()V")
    public void method1017() throws Exception {
    }

    @ObfuscatedName("am.i()V")
    public void method1019() {
    }

    @ObfuscatedName("am.o()V")
    public void method1018() throws Exception {
    }
}
