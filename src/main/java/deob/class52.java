package deob;

import java.awt.Component;

@ObfuscatedName("av")
public class class52 {

    @ObfuscatedName("av.a")
    public int[] field1112;

    @ObfuscatedName("av.h")
    public class62 field1113;

    @ObfuscatedName("av.l")
    public int field1114 = 32;

    @ObfuscatedName("av.u")
    public long field1127 = class107.method1670();

    @ObfuscatedName("av.q")
    public int field1116;

    @ObfuscatedName("av.k")
    public int field1117;

    @ObfuscatedName("av.x")
    public int field1111;

    @ObfuscatedName("av.r")
    public long field1119 = 0L;

    @ObfuscatedName("av.j")
    public int field1120 = 0;

    @ObfuscatedName("av.s")
    public int field1121 = 0;

    @ObfuscatedName("av.v")
    public int field1122 = 0;

    @ObfuscatedName("av.c")
    public long field1123 = 0L;

    @ObfuscatedName("av.p")
    public boolean field1124 = true;

    @ObfuscatedName("av.ad")
    public int field1129 = 0;

    @ObfuscatedName("av.ak")
    public class62[] field1128 = new class62[8];

    @ObfuscatedName("av.ae")
    public class62[] field1109 = new class62[8];

    @ObfuscatedName("o.s(IZII)V")
    public static final void method540(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field3058 = arg0;
        Statics.field619 = arg1;
        Statics.field1126 = arg2;
    }

