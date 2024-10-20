package deob;

import java.awt.Component;

@ObfuscatedName("bg")
public class class53 {

    @ObfuscatedName("bg.u")
    public int[] field1113;

    @ObfuscatedName("bg.p")
    public class49 field1114;

    @ObfuscatedName("bg.t")
    public int field1115 = 32;

    @ObfuscatedName("bg.g")
    public long field1116 = class122.method37();

    @ObfuscatedName("bg.o")
    public int field1110;

    @ObfuscatedName("bg.x")
    public int field1119;

    @ObfuscatedName("bg.c")
    public int field1109;

    @ObfuscatedName("bg.b")
    public long field1120 = 0L;

    @ObfuscatedName("bg.f")
    public int field1121 = 0;

    @ObfuscatedName("bg.s")
    public int field1122 = 0;

    @ObfuscatedName("bg.y")
    public int field1131 = 0;

    @ObfuscatedName("bg.r")
    public long field1124 = 0L;

    @ObfuscatedName("bg.l")
    public boolean field1125 = true;

    @ObfuscatedName("bg.al")
    public int field1132 = 0;

    @ObfuscatedName("bg.ap")
    public class49[] field1123 = new class49[8];

    @ObfuscatedName("bg.ak")
    public class49[] field1128 = new class49[8];

    @ObfuscatedName("fd.l(IZII)V")
    public static final void method3127(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1126 = arg0;
        Statics.field1118 = arg1;
        Statics.field187 = arg2;
    }

