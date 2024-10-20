package deob;

import java.awt.Component;

@ObfuscatedName("bf")
public class class58 {

    @ObfuscatedName("bf.g")
    public int[] field1048;

    @ObfuscatedName("bf.s")
    public class69 field1052;

    @ObfuscatedName("bf.r")
    public int field1053 = 32;

    @ObfuscatedName("bf.t")
    public long field1049 = class156.method81();

    @ObfuscatedName("bf.k")
    public int field1055;

    @ObfuscatedName("bf.f")
    public int field1056;

    @ObfuscatedName("bf.a")
    public int field1046;

    @ObfuscatedName("bf.v")
    public long field1058 = 0L;

    @ObfuscatedName("bf.d")
    public int field1051 = 0;

    @ObfuscatedName("bf.o")
    public int field1061 = 0;

    @ObfuscatedName("bf.q")
    public int field1057 = 0;

    @ObfuscatedName("bf.i")
    public long field1062 = 0L;

    @ObfuscatedName("bf.x")
    public boolean field1063 = true;

    @ObfuscatedName("bf.m")
    public int field1066 = 0;

    @ObfuscatedName("bf.p")
    public class69[] field1067 = new class69[8];

    @ObfuscatedName("bf.aq")
    public class69[] field1068 = new class69[8];

    @ObfuscatedName("cu.b(Lcj;Ljava/awt/Component;IIB)Lbf;")
    public static final class58 method1863(class104 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1072 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class60 var4 = new class60();
                var4.field1048 = new int[(Statics.field1047 ? 2 : 1) * 256];
                var4.field1056 = arg3;
                var4.method1037(arg1);
                var4.field1055 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1055 > 16384) {
                    var4.field1055 = 16384;
                }
                var4.method1046(var4.field1055);
                if (Statics.field1059 > 0 && Statics.field761 == null) {
                    Statics.field761 = new class64();
                    Statics.field761.field1098 = arg0;
                    arg0.method1905(Statics.field761, Statics.field1059);
                }
                if (Statics.field761 != null) {
                    if (Statics.field761.field1102[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field761.field1102[arg2] = var4;
                }
                return var4;
            } catch (Throwable var6) {
                return new class58();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bf.e(Lbm;I)V")
    public final synchronized void method1045(class69 arg0) {
        this.field1052 = arg0;
    }

    @ObfuscatedName("bf.c(I)V")
    public final synchronized void method1038() {
        if (this.field1048 == null) {
            return;
        }
        long var1 = class156.method81();
        try {
            if (this.field1058 != 0L) {
                if (var1 < this.field1058) {
                    return;
                }
                this.method1046(this.field1055);
                this.field1058 = 0L;
                this.field1063 = true;
            }
            int var3 = this.method1047();
            if (this.field1057 - var3 > this.field1051) {
                this.field1051 = this.field1057 - var3;
            }
            int var4 = this.field1056 + this.field1046;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1055) {
                this.field1055 += 1024;
                if (this.field1055 > 16384) {
                    this.field1055 = 16384;
                }
                this.method1056();
                this.method1046(this.field1055);
                var3 = 0;
                this.field1063 = true;
                if (var4 + 256 > this.field1055) {
                    var4 = this.field1055 - 256;
                    this.field1046 = var4 - this.field1056;
                }
            }
            while (var3 < var4) {
                this.method1041(this.field1048, 256);
                this.method1048();
                var3 += 256;
            }
            if (var1 > this.field1062) {
                if (this.field1063) {
                    this.field1063 = false;
                } else if (this.field1051 == 0 && this.field1061 == 0) {
                    this.method1056();
                    this.field1058 = var1 + 2000L;
                    return;
                } else {
                    this.field1046 = Math.min(this.field1061, this.field1051);
                    this.field1061 = this.field1051;
                }
                this.field1051 = 0;
                this.field1062 = var1 + 2000L;
            }
            this.field1057 = var3;
        } catch (Exception var8) {
            this.method1056();
            this.field1058 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1049 + 500000L) {
                var1 = this.field1049;
            }
            while (var1 > this.field1049 + 5000L) {
                this.method1042(256);
                this.field1049 += (long) (256000 / Statics.field1072);
            }
        } catch (Exception var7) {
            this.field1049 = var1;
        }
    }

