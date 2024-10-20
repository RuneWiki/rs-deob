package deob;

import java.awt.Component;

@ObfuscatedName("bi")
public class class57 {

    @ObfuscatedName("bi.l")
    public int[] field1149;

    @ObfuscatedName("bi.u")
    public class67 field1150;

    @ObfuscatedName("bi.p")
    public int field1151 = 32;

    @ObfuscatedName("bi.n")
    public long field1161 = class116.method1946();

    @ObfuscatedName("bi.w")
    public int field1153;

    @ObfuscatedName("bi.z")
    public int field1159;

    @ObfuscatedName("bi.k")
    public int field1155;

    @ObfuscatedName("bi.o")
    public long field1167 = 0L;

    @ObfuscatedName("bi.t")
    public int field1157 = 0;

    @ObfuscatedName("bi.h")
    public int field1156 = 0;

    @ObfuscatedName("bi.v")
    public int field1165 = 0;

    @ObfuscatedName("bi.a")
    public long field1146 = 0L;

    @ObfuscatedName("bi.f")
    public boolean field1158 = true;

    @ObfuscatedName("bi.aw")
    public int field1164 = 0;

    @ObfuscatedName("bi.an")
    public class67[] field1152 = new class67[8];

    @ObfuscatedName("bi.ag")
    public class67[] field1166 = new class67[8];

    @ObfuscatedName("h.ae(IZII)V")
    public static final void method176(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1154 = arg0;
        Statics.field582 = arg1;
        Statics.field1864 = arg2;
    }

