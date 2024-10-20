package deob;

import java.awt.Component;

@ObfuscatedName("ae")
public class class52 {

    @ObfuscatedName("ae.f")
    public int[] field1104;

    @ObfuscatedName("ae.s")
    public class62 field1110;

    @ObfuscatedName("ae.m")
    public int field1106 = 32;

    @ObfuscatedName("ae.y")
    public long field1107 = class107.method2784();

    @ObfuscatedName("ae.b")
    public int field1108;

    @ObfuscatedName("ae.v")
    public int field1109;

    @ObfuscatedName("ae.z")
    public int field1101;

    @ObfuscatedName("ae.u")
    public long field1120 = 0L;

    @ObfuscatedName("ae.g")
    public int field1111 = 0;

    @ObfuscatedName("ae.k")
    public int field1113 = 0;

    @ObfuscatedName("ae.o")
    public int field1114 = 0;

    @ObfuscatedName("ae.a")
    public long field1115 = 0L;

    @ObfuscatedName("ae.p")
    public boolean field1116 = true;

    @ObfuscatedName("ae.at")
    public int field1126 = 0;

    @ObfuscatedName("ae.av")
    public class62[] field1119 = new class62[8];

    @ObfuscatedName("ae.ar")
    public class62[] field1105 = new class62[8];

