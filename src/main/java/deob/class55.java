package deob;

import java.awt.Component;

@ObfuscatedName("bd")
public class class55 {

    @ObfuscatedName("bd.a")
    public int[] field1159;

    @ObfuscatedName("bd.o")
    public class65 field1148;

    @ObfuscatedName("bd.u")
    public int field1154 = 32;

    @ObfuscatedName("bd.m")
    public long field1150 = Statics.method2875();

    @ObfuscatedName("bd.e")
    public int field1152;

    @ObfuscatedName("bd.v")
    public int field1153;

    @ObfuscatedName("bd.r")
    public int field1149;

    @ObfuscatedName("bd.t")
    public long field1155 = 0L;

    @ObfuscatedName("bd.g")
    public int field1156 = 0;

    @ObfuscatedName("bd.s")
    public int field1157 = 0;

    @ObfuscatedName("bd.n")
    public int field1158 = 0;

    @ObfuscatedName("bd.h")
    public long field1144 = 0L;

    @ObfuscatedName("bd.p")
    public boolean field1151 = true;

    @ObfuscatedName("bd.at")
    public int field1162 = 0;

    @ObfuscatedName("bd.au")
    public class65[] field1160 = new class65[8];

    @ObfuscatedName("bd.aa")
    public class65[] field1164 = new class65[8];

    @ObfuscatedName("ex.p(IZII)V")
    public static final void method2879(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1163 = arg0;
        Statics.field1145 = arg1;
        Statics.field1146 = arg2;
    }

