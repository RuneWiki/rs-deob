package deob;

import java.awt.Component;

@ObfuscatedName("aa")
public class class50 {

    @ObfuscatedName("aa.f")
    public int[] field1085;

    @ObfuscatedName("aa.x")
    public class60 field1086;

    @ObfuscatedName("aa.h")
    public int field1087 = 32;

    @ObfuscatedName("aa.a")
    public long field1088 = class103.method833();

    @ObfuscatedName("aa.u")
    public int field1099;

    @ObfuscatedName("aa.v")
    public int field1090;

    @ObfuscatedName("aa.i")
    public int field1091;

    @ObfuscatedName("aa.n")
    public long field1092 = 0L;

    @ObfuscatedName("aa.d")
    public int field1093 = 0;

    @ObfuscatedName("aa.k")
    public int field1089 = 0;

    @ObfuscatedName("aa.p")
    public int field1084 = 0;

    @ObfuscatedName("aa.j")
    public long field1096 = 0L;

    @ObfuscatedName("aa.z")
    public boolean field1097 = true;

    @ObfuscatedName("aa.ay")
    public int field1083 = 0;

    @ObfuscatedName("aa.ae")
    public class60[] field1100 = new class60[8];

    @ObfuscatedName("aa.ab")
    public class60[] field1094 = new class60[8];

