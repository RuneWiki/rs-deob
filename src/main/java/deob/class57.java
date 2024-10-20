package deob;

import java.awt.Component;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.q")
    public int[] field1189;

    @ObfuscatedName("bl.m")
    public class67 field1186;

    @ObfuscatedName("bl.e")
    public int field1184 = 32;

    @ObfuscatedName("bl.x")
    public long field1188 = class116.method2781();

    @ObfuscatedName("bl.z")
    public int field1198;

    @ObfuscatedName("bl.i")
    public int field1190;

    @ObfuscatedName("bl.t")
    public int field1191;

    @ObfuscatedName("bl.n")
    public long field1192 = 0L;

    @ObfuscatedName("bl.u")
    public int field1193 = 0;

    @ObfuscatedName("bl.g")
    public int field1185 = 0;

    @ObfuscatedName("bl.j")
    public int field1187 = 0;

    @ObfuscatedName("bl.h")
    public long field1196 = 0L;

    @ObfuscatedName("bl.s")
    public boolean field1194 = true;

    @ObfuscatedName("bl.ad")
    public int field1197 = 0;

    @ObfuscatedName("bl.ar")
    public class67[] field1195 = new class67[8];

    @ObfuscatedName("bl.ah")
    public class67[] field1201 = new class67[8];

    @ObfuscatedName("ai.j(Lek;Ljava/awt/Component;III)Lbl;")
    public static final class57 method777(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field974 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1189 = new int[(Statics.field1634 ? 2 : 1) * 256];
                var4.field1190 = arg3;
                var4.method1194(arg1);
                var4.field1198 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1198 > 16384) {
                    var4.field1198 = 16384;
                }
                var4.method1202(var4.field1198);
                if (Statics.field3218 > 0 && Statics.field1199 == null) {
                    Statics.field1199 = new class73();
                    Statics.field1199.field1358 = arg0;
                    arg0.method2831(Statics.field1199, Statics.field3218);
                }
                if (Statics.field1199 != null) {
                    if (Statics.field1199.field1361[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1199.field1361[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1189 = new int[256 * (Statics.field1634 ? 2 : 1)];
                    var6.field1190 = arg3;
                    var6.method1194(arg1);
                    var6.field1198 = 16384;
                    var6.method1202(var6.field1198);
                    if (Statics.field3218 > 0 && Statics.field1199 == null) {
                        Statics.field1199 = new class73();
                        Statics.field1199.field1358 = arg0;
                        arg0.method2831(Statics.field1199, Statics.field3218);
                    }
                    if (Statics.field1199 != null) {
                        if (Statics.field1199.field1361[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1199.field1361[arg2] = var6;
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

    @ObfuscatedName("bl.h(Lbn;B)V")
    public final synchronized void method1254(class67 arg0) {
        this.field1186 = arg0;
    }

    @ObfuscatedName("bl.s(I)V")
    public final synchronized void method1255() {
        if (this.field1189 == null) {
            return;
        }
        long var1 = class116.method2781();
        try {
            if (this.field1192 != 0L) {
                if (var1 < this.field1192) {
                    return;
                }
                this.method1202(this.field1198);
                this.field1192 = 0L;
                this.field1194 = true;
            }
            int var3 = this.method1198();
            if (this.field1187 - var3 > this.field1193) {
                this.field1193 = this.field1187 - var3;
            }
            int var4 = this.field1191 + this.field1190;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1198) {
                this.field1198 += 1024;
                if (this.field1198 > 16384) {
                    this.field1198 = 16384;
                }
                this.method1201();
                this.method1202(this.field1198);
                var3 = 0;
                this.field1194 = true;
                if (var4 + 256 > this.field1198) {
                    var4 = this.field1198 - 256;
                    this.field1191 = var4 - this.field1190;
                }
            }
            while (var3 < var4) {
                this.method1267(this.field1189, 256);
                this.method1197();
                var3 += 256;
            }
            if (var1 > this.field1196) {
                if (this.field1194) {
                    this.field1194 = false;
                } else if (this.field1193 == 0 && this.field1185 == 0) {
                    this.method1201();
                    this.field1192 = var1 + 2000L;
                    return;
                } else {
                    this.field1191 = Math.min(this.field1185, this.field1193);
                    this.field1185 = this.field1193;
                }
                this.field1193 = 0;
                this.field1196 = var1 + 2000L;
            }
            this.field1187 = var3;
        } catch (Exception var8) {
            this.method1201();
            this.field1192 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1188 + 500000L) {
                var1 = this.field1188;
            }
            while (var1 > this.field1188 + 5000L) {
                this.method1257(256);
                this.field1188 += (long) (256000 / Statics.field974);
            }
        } catch (Exception var7) {
            this.field1188 = var1;
        }
    }

    @ObfuscatedName("bl.f(B)V")
    public final void method1266() {
        this.field1194 = true;
    }

    @ObfuscatedName("bl.b(I)V")
    public final synchronized void method1269() {
        this.field1194 = true;
        try {
            this.method1195();
        } catch (Exception var2) {
            this.method1201();
            this.field1192 = class116.method2781() + 2000L;
        }
    }

    @ObfuscatedName("bl.l(I)V")
    public final synchronized void method1264() {
        if (Statics.field1199 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1199.field1361[var2] == this) {
                    Statics.field1199.field1361[var2] = null;
                }
                if (Statics.field1199.field1361[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1199.field1363 = true;
                while (Statics.field1199.field1359) {
                    class128.method56(50L);
                }
                Statics.field1199 = null;
            }
        }
        this.method1201();
        this.field1189 = null;
    }

    @ObfuscatedName("bl.o(II)V")
    public final void method1257(int arg0) {
        this.field1197 -= arg0;
        if (this.field1197 < 0) {
            this.field1197 = 0;
        }
        if (this.field1186 != null) {
            this.field1186.method1221(arg0);
        }
    }

    @ObfuscatedName("bl.v([II)V")
    public final void method1267(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1634) {
            var3 = arg1 << 1;
        }
        class121.method2705(arg0, 0, var3);
        this.field1197 -= arg1;
        if (this.field1186 != null && this.field1197 <= 0) {
            this.field1197 += Statics.field974 >> 4;
            method715(this.field1186);
            this.method1256(this.field1186, this.field1186.method1354());
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
                        class67 var11 = this.field1195[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1272;
                                if (var12 == null || var12.field1271 <= var8) {
                                    var11.field1275 = true;
                                    int var13 = var11.method1211();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1271 += var13;
                                    }
                                    if (var4 >= this.field1184) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1216();
                                    if (var14 != null) {
                                        int var15 = var11.field1274;
                                        while (var14 != null) {
                                            this.method1256(var14, var15 * var14.method1354() >> 8);
                                            var14 = var11.method1243();
                                        }
                                    }
                                    class67 var16 = var11.field1273;
                                    var11.field1273 = null;
                                    if (var10 == null) {
                                        this.field1195[var7] = var16;
                                    } else {
                                        var10.field1273 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1201[var7] = var10;
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
                class67 var18 = this.field1195[var17];
                class67[] var19 = this.field1195;
                this.field1201[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1273;
                    var18.field1273 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1197 < 0) {
            this.field1197 = 0;
        }
        if (this.field1186 != null) {
            this.field1186.method1219(arg0, 0, arg1);
        }
        this.field1188 = class116.method2781();
    }

    @ObfuscatedName("ad.ad(Lbn;B)V")
    public static final void method715(class67 arg0) {
        arg0.field1275 = false;
        if (arg0.field1272 != null) {
            arg0.field1272.field1271 = 0;
        }
        for (class67 var1 = arg0.method1216(); var1 != null; var1 = arg0.method1243()) {
            method715(var1);
        }
    }

    @ObfuscatedName("bl.ar(Lbn;II)V")
    public final void method1256(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1201[var3];
        if (var4 == null) {
            this.field1195[var3] = arg0;
        } else {
            var4.field1273 = arg0;
        }
        this.field1201[var3] = arg0;
        arg0.field1274 = arg1;
    }

    @ObfuscatedName("bl.a(Ljava/awt/Component;)V")
    public void method1194(Component arg0) throws Exception {
    }

    @ObfuscatedName("bl.w(I)V")
    public void method1202(int arg0) throws Exception {
    }

    @ObfuscatedName("bl.d()I")
    public int method1198() throws Exception {
        return this.field1198;
    }

    @ObfuscatedName("bl.c()V")
    public void method1197() throws Exception {
    }

    @ObfuscatedName("bl.y()V")
    public void method1201() {
    }

    @ObfuscatedName("bl.k()V")
    public void method1195() throws Exception {
    }
}
