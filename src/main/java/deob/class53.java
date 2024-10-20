package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bh")
public class class53 {

    @ObfuscatedName("bh.c")
    public int[] field408;

    @ObfuscatedName("bh.j")
    public class59 field392;

    @ObfuscatedName("bh.r")
    public int field387 = 32;

    @ObfuscatedName("bh.q")
    public long field393 = class379.method1540();

    @ObfuscatedName("bh.t")
    public int field406;

    @ObfuscatedName("bh.v")
    public int field396;

    @ObfuscatedName("bh.x")
    public int field397;

    @ObfuscatedName("bh.z")
    public long field398 = 0L;

    @ObfuscatedName("bh.i")
    public int field403 = 0;

    @ObfuscatedName("bh.a")
    public int field400 = 0;

    @ObfuscatedName("bh.w")
    public int field401 = 0;

    @ObfuscatedName("bh.s")
    public long field399 = 0L;

    @ObfuscatedName("bh.y")
    public boolean field391 = true;

    @ObfuscatedName("bh.at")
    public int field404 = 0;

    @ObfuscatedName("bh.aj")
    public class59[] field402 = new class59[8];

    @ObfuscatedName("bh.aw")
    public class59[] field394 = new class59[8];

    @ObfuscatedName("p.i(Ldt;III)Lbh;")
    public static final class53 method48(class128 arg0, int arg1, int arg2) {
        if (Statics.field395 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class53 var3 = Statics.field3756.method295();
                var3.field408 = new int[(Statics.field388 ? 2 : 1) * 256];
                var3.field396 = arg2;
                var3.method324();
                var3.field406 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field406 > 16384) {
                    var3.field406 = 16384;
                }
                var3.method309(var3.field406);
                if (Statics.field2008 > 0 && Statics.field6 == null) {
                    Statics.field6 = new class55();
                    Statics.field236 = Executors.newScheduledThreadPool(1);
                    Statics.field236.scheduleAtFixedRate(Statics.field6, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field6 != null) {
                    if (Statics.field6.field421[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field6.field421[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class53();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bh.a(Lbt;I)V")
    public final synchronized void method645(class59 arg0) {
        this.field392 = arg0;
    }

    @ObfuscatedName("bh.w(I)V")
    public final synchronized void method630() {
        if (this.field408 == null) {
            return;
        }
        long var1 = class379.method1540();
        try {
            if (this.field398 != 0L) {
                if (var1 < this.field398) {
                    return;
                }
                this.method309(this.field406);
                this.field398 = 0L;
                this.field391 = true;
            }
            int var3 = this.method310();
            if (this.field401 - var3 > this.field403) {
                this.field403 = this.field401 - var3;
            }
            int var4 = this.field397 + this.field396;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field406) {
                this.field406 += 1024;
                if (this.field406 > 16384) {
                    this.field406 = 16384;
                }
                this.method312();
                this.method309(this.field406);
                var3 = 0;
                this.field391 = true;
                if (var4 + 256 > this.field406) {
                    var4 = this.field406 - 256;
                    this.field397 = var4 - this.field396;
                }
            }
            while (var3 < var4) {
                this.method635(this.field408, 256);
                this.method311();
                var3 += 256;
            }
            if (var1 > this.field399) {
                if (this.field391) {
                    this.field391 = false;
                } else if (this.field403 == 0 && this.field400 == 0) {
                    this.method312();
                    this.field398 = var1 + 2000L;
                    return;
                } else {
                    this.field397 = Math.min(this.field400, this.field403);
                    this.field400 = this.field403;
                }
                this.field403 = 0;
                this.field399 = var1 + 2000L;
            }
            this.field401 = var3;
        } catch (Exception var8) {
            this.method312();
            this.field398 = var1 + 2000L;
        }
        try {
            if (var1 > this.field393 + 500000L) {
                var1 = this.field393;
            }
            while (var1 > this.field393 + 5000L) {
                this.method628(256);
                this.field393 += (long) (256000 / Statics.field395);
            }
        } catch (Exception var7) {
            this.field393 = var1;
        }
    }

    @ObfuscatedName("bh.s(I)V")
    public final void method631() {
        this.field391 = true;
    }

    @ObfuscatedName("bh.y(B)V")
    public final synchronized void method651() {
        this.field391 = true;
        try {
            this.method313();
        } catch (Exception var2) {
            this.method312();
            this.field398 = class379.method1540() + 2000L;
        }
    }

    @ObfuscatedName("bh.ac(I)V")
    public final synchronized void method633() {
        if (Statics.field6 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field6.field421[var2] == this) {
                    Statics.field6.field421[var2] = null;
                }
                if (Statics.field6.field421[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field236.shutdownNow();
                Statics.field236 = null;
                Statics.field6 = null;
            }
        }
        this.method312();
        this.field408 = null;
    }

    @ObfuscatedName("bh.ay(II)V")
    public final void method628(int arg0) {
        this.field404 -= arg0;
        if (this.field404 < 0) {
            this.field404 = 0;
        }
        if (this.field392 != null) {
            this.field392.method560(arg0);
        }
    }

    @ObfuscatedName("bh.am([II)V")
    public final void method635(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field388) {
            var3 = arg1 << 1;
        }
        class306.method4985(arg0, 0, var3);
        this.field404 -= arg1;
        if (this.field392 != null && this.field404 <= 0) {
            this.field404 += Statics.field395 >> 4;
            method3852(this.field392);
            this.method636(this.field392, this.field392.method698());
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
                        class59 var10 = null;
                        class59 var11 = this.field402[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class69 var12 = var11.field454;
                                if (var12 == null || var12.field555 <= var8) {
                                    var11.field456 = true;
                                    int var13 = var11.method575();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field555 += var13;
                                    }
                                    if (var4 >= this.field387) {
                                        break label105;
                                    }
                                    class59 var14 = var11.method557();
                                    if (var14 != null) {
                                        int var15 = var11.field455;
                                        while (var14 != null) {
                                            this.method636(var14, var15 * var14.method698() >> 8);
                                            var14 = var11.method558();
                                        }
                                    }
                                    class59 var16 = var11.field457;
                                    var11.field457 = null;
                                    if (var10 == null) {
                                        this.field402[var7] = var16;
                                    } else {
                                        var10.field457 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field394[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field457;
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
                class59 var18 = this.field402[var17];
                class59[] var19 = this.field402;
                this.field394[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class59 var21 = var18.field457;
                    var18.field457 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field404 < 0) {
            this.field404 = 0;
        }
        if (this.field392 != null) {
            this.field392.method585(arg0, 0, arg1);
        }
        this.field393 = class379.method1540();
    }

    @ObfuscatedName("il.ag(Lbt;I)V")
    public static final void method3852(class59 arg0) {
        arg0.field456 = false;
        if (arg0.field454 != null) {
            arg0.field454.field555 = 0;
        }
        for (class59 var1 = arg0.method557(); var1 != null; var1 = arg0.method558()) {
            method3852(var1);
        }
    }

    @ObfuscatedName("bh.aq(Lbt;IB)V")
    public final void method636(class59 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class59 var4 = this.field394[var3];
        if (var4 == null) {
            this.field402[var3] = arg0;
        } else {
            var4.field457 = arg0;
        }
        this.field394[var3] = arg0;
        arg0.field455 = arg1;
    }

    @ObfuscatedName("bh.f(I)V")
    public void method324() throws Exception {
    }

    @ObfuscatedName("bh.o(II)V")
    public void method309(int arg0) throws Exception {
    }

    @ObfuscatedName("bh.u(I)I")
    public int method310() throws Exception {
        return this.field406;
    }

    @ObfuscatedName("bh.p()V")
    public void method311() throws Exception {
    }

    @ObfuscatedName("bh.b(B)V")
    public void method312() {
    }

    @ObfuscatedName("bh.e(B)V")
    public void method313() throws Exception {
    }
}