    @ObfuscatedName("ay.c(Leq;Ljava/awt/Component;III)Lbd;")
    public static final class55 method1018(class131 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1163 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class68 var4 = new class68();
                var4.field1159 = new int[256 * (Statics.field1145 ? 2 : 1)];
                var4.field1153 = arg3;
                var4.method1142(arg1);
                var4.field1152 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1152 > 16384) {
                    var4.field1152 = 16384;
                }
                var4.method1131(var4.field1152);
                if (Statics.field1146 > 0 && Statics.field1147 == null) {
                    Statics.field1147 = new class71();
                    Statics.field1147.field1316 = arg0;
                    arg0.method2697(Statics.field1147, Statics.field1146);
                }
                if (Statics.field1147 != null) {
                    if (Statics.field1147.field1317[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1147.field1317[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class53 var6 = new class53(arg0, arg2);
                    var6.field1159 = new int[256 * (Statics.field1145 ? 2 : 1)];
                    var6.field1153 = arg3;
                    var6.method1142(arg1);
                    var6.field1152 = 16384;
                    var6.method1131(var6.field1152);
                    if (Statics.field1146 > 0 && Statics.field1147 == null) {
                        Statics.field1147 = new class71();
                        Statics.field1147.field1316 = arg0;
                        arg0.method2697(Statics.field1147, Statics.field1146);
                    }
                    if (Statics.field1147 != null) {
                        if (Statics.field1147.field1317[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1147.field1317[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class55();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bd.x(Lbx;I)V")
    public final synchronized void method1191(class65 arg0) {
        this.field1148 = arg0;
    }

    @ObfuscatedName("bd.q(I)V")
    public final synchronized void method1201() {
        if (this.field1159 == null) {
            return;
        }
        long var1 = Statics.method2875();
        try {
            if (this.field1155 != 0L) {
                if (var1 < this.field1155) {
                    return;
                }
                this.method1131(this.field1152);
                this.field1155 = 0L;
                this.field1151 = true;
            }
            int var3 = this.method1132();
            if (this.field1158 - var3 > this.field1156) {
                this.field1156 = this.field1158 - var3;
            }
            int var4 = this.field1153 + this.field1149;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1152) {
                this.field1152 += 1024;
                if (this.field1152 > 16384) {
                    this.field1152 = 16384;
                }
                this.method1129();
                this.method1131(this.field1152);
                var3 = 0;
                this.field1151 = true;
                if (var4 + 256 > this.field1152) {
                    var4 = this.field1152 - 256;
                    this.field1149 = var4 - this.field1153;
                }
            }
            while (var3 < var4) {
                this.method1195(this.field1159, 256);
                this.method1133();
                var3 += 256;
            }
            if (var1 > this.field1144) {
                if (this.field1151) {
                    this.field1151 = false;
                } else if (this.field1156 == 0 && this.field1157 == 0) {
                    this.method1129();
                    this.field1155 = var1 + 2000L;
                    return;
                } else {
                    this.field1149 = Math.min(this.field1157, this.field1156);
                    this.field1157 = this.field1156;
                }
                this.field1156 = 0;
                this.field1144 = var1 + 2000L;
            }
            this.field1158 = var3;
        } catch (Exception var8) {
            this.method1129();
            this.field1155 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1150 + 500000L) {
                var1 = this.field1150;
            }
            while (var1 > this.field1150 + 5000L) {
                this.method1197(256);
                this.field1150 += (long) (256000 / Statics.field1163);
            }
        } catch (Exception var7) {
            this.field1150 = var1;
        }
    }

    @ObfuscatedName("bd.b(I)V")
    public final void method1210() {
        this.field1151 = true;
    }

    @ObfuscatedName("bd.k(B)V")
    public final synchronized void method1193() {
        this.field1151 = true;
        try {
            this.method1141();
        } catch (Exception var2) {
            this.method1129();
            this.field1155 = Statics.method2875() + 2000L;
        }
    }

    @ObfuscatedName("bd.at(B)V")
    public final synchronized void method1211() {
        if (Statics.field1147 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1147.field1317[var2] == this) {
                    Statics.field1147.field1317[var2] = null;
                }
                if (Statics.field1147.field1317[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1147.field1318 = true;
                while (Statics.field1147.field1319) {
                    class122.method558(50L);
                }
                Statics.field1147 = null;
            }
        }
        this.method1129();
        this.field1159 = null;
    }

    @ObfuscatedName("bd.au(II)V")
    public final void method1197(int arg0) {
        this.field1162 -= arg0;
        if (this.field1162 < 0) {
            this.field1162 = 0;
        }
        if (this.field1148 != null) {
            this.field1148.method1160(arg0);
        }
    }

    @ObfuscatedName("bd.aa([II)V")
    public final void method1195(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1145) {
            var3 = arg1 << 1;
        }
        class115.method2532(arg0, 0, var3);
        this.field1162 -= arg1;
        if (this.field1148 != null && this.field1162 <= 0) {
            this.field1162 += Statics.field1163 >> 4;
            method102(this.field1148);
            this.method1196(this.field1148, this.field1148.method1335());
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
                        class65 var10 = null;
                        class65 var11 = this.field1160[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class64 var12 = var11.field1234;
                                if (var12 == null || var12.field1231 <= var8) {
                                    var11.field1232 = true;
                                    int var13 = var11.method1157();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1231 += var13;
                                    }
                                    if (var4 >= this.field1154) {
                                        break label105;
                                    }
                                    class65 var14 = var11.method1155();
                                    if (var14 != null) {
                                        int var15 = var11.field1233;
                                        while (var14 != null) {
                                            this.method1196(var14, var15 * var14.method1335() >> 8);
                                            var14 = var11.method1156();
                                        }
                                    }
                                    class65 var16 = var11.field1235;
                                    var11.field1235 = null;
                                    if (var10 == null) {
                                        this.field1160[var7] = var16;
                                    } else {
                                        var10.field1235 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1164[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1235;
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
                class65 var18 = this.field1160[var17];
                class65[] var19 = this.field1160;
                this.field1164[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class65 var21 = var18.field1235;
                    var18.field1235 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1162 < 0) {
            this.field1162 = 0;
        }
        if (this.field1148 != null) {
            this.field1148.method1158(arg0, 0, arg1);
        }
        this.field1150 = Statics.method2875();
    }

    @ObfuscatedName("i.ak(Lbx;I)V")
    public static final void method102(class65 arg0) {
        arg0.field1232 = false;
        if (arg0.field1234 != null) {
            arg0.field1234.field1231 = 0;
        }
        for (class65 var1 = arg0.method1155(); var1 != null; var1 = arg0.method1156()) {
            method102(var1);
        }
    }

    @ObfuscatedName("bd.an(Lbx;IB)V")
    public final void method1196(class65 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class65 var4 = this.field1164[var3];
        if (var4 == null) {
            this.field1160[var3] = arg0;
        } else {
            var4.field1235 = arg0;
        }
        this.field1164[var3] = arg0;
        arg0.field1233 = arg1;
    }

    @ObfuscatedName("bd.j(Ljava/awt/Component;)V")
    public void method1142(Component arg0) throws Exception {
    }

    @ObfuscatedName("bd.y(I)V")
    public void method1131(int arg0) throws Exception {
    }

    @ObfuscatedName("bd.z()I")
    public int method1132() throws Exception {
        return this.field1152;
    }

    @ObfuscatedName("bd.l()V")
    public void method1133() throws Exception {
    }

    @ObfuscatedName("bd.w()V")
    public void method1129() {
    }

    @ObfuscatedName("bd.d()V")
    public void method1141() throws Exception {
    }
}
