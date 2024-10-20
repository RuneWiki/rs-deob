package deob;

import java.awt.Component;

@ObfuscatedName("bi")
public class class57 {

    @ObfuscatedName("bi.g")
    public int[] field1136;

    @ObfuscatedName("bi.e")
    public class67 field1141;

    @ObfuscatedName("bi.p")
    public int field1142 = 32;

    @ObfuscatedName("bi.a")
    public long field1143 = class115.method2177();

    @ObfuscatedName("bi.v")
    public int field1144;

    @ObfuscatedName("bi.c")
    public int field1145;

    @ObfuscatedName("bi.s")
    public int field1146;

    @ObfuscatedName("bi.r")
    public long field1155 = 0L;

    @ObfuscatedName("bi.h")
    public int field1148 = 0;

    @ObfuscatedName("bi.n")
    public int field1149 = 0;

    @ObfuscatedName("bi.b")
    public int field1150 = 0;

    @ObfuscatedName("bi.f")
    public long field1151 = 0L;

    @ObfuscatedName("bi.d")
    public boolean field1152 = true;

    @ObfuscatedName("bi.aq")
    public int field1153 = 0;

    @ObfuscatedName("bi.an")
    public class67[] field1140 = new class67[8];

    @ObfuscatedName("bi.av")
    public class67[] field1156 = new class67[8];

    @ObfuscatedName("ap.q(IZII)V")
    public static final void method775(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1139 = arg0;
        Statics.field1135 = arg1;
        Statics.field1138 = arg2;
    }

