package deob;

import java.awt.Component;

@ObfuscatedName("bn")
public class class57 {

    @ObfuscatedName("bn.p")
    public int[] field1164;

    @ObfuscatedName("bn.h")
    public class67 field1165;

    @ObfuscatedName("bn.e")
    public int field1181 = 32;

    @ObfuscatedName("bn.g")
    public long field1167 = class115.method1998();

    @ObfuscatedName("bn.b")
    public int field1179;

    @ObfuscatedName("bn.f")
    public int field1169;

    @ObfuscatedName("bn.y")
    public int field1175;

    @ObfuscatedName("bn.z")
    public long field1184 = 0L;

    @ObfuscatedName("bn.t")
    public int field1172 = 0;

    @ObfuscatedName("bn.o")
    public int field1183 = 0;

    @ObfuscatedName("bn.r")
    public int field1174 = 0;

    @ObfuscatedName("bn.u")
    public long field1170 = 0L;

    @ObfuscatedName("bn.v")
    public boolean field1176 = true;

    @ObfuscatedName("bn.aq")
    public int field1178 = 0;

    @ObfuscatedName("bn.az")
    public class67[] field1162 = new class67[8];

    @ObfuscatedName("bn.ab")
    public class67[] field1180 = new class67[8];

    @ObfuscatedName("s.x(Lex;Ljava/awt/Component;III)Lbn;")
    public static final class57 method39(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1173 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1164 = new int[256 * (Statics.field59 ? 2 : 1)];
                var4.field1169 = arg3;
                var4.method1086(arg1);
                var4.field1179 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1179 > 16384) {
                    var4.field1179 = 16384;
                }
                var4.method1075(var4.field1179);
                if (Statics.field1338 > 0 && Statics.field1618 == null) {
                    Statics.field1618 = new class73();
                    Statics.field1618.field1339 = arg0;
                    arg0.method2709(Statics.field1618, Statics.field1338);
                }
                if (Statics.field1618 != null) {
                    if (Statics.field1618.field1335[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1618.field1335[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1164 = new int[(Statics.field59 ? 2 : 1) * 256];
                    var6.field1169 = arg3;
                    var6.method1086(arg1);
                    var6.field1179 = 16384;
                    var6.method1075(var6.field1179);
                    if (Statics.field1338 > 0 && Statics.field1618 == null) {
                        Statics.field1618 = new class73();
                        Statics.field1618.field1339 = arg0;
                        arg0.method2709(Statics.field1618, Statics.field1338);
                    }
                    if (Statics.field1618 != null) {
                        if (Statics.field1618.field1335[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1618.field1335[arg2] = var6;
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

    @ObfuscatedName("bn.w(Lbj;I)V")
    public final synchronized void method1133(class67 arg0) {
        this.field1165 = arg0;
    }

    @ObfuscatedName("bn.aq(B)V")
    public final synchronized void method1155() {
        if (this.field1164 == null) {
            return;
        }
        long var1 = class115.method1998();
        try {
            if (this.field1184 != 0L) {
                if (var1 < this.field1184) {
                    return;
                }
                this.method1075(this.field1179);
                this.field1184 = 0L;
                this.field1176 = true;
            }
            int var3 = this.method1076();
            if (this.field1174 - var3 > this.field1172) {
                this.field1172 = this.field1174 - var3;
            }
            int var4 = this.field1175 + this.field1169;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1179) {
                this.field1179 += 1024;
                if (this.field1179 > 16384) {
                    this.field1179 = 16384;
                }
                this.method1078();
                this.method1075(this.field1179);
                var3 = 0;
                this.field1176 = true;
                if (var4 + 256 > this.field1179) {
                    var4 = this.field1179 - 256;
                    this.field1175 = var4 - this.field1169;
                }
            }
            while (var3 < var4) {
                this.method1136(this.field1164, 256);
                this.method1095();
                var3 += 256;
            }
            if (var1 > this.field1170) {
                if (this.field1176) {
                    this.field1176 = false;
                } else if (this.field1172 == 0 && this.field1183 == 0) {
                    this.method1078();
                    this.field1184 = var1 + 2000L;
                    return;
                } else {
                    this.field1175 = Math.min(this.field1183, this.field1172);
                    this.field1183 = this.field1172;
                }
                this.field1172 = 0;
                this.field1170 = var1 + 2000L;
            }
            this.field1174 = var3;
        } catch (Exception var8) {
            this.method1078();
            this.field1184 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1167 + 500000L) {
                var1 = this.field1167;
            }
            while (var1 > this.field1167 + 5000L) {
                this.method1147(256);
                this.field1167 += (long) (256000 / Statics.field1173);
            }
        } catch (Exception var7) {
            this.field1167 = var1;
        }
    }

    @ObfuscatedName("bn.az(I)V")
    public final void method1132() {
        this.field1176 = true;
    }

    @ObfuscatedName("bn.ab(B)V")
    public final synchronized void method1162() {
        this.field1176 = true;
        try {
            this.method1079();
        } catch (Exception var2) {
            this.method1078();
            this.field1184 = class115.method1998() + 2000L;
        }
    }

    @ObfuscatedName("bn.ac(I)V")
    public final synchronized void method1135() {
        if (Statics.field1618 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1618.field1335[var2] == this) {
                    Statics.field1618.field1335[var2] = null;
                }
                if (Statics.field1618.field1335[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1618.field1336 = true;
                while (Statics.field1618.field1337) {
                    class127.method1160(50L);
                }
                Statics.field1618 = null;
            }
        }
        this.method1078();
        this.field1164 = null;
    }

    @ObfuscatedName("bn.ad(II)V")
    public final void method1147(int arg0) {
        this.field1178 -= arg0;
        if (this.field1178 < 0) {
            this.field1178 = 0;
        }
        if (this.field1165 != null) {
            this.field1165.method1109(arg0);
        }
    }

    @ObfuscatedName("bn.av([II)V")
    public final void method1136(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field59) {
            var3 = arg1 << 1;
        }
        class120.method2550(arg0, 0, var3);
        this.field1178 -= arg1;
        if (this.field1165 != null && this.field1178 <= 0) {
            this.field1178 += Statics.field1173 >> 4;
            method637(this.field1165);
            this.method1140(this.field1165, this.field1165.method1282());
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
                        class67 var11 = this.field1162[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1251;
                                if (var12 == null || var12.field1249 <= var8) {
                                    var11.field1253 = true;
                                    int var13 = var11.method1106();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1249 += var13;
                                    }
                                    if (var4 >= this.field1181) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1104();
                                    if (var14 != null) {
                                        int var15 = var11.field1250;
                                        while (var14 != null) {
                                            this.method1140(var14, var15 * var14.method1282() >> 8);
                                            var14 = var11.method1121();
                                        }
                                    }
                                    class67 var16 = var11.field1252;
                                    var11.field1252 = null;
                                    if (var10 == null) {
                                        this.field1162[var7] = var16;
                                    } else {
                                        var10.field1252 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1180[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1252;
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
                class67 var18 = this.field1162[var17];
                class67[] var19 = this.field1162;
                this.field1180[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1252;
                    var18.field1252 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1178 < 0) {
            this.field1178 = 0;
        }
        if (this.field1165 != null) {
            this.field1165.method1107(arg0, 0, arg1);
        }
        this.field1167 = class115.method1998();
    }

    @ObfuscatedName("ac.ar(Lbj;B)V")
    public static final void method637(class67 arg0) {
        arg0.field1253 = false;
        if (arg0.field1251 != null) {
            arg0.field1251.field1249 = 0;
        }
        for (class67 var1 = arg0.method1104(); var1 != null; var1 = arg0.method1121()) {
            method637(var1);
        }
    }

    @ObfuscatedName("bn.al(Lbj;IB)V")
    public final void method1140(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1180[var3];
        if (var4 == null) {
            this.field1162[var3] = arg0;
        } else {
            var4.field1252 = arg0;
        }
        this.field1180[var3] = arg0;
        arg0.field1250 = arg1;
    }

    @ObfuscatedName("bn.n(Ljava/awt/Component;)V")
    public void method1086(Component arg0) throws Exception {
    }

    @ObfuscatedName("bn.d(I)V")
    public void method1075(int arg0) throws Exception {
    }

    @ObfuscatedName("bn.s()I")
    public int method1076() throws Exception {
        return this.field1179;
    }

    @ObfuscatedName("bn.q()V")
    public void method1095() throws Exception {
    }

    @ObfuscatedName("bn.j()V")
    public void method1078() {
    }

    @ObfuscatedName("bn.k()V")
    public void method1079() throws Exception {
    }
}
