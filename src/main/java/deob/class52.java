package deob;

import java.awt.Component;

@ObfuscatedName("az")
public class class52 {

    @ObfuscatedName("az.o")
    public int[] field1083;

    @ObfuscatedName("az.k")
    public class62 field1085;

    @ObfuscatedName("az.p")
    public int field1095 = 32;

    @ObfuscatedName("az.u")
    public long field1094 = class107.method2434();

    @ObfuscatedName("az.g")
    public int field1082;

    @ObfuscatedName("az.a")
    public int field1088;

    @ObfuscatedName("az.y")
    public int field1089;

    @ObfuscatedName("az.d")
    public long field1090 = 0L;

    @ObfuscatedName("az.b")
    public int field1091 = 0;

    @ObfuscatedName("az.j")
    public int field1092 = 0;

    @ObfuscatedName("az.f")
    public int field1093 = 0;

    @ObfuscatedName("az.w")
    public long field1097 = 0L;

    @ObfuscatedName("az.z")
    public boolean field1086 = true;

    @ObfuscatedName("az.an")
    public int field1087 = 0;

    @ObfuscatedName("az.ad")
    public class62[] field1098 = new class62[8];

    @ObfuscatedName("az.ai")
    public class62[] field1099 = new class62[8];

    @ObfuscatedName("at.i(IZII)V")
    public static final void method916(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field3011 = arg0;
        Statics.field1081 = arg1;
        Statics.field2596 = arg2;
    }

