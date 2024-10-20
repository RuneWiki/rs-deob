package deob;

import java.awt.Component;

@ObfuscatedName("ba")
public class class57 {

    @ObfuscatedName("ba.y")
    public int[] field1185;

    @ObfuscatedName("ba.o")
    public class67 field1174;

    @ObfuscatedName("ba.h")
    public int field1184 = 32;

    @ObfuscatedName("ba.e")
    public long field1176 = class115.method179();

    @ObfuscatedName("ba.v")
    public int field1177;

    @ObfuscatedName("ba.p")
    public int field1178;

    @ObfuscatedName("ba.m")
    public int field1175;

    @ObfuscatedName("ba.b")
    public long field1180 = 0L;

    @ObfuscatedName("ba.s")
    public int field1179 = 0;

    @ObfuscatedName("ba.x")
    public int field1182 = 0;

    @ObfuscatedName("ba.z")
    public int field1183 = 0;

    @ObfuscatedName("ba.d")
    public long field1191 = 0L;

    @ObfuscatedName("ba.a")
    public boolean field1172 = true;

    @ObfuscatedName("ba.ah")
    public int field1186 = 0;

    @ObfuscatedName("ba.ag")
    public class67[] field1187 = new class67[8];

    @ObfuscatedName("ba.ac")
    public class67[] field1188 = new class67[8];

    @ObfuscatedName("h.k(IZIB)V")
    public static final void method127(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2648 = arg0;
        Statics.field2070 = arg1;
        Statics.field1189 = arg2;
    }

