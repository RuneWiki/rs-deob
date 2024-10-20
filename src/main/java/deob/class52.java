package deob;

import java.awt.Component;

@ObfuscatedName("as")
public class class52 {

    @ObfuscatedName("as.t")
    public int[] field1134;

    @ObfuscatedName("as.i")
    public class62 field1135;

    @ObfuscatedName("as.c")
    public int field1136 = 32;

    @ObfuscatedName("as.k")
    public long field1132 = class107.method3364();

    @ObfuscatedName("as.x")
    public int field1138;

    @ObfuscatedName("as.e")
    public int field1139;

    @ObfuscatedName("as.q")
    public int field1151;

    @ObfuscatedName("as.o")
    public long field1145 = 0L;

    @ObfuscatedName("as.r")
    public int field1140 = 0;

    @ObfuscatedName("as.v")
    public int field1143 = 0;

    @ObfuscatedName("as.h")
    public int field1144 = 0;

    @ObfuscatedName("as.p")
    public long field1149 = 0L;

    @ObfuscatedName("as.y")
    public boolean field1137 = true;

    @ObfuscatedName("as.aj")
    public int field1148 = 0;

    @ObfuscatedName("as.aq")
    public class62[] field1141 = new class62[8];

    @ObfuscatedName("as.al")
    public class62[] field1150 = new class62[8];

    @ObfuscatedName("y.w(IZII)V")
    public static final void method513(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1142 = arg0;
        Statics.field1146 = arg1;
        Statics.field2535 = arg2;
    }