    @ObfuscatedName("ah.aj(Led;Ljava/awt/Component;III)Lbi;")
    public static final class57 method662(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1154 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1149 = new int[(Statics.field582 ? 2 : 1) * 256];
                var4.field1159 = arg3;
                var4.method1083(arg1);
                var4.field1153 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1153 > 16384) {
                    var4.field1153 = 16384;
                }
                var4.method1103(var4.field1153);
                if (Statics.field1864 > 0 && Statics.field1160 == null) {
                    Statics.field1160 = new class73();
                    Statics.field1160.field1328 = arg0;
                    arg0.method2741(Statics.field1160, Statics.field1864);
                }
                if (Statics.field1160 != null) {
                    if (Statics.field1160.field1318[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1160.field1318[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1149 = new int[256 * (Statics.field582 ? 2 : 1)];
                    var6.field1159 = arg3;
                    var6.method1083(arg1);
                    var6.field1153 = 16384;
                    var6.method1103(var6.field1153);
                    if (Statics.field1864 > 0 && Statics.field1160 == null) {
                        Statics.field1160 = new class73();
                        Statics.field1160.field1328 = arg0;
                        arg0.method2741(Statics.field1160, Statics.field1864);
                    }
                    if (Statics.field1160 != null) {
                        if (Statics.field1160.field1318[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1160.field1318[arg2] = var6;
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

    @ObfuscatedName("bi.ah(Lbn;I)V")
    public final synchronized void method1151(class67 arg0) {
        this.field1150 = arg0;
    }

    @ObfuscatedName("bi.af(I)V")
    public final synchronized void method1161() {
        if (this.field1149 == null) {
            return;
        }
        long var1 = class116.method1946();
        try {
            if (this.field1167 != 0L) {
                if (var1 < this.field1167) {
                    return;
                }
                this.method1103(this.field1153);
                this.field1167 = 0L;
                this.field1158 = true;
            }
            int var3 = this.method1105();
            if (this.field1165 - var3 > this.field1157) {
                this.field1157 = this.field1165 - var3;
            }
            int var4 = this.field1159 + this.field1155;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1153) {
                this.field1153 += 1024;
                if (this.field1153 > 16384) {
                    this.field1153 = 16384;
                }
                this.method1087();
                this.method1103(this.field1153);
                var3 = 0;
                this.field1158 = true;
                if (var4 + 256 > this.field1153) {
                    var4 = this.field1153 - 256;
                    this.field1155 = var4 - this.field1159;
                }
            }
            while (var3 < var4) {
                this.method1156(this.field1149, 256);
                this.method1086();
                var3 += 256;
            }
            if (var1 > this.field1146) {
                if (this.field1158) {
                    this.field1158 = false;
                } else if (this.field1157 == 0 && this.field1156 == 0) {
                    this.method1087();
                    this.field1167 = var1 + 2000L;
                    return;
                } else {
                    this.field1155 = Math.min(this.field1156, this.field1157);
                    this.field1156 = this.field1157;
                }
                this.field1157 = 0;
                this.field1146 = var1 + 2000L;
            }
            this.field1165 = var3;
        } catch (Exception var8) {
            this.method1087();
            this.field1167 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1161 + 500000L) {
                var1 = this.field1161;
            }
            while (var1 > this.field1161 + 5000L) {
                this.method1155(256);
                this.field1161 += (long) (256000 / Statics.field1154);
            }
        } catch (Exception var7) {
            this.field1161 = var1;
        }
    }

    @ObfuscatedName("bi.az(I)V")
    public final void method1162() {
        this.field1158 = true;
    }

    @ObfuscatedName("bi.ax(I)V")
    public final synchronized void method1158() {
        this.field1158 = true;
        try {
            this.method1088();
        } catch (Exception var2) {
            this.method1087();
            this.field1167 = class116.method1946() + 2000L;
        }
    }

    @ObfuscatedName("bi.ac(I)V")
    public final synchronized void method1172() {
        if (Statics.field1160 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1160.field1318[var2] == this) {
                    Statics.field1160.field1318[var2] = null;
                }
                if (Statics.field1160.field1318[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1160.field1316 = true;
                while (Statics.field1160.field1319) {
                    class128.method2289(50L);
                }
                Statics.field1160 = null;
            }
        }
        this.method1087();
        this.field1149 = null;
    }

    @ObfuscatedName("bi.ar(II)V")
    public final void method1155(int arg0) {
        this.field1164 -= arg0;
        if (this.field1164 < 0) {
            this.field1164 = 0;
        }
        if (this.field1150 != null) {
            this.field1150.method1122(arg0);
        }
    }

    @ObfuscatedName("bi.aq([II)V")
    public final void method1156(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field582) {
            var3 = arg1 << 1;
        }
        class121.method2598(arg0, 0, var3);
        this.field1164 -= arg1;
        if (this.field1150 != null && this.field1164 <= 0) {
            this.field1164 += Statics.field1154 >> 4;
            method2685(this.field1150);
            this.method1157(this.field1150, this.field1150.method1261());
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
                        class67 var11 = this.field1152[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1234;
                                if (var12 == null || var12.field1231 <= var8) {
                                    var11.field1235 = true;
                                    int var13 = var11.method1115();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1231 += var13;
                                    }
                                    if (var4 >= this.field1151) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1117();
                                    if (var14 != null) {
                                        int var15 = var11.field1232;
                                        while (var14 != null) {
                                            this.method1157(var14, var15 * var14.method1261() >> 8);
                                            var14 = var11.method1118();
                                        }
                                    }
                                    class67 var16 = var11.field1233;
                                    var11.field1233 = null;
                                    if (var10 == null) {
                                        this.field1152[var7] = var16;
                                    } else {
                                        var10.field1233 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1166[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1233;
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
                class67 var18 = this.field1152[var17];
                class67[] var19 = this.field1152;
                this.field1166[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1233;
                    var18.field1233 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1164 < 0) {
            this.field1164 = 0;
        }
        if (this.field1150 != null) {
            this.field1150.method1120(arg0, 0, arg1);
        }
        this.field1161 = class116.method1946();
    }

    @ObfuscatedName("eh.aa(Lbn;B)V")
    public static final void method2685(class67 arg0) {
        arg0.field1235 = false;
        if (arg0.field1234 != null) {
            arg0.field1234.field1231 = 0;
        }
        for (class67 var1 = arg0.method1117(); var1 != null; var1 = arg0.method1118()) {
            method2685(var1);
        }
    }

    @ObfuscatedName("bi.ay(Lbn;IS)V")
    public final void method1157(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1166[var3];
        if (var4 == null) {
            this.field1152[var3] = arg0;
        } else {
            var4.field1233 = arg0;
        }
        this.field1166[var3] = arg0;
        arg0.field1232 = arg1;
    }

    @ObfuscatedName("bi.b(Ljava/awt/Component;)V")
    public void method1083(Component arg0) throws Exception {
    }

    @ObfuscatedName("bi.g(I)V")
    public void method1103(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.j()I")
    public int method1105() throws Exception {
        return this.field1153;
    }

    @ObfuscatedName("bi.d()V")
    public void method1086() throws Exception {
    }

    @ObfuscatedName("bi.x()V")
    public void method1087() {
    }

    @ObfuscatedName("bi.y()V")
    public void method1088() throws Exception {
    }
}
