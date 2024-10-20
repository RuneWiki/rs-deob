package deob;

import java.awt.Component;

@ObfuscatedName("ah")
public class class50 {

    @ObfuscatedName("ah.p")
    public int[] field1055;

    @ObfuscatedName("ah.h")
    public class60 field1045;

    @ObfuscatedName("ah.r")
    public int field1046 = 32;

    @ObfuscatedName("ah.o")
    public long field1047 = class103.method26();

    @ObfuscatedName("ah.f")
    public int field1048;

    @ObfuscatedName("ah.u")
    public int field1049;

    @ObfuscatedName("ah.c")
    public int field1050;

    @ObfuscatedName("ah.l")
    public long field1051 = 0L;

    @ObfuscatedName("ah.w")
    public int field1052 = 0;

    @ObfuscatedName("ah.x")
    public int field1053 = 0;

    @ObfuscatedName("ah.t")
    public int field1054 = 0;

    @ObfuscatedName("ah.k")
    public long field1062 = 0L;

    @ObfuscatedName("ah.e")
    public boolean field1043 = true;

    @ObfuscatedName("ah.aq")
    public int field1056 = 0;

    @ObfuscatedName("ah.ao")
    public class60[] field1060 = new class60[8];

    @ObfuscatedName("ah.ag")
    public class60[] field1061 = new class60[8];

