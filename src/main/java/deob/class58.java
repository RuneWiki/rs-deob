package deob;

import java.awt.Component;

@ObfuscatedName("bl")
public class class58 {

    @ObfuscatedName("bl.c")
    public int[] field1036;

    @ObfuscatedName("bl.p")
    public class69 field1048;

    @ObfuscatedName("bl.g")
    public int field1031 = 32;

    @ObfuscatedName("bl.z")
    public long field1039 = class163.method3594();

    @ObfuscatedName("bl.q")
    public int field1040;

    @ObfuscatedName("bl.l")
    public int field1041;

    @ObfuscatedName("bl.y")
    public int field1042;

    @ObfuscatedName("bl.e")
    public long field1043 = 0L;

    @ObfuscatedName("bl.x")
    public int field1044 = 0;

    @ObfuscatedName("bl.f")
    public int field1045 = 0;

    @ObfuscatedName("bl.s")
    public int field1046 = 0;

    @ObfuscatedName("bl.o")
    public long field1054 = 0L;

    @ObfuscatedName("bl.i")
    public boolean field1035 = true;

    @ObfuscatedName("bl.u")
    public int field1034 = 0;

    @ObfuscatedName("bl.t")
    public class69[] field1037 = new class69[8];

    @ObfuscatedName("bl.av")
    public class69[] field1053 = new class69[8];

