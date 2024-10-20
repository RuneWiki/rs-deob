package deob;

import java.awt.Component;

@ObfuscatedName("al")
public class class47 {

    @ObfuscatedName("al.j")
    public int[] field1058;

    @ObfuscatedName("al.k")
    public class57 field1067;

    @ObfuscatedName("al.g")
    public int field1047 = 32;

    @ObfuscatedName("al.d")
    public long field1049 = class100.method496();

    @ObfuscatedName("al.b")
    public int field1050;

    @ObfuscatedName("al.i")
    public int field1051;

    @ObfuscatedName("al.o")
    public int field1052;

    @ObfuscatedName("al.x")
    public long field1065 = 0L;

    @ObfuscatedName("al.m")
    public int field1054 = 0;

    @ObfuscatedName("al.f")
    public int field1055 = 0;

    @ObfuscatedName("al.q")
    public int field1056 = 0;

    @ObfuscatedName("al.c")
    public long field1057 = 0L;

    @ObfuscatedName("al.h")
    public boolean field1059 = true;

    @ObfuscatedName("al.ag")
    public int field1062 = 0;

    @ObfuscatedName("al.ad")
    public class57[] field1063 = new class57[8];

    @ObfuscatedName("al.ak")
    public class57[] field1046 = new class57[8];

    @ObfuscatedName("fk.r(IZII)V")
    public static final void method3175(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2844 = arg0;
        Statics.field1053 = arg1;
        Statics.field1044 = arg2;
    }

