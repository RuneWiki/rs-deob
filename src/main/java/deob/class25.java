package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("y")
public class class25 {

    @ObfuscatedName("y.k")
    public int[] field183;

    @ObfuscatedName("y.a")
    public class31 field184;

    @ObfuscatedName("y.q")
    public int field195 = 32;

    @ObfuscatedName("y.u")
    public long field186 = class382.method2013();

    @ObfuscatedName("y.e")
    public int field187;

    @ObfuscatedName("y.c")
    public int field181;

    @ObfuscatedName("y.i")
    public int field189;

    @ObfuscatedName("y.m")
    public long field200 = 0L;

    @ObfuscatedName("y.b")
    public int field191 = 0;

    @ObfuscatedName("y.z")
    public int field188 = 0;

    @ObfuscatedName("y.d")
    public int field193 = 0;

    @ObfuscatedName("y.y")
    public long field194 = 0L;

    @ObfuscatedName("y.g")
    public boolean field198 = true;

    @ObfuscatedName("y.aa")
    public int field196 = 0;

    @ObfuscatedName("y.ab")
    public class31[] field197 = new class31[8];

    @ObfuscatedName("y.ax")
    public class31[] field190 = new class31[8];

    @ObfuscatedName("ag.m(Lab;I)V")
    public static final void method1339(class33 arg0) {
        Statics.field2087 = arg0;
    }

