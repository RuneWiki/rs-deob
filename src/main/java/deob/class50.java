package deob;

import java.awt.Component;

@ObfuscatedName("ad")
public class class50 {

    @ObfuscatedName("ad.d")
    public int[] field1086;

    @ObfuscatedName("ad.y")
    public class60 field1087;

    @ObfuscatedName("ad.e")
    public int field1099 = 32;

    @ObfuscatedName("ad.l")
    public long field1083 = class103.method1055();

    @ObfuscatedName("ad.o")
    public int field1090;

    @ObfuscatedName("ad.w")
    public int field1091;

    @ObfuscatedName("ad.t")
    public int field1085;

    @ObfuscatedName("ad.z")
    public long field1093 = 0L;

    @ObfuscatedName("ad.b")
    public int field1094 = 0;

    @ObfuscatedName("ad.a")
    public int field1092 = 0;

    @ObfuscatedName("ad.r")
    public int field1097 = 0;

    @ObfuscatedName("ad.m")
    public long field1088 = 0L;

    @ObfuscatedName("ad.f")
    public boolean field1098 = true;

    @ObfuscatedName("ad.al")
    public int field1089 = 0;

    @ObfuscatedName("ad.au")
    public class60[] field1101 = new class60[8];

    @ObfuscatedName("ad.az")
    public class60[] field1102 = new class60[8];

    @ObfuscatedName("n.f(IZIB)V")
    public static final void method514(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1095 = arg0;
        Statics.field1082 = arg1;
        Statics.field1084 = arg2;
    }

