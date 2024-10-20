package deob;

import java.awt.Component;

@ObfuscatedName("ah")
public class class52 {

    @ObfuscatedName("ah.k")
    public int[] field1102;

    @ObfuscatedName("ah.c")
    public class62 field1103;

    @ObfuscatedName("ah.j")
    public int field1105 = 32;

    @ObfuscatedName("ah.m")
    public long field1106 = class107.method2661();

    @ObfuscatedName("ah.a")
    public int field1107;

    @ObfuscatedName("ah.f")
    public int field1108;

    @ObfuscatedName("ah.i")
    public int field1109;

    @ObfuscatedName("ah.n")
    public long field1104 = 0L;

    @ObfuscatedName("ah.x")
    public int field1110 = 0;

    @ObfuscatedName("ah.h")
    public int field1100 = 0;

    @ObfuscatedName("ah.t")
    public int field1113 = 0;

    @ObfuscatedName("ah.w")
    public long field1114 = 0L;

    @ObfuscatedName("ah.p")
    public boolean field1112 = true;

    @ObfuscatedName("ah.ar")
    public int field1116 = 0;

    @ObfuscatedName("ah.av")
    public class62[] field1111 = new class62[8];

    @ObfuscatedName("ah.ae")
    public class62[] field1118 = new class62[8];

    @ObfuscatedName("u.t(IZII)V")
    public static final void method32(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field1685 = arg0;
        Statics.field1101 = arg1;
        Statics.field1115 = arg2;
    }

