package deob;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("bd")
public class class43 {

    @ObfuscatedName("bd.ay")
    public int[] field285;

    @ObfuscatedName("bd.am")
    public class49 field289;

    @ObfuscatedName("bd.az")
    public int field290 = 32;

    @ObfuscatedName("bd.ae")
    public long field291 = class290.method4466();

    @ObfuscatedName("bd.au")
    public int field284;

    @ObfuscatedName("bd.ag")
    public int field286;

    @ObfuscatedName("bd.at")
    public int field294;

    @ObfuscatedName("bd.af")
    public long field295 = 0L;

    @ObfuscatedName("bd.ai")
    public int field296 = 0;

    @ObfuscatedName("bd.aw")
    public int field297 = 0;

    @ObfuscatedName("bd.aa")
    public int field298 = 0;

    @ObfuscatedName("bd.ah")
    public long field299 = 0L;

    @ObfuscatedName("bd.ad")
    public boolean field288 = true;

    @ObfuscatedName("bd.bh")
    public int field301 = 0;

    @ObfuscatedName("bd.bl")
    public class49[] field302 = new class49[8];

    @ObfuscatedName("bd.bk")
    public class49[] field300 = new class49[8];

    @ObfuscatedName("dl.ad(IZII)V")
    public static final void method2507(int arg0, boolean arg1, int arg2) {
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        Statics.field293 = arg0;
        Statics.field992 = arg1;
        Statics.field1315 = arg2;
    }

