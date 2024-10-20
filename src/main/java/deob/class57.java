package deob;

import java.awt.Component;

@ObfuscatedName("bo")
public class class57 {

    @ObfuscatedName("bo.m")
    public int[] field1175;

    @ObfuscatedName("bo.r")
    public class67 field1174;

    @ObfuscatedName("bo.y")
    public int field1190 = 32;

    @ObfuscatedName("bo.q")
    public long field1178 = class115.method2622();

    @ObfuscatedName("bo.f")
    public int field1179;

    @ObfuscatedName("bo.x")
    public int field1176;

    @ObfuscatedName("bo.d")
    public int field1181;

    @ObfuscatedName("bo.e")
    public long field1182 = 0L;

    @ObfuscatedName("bo.l")
    public int field1177 = 0;

    @ObfuscatedName("bo.u")
    public int field1184 = 0;

    @ObfuscatedName("bo.a")
    public int field1185 = 0;

    @ObfuscatedName("bo.b")
    public long field1186 = 0L;

    @ObfuscatedName("bo.s")
    public boolean field1187 = true;

    @ObfuscatedName("bo.aj")
    public int field1188 = 0;

    @ObfuscatedName("bo.aq")
    public class67[] field1189 = new class67[8];

    @ObfuscatedName("bo.aw")
    public class67[] field1192 = new class67[8];

    @ObfuscatedName("bg.v(IZII)V")
    public static final void method1520(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1191 = arg0;
        Statics.field642 = arg1;
        Statics.field2284 = arg2;
    }