    @ObfuscatedName("cn.w(Ldy;Ljava/awt/Component;III)Lah;")
    public static final class52 method1939(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1685 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1102 = new int[(Statics.field1101 ? 2 : 1) * 256];
                var4.field1108 = arg3;
                var4.method1008(arg1);
                var4.field1107 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1107 > 16384) {
                    var4.field1107 = 16384;
                }
                var4.method1009(var4.field1107);
                if (Statics.field1115 > 0 && Statics.field714 == null) {
                    Statics.field714 = new class68();
                    Statics.field714.field1280 = arg0;
                    arg0.method2607(Statics.field714, Statics.field1115);
                }
                if (Statics.field714 != null) {
                    if (Statics.field714.field1271[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field714.field1271[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1102 = new int[(Statics.field1101 ? 2 : 1) * 256];
                    var6.field1108 = arg3;
                    var6.method1008(arg1);
                    var6.field1107 = 16384;
                    var6.method1009(var6.field1107);
                    if (Statics.field1115 > 0 && Statics.field714 == null) {
                        Statics.field714 = new class68();
                        Statics.field714.field1280 = arg0;
                        arg0.method2607(Statics.field714, Statics.field1115);
                    }
                    if (Statics.field714 != null) {
                        if (Statics.field714.field1271[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field714.field1271[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class52();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ah.p(Lbo;I)V")
    public final synchronized void method1078(class62 arg0) {
        this.field1103 = arg0;
    }

    @ObfuscatedName("ah.z(I)V")
    public final synchronized void method1069() {
        if (this.field1102 == null) {
            return;
        }
        long var1 = class107.method2661();
        try {
            if (this.field1104 != 0L) {
                if (var1 < this.field1104) {
                    return;
                }
                this.method1009(this.field1107);
                this.field1104 = 0L;
                this.field1112 = true;
            }
            int var3 = this.method1007();
            if (this.field1113 - var3 > this.field1110) {
                this.field1110 = this.field1113 - var3;
            }
            int var4 = this.field1109 + this.field1108;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1107) {
                this.field1107 += 1024;
                if (this.field1107 > 16384) {
                    this.field1107 = 16384;
                }
                this.method1012();
                this.method1009(this.field1107);
                var3 = 0;
                this.field1112 = true;
                if (var4 + 256 > this.field1107) {
                    var4 = this.field1107 - 256;
                    this.field1109 = var4 - this.field1108;
                }
            }
            while (var3 < var4) {
                this.method1072(this.field1102, 256);
                this.method1011();
                var3 += 256;
            }
            if (var1 > this.field1114) {
                if (this.field1112) {
                    this.field1112 = false;
                } else if (this.field1110 == 0 && this.field1100 == 0) {
                    this.method1012();
                    this.field1104 = var1 + 2000L;
                    return;
                } else {
                    this.field1109 = Math.min(this.field1100, this.field1110);
                    this.field1100 = this.field1110;
                }
                this.field1110 = 0;
                this.field1114 = var1 + 2000L;
            }
            this.field1113 = var3;
        } catch (Exception var8) {
            this.method1012();
            this.field1104 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1106 + 500000L) {
                var1 = this.field1106;
            }
            while (var1 > this.field1106 + 5000L) {
                this.method1104(256);
                this.field1106 += (long) (256000 / Statics.field1685);
            }
        } catch (Exception var7) {
            this.field1106 = var1;
        }
    }

    @ObfuscatedName("ah.s(B)V")
    public final void method1070() {
        this.field1112 = true;
    }

    @ObfuscatedName("ah.d(I)V")
    public final synchronized void method1075() {
        this.field1112 = true;
        try {
            this.method1013();
        } catch (Exception var2) {
            this.method1012();
            this.field1104 = class107.method2661() + 2000L;
        }
    }

    @ObfuscatedName("ah.b(I)V")
    public final synchronized void method1074() {
        if (Statics.field714 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field714.field1271[var2] == this) {
                    Statics.field714.field1271[var2] = null;
                }
                if (Statics.field714.field1271[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field714.field1273 = true;
                while (Statics.field714.field1275) {
                    Statics.method832(50L);
                }
                Statics.field714 = null;
            }
        }
        this.method1012();
        this.field1102 = null;
    }

    @ObfuscatedName("ah.e(IB)V")
    public final void method1104(int arg0) {
        this.field1116 -= arg0;
        if (this.field1116 < 0) {
            this.field1116 = 0;
        }
        if (this.field1103 != null) {
            this.field1103.method1043(arg0);
        }
    }

    @ObfuscatedName("ah.ar([II)V")
    public final void method1072(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1101) {
            var3 = arg1 << 1;
        }
        class112.method2450(arg0, 0, var3);
        this.field1116 -= arg1;
        if (this.field1103 != null && this.field1116 <= 0) {
            this.field1116 += Statics.field1685 >> 4;
            method2516(this.field1103);
            this.method1073(this.field1103, this.field1103.method1181());
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
                        class62 var10 = null;
                        class62 var11 = this.field1111[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1189;
                                if (var12 == null || var12.field1186 <= var8) {
                                    var11.field1187 = true;
                                    int var13 = var11.method1031();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1186 += var13;
                                    }
                                    if (var4 >= this.field1105) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1058();
                                    if (var14 != null) {
                                        int var15 = var11.field1188;
                                        while (var14 != null) {
                                            this.method1073(var14, var15 * var14.method1181() >> 8);
                                            var14 = var11.method1036();
                                        }
                                    }
                                    class62 var16 = var11.field1190;
                                    var11.field1190 = null;
                                    if (var10 == null) {
                                        this.field1111[var7] = var16;
                                    } else {
                                        var10.field1190 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1118[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1190;
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
                class62 var18 = this.field1111[var17];
                class62[] var19 = this.field1111;
                this.field1118[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1190;
                    var18.field1190 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1116 < 0) {
            this.field1116 = 0;
        }
        if (this.field1103 != null) {
            this.field1103.method1037(arg0, 0, arg1);
        }
        this.field1106 = class107.method2661();
    }

    @ObfuscatedName("dr.av(Lbo;I)V")
    public static final void method2516(class62 arg0) {
        arg0.field1187 = false;
        if (arg0.field1189 != null) {
            arg0.field1189.field1186 = 0;
        }
        for (class62 var1 = arg0.method1058(); var1 != null; var1 = arg0.method1036()) {
            method2516(var1);
        }
    }

    @ObfuscatedName("ah.ae(Lbo;II)V")
    public final void method1073(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1118[var3];
        if (var4 == null) {
            this.field1111[var3] = arg0;
        } else {
            var4.field1190 = arg0;
        }
        this.field1118[var3] = arg0;
        arg0.field1188 = arg1;
    }

    @ObfuscatedName("ah.o(Ljava/awt/Component;)V")
    public void method1008(Component arg0) throws Exception {
    }

    @ObfuscatedName("ah.l(I)V")
    public void method1009(int arg0) throws Exception {
    }

    @ObfuscatedName("ah.g()I")
    public int method1007() throws Exception {
        return this.field1107;
    }

    @ObfuscatedName("ah.u()V")
    public void method1011() throws Exception {
    }

    @ObfuscatedName("ah.q()V")
    public void method1012() {
    }

    @ObfuscatedName("ah.r()V")
    public void method1013() throws Exception {
    }
}