    @ObfuscatedName("b.n(Lbf;Ljava/awt/Component;III)Lbg;")
    public static final class53 method175(class75 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1126 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class52 var4 = new class52();
                var4.field1113 = new int[(Statics.field1118 ? 2 : 1) * 256];
                var4.field1119 = arg3;
                var4.method968(arg1);
                var4.field1110 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1110 > 16384) {
                    var4.field1110 = 16384;
                }
                var4.method977(var4.field1110);
                if (Statics.field187 > 0 && Statics.field1111 == null) {
                    Statics.field1111 = new class56();
                    Statics.field1111.field1203 = arg0;
                    arg0.method1546(Statics.field1111, Statics.field187);
                }
                if (Statics.field1111 != null) {
                    if (Statics.field1111.field1194[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1111.field1194[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class45 var6 = new class45(arg0, arg2);
                    var6.field1113 = new int[256 * (Statics.field1118 ? 2 : 1)];
                    var6.field1119 = arg3;
                    var6.method968(arg1);
                    var6.field1110 = 16384;
                    var6.method977(var6.field1110);
                    if (Statics.field187 > 0 && Statics.field1111 == null) {
                        Statics.field1111 = new class56();
                        Statics.field1111.field1203 = arg0;
                        arg0.method1546(Statics.field1111, Statics.field187);
                    }
                    if (Statics.field1111 != null) {
                        if (Statics.field1111.field1194[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1111.field1194[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class53();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bg.h(Lac;B)V")
    public final synchronized void method1205(class49 arg0) {
        this.field1114 = arg0;
    }

    @ObfuscatedName("bg.v(I)V")
    public final synchronized void method1197() {
        if (this.field1113 == null) {
            return;
        }
        long var1 = class122.method37();
        try {
            if (this.field1120 != 0L) {
                if (var1 < this.field1120) {
                    return;
                }
                this.method977(this.field1110);
                this.field1120 = 0L;
                this.field1125 = true;
            }
            int var3 = this.method967();
            if (this.field1131 - var3 > this.field1121) {
                this.field1121 = this.field1131 - var3;
            }
            int var4 = this.field1119 + this.field1109;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1110) {
                this.field1110 += 1024;
                if (this.field1110 > 16384) {
                    this.field1110 = 16384;
                }
                this.method976();
                this.method977(this.field1110);
                var3 = 0;
                this.field1125 = true;
                if (var4 + 256 > this.field1110) {
                    var4 = this.field1110 - 256;
                    this.field1109 = var4 - this.field1119;
                }
            }
            while (var3 < var4) {
                this.method1201(this.field1113, 256);
                this.method969();
                var3 += 256;
            }
            if (var1 > this.field1124) {
                if (this.field1125) {
                    this.field1125 = false;
                } else if (this.field1121 == 0 && this.field1122 == 0) {
                    this.method976();
                    this.field1120 = var1 + 2000L;
                    return;
                } else {
                    this.field1109 = Math.min(this.field1122, this.field1121);
                    this.field1122 = this.field1121;
                }
                this.field1121 = 0;
                this.field1124 = var1 + 2000L;
            }
            this.field1131 = var3;
        } catch (Exception var8) {
            this.method976();
            this.field1120 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1116 + 500000L) {
                var1 = this.field1116;
            }
            while (var1 > this.field1116 + 5000L) {
                this.method1200(256);
                this.field1116 += (long) (256000 / Statics.field1126);
            }
        } catch (Exception var7) {
            this.field1116 = var1;
        }
    }

    @ObfuscatedName("bg.ax(I)V")
    public final void method1198() {
        this.field1125 = true;
    }

    @ObfuscatedName("bg.ao(B)V")
    public final synchronized void method1233() {
        this.field1125 = true;
        try {
            this.method971();
        } catch (Exception var2) {
            this.method976();
            this.field1120 = class122.method37() + 2000L;
        }
    }

    @ObfuscatedName("bg.al(I)V")
    public final synchronized void method1196() {
        if (Statics.field1111 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1111.field1194[var2] == this) {
                    Statics.field1111.field1194[var2] = null;
                }
                if (Statics.field1111.field1194[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1111.field1195 = true;
                while (Statics.field1111.field1196) {
                    class127.method2200(50L);
                }
                Statics.field1111 = null;
            }
        }
        this.method976();
        this.field1113 = null;
    }

    @ObfuscatedName("bg.ap(II)V")
    public final void method1200(int arg0) {
        this.field1132 -= arg0;
        if (this.field1132 < 0) {
            this.field1132 = 0;
        }
        if (this.field1114 != null) {
            this.field1114.method1055(arg0);
        }
    }

    @ObfuscatedName("bg.ak([II)V")
    public final void method1201(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1118) {
            var3 = arg1 << 1;
        }
        class129.method2653(arg0, 0, var3);
        this.field1132 -= arg1;
        if (this.field1114 != null && this.field1132 <= 0) {
            this.field1132 += Statics.field1126 >> 4;
            method260(this.field1114);
            this.method1202(this.field1114, this.field1114.method990());
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
                        class49 var10 = null;
                        class49 var11 = this.field1123[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class48 var12 = var11.field1087;
                                if (var12 == null || var12.field1084 <= var8) {
                                    var11.field1085 = true;
                                    int var13 = var11.method1006();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1084 += var13;
                                    }
                                    if (var4 >= this.field1115) {
                                        break label105;
                                    }
                                    class49 var14 = var11.method1100();
                                    if (var14 != null) {
                                        int var15 = var11.field1088;
                                        while (var14 != null) {
                                            this.method1202(var14, var15 * var14.method990() >> 8);
                                            var14 = var11.method1012();
                                        }
                                    }
                                    class49 var16 = var11.field1086;
                                    var11.field1086 = null;
                                    if (var10 == null) {
                                        this.field1123[var7] = var16;
                                    } else {
                                        var10.field1086 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1128[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1086;
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
                class49 var18 = this.field1123[var17];
                class49[] var19 = this.field1123;
                this.field1128[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class49 var21 = var18.field1086;
                    var18.field1086 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1132 < 0) {
            this.field1132 = 0;
        }
        if (this.field1114 != null) {
            this.field1114.method1014(arg0, 0, arg1);
        }
        this.field1116 = class122.method37();
    }

    @ObfuscatedName("ax.aw(Lac;I)V")
    public static final void method260(class49 arg0) {
        arg0.field1085 = false;
        if (arg0.field1087 != null) {
            arg0.field1087.field1084 = 0;
        }
        for (class49 var1 = arg0.method1100(); var1 != null; var1 = arg0.method1012()) {
            method260(var1);
        }
    }

    @ObfuscatedName("bg.av(Lac;II)V")
    public final void method1202(class49 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class49 var4 = this.field1128[var3];
        if (var4 == null) {
            this.field1123[var3] = arg0;
        } else {
            var4.field1086 = arg0;
        }
        this.field1128[var3] = arg0;
        arg0.field1088 = arg1;
    }

    @ObfuscatedName("bg.e(Ljava/awt/Component;)V")
    public void method968(Component arg0) throws Exception {
    }

    @ObfuscatedName("bg.i(I)V")
    public void method977(int arg0) throws Exception {
    }

    @ObfuscatedName("bg.k()I")
    public int method967() throws Exception {
        return this.field1110;
    }

    @ObfuscatedName("bg.q()V")
    public void method969() throws Exception {
    }

    @ObfuscatedName("bg.j()V")
    public void method976() {
    }

    @ObfuscatedName("bg.z()V")
    public void method971() throws Exception {
    }
}
