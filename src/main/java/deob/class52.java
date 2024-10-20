package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class52 {

    @ObfuscatedName("ax.d")
    public int[] field1120;

    @ObfuscatedName("ax.v")
    public class62 field1121;

    @ObfuscatedName("ax.m")
    public int field1118 = 32;

    @ObfuscatedName("ax.h")
    public long field1125 = class107.method579();

    @ObfuscatedName("ax.n")
    public int field1124;

    @ObfuscatedName("ax.x")
    public int field1130;

    @ObfuscatedName("ax.o")
    public int field1126;

    @ObfuscatedName("ax.r")
    public long field1127 = 0L;

    @ObfuscatedName("ax.y")
    public int field1133 = 0;

    @ObfuscatedName("ax.i")
    public int field1129 = 0;

    @ObfuscatedName("ax.q")
    public int field1138 = 0;

    @ObfuscatedName("ax.g")
    public long field1131 = 0L;

    @ObfuscatedName("ax.l")
    public boolean field1132 = true;

    @ObfuscatedName("ax.ag")
    public int field1134 = 0;

    @ObfuscatedName("ax.am")
    public class62[] field1135 = new class62[8];

    @ObfuscatedName("ax.aa")
    public class62[] field1136 = new class62[8];

    @ObfuscatedName("ck.u(IZII)V")
    public static final void method2017(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1494 = arg0;
        Statics.field1128 = arg1;
        Statics.field2550 = arg2;
    }

    @ObfuscatedName("d.j(Ldd;Ljava/awt/Component;IIS)Lax;")
    public static final class52 method82(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1494 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1120 = new int[256 * (Statics.field1128 ? 2 : 1)];
                var4.field1130 = arg3;
                var4.method981(arg1);
                var4.field1124 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1124 > 16384) {
                    var4.field1124 = 16384;
                }
                var4.method965(var4.field1124);
                if (Statics.field2550 > 0 && Statics.field1119 == null) {
                    Statics.field1119 = new class68();
                    Statics.field1119.field1289 = arg0;
                    arg0.method2547(Statics.field1119, Statics.field2550);
                }
                if (Statics.field1119 != null) {
                    if (Statics.field1119.field1288[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1119.field1288[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1120 = new int[(Statics.field1128 ? 2 : 1) * 256];
                    var6.field1130 = arg3;
                    var6.method981(arg1);
                    var6.field1124 = 16384;
                    var6.method965(var6.field1124);
                    if (Statics.field2550 > 0 && Statics.field1119 == null) {
                        Statics.field1119 = new class68();
                        Statics.field1119.field1289 = arg0;
                        arg0.method2547(Statics.field1119, Statics.field2550);
                    }
                    if (Statics.field1119 != null) {
                        if (Statics.field1119.field1288[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1119.field1288[arg2] = var6;
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

    @ObfuscatedName("ax.z(Lbv;I)V")
    public final synchronized void method1022(class62 arg0) {
        this.field1121 = arg0;
    }

    @ObfuscatedName("ax.b(I)V")
    public final synchronized void method1023() {
        if (this.field1120 == null) {
            return;
        }
        long var1 = class107.method579();
        try {
            if (this.field1127 != 0L) {
                if (var1 < this.field1127) {
                    return;
                }
                this.method965(this.field1124);
                this.field1127 = 0L;
                this.field1132 = true;
            }
            int var3 = this.method966();
            if (this.field1138 - var3 > this.field1133) {
                this.field1133 = this.field1138 - var3;
            }
            int var4 = this.field1130 + this.field1126;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1124) {
                this.field1124 += 1024;
                if (this.field1124 > 16384) {
                    this.field1124 = 16384;
                }
                this.method968();
                this.method965(this.field1124);
                var3 = 0;
                this.field1132 = true;
                if (var4 + 256 > this.field1124) {
                    var4 = this.field1124 - 256;
                    this.field1126 = var4 - this.field1130;
                }
            }
            while (var3 < var4) {
                this.method1028(this.field1120, 256);
                this.method967();
                var3 += 256;
            }
            if (var1 > this.field1131) {
                if (this.field1132) {
                    this.field1132 = false;
                } else if (this.field1133 == 0 && this.field1129 == 0) {
                    this.method968();
                    this.field1127 = var1 + 2000L;
                    return;
                } else {
                    this.field1126 = Math.min(this.field1129, this.field1133);
                    this.field1129 = this.field1133;
                }
                this.field1133 = 0;
                this.field1131 = var1 + 2000L;
            }
            this.field1138 = var3;
        } catch (Exception var8) {
            this.method968();
            this.field1127 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1125 + 500000L) {
                var1 = this.field1125;
            }
            while (var1 > this.field1125 + 5000L) {
                this.method1027(256);
                this.field1125 += (long) (256000 / Statics.field1494);
            }
        } catch (Exception var7) {
            this.field1125 = var1;
        }
    }

    @ObfuscatedName("ax.a(I)V")
    public final void method1024() {
        this.field1132 = true;
    }

    @ObfuscatedName("ax.ag(S)V")
    public final synchronized void method1046() {
        this.field1132 = true;
        try {
            this.method969();
        } catch (Exception var2) {
            this.method968();
            this.field1127 = class107.method579() + 2000L;
        }
    }

    @ObfuscatedName("ax.am(B)V")
    public final synchronized void method1026() {
        if (Statics.field1119 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1119.field1288[var2] == this) {
                    Statics.field1119.field1288[var2] = null;
                }
                if (Statics.field1119.field1288[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1119.field1287 = true;
                while (Statics.field1119.field1290) {
                    class119.method1371(50L);
                }
                Statics.field1119 = null;
            }
        }
        this.method968();
        this.field1120 = null;
    }

    @ObfuscatedName("ax.aa(II)V")
    public final void method1027(int arg0) {
        this.field1134 -= arg0;
        if (this.field1134 < 0) {
            this.field1134 = 0;
        }
        if (this.field1121 != null) {
            this.field1121.method995(arg0);
        }
    }

    @ObfuscatedName("ax.az([II)V")
    public final void method1028(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1128) {
            var3 = arg1 << 1;
        }
        class112.method2378(arg0, 0, var3);
        this.field1134 -= arg1;
        if (this.field1121 != null && this.field1134 <= 0) {
            this.field1134 += Statics.field1494 >> 4;
            method723(this.field1121);
            this.method1038(this.field1121, this.field1121.method1135());
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
                        class62 var11 = this.field1135[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1205;
                                if (var12 == null || var12.field1202 <= var8) {
                                    var11.field1206 = true;
                                    int var13 = var11.method992();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1202 += var13;
                                    }
                                    if (var4 >= this.field1118) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1001();
                                    if (var14 != null) {
                                        int var15 = var11.field1204;
                                        while (var14 != null) {
                                            this.method1038(var14, var15 * var14.method1135() >> 8);
                                            var14 = var11.method991();
                                        }
                                    }
                                    class62 var16 = var11.field1203;
                                    var11.field1203 = null;
                                    if (var10 == null) {
                                        this.field1135[var7] = var16;
                                    } else {
                                        var10.field1203 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1136[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1203;
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
                class62 var18 = this.field1135[var17];
                class62[] var19 = this.field1135;
                this.field1136[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1203;
                    var18.field1203 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1134 < 0) {
            this.field1134 = 0;
        }
        if (this.field1121 != null) {
            this.field1121.method986(arg0, 0, arg1);
        }
        this.field1125 = class107.method579();
    }

    @ObfuscatedName("ai.aq(Lbv;I)V")
    public static final void method723(class62 arg0) {
        arg0.field1206 = false;
        if (arg0.field1205 != null) {
            arg0.field1205.field1202 = 0;
        }
        for (class62 var1 = arg0.method1001(); var1 != null; var1 = arg0.method991()) {
            method723(var1);
        }
    }

    @ObfuscatedName("ax.ak(Lbv;IB)V")
    public final void method1038(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1136[var3];
        if (var4 == null) {
            this.field1135[var3] = arg0;
        } else {
            var4.field1203 = arg0;
        }
        this.field1136[var3] = arg0;
        arg0.field1204 = arg1;
    }

    @ObfuscatedName("ax.p(Ljava/awt/Component;)V")
    public void method981(Component arg0) throws Exception {
    }

    @ObfuscatedName("ax.k(I)V")
    public void method965(int arg0) throws Exception {
    }

    @ObfuscatedName("ax.e()I")
    public int method966() throws Exception {
        return this.field1124;
    }

    @ObfuscatedName("ax.f()V")
    public void method967() throws Exception {
    }

    @ObfuscatedName("ax.w()V")
    public void method968() {
    }

    @ObfuscatedName("ax.t()V")
    public void method969() throws Exception {
    }
}