    @ObfuscatedName("m.j(Lex;Ljava/awt/Component;III)Lbo;")
    public static final class57 method117(class136 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1191 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class70 var4 = new class70();
                var4.field1175 = new int[256 * (Statics.field642 ? 2 : 1)];
                var4.field1176 = arg3;
                var4.method1071(arg1);
                var4.field1179 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1179 > 16384) {
                    var4.field1179 = 16384;
                }
                var4.method1080(var4.field1179);
                if (Statics.field2284 > 0 && Statics.field2876 == null) {
                    Statics.field2876 = new class73();
                    Statics.field2876.field1341 = arg0;
                    arg0.method2680(Statics.field2876, Statics.field2284);
                }
                if (Statics.field2876 != null) {
                    if (Statics.field2876.field1343[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2876.field1343[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class55 var6 = new class55(arg0, arg2);
                    var6.field1175 = new int[(Statics.field642 ? 2 : 1) * 256];
                    var6.field1176 = arg3;
                    var6.method1071(arg1);
                    var6.field1179 = 16384;
                    var6.method1080(var6.field1179);
                    if (Statics.field2284 > 0 && Statics.field2876 == null) {
                        Statics.field2876 = new class73();
                        Statics.field2876.field1341 = arg0;
                        arg0.method2680(Statics.field2876, Statics.field2284);
                    }
                    if (Statics.field2876 != null) {
                        if (Statics.field2876.field1343[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2876.field1343[arg2] = var6;
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

    @ObfuscatedName("bo.z(Lbv;I)V")
    public final synchronized void method1143(class67 arg0) {
        this.field1174 = arg0;
    }

    @ObfuscatedName("bo.n(B)V")
    public final synchronized void method1137() {
        if (this.field1175 == null) {
            return;
        }
        long var1 = class115.method2622();
        try {
            if (this.field1182 != 0L) {
                if (var1 < this.field1182) {
                    return;
                }
                this.method1080(this.field1179);
                this.field1182 = 0L;
                this.field1187 = true;
            }
            int var3 = this.method1073();
            if (this.field1185 - var3 > this.field1177) {
                this.field1177 = this.field1185 - var3;
            }
            int var4 = this.field1181 + this.field1176;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1179) {
                this.field1179 += 1024;
                if (this.field1179 > 16384) {
                    this.field1179 = 16384;
                }
                this.method1087();
                this.method1080(this.field1179);
                var3 = 0;
                this.field1187 = true;
                if (var4 + 256 > this.field1179) {
                    var4 = this.field1179 - 256;
                    this.field1181 = var4 - this.field1176;
                }
            }
            while (var3 < var4) {
                this.method1144(this.field1175, 256);
                this.method1083();
                var3 += 256;
            }
            if (var1 > this.field1186) {
                if (this.field1187) {
                    this.field1187 = false;
                } else if (this.field1177 == 0 && this.field1184 == 0) {
                    this.method1087();
                    this.field1182 = var1 + 2000L;
                    return;
                } else {
                    this.field1181 = Math.min(this.field1184, this.field1177);
                    this.field1184 = this.field1177;
                }
                this.field1177 = 0;
                this.field1186 = var1 + 2000L;
            }
            this.field1185 = var3;
        } catch (Exception var8) {
            this.method1087();
            this.field1182 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1178 + 500000L) {
                var1 = this.field1178;
            }
            while (var1 > this.field1178 + 5000L) {
                this.method1148(256);
                this.field1178 += (long) (256000 / Statics.field1191);
            }
        } catch (Exception var7) {
            this.field1178 = var1;
        }
    }

    @ObfuscatedName("bo.p(I)V")
    public final void method1170() {
        this.field1187 = true;
    }

    @ObfuscatedName("bo.aj(I)V")
    public final synchronized void method1139() {
        this.field1187 = true;
        try {
            this.method1074();
        } catch (Exception var2) {
            this.method1087();
            this.field1182 = class115.method2622() + 2000L;
        }
    }

    @ObfuscatedName("bo.aq(B)V")
    public final synchronized void method1140() {
        if (Statics.field2876 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2876.field1343[var2] == this) {
                    Statics.field2876.field1343[var2] = null;
                }
                if (Statics.field2876.field1343[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2876.field1344 = true;
                while (Statics.field2876.field1347) {
                    class127.method2079(50L);
                }
                Statics.field2876 = null;
            }
        }
        this.method1087();
        this.field1175 = null;
    }

    @ObfuscatedName("bo.aw(II)V")
    public final void method1148(int arg0) {
        this.field1188 -= arg0;
        if (this.field1188 < 0) {
            this.field1188 = 0;
        }
        if (this.field1174 != null) {
            this.field1174.method1109(arg0);
        }
    }

    @ObfuscatedName("bo.az([II)V")
    public final void method1144(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field642) {
            var3 = arg1 << 1;
        }
        class120.method2493(arg0, 0, var3);
        this.field1188 -= arg1;
        if (this.field1174 != null && this.field1188 <= 0) {
            this.field1188 += Statics.field1191 >> 4;
            method181(this.field1174);
            this.method1142(this.field1174, this.field1174.method1289());
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
                        class67 var11 = this.field1189[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class66 var12 = var11.field1259;
                                if (var12 == null || var12.field1256 <= var8) {
                                    var11.field1257 = true;
                                    int var13 = var11.method1124();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1256 += var13;
                                    }
                                    if (var4 >= this.field1190) {
                                        break label105;
                                    }
                                    class67 var14 = var11.method1110();
                                    if (var14 != null) {
                                        int var15 = var11.field1258;
                                        while (var14 != null) {
                                            this.method1142(var14, var15 * var14.method1289() >> 8);
                                            var14 = var11.method1098();
                                        }
                                    }
                                    class67 var16 = var11.field1260;
                                    var11.field1260 = null;
                                    if (var10 == null) {
                                        this.field1189[var7] = var16;
                                    } else {
                                        var10.field1260 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1192[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1260;
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
                class67 var18 = this.field1189[var17];
                class67[] var19 = this.field1189;
                this.field1192[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class67 var21 = var18.field1260;
                    var18.field1260 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1188 < 0) {
            this.field1188 = 0;
        }
        if (this.field1174 != null) {
            this.field1174.method1100(arg0, 0, arg1);
        }
        this.field1178 = class115.method2622();
    }

    @ObfuscatedName("a.at(Lbv;I)V")
    public static final void method181(class67 arg0) {
        arg0.field1257 = false;
        if (arg0.field1259 != null) {
            arg0.field1259.field1256 = 0;
        }
        for (class67 var1 = arg0.method1110(); var1 != null; var1 = arg0.method1098()) {
            method181(var1);
        }
    }

    @ObfuscatedName("bo.af(Lbv;II)V")
    public final void method1142(class67 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class67 var4 = this.field1192[var3];
        if (var4 == null) {
            this.field1189[var3] = arg0;
        } else {
            var4.field1260 = arg0;
        }
        this.field1192[var3] = arg0;
        arg0.field1258 = arg1;
    }

    @ObfuscatedName("bo.c(Ljava/awt/Component;)V")
    public void method1071(Component arg0) throws Exception {
    }

    @ObfuscatedName("bo.h(I)V")
    public void method1080(int arg0) throws Exception {
    }

    @ObfuscatedName("bo.k()I")
    public int method1073() throws Exception {
        return this.field1179;
    }

    @ObfuscatedName("bo.t()V")
    public void method1083() throws Exception {
    }

    @ObfuscatedName("bo.g()V")
    public void method1087() {
    }

    @ObfuscatedName("bo.o()V")
    public void method1074() throws Exception {
    }
}