    @ObfuscatedName("cm.n(Ldk;Ljava/awt/Component;III)Laa;")
    public static final class50 method2009(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1095 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1085 = new int[(Statics.field1761 ? 2 : 1) * 256];
                var4.field1090 = arg3;
                var4.method908(arg1);
                var4.field1099 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1099 > 16384) {
                    var4.field1099 = 16384;
                }
                var4.method909(var4.field1099);
                if (Statics.field627 > 0 && Statics.field1663 == null) {
                    Statics.field1663 = new class66();
                    Statics.field1663.field1257 = arg0;
                    arg0.method2414(Statics.field1663, Statics.field627);
                }
                if (Statics.field1663 != null) {
                    if (Statics.field1663.field1256[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1663.field1256[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1085 = new int[256 * (Statics.field1761 ? 2 : 1)];
                    var6.field1090 = arg3;
                    var6.method908(arg1);
                    var6.field1099 = 16384;
                    var6.method909(var6.field1099);
                    if (Statics.field627 > 0 && Statics.field1663 == null) {
                        Statics.field1663 = new class66();
                        Statics.field1663.field1257 = arg0;
                        arg0.method2414(Statics.field1663, Statics.field627);
                    }
                    if (Statics.field1663 != null) {
                        if (Statics.field1663.field1256[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1663.field1256[arg2] = var6;
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

    @ObfuscatedName("aa.d(Lbc;B)V")
    public final synchronized void method965(class60 arg0) {
        this.field1086 = arg0;
    }

    @ObfuscatedName("aa.k(I)V")
    public final synchronized void method975() {
        if (this.field1085 == null) {
            return;
        }
        long var1 = class103.method833();
        try {
            if (this.field1092 != 0L) {
                if (var1 < this.field1092) {
                    return;
                }
                this.method909(this.field1099);
                this.field1092 = 0L;
                this.field1097 = true;
            }
            int var3 = this.method910();
            if (this.field1084 - var3 > this.field1093) {
                this.field1093 = this.field1084 - var3;
            }
            int var4 = this.field1091 + this.field1090;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1099) {
                this.field1099 += 1024;
                if (this.field1099 > 16384) {
                    this.field1099 = 16384;
                }
                this.method912();
                this.method909(this.field1099);
                var3 = 0;
                this.field1097 = true;
                if (var4 + 256 > this.field1099) {
                    var4 = this.field1099 - 256;
                    this.field1091 = var4 - this.field1090;
                }
            }
            while (var3 < var4) {
                this.method971(this.field1085, 256);
                this.method916();
                var3 += 256;
            }
            if (var1 > this.field1096) {
                if (this.field1097) {
                    this.field1097 = false;
                } else if (this.field1093 == 0 && this.field1089 == 0) {
                    this.method912();
                    this.field1092 = var1 + 2000L;
                    return;
                } else {
                    this.field1091 = Math.min(this.field1089, this.field1093);
                    this.field1089 = this.field1093;
                }
                this.field1093 = 0;
                this.field1096 = var1 + 2000L;
            }
            this.field1084 = var3;
        } catch (Exception var8) {
            this.method912();
            this.field1092 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1088 + 500000L) {
                var1 = this.field1088;
            }
            while (var1 > this.field1088 + 5000L) {
                this.method987(256);
                this.field1088 += (long) (256000 / Statics.field1095);
            }
        } catch (Exception var7) {
            this.field1088 = var1;
        }
    }

    @ObfuscatedName("aa.p(I)V")
    public final void method967() {
        this.field1097 = true;
    }

    @ObfuscatedName("aa.j(I)V")
    public final synchronized void method968() {
        this.field1097 = true;
        try {
            this.method907();
        } catch (Exception var2) {
            this.method912();
            this.field1092 = class103.method833() + 2000L;
        }
    }

    @ObfuscatedName("aa.z(B)V")
    public final synchronized void method969() {
        if (Statics.field1663 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1663.field1256[var2] == this) {
                    Statics.field1663.field1256[var2] = null;
                }
                if (Statics.field1663.field1256[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1663.field1254 = true;
                while (Statics.field1663.field1252) {
                    class114.method134(50L);
                }
                Statics.field1663 = null;
            }
        }
        this.method912();
        this.field1085 = null;
    }

    @ObfuscatedName("aa.t(II)V")
    public final void method987(int arg0) {
        this.field1083 -= arg0;
        if (this.field1083 < 0) {
            this.field1083 = 0;
        }
        if (this.field1086 != null) {
            this.field1086.method959(arg0);
        }
    }

    @ObfuscatedName("aa.c([II)V")
    public final void method971(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1761) {
            var3 = arg1 << 1;
        }
        class108.method2264(arg0, 0, var3);
        this.field1083 -= arg1;
        if (this.field1086 != null && this.field1083 <= 0) {
            this.field1083 += Statics.field1095 >> 4;
            method1992(this.field1086);
            this.method972(this.field1086, this.field1086.method1129());
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
                        class60 var11 = this.field1100[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1170;
                                if (var12 == null || var12.field1167 <= var8) {
                                    var11.field1169 = true;
                                    int var13 = var11.method930();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1167 += var13;
                                    }
                                    if (var4 >= this.field1087) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method942();
                                    if (var14 != null) {
                                        int var15 = var11.field1168;
                                        while (var14 != null) {
                                            this.method972(var14, var15 * var14.method1129() >> 8);
                                            var14 = var11.method933();
                                        }
                                    }
                                    class60 var16 = var11.field1171;
                                    var11.field1171 = null;
                                    if (var10 == null) {
                                        this.field1100[var7] = var16;
                                    } else {
                                        var10.field1171 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1094[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1171;
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
                class60 var18 = this.field1100[var17];
                class60[] var19 = this.field1100;
                this.field1094[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1171;
                    var18.field1171 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1083 < 0) {
            this.field1083 = 0;
        }
        if (this.field1086 != null) {
            this.field1086.method931(arg0, 0, arg1);
        }
        this.field1088 = class103.method833();
    }

    @ObfuscatedName("cb.q(Lbc;I)V")
    public static final void method1992(class60 arg0) {
        arg0.field1169 = false;
        if (arg0.field1170 != null) {
            arg0.field1170.field1167 = 0;
        }
        for (class60 var1 = arg0.method942(); var1 != null; var1 = arg0.method933()) {
            method1992(var1);
        }
    }

    @ObfuscatedName("aa.g(Lbc;II)V")
    public final void method972(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1094[var3];
        if (var4 == null) {
            this.field1100[var3] = arg0;
        } else {
            var4.field1171 = arg0;
        }
        this.field1094[var3] = arg0;
        arg0.field1168 = arg1;
    }

    @ObfuscatedName("aa.e(Ljava/awt/Component;)V")
    public void method908(Component arg0) throws Exception {
    }

    @ObfuscatedName("aa.o(I)V")
    public void method909(int arg0) throws Exception {
    }

    @ObfuscatedName("aa.y()I")
    public int method910() throws Exception {
        return this.field1099;
    }

    @ObfuscatedName("aa.b()V")
    public void method916() throws Exception {
    }

    @ObfuscatedName("aa.w()V")
    public void method912() {
    }

    @ObfuscatedName("aa.r()V")
    public void method907() throws Exception {
    }
}