    @ObfuscatedName("bf.l(I)V")
    public final void method1058() {
        this.field1063 = true;
    }

    @ObfuscatedName("bf.y(I)V")
    public final synchronized void method1040() {
        this.field1063 = true;
        try {
            this.method1050();
        } catch (Exception var2) {
            this.method1056();
            this.field1058 = class156.method81() + 2000L;
        }
    }

    @ObfuscatedName("bf.j(I)V")
    public final synchronized void method1096() {
        if (Statics.field761 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field761.field1102[var2] == this) {
                    Statics.field761.field1102[var2] = null;
                }
                if (Statics.field761.field1102[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field761.field1099 = true;
                while (Statics.field761.field1103) {
                    class162.method2120(50L);
                }
                Statics.field761 = null;
            }
        }
        this.method1056();
        this.field1048 = null;
    }

    @ObfuscatedName("bf.t(IB)V")
    public final void method1042(int arg0) {
        this.field1066 -= arg0;
        if (this.field1066 < 0) {
            this.field1066 = 0;
        }
        if (this.field1052 != null) {
            this.field1052.method950(arg0);
        }
    }

    @ObfuscatedName("bf.k([II)V")
    public final void method1041(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1047) {
            var3 = arg1 << 1;
        }
        class164.method2961(arg0, 0, var3);
        this.field1066 -= arg1;
        if (this.field1052 != null && this.field1066 <= 0) {
            this.field1066 += Statics.field1072 >> 4;
            method2945(this.field1052);
            this.method1044(this.field1052, this.field1052.method1210());
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
                        class69 var10 = null;
                        class69 var11 = this.field1067[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class72 var12 = var11.field1153;
                                if (var12 == null || var12.field1186 <= var8) {
                                    var11.field1155 = true;
                                    int var13 = var11.method927();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1186 += var13;
                                    }
                                    if (var4 >= this.field1053) {
                                        break label105;
                                    }
                                    class69 var14 = var11.method944();
                                    if (var14 != null) {
                                        int var15 = var11.field1152;
                                        while (var14 != null) {
                                            this.method1044(var14, var15 * var14.method1210() >> 8);
                                            var14 = var11.method926();
                                        }
                                    }
                                    class69 var16 = var11.field1154;
                                    var11.field1154 = null;
                                    if (var10 == null) {
                                        this.field1067[var7] = var16;
                                    } else {
                                        var10.field1154 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1068[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1154;
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
                class69 var18 = this.field1067[var17];
                class69[] var19 = this.field1067;
                this.field1068[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class69 var21 = var18.field1154;
                    var18.field1154 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1066 < 0) {
            this.field1066 = 0;
        }
        if (this.field1052 != null) {
            this.field1052.method942(arg0, 0, arg1);
        }
        this.field1049 = class156.method81();
    }

    @ObfuscatedName("fg.f(Lbm;I)V")
    public static final void method2945(class69 arg0) {
        arg0.field1155 = false;
        if (arg0.field1153 != null) {
            arg0.field1153.field1186 = 0;
        }
        for (class69 var1 = arg0.method944(); var1 != null; var1 = arg0.method926()) {
            method2945(var1);
        }
    }

    @ObfuscatedName("bf.a(Lbm;II)V")
    public final void method1044(class69 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class69 var4 = this.field1068[var3];
        if (var4 == null) {
            this.field1067[var3] = arg0;
        } else {
            var4.field1154 = arg0;
        }
        this.field1068[var3] = arg0;
        arg0.field1152 = arg1;
    }

    @ObfuscatedName("bf.v(Ljava/awt/Component;I)V")
    public void method1037(Component arg0) throws Exception {
    }

    @ObfuscatedName("bf.d(II)V")
    public void method1046(int arg0) throws Exception {
    }

    @ObfuscatedName("bf.o(I)I")
    public int method1047() throws Exception {
        return this.field1055;
    }

    @ObfuscatedName("bf.q()V")
    public void method1048() throws Exception {
    }

    @ObfuscatedName("bf.i(I)V")
    public void method1056() {
    }

    @ObfuscatedName("bf.x(I)V")
    public void method1050() throws Exception {
    }
}
