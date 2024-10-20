package deob;

import java.util.zip.CRC32;

@ObfuscatedName("es")
public class class152 extends class151 {

    @ObfuscatedName("es.a")
    public class125 field2487;

    @ObfuscatedName("es.x")
    public class125 field2494;

    @ObfuscatedName("es.n")
    public int field2488;

    @ObfuscatedName("es.v")
    public volatile boolean field2489 = false;

    @ObfuscatedName("es.l")
    public boolean field2490 = false;

    @ObfuscatedName("es.t")
    public volatile boolean[] field2491;

    @ObfuscatedName("es.i")
    public static CRC32 field2492 = new CRC32();

    @ObfuscatedName("es.aw")
    public int field2493;

    @ObfuscatedName("es.ar")
    public int field2496;

    @ObfuscatedName("es.af")
    public int field2495 = -1;

    public class152(class125 arg0, class125 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2487 = arg0;
        this.field2494 = arg1;
        this.field2488 = arg2;
        this.field2490 = arg5;
        int var8 = this.field2488;
        if (Statics.field878 == null) {
            class155.method776((class152) null, 255, 255, 0, (byte) 0, true);
            class155.field2531[var8] = this;
        } else {
            Statics.field878.field1842 = var8 * 8 + 5;
            int var9 = Statics.field878.method2164();
            int var10 = Statics.field878.method2164();
            this.method2825(var9, var10);
        }
    }

