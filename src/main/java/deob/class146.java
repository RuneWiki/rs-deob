package deob;

import java.util.zip.CRC32;

@ObfuscatedName("er")
public class class146 extends class145 {

    @ObfuscatedName("er.b")
    public class121 field2454;

    @ObfuscatedName("er.i")
    public class121 field2446;

    @ObfuscatedName("er.h")
    public int field2447;

    @ObfuscatedName("er.q")
    public volatile boolean field2448 = false;

    @ObfuscatedName("er.d")
    public boolean field2449 = false;

    @ObfuscatedName("er.z")
    public volatile boolean[] field2452;

    @ObfuscatedName("er.e")
    public static CRC32 field2453 = new CRC32();

    @ObfuscatedName("er.av")
    public int field2450;

    @ObfuscatedName("er.al")
    public int field2445;

    @ObfuscatedName("er.aq")
    public int field2451 = -1;

    public class146(class121 arg0, class121 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2454 = arg0;
        this.field2446 = arg1;
        this.field2447 = arg2;
        this.field2449 = arg5;
        class149.method1767(this, this.field2447);
    }

    @ObfuscatedName("er.bj(I)I")
    public int method2776() {
        if (this.field2448) {
            return 100;
        } else if (this.field2437 == null) {
            int var1 = this.field2447;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2479 != null && Statics.field2479.field2830 == var2) {
                var4 = Statics.field2685.field1854 * 99 / (Statics.field2685.field1856.length - Statics.field2479.field2496) + 1;
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

    @ObfuscatedName("er.u(IB)V")
    public void method2720(int arg0) {
        class149.method10(this.field2447, arg0);
    }

    @ObfuscatedName("er.c(II)V")
    public void method2712(int arg0) {
        if (this.field2454 == null || this.field2452 == null || !this.field2452[arg0]) {
            class149.method2405(this, this.field2447, arg0, this.field2442[arg0], (byte) 2, true);
            return;
        }
        class121 var2 = this.field2454;
        byte[] var4 = null;
        class176 var5 = class148.field2464;
        synchronized (class148.field2464) {
            for (class147 var6 = (class147) class148.field2464.method3234(); var6 != null; var6 = (class147) class148.field2464.method3209()) {
                if ((long) arg0 == var6.field2830 && var6.field2456 == var2 && var6.field2457 == 0) {
                    var4 = var6.field2458;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2437(arg0);
            this.method2785(var2, arg0, var8, true);
        } else {
            this.method2785(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("er.br(IIB)V")
    public void method2777(int arg0, int arg1) {
        this.field2450 = arg0;
        this.field2445 = arg1;
        if (this.field2446 == null) {
            class149.method2405(this, 255, this.field2447, this.field2450, (byte) 0, true);
            return;
        }
        int var3 = this.field2447;
        class121 var4 = this.field2446;
        byte[] var6 = null;
        class176 var7 = class148.field2464;
        synchronized (class148.field2464) {
            for (class147 var8 = (class147) class148.field2464.method3234(); var8 != null; var8 = (class147) class148.field2464.method3209()) {
                if ((long) var3 == var8.field2830 && var8.field2456 == var4 && var8.field2457 == 0) {
                    var6 = var8.field2458;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2437(var3);
            this.method2785(var4, var3, var10, true);
        } else {
            this.method2785(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("er.bx(I[BZZB)V")
    public void method2778(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2448) {
                throw new RuntimeException();
            }
            if (this.field2446 != null) {
                class148.method1319(this.field2447, arg1, this.field2446);
            }
            this.method2774(arg1);
            this.method2781();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2432[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2432[arg0];
        if (this.field2454 != null) {
            class148.method1319(arg0, arg1, this.field2454);
            this.field2452[arg0] = true;
        }
        if (arg3) {
            this.field2437[arg0] = class112.method471(arg1, false);
        }
    }

    @ObfuscatedName("er.ch(Ldh;I[BZI)V")
    public void method2785(class121 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2446 != arg0) {
            if (!arg3 && this.field2451 == arg1) {
                this.field2448 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2452[arg1] = false;
                if (this.field2449 || arg3) {
                    class149.method2405(this, this.field2447, arg1, this.field2442[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2453.reset();
            field2453.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2453.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2442[arg1] != var9 || this.field2432[arg1] != var10) {
                this.field2452[arg1] = false;
                if (this.field2449 || arg3) {
                    class149.method2405(this, this.field2447, arg1, this.field2442[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2452[arg1] = true;
            if (arg3) {
                this.field2437[arg1] = class112.method471(arg2, false);
            }
            return;
        }
        if (this.field2448) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class149.method2405(this, 255, this.field2447, this.field2450, (byte) 0, true);
            return;
        }
        field2453.reset();
        field2453.update(arg2, 0, arg2.length);
        int var5 = (int) field2453.getValue();
        class107 var6 = new class107(class145.method2039(arg2));
        int var7 = var6.method2109();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2114();
        }
        if (this.field2450 != var5 || this.field2445 != var8) {
            class149.method2405(this, 255, this.field2447, this.field2450, (byte) 0, true);
            return;
        }
        this.method2774(arg2);
        this.method2781();
    }

    @ObfuscatedName("er.cl(I)V")
    public void method2781() {
        this.field2452 = new boolean[this.field2437.length];
        for (int var1 = 0; var1 < this.field2452.length; var1++) {
            this.field2452[var1] = false;
        }
        if (this.field2454 == null) {
            this.field2448 = true;
            return;
        }
        this.field2451 = -1;
        for (int var2 = 0; var2 < this.field2452.length; var2++) {
            if (this.field2439[var2] > 0) {
                class148.method607(var2, this.field2454, this);
                this.field2451 = var2;
            }
        }
        if (this.field2451 == -1) {
            this.field2448 = true;
        }
    }

    @ObfuscatedName("er.cr(II)I")
    public int method2786(int arg0) {
        if (this.field2437[arg0] != null) {
            return 100;
        } else if (this.field2452[arg0]) {
            return 100;
        } else {
            int var2 = this.field2447;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2479 != null && Statics.field2479.field2830 == var3) {
                var5 = Statics.field2685.field1854 * 99 / (Statics.field2685.field1856.length - Statics.field2479.field2496) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("er.ck(I)I")
    public int method2775() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2437.length; var3++) {
            if (this.field2439[var3] > 0) {
                var1 += 100;
                var2 += this.method2786(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
