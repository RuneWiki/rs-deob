package deob;

import java.awt.Component;

@ObfuscatedName("by")
public class class57 {

    @ObfuscatedName("by.j")
    public int[] field1155;

    @ObfuscatedName("by.f")
    public class67 field1157;

    @ObfuscatedName("by.i")
    public int field1154 = 32;

    @ObfuscatedName("by.g")
    public long field1158 = class115.method124();

    @ObfuscatedName("by.t")
    public int field1159;

    @ObfuscatedName("by.e")
    public int field1153;

    @ObfuscatedName("by.q")
    public int field1163;

    @ObfuscatedName("by.u")
    public long field1162 = 0L;

    @ObfuscatedName("by.r")
    public int field1168 = 0;

    @ObfuscatedName("by.a")
    public int field1164 = 0;

    @ObfuscatedName("by.m")
    public int field1165 = 0;

    @ObfuscatedName("by.y")
    public long field1166 = 0L;

    @ObfuscatedName("by.x")
    public boolean field1167 = true;

    @ObfuscatedName("by.ao")
    public int field1161 = 0;

    @ObfuscatedName("by.ae")
    public class67[] field1172 = new class67[8];

    @ObfuscatedName("by.ay")
    public class67[] field1173 = new class67[8];

    @ObfuscatedName("o.y(IZII)V")
    public static final void method36(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2148 = arg0;
        Statics.field1074 = arg1;
        Statics.field1169 = arg2;
    }

