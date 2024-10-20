package deob;

import java.awt.Component;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bi")
public class class58 {

    @ObfuscatedName("bi.l")
    public int[] field1032;

    @ObfuscatedName("bi.v")
    public class69 field1043;

    @ObfuscatedName("bi.g")
    public int field1034 = 32;

    @ObfuscatedName("bi.w")
    public long field1030 = class132.method1336();

    @ObfuscatedName("bi.r")
    public int field1036;

    @ObfuscatedName("bi.s")
    public int field1037;

    @ObfuscatedName("bi.k")
    public int field1038;

    @ObfuscatedName("bi.e")
    public long field1035 = 0L;

    @ObfuscatedName("bi.j")
    public int field1040 = 0;

    @ObfuscatedName("bi.i")
    public int field1041 = 0;

    @ObfuscatedName("bi.a")
    public int field1042 = 0;

    @ObfuscatedName("bi.x")
    public long field1029 = 0L;

    @ObfuscatedName("bi.h")
    public boolean field1044 = true;

    @ObfuscatedName("bi.am")
    public int field1046 = 0;

    @ObfuscatedName("bi.ax")
    public class69[] field1039 = new class69[8];

    @ObfuscatedName("bi.ac")
    public class69[] field1047 = new class69[8];

    @ObfuscatedName("aj.d(Lch;Ljava/awt/Component;IIB)Lbi;")
    public static final class58 method711(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1033 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class61 var4 = new class61();
                var4.field1032 = new int[(Statics.field1048 ? 2 : 1) * 256];
                var4.field1037 = arg3;
                var4.method1044(arg1);
                var4.field1036 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1036 > 16384) {
                    var4.field1036 = 16384;
                }
                var4.method1085(var4.field1036);
                if (Statics.field2863 > 0 && Statics.field1031 == null) {
                    Statics.field1031 = new class60();
                    Statics.field3198 = Executors.newScheduledThreadPool(1);
                    Statics.field3198.scheduleAtFixedRate(Statics.field1031, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1031 != null) {
                    if (Statics.field1031.field1062[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1031.field1062[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bi.c(Lbc;B)V")
    public final synchronized void method1037(class69 arg0) {
        this.field1043 = arg0;
    }

    @ObfuscatedName("bi.n(I)V")
    public final synchronized void method1050() {
        if (this.field1032 == null) {
            return;
        }
        long var1 = class132.method1336();
        try {
            if (this.field1035 != 0L) {
                if (var1 < this.field1035) {
                    return;
                }
                this.method1085(this.field1036);
                this.field1035 = 0L;
                this.field1044 = true;
            }
            int var3 = this.method1046();
            if (this.field1042 - var3 > this.field1040) {
                this.field1040 = this.field1042 - var3;
            }
            int var4 = this.field1038 + this.field1037;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1036) {
                this.field1036 += 1024;
                if (this.field1036 > 16384) {
                    this.field1036 = 16384;
                }
                this.method1048();
                this.method1085(this.field1036);
                var3 = 0;
                this.field1044 = true;
                if (var4 + 256 > this.field1036) {
                    var4 = this.field1036 - 256;
                    this.field1038 = var4 - this.field1037;
                }
            }
            while (var3 < var4) {
                this.method1045(this.field1032, 256);
                this.method1047();
                var3 += 256;
            }
            if (var1 > this.field1029) {
                if (this.field1044) {
                    this.field1044 = false;
                } else if (this.field1040 == 0 && this.field1041 == 0) {
                    this.method1048();
                    this.field1035 = var1 + 2000L;
                    return;
                } else {
                    this.field1038 = Math.min(this.field1041, this.field1040);
                    this.field1041 = this.field1040;
                }
                this.field1040 = 0;
                this.field1029 = var1 + 2000L;
            }
            this.field1042 = var3;
        } catch (Exception var8) {
            this.method1048();
            this.field1035 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1030 + 500000L) {
                var1 = this.field1030;
            }
            while (var1 > this.field1030 + 5000L) {
                this.method1089(256);
                this.field1030 += (long) (256000 / Statics.field1033);
            }
        } catch (Exception var7) {
            this.field1030 = var1;
        }
    }

    @ObfuscatedName("bi.q(I)V")
    public final void method1039() {
        this.field1044 = true;
    }

    @ObfuscatedName("bi.t(I)V")
    public final synchronized void method1061() {
        this.field1044 = true;
        try {
            this.method1049();
        } catch (Exception var2) {
            this.method1048();
            this.field1035 = class132.method1336() + 2000L;
        }
    }

    @ObfuscatedName("bi.p(I)V")
    public final synchronized void method1041() {
        if (Statics.field1031 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1031.field1062[var2] == this) {
                    Statics.field1031.field1062[var2] = null;
                }
                if (Statics.field1031.field1062[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3198.shutdownNow();
                Statics.field3198 = null;
                Statics.field1031 = null;
            }
        }
        this.method1048();
        this.field1032 = null;
    }

    @ObfuscatedName("bi.u(II)V")
    public final void method1089(int arg0) {
        this.field1046 -= arg0;
        if (this.field1046 < 0) {
            this.field1046 = 0;
        }
        if (this.field1043 != null) {
            this.field1043.method920(arg0);
        }
    }

    @ObfuscatedName("bi.w([II)V")
    public final void method1045(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1048) {
            var3 = arg1 << 1;
        }
        class140.method2515(arg0, 0, var3);
        this.field1046 -= arg1;
        if (this.field1043 != null && this.field1046 <= 0) {
            this.field1046 += Statics.field1033 >> 4;
            method2932(this.field1043);
            this.method1043(this.field1043, this.field1043.method1152());
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
                        class69 var11 = this.field1039[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1123;
                                if (var12 == null || var12.field1157 <= var8) {
                                    var11.field1126 = true;
                                    int var13 = var11.method914();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1157 += var13;
                                    }
                                    if (var4 >= this.field1034) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method910();
                                    if (var14 != null) {
                                        int var15 = var11.field1124;
                                        while (var14 != null) {
                                            this.method1043(var14, var15 * var14.method1152() >> 8);
                                            var14 = var11.method913();
                                        }
                                    }
                                    class69 var16 = var11.field1125;
                                    var11.field1125 = null;
                                    if (var10 == null) {
                                        this.field1039[var7] = var16;
                                    } else {
                                        var10.field1125 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1047[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1125;
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
                class69 var18 = this.field1039[var17];
                class69[] var19 = this.field1039;
                this.field1047[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1125;
                    var18.field1125 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1046 < 0) {
            this.field1046 = 0;
        }
        if (this.field1043 != null) {
            this.field1043.method915(arg0, 0, arg1);
        }
        this.field1030 = class132.method1336();
    }

    @ObfuscatedName("fu.r(Lbc;B)V")
    public static final void method2932(class69 arg0) {
        arg0.field1126 = false;
        if (arg0.field1123 != null) {
            arg0.field1123.field1157 = 0;
        }
        for (class69 var1 = arg0.method910(); var1 != null; var1 = arg0.method913()) {
            method2932(var1);
        }
    }

    @ObfuscatedName("bi.s(Lbc;II)V")
    public final void method1043(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1047[var3];
        if (var4 == null) {
            this.field1039[var3] = arg0;
        } else {
            var4.field1125 = arg0;
        }
        this.field1047[var3] = arg0;
        arg0.field1124 = arg1;
    }

    @ObfuscatedName("bi.k(Ljava/awt/Component;B)V")
    public void method1044(Component arg0) throws Exception {
    }

    @ObfuscatedName("bi.e(II)V")
    public void method1085(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.j(B)I")
    public int method1046() throws Exception {
        return this.field1036;
    }

    @ObfuscatedName("bi.i()V")
    public void method1047() throws Exception {
    }

    @ObfuscatedName("bi.a(B)V")
    public void method1048() {
    }

    @ObfuscatedName("bi.x(I)V")
    public void method1049() throws Exception {
    }
}
