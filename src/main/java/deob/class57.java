package deob;

import java.awt.Component;

@ObfuscatedName("bq")
public class class57 {

    @ObfuscatedName("bq.g")
    public int[] field1192;

    @ObfuscatedName("bq.s")
    public class67 field1193;

    @ObfuscatedName("bq.r")
    public int field1194 = 32;

    @ObfuscatedName("bq.k")
    public long field1191 = class116.method2672();

    @ObfuscatedName("bq.o")
    public int field1203;

    @ObfuscatedName("bq.q")
    public int field1198;

    @ObfuscatedName("bq.p")
    public int field1187;

    @ObfuscatedName("bq.h")
    public long field1199 = 0L;

    @ObfuscatedName("bq.e")
    public int field1200 = 0;

    @ObfuscatedName("bq.t")
    public int field1207 = 0;

    @ObfuscatedName("bq.w")
    public int field1202 = 0;

    @ObfuscatedName("bq.v")
    public long field1195 = 0L;

    @ObfuscatedName("bq.y")
    public boolean field1204 = true;

    @ObfuscatedName("bq.ag")
    public int field1206 = 0;

    @ObfuscatedName("bq.ax")
    public class67[] field1188 = new class67[8];

    @ObfuscatedName("bq.ao")
    public class67[] field1208 = new class67[8];

    @ObfuscatedName("au.z(IZII)V")
    public static final void method1014(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1197 = arg0;
        Statics.field1201 = arg1;
        Statics.field1189 = arg2;
    }