    @ObfuscatedName("p.w(Ldu;Ljava/awt/Component;IIB)Lal;")
    public static final class47 method556(class120 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2844 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1058 = new int[(Statics.field1053 ? 2 : 1) * 256];
                var4.field1051 = arg3;
                var4.method939(arg1);
                var4.field1050 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1050 > 16384) {
                    var4.field1050 = 16384;
                }
                var4.method930(var4.field1050);
                if (Statics.field1044 > 0 && Statics.field1045 == null) {
                    Statics.field1045 = new class63();
                    Statics.field1045.field1222 = arg0;
                    arg0.method2523(Statics.field1045, Statics.field1044);
                }
                if (Statics.field1045 != null) {
                    if (Statics.field1045.field1219[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1045.field1219[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class45 var6 = new class45(arg0, arg2);
                    var6.field1058 = new int[(Statics.field1053 ? 2 : 1) * 256];
                    var6.field1051 = arg3;
                    var6.method939(arg1);
                    var6.field1050 = 16384;
                    var6.method930(var6.field1050);
                    if (Statics.field1044 > 0 && Statics.field1045 == null) {
                        Statics.field1045 = new class63();
                        Statics.field1045.field1222 = arg0;
                        arg0.method2523(Statics.field1045, Statics.field1044);
                    }
                    if (Statics.field1045 != null) {
                        if (Statics.field1045.field1219[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1045.field1219[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class47();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("al.p(Lbt;I)V")
    public final synchronized void method987(class57 arg0) {
        this.field1067 = arg0;
    }

    @ObfuscatedName("al.s(B)V")
    public final synchronized void method996() {
        if (this.field1058 == null) {
            return;
        }
        long var1 = class100.method496();
        try {
            if (this.field1065 != 0L) {
                if (var1 < this.field1065) {
                    return;
                }
                this.method930(this.field1050);
                this.field1065 = 0L;
                this.field1059 = true;
            }
            int var3 = this.method944();
            if (this.field1056 - var3 > this.field1054) {
                this.field1054 = this.field1056 - var3;
            }
            int var4 = this.field1052 + this.field1051;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1050) {
                this.field1050 += 1024;
                if (this.field1050 > 16384) {
                    this.field1050 = 16384;
                }
                this.method934();
                this.method930(this.field1050);
                var3 = 0;
                this.field1059 = true;
                if (var4 + 256 > this.field1050) {
                    var4 = this.field1050 - 256;
                    this.field1052 = var4 - this.field1051;
                }
            }
            while (var3 < var4) {
                this.method992(this.field1058, 256);
                this.method929();
                var3 += 256;
            }
            if (var1 > this.field1057) {
                if (this.field1059) {
                    this.field1059 = false;
                } else if (this.field1054 == 0 && this.field1055 == 0) {
                    this.method934();
                    this.field1065 = var1 + 2000L;
                    return;
                } else {
                    this.field1052 = Math.min(this.field1055, this.field1054);
                    this.field1055 = this.field1054;
                }
                this.field1054 = 0;
                this.field1057 = var1 + 2000L;
            }
            this.field1056 = var3;
        } catch (Exception var8) {
            this.method934();
            this.field1065 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1049 + 500000L) {
                var1 = this.field1049;
            }
            while (var1 > this.field1049 + 5000L) {
                this.method991(256);
                this.field1049 += (long) (256000 / Statics.field2844);
            }
        } catch (Exception var7) {
            this.field1049 = var1;
        }
    }

    @ObfuscatedName("al.ag(B)V")
    public final void method1016() {
        this.field1059 = true;
    }

    @ObfuscatedName("al.ad(I)V")
    public final synchronized void method989() {
        this.field1059 = true;
        try {
            this.method933();
        } catch (Exception var2) {
            this.method934();
            this.field1065 = class100.method496() + 2000L;
        }
    }

    @ObfuscatedName("al.ak(I)V")
    public final synchronized void method990() {
        if (Statics.field1045 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1045.field1219[var2] == this) {
                    Statics.field1045.field1219[var2] = null;
                }
                if (Statics.field1045.field1219[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1045.field1220 = true;
                while (Statics.field1045.field1221) {
                    class111.method1306(50L);
                }
                Statics.field1045 = null;
            }
        }
        this.method934();
        this.field1058 = null;
    }

    @ObfuscatedName("al.ai(II)V")
    public final void method991(int arg0) {
        this.field1062 -= arg0;
        if (this.field1062 < 0) {
            this.field1062 = 0;
        }
        if (this.field1067 != null) {
            this.field1067.method961(arg0);
        }
    }

    @ObfuscatedName("al.ac([II)V")
    public final void method992(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1053) {
            var3 = arg1 << 1;
        }
        class105.method2344(arg0, 0, var3);
        this.field1062 -= arg1;
        if (this.field1067 != null && this.field1062 <= 0) {
            this.field1062 += Statics.field2844 >> 4;
            method106(this.field1067);
            this.method993(this.field1067, this.field1067.method1096());
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
                        class57 var10 = null;
                        class57 var11 = this.field1063[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class56 var12 = var11.field1136;
                                if (var12 == null || var12.field1133 <= var8) {
                                    var11.field1134 = true;
                                    int var13 = var11.method958();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1133 += var13;
                                    }
                                    if (var4 >= this.field1047) {
                                        break label105;
                                    }
                                    class57 var14 = var11.method956();
                                    if (var14 != null) {
                                        int var15 = var11.field1135;
                                        while (var14 != null) {
                                            this.method993(var14, var15 * var14.method1096() >> 8);
                                            var14 = var11.method957();
                                        }
                                    }
                                    class57 var16 = var11.field1137;
                                    var11.field1137 = null;
                                    if (var10 == null) {
                                        this.field1063[var7] = var16;
                                    } else {
                                        var10.field1137 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1046[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1137;
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
                class57 var18 = this.field1063[var17];
                class57[] var19 = this.field1063;
                this.field1046[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class57 var21 = var18.field1137;
                    var18.field1137 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1062 < 0) {
            this.field1062 = 0;
        }
        if (this.field1067 != null) {
            this.field1067.method973(arg0, 0, arg1);
        }
        this.field1049 = class100.method496();
    }

    @ObfuscatedName("a.as(Lbt;I)V")
    public static final void method106(class57 arg0) {
        arg0.field1134 = false;
        if (arg0.field1136 != null) {
            arg0.field1136.field1133 = 0;
        }
        for (class57 var1 = arg0.method956(); var1 != null; var1 = arg0.method957()) {
            method106(var1);
        }
    }

    @ObfuscatedName("al.ar(Lbt;II)V")
    public final void method993(class57 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class57 var4 = this.field1046[var3];
        if (var4 == null) {
            this.field1063[var3] = arg0;
        } else {
            var4.field1137 = arg0;
        }
        this.field1046[var3] = arg0;
        arg0.field1135 = arg1;
    }

    @ObfuscatedName("al.z(Ljava/awt/Component;)V")
    public void method939(Component arg0) throws Exception {
    }

    @ObfuscatedName("al.n(I)V")
    public void method930(int arg0) throws Exception {
    }

    @ObfuscatedName("al.u()I")
    public int method944() throws Exception {
        return this.field1050;
    }

    @ObfuscatedName("al.t()V")
    public void method929() throws Exception {
    }

    @ObfuscatedName("al.e()V")
    public void method934() {
    }

    @ObfuscatedName("al.a()V")
    public void method933() throws Exception {
    }
}
