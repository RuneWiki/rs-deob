package deob;

import java.awt.Component;

@ObfuscatedName("be")
public class class57 {

    @ObfuscatedName("be.n")
    public int[] field1162;

    @ObfuscatedName("be.l")
    public class67 field1171;

    @ObfuscatedName("be.u")
    public int field1160 = 32;

    @ObfuscatedName("be.r")
    public long field1177 = class116.method1579();

    @ObfuscatedName("be.a")
    public int field1170;

    @ObfuscatedName("be.d")
    public int field1167;

    @ObfuscatedName("be.p")
    public int field1168;

    @ObfuscatedName("be.q")
    public long field1180 = 0L;

    @ObfuscatedName("be.b")
    public int field1178 = 0;

    @ObfuscatedName("be.t")
    public int field1164 = 0;

    @ObfuscatedName("be.y")
    public int field1172 = 0;

    @ObfuscatedName("be.w")
    public long field1173 = 0L;

    @ObfuscatedName("be.g")
    public boolean field1174 = true;

    @ObfuscatedName("be.au")
    public int field1176 = 0;

    @ObfuscatedName("be.aq")
    public class67[] field1163 = new class67[8];

    @ObfuscatedName("be.ab")
    public class67[] field1165 = new class67[8];

    @ObfuscatedName("az.o(IZII)V")
    public static final void method729(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1182 = arg0;
        Statics.field1945 = arg1;
        Statics.field2654 = arg2;
    }