    @ObfuscatedName("es.cb(I)I")
    public int method2823() {
        if (this.field2489) {
            return 100;
        } else if (this.field2477 == null) {
            int var1 = this.field2488;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1493 != null && Statics.field1493.field2903 == var2) {
                var4 = Statics.field2035.field1842 * 99 / (Statics.field2035.field1844.length - Statics.field1493.field2539) + 1;
            } else {
                var4 = 0;
            }
            int var5 = var4;
            if (var4 >= 100) {
                var5 = 99;
            }
            return var5;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("es.y(II)V")
    public void method2746(int arg0) {
        class155.method2724(this.field2488, arg0);
    }

    @ObfuscatedName("es.h(IB)V")
    public void method2771(int arg0) {
        if (this.field2487 == null || this.field2491 == null || !this.field2491[arg0]) {
            class155.method776(this, this.field2488, arg0, this.field2471[arg0], (byte) 2, true);
            return;
        }
        class125 var2 = this.field2487;
        byte[] var4 = null;
        class182 var5 = class154.field2510;
        synchronized (class154.field2510) {
            for (class153 var6 = (class153) class154.field2510.method3270(); var6 != null; var6 = (class153) class154.field2510.method3262()) {
                if ((long) arg0 == var6.field2903 && var6.field2501 == var2 && var6.field2506 == 0) {
                    var4 = var6.field2502;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2465(arg0);
            this.method2824(var2, arg0, var8, true);
        } else {
            this.method2824(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("es.cx(III)V")
    public void method2825(int arg0, int arg1) {
        this.field2493 = arg0;
        this.field2496 = arg1;
        if (this.field2494 == null) {
            class155.method776(this, 255, this.field2488, this.field2493, (byte) 0, true);
            return;
        }
        int var3 = this.field2488;
        class125 var4 = this.field2494;
        byte[] var6 = null;
        class182 var7 = class154.field2510;
        synchronized (class154.field2510) {
            for (class153 var8 = (class153) class154.field2510.method3270(); var8 != null; var8 = (class153) class154.field2510.method3262()) {
                if ((long) var3 == var8.field2903 && var8.field2501 == var4 && var8.field2506 == 0) {
                    var6 = var8.field2502;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2465(var3);
            this.method2824(var4, var3, var10, true);
        } else {
            this.method2824(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("es.cq(I[BZZB)V")
    public void method2827(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2474[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2474[arg0];
            if (this.field2487 != null) {
                class125 var12 = this.field2487;
                class153 var13 = new class153();
                var13.field2506 = 0;
                var13.field2903 = (long) arg0;
                var13.field2502 = arg1;
                var13.field2501 = var12;
                class182 var14 = class154.field2510;
                synchronized (class154.field2510) {
                    class154.field2510.method3256(var13);
                }
                Object var16 = class154.field2512;
                synchronized (class154.field2512) {
                    if (class154.field2511 == 0) {
                        Statics.field1115.method2500(new class154(), 5);
                    }
                    class154.field2511 = 600;
                }
                this.field2491[arg0] = true;
            }
            if (arg3) {
                this.field2477[arg0] = class116.method405(arg1, false);
            }
            return;
        }
        if (this.field2489) {
            throw new RuntimeException();
        }
        if (this.field2494 != null) {
            int var5 = this.field2488;
            class125 var6 = this.field2494;
            class153 var7 = new class153();
            var7.field2506 = 0;
            var7.field2903 = (long) var5;
            var7.field2502 = arg1;
            var7.field2501 = var6;
            class182 var8 = class154.field2510;
            synchronized (class154.field2510) {
                class154.field2510.method3256(var7);
            }
            Object var10 = class154.field2512;
            synchronized (class154.field2512) {
                if (class154.field2511 == 0) {
                    Statics.field1115.method2500(new class154(), 5);
                }
                class154.field2511 = 600;
            }
        }
        this.method2745(arg1);
        this.method2828();
    }

    @ObfuscatedName("es.cd(Ldi;I[BZB)V")
    public void method2824(class125 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2494 != arg0) {
            if (!arg3 && this.field2495 == arg1) {
                this.field2489 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2491[arg1] = false;
                if (this.field2490 || arg3) {
                    class155.method776(this, this.field2488, arg1, this.field2471[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2492.reset();
            field2492.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2492.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2471[arg1] != var9 || this.field2474[arg1] != var10) {
                this.field2491[arg1] = false;
                if (this.field2490 || arg3) {
                    class155.method776(this, this.field2488, arg1, this.field2471[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2491[arg1] = true;
            if (arg3) {
                this.field2477[arg1] = class116.method405(arg2, false);
            }
            return;
        }
        if (this.field2489) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class155.method776(this, 255, this.field2488, this.field2493, (byte) 0, true);
            return;
        }
        field2492.reset();
        field2492.update(arg2, 0, arg2.length);
        int var5 = (int) field2492.getValue();
        class110 var6 = new class110(class151.method80(arg2));
        int var7 = var6.method2309();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2488 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2164();
        }
        if (this.field2493 != var5 || this.field2496 != var8) {
            class155.method776(this, 255, this.field2488, this.field2493, (byte) 0, true);
            return;
        }
        this.method2745(arg2);
        this.method2828();
    }

    @ObfuscatedName("es.cu(I)V")
    public void method2828() {
        this.field2491 = new boolean[this.field2477.length];
        for (int var1 = 0; var1 < this.field2491.length; var1++) {
            this.field2491[var1] = false;
        }
        if (this.field2487 == null) {
            this.field2489 = true;
            return;
        }
        this.field2495 = -1;
        for (int var2 = 0; var2 < this.field2491.length; var2++) {
            if (this.field2473[var2] > 0) {
                class154.method3444(var2, this.field2487, this);
                this.field2495 = var2;
            }
        }
        if (this.field2495 == -1) {
            this.field2489 = true;
        }
    }

    @ObfuscatedName("es.ct(II)I")
    public int method2829(int arg0) {
        if (this.field2477[arg0] != null) {
            return 100;
        } else if (this.field2491[arg0]) {
            return 100;
        } else {
            int var2 = this.field2488;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1493 != null && Statics.field1493.field2903 == var3) {
                var5 = Statics.field2035.field1842 * 99 / (Statics.field2035.field1844.length - Statics.field1493.field2539) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("es.ci(B)I")
    public int method2846() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2477.length; var3++) {
            if (this.field2473[var3] > 0) {
                var1 += 100;
                var2 += this.method2829(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