    @ObfuscatedName("af.n(Lci;Ljava/awt/Component;III)Lbl;")
    public static final class58 method738(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1032 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1036 = new int[(Statics.field1047 ? 2 : 1) * 256];
                var4.field1041 = arg3;
                var4.method1017(arg1);
                var4.field1040 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1040 > 16384) {
                    var4.field1040 = 16384;
                }
                var4.method1045(var4.field1040);
                if (Statics.field1033 > 0 && Statics.field3281 == null) {
                    Statics.field3281 = new class64();
                    Statics.field3281.field1082 = arg0;
                    arg0.method1871(Statics.field3281, Statics.field1033);
                }
                if (Statics.field3281 != null) {
                    if (Statics.field3281.field1081[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3281.field1081[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bl.d(Lbb;I)V")
    public final synchronized void method1009(class69 arg0) {
        this.field1048 = arg0;
    }

    @ObfuscatedName("bl.m(I)V")
    public final synchronized void method1013() {
        if (this.field1036 == null) {
            return;
        }
        long var1 = class163.method3594();
        try {
            if (this.field1043 != 0L) {
                if (var1 < this.field1043) {
                    return;
                }
                this.method1045(this.field1040);
                this.field1043 = 0L;
                this.field1035 = true;
            }
            int var3 = this.method1019();
            if (this.field1046 - var3 > this.field1044) {
                this.field1044 = this.field1046 - var3;
            }
            int var4 = this.field1042 + this.field1041;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1040) {
                this.field1040 += 1024;
                if (this.field1040 > 16384) {
                    this.field1040 = 16384;
                }
                this.method1021();
                this.method1045(this.field1040);
                var3 = 0;
                this.field1035 = true;
                if (var4 + 256 > this.field1040) {
                    var4 = this.field1040 - 256;
                    this.field1042 = var4 - this.field1041;
                }
            }
            while (var3 < var4) {
                this.method1015(this.field1036, 256);
                this.method1020();
                var3 += 256;
            }
            if (var1 > this.field1054) {
                if (this.field1035) {
                    this.field1035 = false;
                } else if (this.field1044 == 0 && this.field1045 == 0) {
                    this.method1021();
                    this.field1043 = var1 + 2000L;
                    return;
                } else {
                    this.field1042 = Math.min(this.field1045, this.field1044);
                    this.field1045 = this.field1044;
                }
                this.field1044 = 0;
                this.field1054 = var1 + 2000L;
            }
            this.field1046 = var3;
        } catch (Exception var8) {
            this.method1021();
            this.field1043 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1039 + 500000L) {
                var1 = this.field1039;
            }
            while (var1 > this.field1039 + 5000L) {
                this.method1010(256);
                this.field1039 += (long) (256000 / Statics.field1032);
            }
        } catch (Exception var7) {
            this.field1039 = var1;
        }
    }

    @ObfuscatedName("bl.h(B)V")
    public final void method1014() {
        this.field1035 = true;
    }

    @ObfuscatedName("bl.w(I)V")
    public final synchronized void method1012() {
        this.field1035 = true;
        try {
            this.method1011();
        } catch (Exception var2) {
            this.method1021();
            this.field1043 = class163.method3594() + 2000L;
        }
    }

    @ObfuscatedName("bl.r(I)V")
    public final synchronized void method1026() {
        if (Statics.field3281 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3281.field1081[var2] == this) {
                    Statics.field3281.field1081[var2] = null;
                }
                if (Statics.field3281.field1081[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3281.field1085 = true;
                while (Statics.field3281.field1083) {
                    Statics.method13(50L);
                }
                Statics.field3281 = null;
            }
        }
        this.method1021();
        this.field1036 = null;
    }

    @ObfuscatedName("bl.c(II)V")
    public final void method1010(int arg0) {
        this.field1034 -= arg0;
        if (this.field1034 < 0) {
            this.field1034 = 0;
        }
        if (this.field1048 != null) {
            this.field1048.method897(arg0);
        }
    }

    @ObfuscatedName("bl.z([II)V")
    public final void method1015(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1047) {
            var3 = arg1 << 1;
        }
        class171.method3069(arg0, 0, var3);
        this.field1034 -= arg1;
        if (this.field1048 != null && this.field1034 <= 0) {
            this.field1034 += Statics.field1032 >> 4;
            method10(this.field1048);
            this.method1060(this.field1048, this.field1048.method1121());
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
                        class69 var11 = this.field1037[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1136;
                                if (var12 == null || var12.field1168 <= var8) {
                                    var11.field1134 = true;
                                    int var13 = var11.method888();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1168 += var13;
                                    }
                                    if (var4 >= this.field1031) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method887();
                                    if (var14 != null) {
                                        int var15 = var11.field1137;
                                        while (var14 != null) {
                                            this.method1060(var14, var15 * var14.method1121() >> 8);
                                            var14 = var11.method914();
                                        }
                                    }
                                    class69 var16 = var11.field1135;
                                    var11.field1135 = null;
                                    if (var10 == null) {
                                        this.field1037[var7] = var16;
                                    } else {
                                        var10.field1135 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1053[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1135;
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
                class69 var18 = this.field1037[var17];
                class69[] var19 = this.field1037;
                this.field1053[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1135;
                    var18.field1135 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1034 < 0) {
            this.field1034 = 0;
        }
        if (this.field1048 != null) {
            this.field1048.method905(arg0, 0, arg1);
        }
        this.field1039 = class163.method3594();
    }

    @ObfuscatedName("n.q(Lbb;I)V")
    public static final void method10(class69 arg0) {
        arg0.field1134 = false;
        if (arg0.field1136 != null) {
            arg0.field1136.field1168 = 0;
        }
        for (class69 var1 = arg0.method887(); var1 != null; var1 = arg0.method914()) {
            method10(var1);
        }
    }

    @ObfuscatedName("bl.l(Lbb;II)V")
    public final void method1060(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1053[var3];
        if (var4 == null) {
            this.field1037[var3] = arg0;
        } else {
            var4.field1135 = arg0;
        }
        this.field1053[var3] = arg0;
        arg0.field1137 = arg1;
    }

    @ObfuscatedName("bl.y(Ljava/awt/Component;B)V")
    public void method1017(Component arg0) throws Exception {
    }

    @ObfuscatedName("bl.e(II)V")
    public void method1045(int arg0) throws Exception {
    }

    @ObfuscatedName("bl.x(I)I")
    public int method1019() throws Exception {
        return this.field1040;
    }

    @ObfuscatedName("bl.f()V")
    public void method1020() throws Exception {
    }

    @ObfuscatedName("bl.s(I)V")
    public void method1021() {
    }

    @ObfuscatedName("bl.o(I)V")
    public void method1011() throws Exception {
    }
}