    @ObfuscatedName("af.x(Ler;Ljava/awt/Component;III)Lby;")
    public static final class57 method858(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field2148 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1155 = new int[256 * (Statics.field1074 ? 2 : 1)];
                var4.field1153 = arg3;
                var4.method1065(arg1);
                var4.field1159 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1159 > 16384) {
                    var4.field1159 = 16384;
                }
                var4.method1066(var4.field1159);
                if (Statics.field1169 > 0 && Statics.field2701 == null) {
                    Statics.field2701 = new class73();
                    Statics.field2701.field1326 = arg0;
                    arg0.method2702(Statics.field2701, Statics.field1169);
                }
                if (Statics.field2701 != null) {
                    if (Statics.field2701.field1325[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2701.field1325[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1155 = new int[256 * (Statics.field1074 ? 2 : 1)];
                    var6.field1153 = arg3;
                    var6.method1065(arg1);
                    var6.field1159 = 16384;
                    var6.method1066(var6.field1159);
                    if (Statics.field1169 > 0 && Statics.field2701 == null) {
                        Statics.field2701 = new class73();
                        Statics.field2701.field1326 = arg0;
                        arg0.method2702(Statics.field2701, Statics.field1169);
                    }
                    if (Statics.field2701 != null) {
                        if (Statics.field2701.field1325[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2701.field1325[arg2] = var6;
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

    @ObfuscatedName("by.n(Lbk;B)V")
    public final synchronized void method1130(class67 arg0) {
        this.field1157 = arg0;
    }

    @ObfuscatedName("by.v(I)V")
    public final synchronized void method1131() {
        if (this.field1155 == null) {
            return;
        }
        long var1 = class115.method124();
        try {
            if (this.field1162 != 0L) {
                if (var1 < this.field1162) {
                    return;
                }
                this.method1066(this.field1159);
                this.field1162 = 0L;
                this.field1167 = true;
            }
            int var3 = this.method1067();
            if (this.field1165 - var3 > this.field1168) {
                this.field1168 = this.field1165 - var3;
            }
            int var4 = this.field1163 + this.field1153;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1159) {
                this.field1159 += 1024;
                if (this.field1159 > 16384) {
                    this.field1159 = 16384;
                }
                this.method1068();
                this.method1066(this.field1159);
                var3 = 0;
                this.field1167 = true;
                if (var4 + 256 > this.field1159) {
                    var4 = this.field1159 - 256;
                    this.field1163 = var4 - this.field1153;
                }
            }
            while (var3 < var4) {
                this.method1136(this.field1155, 256);
                this.method1070();
                var3 += 256;
            }
            if (var1 > this.field1166) {
                if (this.field1167) {
                    this.field1167 = false;
                } else if (this.field1168 == 0 && this.field1164 == 0) {
                    this.method1068();
                    this.field1162 = var1 + 2000L;
                    return;
                } else {
                    this.field1163 = Math.min(this.field1164, this.field1168);
                    this.field1164 = this.field1168;
                }
                this.field1168 = 0;
                this.field1166 = var1 + 2000L;
            }
            this.field1165 = var3;
        } catch (Exception var8) {
            this.method1068();
            this.field1162 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1158 + 500000L) {
                var1 = this.field1158;
            }
            while (var1 > this.field1158 + 5000L) {
                this.method1139(256);
                this.field1158 += (long) (256000 / Statics.field2148);
            }
        } catch (Exception var7) {
            this.field1158 = var1;
        }
    }

    @ObfuscatedName("by.s(B)V")
    public final void method1146() {
        this.field1167 = true;
    }

    @ObfuscatedName("by.w(I)V")
    public final synchronized void method1133() {
        this.field1167 = true;
        try {
            this.method1073();
        } catch (Exception var2) {
            this.method1068();
            this.field1162 = class115.method124() + 2000L;
        }
    }

    @ObfuscatedName("by.p(I)V")
    public final synchronized void method1138() {
        if (Statics.field2701 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2701.field1325[var2] == this) {
                    Statics.field2701.field1325[var2] = null;
                }
                if (Statics.field2701.field1325[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2701.field1327 = true;
                while (Statics.field2701.field1330) {
                    class127.method890(50L);
                }
                Statics.field2701 = null;
            }
        }
        this.method1068();
        this.field1155 = null;
    }

    @ObfuscatedName("by.ao(IB)V")
    public final void method1139(int arg0) {
        this.field1161 -= arg0;
        if (this.field1161 < 0) {
            this.field1161 = 0;
        }
        if (this.field1157 != null) {
            this.field1157.method1094(arg0);
        }
    }

    @ObfuscatedName("by.ae([II)V")
    public final void method1136(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1074) {
            var3 = arg1 << 1;
        }
        class120.method2549(arg0, 0, var3);
        this.field1161 -= arg1;
        if (this.field1157 != null && this.field1161 <= 0) {
            this.field1161 += Statics.field2148 >> 4;
            method925(this.field1157);
            this.method1137(this.field1157, this.field1157.method1244());
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
                        class67 var11 = this.field1172[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1243;
                                if (var12 == null || var12.field1240 <= var8) {
                                    var11.field1244 = true;
                                    int var13 = var11.method1108();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1240 += var13;
                                    }
                                    if (var4 >= this.field1154) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1089();
                                    if (var14 != null) {
                                        int var15 = var11.field1242;
                                        while (var14 != null) {
                                            this.method1137(var14, var15 * var14.method1244() >> 8);
                                            var14 = var11.method1090();
                                        }
                                    }
                                    class67 var16 = var11.field1241;
                                    var11.field1241 = null;
                                    if (var10 == null) {
                                        this.field1172[var7] = var16;
                                    } else {
                                        var10.field1241 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1173[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1241;
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
                class67 var18 = this.field1172[var17];
                class67[] var19 = this.field1172;
                this.field1173[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1241;
                    var18.field1241 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1161 < 0) {
            this.field1161 = 0;
        }
        if (this.field1157 != null) {
            this.field1157.method1086(arg0, 0, arg1);
        }
        this.field1158 = class115.method124();
    }

    @ObfuscatedName("ab.ay(Lbk;B)V")
    public static final void method925(class67 arg0) {
        arg0.field1244 = false;
        if (arg0.field1243 != null) {
            arg0.field1243.field1240 = 0;
        }
        for (class67 var1 = arg0.method1089(); var1 != null; var1 = arg0.method1090()) {
            method925(var1);
        }
    }

    @ObfuscatedName("by.ad(Lbk;II)V")
    public final void method1137(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1173[var3];
        if (var4 == null) {
            this.field1172[var3] = arg0;
        } else {
            var4.field1241 = arg0;
        }
        this.field1173[var3] = arg0;
        arg0.field1242 = arg1;
    }

    @ObfuscatedName("by.k(Ljava/awt/Component;)V")
    public void method1065(Component arg0) throws Exception {
    }

    @ObfuscatedName("by.h(I)V")
    public void method1066(int arg0) throws Exception {
    }

    @ObfuscatedName("by.o()I")
    public int method1067() throws Exception {
        return this.field1159;
    }

    @ObfuscatedName("by.z()V")
    public void method1070() throws Exception {
    }

    @ObfuscatedName("by.c()V")
    public void method1068() {
    }

    @ObfuscatedName("by.d()V")
    public void method1073() throws Exception {
    }
}
