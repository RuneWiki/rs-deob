package deob;

import java.awt.Component;

@ObfuscatedName("ab")
public class class52 {

    @ObfuscatedName("ab.y")
    public int[] field1091;

    @ObfuscatedName("ab.b")
    public class48 field1103;

    @ObfuscatedName("ab.l")
    public int field1093 = 32;

    @ObfuscatedName("ab.x")
    public long field1090 = class121.method1250();

    @ObfuscatedName("ab.z")
    public int field1095;

    @ObfuscatedName("ab.r")
    public int field1096;

    @ObfuscatedName("ab.h")
    public int field1092;

    @ObfuscatedName("ab.v")
    public long field1098 = 0L;

    @ObfuscatedName("ab.u")
    public int field1099 = 0;

    @ObfuscatedName("ab.i")
    public int field1097 = 0;

    @ObfuscatedName("ab.e")
    public int field1101 = 0;

    @ObfuscatedName("ab.n")
    public long field1109 = 0L;

    @ObfuscatedName("ab.q")
    public boolean field1102 = true;

    @ObfuscatedName("ab.ap")
    public int field1104 = 0;

    @ObfuscatedName("ab.ah")
    public class48[] field1105 = new class48[8];

    @ObfuscatedName("ab.ax")
    public class48[] field1106 = new class48[8];

    @ObfuscatedName("ab.o(Lao;I)V")
    public final synchronized void method1136(class48 arg0) {
        this.field1103 = arg0;
    }

    @ObfuscatedName("ab.j(I)V")
    public final synchronized void method1135() {
        if (this.field1091 == null) {
            return;
        }
        long var1 = class121.method1250();
        try {
            if (this.field1098 != 0L) {
                if (var1 < this.field1098) {
                    return;
                }
                this.method906(this.field1095);
                this.field1098 = 0L;
                this.field1102 = true;
            }
            int var3 = this.method907();
            if (this.field1101 - var3 > this.field1099) {
                this.field1099 = this.field1101 - var3;
            }
            int var4 = this.field1096 + this.field1092;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1095) {
                this.field1095 += 1024;
                if (this.field1095 > 16384) {
                    this.field1095 = 16384;
                }
                this.method920();
                this.method906(this.field1095);
                var3 = 0;
                this.field1102 = true;
                if (var4 + 256 > this.field1095) {
                    var4 = this.field1095 - 256;
                    this.field1092 = var4 - this.field1096;
                }
            }
            while (var3 < var4) {
                this.method1140(this.field1091, 256);
                this.method908();
                var3 += 256;
            }
            if (var1 > this.field1109) {
                if (this.field1102) {
                    this.field1102 = false;
                } else if (this.field1099 == 0 && this.field1097 == 0) {
                    this.method920();
                    this.field1098 = var1 + 2000L;
                    return;
                } else {
                    this.field1092 = Math.min(this.field1097, this.field1099);
                    this.field1097 = this.field1099;
                }
                this.field1099 = 0;
                this.field1109 = var1 + 2000L;
            }
            this.field1101 = var3;
        } catch (Exception var8) {
            this.method920();
            this.field1098 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1090 + 500000L) {
                var1 = this.field1090;
            }
            while (var1 > this.field1090 + 5000L) {
                this.method1139(256);
                this.field1090 += (long) (256000 / Statics.field2328);
            }
        } catch (Exception var7) {
            this.field1090 = var1;
        }
    }

    @ObfuscatedName("ab.ae(I)V")
    public final void method1142() {
        this.field1102 = true;
    }

    @ObfuscatedName("ab.aq(I)V")
    public final synchronized void method1137() {
        this.field1102 = true;
        try {
            this.method904();
        } catch (Exception var2) {
            this.method920();
            this.field1098 = class121.method1250() + 2000L;
        }
    }

    @ObfuscatedName("ab.ap(I)V")
    public final synchronized void method1138() {
        if (Statics.field1094 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1094.field1177[var2] == this) {
                    Statics.field1094.field1177[var2] = null;
                }
                if (Statics.field1094.field1177[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1094.field1179 = true;
                while (Statics.field1094.field1181) {
                    class126.method112(50L);
                }
                Statics.field1094 = null;
            }
        }
        this.method920();
        this.field1091 = null;
    }

    @ObfuscatedName("ab.ah(IS)V")
    public final void method1139(int arg0) {
        this.field1104 -= arg0;
        if (this.field1104 < 0) {
            this.field1104 = 0;
        }
        if (this.field1103 != null) {
            this.field1103.method954(arg0);
        }
    }

    @ObfuscatedName("ab.ax([II)V")
    public final void method1140(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1178) {
            var3 = arg1 << 1;
        }
        class128.method2595(arg0, 0, var3);
        this.field1104 -= arg1;
        if (this.field1103 != null && this.field1104 <= 0) {
            this.field1104 += Statics.field2328 >> 4;
            method636(this.field1103);
            this.method1141(this.field1103, this.field1103.method934());
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
                        class48 var10 = null;
                        class48 var11 = this.field1105[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1068;
                                if (var12 == null || var12.field1065 <= var8) {
                                    var11.field1069 = true;
                                    int var13 = var11.method952();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1065 += var13;
                                    }
                                    if (var4 >= this.field1093) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method974();
                                    if (var14 != null) {
                                        int var15 = var11.field1067;
                                        while (var14 != null) {
                                            this.method1141(var14, var15 * var14.method934() >> 8);
                                            var14 = var11.method951();
                                        }
                                    }
                                    class48 var16 = var11.field1066;
                                    var11.field1066 = null;
                                    if (var10 == null) {
                                        this.field1105[var7] = var16;
                                    } else {
                                        var10.field1066 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1106[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1066;
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
                class48 var18 = this.field1105[var17];
                class48[] var19 = this.field1105;
                this.field1106[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1066;
                    var18.field1066 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1104 < 0) {
            this.field1104 = 0;
        }
        if (this.field1103 != null) {
            this.field1103.method1018(arg0, 0, arg1);
        }
        this.field1090 = class121.method1250();
    }

    @ObfuscatedName("ai.ai(Lao;B)V")
    public static final void method636(class48 arg0) {
        arg0.field1069 = false;
        if (arg0.field1068 != null) {
            arg0.field1068.field1065 = 0;
        }
        for (class48 var1 = arg0.method974(); var1 != null; var1 = arg0.method951()) {
            method636(var1);
        }
    }

    @ObfuscatedName("ab.aa(Lao;IB)V")
    public final void method1141(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1106[var3];
        if (var4 == null) {
            this.field1105[var3] = arg0;
        } else {
            var4.field1066 = arg0;
        }
        this.field1106[var3] = arg0;
        arg0.field1067 = arg1;
    }

    @ObfuscatedName("ab.d(Ljava/awt/Component;)V")
    public void method922(Component arg0) throws Exception {
    }

    @ObfuscatedName("ab.g(I)V")
    public void method906(int arg0) throws Exception {
    }

    @ObfuscatedName("ab.a()I")
    public int method907() throws Exception {
        return this.field1095;
    }

    @ObfuscatedName("ab.t()V")
    public void method908() throws Exception {
    }

    @ObfuscatedName("ab.f()V")
    public void method920() {
    }

    @ObfuscatedName("ab.c()V")
    public void method904() throws Exception {
    }
}
