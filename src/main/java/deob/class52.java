package deob;

import java.awt.Component;

@ObfuscatedName("at")
public class class52 {

    @ObfuscatedName("at.j")
    public int[] field1098;

    @ObfuscatedName("at.f")
    public class48 field1111;

    @ObfuscatedName("at.h")
    public int field1100 = 32;

    @ObfuscatedName("at.o")
    public long field1101 = class121.method2124();

    @ObfuscatedName("at.z")
    public int field1102;

    @ObfuscatedName("at.k")
    public int field1116;

    @ObfuscatedName("at.y")
    public int field1108;

    @ObfuscatedName("at.g")
    public long field1105 = 0L;

    @ObfuscatedName("at.e")
    public int field1099 = 0;

    @ObfuscatedName("at.s")
    public int field1103 = 0;

    @ObfuscatedName("at.t")
    public int field1096 = 0;

    @ObfuscatedName("at.r")
    public long field1109 = 0L;

    @ObfuscatedName("at.w")
    public boolean field1110 = true;

    @ObfuscatedName("at.aq")
    public int field1106 = 0;

    @ObfuscatedName("at.ap")
    public class48[] field1113 = new class48[8];

    @ObfuscatedName("at.aa")
    public class48[] field1114 = new class48[8];

    @ObfuscatedName("ai.n(IZII)V")
    public static final void method667(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field763 = arg0;
        Statics.field2711 = arg1;
        Statics.field90 = arg2;
    }

