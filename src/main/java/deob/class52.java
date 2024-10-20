package deob;

import java.awt.Component;

@ObfuscatedName("ad")
public class class52 {

    @ObfuscatedName("ad.v")
    public int[] field1111;

    @ObfuscatedName("ad.b")
    public class62 field1115;

    @ObfuscatedName("ad.f")
    public int field1112 = 32;

    @ObfuscatedName("ad.i")
    public long field1114 = class107.method78();

    @ObfuscatedName("ad.w")
    public int field1108;

    @ObfuscatedName("ad.l")
    public int field1116;

    @ObfuscatedName("ad.j")
    public int field1117;

    @ObfuscatedName("ad.s")
    public long field1118 = 0L;

    @ObfuscatedName("ad.r")
    public int field1119 = 0;

    @ObfuscatedName("ad.h")
    public int field1123 = 0;

    @ObfuscatedName("ad.x")
    public int field1121 = 0;

    @ObfuscatedName("ad.m")
    public long field1122 = 0L;

    @ObfuscatedName("ad.a")
    public boolean field1127 = true;

    @ObfuscatedName("ad.aj")
    public int field1124 = 0;

    @ObfuscatedName("ad.au")
    public class62[] field1113 = new class62[8];

    @ObfuscatedName("ad.ah")
    public class62[] field1110 = new class62[8];

