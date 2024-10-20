package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ep")
public class class155 extends class153 {

    @ObfuscatedName("ep.z")
    public class71 field2557;

    @ObfuscatedName("ep.w")
    public class71 field2552;

    @ObfuscatedName("ep.h")
    public int field2553;

    @ObfuscatedName("ep.y")
    public volatile boolean field2554 = false;

    @ObfuscatedName("ep.x")
    public boolean field2559 = false;

    @ObfuscatedName("ep.p")
    public volatile boolean[] field2556;

    @ObfuscatedName("ep.i")
    public static CRC32 field2558 = new CRC32();

    @ObfuscatedName("ep.aa")
    public int field2555;

    @ObfuscatedName("ep.ax")
    public int field2551;

    @ObfuscatedName("ep.ad")
    public int field2560 = -1;

    public class155(class71 arg0, class71 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2557 = arg0;
        this.field2552 = arg1;
        this.field2553 = arg2;
        this.field2559 = arg5;
        int var8 = this.field2553;
        if (Statics.field2830 == null) {
            class154.method2384((class155) null, 255, 255, 0, (byte) 0, true);
            class154.field2545[var8] = this;
        } else {
            Statics.field2830.field2033 = var8 * 8 + 5;
            int var9 = Statics.field2830.method2463();
            int var10 = Statics.field2830.method2463();
            this.method3138(var9, var10);
        }
    }

    @ObfuscatedName("ep.bf(B)I")
    public int method3116() {
        if (this.field2554) {
            return 100;
        } else if (this.field2509 == null) {
            int var1 = class154.method2139(255, this.field2553);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ep.t(II)V")
    public void method3083(int arg0) {
        class154.method2747(this.field2553, arg0);
    }

    @ObfuscatedName("ep.g(IB)V")
    public void method3042(int arg0) {
        if (this.field2557 == null || this.field2556 == null || !this.field2556[arg0]) {
            class154.method2384(this, this.field2553, arg0, this.field2513[arg0], (byte) 2, true);
            return;
        }
        class71 var2 = this.field2557;
        byte[] var4 = null;
        class177 var5 = class158.field2583;
        synchronized (class158.field2583) {
            for (class157 var6 = (class157) class158.field2583.method3362(); var6 != null; var6 = (class157) class158.field2583.method3350()) {
                if ((long) arg0 == var6.field2812 && var6.field2572 == var2 && var6.field2579 == 0) {
                    var4 = var6.field2578;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method1420(arg0);
            this.method3117(var2, arg0, var8, true);
        } else {
            this.method3117(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ep.bq(III)V")
    public void method3138(int arg0, int arg1) {
        this.field2555 = arg0;
        this.field2551 = arg1;
        if (this.field2552 == null) {
            class154.method2384(this, 255, this.field2553, this.field2555, (byte) 0, true);
        } else {
            class158.method2232(this.field2553, this.field2552, this);
        }
    }

    @ObfuscatedName("ep.be(I[BZZB)V")
    public void method3137(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2554) {
                throw new RuntimeException();
            }
            if (this.field2552 != null) {
                class158.method819(this.field2553, arg1, this.field2552);
            }
            this.method3033(arg1);
            this.method3120();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2514[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2514[arg0];
        if (this.field2557 != null) {
            class158.method819(arg0, arg1, this.field2557);
            this.field2556[arg0] = true;
        }
        if (arg3) {
            this.field2509[arg0] = class119.method38(arg1, false);
        }
    }

    @ObfuscatedName("ep.bx(Lbl;I[BZB)V")
    public void method3117(class71 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2552 != arg0) {
            if (!arg3 && this.field2560 == arg1) {
                this.field2554 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2556[arg1] = false;
                if (this.field2559 || arg3) {
                    class154.method2384(this, this.field2553, arg1, this.field2513[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2558.reset();
            field2558.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2558.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2513[arg1] != var9 || this.field2514[arg1] != var10) {
                this.field2556[arg1] = false;
                if (this.field2559 || arg3) {
                    class154.method2384(this, this.field2553, arg1, this.field2513[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2556[arg1] = true;
            if (arg3) {
                this.field2509[arg1] = class119.method38(arg2, false);
            }
            return;
        }
        if (this.field2554) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class154.method2384(this, 255, this.field2553, this.field2555, (byte) 0, true);
            return;
        }
        field2558.reset();
        field2558.update(arg2, 0, arg2.length);
        int var5 = (int) field2558.getValue();
        class127 var6 = new class127(class153.method1869(arg2));
        int var7 = var6.method2458();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException("");
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2463();
        }
        if (this.field2555 != var5 || this.field2551 != var8) {
            class154.method2384(this, 255, this.field2553, this.field2555, (byte) 0, true);
            return;
        }
        this.method3033(arg2);
        this.method3120();
    }

    @ObfuscatedName("ep.cf(I)V")
    public void method3120() {
        this.field2556 = new boolean[this.field2509.length];
        for (int var1 = 0; var1 < this.field2556.length; var1++) {
            this.field2556[var1] = false;
        }
        if (this.field2557 == null) {
            this.field2554 = true;
            return;
        }
        this.field2560 = -1;
        for (int var2 = 0; var2 < this.field2556.length; var2++) {
            if (this.field2521[var2] > 0) {
                class158.method2378(var2, this.field2557, this);
                this.field2560 = var2;
            }
        }
        if (this.field2560 == -1) {
            this.field2554 = true;
        }
    }

    @ObfuscatedName("ep.cj(II)I")
    public int method3121(int arg0) {
        if (this.field2509[arg0] == null) {
            return this.field2556[arg0] ? 100 : class154.method2139(this.field2553, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ep.ce(I)I")
    public int method3122() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2509.length; var3++) {
            if (this.field2521[var3] > 0) {
                var1 += 100;
                var2 += this.method3121(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
