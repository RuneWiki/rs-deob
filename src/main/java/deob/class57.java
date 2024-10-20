package deob;

import java.awt.Component;

@ObfuscatedName("bp")
public class class57 {

    @ObfuscatedName("bp.v")
    public int[] field1194;

    @ObfuscatedName("bp.l")
    public class67 field1187;

    @ObfuscatedName("bp.z")
    public int field1188 = 32;

    @ObfuscatedName("bp.s")
    public long field1189 = Statics.method162();

    @ObfuscatedName("bp.j")
    public int field1199;

    @ObfuscatedName("bp.q")
    public int field1203;

    @ObfuscatedName("bp.a")
    public int field1192;

    @ObfuscatedName("bp.d")
    public long field1193 = 0L;

    @ObfuscatedName("bp.u")
    public int field1191 = 0;

    @ObfuscatedName("bp.i")
    public int field1198 = 0;

    @ObfuscatedName("bp.o")
    public int field1196 = 0;

    @ObfuscatedName("bp.h")
    public long field1197 = 0L;

    @ObfuscatedName("bp.k")
    public boolean field1186 = true;

    @ObfuscatedName("bp.am")
    public int field1200 = 0;

    @ObfuscatedName("bp.ar")
    public class67[] field1201 = new class67[8];

    @ObfuscatedName("bp.ay")
    public class67[] field1190 = new class67[8];

