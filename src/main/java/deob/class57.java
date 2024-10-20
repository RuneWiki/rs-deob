package deob;

import java.awt.Component;

@ObfuscatedName("bj")
public class class57 {

    @ObfuscatedName("bj.w")
    public int[] field1189;

    @ObfuscatedName("bj.l")
    public class67 field1190;

    @ObfuscatedName("bj.v")
    public int field1191 = 32;

    @ObfuscatedName("bj.k")
    public long field1192 = class115.method2007();

    @ObfuscatedName("bj.o")
    public int field1193;

    @ObfuscatedName("bj.u")
    public int field1207;

    @ObfuscatedName("bj.s")
    public int field1195;

    @ObfuscatedName("bj.g")
    public long field1196 = 0L;

    @ObfuscatedName("bj.x")
    public int field1184 = 0;

    @ObfuscatedName("bj.a")
    public int field1198 = 0;

    @ObfuscatedName("bj.t")
    public int field1200 = 0;

    @ObfuscatedName("bj.z")
    public long field1188 = 0L;

    @ObfuscatedName("bj.r")
    public boolean field1201 = true;

    @ObfuscatedName("bj.ai")
    public int field1204 = 0;

    @ObfuscatedName("bj.ao")
    public class67[] field1205 = new class67[8];

    @ObfuscatedName("bj.ab")
    public class67[] field1194 = new class67[8];

    @ObfuscatedName("eb.r(IZII)V")
    public static final void method2910(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1199 = arg0;
        Statics.field1185 = arg1;
        Statics.field1186 = arg2;
    }