    @ObfuscatedName("bg.f(Lec;Ljava/awt/Component;IIB)Lba;")
    public static final class57 method1252(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2648 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1185 = new int[256 * (Statics.field2070 ? 2 : 1)];
                var4.field1178 = arg3;
                var4.method1110(arg1);
                var4.field1177 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1177 > 16384) {
                    var4.field1177 = 16384;
                }
                var4.method1111(var4.field1177);
                if (Statics.field1189 > 0 && Statics.field1171 == null) {
                    Statics.field1171 = new class73();
                    Statics.field1171.field1342 = arg0;
                    arg0.method2713(Statics.field1171, Statics.field1189);
                }
                if (Statics.field1171 != null) {
                    if (Statics.field1171.field1341[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1171.field1341[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1185 = new int[(Statics.field2070 ? 2 : 1) * 256];
                    var6.field1178 = arg3;
                    var6.method1110(arg1);
                    var6.field1177 = 16384;
                    var6.method1111(var6.field1177);
                    if (Statics.field1189 > 0 && Statics.field1171 == null) {
                        Statics.field1171 = new class73();
                        Statics.field1171.field1342 = arg0;
                        arg0.method2713(Statics.field1171, Statics.field1189);
                    }
                    if (Statics.field1171 != null) {
                        if (Statics.field1171.field1341[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1171.field1341[arg2] = var6;
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

    @ObfuscatedName("ba.g(Lbu;I)V")
    public final synchronized void method1191(class67 arg0) {
        this.field1174 = arg0;
    }

    @ObfuscatedName("ba.i(B)V")
    public final synchronized void method1175() {
        if (this.field1185 == null) {
            return;
        }
        long var1 = class115.method179();
        try {
            if (this.field1180 != 0L) {
                if (var1 < this.field1180) {
                    return;
                }
                this.method1111(this.field1177);
                this.field1180 = 0L;
                this.field1172 = true;
            }
            int var3 = this.method1112();
            if (this.field1183 - var3 > this.field1179) {
                this.field1179 = this.field1183 - var3;
            }
            int var4 = this.field1178 + this.field1175;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1177) {
                this.field1177 += 1024;
                if (this.field1177 > 16384) {
                    this.field1177 = 16384;
                }
                this.method1114();
                this.method1111(this.field1177);
                var3 = 0;
                this.field1172 = true;
                if (var4 + 256 > this.field1177) {
                    var4 = this.field1177 - 256;
                    this.field1175 = var4 - this.field1178;
                }
            }
            while (var3 < var4) {
                this.method1179(this.field1185, 256);
                this.method1113();
                var3 += 256;
            }
            if (var1 > this.field1191) {
                if (this.field1172) {
                    this.field1172 = false;
                } else if (this.field1179 == 0 && this.field1182 == 0) {
                    this.method1114();
                    this.field1180 = var1 + 2000L;
                    return;
                } else {
                    this.field1175 = Math.min(this.field1182, this.field1179);
                    this.field1182 = this.field1179;
                }
                this.field1179 = 0;
                this.field1191 = var1 + 2000L;
            }
            this.field1183 = var3;
        } catch (Exception var8) {
            this.method1114();
            this.field1180 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1176 + 500000L) {
                var1 = this.field1176;
            }
            while (var1 > this.field1176 + 5000L) {
                this.method1178(256);
                this.field1176 += (long) (256000 / Statics.field2648);
            }
        } catch (Exception var7) {
            this.field1176 = var1;
        }
    }

    @ObfuscatedName("ba.ah(I)V")
    public final void method1192() {
        this.field1172 = true;
    }

    @ObfuscatedName("ba.ag(I)V")
    public final synchronized void method1174() {
        this.field1172 = true;
        try {
            this.method1124();
        } catch (Exception var2) {
            this.method1114();
            this.field1180 = class115.method179() + 2000L;
        }
    }

    @ObfuscatedName("ba.ac(I)V")
    public final synchronized void method1177() {
        if (Statics.field1171 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1171.field1341[var2] == this) {
                    Statics.field1171.field1341[var2] = null;
                }
                if (Statics.field1171.field1341[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1171.field1346 = true;
                while (Statics.field1171.field1343) {
                    class127.method1567(50L);
                }
                Statics.field1171 = null;
            }
        }
        this.method1114();
        this.field1185 = null;
    }

    @ObfuscatedName("ba.al(II)V")
    public final void method1178(int arg0) {
        this.field1186 -= arg0;
        if (this.field1186 < 0) {
            this.field1186 = 0;
        }
        if (this.field1174 != null) {
            this.field1174.method1142(arg0);
        }
    }

    @ObfuscatedName("ba.aj([II)V")
    public final void method1179(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2070) {
            var3 = arg1 << 1;
        }
        class120.method2585(arg0, 0, var3);
        this.field1186 -= arg1;
        if (this.field1174 != null && this.field1186 <= 0) {
            this.field1186 += Statics.field2648 >> 4;
            method659(this.field1174);
            this.method1180(this.field1174, this.field1174.method1284());
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
                        class67 var11 = this.field1187[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1256;
                                if (var12 == null || var12.field1255 <= var8) {
                                    var11.field1259 = true;
                                    int var13 = var11.method1139();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1255 += var13;
                                    }
                                    if (var4 >= this.field1184) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1146();
                                    if (var14 != null) {
                                        int var15 = var11.field1257;
                                        while (var14 != null) {
                                            this.method1180(var14, var15 * var14.method1284() >> 8);
                                            var14 = var11.method1138();
                                        }
                                    }
                                    class67 var16 = var11.field1258;
                                    var11.field1258 = null;
                                    if (var10 == null) {
                                        this.field1187[var7] = var16;
                                    } else {
                                        var10.field1258 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1188[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1258;
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
                class67 var18 = this.field1187[var17];
                class67[] var19 = this.field1187;
                this.field1188[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1258;
                    var18.field1258 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1186 < 0) {
            this.field1186 = 0;
        }
        if (this.field1174 != null) {
            this.field1174.method1140(arg0, 0, arg1);
        }
        this.field1176 = class115.method179();
    }

    @ObfuscatedName("al.at(Lbu;B)V")
    public static final void method659(class67 arg0) {
        arg0.field1259 = false;
        if (arg0.field1256 != null) {
            arg0.field1256.field1255 = 0;
        }
        for (class67 var1 = arg0.method1146(); var1 != null; var1 = arg0.method1138()) {
            method659(var1);
        }
    }

    @ObfuscatedName("ba.ap(Lbu;IB)V")
    public final void method1180(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1188[var3];
        if (var4 == null) {
            this.field1187[var3] = arg0;
        } else {
            var4.field1258 = arg0;
        }
        this.field1188[var3] = arg0;
        arg0.field1257 = arg1;
    }

    @ObfuscatedName("ba.n(Ljava/awt/Component;)V")
    public void method1110(Component arg0) throws Exception {
    }

    @ObfuscatedName("ba.q(I)V")
    public void method1111(int arg0) throws Exception {
    }

    @ObfuscatedName("ba.c()I")
    public int method1112() throws Exception {
        return this.field1177;
    }

    @ObfuscatedName("ba.l()V")
    public void method1113() throws Exception {
    }

    @ObfuscatedName("ba.r()V")
    public void method1114() {
    }

    @ObfuscatedName("ba.u()V")
    public void method1124() throws Exception {
    }
}