    @ObfuscatedName("i.r(Lds;Ljava/awt/Component;III)Lae;")
    public static final class52 method25(class128 arg0, Component arg1, int arg2, int arg3) {
        if (Statics.field1118 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class65 var4 = new class65();
                var4.field1104 = new int[256 * (Statics.field1103 ? 2 : 1)];
                var4.field1109 = arg3;
                var4.method998(arg1);
                var4.field1108 = (arg3 & 0xFFFFFC00) + 1024;
                if (var4.field1108 > 16384) {
                    var4.field1108 = 16384;
                }
                var4.method976(var4.field1108);
                if (Statics.field1282 > 0 && Statics.field643 == null) {
                    Statics.field643 = new class68();
                    Statics.field643.field1286 = arg0;
                    arg0.method2523(Statics.field643, Statics.field1282);
                }
                if (Statics.field643 != null) {
                    if (Statics.field643.field1278[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field643.field1278[arg2] = var4;
                }
                return var4;
            } catch (Throwable var9) {
                try {
                    class50 var6 = new class50(arg0, arg2);
                    var6.field1104 = new int[(Statics.field1103 ? 2 : 1) * 256];
                    var6.field1109 = arg3;
                    var6.method998(arg1);
                    var6.field1108 = 16384;
                    var6.method976(var6.field1108);
                    if (Statics.field1282 > 0 && Statics.field643 == null) {
                        Statics.field643 = new class68();
                        Statics.field643.field1286 = arg0;
                        arg0.method2523(Statics.field643, Statics.field1282);
                    }
                    if (Statics.field643 != null) {
                        if (Statics.field643.field1278[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        Statics.field643.field1278[arg2] = var6;
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

    @ObfuscatedName("ae.at(Lba;I)V")
    public final synchronized void method1036(class62 arg0) {
        this.field1110 = arg0;
    }

    @ObfuscatedName("ae.av(I)V")
    public final synchronized void method1037() {
        if (this.field1104 == null) {
            return;
        }
        long var1 = class107.method2784();
        try {
            if (this.field1120 != 0L) {
                if (var1 < this.field1120) {
                    return;
                }
                this.method976(this.field1108);
                this.field1120 = 0L;
                this.field1116 = true;
            }
            int var3 = this.method977();
            if (this.field1114 - var3 > this.field1111) {
                this.field1111 = this.field1114 - var3;
            }
            int var4 = this.field1109 + this.field1101;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field1108) {
                this.field1108 += 1024;
                if (this.field1108 > 16384) {
                    this.field1108 = 16384;
                }
                this.method979();
                this.method976(this.field1108);
                var3 = 0;
                this.field1116 = true;
                if (var4 + 256 > this.field1108) {
                    var4 = this.field1108 - 256;
                    this.field1101 = var4 - this.field1109;
                }
            }
            while (var3 < var4) {
                this.method1059(this.field1104, 256);
                this.method978();
                var3 += 256;
            }
            if (var1 > this.field1115) {
                if (this.field1116) {
                    this.field1116 = false;
                } else if (this.field1111 == 0 && this.field1113 == 0) {
                    this.method979();
                    this.field1120 = var1 + 2000L;
                    return;
                } else {
                    this.field1101 = Math.min(this.field1113, this.field1111);
                    this.field1113 = this.field1111;
                }
                this.field1111 = 0;
                this.field1115 = var1 + 2000L;
            }
            this.field1114 = var3;
        } catch (Exception var8) {
            this.method979();
            this.field1120 = var1 + 2000L;
        }
        try {
            if (var1 > this.field1107 + 500000L) {
                var1 = this.field1107;
            }
            while (var1 > this.field1107 + 5000L) {
                this.method1039(256);
                this.field1107 += (long) (256000 / Statics.field1118);
            }
        } catch (Exception var7) {
            this.field1107 = var1;
        }
    }

    @ObfuscatedName("ae.ar(B)V")
    public final void method1043() {
        this.field1116 = true;
    }

    @ObfuscatedName("ae.aq(B)V")
    public final synchronized void method1045() {
        this.field1116 = true;
        try {
            this.method980();
        } catch (Exception var2) {
            this.method979();
            this.field1120 = class107.method2784() + 2000L;
        }
    }

    @ObfuscatedName("ae.as(I)V")
    public final synchronized void method1046() {
        if (Statics.field643 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field643.field1278[var2] == this) {
                    Statics.field643.field1278[var2] = null;
                }
                if (Statics.field643.field1278[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field643.field1279 = true;
                while (Statics.field643.field1281) {
                    Statics.method849(50L);
                }
                Statics.field643 = null;
            }
        }
        this.method979();
        this.field1104 = null;
    }

    @ObfuscatedName("ae.ad(II)V")
    public final void method1039(int arg0) {
        this.field1126 -= arg0;
        if (this.field1126 < 0) {
            this.field1126 = 0;
        }
        if (this.field1110 != null) {
            this.field1110.method1010(arg0);
        }
    }

    @ObfuscatedName("ae.ap([II)V")
    public final void method1059(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field1103) {
            var3 = arg1 << 1;
        }
        class112.method2371(arg0, 0, var3);
        this.field1126 -= arg1;
        if (this.field1110 != null && this.field1126 <= 0) {
            this.field1126 += Statics.field1118 >> 4;
            method569(this.field1110);
            this.method1061(this.field1110, this.field1110.method1137());
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
                        class62 var11 = this.field1119[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class61 var12 = var11.field1196;
                                if (var12 == null || var12.field1193 <= var8) {
                                    var11.field1194 = true;
                                    int var13 = var11.method1007();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1193 += var13;
                                    }
                                    if (var4 >= this.field1106) {
                                        break label105;
                                    }
                                    class62 var14 = var11.method1005();
                                    if (var14 != null) {
                                        int var15 = var11.field1195;
                                        while (var14 != null) {
                                            this.method1061(var14, var15 * var14.method1137() >> 8);
                                            var14 = var11.method1006();
                                        }
                                    }
                                    class62 var16 = var11.field1197;
                                    var11.field1197 = null;
                                    if (var10 == null) {
                                        this.field1119[var7] = var16;
                                    } else {
                                        var10.field1197 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1105[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1197;
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
                class62 var18 = this.field1119[var17];
                class62[] var19 = this.field1119;
                this.field1105[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class62 var21 = var18.field1197;
                    var18.field1197 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field1126 < 0) {
            this.field1126 = 0;
        }
        if (this.field1110 != null) {
            this.field1110.method1008(arg0, 0, arg1);
        }
        this.field1107 = class107.method2784();
    }

    @ObfuscatedName("ar.an(Lba;I)V")
    public static final void method569(class62 arg0) {
        arg0.field1194 = false;
        if (arg0.field1196 != null) {
            arg0.field1196.field1193 = 0;
        }
        for (class62 var1 = arg0.method1005(); var1 != null; var1 = arg0.method1006()) {
            method569(var1);
        }
    }

    @ObfuscatedName("ae.au(Lba;IB)V")
    public final void method1061(class62 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class62 var4 = this.field1105[var3];
        if (var4 == null) {
            this.field1119[var3] = arg0;
        } else {
            var4.field1197 = arg0;
        }
        this.field1105[var3] = arg0;
        arg0.field1195 = arg1;
    }

    @ObfuscatedName("ae.n(Ljava/awt/Component;)V")
    public void method998(Component arg0) throws Exception {
    }

    @ObfuscatedName("ae.w(I)V")
    public void method976(int arg0) throws Exception {
    }

    @ObfuscatedName("ae.i()I")
    public int method977() throws Exception {
        return this.field1108;
    }

    @ObfuscatedName("ae.e()V")
    public void method978() throws Exception {
    }

    @ObfuscatedName("ae.h()V")
    public void method979() {
    }

    @ObfuscatedName("ae.q()V")
    public void method980() throws Exception {
    }
}
