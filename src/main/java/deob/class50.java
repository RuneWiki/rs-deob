package deob;

import java.awt.Component;

@ObfuscatedName("ar")
public class class50 {

    @ObfuscatedName("ar.r")
    public int[] field1066;

    @ObfuscatedName("ar.w")
    public class60 field1064;

    @ObfuscatedName("ar.c")
    public int field1068 = 32;

    @ObfuscatedName("ar.f")
    public long field1065 = class103.method790();

    @ObfuscatedName("ar.o")
    public int field1061;

    @ObfuscatedName("ar.p")
    public int field1071;

    @ObfuscatedName("ar.n")
    public int field1072;

    @ObfuscatedName("ar.m")
    public long field1073 = 0L;

    @ObfuscatedName("ar.s")
    public int field1077 = 0;

    @ObfuscatedName("ar.t")
    public int field1075 = 0;

    @ObfuscatedName("ar.j")
    public int field1076 = 0;

    @ObfuscatedName("ar.b")
    public long field1079 = 0L;

    @ObfuscatedName("ar.i")
    public boolean field1078 = true;

    @ObfuscatedName("ar.av")
    public int field1080 = 0;

    @ObfuscatedName("ar.al")
    public class60[] field1067 = new class60[8];

    @ObfuscatedName("ar.aq")
    public class60[] field1082 = new class60[8];

    @ObfuscatedName("cp.q(IZII)V")
    public static final void method1952(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1069 = arg0;
        Statics.field1062 = arg1;
        Statics.field1074 = arg2;
    }