    @ObfuscatedName("v.c(Ldf;Ljava/awt/Component;III)Laz;")
    public static final class52 method509(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field3011 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1083 = new int[(Statics.field1081 ? 2 : 1) * 256];
                var4.field1088 = arg3;
                var4.method942(arg1);
                var4.field1082 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1082 > 16384) {
                    var4.field1082 = 16384;
                }
                var4.method959(var4.field1082);
                if (Statics.field2596 > 0 && Statics.field1084 == null) {
                    Statics.field1084 = new class68();
                    Statics.field1084.field1251 = arg0;
                    arg0.method2501(Statics.field1084, Statics.field2596);
                }
                if (Statics.field1084 != null) {
                    if (Statics.field1084.field1249[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1084.field1249[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1083 = new int[(Statics.field1081 ? 2 : 1) * 256];
                    var6.field1088 = arg3;
                    var6.method942(arg1);
                    var6.field1082 = 16384;
                    var6.method959(var6.field1082);
                    if (Statics.field2596 > 0 && Statics.field1084 == null) {
                        Statics.field1084 = new class68();
                        Statics.field1084.field1251 = arg0;
                        arg0.method2501(Statics.field1084, Statics.field2596);
                    }
                    if (Statics.field1084 != null) {
                        if (Statics.field1084.field1249[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field1084.field1249[arg2] = var6;
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

    @ObfuscatedName("az.r(Lba;I)V")
    public final synchronized void method1002(class62 arg0) {
        this.field1085 = arg0;
    }

    @ObfuscatedName("az.an(B)V")
    public final synchronized void method1009() {
        if (this.field1083 == null) {
            return;
        }
        long var1 = class107.method2434();
        try {
            if (this.field1090 != 0L) {
                if (var1 < this.field1090) {
                    return;
                }
                this.method959(this.field1082);
                this.field1090 = 0L;
                this.field1086 = true;
            }
            int var3 = this.method944();
            if (this.field1093 - var3 > this.field1091) {
                this.field1091 = this.field1093 - var3;
            }
            int var4 = this.field1089 + this.field1088;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1082) {
                this.field1082 += 1024;
                if (this.field1082 > 16384) {
                    this.field1082 = 16384;
                }
                this.method960();
                this.method959(this.field1082);
                var3 = 0;
                this.field1086 = true;
                if (var4 + 256 > this.field1082) {
                    var4 = this.field1082 - 256;
                    this.field1089 = var4 - this.field1088;
                }
            }
            while (var3 < var4) {
                this.method1008(this.field1083, 256);
                this.method945();
                var3 += 256;
            }
            if (var1 > this.field1097) {
                if (this.field1086) {
                    this.field1086 = false;
                } else if (this.field1091 == 0 && this.field1092 == 0) {
                    this.method960();
                    this.field1090 = var1 + 2000L;
                    return;
                } else {
                    this.field1089 = Math.min(this.field1092, this.field1091);
                    this.field1092 = this.field1091;
                }
                this.field1091 = 0;
                this.field1097 = var1 + 2000L;
            }
            this.field1093 = var3;
        } catch (Exception var8) {
            this.method960();
            this.field1090 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1094 + 500000L) {
                var1 = this.field1094;
            }
            while (var1 > this.field1094 + 5000L) {
                this.method1007(256);
                this.field1094 += (long) (256000 / Statics.field3011);
            }
        } catch (Exception var7) {
            this.field1094 = var1;
        }
    }

    @ObfuscatedName("az.ad(B)V")
    public final void method1004() {
        this.field1086 = true;
    }

    @ObfuscatedName("az.ai(I)V")
    public final synchronized void method1005() {
        this.field1086 = true;
        try {
            this.method946();
        } catch (Exception var2) {
            this.method960();
            this.field1090 = class107.method2434() + 2000L;
        }
    }

    @ObfuscatedName("az.ae(I)V")
    public final synchronized void method1006() {
        if (Statics.field1084 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field1084.field1249[var2] == this) {
                    Statics.field1084.field1249[var2] = null;
                }
                if (Statics.field1084.field1249[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field1084.field1255 = true;
                while (Statics.field1084.field1250) {
                    class119.method587(50L);
                }
                Statics.field1084 = null;
            }
        }
        this.method960();
        this.field1083 = null;
    }

    @ObfuscatedName("az.aq(IB)V")
    public final void method1007(int arg0) {
        this.field1087 -= arg0;
        if (this.field1087 < 0) {
            this.field1087 = 0;
        }
        if (this.field1085 != null) {
            this.field1085.method975(arg0);
        }
    }

    @ObfuscatedName("az.av([II)V")
    public final void method1008(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1081) {
            var3 = arg1 << 1;
        }
        class112.method2349(arg0, 0, var3);
        this.field1087 -= arg1;
        if (this.field1085 != null && this.field1087 <= 0) {
            this.field1087 += Statics.field3011 >> 4;
            method34(this.field1085);
            this.method1001(this.field1085, this.field1085.method1104());
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
                        class62 var11 = this.field1098[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1166;
                                if (var12 == null || var12.field1163 <= var8) {
                                    var11.field1165 = true;
                                    int var13 = var11.method997();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1163 += var13;
                                    }
                                    if (var4 >= this.field1095) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method984();
                                    if (var14 != null) {
                                        int var15 = var11.field1164;
                                        while (var14 != null) {
                                            this.method1001(var14, var15 * var14.method1104() >> 8);
                                            var14 = var11.method971();
                                        }
                                    }
                                    class62 var16 = var11.field1167;
                                    var11.field1167 = null;
                                    if (var10 == null) {
                                        this.field1098[var7] = var16;
                                    } else {
                                        var10.field1167 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1099[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1167;
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
                class62 var18 = this.field1098[var17];
                class62[] var19 = this.field1098;
                this.field1099[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1167;
                    var18.field1167 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1087 < 0) {
            this.field1087 = 0;
        }
        if (this.field1085 != null) {
            this.field1085.method973(arg0, 0, arg1);
        }
        this.field1094 = class107.method2434();
    }

    @ObfuscatedName("n.am(Lba;B)V")
    public static final void method34(class62 arg0) {
        arg0.field1165 = false;
        if (arg0.field1166 != null) {
            arg0.field1166.field1163 = 0;
        }
        for (class62 var1 = arg0.method984(); var1 != null; var1 = arg0.method971()) {
            method34(var1);
        }
    }

    @ObfuscatedName("az.ac(Lba;II)V")
    public final void method1001(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1099[var3];
        if (var4 == null) {
            this.field1098[var3] = arg0;
        } else {
            var4.field1167 = arg0;
        }
        this.field1099[var3] = arg0;
        arg0.field1164 = arg1;
    }

    @ObfuscatedName("az.q(Ljava/awt/Component;)V")
    public void method942(Component arg0) throws Exception {
    }

    @ObfuscatedName("az.s(I)V")
    public void method959(int arg0) throws Exception {
    }

    @ObfuscatedName("az.h()I")
    public int method944() throws Exception {
        return this.field1082;
    }

    @ObfuscatedName("az.e()V")
    public void method945() throws Exception {
    }

    @ObfuscatedName("az.n()V")
    public void method960() {
    }

    @ObfuscatedName("az.t()V")
    public void method946() throws Exception {
    }
}
