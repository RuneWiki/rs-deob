package deob;

import java.awt.Component;

@ObfuscatedName("by")
public class class57 {

    @ObfuscatedName("by.k")
    public int[] field1177;

    @ObfuscatedName("by.d")
    public class67 field1194;

    @ObfuscatedName("by.n")
    public int field1179 = 32;

    @ObfuscatedName("by.z")
    public long field1180 = class115.method2906();

    @ObfuscatedName("by.c")
    public int field1181;

    @ObfuscatedName("by.b")
    public int field1182;

    @ObfuscatedName("by.w")
    public int field1183;

    @ObfuscatedName("by.g")
    public long field1184 = 0L;

    @ObfuscatedName("by.x")
    public int field1187 = 0;

    @ObfuscatedName("by.o")
    public int field1186 = 0;

    @ObfuscatedName("by.l")
    public int field1178 = 0;

    @ObfuscatedName("by.j")
    public long field1188 = 0L;

    @ObfuscatedName("by.m")
    public boolean field1185 = true;

    @ObfuscatedName("by.ak")
    public int field1174 = 0;

    @ObfuscatedName("by.ap")
    public class67[] field1191 = new class67[8];

    @ObfuscatedName("by.al")
    public class67[] field1193 = new class67[8];

    @ObfuscatedName("f.o(Leg;Ljava/awt/Component;IIB)Lby;")
    public static final class57 method43(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1192 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1177 = new int[256 * (Statics.field1175 ? 2 : 1)];
                var4.field1182 = arg3;
                var4.method1066(arg1);
                var4.field1181 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1181 > 16384) {
                    var4.field1181 = 16384;
                }
                var4.method1059(var4.field1181);
                if (Statics.field1106 > 0 && Statics.field1176 == null) {
                    Statics.field1176 = new class73();
                    Statics.field1176.field1345 = arg0;
                    arg0.method2683(Statics.field1176, Statics.field1106);
                }
                if (Statics.field1176 != null) {
                    if (Statics.field1176.field1343[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1176.field1343[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1177 = new int[256 * (Statics.field1175 ? 2 : 1)];
                    var6.field1182 = arg3;
                    var6.method1066(arg1);
                    var6.field1181 = 16384;
                    var6.method1059(var6.field1181);
                    if (Statics.field1106 > 0 && Statics.field1176 == null) {
                        Statics.field1176 = new class73();
                        Statics.field1176.field1345 = arg0;
                        arg0.method2683(Statics.field1176, Statics.field1106);
                    }
                    if (Statics.field1176 != null) {
                        if (Statics.field1176.field1343[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1176.field1343[arg2] = var6;
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

    @ObfuscatedName("by.l(Lbe;I)V")
    public final synchronized void method1127(class67 arg0) {
        this.field1194 = arg0;
    }

    @ObfuscatedName("by.j(B)V")
    public final synchronized void method1119() {
        if (this.field1177 == null) {
            return;
        }
        long var1 = class115.method2906();
        try {
            if (this.field1184 != 0L) {
                if (var1 < this.field1184) {
                    return;
                }
                this.method1059(this.field1181);
                this.field1184 = 0L;
                this.field1185 = true;
            }
            int var3 = this.method1060();
            if (this.field1178 - var3 > this.field1187) {
                this.field1187 = this.field1178 - var3;
            }
            int var4 = this.field1183 + this.field1182;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1181) {
                this.field1181 += 1024;
                if (this.field1181 > 16384) {
                    this.field1181 = 16384;
                }
                this.method1062();
                this.method1059(this.field1181);
                var3 = 0;
                this.field1185 = true;
                if (var4 + 256 > this.field1181) {
                    var4 = this.field1181 - 256;
                    this.field1183 = var4 - this.field1182;
                }
            }
            while (var3 < var4) {
                this.method1135(this.field1177, 256);
                this.method1070();
                var3 += 256;
            }
            if (var1 > this.field1188) {
                if (this.field1185) {
                    this.field1185 = false;
                } else if (this.field1187 == 0 && this.field1186 == 0) {
                    this.method1062();
                    this.field1184 = var1 + 2000L;
                    return;
                } else {
                    this.field1183 = Math.min(this.field1186, this.field1187);
                    this.field1186 = this.field1187;
                }
                this.field1187 = 0;
                this.field1188 = var1 + 2000L;
            }
            this.field1178 = var3;
        } catch (Exception var8) {
            this.method1062();
            this.field1184 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1180 + 500000L) {
                var1 = this.field1180;
            }
            while (var1 > this.field1180 + 5000L) {
                this.method1123(256);
                this.field1180 += (long) (256000 / Statics.field1192);
            }
        } catch (Exception var7) {
            this.field1180 = var1;
        }
    }

    @ObfuscatedName("by.m(B)V")
    public final void method1120() {
        this.field1185 = true;
    }

    @ObfuscatedName("by.e(B)V")
    public final synchronized void method1121() {
        this.field1185 = true;
        try {
            this.method1063();
        } catch (Exception var2) {
            this.method1062();
            this.field1184 = class115.method2906() + 2000L;
        }
    }

    @ObfuscatedName("by.u(B)V")
    public final synchronized void method1122() {
        if (Statics.field1176 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1176.field1343[var2] == this) {
                    Statics.field1176.field1343[var2] = null;
                }
                if (Statics.field1176.field1343[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1176.field1346 = true;
                while (Statics.field1176.field1344) {
                    class127.method848(50L);
                }
                Statics.field1176 = null;
            }
        }
        this.method1062();
        this.field1177 = null;
    }

    @ObfuscatedName("by.y(II)V")
    public final void method1123(int arg0) {
        this.field1174 -= arg0;
        if (this.field1174 < 0) {
            this.field1174 = 0;
        }
        if (this.field1194 != null) {
            this.field1194.method1074(arg0);
        }
    }

    @ObfuscatedName("by.t([II)V")
    public final void method1135(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1175) {
            var3 = arg1 << 1;
        }
        class120.method2531(arg0, 0, var3);
        this.field1174 -= arg1;
        if (this.field1194 != null && this.field1174 <= 0) {
            this.field1174 += Statics.field1192 >> 4;
            method163(this.field1194);
            this.method1142(this.field1194, this.field1194.method1225());
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
                        class67 var11 = this.field1191[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1260;
                                if (var12 == null || var12.field1257 <= var8) {
                                    var11.field1258 = true;
                                    int var13 = var11.method1082();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1257 += var13;
                                    }
                                    if (var4 >= this.field1179) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1080();
                                    if (var14 != null) {
                                        int var15 = var11.field1259;
                                        while (var14 != null) {
                                            this.method1142(var14, var15 * var14.method1225() >> 8);
                                            var14 = var11.method1081();
                                        }
                                    }
                                    class67 var16 = var11.field1261;
                                    var11.field1261 = null;
                                    if (var10 == null) {
                                        this.field1191[var7] = var16;
                                    } else {
                                        var10.field1261 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1193[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1261;
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
                class67 var18 = this.field1191[var17];
                class67[] var19 = this.field1191;
                this.field1193[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1261;
                    var18.field1261 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1174 < 0) {
            this.field1174 = 0;
        }
        if (this.field1194 != null) {
            this.field1194.method1079(arg0, 0, arg1);
        }
        this.field1180 = class115.method2906();
    }

    @ObfuscatedName("g.q(Lbe;I)V")
    public static final void method163(class67 arg0) {
        arg0.field1258 = false;
        if (arg0.field1260 != null) {
            arg0.field1260.field1257 = 0;
        }
        for (class67 var1 = arg0.method1080(); var1 != null; var1 = arg0.method1081()) {
            method163(var1);
        }
    }

    @ObfuscatedName("by.ak(Lbe;II)V")
    public final void method1142(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1193[var3];
        if (var4 == null) {
            this.field1191[var3] = arg0;
        } else {
            var4.field1261 = arg0;
        }
        this.field1193[var3] = arg0;
        arg0.field1259 = arg1;
    }

    @ObfuscatedName("by.i(Ljava/awt/Component;)V")
    public void method1066(Component arg0) throws Exception {
    }

    @ObfuscatedName("by.v(I)V")
    public void method1059(int arg0) throws Exception {
    }

    @ObfuscatedName("by.f()I")
    public int method1060() throws Exception {
        return this.field1181;
    }

    @ObfuscatedName("by.h()V")
    public void method1070() throws Exception {
    }

    @ObfuscatedName("by.a()V")
    public void method1062() {
    }

    @ObfuscatedName("by.s()V")
    public void method1063() throws Exception {
    }
}