    @ObfuscatedName("k.d(Lev;Ljava/awt/Component;III)Lbj;")
    public static final class57 method148(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1199 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1189 = new int[256 * (Statics.field1185 ? 2 : 1)];
                var4.field1207 = arg3;
                var4.method1071(arg1);
                var4.field1193 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1193 > 16384) {
                    var4.field1193 = 16384;
                }
                var4.method1072(var4.field1193);
                if (Statics.field1186 > 0 && Statics.field1187 == null) {
                    Statics.field1187 = new class73();
                    Statics.field1187.field1360 = arg0;
                    arg0.method2689(Statics.field1187, Statics.field1186);
                }
                if (Statics.field1187 != null) {
                    if (Statics.field1187.field1361[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1187.field1361[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1189 = new int[256 * (Statics.field1185 ? 2 : 1)];
                    var6.field1207 = arg3;
                    var6.method1071(arg1);
                    var6.field1193 = 16384;
                    var6.method1072(var6.field1193);
                    if (Statics.field1186 > 0 && Statics.field1187 == null) {
                        Statics.field1187 = new class73();
                        Statics.field1187.field1360 = arg0;
                        arg0.method2689(Statics.field1187, Statics.field1186);
                    }
                    if (Statics.field1187 != null) {
                        if (Statics.field1187.field1361[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1187.field1361[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class57();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bj.n(Lbc;S)V")
    public final synchronized void method1178(class67 arg0) {
        this.field1190 = arg0;
    }

    @ObfuscatedName("bj.j(I)V")
    public final synchronized void method1139() {
        if (this.field1189 == null) {
            return;
        }
        long var1 = class115.method2007();
        try {
            if (this.field1196 != 0L) {
                if (var1 < this.field1196) {
                    return;
                }
                this.method1072(this.field1193);
                this.field1196 = 0L;
                this.field1201 = true;
            }
            int var3 = this.method1073();
            if (this.field1200 - var3 > this.field1184) {
                this.field1184 = this.field1200 - var3;
            }
            int var4 = this.field1207 + this.field1195;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1193) {
                this.field1193 += 1024;
                if (this.field1193 > 16384) {
                    this.field1193 = 16384;
                }
                this.method1084();
                this.method1072(this.field1193);
                var3 = 0;
                this.field1201 = true;
                if (var4 + 256 > this.field1193) {
                    var4 = this.field1193 - 256;
                    this.field1195 = var4 - this.field1207;
                }
            }
            while (var3 < var4) {
                this.method1148(this.field1189, 256);
                this.method1074();
                var3 += 256;
            }
            if (var1 > this.field1188) {
                if (this.field1201) {
                    this.field1201 = false;
                } else if (this.field1184 == 0 && this.field1198 == 0) {
                    this.method1084();
                    this.field1196 = var1 + 2000L;
                    return;
                } else {
                    this.field1195 = Math.min(this.field1198, this.field1184);
                    this.field1198 = this.field1184;
                }
                this.field1184 = 0;
                this.field1188 = var1 + 2000L;
            }
            this.field1200 = var3;
        } catch (Exception var8) {
            this.method1084();
            this.field1196 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1192 + 500000L) {
                var1 = this.field1192;
            }
            while (var1 > this.field1192 + 5000L) {
                this.method1144(256);
                this.field1192 += (long) (256000 / Statics.field1199);
            }
        } catch (Exception var7) {
            this.field1192 = var1;
        }
    }

    @ObfuscatedName("bj.b(I)V")
    public final void method1141() {
        this.field1201 = true;
    }

    @ObfuscatedName("bj.e(I)V")
    public final synchronized void method1142() {
        this.field1201 = true;
        try {
            this.method1076();
        } catch (Exception var2) {
            this.method1084();
            this.field1196 = class115.method2007() + 2000L;
        }
    }

    @ObfuscatedName("bj.ai(I)V")
    public final synchronized void method1143() {
        if (Statics.field1187 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1187.field1361[var2] == this) {
                    Statics.field1187.field1361[var2] = null;
                }
                if (Statics.field1187.field1361[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1187.field1359 = true;
                while (Statics.field1187.field1362) {
                    class127.method952(50L);
                }
                Statics.field1187 = null;
            }
        }
        this.method1084();
        this.field1189 = null;
    }

    @ObfuscatedName("bj.ao(II)V")
    public final void method1144(int arg0) {
        this.field1204 -= arg0;
        if (this.field1204 < 0) {
            this.field1204 = 0;
        }
        if (this.field1190 != null) {
            this.field1190.method1101(arg0);
        }
    }

    @ObfuscatedName("bj.af([II)V")
    public final void method1148(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1185) {
            var3 = arg1 << 1;
        }
        class120.method2526(arg0, 0, var3);
        this.field1204 -= arg1;
        if (this.field1190 != null && this.field1204 <= 0) {
            this.field1204 += Statics.field1199 >> 4;
            method1933(this.field1190);
            this.method1145(this.field1190, this.field1190.method1254());
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
                        class67 var10 = null;
                        class67 var11 = this.field1205[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1276;
                                if (var12 == null || var12.field1273 <= var8) {
                                    var11.field1274 = true;
                                    int var13 = var11.method1098();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1273 += var13;
                                    }
                                    if (var4 >= this.field1191) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1108();
                                    if (var14 != null) {
                                        int var15 = var11.field1275;
                                        while (var14 != null) {
                                            this.method1145(var14, var15 * var14.method1254() >> 8);
                                            var14 = var11.method1097();
                                        }
                                    }
                                    class67 var16 = var11.field1277;
                                    var11.field1277 = null;
                                    if (var10 == null) {
                                        this.field1205[var7] = var16;
                                    } else {
                                        var10.field1277 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1194[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1277;
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
                class67 var18 = this.field1205[var17];
                class67[] var19 = this.field1205;
                this.field1194[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1277;
                    var18.field1277 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1204 < 0) {
            this.field1204 = 0;
        }
        if (this.field1190 != null) {
            this.field1190.method1109(arg0, 0, arg1);
        }
        this.field1192 = class115.method2007();
    }

    @ObfuscatedName("cd.ab(Lbc;I)V")
    public static final void method1933(class67 arg0) {
        arg0.field1274 = false;
        if (arg0.field1276 != null) {
            arg0.field1276.field1273 = 0;
        }
        for (class67 var1 = arg0.method1108(); var1 != null; var1 = arg0.method1097()) {
            method1933(var1);
        }
    }

    @ObfuscatedName("bj.ax(Lbc;II)V")
    public final void method1145(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1194[var3];
        if (var4 == null) {
            this.field1205[var3] = arg0;
        } else {
            var4.field1277 = arg0;
        }
        this.field1194[var3] = arg0;
        arg0.field1275 = arg1;
    }

    @ObfuscatedName("bj.h(Ljava/awt/Component;)V")
    public void method1071(Component arg0) throws Exception {
    }

    @ObfuscatedName("bj.m(I)V")
    public void method1072(int arg0) throws Exception {
    }

    @ObfuscatedName("bj.i()I")
    public int method1073() throws Exception {
        return this.field1193;
    }

    @ObfuscatedName("bj.q()V")
    public void method1074() throws Exception {
    }

    @ObfuscatedName("bj.p()V")
    public void method1084() {
    }

    @ObfuscatedName("bj.c()V")
    public void method1076() throws Exception {
    }
}