    @ObfuscatedName("az.m(Lde;Ljava/awt/Component;III)Lah;")
    public static final class50 method676(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1044 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1055 = new int[(Statics.field1042 ? 2 : 1) * 256];
                var4.field1049 = arg3;
                var4.method912(arg1);
                var4.field1048 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1048 > 16384) {
                    var4.field1048 = 16384;
                }
                var4.method913(var4.field1048);
                if (Statics.field510 > 0 && Statics.field1744 == null) {
                    Statics.field1744 = new class66();
                    Statics.field1744.field1221 = arg0;
                    arg0.method2484(Statics.field1744, Statics.field510);
                }
                if (Statics.field1744 != null) {
                    if (Statics.field1744.field1217[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1744.field1217[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1055 = new int[256 * (Statics.field1042 ? 2 : 1)];
                    var6.field1049 = arg3;
                    var6.method912(arg1);
                    var6.field1048 = 16384;
                    var6.method913(var6.field1048);
                    if (Statics.field510 > 0 && Statics.field1744 == null) {
                        Statics.field1744 = new class66();
                        Statics.field1744.field1221 = arg0;
                        arg0.method2484(Statics.field1744, Statics.field510);
                    }
                    if (Statics.field1744 != null) {
                        if (Statics.field1744.field1217[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1744.field1217[arg2] = var6;
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

    @ObfuscatedName("ah.g(Lbq;B)V")
    public final synchronized void method968(class60 arg0) {
        this.field1045 = arg0;
    }

    @ObfuscatedName("ah.aq(B)V")
    public final synchronized void method969() {
        if (this.field1055 == null) {
            return;
        }
        long var1 = class103.method26();
        try {
            if (this.field1051 != 0L) {
                if (var1 < this.field1051) {
                    return;
                }
                this.method913(this.field1048);
                this.field1051 = 0L;
                this.field1043 = true;
            }
            int var3 = this.method914();
            if (this.field1054 - var3 > this.field1052) {
                this.field1052 = this.field1054 - var3;
            }
            int var4 = this.field1050 + this.field1049;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1048) {
                this.field1048 += 1024;
                if (this.field1048 > 16384) {
                    this.field1048 = 16384;
                }
                this.method911();
                this.method913(this.field1048);
                var3 = 0;
                this.field1043 = true;
                if (var4 + 256 > this.field1048) {
                    var4 = this.field1048 - 256;
                    this.field1050 = var4 - this.field1049;
                }
            }
            while (var3 < var4) {
                this.method975(this.field1055, 256);
                this.method915();
                var3 += 256;
            }
            if (var1 > this.field1062) {
                if (this.field1043) {
                    this.field1043 = false;
                } else if (this.field1052 == 0 && this.field1053 == 0) {
                    this.method911();
                    this.field1051 = var1 + 2000L;
                    return;
                } else {
                    this.field1050 = Math.min(this.field1053, this.field1052);
                    this.field1053 = this.field1052;
                }
                this.field1052 = 0;
                this.field1062 = var1 + 2000L;
            }
            this.field1054 = var3;
        } catch (Exception var8) {
            this.method911();
            this.field1051 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1047 + 500000L) {
                var1 = this.field1047;
            }
            while (var1 > this.field1047 + 5000L) {
                this.method984(256);
                this.field1047 += (long) (256000 / Statics.field1044);
            }
        } catch (Exception var7) {
            this.field1047 = var1;
        }
    }

    @ObfuscatedName("ah.ao(I)V")
    public final void method970() {
        this.field1043 = true;
    }

    @ObfuscatedName("ah.af(I)V")
    public final synchronized void method971() {
        this.field1043 = true;
        try {
            this.method917();
        } catch (Exception var2) {
            this.method911();
            this.field1051 = class103.method26() + 2000L;
        }
    }

    @ObfuscatedName("ah.ag(B)V")
    public final synchronized void method992() {
        if (Statics.field1744 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1744.field1217[var2] == this) {
                    Statics.field1744.field1217[var2] = null;
                }
                if (Statics.field1744.field1217[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1744.field1218 = true;
                while (Statics.field1744.field1219) {
                    class114.method1960(50L);
                }
                Statics.field1744 = null;
            }
        }
        this.method911();
        this.field1055 = null;
    }

    @ObfuscatedName("ah.ad(II)V")
    public final void method984(int arg0) {
        this.field1056 -= arg0;
        if (this.field1056 < 0) {
            this.field1056 = 0;
        }
        if (this.field1045 != null) {
            this.field1045.method945(arg0);
        }
    }

    @ObfuscatedName("ah.ak([II)V")
    public final void method975(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1042) {
            var3 = arg1 << 1;
        }
        class108.method2333(arg0, 0, var3);
        this.field1056 -= arg1;
        if (this.field1045 != null && this.field1056 <= 0) {
            this.field1056 += Statics.field1044 >> 4;
            method812(this.field1045);
            this.method973(this.field1045, this.field1045.method1069());
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
                        class60 var11 = this.field1060[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1132;
                                if (var12 == null || var12.field1131 <= var8) {
                                    var11.field1134 = true;
                                    int var13 = var11.method942();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1131 += var13;
                                    }
                                    if (var4 >= this.field1046) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method943();
                                    if (var14 != null) {
                                        int var15 = var11.field1135;
                                        while (var14 != null) {
                                            this.method973(var14, var15 * var14.method1069() >> 8);
                                            var14 = var11.method941();
                                        }
                                    }
                                    class60 var16 = var11.field1133;
                                    var11.field1133 = null;
                                    if (var10 == null) {
                                        this.field1060[var7] = var16;
                                    } else {
                                        var10.field1133 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1061[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1133;
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
                class60 var18 = this.field1060[var17];
                class60[] var19 = this.field1060;
                this.field1061[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1133;
                    var18.field1133 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1056 < 0) {
            this.field1056 = 0;
        }
        if (this.field1045 != null) {
            this.field1045.method946(arg0, 0, arg1);
        }
        this.field1047 = class103.method26();
    }

    @ObfuscatedName("an.aj(Lbq;I)V")
    public static final void method812(class60 arg0) {
        arg0.field1134 = false;
        if (arg0.field1132 != null) {
            arg0.field1132.field1131 = 0;
        }
        for (class60 var1 = arg0.method943(); var1 != null; var1 = arg0.method941()) {
            method812(var1);
        }
    }

    @ObfuscatedName("ah.as(Lbq;IB)V")
    public final void method973(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1061[var3];
        if (var4 == null) {
            this.field1060[var3] = arg0;
        } else {
            var4.field1133 = arg0;
        }
        this.field1061[var3] = arg0;
        arg0.field1135 = arg1;
    }

    @ObfuscatedName("ah.z(Ljava/awt/Component;)V")
    public void method912(Component arg0) throws Exception {
    }

    @ObfuscatedName("ah.j(I)V")
    public void method913(int arg0) throws Exception {
    }

    @ObfuscatedName("ah.a()I")
    public int method914() throws Exception {
        return this.field1048;
    }

    @ObfuscatedName("ah.y()V")
    public void method915() throws Exception {
    }

    @ObfuscatedName("ah.i()V")
    public void method911() {
    }

    @ObfuscatedName("ah.b()V")
    public void method917() throws Exception {
    }
}
