package deob;

import java.awt.Component;

@ObfuscatedName("ad")
public class class52 {

    @ObfuscatedName("ad.j")
    public int[] field1123;

    @ObfuscatedName("ad.h")
    public class48 field1127;

    @ObfuscatedName("ad.x")
    public int field1128 = 32;

    @ObfuscatedName("ad.q")
    public long field1129 = class121.method2693();

    @ObfuscatedName("ad.w")
    public int field1130;

    @ObfuscatedName("ad.k")
    public int field1125;

    @ObfuscatedName("ad.o")
    public int field1132;

    @ObfuscatedName("ad.f")
    public long field1140 = 0L;

    @ObfuscatedName("ad.r")
    public int field1134 = 0;

    @ObfuscatedName("ad.s")
    public int field1135 = 0;

    @ObfuscatedName("ad.g")
    public int field1136 = 0;

    @ObfuscatedName("ad.m")
    public long field1137 = 0L;

    @ObfuscatedName("ad.a")
    public boolean field1141 = true;

    @ObfuscatedName("ad.ap")
    public int field1143 = 0;

    @ObfuscatedName("ad.aa")
    public class48[] field1147 = new class48[8];

    @ObfuscatedName("ad.av")
    public class48[] field1142 = new class48[8];

    @ObfuscatedName("s.v(IZII)V")
    public static final void method175(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field2051 = arg0;
        Statics.field2022 = arg1;
        Statics.field1133 = arg2;
    }

    @ObfuscatedName("ad.ar(Lai;I)V")
    public final synchronized void method1173(class48 arg0) {
        this.field1127 = arg0;
    }

    @ObfuscatedName("ad.ak(I)V")
    public final synchronized void method1199() {
        if (this.field1123 == null) {
            return;
        }
        long var1 = class121.method2693();
        try {
            if (this.field1140 != 0L) {
                if (var1 < this.field1140) {
                    return;
                }
                this.method952(this.field1130);
                this.field1140 = 0L;
                this.field1141 = true;
            }
            int var3 = this.method953();
            if (this.field1136 - var3 > this.field1134) {
                this.field1134 = this.field1136 - var3;
            }
            int var4 = this.field1132 + this.field1125;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1130) {
                this.field1130 += 1024;
                if (this.field1130 > 16384) {
                    this.field1130 = 16384;
                }
                this.method966();
                this.method952(this.field1130);
                var3 = 0;
                this.field1141 = true;
                if (var4 + 256 > this.field1130) {
                    var4 = this.field1130 - 256;
                    this.field1132 = var4 - this.field1125;
                }
            }
            while (var3 < var4) {
                this.method1192(this.field1123, 256);
                this.method954();
                var3 += 256;
            }
            if (var1 > this.field1137) {
                if (this.field1141) {
                    this.field1141 = false;
                } else if (this.field1134 == 0 && this.field1135 == 0) {
                    this.method966();
                    this.field1140 = var1 + 2000L;
                    return;
                } else {
                    this.field1132 = Math.min(this.field1135, this.field1134);
                    this.field1135 = this.field1134;
                }
                this.field1134 = 0;
                this.field1137 = var1 + 2000L;
            }
            this.field1136 = var3;
        } catch (Exception var8) {
            this.method966();
            this.field1140 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1129 + 500000L) {
                var1 = this.field1129;
            }
            while (var1 > this.field1129 + 5000L) {
                this.method1177(256);
                this.field1129 += (long) (256000 / Statics.field2051);
            }
        } catch (Exception var7) {
            this.field1129 = var1;
        }
    }

    @ObfuscatedName("ad.ap(B)V")
    public final void method1174() {
        this.field1141 = true;
    }

    @ObfuscatedName("ad.aa(B)V")
    public final synchronized void method1175() {
        this.field1141 = true;
        try {
            this.method956();
        } catch (Exception var2) {
            this.method966();
            this.field1140 = class121.method2693() + 2000L;
        }
    }

    @ObfuscatedName("ad.av(I)V")
    public final synchronized void method1181() {
        if (Statics.field1124 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1124.field1209[var2] == this) {
                    Statics.field1124.field1209[var2] = null;
                }
                if (Statics.field1124.field1209[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1124.field1210 = true;
                while (Statics.field1124.field1211) {
                    class126.method3086(50L);
                }
                Statics.field1124 = null;
            }
        }
        this.method966();
        this.field1123 = null;
    }

    @ObfuscatedName("ad.aq(II)V")
    public final void method1177(int arg0) {
        this.field1143 -= arg0;
        if (this.field1143 < 0) {
            this.field1143 = 0;
        }
        if (this.field1127 != null) {
            this.field1127.method1031(arg0);
        }
    }

    @ObfuscatedName("ad.an([II)V")
    public final void method1192(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field2022) {
            var3 = arg1 << 1;
        }
        class128.method2651(arg0, 0, var3);
        this.field1143 -= arg1;
        if (this.field1127 != null && this.field1143 <= 0) {
            this.field1143 += Statics.field2051 >> 4;
            method2043(this.field1127);
            this.method1176(this.field1127, this.field1127.method1064());
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
                        class48 var11 = this.field1147[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class47 var12 = var11.field1101;
                                if (var12 == null || var12.field1098 <= var8) {
                                    var11.field1099 = true;
                                    int var13 = var11.method999();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1098 += var13;
                                    }
                                    if (var4 >= this.field1128) {
                                        break label105;
                                    }
                                    class48 var14 = var11.method1033();
                                    if (var14 != null) {
                                        int var15 = var11.field1100;
                                        while (var14 != null) {
                                            this.method1176(var14, var15 * var14.method1064() >> 8);
                                            var14 = var11.method1005();
                                        }
                                    }
                                    class48 var16 = var11.field1102;
                                    var11.field1102 = null;
                                    if (var10 == null) {
                                        this.field1147[var7] = var16;
                                    } else {
                                        var10.field1102 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1142[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1102;
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
                class48 var18 = this.field1147[var17];
                class48[] var19 = this.field1147;
                this.field1142[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class48 var21 = var18.field1102;
                    var18.field1102 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1143 < 0) {
            this.field1143 = 0;
        }
        if (this.field1127 != null) {
            this.field1127.method1000(arg0, 0, arg1);
        }
        this.field1129 = class121.method2693();
    }

    @ObfuscatedName("cg.al(Lai;I)V")
    public static final void method2043(class48 arg0) {
        arg0.field1099 = false;
        if (arg0.field1101 != null) {
            arg0.field1101.field1098 = 0;
        }
        for (class48 var1 = arg0.method1033(); var1 != null; var1 = arg0.method1005()) {
            method2043(var1);
        }
    }

    @ObfuscatedName("ad.ax(Lai;II)V")
    public final void method1176(class48 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class48 var4 = this.field1142[var3];
        if (var4 == null) {
            this.field1147[var3] = arg0;
        } else {
            var4.field1102 = arg0;
        }
        this.field1142[var3] = arg0;
        arg0.field1100 = arg1;
    }

    @ObfuscatedName("ad.t(Ljava/awt/Component;)V")
    public void method951(Component arg0) throws Exception {
    }

    @ObfuscatedName("ad.l(I)V")
    public void method952(int arg0) throws Exception {
    }

    @ObfuscatedName("ad.c()I")
    public int method953() throws Exception {
        return this.field1130;
    }

    @ObfuscatedName("ad.d()V")
    public void method954() throws Exception {
    }

    @ObfuscatedName("ad.b()V")
    public void method966() {
    }

    @ObfuscatedName("ad.i()V")
    public void method956() throws Exception {
    }
}
