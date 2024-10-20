package deob;

import java.awt.Component;

@ObfuscatedName("bl")
public class class57 {

    @ObfuscatedName("bl.r")
    public int[] field1152;

    @ObfuscatedName("bl.k")
    public class67 field1153;

    @ObfuscatedName("bl.m")
    public int field1164 = 32;

    @ObfuscatedName("bl.n")
    public long field1156 = class116.method2794();

    @ObfuscatedName("bl.y")
    public int field1162;

    @ObfuscatedName("bl.i")
    public int field1157;

    @ObfuscatedName("bl.j")
    public int field1158;

    @ObfuscatedName("bl.l")
    public long field1170 = 0L;

    @ObfuscatedName("bl.o")
    public int field1160 = 0;

    @ObfuscatedName("bl.c")
    public int field1169 = 0;

    @ObfuscatedName("bl.x")
    public int field1150 = 0;

    @ObfuscatedName("bl.b")
    public long field1163 = 0L;

    @ObfuscatedName("bl.q")
    public boolean field1155 = true;

    @ObfuscatedName("bl.aq")
    public int field1167 = 0;

    @ObfuscatedName("bl.ap")
    public class67[] field1168 = new class67[8];

    @ObfuscatedName("bl.ai")
    public class67[] field1159 = new class67[8];

    @ObfuscatedName("ax.t(IZIB)V")
    public static final void method924(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1154 = arg0;
        Statics.field1161 = arg1;
        Statics.field61 = arg2;
    }