    @ObfuscatedName("dl.v(Ldx;Ljava/awt/Component;III)Lav;")
    public static final class52 method2230(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field3058 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1112 = new int[(Statics.field619 ? 2 : 1) * 256];
                var4.field1117 = arg3;
                var4.method987(arg1);
                var4.field1116 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1116 > 16384) {
                    var4.field1116 = 16384;
                }
                var4.method988(var4.field1116);
                if (Statics.field1126 > 0 && Statics.field1118 == null) {
                    Statics.field1118 = new class68();
                    Statics.field1118.field1284 = arg0;
                    arg0.method2624(Statics.field1118, Statics.field1126);
                }
                if (Statics.field1118 != null) {
                    if (Statics.field1118.field1283[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1118.field1283[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1112 = new int[(Statics.field619 ? 2 : 1) * 256];
                    var6.field1117 = arg3;
                    var6.method987(arg1);
                    var6.field1116 = 16384;
                    var6.method988(var6.field1116);
                    if (Statics.field1126 > 0 && Statics.field1118 == null) {
                        Statics.field1118 = new class68();
                        Statics.field1118.field1284 = arg0;
                        arg0.method2624(Statics.field1118, Statics.field1126);
                    }
                    if (Statics.field1118 != null) {
                        if (Statics.field1118.field1283[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1118.field1283[arg2] = var6;
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

    @ObfuscatedName("av.c(Lbu;I)V")
    public final synchronized void method1048(class62 arg0) {
        this.field1113 = arg0;
    }

    @ObfuscatedName("av.p(I)V")
    public final synchronized void method1070() {
        if (this.field1112 == null) {
            return;
        }
        long var1 = class107.method1670();
        try {
            if (this.field1119 != 0L) {
                if (var1 < this.field1119) {
                    return;
                }
                this.method988(this.field1116);
                this.field1119 = 0L;
                this.field1124 = true;
            }
            int var3 = this.method989();
            if (this.field1122 - var3 > this.field1120) {
                this.field1120 = this.field1122 - var3;
            }
            int var4 = this.field1117 + this.field1111;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1116) {
                this.field1116 += 1024;
                if (this.field1116 > 16384) {
                    this.field1116 = 16384;
                }
                this.method995();
                this.method988(this.field1116);
                var3 = 0;
                this.field1124 = true;
                if (var4 + 256 > this.field1116) {
                    var4 = this.field1116 - 256;
                    this.field1111 = var4 - this.field1117;
                }
            }
            while (var3 < var4) {
                this.method1053(this.field1112, 256);
                this.method999();
                var3 += 256;
            }
            if (var1 > this.field1123) {
                if (this.field1124) {
                    this.field1124 = false;
                } else if (this.field1120 == 0 && this.field1121 == 0) {
                    this.method995();
                    this.field1119 = var1 + 2000L;
                    return;
                } else {
                    this.field1111 = Math.min(this.field1121, this.field1120);
                    this.field1121 = this.field1120;
                }
                this.field1120 = 0;
                this.field1123 = var1 + 2000L;
            }
            this.field1122 = var3;
        } catch (Exception var8) {
            this.method995();
            this.field1119 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1127 + 500000L) {
                var1 = this.field1127;
            }
            while (var1 > this.field1127 + 5000L) {
                this.method1052(256);
                this.field1127 += (long) (256000 / Statics.field3058);
            }
        } catch (Exception var7) {
            this.field1127 = var1;
        }
    }

    @ObfuscatedName("av.o(B)V")
    public final void method1055() {
        this.field1124 = true;
    }

    @ObfuscatedName("av.b(I)V")
    public final synchronized void method1050() {
        this.field1124 = true;
        try {
            this.method991();
        } catch (Exception var2) {
            this.method995();
            this.field1119 = class107.method1670() + 2000L;
        }
    }

    @ObfuscatedName("av.t(I)V")
    public final synchronized void method1056() {
        if (Statics.field1118 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1118.field1283[var2] == this) {
                    Statics.field1118.field1283[var2] = null;
                }
                if (Statics.field1118.field1283[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1118.field1282 = true;
                while (Statics.field1118.field1285) {
                    class119.method3147(50L);
                }
                Statics.field1118 = null;
            }
        }
        this.method995();
        this.field1112 = null;
    }

    @ObfuscatedName("av.w(II)V")
    public final void method1052(int arg0) {
        this.field1129 -= arg0;
        if (this.field1129 < 0) {
            this.field1129 = 0;
        }
        if (this.field1113 != null) {
            this.field1113.method1014(arg0);
        }
    }

    @ObfuscatedName("av.i([II)V")
    public final void method1053(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field619) {
            var3 = arg1 << 1;
        }
        class112.method2452(arg0, 0, var3);
        this.field1129 -= arg1;
        if (this.field1113 != null && this.field1129 <= 0) {
            this.field1129 += Statics.field3058 >> 4;
            method947(this.field1113);
            this.method1054(this.field1113, this.field1113.method1159());
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
                        class62 var11 = this.field1128[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1200;
                                if (var12 == null || var12.field1197 <= var8) {
                                    var11.field1201 = true;
                                    int var13 = var11.method1009();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1197 += var13;
                                    }
                                    if (var4 >= this.field1114) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1020();
                                    if (var14 != null) {
                                        int var15 = var11.field1198;
                                        while (var14 != null) {
                                            this.method1054(var14, var15 * var14.method1159() >> 8);
                                            var14 = var11.method1046();
                                        }
                                    }
                                    class62 var16 = var11.field1199;
                                    var11.field1199 = null;
                                    if (var10 == null) {
                                        this.field1128[var7] = var16;
                                    } else {
                                        var10.field1199 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1109[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1199;
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
                class62 var18 = this.field1128[var17];
                class62[] var19 = this.field1128;
                this.field1109[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1199;
                    var18.field1199 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1129 < 0) {
            this.field1129 = 0;
        }
        if (this.field1113 != null) {
            this.field1113.method1012(arg0, 0, arg1);
        }
        this.field1127 = class107.method1670();
    }

    @ObfuscatedName("aj.ad(Lbu;I)V")
    public static final void method947(class62 arg0) {
        arg0.field1201 = false;
        if (arg0.field1200 != null) {
            arg0.field1200.field1197 = 0;
        }
        for (class62 var1 = arg0.method1020(); var1 != null; var1 = arg0.method1046()) {
            method947(var1);
        }
    }

    @ObfuscatedName("av.ak(Lbu;II)V")
    public final void method1054(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1109[var3];
        if (var4 == null) {
            this.field1128[var3] = arg0;
        } else {
            var4.field1199 = arg0;
        }
        this.field1109[var3] = arg0;
        arg0.field1198 = arg1;
    }

    @ObfuscatedName("av.n(Ljava/awt/Component;)V")
    public void method987(Component arg0) throws Exception {
    }

    @ObfuscatedName("av.d(I)V")
    public void method988(int arg0) throws Exception {
    }

    @ObfuscatedName("av.z()I")
    public int method989() throws Exception {
        return this.field1116;
    }

    @ObfuscatedName("av.y()V")
    public void method999() throws Exception {
    }

    @ObfuscatedName("av.e()V")
    public void method995() {
    }

    @ObfuscatedName("av.g()V")
    public void method991() throws Exception {
    }
}
