package deob;

import java.awt.Component;

@ObfuscatedName("as")
public class class52 {

    @ObfuscatedName("as.j")
    public int[] field1107;

    @ObfuscatedName("as.b")
    public class48 field1097;

    @ObfuscatedName("as.t")
    public int field1096 = 32;

    @ObfuscatedName("as.q")
    public long field1099 = class121.method226();

    @ObfuscatedName("as.e")
    public int field1100;

    @ObfuscatedName("as.l")
    public int field1101;

    @ObfuscatedName("as.u")
    public int field1102;

    @ObfuscatedName("as.m")
    public long field1109 = 0L;

    @ObfuscatedName("as.a")
    public int field1104 = 0;

    @ObfuscatedName("as.f")
    public int field1098 = 0;

    @ObfuscatedName("as.y")
    public int field1106 = 0;

    @ObfuscatedName("as.v")
    public long field1091 = 0L;

    @ObfuscatedName("as.w")
    public boolean field1108 = true;

    @ObfuscatedName("as.at")
    public int field1110 = 0;

    @ObfuscatedName("as.aw")
    public class48[] field1111 = new class48[8];

    @ObfuscatedName("as.ax")
    public class48[] field1112 = new class48[8];

    @ObfuscatedName("ah.c(IZIB)V")
    public static final void method892(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1105 = arg0;
        Statics.field1092 = arg1;
        Statics.field1093 = arg2;
    }