    @ObfuscatedName("b.x(Ldf;Ljava/awt/Component;III)Lad;")
    public static final class52 method105(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1126 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1111 = new int[256 * (Statics.field1125 ? 2 : 1)];
                var4.field1116 = arg3;
                var4.method984(arg1);
                var4.field1108 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1108 > 16384) {
                    var4.field1108 = 16384;
                }
                var4.method994(var4.field1108);
                if (Statics.field3066 > 0 && Statics.field1109 == null) {
                    Statics.field1109 = new class68();
                    Statics.field1109.field1278 = arg0;
                    arg0.method2541(Statics.field1109, Statics.field3066);
                }
                if (Statics.field1109 != null) {
                    if (Statics.field1109.field1286[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1109.field1286[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1111 = new int[(Statics.field1125 ? 2 : 1) * 256];
                    var6.field1116 = arg3;
                    var6.method984(arg1);
                    var6.field1108 = 16384;
                    var6.method994(var6.field1108);
                    if (Statics.field3066 > 0 && Statics.field1109 == null) {
                        Statics.field1109 = new class68();
                        Statics.field1109.field1278 = arg0;
                        arg0.method2541(Statics.field1109, Statics.field3066);
                    }
                    if (Statics.field1109 != null) {
                        if (Statics.field1109.field1286[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1109.field1286[arg2] = var6;
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

    @ObfuscatedName("ad.m(Lbk;I)V")
    public final synchronized void method1048(class62 arg0) {
        this.field1115 = arg0;
    }

    @ObfuscatedName("ad.a(B)V")
    public final synchronized void method1049() {
        if (this.field1111 == null) {
            return;
        }
        long var1 = class107.method78();
        try {
            if (this.field1118 != 0L) {
                if (var1 < this.field1118) {
                    return;
                }
                this.method994(this.field1108);
                this.field1118 = 0L;
                this.field1127 = true;
            }
            int var3 = this.method985();
            if (this.field1121 - var3 > this.field1119) {
                this.field1119 = this.field1121 - var3;
            }
            int var4 = this.field1117 + this.field1116;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1108) {
                this.field1108 += 1024;
                if (this.field1108 > 16384) {
                    this.field1108 = 16384;
                }
                this.method988();
                this.method994(this.field1108);
                var3 = 0;
                this.field1127 = true;
                if (var4 + 256 > this.field1108) {
                    var4 = this.field1108 - 256;
                    this.field1117 = var4 - this.field1116;
                }
            }
            while (var3 < var4) {
                this.method1054(this.field1111, 256);
                this.method999();
                var3 += 256;
            }
            if (var1 > this.field1122) {
                if (this.field1127) {
                    this.field1127 = false;
                } else if (this.field1119 == 0 && this.field1123 == 0) {
                    this.method988();
                    this.field1118 = var1 + 2000L;
                    return;
                } else {
                    this.field1117 = Math.min(this.field1123, this.field1119);
                    this.field1123 = this.field1119;
                }
                this.field1119 = 0;
                this.field1122 = var1 + 2000L;
            }
            this.field1121 = var3;
        } catch (Exception var8) {
            this.method988();
            this.field1118 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1114 + 500000L) {
                var1 = this.field1114;
            }
            while (var1 > this.field1114 + 5000L) {
                this.method1053(256);
                this.field1114 += (long) (256000 / Statics.field1126);
            }
        } catch (Exception var7) {
            this.field1114 = var1;
        }
    }

    @ObfuscatedName("ad.p(I)V")
    public final void method1066() {
        this.field1127 = true;
    }

    @ObfuscatedName("ad.c(I)V")
    public final synchronized void method1071() {
        this.field1127 = true;
        try {
            this.method989();
        } catch (Exception var2) {
            this.method988();
            this.field1118 = class107.method78() + 2000L;
        }
    }

    @ObfuscatedName("ad.u(S)V")
    public final synchronized void method1056() {
        if (Statics.field1109 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1109.field1286[var2] == this) {
                    Statics.field1109.field1286[var2] = null;
                }
                if (Statics.field1109.field1286[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1109.field1279 = true;
                while (Statics.field1109.field1280) {
                    class119.method488(50L);
                }
                Statics.field1109 = null;
            }
        }
        this.method988();
        this.field1111 = null;
    }

    @ObfuscatedName("ad.d(II)V")
    public final void method1053(int arg0) {
        this.field1124 -= arg0;
        if (this.field1124 < 0) {
            this.field1124 = 0;
        }
        if (this.field1115 != null) {
            this.field1115.method1011(arg0);
        }
    }

    @ObfuscatedName("ad.o([II)V")
    public final void method1054(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1125) {
            var3 = arg1 << 1;
        }
        class112.method2378(arg0, 0, var3);
        this.field1124 -= arg1;
        if (this.field1115 != null && this.field1124 <= 0) {
            this.field1124 += Statics.field1126 >> 4;
            method592(this.field1115);
            this.method1051(this.field1115, this.field1115.method1158());
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
                        class62 var10 = null;
                        class62 var11 = this.field1113[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1193;
                                if (var12 == null || var12.field1192 <= var8) {
                                    var11.field1196 = true;
                                    int var13 = var11.method1006();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1192 += var13;
                                    }
                                    if (var4 >= this.field1112) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1009();
                                    if (var14 != null) {
                                        int var15 = var11.field1194;
                                        while (var14 != null) {
                                            this.method1051(var14, var15 * var14.method1158() >> 8);
                                            var14 = var11.method1007();
                                        }
                                    }
                                    class62 var16 = var11.field1195;
                                    var11.field1195 = null;
                                    if (var10 == null) {
                                        this.field1113[var7] = var16;
                                    } else {
                                        var10.field1195 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1110[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1195;
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
                class62 var18 = this.field1113[var17];
                class62[] var19 = this.field1113;
                this.field1110[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1195;
                    var18.field1195 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1124 < 0) {
            this.field1124 = 0;
        }
        if (this.field1115 != null) {
            this.field1115.method1005(arg0, 0, arg1);
        }
        this.field1114 = class107.method78();
    }

    @ObfuscatedName("o.aj(Lbk;I)V")
    public static final void method592(class62 arg0) {
        arg0.field1196 = false;
        if (arg0.field1193 != null) {
            arg0.field1193.field1192 = 0;
        }
        for (class62 var1 = arg0.method1009(); var1 != null; var1 = arg0.method1007()) {
            method592(var1);
        }
    }

    @ObfuscatedName("ad.au(Lbk;II)V")
    public final void method1051(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1110[var3];
        if (var4 == null) {
            this.field1113[var3] = arg0;
        } else {
            var4.field1195 = arg0;
        }
        this.field1110[var3] = arg0;
        arg0.field1194 = arg1;
    }

    @ObfuscatedName("ad.y(Ljava/awt/Component;)V")
    public void method984(Component arg0) throws Exception {
    }

    @ObfuscatedName("ad.k(I)V")
    public void method994(int arg0) throws Exception {
    }

    @ObfuscatedName("ad.g()I")
    public int method985() throws Exception {
        return this.field1108;
    }

    @ObfuscatedName("ad.n()V")
    public void method999() throws Exception {
    }

    @ObfuscatedName("ad.t()V")
    public void method988() {
    }

    @ObfuscatedName("ad.e()V")
    public void method989() throws Exception {
    }
}