    @ObfuscatedName("k.k(Ldz;Ljava/awt/Component;IIB)Lad;")
    public static final class50 method500(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1095 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1086 = new int[256 * (Statics.field1082 ? 2 : 1)];
                var4.field1091 = arg3;
                var4.method939(arg1);
                var4.field1090 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1090 > 16384) {
                    var4.field1090 = 16384;
                }
                var4.method937(var4.field1090);
                if (Statics.field1084 > 0 && Statics.field1818 == null) {
                    Statics.field1818 = new class66();
                    Statics.field1818.field1256 = arg0;
                    arg0.method2498(Statics.field1818, Statics.field1084);
                }
                if (Statics.field1818 != null) {
                    if (Statics.field1818.field1257[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1818.field1257[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1086 = new int[256 * (Statics.field1082 ? 2 : 1)];
                    var6.field1091 = arg3;
                    var6.method939(arg1);
                    var6.field1090 = 16384;
                    var6.method937(var6.field1090);
                    if (Statics.field1084 > 0 && Statics.field1818 == null) {
                        Statics.field1818 = new class66();
                        Statics.field1818.field1256 = arg0;
                        arg0.method2498(Statics.field1818, Statics.field1084);
                    }
                    if (Statics.field1818 != null) {
                        if (Statics.field1818.field1257[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1818.field1257[arg2] = var6;
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

    @ObfuscatedName("ad.p(Lbk;B)V")
    public final synchronized void method994(class60 arg0) {
        this.field1087 = arg0;
    }

    @ObfuscatedName("ad.n(I)V")
    public final synchronized void method995() {
        if (this.field1086 == null) {
            return;
        }
        long var1 = class103.method1055();
        try {
            if (this.field1093 != 0L) {
                if (var1 < this.field1093) {
                    return;
                }
                this.method937(this.field1090);
                this.field1093 = 0L;
                this.field1098 = true;
            }
            int var3 = this.method934();
            if (this.field1097 - var3 > this.field1094) {
                this.field1094 = this.field1097 - var3;
            }
            int var4 = this.field1091 + this.field1085;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1090) {
                this.field1090 += 1024;
                if (this.field1090 > 16384) {
                    this.field1090 = 16384;
                }
                this.method940();
                this.method937(this.field1090);
                var3 = 0;
                this.field1098 = true;
                if (var4 + 256 > this.field1090) {
                    var4 = this.field1090 - 256;
                    this.field1085 = var4 - this.field1091;
                }
            }
            while (var3 < var4) {
                this.method1015(this.field1086, 256);
                this.method935();
                var3 += 256;
            }
            if (var1 > this.field1088) {
                if (this.field1098) {
                    this.field1098 = false;
                } else if (this.field1094 == 0 && this.field1092 == 0) {
                    this.method940();
                    this.field1093 = var1 + 2000L;
                    return;
                } else {
                    this.field1085 = Math.min(this.field1092, this.field1094);
                    this.field1092 = this.field1094;
                }
                this.field1094 = 0;
                this.field1088 = var1 + 2000L;
            }
            this.field1097 = var3;
        } catch (Exception var8) {
            this.method940();
            this.field1093 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1083 + 500000L) {
                var1 = this.field1083;
            }
            while (var1 > this.field1083 + 5000L) {
                this.method998(256);
                this.field1083 += (long) (256000 / Statics.field1095);
            }
        } catch (Exception var7) {
            this.field1083 = var1;
        }
    }

    @ObfuscatedName("ad.j(I)V")
    public final void method1017() {
        this.field1098 = true;
    }

    @ObfuscatedName("ad.x(B)V")
    public final synchronized void method997() {
        this.field1098 = true;
        try {
            this.method945();
        } catch (Exception var2) {
            this.method940();
            this.field1093 = class103.method1055() + 2000L;
        }
    }

    @ObfuscatedName("ad.al(I)V")
    public final synchronized void method1018() {
        if (Statics.field1818 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1818.field1257[var2] == this) {
                    Statics.field1818.field1257[var2] = null;
                }
                if (Statics.field1818.field1257[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1818.field1263 = true;
                while (Statics.field1818.field1259) {
                    class114.method743(50L);
                }
                Statics.field1818 = null;
            }
        }
        this.method940();
        this.field1086 = null;
    }

    @ObfuscatedName("ad.au(IB)V")
    public final void method998(int arg0) {
        this.field1089 -= arg0;
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method972(arg0);
        }
    }

    @ObfuscatedName("ad.az([II)V")
    public final void method1015(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1082) {
            var3 = arg1 << 1;
        }
        class108.method2356(arg0, 0, var3);
        this.field1089 -= arg1;
        if (this.field1087 != null && this.field1089 <= 0) {
            this.field1089 += Statics.field1095 >> 4;
            method769(this.field1087);
            this.method1000(this.field1087, this.field1087.method1223());
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
                        class60 var11 = this.field1101[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1174;
                                if (var12 == null || var12.field1171 <= var8) {
                                    var11.field1175 = true;
                                    int var13 = var11.method990();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1171 += var13;
                                    }
                                    if (var4 >= this.field1099) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method958();
                                    if (var14 != null) {
                                        int var15 = var11.field1172;
                                        while (var14 != null) {
                                            this.method1000(var14, var15 * var14.method1223() >> 8);
                                            var14 = var11.method959();
                                        }
                                    }
                                    class60 var16 = var11.field1173;
                                    var11.field1173 = null;
                                    if (var10 == null) {
                                        this.field1101[var7] = var16;
                                    } else {
                                        var10.field1173 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1102[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1173;
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
                class60 var18 = this.field1101[var17];
                class60[] var19 = this.field1101;
                this.field1102[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1173;
                    var18.field1173 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1089 < 0) {
            this.field1089 = 0;
        }
        if (this.field1087 != null) {
            this.field1087.method961(arg0, 0, arg1);
        }
        this.field1083 = class103.method1055();
    }

    @ObfuscatedName("ar.ag(Lbk;I)V")
    public static final void method769(class60 arg0) {
        arg0.field1175 = false;
        if (arg0.field1174 != null) {
            arg0.field1174.field1171 = 0;
        }
        for (class60 var1 = arg0.method958(); var1 != null; var1 = arg0.method959()) {
            method769(var1);
        }
    }

    @ObfuscatedName("ad.aj(Lbk;II)V")
    public final void method1000(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1102[var3];
        if (var4 == null) {
            this.field1101[var3] = arg0;
        } else {
            var4.field1173 = arg0;
        }
        this.field1102[var3] = arg0;
        arg0.field1172 = arg1;
    }

    @ObfuscatedName("ad.i(Ljava/awt/Component;)V")
    public void method939(Component arg0) throws Exception {
    }

    @ObfuscatedName("ad.c(I)V")
    public void method937(int arg0) throws Exception {
    }

    @ObfuscatedName("ad.h()I")
    public int method934() throws Exception {
        return this.field1090;
    }

    @ObfuscatedName("ad.v()V")
    public void method935() throws Exception {
    }

    @ObfuscatedName("ad.q()V")
    public void method940() {
    }

    @ObfuscatedName("ad.s()V")
    public void method945() throws Exception {
    }
}