    @ObfuscatedName("er.h(Les;Ljava/awt/Component;III)Lbp;")
    public static final class57 method2835(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2059 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1194 = new int[256 * (Statics.field1195 ? 2 : 1)];
                var4.field1203 = arg3;
                var4.method1130(arg1);
                var4.field1199 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1199 > 16384) {
                    var4.field1199 = 16384;
                }
                var4.method1114(var4.field1199);
                if (Statics.field1112 > 0 && Statics.field1183 == null) {
                    Statics.field1183 = new class73();
                    Statics.field1183.field1357 = arg0;
                    arg0.method2739(Statics.field1183, Statics.field1112);
                }
                if (Statics.field1183 != null) {
                    if (Statics.field1183.field1355[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1183.field1355[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1194 = new int[(Statics.field1195 ? 2 : 1) * 256];
                    var6.field1203 = arg3;
                    var6.method1130(arg1);
                    var6.field1199 = 16384;
                    var6.method1114(var6.field1199);
                    if (Statics.field1112 > 0 && Statics.field1183 == null) {
                        Statics.field1183 = new class73();
                        Statics.field1183.field1357 = arg0;
                        arg0.method2739(Statics.field1183, Statics.field1112);
                    }
                    if (Statics.field1183 != null) {
                        if (Statics.field1183.field1355[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1183.field1355[arg2] = var6;
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

    @ObfuscatedName("bp.k(Lbj;B)V")
    public final synchronized void method1180(class67 arg0) {
        this.field1187 = arg0;
    }

    @ObfuscatedName("bp.f(I)V")
    public final synchronized void method1198() {
        if (this.field1194 == null) {
            return;
        }
        long var1 = Statics.method162();
        try {
            if (this.field1193 != 0L) {
                if (var1 < this.field1193) {
                    return;
                }
                this.method1114(this.field1199);
                this.field1193 = 0L;
                this.field1186 = true;
            }
            int var3 = this.method1115();
            if (this.field1196 - var3 > this.field1191) {
                this.field1191 = this.field1196 - var3;
            }
            int var4 = this.field1203 + this.field1192;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1199) {
                this.field1199 += 1024;
                if (this.field1199 > 16384) {
                    this.field1199 = 16384;
                }
                this.method1117();
                this.method1114(this.field1199);
                var3 = 0;
                this.field1186 = true;
                if (var4 + 256 > this.field1199) {
                    var4 = this.field1199 - 256;
                    this.field1192 = var4 - this.field1203;
                }
            }
            while (var3 < var4) {
                this.method1182(this.field1194, 256);
                this.method1128();
                var3 += 256;
            }
            if (var1 > this.field1197) {
                if (this.field1186) {
                    this.field1186 = false;
                } else if (this.field1191 == 0 && this.field1198 == 0) {
                    this.method1117();
                    this.field1193 = var1 + 2000L;
                    return;
                } else {
                    this.field1192 = Math.min(this.field1198, this.field1191);
                    this.field1198 = this.field1191;
                }
                this.field1191 = 0;
                this.field1197 = var1 + 2000L;
            }
            this.field1196 = var3;
        } catch (Exception var8) {
            this.method1117();
            this.field1193 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1189 + 500000L) {
                var1 = this.field1189;
            }
            while (var1 > this.field1189 + 5000L) {
                this.method1176(256);
                this.field1189 += (long) (256000 / Statics.field2059);
            }
        } catch (Exception var7) {
            this.field1189 = var1;
        }
    }

    @ObfuscatedName("bp.r(I)V")
    public final void method1173() {
        this.field1186 = true;
    }

    @ObfuscatedName("bp.n(I)V")
    public final synchronized void method1174() {
        this.field1186 = true;
        try {
            this.method1119();
        } catch (Exception var2) {
            this.method1117();
            this.field1193 = Statics.method162() + 2000L;
        }
    }

    @ObfuscatedName("bp.g(I)V")
    public final synchronized void method1192() {
        if (Statics.field1183 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1183.field1355[var2] == this) {
                    Statics.field1183.field1355[var2] = null;
                }
                if (Statics.field1183.field1355[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1183.field1356 = true;
                while (Statics.field1183.field1363) {
                    class128.method2158(50L);
                }
                Statics.field1183 = null;
            }
        }
        this.method1117();
        this.field1194 = null;
    }

    @ObfuscatedName("bp.b(II)V")
    public final void method1176(int arg0) {
        this.field1200 -= arg0;
        if (this.field1200 < 0) {
            this.field1200 = 0;
        }
        if (this.field1187 != null) {
            this.field1187.method1139(arg0);
        }
    }

    @ObfuscatedName("bp.af([II)V")
    public final void method1182(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1195) {
            var3 = arg1 << 1;
        }
        class121.method2564(arg0, 0, var3);
        this.field1200 -= arg1;
        if (this.field1187 != null && this.field1200 <= 0) {
            this.field1200 += Statics.field2059 >> 4;
            method588(this.field1187);
            this.method1178(this.field1187, this.field1187.method1278());
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
                        class67 var11 = this.field1201[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1272;
                                if (var12 == null || var12.field1269 <= var8) {
                                    var11.field1270 = true;
                                    int var13 = var11.method1148();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1269 += var13;
                                    }
                                    if (var4 >= this.field1188) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1147();
                                    if (var14 != null) {
                                        int var15 = var11.field1271;
                                        while (var14 != null) {
                                            this.method1178(var14, var15 * var14.method1278() >> 8);
                                            var14 = var11.method1138();
                                        }
                                    }
                                    class67 var16 = var11.field1273;
                                    var11.field1273 = null;
                                    if (var10 == null) {
                                        this.field1201[var7] = var16;
                                    } else {
                                        var10.field1273 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1190[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1273;
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
                class67 var18 = this.field1201[var17];
                class67[] var19 = this.field1201;
                this.field1190[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1273;
                    var18.field1273 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1200 < 0) {
            this.field1200 = 0;
        }
        if (this.field1187 != null) {
            this.field1187.method1140(arg0, 0, arg1);
        }
        this.field1189 = Statics.method162();
    }

    @ObfuscatedName("f.am(Lbj;I)V")
    public static final void method588(class67 arg0) {
        arg0.field1270 = false;
        if (arg0.field1272 != null) {
            arg0.field1272.field1269 = 0;
        }
        for (class67 var1 = arg0.method1147(); var1 != null; var1 = arg0.method1138()) {
            method588(var1);
        }
    }

    @ObfuscatedName("bp.ar(Lbj;II)V")
    public final void method1178(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1190[var3];
        if (var4 == null) {
            this.field1201[var3] = arg0;
        } else {
            var4.field1273 = arg0;
        }
        this.field1190[var3] = arg0;
        arg0.field1271 = arg1;
    }

    @ObfuscatedName("bp.w(Ljava/awt/Component;)V")
    public void method1130(Component arg0) throws Exception {
    }

    @ObfuscatedName("bp.x(I)V")
    public void method1114(int arg0) throws Exception {
    }

    @ObfuscatedName("bp.t()I")
    public int method1115() throws Exception {
        return this.field1199;
    }

    @ObfuscatedName("bp.p()V")
    public void method1128() throws Exception {
    }

    @ObfuscatedName("bp.e()V")
    public void method1117() {
    }

    @ObfuscatedName("bp.y()V")
    public void method1119() throws Exception {
    }
}
