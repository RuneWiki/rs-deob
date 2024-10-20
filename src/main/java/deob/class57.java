package deob;

import java.awt.Component;

@ObfuscatedName("bg")
public class class57 {

    @ObfuscatedName("bg.c")
    public int[] field1184;

    @ObfuscatedName("bg.y")
    public class67 field1185;

    @ObfuscatedName("bg.m")
    public int field1186 = 32;

    @ObfuscatedName("bg.e")
    public long field1187 = class115.method2134();

    @ObfuscatedName("bg.z")
    public int field1197;

    @ObfuscatedName("bg.t")
    public int field1189;

    @ObfuscatedName("bg.b")
    public int field1196;

    @ObfuscatedName("bg.l")
    public long field1191 = 0L;

    @ObfuscatedName("bg.s")
    public int field1192 = 0;

    @ObfuscatedName("bg.f")
    public int field1194 = 0;

    @ObfuscatedName("bg.g")
    public int field1188 = 0;

    @ObfuscatedName("bg.u")
    public long field1193 = 0L;

    @ObfuscatedName("bg.o")
    public boolean field1198 = true;

    @ObfuscatedName("bg.au")
    public int field1200 = 0;

    @ObfuscatedName("bg.ar")
    public class67[] field1195 = new class67[8];

    @ObfuscatedName("bg.ah")
    public class67[] field1199 = new class67[8];

    @ObfuscatedName("p.g(IZII)V")
    public static final void method604(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1190 = arg0;
        Statics.field1182 = arg1;
        Statics.field1183 = arg2;
    }