    @ObfuscatedName("ak.d(Ldm;Ljava/awt/Component;IIB)Lar;")
    public static final class50 method896(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1069 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1066 = new int[256 * (Statics.field1062 ? 2 : 1)];
                var4.field1071 = arg3;
                var4.method921(arg1);
                var4.field1061 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1061 > 16384) {
                    var4.field1061 = 16384;
                }
                var4.method922(var4.field1061);
                if (Statics.field1074 > 0 && Statics.field1081 == null) {
                    Statics.field1081 = new class66();
                    Statics.field1081.field1236 = arg0;
                    arg0.method2465(Statics.field1081, Statics.field1074);
                }
                if (Statics.field1081 != null) {
                    if (Statics.field1081.field1233[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1081.field1233[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1066 = new int[256 * (Statics.field1062 ? 2 : 1)];
                    var6.field1071 = arg3;
                    var6.method921(arg1);
                    var6.field1061 = 16384;
                    var6.method922(var6.field1061);
                    if (Statics.field1074 > 0 && Statics.field1081 == null) {
                        Statics.field1081 = new class66();
                        Statics.field1081.field1236 = arg0;
                        arg0.method2465(Statics.field1081, Statics.field1074);
                    }
                    if (Statics.field1081 != null) {
                        if (Statics.field1081.field1233[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1081.field1233[arg2] = var6;
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

    @ObfuscatedName("ar.z(Lba;B)V")
    public final synchronized void method976(class60 arg0) {
        this.field1064 = arg0;
    }

    @ObfuscatedName("ar.e(I)V")
    public final synchronized void method977() {
        if (this.field1066 == null) {
            return;
        }
        long var1 = class103.method790();
        try {
            if (this.field1073 != 0L) {
                if (var1 < this.field1073) {
                    return;
                }
                this.method922(this.field1061);
                this.field1073 = 0L;
                this.field1078 = true;
            }
            int var3 = this.method923();
            if (this.field1076 - var3 > this.field1077) {
                this.field1077 = this.field1076 - var3;
            }
            int var4 = this.field1072 + this.field1071;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1061) {
                this.field1061 += 1024;
                if (this.field1061 > 16384) {
                    this.field1061 = 16384;
                }
                this.method925();
                this.method922(this.field1061);
                var3 = 0;
                this.field1078 = true;
                if (var4 + 256 > this.field1061) {
                    var4 = this.field1061 - 256;
                    this.field1072 = var4 - this.field1071;
                }
            }
            while (var3 < var4) {
                this.method989(this.field1066, 256);
                this.method924();
                var3 += 256;
            }
            if (var1 > this.field1079) {
                if (this.field1078) {
                    this.field1078 = false;
                } else if (this.field1077 == 0 && this.field1075 == 0) {
                    this.method925();
                    this.field1073 = var1 + 2000L;
                    return;
                } else {
                    this.field1072 = Math.min(this.field1075, this.field1077);
                    this.field1075 = this.field1077;
                }
                this.field1077 = 0;
                this.field1079 = var1 + 2000L;
            }
            this.field1076 = var3;
        } catch (Exception var8) {
            this.method925();
            this.field1073 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1065 + 500000L) {
                var1 = this.field1065;
            }
            while (var1 > this.field1065 + 5000L) {
                this.method984(256);
                this.field1065 += (long) (256000 / Statics.field1069);
            }
        } catch (Exception var7) {
            this.field1065 = var1;
        }
    }

    @ObfuscatedName("ar.av(B)V")
    public final void method978() {
        this.field1078 = true;
    }

    @ObfuscatedName("ar.al(B)V")
    public final synchronized void method1004() {
        this.field1078 = true;
        try {
            this.method937();
        } catch (Exception var2) {
            this.method925();
            this.field1073 = class103.method790() + 2000L;
        }
    }

    @ObfuscatedName("ar.aq(I)V")
    public final synchronized void method1003() {
        if (Statics.field1081 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1081.field1233[var2] == this) {
                    Statics.field1081.field1233[var2] = null;
                }
                if (Statics.field1081.field1233[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1081.field1241 = true;
                while (Statics.field1081.field1234) {
                    class114.method140(50L);
                }
                Statics.field1081 = null;
            }
        }
        this.method925();
        this.field1066 = null;
    }

    @ObfuscatedName("ar.aa(II)V")
    public final void method984(int arg0) {
        this.field1080 -= arg0;
        if (this.field1080 < 0) {
            this.field1080 = 0;
        }
        if (this.field1064 != null) {
            this.field1064.method953(arg0);
        }
    }

    @ObfuscatedName("ar.ah([II)V")
    public final void method989(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1062) {
            var3 = arg1 << 1;
        }
        class108.method2305(arg0, 0, var3);
        this.field1080 -= arg1;
        if (this.field1064 != null && this.field1080 <= 0) {
            this.field1080 += Statics.field1069 >> 4;
            method616(this.field1064);
            this.method982(this.field1064, this.field1064.method1087());
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
                        class60 var11 = this.field1067[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1151;
                                if (var12 == null || var12.field1147 <= var8) {
                                    var11.field1148 = true;
                                    int var13 = var11.method965();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1147 += var13;
                                    }
                                    if (var4 >= this.field1068) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method948();
                                    if (var14 != null) {
                                        int var15 = var11.field1149;
                                        while (var14 != null) {
                                            this.method982(var14, var15 * var14.method1087() >> 8);
                                            var14 = var11.method949();
                                        }
                                    }
                                    class60 var16 = var11.field1150;
                                    var11.field1150 = null;
                                    if (var10 == null) {
                                        this.field1067[var7] = var16;
                                    } else {
                                        var10.field1150 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1082[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1150;
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
                class60 var18 = this.field1067[var17];
                class60[] var19 = this.field1067;
                this.field1082[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1150;
                    var18.field1150 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1080 < 0) {
            this.field1080 = 0;
        }
        if (this.field1064 != null) {
            this.field1064.method951(arg0, 0, arg1);
        }
        this.field1065 = class103.method790();
    }

    @ObfuscatedName("ag.au(Lba;I)V")
    public static final void method616(class60 arg0) {
        arg0.field1148 = false;
        if (arg0.field1151 != null) {
            arg0.field1151.field1147 = 0;
        }
        for (class60 var1 = arg0.method948(); var1 != null; var1 = arg0.method949()) {
            method616(var1);
        }
    }

    @ObfuscatedName("ar.ai(Lba;IB)V")
    public final void method982(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1082[var3];
        if (var4 == null) {
            this.field1067[var3] = arg0;
        } else {
            var4.field1150 = arg0;
        }
        this.field1082[var3] = arg0;
        arg0.field1149 = arg1;
    }

    @ObfuscatedName("ar.y(Ljava/awt/Component;)V")
    public void method921(Component arg0) throws Exception {
    }

    @ObfuscatedName("ar.u(I)V")
    public void method922(int arg0) throws Exception {
    }

    @ObfuscatedName("ar.k()I")
    public int method923() throws Exception {
        return this.field1061;
    }

    @ObfuscatedName("ar.v()V")
    public void method924() throws Exception {
    }

    @ObfuscatedName("ar.l()V")
    public void method925() {
    }

    @ObfuscatedName("ar.g()V")
    public void method937() throws Exception {
    }
}