    @ObfuscatedName("ek.z(Ldz;III)Ly;")
    public static final class25 method2339(class130 arg0, int arg1, int arg2) {
        if (Statics.field3634 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class25 var3 = Statics.field2087.method106();
                var3.field183 = new int[256 * (Statics.field199 ? 2 : 1)];
                var3.field181 = arg2;
                var3.method131();
                var3.field187 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field187 > 16384) {
                    var3.field187 = 16384;
                }
                var3.method140(var3.field187);
                if (Statics.field182 > 0 && Statics.field2518 == null) {
                    Statics.field2518 = new class27();
                    Statics.field3903 = Executors.newScheduledThreadPool(1);
                    Statics.field3903.scheduleAtFixedRate(Statics.field2518, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2518 != null) {
                    if (Statics.field2518.field219[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2518.field219[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class25();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("y.d(Laq;B)V")
    public final synchronized void method456(class31 arg0) {
        this.field184 = arg0;
    }

    @ObfuscatedName("y.y(I)V")
    public final synchronized void method447() {
        if (this.field183 == null) {
            return;
        }
        long var1 = class382.method2013();
        try {
            if (this.field200 != 0L) {
                if (var1 < this.field200) {
                    return;
                }
                this.method140(this.field187);
                this.field200 = 0L;
                this.field198 = true;
            }
            int var3 = this.method125();
            if (this.field193 - var3 > this.field191) {
                this.field191 = this.field193 - var3;
            }
            int var4 = this.field189 + this.field181;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field187) {
                this.field187 += 1024;
                if (this.field187 > 16384) {
                    this.field187 = 16384;
                }
                this.method127();
                this.method140(this.field187);
                var3 = 0;
                this.field198 = true;
                if (var4 + 256 > this.field187) {
                    var4 = this.field187 - 256;
                    this.field189 = var4 - this.field181;
                }
            }
            while (var3 < var4) {
                this.method452(this.field183, 256);
                this.method126();
                var3 += 256;
            }
            if (var1 > this.field194) {
                if (this.field198) {
                    this.field198 = false;
                } else if (this.field191 == 0 && this.field188 == 0) {
                    this.method127();
                    this.field200 = var1 + 2000L;
                    return;
                } else {
                    this.field189 = Math.min(this.field188, this.field191);
                    this.field188 = this.field191;
                }
                this.field191 = 0;
                this.field194 = var1 + 2000L;
            }
            this.field193 = var3;
        } catch (Exception var8) {
            this.method127();
            this.field200 = var1 + 2000L;
        }
        try {
            if (var1 > this.field186 + 500000L) {
                var1 = this.field186;
            }
            while (var1 > this.field186 + 5000L) {
                this.method451(256);
                this.field186 += (long) (256000 / Statics.field3634);
            }
        } catch (Exception var7) {
            this.field186 = var1;
        }
    }

    @ObfuscatedName("y.g(I)V")
    public final void method462() {
        this.field198 = true;
    }

    @ObfuscatedName("y.ae(B)V")
    public final synchronized void method449() {
        this.field198 = true;
        try {
            this.method128();
        } catch (Exception var2) {
            this.method127();
            this.field200 = class382.method2013() + 2000L;
        }
    }

    @ObfuscatedName("y.an(I)V")
    public final synchronized void method450() {
        if (Statics.field2518 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field2518.field219[var2] == this) {
                    Statics.field2518.field219[var2] = null;
                }
                if (Statics.field2518.field219[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field3903.shutdownNow();
                Statics.field3903 = null;
                Statics.field2518 = null;
            }
        }
        this.method127();
        this.field183 = null;
    }

    @ObfuscatedName("y.am(II)V")
    public final void method451(int arg0) {
        this.field196 -= arg0;
        if (this.field196 < 0) {
            this.field196 = 0;
        }
        if (this.field184 != null) {
            this.field184.method378(arg0);
        }
    }

    @ObfuscatedName("y.al([II)V")
    public final void method452(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field199) {
            var3 = arg1 << 1;
        }
        class309.method5060(arg0, 0, var3);
        this.field196 -= arg1;
        if (this.field184 != null && this.field196 <= 0) {
            this.field196 += Statics.field3634 >> 4;
            method117(this.field184);
            this.method445(this.field184, this.field184.method638());
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
                        class31 var10 = null;
                        class31 var11 = this.field197[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class41 var12 = var11.field253;
                                if (var12 == null || var12.field350 <= var8) {
                                    var11.field251 = true;
                                    int var13 = var11.method375();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field350 += var13;
                                    }
                                    if (var4 >= this.field195) {
                                        break label105;
                                    }
                                    class31 var14 = var11.method373();
                                    if (var14 != null) {
                                        int var15 = var11.field254;
                                        while (var14 != null) {
                                            this.method445(var14, var15 * var14.method638() >> 8);
                                            var14 = var11.method396();
                                        }
                                    }
                                    class31 var16 = var11.field252;
                                    var11.field252 = null;
                                    if (var10 == null) {
                                        this.field197[var7] = var16;
                                    } else {
                                        var10.field252 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field190[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field252;
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
                class31 var18 = this.field197[var17];
                class31[] var19 = this.field197;
                this.field190[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class31 var21 = var18.field252;
                    var18.field252 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field196 < 0) {
            this.field196 = 0;
        }
        if (this.field184 != null) {
            this.field184.method376(arg0, 0, arg1);
        }
        this.field186 = class382.method2013();
    }

    @ObfuscatedName("h.aq(Laq;S)V")
    public static final void method117(class31 arg0) {
        arg0.field251 = false;
        if (arg0.field253 != null) {
            arg0.field253.field350 = 0;
        }
        for (class31 var1 = arg0.method373(); var1 != null; var1 = arg0.method396()) {
            method117(var1);
        }
    }

    @ObfuscatedName("y.aa(Laq;II)V")
    public final void method445(class31 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class31 var4 = this.field190[var3];
        if (var4 == null) {
            this.field197[var3] = arg0;
        } else {
            var4.field252 = arg0;
        }
        this.field190[var3] = arg0;
        arg0.field254 = arg1;
    }

    @ObfuscatedName("y.s(I)V")
    public void method131() throws Exception {
    }

    @ObfuscatedName("y.t(IB)V")
    public void method140(int arg0) throws Exception {
    }

    @ObfuscatedName("y.v(B)I")
    public int method125() throws Exception {
        return this.field187;
    }

    @ObfuscatedName("y.j()V")
    public void method126() throws Exception {
    }

    @ObfuscatedName("y.l(I)V")
    public void method127() {
    }

    @ObfuscatedName("y.n(I)V")
    public void method128() throws Exception {
    }
}