    @ObfuscatedName("m.d(Ldy;Ljava/awt/Component;IIB)Las;")
    public static final class52 method27(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1142 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1134 = new int[(Statics.field1146 ? 2 : 1) * 256];
                var4.field1139 = arg3;
                var4.method970(arg1);
                var4.field1138 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1138 > 16384) {
                    var4.field1138 = 16384;
                }
                var4.method977(var4.field1138);
                if (Statics.field2535 > 0 && Statics.field1133 == null) {
                    Statics.field1133 = new class68();
                    Statics.field1133.field1304 = arg0;
                    arg0.method2581(Statics.field1133, Statics.field2535);
                }
                if (Statics.field1133 != null) {
                    if (Statics.field1133.field1309[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1133.field1309[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1134 = new int[256 * (Statics.field1146 ? 2 : 1)];
                    var6.field1139 = arg3;
                    var6.method970(arg1);
                    var6.field1138 = 16384;
                    var6.method977(var6.field1138);
                    if (Statics.field2535 > 0 && Statics.field1133 == null) {
                        Statics.field1133 = new class68();
                        Statics.field1133.field1304 = arg0;
                        arg0.method2581(Statics.field1133, Statics.field2535);
                    }
                    if (Statics.field1133 != null) {
                        if (Statics.field1133.field1309[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1133.field1309[arg2] = var6;
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

    @ObfuscatedName("as.l(Lbh;S)V")
    public final synchronized void method1037(class62 arg0) {
        this.field1135 = arg0;
    }

    @ObfuscatedName("as.aj(S)V")
    public final synchronized void method1067() {
        if (this.field1134 == null) {
            return;
        }
        long var1 = class107.method3364();
        try {
            if (this.field1145 != 0L) {
                if (var1 < this.field1145) {
                    return;
                }
                this.method977(this.field1138);
                this.field1145 = 0L;
                this.field1137 = true;
            }
            int var3 = this.method972();
            if (this.field1144 - var3 > this.field1140) {
                this.field1140 = this.field1144 - var3;
            }
            int var4 = this.field1151 + this.field1139;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1138) {
                this.field1138 += 1024;
                if (this.field1138 > 16384) {
                    this.field1138 = 16384;
                }
                this.method987();
                this.method977(this.field1138);
                var3 = 0;
                this.field1137 = true;
                if (var4 + 256 > this.field1138) {
                    var4 = this.field1138 - 256;
                    this.field1151 = var4 - this.field1139;
                }
            }
            while (var3 < var4) {
                this.method1042(this.field1134, 256);
                this.method969();
                var3 += 256;
            }
            if (var1 > this.field1149) {
                if (this.field1137) {
                    this.field1137 = false;
                } else if (this.field1140 == 0 && this.field1143 == 0) {
                    this.method987();
                    this.field1145 = var1 + 2000L;
                    return;
                } else {
                    this.field1151 = Math.min(this.field1143, this.field1140);
                    this.field1143 = this.field1140;
                }
                this.field1140 = 0;
                this.field1149 = var1 + 2000L;
            }
            this.field1144 = var3;
        } catch (Exception var8) {
            this.method987();
            this.field1145 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1132 + 500000L) {
                var1 = this.field1132;
            }
            while (var1 > this.field1132 + 5000L) {
                this.method1044(256);
                this.field1132 += (long) (256000 / Statics.field1142);
            }
        } catch (Exception var7) {
            this.field1132 = var1;
        }
    }

    @ObfuscatedName("as.aq(B)V")
    public final void method1039() {
        this.field1137 = true;
    }

    @ObfuscatedName("as.al(I)V")
    public final synchronized void method1045() {
        this.field1137 = true;
        try {
            this.method978();
        } catch (Exception var2) {
            this.method987();
            this.field1145 = class107.method3364() + 2000L;
        }
    }

    @ObfuscatedName("as.az(I)V")
    public final synchronized void method1041() {
        if (Statics.field1133 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1133.field1309[var2] == this) {
                    Statics.field1133.field1309[var2] = null;
                }
                if (Statics.field1133.field1309[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1133.field1305 = true;
                while (Statics.field1133.field1308) {
                    class119.method2154(50L);
                }
                Statics.field1133 = null;
            }
        }
        this.method987();
        this.field1134 = null;
    }

    @ObfuscatedName("as.ah(IB)V")
    public final void method1044(int arg0) {
        this.field1148 -= arg0;
        if (this.field1148 < 0) {
            this.field1148 = 0;
        }
        if (this.field1135 != null) {
            this.field1135.method1022(arg0);
        }
    }

    @ObfuscatedName("as.ag([II)V")
    public final void method1042(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1146) {
            var3 = arg1 << 1;
        }
        class112.method2411(arg0, 0, var3);
        this.field1148 -= arg1;
        if (this.field1135 != null && this.field1148 <= 0) {
            this.field1148 += Statics.field1142 >> 4;
            method573(this.field1135);
            this.method1043(this.field1135, this.field1135.method1164());
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
                        class62 var11 = this.field1141[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1219;
                                if (var12 == null || var12.field1218 <= var8) {
                                    var11.field1221 = true;
                                    int var13 = var11.method1000();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1218 += var13;
                                    }
                                    if (var4 >= this.field1136) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method998();
                                    if (var14 != null) {
                                        int var15 = var11.field1220;
                                        while (var14 != null) {
                                            this.method1043(var14, var15 * var14.method1164() >> 8);
                                            var14 = var11.method999();
                                        }
                                    }
                                    class62 var16 = var11.field1222;
                                    var11.field1222 = null;
                                    if (var10 == null) {
                                        this.field1141[var7] = var16;
                                    } else {
                                        var10.field1222 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1150[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1222;
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
                class62 var18 = this.field1141[var17];
                class62[] var19 = this.field1141;
                this.field1150[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1222;
                    var18.field1222 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1148 < 0) {
            this.field1148 = 0;
        }
        if (this.field1135 != null) {
            this.field1135.method1001(arg0, 0, arg1);
        }
        this.field1132 = class107.method3364();
    }

    @ObfuscatedName("al.ad(Lbh;B)V")
    public static final void method573(class62 arg0) {
        arg0.field1221 = false;
        if (arg0.field1219 != null) {
            arg0.field1219.field1218 = 0;
        }
        for (class62 var1 = arg0.method998(); var1 != null; var1 = arg0.method999()) {
            method573(var1);
        }
    }

    @ObfuscatedName("as.ao(Lbh;II)V")
    public final void method1043(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1150[var3];
        if (var4 == null) {
            this.field1141[var3] = arg0;
        } else {
            var4.field1222 = arg0;
        }
        this.field1150[var3] = arg0;
        arg0.field1220 = arg1;
    }

    @ObfuscatedName("as.n(Ljava/awt/Component;)V")
    public void method970(Component arg0) throws Exception {
    }

    @ObfuscatedName("as.g(I)V")
    public void method977(int arg0) throws Exception {
    }

    @ObfuscatedName("as.a()I")
    public int method972() throws Exception {
        return this.field1138;
    }

    @ObfuscatedName("as.m()V")
    public void method969() throws Exception {
    }

    @ObfuscatedName("as.s()V")
    public void method987() {
    }

    @ObfuscatedName("as.j()V")
    public void method978() throws Exception {
    }
}