    @ObfuscatedName("do.o(Leh;Ljava/awt/Component;III)Lbi;")
    public static final class57 method2684(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1139 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1136 = new int[(Statics.field1135 ? 2 : 1) * 256];
                var4.field1145 = arg3;
                var4.method1129(arg1);
                var4.field1144 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1144 > 16384) {
                    var4.field1144 = 16384;
                }
                var4.method1147(var4.field1144);
                if (Statics.field1138 > 0 && Statics.field1137 == null) {
                    Statics.field1137 = new class73();
                    Statics.field1137.field1314 = arg0;
                    arg0.method2756(Statics.field1137, Statics.field1138);
                }
                if (Statics.field1137 != null) {
                    if (Statics.field1137.field1305[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1137.field1305[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1136 = new int[(Statics.field1135 ? 2 : 1) * 256];
                    var6.field1145 = arg3;
                    var6.method1129(arg1);
                    var6.field1144 = 16384;
                    var6.method1147(var6.field1144);
                    if (Statics.field1138 > 0 && Statics.field1137 == null) {
                        Statics.field1137 = new class73();
                        Statics.field1137.field1314 = arg0;
                        arg0.method2756(Statics.field1137, Statics.field1138);
                    }
                    if (Statics.field1137 != null) {
                        if (Statics.field1137.field1305[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1137.field1305[arg2] = var6;
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

    @ObfuscatedName("bi.w(Lby;I)V")
    public final synchronized void method1214(class67 arg0) {
        this.field1141 = arg0;
    }

    @ObfuscatedName("bi.z(I)V")
    public final synchronized void method1192() {
        if (this.field1136 == null) {
            return;
        }
        long var1 = class115.method2177();
        try {
            if (this.field1155 != 0L) {
                if (var1 < this.field1155) {
                    return;
                }
                this.method1147(this.field1144);
                this.field1155 = 0L;
                this.field1152 = true;
            }
            int var3 = this.method1131();
            if (this.field1150 - var3 > this.field1148) {
                this.field1148 = this.field1150 - var3;
            }
            int var4 = this.field1146 + this.field1145;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1144) {
                this.field1144 += 1024;
                if (this.field1144 > 16384) {
                    this.field1144 = 16384;
                }
                this.method1133();
                this.method1147(this.field1144);
                var3 = 0;
                this.field1152 = true;
                if (var4 + 256 > this.field1144) {
                    var4 = this.field1144 - 256;
                    this.field1146 = var4 - this.field1145;
                }
            }
            while (var3 < var4) {
                this.method1200(this.field1136, 256);
                this.method1146();
                var3 += 256;
            }
            if (var1 > this.field1151) {
                if (this.field1152) {
                    this.field1152 = false;
                } else if (this.field1148 == 0 && this.field1149 == 0) {
                    this.method1133();
                    this.field1155 = var1 + 2000L;
                    return;
                } else {
                    this.field1146 = Math.min(this.field1149, this.field1148);
                    this.field1149 = this.field1148;
                }
                this.field1148 = 0;
                this.field1151 = var1 + 2000L;
            }
            this.field1150 = var3;
        } catch (Exception var8) {
            this.method1133();
            this.field1155 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1143 + 500000L) {
                var1 = this.field1143;
            }
            while (var1 > this.field1143 + 5000L) {
                this.method1195(256);
                this.field1143 += (long) (256000 / Statics.field1139);
            }
        } catch (Exception var7) {
            this.field1143 = var1;
        }
    }

    @ObfuscatedName("bi.t(I)V")
    public final void method1226() {
        this.field1152 = true;
    }

    @ObfuscatedName("bi.aq(I)V")
    public final synchronized void method1194() {
        this.field1152 = true;
        try {
            this.method1130();
        } catch (Exception var2) {
            this.method1133();
            this.field1155 = class115.method2177() + 2000L;
        }
    }

    @ObfuscatedName("bi.an(I)V")
    public final synchronized void method1208() {
        if (Statics.field1137 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1137.field1305[var2] == this) {
                    Statics.field1137.field1305[var2] = null;
                }
                if (Statics.field1137.field1305[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1137.field1304 = true;
                while (Statics.field1137.field1307) {
                    class127.method3199(50L);
                }
                Statics.field1137 = null;
            }
        }
        this.method1133();
        this.field1136 = null;
    }

    @ObfuscatedName("bi.av(IB)V")
    public final void method1195(int arg0) {
        this.field1153 -= arg0;
        if (this.field1153 < 0) {
            this.field1153 = 0;
        }
        if (this.field1141 != null) {
            this.field1141.method1160(arg0);
        }
    }

    @ObfuscatedName("bi.ac([II)V")
    public final void method1200(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1135) {
            var3 = arg1 << 1;
        }
        class120.method2602(arg0, 0, var3);
        this.field1153 -= arg1;
        if (this.field1141 != null && this.field1153 <= 0) {
            this.field1153 += Statics.field1139 >> 4;
            method5(this.field1141);
            this.method1197(this.field1141, this.field1141.method1302());
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
                        class67 var11 = this.field1140[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1222;
                                if (var12 == null || var12.field1219 <= var8) {
                                    var11.field1223 = true;
                                    int var13 = var11.method1157();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1219 += var13;
                                    }
                                    if (var4 >= this.field1142) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1155();
                                    if (var14 != null) {
                                        int var15 = var11.field1221;
                                        while (var14 != null) {
                                            this.method1197(var14, var15 * var14.method1302() >> 8);
                                            var14 = var11.method1156();
                                        }
                                    }
                                    class67 var16 = var11.field1220;
                                    var11.field1220 = null;
                                    if (var10 == null) {
                                        this.field1140[var7] = var16;
                                    } else {
                                        var10.field1220 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1156[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1220;
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
                class67 var18 = this.field1140[var17];
                class67[] var19 = this.field1140;
                this.field1156[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1220;
                    var18.field1220 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1153 < 0) {
            this.field1153 = 0;
        }
        if (this.field1141 != null) {
            this.field1141.method1183(arg0, 0, arg1);
        }
        this.field1143 = class115.method2177();
    }

    @ObfuscatedName("m.ar(Lby;B)V")
    public static final void method5(class67 arg0) {
        arg0.field1223 = false;
        if (arg0.field1222 != null) {
            arg0.field1222.field1219 = 0;
        }
        for (class67 var1 = arg0.method1155(); var1 != null; var1 = arg0.method1156()) {
            method5(var1);
        }
    }

    @ObfuscatedName("bi.ah(Lby;IB)V")
    public final void method1197(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1156[var3];
        if (var4 == null) {
            this.field1140[var3] = arg0;
        } else {
            var4.field1220 = arg0;
        }
        this.field1156[var3] = arg0;
        arg0.field1221 = arg1;
    }

    @ObfuscatedName("bi.m(Ljava/awt/Component;)V")
    public void method1129(Component arg0) throws Exception {
    }

    @ObfuscatedName("bi.l(I)V")
    public void method1147(int arg0) throws Exception {
    }

    @ObfuscatedName("bi.y()I")
    public int method1131() throws Exception {
        return this.field1144;
    }

    @ObfuscatedName("bi.u()V")
    public void method1146() throws Exception {
    }

    @ObfuscatedName("bi.k()V")
    public void method1133() {
    }

    @ObfuscatedName("bi.j()V")
    public void method1130() throws Exception {
    }
}
