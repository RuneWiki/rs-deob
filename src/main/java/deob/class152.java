package deob;

import java.util.zip.CRC32;

@ObfuscatedName("em")
public class class152 extends class150 {

    @ObfuscatedName("em.a")
    public class70 field2499;

    @ObfuscatedName("em.v")
    public class70 field2490;

    @ObfuscatedName("em.i")
    public int field2491;

    @ObfuscatedName("em.k")
    public volatile boolean field2492 = false;

    @ObfuscatedName("em.o")
    public boolean field2493 = false;

    @ObfuscatedName("em.d")
    public volatile boolean[] field2494;

    @ObfuscatedName("em.u")
    public static CRC32 field2489 = new CRC32();

    @ObfuscatedName("em.ap")
    public int field2496;

    @ObfuscatedName("em.ad")
    public int field2497;

    @ObfuscatedName("em.ao")
    public int field2498 = -1;

    public class152(class70 arg0, class70 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2499 = arg0;
        this.field2490 = arg1;
        this.field2491 = arg2;
        this.field2493 = arg5;
        class151.method245(this, this.field2491);
    }

    @ObfuscatedName("em.bq(I)I")
    public int method2904() {
        if (this.field2492) {
            return 100;
        } else if (this.field2459 == null) {
            int var1 = this.field2491;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field1778 != null && Statics.field1778.field2759 == var2) {
                var4 = Statics.field733.field2003 * 99 / (Statics.field733.field2002.length - Statics.field1778.field2500) + 1;
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

    @ObfuscatedName("em.j(II)V")
    public void method2834(int arg0) {
        class151.method1440(this.field2491, arg0);
    }

    @ObfuscatedName("em.r(II)V")
    public void method2829(int arg0) {
        if (this.field2499 == null || this.field2494 == null || !this.field2494[arg0]) {
            class151.method25(this, this.field2491, arg0, this.field2453[arg0], (byte) 2, true);
            return;
        }
        class70 var2 = this.field2499;
        byte[] var4 = null;
        class175 var5 = class155.field2518;
        synchronized (class155.field2518) {
            for (class154 var6 = (class154) class155.field2518.method3145(); var6 != null; var6 = (class154) class155.field2518.method3154()) {
                if ((long) arg0 == var6.field2759 && var6.field2508 == var2 && var6.field2511 == 0) {
                    var4 = var6.field2507;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1359(arg0);
            this.method2907(var2, arg0, var8, true);
        } else {
            this.method2907(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("em.bc(III)V")
    public void method2905(int arg0, int arg1) {
        this.field2496 = arg0;
        this.field2497 = arg1;
        if (this.field2490 == null) {
            class151.method25(this, 255, this.field2491, this.field2496, (byte) 0, true);
            return;
        }
        int var3 = this.field2491;
        class70 var4 = this.field2490;
        byte[] var6 = null;
        class175 var7 = class155.field2518;
        synchronized (class155.field2518) {
            for (class154 var8 = (class154) class155.field2518.method3145(); var8 != null; var8 = (class154) class155.field2518.method3154()) {
                if ((long) var3 == var8.field2759 && var8.field2508 == var4 && var8.field2511 == 0) {
                    var6 = var8.field2507;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method1359(var3);
            this.method2907(var4, var3, var10, true);
        } else {
            this.method2907(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("em.bz(I[BZZB)V")
    public void method2906(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2454[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2454[arg0];
            if (this.field2499 != null) {
                class70 var10 = this.field2499;
                class154 var11 = new class154();
                var11.field2511 = 0;
                var11.field2759 = (long) arg0;
                var11.field2507 = arg1;
                var11.field2508 = var10;
                class175 var12 = class155.field2518;
                synchronized (class155.field2518) {
                    class155.field2518.method3147(var11);
                }
                class155.method121();
                this.field2494[arg0] = true;
            }
            if (arg3) {
                this.field2459[arg0] = class118.method1297(arg1, false);
            }
            return;
        }
        if (this.field2492) {
            throw new RuntimeException();
        }
        if (this.field2490 != null) {
            int var5 = this.field2491;
            class70 var6 = this.field2490;
            class154 var7 = new class154();
            var7.field2511 = 0;
            var7.field2759 = (long) var5;
            var7.field2507 = arg1;
            var7.field2508 = var6;
            class175 var8 = class155.field2518;
            synchronized (class155.field2518) {
                class155.field2518.method3147(var7);
            }
            class155.method121();
        }
        this.method2831(arg1);
        this.method2908();
    }

    @ObfuscatedName("em.be(Lbc;I[BZI)V")
    public void method2907(class70 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2490 != arg0) {
            if (!arg3 && this.field2498 == arg1) {
                this.field2492 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2494[arg1] = false;
                if (this.field2493 || arg3) {
                    class151.method25(this, this.field2491, arg1, this.field2453[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2489.reset();
            field2489.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2489.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2453[arg1] != var9 || this.field2454[arg1] != var10) {
                this.field2494[arg1] = false;
                if (this.field2493 || arg3) {
                    class151.method25(this, this.field2491, arg1, this.field2453[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2494[arg1] = true;
            if (arg3) {
                this.field2459[arg1] = class118.method1297(arg2, false);
            }
            return;
        }
        if (this.field2492) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class151.method25(this, 255, this.field2491, this.field2496, (byte) 0, true);
            return;
        }
        field2489.reset();
        field2489.update(arg2, 0, arg2.length);
        int var5 = (int) field2489.getValue();
        class125 var6 = new class125(class150.method652(arg2));
        int var7 = var6.method2326();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2489();
        }
        if (this.field2496 != var5 || this.field2497 != var8) {
            class151.method25(this, 255, this.field2491, this.field2496, (byte) 0, true);
            return;
        }
        this.method2831(arg2);
        this.method2908();
    }

    @ObfuscatedName("em.by(I)V")
    public void method2908() {
        this.field2494 = new boolean[this.field2459.length];
        for (int var1 = 0; var1 < this.field2494.length; var1++) {
            this.field2494[var1] = false;
        }
        if (this.field2499 == null) {
            this.field2492 = true;
            return;
        }
        this.field2498 = -1;
        for (int var2 = 0; var2 < this.field2494.length; var2++) {
            if (this.field2449[var2] > 0) {
                class70 var3 = this.field2499;
                class154 var5 = new class154();
                var5.field2511 = 1;
                var5.field2759 = (long) var2;
                var5.field2508 = var3;
                var5.field2509 = this;
                class175 var6 = class155.field2518;
                synchronized (class155.field2518) {
                    class155.field2518.method3147(var5);
                }
                class155.method121();
                this.field2498 = var2;
            }
        }
        if (this.field2498 == -1) {
            this.field2492 = true;
        }
    }

    @ObfuscatedName("em.bn(II)I")
    public int method2909(int arg0) {
        if (this.field2459[arg0] != null) {
            return 100;
        } else if (this.field2494[arg0]) {
            return 100;
        } else {
            int var2 = this.field2491;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field1778 != null && Statics.field1778.field2759 == var3) {
                var5 = Statics.field733.field2003 * 99 / (Statics.field733.field2002.length - Statics.field1778.field2500) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("em.bv(I)I")
    public int method2910() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2459.length; var3++) {
            if (this.field2449[var3] > 0) {
                var1 += 100;
                var2 += this.method2909(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