    @ObfuscatedName("ah.v(Lei;Ljava/awt/Component;III)Lbe;")
    public static final class57 method772(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1182 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1162 = new int[(Statics.field1945 ? 2 : 1) * 256];
                var4.field1167 = arg3;
                var4.method1117(arg1);
                var4.field1170 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1170 > 16384) {
                    var4.field1170 = 16384;
                }
                var4.method1097(var4.field1170);
                if (Statics.field2654 > 0 && Statics.field2012 == null) {
                    Statics.field2012 = new class73();
                    Statics.field2012.field1331 = arg0;
                    arg0.method2706(Statics.field2012, Statics.field2654);
                }
                if (Statics.field2012 != null) {
                    if (Statics.field2012.field1332[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2012.field1332[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1162 = new int[(Statics.field1945 ? 2 : 1) * 256];
                    var6.field1167 = arg3;
                    var6.method1117(arg1);
                    var6.field1170 = 16384;
                    var6.method1097(var6.field1170);
                    if (Statics.field2654 > 0 && Statics.field2012 == null) {
                        Statics.field2012 = new class73();
                        Statics.field2012.field1331 = arg0;
                        arg0.method2706(Statics.field2012, Statics.field2654);
                    }
                    if (Statics.field2012 != null) {
                        if (Statics.field2012.field1332[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2012.field1332[arg2] = var6;
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

    @ObfuscatedName("be.f(Lbi;I)V")
    public final synchronized void method1167(class67 arg0) {
        this.field1171 = arg0;
    }

    @ObfuscatedName("be.au(I)V")
    public final synchronized void method1182() {
        if (this.field1162 == null) {
            return;
        }
        long var1 = class116.method1579();
        try {
            if (this.field1180 != 0L) {
                if (var1 < this.field1180) {
                    return;
                }
                this.method1097(this.field1170);
                this.field1180 = 0L;
                this.field1174 = true;
            }
            int var3 = this.method1098();
            if (this.field1172 - var3 > this.field1178) {
                this.field1178 = this.field1172 - var3;
            }
            int var4 = this.field1168 + this.field1167;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1170) {
                this.field1170 += 1024;
                if (this.field1170 > 16384) {
                    this.field1170 = 16384;
                }
                this.method1100();
                this.method1097(this.field1170);
                var3 = 0;
                this.field1174 = true;
                if (var4 + 256 > this.field1170) {
                    var4 = this.field1170 - 256;
                    this.field1168 = var4 - this.field1167;
                }
            }
            while (var3 < var4) {
                this.method1186(this.field1162, 256);
                this.method1099();
                var3 += 256;
            }
            if (var1 > this.field1173) {
                if (this.field1174) {
                    this.field1174 = false;
                } else if (this.field1178 == 0 && this.field1164 == 0) {
                    this.method1100();
                    this.field1180 = var1 + 2000L;
                    return;
                } else {
                    this.field1168 = Math.min(this.field1164, this.field1178);
                    this.field1164 = this.field1178;
                }
                this.field1178 = 0;
                this.field1173 = var1 + 2000L;
            }
            this.field1172 = var3;
        } catch (Exception var8) {
            this.method1100();
            this.field1180 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1177 + 500000L) {
                var1 = this.field1177;
            }
            while (var1 > this.field1177 + 5000L) {
                this.method1169(256);
                this.field1177 += (long) (256000 / Statics.field1182);
            }
        } catch (Exception var7) {
            this.field1177 = var1;
        }
    }

    @ObfuscatedName("be.aq(I)V")
    public final void method1161() {
        this.field1174 = true;
    }

    @ObfuscatedName("be.ab(I)V")
    public final synchronized void method1168() {
        this.field1174 = true;
        try {
            this.method1101();
        } catch (Exception var2) {
            this.method1100();
            this.field1180 = class116.method1579() + 2000L;
        }
    }

    @ObfuscatedName("be.am(I)V")
    public final synchronized void method1163() {
        if (Statics.field2012 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2012.field1332[var2] == this) {
                    Statics.field2012.field1332[var2] = null;
                }
                if (Statics.field2012.field1332[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2012.field1337 = true;
                while (Statics.field2012.field1333) {
                    class128.method167(50L);
                }
                Statics.field2012 = null;
            }
        }
        this.method1100();
        this.field1162 = null;
    }

    @ObfuscatedName("be.an(IB)V")
    public final void method1169(int arg0) {
        this.field1176 -= arg0;
        if (this.field1176 < 0) {
            this.field1176 = 0;
        }
        if (this.field1171 != null) {
            this.field1171.method1145(arg0);
        }
    }

    @ObfuscatedName("be.aj([II)V")
    public final void method1186(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1945) {
            var3 = arg1 << 1;
        }
        class121.method2583(arg0, 0, var3);
        this.field1176 -= arg1;
        if (this.field1171 != null && this.field1176 <= 0) {
            this.field1176 += Statics.field1182 >> 4;
            Statics.method626(this.field1171);
            this.method1164(this.field1171, this.field1171.method1344());
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
                        class67 var11 = this.field1163[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1250;
                                if (var12 == null || var12.field1246 <= var8) {
                                    var11.field1247 = true;
                                    int var13 = var11.method1122();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1246 += var13;
                                    }
                                    if (var4 >= this.field1160) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1124();
                                    if (var14 != null) {
                                        int var15 = var11.field1248;
                                        while (var14 != null) {
                                            this.method1164(var14, var15 * var14.method1344() >> 8);
                                            var14 = var11.method1125();
                                        }
                                    }
                                    class67 var16 = var11.field1249;
                                    var11.field1249 = null;
                                    if (var10 == null) {
                                        this.field1163[var7] = var16;
                                    } else {
                                        var10.field1249 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1165[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1249;
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
                class67 var18 = this.field1163[var17];
                class67[] var19 = this.field1163;
                this.field1165[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1249;
                    var18.field1249 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1176 < 0) {
            this.field1176 = 0;
        }
        if (this.field1171 != null) {
            this.field1171.method1148(arg0, 0, arg1);
        }
        this.field1177 = class116.method1579();
    }

    @ObfuscatedName("be.ao(Lbi;II)V")
    public final void method1164(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1165[var3];
        if (var4 == null) {
            this.field1163[var3] = arg0;
        } else {
            var4.field1249 = arg0;
        }
        this.field1165[var3] = arg0;
        arg0.field1248 = arg1;
    }

    @ObfuscatedName("be.j(Ljava/awt/Component;)V")
    public void method1117(Component arg0) throws Exception {
    }

    @ObfuscatedName("be.h(I)V")
    public void method1097(int arg0) throws Exception {
    }

    @ObfuscatedName("be.m()I")
    public int method1098() throws Exception {
        return this.field1170;
    }

    @ObfuscatedName("be.z()V")
    public void method1099() throws Exception {
    }

    @ObfuscatedName("be.x()V")
    public void method1100() {
    }

    @ObfuscatedName("be.e()V")
    public void method1101() throws Exception {
    }
}