    @ObfuscatedName("eu.bm(Lge;IIB)Lbd;")
    public static final class43 method2874(class169 arg0, int arg1, int arg2) {
        if (Statics.field293 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class43 var3 = Statics.field973.method299();
                var3.field285 = new int[(Statics.field992 ? 2 : 1) * 256];
                var3.field286 = arg2;
                var3.method311();
                var3.field284 = (arg2 & 0xFFFFFC00) + 1024;
                if (var3.field284 > 16384) {
                    var3.field284 = 16384;
                }
                var3.method312(var3.field284);
                if (Statics.field1315 > 0 && Statics.field3313 == null) {
                    Statics.field3313 = new class45();
                    Statics.field303 = Executors.newScheduledThreadPool(1);
                    Statics.field303.scheduleAtFixedRate(Statics.field3313, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field3313 != null) {
                    if (Statics.field3313.field319[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field3313.field319[arg1] = var3;
                }
                return var3;
            } catch (Throwable var5) {
                return new class43();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @ObfuscatedName("bd.bv(Lbj;I)V")
    public final synchronized void method755(class49 arg0) {
        this.field289 = arg0;
    }

    @ObfuscatedName("bd.bo(I)V")
    public final synchronized void method764() {
        if (this.field285 == null) {
            return;
        }
        long var1 = class290.method4466();
        try {
            if (this.field295 != 0L) {
                if (var1 < this.field295) {
                    return;
                }
                this.method312(this.field284);
                this.field295 = 0L;
                this.field288 = true;
            }
            int var3 = this.method327();
            if (this.field298 - var3 > this.field296) {
                this.field296 = this.field298 - var3;
            }
            int var4 = this.field294 + this.field286;
            if (var4 + 256 > 16384) {
                var4 = 16128;
            }
            if (var4 + 256 > this.field284) {
                this.field284 += 1024;
                if (this.field284 > 16384) {
                    this.field284 = 16384;
                }
                this.method315();
                this.method312(this.field284);
                var3 = 0;
                this.field288 = true;
                if (var4 + 256 > this.field284) {
                    var4 = this.field284 - 256;
                    this.field294 = var4 - this.field286;
                }
            }
            while (var3 < var4) {
                this.method759(this.field285, 256);
                this.method314();
                var3 += 256;
            }
            if (var1 > this.field299) {
                if (this.field288) {
                    this.field288 = false;
                } else if (this.field296 == 0 && this.field297 == 0) {
                    this.method315();
                    this.field295 = var1 + 2000L;
                    return;
                } else {
                    this.field294 = Math.min(this.field297, this.field296);
                    this.field297 = this.field296;
                }
                this.field296 = 0;
                this.field299 = var1 + 2000L;
            }
            this.field298 = var3;
        } catch (Exception var8) {
            this.method315();
            this.field295 = var1 + 2000L;
        }
        try {
            if (var1 > this.field291 + 500000L) {
                var1 = this.field291;
            }
            while (var1 > this.field291 + 5000L) {
                this.method758(256);
                this.field291 += (long) (256000 / Statics.field293);
            }
        } catch (Exception var7) {
            this.field291 = var1;
        }
    }

    @ObfuscatedName("bd.bs(I)V")
    public final void method786() {
        this.field288 = true;
    }

    @ObfuscatedName("bd.bg(B)V")
    public final synchronized void method756() {
        this.field288 = true;
        try {
            this.method316();
        } catch (Exception var2) {
            this.method315();
            this.field295 = class290.method4466() + 2000L;
        }
    }

    @ObfuscatedName("bd.bh(I)V")
    public final synchronized void method757() {
        if (Statics.field3313 != null) {
            boolean var1 = true;
            for (int var2 = 0; var2 < 2; var2++) {
                if (Statics.field3313.field319[var2] == this) {
                    Statics.field3313.field319[var2] = null;
                }
                if (Statics.field3313.field319[var2] != null) {
                    var1 = false;
                }
            }
            if (var1) {
                Statics.field303.shutdownNow();
                Statics.field303 = null;
                Statics.field3313 = null;
            }
        }
        this.method315();
        this.field285 = null;
    }

    @ObfuscatedName("bd.bl(II)V")
    public final void method758(int arg0) {
        this.field301 -= arg0;
        if (this.field301 < 0) {
            this.field301 = 0;
        }
        if (this.field289 != null) {
            this.field289.method686(arg0);
        }
    }

    @ObfuscatedName("bd.bk([II)V")
    public final void method759(int[] arg0, int arg1) {
        int var3 = arg1;
        if (Statics.field992) {
            var3 = arg1 << 1;
        }
        class381.method6683(arg0, 0, var3);
        this.field301 -= arg1;
        if (this.field289 != null && this.field301 <= 0) {
            this.field301 += Statics.field293 >> 4;
            method4820(this.field289);
            this.method760(this.field289, this.field289.method831());
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
                        class49 var10 = null;
                        class49 var11 = this.field302[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class59 var12 = var11.field349;
                                if (var12 == null || var12.field446 <= var8) {
                                    var11.field351 = true;
                                    int var13 = var11.method683();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field446 += var13;
                                    }
                                    if (var4 >= this.field290) {
                                        break label105;
                                    }
                                    class49 var14 = var11.method681();
                                    if (var14 != null) {
                                        int var15 = var11.field350;
                                        while (var14 != null) {
                                            this.method760(var14, var15 * var14.method831() >> 8);
                                            var14 = var11.method688();
                                        }
                                    }
                                    class49 var16 = var11.field352;
                                    var11.field352 = null;
                                    if (var10 == null) {
                                        this.field302[var7] = var16;
                                    } else {
                                        var10.field352 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field300[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field352;
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
                class49 var18 = this.field302[var17];
                class49[] var19 = this.field302;
                this.field300[var17] = null;
                var19[var17] = null;
                while (var18 != null) {
                    class49 var21 = var18.field352;
                    var18.field352 = null;
                    var18 = var21;
                }
            }
        }
        if (this.field301 < 0) {
            this.field301 = 0;
        }
        if (this.field289 != null) {
            this.field289.method705(arg0, 0, arg1);
        }
        this.field291 = class290.method4466();
    }

    @ObfuscatedName("ku.br(Lbj;B)V")
    public static final void method4820(class49 arg0) {
        arg0.field351 = false;
        if (arg0.field349 != null) {
            arg0.field349.field446 = 0;
        }
        for (class49 var1 = arg0.method681(); var1 != null; var1 = arg0.method688()) {
            method4820(var1);
        }
    }

    @ObfuscatedName("bd.ba(Lbj;II)V")
    public final void method760(class49 arg0, int arg1) {
        int var3 = arg1 >> 5;
        class49 var4 = this.field300[var3];
        if (var4 == null) {
            this.field302[var3] = arg0;
        } else {
            var4.field352 = arg0;
        }
        this.field300[var3] = arg0;
        arg0.field350 = arg1;
    }

    @ObfuscatedName("bd.aj(I)V")
    public void method311() throws Exception {
    }

    @ObfuscatedName("bd.al(IB)V")
    public void method312(int arg0) throws Exception {
    }

    @ObfuscatedName("bd.ac(B)I")
    public int method327() throws Exception {
        return this.field284;
    }

    @ObfuscatedName("bd.ab()V")
    public void method314() throws Exception {
    }

    @ObfuscatedName("bd.an(B)V")
    public void method315() {
    }

    @ObfuscatedName("bd.ao(S)V")
    public void method316() throws Exception {
    }
}