    @ObfuscatedName("b.af(Lbf;Ljava/awt/Component;III)Las;")
    public static final class52 method123(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1105 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1107 = new int[256 * (Statics.field1092 ? 2 : 1)];
                var4.field1101 = arg3;
                var4.method945(arg1);
                var4.field1100 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1100 > 16384) {
                    var4.field1100 = 16384;
                }
                var4.method937(var4.field1100);
                if (Statics.field1093 > 0 && Statics.field1094 == null) {
                    Statics.field1094 = new class55();
                    Statics.field1094.field1175 = arg0;
                    arg0.method1521(Statics.field1094, Statics.field1093);
                }
                if (Statics.field1094 != null) {
                    if (Statics.field1094.field1176[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1094.field1176[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1107 = new int[(Statics.field1092 ? 2 : 1) * 256];
                    var6.field1101 = arg3;
                    var6.method945(arg1);
                    var6.field1100 = 16384;
                    var6.method937(var6.field1100);
                    if (Statics.field1093 > 0 && Statics.field1094 == null) {
                        Statics.field1094 = new class55();
                        Statics.field1094.field1175 = arg0;
                        arg0.method1521(Statics.field1094, Statics.field1093);
                    }
                    if (Statics.field1094 != null) {
                        if (Statics.field1094.field1176[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1094.field1176[arg2] = var6;
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

    @ObfuscatedName("as.aq(Lao;I)V")
    public final synchronized void method1179(class48 arg0) {
        this.field1097 = arg0;
    }

    @ObfuscatedName("as.at(I)V")
    public final synchronized void method1180() {
        if (this.field1107 == null) {
            return;
        }
        long var1 = class121.method226();
        try {
            if (this.field1109 != 0L) {
                if (var1 < this.field1109) {
                    return;
                }
                this.method937(this.field1100);
                this.field1109 = 0L;
                this.field1108 = true;
            }
            int var3 = this.method936();
            if (this.field1106 - var3 > this.field1104) {
                this.field1104 = this.field1106 - var3;
            }
            int var4 = this.field1102 + this.field1101;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1100) {
                this.field1100 += 1024;
                if (this.field1100 > 16384) {
                    this.field1100 = 16384;
                }
                this.method940();
                this.method937(this.field1100);
                var3 = 0;
                this.field1108 = true;
                if (var4 + 256 > this.field1100) {
                    var4 = this.field1100 - 256;
                    this.field1102 = var4 - this.field1101;
                }
            }
            while (var3 < var4) {
                this.method1188(this.field1107, 256);
                this.method939();
                var3 += 256;
            }
            if (var1 > this.field1091) {
                if (this.field1108) {
                    this.field1108 = false;
                } else if (this.field1104 == 0 && this.field1098 == 0) {
                    this.method940();
                    this.field1109 = var1 + 2000L;
                    return;
                } else {
                    this.field1102 = Math.min(this.field1098, this.field1104);
                    this.field1098 = this.field1104;
                }
                this.field1104 = 0;
                this.field1091 = var1 + 2000L;
            }
            this.field1106 = var3;
        } catch (Exception var8) {
            this.method940();
            this.field1109 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1099 + 500000L) {
                var1 = this.field1099;
            }
            while (var1 > this.field1099 + 5000L) {
                this.method1184(256);
                this.field1099 += (long) (256000 / Statics.field1105);
            }
        } catch (Exception var7) {
            this.field1099 = var1;
        }
    }

    @ObfuscatedName("as.aw(I)V")
    public final void method1181() {
        this.field1108 = true;
    }

    @ObfuscatedName("as.ax(I)V")
    public final synchronized void method1182() {
        this.field1108 = true;
        try {
            this.method941();
        } catch (Exception var2) {
            this.method940();
            this.field1109 = class121.method226() + 2000L;
        }
    }

    @ObfuscatedName("as.ak(I)V")
    public final synchronized void method1197() {
        if (Statics.field1094 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1094.field1176[var2] == this) {
                    Statics.field1094.field1176[var2] = null;
                }
                if (Statics.field1094.field1176[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1094.field1177 = true;
                while (Statics.field1094.field1185) {
                    class126.method2355(50L);
                }
                Statics.field1094 = null;
            }
        }
        this.method940();
        this.field1107 = null;
    }

    @ObfuscatedName("as.ar(IB)V")
    public final void method1184(int arg0) {
        this.field1110 -= arg0;
        if (this.field1110 < 0) {
            this.field1110 = 0;
        }
        if (this.field1097 != null) {
            this.field1097.method991(arg0);
        }
    }

    @ObfuscatedName("as.az([II)V")
    public final void method1188(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1092) {
            var3 = arg1 << 1;
        }
        class128.method2697(arg0, 0, var3);
        this.field1110 -= arg1;
        if (this.field1097 != null && this.field1110 <= 0) {
            this.field1110 += Statics.field1105 >> 4;
            method29(this.field1097);
            this.method1209(this.field1097, this.field1097.method1047());
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
                        class48 var11 = this.field1111[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1069;
                                if (var12 == null || var12.field1066 <= var8) {
                                    var11.field1070 = true;
                                    int var13 = var11.method985();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1066 += var13;
                                    }
                                    if (var4 >= this.field1096) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method983();
                                    if (var14 != null) {
                                        int var15 = var11.field1067;
                                        while (var14 != null) {
                                            this.method1209(var14, var15 * var14.method1047() >> 8);
                                            var14 = var11.method982();
                                        }
                                    }
                                    class48 var16 = var11.field1068;
                                    var11.field1068 = null;
                                    if (var10 == null) {
                                        this.field1111[var7] = var16;
                                    } else {
                                        var10.field1068 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1112[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1068;
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
                class48 var18 = this.field1111[var17];
                class48[] var19 = this.field1111;
                this.field1112[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1068;
                    var18.field1068 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1110 < 0) {
            this.field1110 = 0;
        }
        if (this.field1097 != null) {
            this.field1097.method986(arg0, 0, arg1);
        }
        this.field1099 = class121.method226();
    }

    @ObfuscatedName("s.ai(Lao;I)V")
    public static final void method29(class48 arg0) {
        arg0.field1070 = false;
        if (arg0.field1069 != null) {
            arg0.field1069.field1066 = 0;
        }
        for (class48 var1 = arg0.method983(); var1 != null; var1 = arg0.method982()) {
            method29(var1);
        }
    }

    @ObfuscatedName("as.aj(Lao;II)V")
    public final void method1209(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1112[var3];
        if (var4 == null) {
            this.field1111[var3] = arg0;
        } else {
            var4.field1068 = arg0;
        }
        this.field1112[var3] = arg0;
        arg0.field1067 = arg1;
    }

    @ObfuscatedName("as.g(Ljava/awt/Component;)V")
    public void method945(Component arg0) throws Exception {
    }

    @ObfuscatedName("as.h(I)V")
    public void method937(int arg0) throws Exception {
    }

    @ObfuscatedName("as.s()I")
    public int method936() throws Exception {
        return this.field1100;
    }

    @ObfuscatedName("as.o()V")
    public void method939() throws Exception {
    }

    @ObfuscatedName("as.p()V")
    public void method940() {
    }

    @ObfuscatedName("as.x()V")
    public void method941() throws Exception {
    }
}