    @ObfuscatedName("u.j(Lei;Ljava/awt/Component;III)Lbq;")
    public static final class57 method12(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1197 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1192 = new int[256 * (Statics.field1201 ? 2 : 1)];
                var4.field1198 = arg3;
                var4.method1148(arg1);
                var4.field1203 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1203 > 16384) {
                    var4.field1203 = 16384;
                }
                var4.method1159(var4.field1203);
                if (Statics.field1189 > 0 && Statics.field889 == null) {
                    Statics.field889 = new class73();
                    Statics.field889.field1371 = arg0;
                    arg0.method2729(Statics.field889, Statics.field1189);
                }
                if (Statics.field889 != null) {
                    if (Statics.field889.field1365[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field889.field1365[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1192 = new int[256 * (Statics.field1201 ? 2 : 1)];
                    var6.field1198 = arg3;
                    var6.method1148(arg1);
                    var6.field1203 = 16384;
                    var6.method1159(var6.field1203);
                    if (Statics.field1189 > 0 && Statics.field889 == null) {
                        Statics.field889 = new class73();
                        Statics.field889.field1371 = arg0;
                        arg0.method2729(Statics.field889, Statics.field1189);
                    }
                    if (Statics.field889 != null) {
                        if (Statics.field889.field1365[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field889.field1365[arg2] = var6;
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

    @ObfuscatedName("bq.ag(Lbt;I)V")
    public final synchronized void method1211(class67 arg0) {
        this.field1193 = arg0;
    }

    @ObfuscatedName("bq.ax(I)V")
    public final synchronized void method1220() {
        if (this.field1192 == null) {
            return;
        }
        long var1 = class116.method2672();
        try {
            if (this.field1199 != 0L) {
                if (var1 < this.field1199) {
                    return;
                }
                this.method1159(this.field1203);
                this.field1199 = 0L;
                this.field1204 = true;
            }
            int var3 = this.method1150();
            if (this.field1202 - var3 > this.field1200) {
                this.field1200 = this.field1202 - var3;
            }
            int var4 = this.field1198 + this.field1187;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1203) {
                this.field1203 += 1024;
                if (this.field1203 > 16384) {
                    this.field1203 = 16384;
                }
                this.method1152();
                this.method1159(this.field1203);
                var3 = 0;
                this.field1204 = true;
                if (var4 + 256 > this.field1203) {
                    var4 = this.field1203 - 256;
                    this.field1187 = var4 - this.field1198;
                }
            }
            while (var3 < var4) {
                this.method1217(this.field1192, 256);
                this.method1162();
                var3 += 256;
            }
            if (var1 > this.field1195) {
                if (this.field1204) {
                    this.field1204 = false;
                } else if (this.field1200 == 0 && this.field1207 == 0) {
                    this.method1152();
                    this.field1199 = var1 + 2000L;
                    return;
                } else {
                    this.field1187 = Math.min(this.field1207, this.field1200);
                    this.field1207 = this.field1200;
                }
                this.field1200 = 0;
                this.field1195 = var1 + 2000L;
            }
            this.field1202 = var3;
        } catch (Exception var8) {
            this.method1152();
            this.field1199 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1191 + 500000L) {
                var1 = this.field1191;
            }
            while (var1 > this.field1191 + 5000L) {
                this.method1219(256);
                this.field1191 += (long) (256000 / Statics.field1197);
            }
        } catch (Exception var7) {
            this.field1191 = var1;
        }
    }

    @ObfuscatedName("bq.ao(I)V")
    public final void method1210() {
        this.field1204 = true;
    }

    @ObfuscatedName("bq.ac(I)V")
    public final synchronized void method1214() {
        this.field1204 = true;
        try {
            this.method1153();
        } catch (Exception var2) {
            this.method1152();
            this.field1199 = class116.method2672() + 2000L;
        }
    }

    @ObfuscatedName("bq.aj(I)V")
    public final synchronized void method1221() {
        if (Statics.field889 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field889.field1365[var2] == this) {
                    Statics.field889.field1365[var2] = null;
                }
                if (Statics.field889.field1365[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field889.field1366 = true;
                while (Statics.field889.field1370) {
                    class128.method2102(50L);
                }
                Statics.field889 = null;
            }
        }
        this.method1152();
        this.field1192 = null;
    }

    @ObfuscatedName("bq.an(IS)V")
    public final void method1219(int arg0) {
        this.field1206 -= arg0;
        if (this.field1206 < 0) {
            this.field1206 = 0;
        }
        if (this.field1193 != null) {
            this.field1193.method1181(arg0);
        }
    }

    @ObfuscatedName("bq.al([II)V")
    public final void method1217(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1201) {
            var3 = arg1 << 1;
        }
        class121.method2579(arg0, 0, var3);
        this.field1206 -= arg1;
        if (this.field1193 != null && this.field1206 <= 0) {
            this.field1206 += Statics.field1197 >> 4;
            method849(this.field1193);
            this.method1218(this.field1193, this.field1193.method1308());
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
                        class67 var11 = this.field1188[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1282;
                                if (var12 == null || var12.field1279 <= var8) {
                                    var11.field1283 = true;
                                    int var13 = var11.method1189();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1279 += var13;
                                    }
                                    if (var4 >= this.field1194) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1177();
                                    if (var14 != null) {
                                        int var15 = var11.field1280;
                                        while (var14 != null) {
                                            this.method1218(var14, var15 * var14.method1308() >> 8);
                                            var14 = var11.method1178();
                                        }
                                    }
                                    class67 var16 = var11.field1281;
                                    var11.field1281 = null;
                                    if (var10 == null) {
                                        this.field1188[var7] = var16;
                                    } else {
                                        var10.field1281 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1208[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1281;
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
                class67 var18 = this.field1188[var17];
                class67[] var19 = this.field1188;
                this.field1208[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1281;
                    var18.field1281 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1206 < 0) {
            this.field1206 = 0;
        }
        if (this.field1193 != null) {
            this.field1193.method1185(arg0, 0, arg1);
        }
        this.field1191 = class116.method2672();
    }

    @ObfuscatedName("ap.as(Lbt;B)V")
    public static final void method849(class67 arg0) {
        arg0.field1283 = false;
        if (arg0.field1282 != null) {
            arg0.field1282.field1279 = 0;
        }
        for (class67 var1 = arg0.method1177(); var1 != null; var1 = arg0.method1178()) {
            method849(var1);
        }
    }

    @ObfuscatedName("bq.av(Lbt;II)V")
    public final void method1218(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1208[var3];
        if (var4 == null) {
            this.field1188[var3] = arg0;
        } else {
            var4.field1281 = arg0;
        }
        this.field1208[var3] = arg0;
        arg0.field1280 = arg1;
    }

    @ObfuscatedName("bq.f(Ljava/awt/Component;)V")
    public void method1148(Component arg0) throws Exception {
    }

    @ObfuscatedName("bq.u(I)V")
    public void method1159(int arg0) throws Exception {
    }

    @ObfuscatedName("bq.x()I")
    public int method1150() throws Exception {
        return this.field1203;
    }

    @ObfuscatedName("bq.b()V")
    public void method1162() throws Exception {
    }

    @ObfuscatedName("bq.l()V")
    public void method1152() {
    }

    @ObfuscatedName("bq.d()V")
    public void method1153() throws Exception {
    }
}