    @ObfuscatedName("ax.c(Lbl;Ljava/awt/Component;IIB)Lat;")
    public static final class52 method544(class74 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field763 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class51 var4 = new class51();
                var4.field1098 = new int[256 * (Statics.field2711 ? 2 : 1)];
                var4.field1116 = arg3;
                var4.method912(arg1);
                var4.field1102 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1102 > 16384) {
                    var4.field1102 = 16384;
                }
                var4.method895(var4.field1102);
                if (Statics.field90 > 0 && Statics.field1107 == null) {
                    Statics.field1107 = new class55();
                    Statics.field1107.field1181 = arg0;
                    arg0.method1455(Statics.field1107, Statics.field90);
                }
                if (Statics.field1107 != null) {
                    if (Statics.field1107.field1180[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1107.field1180[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class44 var6 = new class44(arg0, arg2);
                    var6.field1098 = new int[(Statics.field2711 ? 2 : 1) * 256];
                    var6.field1116 = arg3;
                    var6.method912(arg1);
                    var6.field1102 = 16384;
                    var6.method895(var6.field1102);
                    if (Statics.field90 > 0 && Statics.field1107 == null) {
                        Statics.field1107 = new class55();
                        Statics.field1107.field1181 = arg0;
                        arg0.method1455(Statics.field1107, Statics.field90);
                    }
                    if (Statics.field1107 != null) {
                        if (Statics.field1107.field1180[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1107.field1180[arg2] = var6;
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

    @ObfuscatedName("at.az(Lay;I)V")
    public final synchronized void method1132(class48 arg0) {
        this.field1111 = arg0;
    }

    @ObfuscatedName("at.ax(B)V")
    public final synchronized void method1117() {
        if (this.field1098 == null) {
            return;
        }
        long var1 = class121.method2124();
        try {
            if (this.field1105 != 0L) {
                if (var1 < this.field1105) {
                    return;
                }
                this.method895(this.field1102);
                this.field1105 = 0L;
                this.field1110 = true;
            }
            int var3 = this.method896();
            if (this.field1096 - var3 > this.field1099) {
                this.field1099 = this.field1096 - var3;
            }
            int var4 = this.field1116 + this.field1108;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1102) {
                this.field1102 += 1024;
                if (this.field1102 > 16384) {
                    this.field1102 = 16384;
                }
                this.method898();
                this.method895(this.field1102);
                var3 = 0;
                this.field1110 = true;
                if (var4 + 256 > this.field1102) {
                    var4 = this.field1102 - 256;
                    this.field1108 = var4 - this.field1116;
                }
            }
            while (var3 < var4) {
                this.method1120(this.field1098, 256);
                this.method897();
                var3 += 256;
            }
            if (var1 > this.field1109) {
                if (this.field1110) {
                    this.field1110 = false;
                } else if (this.field1099 == 0 && this.field1103 == 0) {
                    this.method898();
                    this.field1105 = var1 + 2000L;
                    return;
                } else {
                    this.field1108 = Math.min(this.field1103, this.field1099);
                    this.field1103 = this.field1099;
                }
                this.field1099 = 0;
                this.field1109 = var1 + 2000L;
            }
            this.field1096 = var3;
        } catch (Exception var8) {
            this.method898();
            this.field1105 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1101 + 500000L) {
                var1 = this.field1101;
            }
            while (var1 > this.field1101 + 5000L) {
                this.method1119(256);
                this.field1101 += (long) (256000 / Statics.field763);
            }
        } catch (Exception var7) {
            this.field1101 = var1;
        }
    }

    @ObfuscatedName("at.aq(I)V")
    public final void method1144() {
        this.field1110 = true;
    }

    @ObfuscatedName("at.ap(B)V")
    public final synchronized void method1133() {
        this.field1110 = true;
        try {
            this.method899();
        } catch (Exception var2) {
            this.method898();
            this.field1105 = class121.method2124() + 2000L;
        }
    }

    @ObfuscatedName("at.aa(I)V")
    public final synchronized void method1118() {
        if (Statics.field1107 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1107.field1180[var2] == this) {
                    Statics.field1107.field1180[var2] = null;
                }
                if (Statics.field1107.field1180[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1107.field1188 = true;
                while (Statics.field1107.field1182) {
                    class126.method1489(50L);
                }
                Statics.field1107 = null;
            }
        }
        this.method898();
        this.field1098 = null;
    }

    @ObfuscatedName("at.ai(IB)V")
    public final void method1119(int arg0) {
        this.field1106 -= arg0;
        if (this.field1106 < 0) {
            this.field1106 = 0;
        }
        if (this.field1111 != null) {
            this.field1111.method1018(arg0);
        }
    }

    @ObfuscatedName("at.ar([II)V")
    public final void method1120(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2711) {
            var3 = arg1 << 1;
        }
        class128.method2614(arg0, 0, var3);
        this.field1106 -= arg1;
        if (this.field1111 != null && this.field1106 <= 0) {
            this.field1106 += Statics.field763 >> 4;
            method628(this.field1111);
            this.method1124(this.field1111, this.field1111.method920());
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
                        class48 var11 = this.field1113[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1075;
                                if (var12 == null || var12.field1071 <= var8) {
                                    var11.field1073 = true;
                                    int var13 = var11.method1019();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1071 += var13;
                                    }
                                    if (var4 >= this.field1100) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method940();
                                    if (var14 != null) {
                                        int var15 = var11.field1072;
                                        while (var14 != null) {
                                            this.method1124(var14, var15 * var14.method920() >> 8);
                                            var14 = var11.method941();
                                        }
                                    }
                                    class48 var16 = var11.field1074;
                                    var11.field1074 = null;
                                    if (var10 == null) {
                                        this.field1113[var7] = var16;
                                    } else {
                                        var10.field1074 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1114[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1074;
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
                class48 var18 = this.field1113[var17];
                class48[] var19 = this.field1113;
                this.field1114[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1074;
                    var18.field1074 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1106 < 0) {
            this.field1106 = 0;
        }
        if (this.field1111 != null) {
            this.field1111.method943(arg0, 0, arg1);
        }
        this.field1101 = class121.method2124();
    }

    @ObfuscatedName("aa.ag(Lay;I)V")
    public static final void method628(class48 arg0) {
        arg0.field1073 = false;
        if (arg0.field1075 != null) {
            arg0.field1075.field1071 = 0;
        }
        for (class48 var1 = arg0.method940(); var1 != null; var1 = arg0.method941()) {
            method628(var1);
        }
    }

    @ObfuscatedName("at.as(Lay;II)V")
    public final void method1124(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1114[var3];
        if (var4 == null) {
            this.field1113[var3] = arg0;
        } else {
            var4.field1074 = arg0;
        }
        this.field1114[var3] = arg0;
        arg0.field1072 = arg1;
    }

    @ObfuscatedName("at.i(Ljava/awt/Component;)V")
    public void method912(Component arg0) throws Exception {
    }

    @ObfuscatedName("at.p(I)V")
    public void method895(int arg0) throws Exception {
    }

    @ObfuscatedName("at.a()I")
    public int method896() throws Exception {
        return this.field1102;
    }

    @ObfuscatedName("at.l()V")
    public void method897() throws Exception {
    }

    @ObfuscatedName("at.q()V")
    public void method898() {
    }

    @ObfuscatedName("at.b()V")
    public void method899() throws Exception {
    }
}