    @ObfuscatedName("f.u(Lee;Ljava/awt/Component;IIB)Lbg;")
    public static final class57 method168(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1190 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1184 = new int[(Statics.field1182 ? 2 : 1) * 256];
                var4.field1189 = arg3;
                var4.method1118(arg1);
                var4.field1197 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1197 > 16384) {
                    var4.field1197 = 16384;
                }
                var4.method1114(var4.field1197);
                if (Statics.field1183 > 0 && Statics.field578 == null) {
                    Statics.field578 = new class73();
                    Statics.field578.field1359 = arg0;
                    arg0.method2697(Statics.field578, Statics.field1183);
                }
                if (Statics.field578 != null) {
                    if (Statics.field578.field1357[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field578.field1357[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1184 = new int[(Statics.field1182 ? 2 : 1) * 256];
                    var6.field1189 = arg3;
                    var6.method1118(arg1);
                    var6.field1197 = 16384;
                    var6.method1114(var6.field1197);
                    if (Statics.field1183 > 0 && Statics.field578 == null) {
                        Statics.field578 = new class73();
                        Statics.field578.field1359 = arg0;
                        arg0.method2697(Statics.field578, Statics.field1183);
                    }
                    if (Statics.field578 != null) {
                        if (Statics.field578.field1357[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field578.field1357[arg2] = var6;
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

    @ObfuscatedName("bg.o(Lbj;I)V")
    public final synchronized void method1178(class67 arg0) {
        this.field1185 = arg0;
    }

    @ObfuscatedName("bg.k(I)V")
    public final synchronized void method1188() {
        if (this.field1184 == null) {
            return;
        }
        long var1 = class115.method2134();
        try {
            if (this.field1191 != 0L) {
                if (var1 < this.field1191) {
                    return;
                }
                this.method1114(this.field1197);
                this.field1191 = 0L;
                this.field1198 = true;
            }
            int var3 = this.method1126();
            if (this.field1188 - var3 > this.field1192) {
                this.field1192 = this.field1188 - var3;
            }
            int var4 = this.field1196 + this.field1189;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1197) {
                this.field1197 += 1024;
                if (this.field1197 > 16384) {
                    this.field1197 = 16384;
                }
                this.method1130();
                this.method1114(this.field1197);
                var3 = 0;
                this.field1198 = true;
                if (var4 + 256 > this.field1197) {
                    var4 = this.field1197 - 256;
                    this.field1196 = var4 - this.field1189;
                }
            }
            while (var3 < var4) {
                this.method1213(this.field1184, 256);
                this.method1117();
                var3 += 256;
            }
            if (var1 > this.field1193) {
                if (this.field1198) {
                    this.field1198 = false;
                } else if (this.field1192 == 0 && this.field1194 == 0) {
                    this.method1130();
                    this.field1191 = var1 + 2000L;
                    return;
                } else {
                    this.field1196 = Math.min(this.field1194, this.field1192);
                    this.field1194 = this.field1192;
                }
                this.field1192 = 0;
                this.field1193 = var1 + 2000L;
            }
            this.field1188 = var3;
        } catch (Exception var8) {
            this.method1130();
            this.field1191 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1187 + 500000L) {
                var1 = this.field1187;
            }
            while (var1 > this.field1187 + 5000L) {
                this.method1180(256);
                this.field1187 += (long) (256000 / Statics.field1190);
            }
        } catch (Exception var7) {
            this.field1187 = var1;
        }
    }

    @ObfuscatedName("bg.a(B)V")
    public final void method1182() {
        this.field1198 = true;
    }

    @ObfuscatedName("bg.j(B)V")
    public final synchronized void method1181() {
        this.field1198 = true;
        try {
            this.method1119();
        } catch (Exception var2) {
            this.method1130();
            this.field1191 = class115.method2134() + 2000L;
        }
    }

    @ObfuscatedName("bg.p(I)V")
    public final synchronized void method1208() {
        if (Statics.field578 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field578.field1357[var2] == this) {
                    Statics.field578.field1357[var2] = null;
                }
                if (Statics.field578.field1357[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field578.field1355 = true;
                while (Statics.field578.field1354) {
                    class127.method731(50L);
                }
                Statics.field578 = null;
            }
        }
        this.method1130();
        this.field1184 = null;
    }

    @ObfuscatedName("bg.w(II)V")
    public final void method1180(int arg0) {
        this.field1200 -= arg0;
        if (this.field1200 < 0) {
            this.field1200 = 0;
        }
        if (this.field1185 != null) {
            this.field1185.method1154(arg0);
        }
    }

    @ObfuscatedName("bg.au([II)V")
    public final void method1213(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1182) {
            var3 = arg1 << 1;
        }
        class120.method2567(arg0, 0, var3);
        this.field1200 -= arg1;
        if (this.field1185 != null && this.field1200 <= 0) {
            this.field1200 += Statics.field1190 >> 4;
            method588(this.field1185);
            this.method1184(this.field1185, this.field1185.method1347());
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
                                class66 var12 = var11.field1271;
                                if (var12 == null || var12.field1268 <= var8) {
                                    var11.field1272 = true;
                                    int var13 = var11.method1171();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1268 += var13;
                                    }
                                    if (var4 >= this.field1186) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1138();
                                    if (var14 != null) {
                                        int var15 = var11.field1270;
                                        while (var14 != null) {
                                            this.method1184(var14, var15 * var14.method1347() >> 8);
                                            var14 = var11.method1139();
                                        }
                                    }
                                    class67 var16 = var11.field1269;
                                    var11.field1269 = null;
                                    if (var10 == null) {
                                        this.field1195[var7] = var16;
                                    } else {
                                        var10.field1269 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1199[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1269;
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
                this.field1199[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1269;
                    var18.field1269 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1200 < 0) {
            this.field1200 = 0;
        }
        if (this.field1185 != null) {
            this.field1185.method1166(arg0, 0, arg1);
        }
        this.field1187 = class115.method2134();
    }

    @ObfuscatedName("j.ar(Lbj;I)V")
    public static final void method588(class67 arg0) {
        arg0.field1272 = false;
        if (arg0.field1271 != null) {
            arg0.field1271.field1268 = 0;
        }
        for (class67 var1 = arg0.method1138(); var1 != null; var1 = arg0.method1139()) {
            method588(var1);
        }
    }

    @ObfuscatedName("bg.ah(Lbj;IB)V")
    public final void method1184(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1199[var3];
        if (var4 == null) {
            this.field1195[var3] = arg0;
        } else {
            var4.field1269 = arg0;
        }
        this.field1199[var3] = arg0;
        arg0.field1270 = arg1;
    }

    @ObfuscatedName("bg.i(Ljava/awt/Component;)V")
    public void method1118(Component arg0) throws Exception {
    }

    @ObfuscatedName("bg.v(I)V")
    public void method1114(int arg0) throws Exception {
    }

    @ObfuscatedName("bg.r()I")
    public int method1126() throws Exception {
        return this.field1197;
    }

    @ObfuscatedName("bg.n()V")
    public void method1117() throws Exception {
    }

    @ObfuscatedName("bg.x()V")
    public void method1130() {
    }

    @ObfuscatedName("bg.q()V")
    public void method1119() throws Exception {
    }
}
