package deob;

import java.awt.Component;

@ObfuscatedName("ax")
public class class50 {

    @ObfuscatedName("ax.m")
    public int[] field1065;

    @ObfuscatedName("ax.u")
    public class60 field1078;

    @ObfuscatedName("ax.s")
    public int field1083 = 32;

    @ObfuscatedName("ax.f")
    public long field1068 = class103.method1957();

    @ObfuscatedName("ax.p")
    public int field1069;

    @ObfuscatedName("ax.w")
    public int field1070;

    @ObfuscatedName("ax.y")
    public int field1071;

    @ObfuscatedName("ax.h")
    public long field1072 = 0L;

    @ObfuscatedName("ax.j")
    public int field1066 = 0;

    @ObfuscatedName("ax.c")
    public int field1074 = 0;

    @ObfuscatedName("ax.d")
    public int field1075 = 0;

    @ObfuscatedName("ax.a")
    public long field1076 = 0L;

    @ObfuscatedName("ax.o")
    public boolean field1080 = true;

    @ObfuscatedName("ax.av")
    public int field1079 = 0;

    @ObfuscatedName("ax.ao")
    public class60[] field1067 = new class60[8];

    @ObfuscatedName("ax.am")
    public class60[] field1062 = new class60[8];

    @ObfuscatedName("am.d(Ldr;Ljava/awt/Component;III)Lax;")
    public static final class50 method549(class123 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1077 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class63 var4 = new class63();
                var4.field1065 = new int[256 * (Statics.field1081 ? 2 : 1)];
                var4.field1070 = arg3;
                var4.method908(arg1);
                var4.field1069 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1069 > 16384) {
                    var4.field1069 = 16384;
                }
                var4.method909(var4.field1069);
                if (Statics.field1250 > 0 && Statics.field2650 == null) {
                    Statics.field2650 = new class66();
                    Statics.field2650.field1242 = arg0;
                    arg0.method2463(Statics.field2650, Statics.field1250);
                }
                if (Statics.field2650 != null) {
                    if (Statics.field2650.field1249[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2650.field1249[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class48 var6 = new class48(arg0, arg2);
                    var6.field1065 = new int[256 * (Statics.field1081 ? 2 : 1)];
                    var6.field1070 = arg3;
                    var6.method908(arg1);
                    var6.field1069 = 16384;
                    var6.method909(var6.field1069);
                    if (Statics.field1250 > 0 && Statics.field2650 == null) {
                        Statics.field2650 = new class66();
                        Statics.field2650.field1242 = arg0;
                        arg0.method2463(Statics.field2650, Statics.field1250);
                    }
                    if (Statics.field2650 != null) {
                        if (Statics.field2650.field1249[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field2650.field1249[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class50();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("ax.a(Lbl;I)V")
    public final synchronized void method968(class60 arg0) {
        this.field1078 = arg0;
    }

    @ObfuscatedName("ax.o(I)V")
    public final synchronized void method997() {
        if (this.field1065 == null) {
            return;
        }
        long var1 = class103.method1957();
        try {
            if (this.field1072 != 0L) {
                if (var1 < this.field1072) {
                    return;
                }
                this.method909(this.field1069);
                this.field1072 = 0L;
                this.field1080 = true;
            }
            int var3 = this.method910();
            if (this.field1075 - var3 > this.field1066) {
                this.field1066 = this.field1075 - var3;
            }
            int var4 = this.field1071 + this.field1070;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1069) {
                this.field1069 += 1024;
                if (this.field1069 > 16384) {
                    this.field1069 = 16384;
                }
                this.method911();
                this.method909(this.field1069);
                var3 = 0;
                this.field1080 = true;
                if (var4 + 256 > this.field1069) {
                    var4 = this.field1069 - 256;
                    this.field1071 = var4 - this.field1070;
                }
            }
            while (var3 < var4) {
                this.method978(this.field1065, 256);
                this.method921();
                var3 += 256;
            }
            if (var1 > this.field1076) {
                if (this.field1080) {
                    this.field1080 = false;
                } else if (this.field1066 == 0 && this.field1074 == 0) {
                    this.method911();
                    this.field1072 = var1 + 2000L;
                    return;
                } else {
                    this.field1071 = Math.min(this.field1074, this.field1066);
                    this.field1074 = this.field1066;
                }
                this.field1066 = 0;
                this.field1076 = var1 + 2000L;
            }
            this.field1075 = var3;
        } catch (Exception var8) {
            this.method911();
            this.field1072 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1068 + 500000L) {
                var1 = this.field1068;
            }
            while (var1 > this.field1068 + 5000L) {
                this.method973(256);
                this.field1068 += (long) (256000 / Statics.field1077);
            }
        } catch (Exception var7) {
            this.field1068 = var1;
        }
    }

    @ObfuscatedName("ax.r(I)V")
    public final void method970() {
        this.field1080 = true;
    }

    @ObfuscatedName("ax.t(S)V")
    public final synchronized void method971() {
        this.field1080 = true;
        try {
            this.method912();
        } catch (Exception var2) {
            this.method911();
            this.field1072 = class103.method1957() + 2000L;
        }
    }

    @ObfuscatedName("ax.k(I)V")
    public final synchronized void method969() {
        if (Statics.field2650 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2650.field1249[var2] == this) {
                    Statics.field2650.field1249[var2] = null;
                }
                if (Statics.field2650.field1249[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field2650.field1243 = true;
                while (Statics.field2650.field1241) {
                    class114.method2357(50L);
                }
                Statics.field2650 = null;
            }
        }
        this.method911();
        this.field1065 = null;
    }

    @ObfuscatedName("ax.n(II)V")
    public final void method973(int arg0) {
        this.field1079 -= arg0;
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1078 != null) {
            this.field1078.method936(arg0);
        }
    }

    @ObfuscatedName("ax.z([II)V")
    public final void method978(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1081) {
            var3 = arg1 << 1;
        }
        class108.method2324(arg0, 0, var3);
        this.field1079 -= arg1;
        if (this.field1078 != null && this.field1079 <= 0) {
            this.field1079 += Statics.field1077 >> 4;
            method2416(this.field1078);
            this.method975(this.field1078, this.field1078.method1089());
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
                        class60 var10 = null;
                        class60 var11 = this.field1067[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field1157;
                                if (var12 == null || var12.field1156 <= var8) {
                                    var11.field1160 = true;
                                    int var13 = var11.method933();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1156 += var13;
                                    }
                                    if (var4 >= this.field1083) {
                                        break label105;
                                    }
                                    class60 var14 = var11.method962();
                                    if (var14 != null) {
                                        int var15 = var11.field1158;
                                        while (var14 != null) {
                                            this.method975(var14, var15 * var14.method1089() >> 8);
                                            var14 = var11.method932();
                                        }
                                    }
                                    class60 var16 = var11.field1159;
                                    var11.field1159 = null;
                                    if (var10 == null) {
                                        this.field1067[var7] = var16;
                                    } else {
                                        var10.field1159 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1062[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1159;
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
                class60 var18 = this.field1067[var17];
                class60[] var19 = this.field1067;
                this.field1062[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class60 var21 = var18.field1159;
                    var18.field1159 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1079 < 0) {
            this.field1079 = 0;
        }
        if (this.field1078 != null) {
            this.field1078.method934(arg0, 0, arg1);
        }
        this.field1068 = class103.method1957();
    }

    @ObfuscatedName("db.av(Lbl;I)V")
    public static final void method2416(class60 arg0) {
        arg0.field1160 = false;
        if (arg0.field1157 != null) {
            arg0.field1157.field1156 = 0;
        }
        for (class60 var1 = arg0.method962(); var1 != null; var1 = arg0.method932()) {
            method2416(var1);
        }
    }

    @ObfuscatedName("ax.ao(Lbl;II)V")
    public final void method975(class60 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class60 var4 = this.field1062[var3];
        if (var4 == null) {
            this.field1067[var3] = arg0;
        } else {
            var4.field1159 = arg0;
        }
        this.field1062[var3] = arg0;
        arg0.field1158 = arg1;
    }

    @ObfuscatedName("ax.e(Ljava/awt/Component;)V")
    public void method908(Component arg0) throws Exception {
    }

    @ObfuscatedName("ax.v(I)V")
    public void method909(int arg0) throws Exception {
    }

    @ObfuscatedName("ax.i()I")
    public int method910() throws Exception {
        return this.field1069;
    }

    @ObfuscatedName("ax.g()V")
    public void method921() throws Exception {
    }

    @ObfuscatedName("ax.x()V")
    public void method911() {
    }

    @ObfuscatedName("ax.b()V")
    public void method912() throws Exception {
    }
}