    @ObfuscatedName("cj.d(Les;Ljava/awt/Component;III)Lbl;")
    public static final class57 method2055(class137 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1154 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1152 = new int[(Statics.field1161 ? 2 : 1) * 256];
                var4.field1157 = arg3;
                var4.method1081(arg1);
                var4.field1162 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1162 > 16384) {
                    var4.field1162 = 16384;
                }
                var4.method1094(var4.field1162);
                if (Statics.field61 > 0 && Statics.field1151 == null) {
                    Statics.field1151 = new class73();
                    Statics.field1151.field1326 = arg0;
                    arg0.method2715(Statics.field1151, Statics.field61);
                }
                if (Statics.field1151 != null) {
                    if (Statics.field1151.field1322[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1151.field1322[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1152 = new int[256 * (Statics.field1161 ? 2 : 1)];
                    var6.field1157 = arg3;
                    var6.method1081(arg1);
                    var6.field1162 = 16384;
                    var6.method1094(var6.field1162);
                    if (Statics.field61 > 0 && Statics.field1151 == null) {
                        Statics.field1151 = new class73();
                        Statics.field1151.field1326 = arg0;
                        arg0.method2715(Statics.field1151, Statics.field61);
                    }
                    if (Statics.field1151 != null) {
                        if (Statics.field1151.field1322[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1151.field1322[arg2] = var6;
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

    @ObfuscatedName("bl.z(Lbf;I)V")
    public final synchronized void method1148(class67 arg0) {
        this.field1153 = arg0;
    }

    @ObfuscatedName("bl.v(I)V")
    public final synchronized void method1149() {
        if (this.field1152 == null) {
            return;
        }
        long var1 = class116.method2794();
        try {
            if (this.field1170 != 0L) {
                if (var1 < this.field1170) {
                    return;
                }
                this.method1094(this.field1162);
                this.field1170 = 0L;
                this.field1155 = true;
            }
            int var3 = this.method1083();
            if (this.field1150 - var3 > this.field1160) {
                this.field1160 = this.field1150 - var3;
            }
            int var4 = this.field1158 + this.field1157;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1162) {
                this.field1162 += 1024;
                if (this.field1162 > 16384) {
                    this.field1162 = 16384;
                }
                this.method1084();
                this.method1094(this.field1162);
                var3 = 0;
                this.field1155 = true;
                if (var4 + 256 > this.field1162) {
                    var4 = this.field1162 - 256;
                    this.field1158 = var4 - this.field1157;
                }
            }
            while (var3 < var4) {
                this.method1166(this.field1152, 256);
                this.method1086();
                var3 += 256;
            }
            if (var1 > this.field1163) {
                if (this.field1155) {
                    this.field1155 = false;
                } else if (this.field1160 == 0 && this.field1169 == 0) {
                    this.method1084();
                    this.field1170 = var1 + 2000L;
                    return;
                } else {
                    this.field1158 = Math.min(this.field1169, this.field1160);
                    this.field1169 = this.field1160;
                }
                this.field1160 = 0;
                this.field1163 = var1 + 2000L;
            }
            this.field1150 = var3;
        } catch (Exception var8) {
            this.method1084();
            this.field1170 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1156 + 500000L) {
                var1 = this.field1156;
            }
            while (var1 > this.field1156 + 5000L) {
                this.method1158(256);
                this.field1156 += (long) (256000 / Statics.field1154);
            }
        } catch (Exception var7) {
            this.field1156 = var1;
        }
    }

    @ObfuscatedName("bl.aq(I)V")
    public final void method1150() {
        this.field1155 = true;
    }

    @ObfuscatedName("bl.ap(I)V")
    public final synchronized void method1151() {
        this.field1155 = true;
        try {
            this.method1085();
        } catch (Exception var2) {
            this.method1084();
            this.field1170 = class116.method2794() + 2000L;
        }
    }

    @ObfuscatedName("bl.ai(B)V")
    public final synchronized void method1152() {
        if (Statics.field1151 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1151.field1322[var2] == this) {
                    Statics.field1151.field1322[var2] = null;
                }
                if (Statics.field1151.field1322[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1151.field1321 = true;
                while (Statics.field1151.field1323) {
                    class128.method2645(50L);
                }
                Statics.field1151 = null;
            }
        }
        this.method1084();
        this.field1152 = null;
    }

    @ObfuscatedName("bl.ae(IB)V")
    public final void method1158(int arg0) {
        this.field1167 -= arg0;
        if (this.field1167 < 0) {
            this.field1167 = 0;
        }
        if (this.field1153 != null) {
            this.field1153.method1113(arg0);
        }
    }

    @ObfuscatedName("bl.az([II)V")
    public final void method1166(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1161) {
            var3 = arg1 << 1;
        }
        class121.method2556(arg0, 0, var3);
        this.field1167 -= arg1;
        if (this.field1153 != null && this.field1167 <= 0) {
            this.field1167 += Statics.field1154 >> 4;
            Statics.method46(this.field1153);
            this.method1154(this.field1153, this.field1153.method1322());
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
                        class67 var11 = this.field1168[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1238;
                                if (var12 == null || var12.field1235 <= var8) {
                                    var11.field1239 = true;
                                    int var13 = var11.method1110();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1235 += var13;
                                    }
                                    if (var4 >= this.field1164) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1104();
                                    if (var14 != null) {
                                        int var15 = var11.field1237;
                                        while (var14 != null) {
                                            this.method1154(var14, var15 * var14.method1322() >> 8);
                                            var14 = var11.method1109();
                                        }
                                    }
                                    class67 var16 = var11.field1236;
                                    var11.field1236 = null;
                                    if (var10 == null) {
                                        this.field1168[var7] = var16;
                                    } else {
                                        var10.field1236 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1159[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1236;
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
                class67 var18 = this.field1168[var17];
                class67[] var19 = this.field1168;
                this.field1159[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1236;
                    var18.field1236 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1167 < 0) {
            this.field1167 = 0;
        }
        if (this.field1153 != null) {
            this.field1153.method1135(arg0, 0, arg1);
        }
        this.field1156 = class116.method2794();
    }

    @ObfuscatedName("bl.ar(Lbf;II)V")
    public final void method1154(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1159[var3];
        if (var4 == null) {
            this.field1168[var3] = arg0;
        } else {
            var4.field1236 = arg0;
        }
        this.field1159[var3] = arg0;
        arg0.field1237 = arg1;
    }

    @ObfuscatedName("bl.e(Ljava/awt/Component;)V")
    public void method1081(Component arg0) throws Exception {
    }

    @ObfuscatedName("bl.w(I)V")
    public void method1094(int arg0) throws Exception {
    }

    @ObfuscatedName("bl.f()I")
    public int method1083() throws Exception {
        return this.field1162;
    }

    @ObfuscatedName("bl.s()V")
    public void method1086() throws Exception {
    }

    @ObfuscatedName("bl.p()V")
    public void method1084() {
    }

    @ObfuscatedName("bl.h()V")
    public void method1085() throws Exception {
    }
}
