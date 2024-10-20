package deob;

import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class143 extends class142 {

    @ObfuscatedName("eh.c")
    public class118 field2428;

    @ObfuscatedName("eh.h")
    public class118 field2433;

    @ObfuscatedName("eh.y")
    public int field2430;

    @ObfuscatedName("eh.r")
    public volatile boolean field2431 = false;

    @ObfuscatedName("eh.w")
    public boolean field2432 = false;

    @ObfuscatedName("eh.p")
    public volatile boolean[] field2434;

    @ObfuscatedName("eh.s")
    public static CRC32 field2438 = new CRC32();

    @ObfuscatedName("eh.ag")
    public int field2435;

    @ObfuscatedName("eh.ad")
    public int field2436;

    @ObfuscatedName("eh.ak")
    public int field2437 = -1;

    public class143(class118 arg0, class118 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2428 = arg0;
        this.field2433 = arg1;
        this.field2430 = arg2;
        this.field2432 = arg5;
        int var8 = this.field2430;
        if (Statics.field1536 == null) {
            class146.method494((class143) null, 255, 255, 0, (byte) 0, true);
            class146.field2470[var8] = this;
        } else {
            Statics.field1536.field1815 = var8 * 8 + 5;
            int var9 = Statics.field1536.method2130();
            int var10 = Statics.field1536.method2130();
            this.method2842(var9, var10);
        }
    }

    @ObfuscatedName("eh.ch(I)I")
    public int method2829() {
        if (this.field2431) {
            return 100;
        } else if (this.field2420 == null) {
            int var1 = this.field2430;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1411 != null && Statics.field1411.field2817 == var2) {
                var4 = Statics.field2467.field1815 * 99 / (Statics.field2467.field1819.length - Statics.field1411.field2481) + 1;
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

    @ObfuscatedName("eh.n(IB)V")
    public void method2744(int arg0) {
        int var2 = this.field2430;
        long var3 = (long) ((var2 << 16) + arg0);
        class147 var5 = (class147) class146.field2462.method3208(var3);
        if (var5 != null) {
            class146.field2461.method3262(var5);
        }
    }

    @ObfuscatedName("eh.g(IB)V")
    public void method2753(int arg0) {
        if (this.field2428 == null || this.field2434 == null || !this.field2434[arg0]) {
            class146.method494(this, this.field2430, arg0, this.field2415[arg0], (byte) 2, true);
            return;
        }
        class118 var2 = this.field2428;
        byte[] var4 = null;
        class171 var5 = class145.field2450;
        synchronized (class145.field2450) {
            for (class144 var6 = (class144) class145.field2450.method3236(); var6 != null; var6 = (class144) class145.field2450.method3228()) {
                if ((long) arg0 == var6.field2817 && var6.field2442 == var2 && var6.field2443 == 0) {
                    var4 = var6.field2448;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2481(arg0);
            this.method2833(var2, arg0, var8, true);
        } else {
            this.method2833(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("eh.cc(III)V")
    public void method2842(int arg0, int arg1) {
        this.field2435 = arg0;
        this.field2436 = arg1;
        if (this.field2433 == null) {
            class146.method494(this, 255, this.field2430, this.field2435, (byte) 0, true);
            return;
        }
        int var3 = this.field2430;
        class118 var4 = this.field2433;
        byte[] var6 = null;
        class171 var7 = class145.field2450;
        synchronized (class145.field2450) {
            for (class144 var8 = (class144) class145.field2450.method3236(); var8 != null; var8 = (class144) class145.field2450.method3228()) {
                if ((long) var3 == var8.field2817 && var8.field2442 == var4 && var8.field2443 == 0) {
                    var6 = var8.field2448;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2481(var3);
            this.method2833(var4, var3, var10, true);
        } else {
            this.method2833(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("eh.ci(I[BZZI)V")
    public void method2832(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2431) {
                throw new RuntimeException();
            }
            if (this.field2433 != null) {
                class145.method625(this.field2430, arg1, this.field2433);
            }
            this.method2743(arg1);
            this.method2839();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2418[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2418[arg0];
        if (this.field2428 != null) {
            class145.method625(arg0, arg1, this.field2428);
            this.field2434[arg0] = true;
        }
        if (arg3) {
            this.field2420[arg0] = class109.method543(arg1, false);
        }
    }

    @ObfuscatedName("eh.cv(Ldx;I[BZI)V")
    public void method2833(class118 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2433 != arg0) {
            if (!arg3 && this.field2437 == arg1) {
                this.field2431 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2434[arg1] = false;
                if (this.field2432 || arg3) {
                    class146.method494(this, this.field2430, arg1, this.field2415[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2438.reset();
            field2438.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2438.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2415[arg1] != var9 || this.field2418[arg1] != var10) {
                this.field2434[arg1] = false;
                if (this.field2432 || arg3) {
                    class146.method494(this, this.field2430, arg1, this.field2415[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2434[arg1] = true;
            if (arg3) {
                this.field2420[arg1] = class109.method543(arg2, false);
            }
            return;
        }
        if (this.field2431) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class146.method494(this, 255, this.field2430, this.field2435, (byte) 0, true);
            return;
        }
        field2438.reset();
        field2438.update(arg2, 0, arg2.length);
        int var5 = (int) field2438.getValue();
        class104 var6 = new class104(class142.method557(arg2));
        int var7 = var6.method2257();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2130();
        }
        if (this.field2435 != var5 || this.field2436 != var8) {
            class146.method494(this, 255, this.field2430, this.field2435, (byte) 0, true);
            return;
        }
        this.method2743(arg2);
        this.method2839();
    }

    @ObfuscatedName("eh.cb(I)V")
    public void method2839() {
        this.field2434 = new boolean[this.field2420.length];
        for (int var1 = 0; var1 < this.field2434.length; var1++) {
            this.field2434[var1] = false;
        }
        if (this.field2428 == null) {
            this.field2431 = true;
            return;
        }
        this.field2437 = -1;
        for (int var2 = 0; var2 < this.field2434.length; var2++) {
            if (this.field2416[var2] > 0) {
                class118 var3 = this.field2428;
                class144 var5 = new class144();
                var5.field2443 = 1;
                var5.field2817 = (long) var2;
                var5.field2442 = var3;
                var5.field2444 = this;
                class171 var6 = class145.field2450;
                synchronized (class145.field2450) {
                    class145.field2450.method3221(var5);
                }
                Object var8 = class145.field2452;
                synchronized (class145.field2452) {
                    if (class145.field2451 == 0) {
                        Statics.field1249.method2523(new class145(), 5);
                    }
                    class145.field2451 = 600;
                }
                this.field2437 = var2;
            }
        }
        if (this.field2437 == -1) {
            this.field2431 = true;
        }
    }

    @ObfuscatedName("eh.cw(II)I")
    public int method2834(int arg0) {
        if (this.field2420[arg0] != null) {
            return 100;
        } else if (this.field2434[arg0]) {
            return 100;
        } else {
            int var2 = this.field2430;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1411 != null && Statics.field1411.field2817 == var3) {
                var5 = Statics.field2467.field1815 * 99 / (Statics.field2467.field1819.length - Statics.field1411.field2481) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("eh.cr(I)I")
    public int method2830() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2420.length; var3++) {
            if (this.field2416[var3] > 0) {
                var1 += 100;
                var2 += this.method2834(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
