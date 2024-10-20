package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fr")
public class class168 extends class167 {

    @ObfuscatedName("fr.u")
    public class134 field2682;

    @ObfuscatedName("fr.a")
    public class134 field2674;

    @ObfuscatedName("fr.h")
    public int field2675;

    @ObfuscatedName("fr.y")
    public volatile boolean field2673 = false;

    @ObfuscatedName("fr.d")
    public boolean field2677 = false;

    @ObfuscatedName("fr.n")
    public volatile boolean[] field2678;

    @ObfuscatedName("fr.i")
    public static CRC32 field2685 = new CRC32();

    @ObfuscatedName("fr.ad")
    public int field2680;

    @ObfuscatedName("fr.aq")
    public int field2681;

    @ObfuscatedName("fr.ak")
    public int field2676 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2682 = arg0;
        this.field2674 = arg1;
        this.field2675 = arg2;
        this.field2677 = arg5;
        class171.method2962(this, this.field2675);
    }

    @ObfuscatedName("fr.cr(I)I")
    public int method3127() {
        if (this.field2673) {
            return 100;
        } else if (this.field2658 == null) {
            int var1 = this.field2675;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field222 != null && Statics.field222.field3107 == var2) {
                var4 = Statics.field1748.field1988 * 99 / (Statics.field1748.field1986.length - Statics.field222.field2727) + 1;
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

    @ObfuscatedName("fr.e(IB)V")
    public void method3049(int arg0) {
        int var2 = this.field2675;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2709.method3509(var3);
        if (var5 != null) {
            class171.field2708.method3588(var5);
        }
    }

    @ObfuscatedName("fr.x(II)V")
    public void method3058(int arg0) {
        if (this.field2682 == null || this.field2678 == null || !this.field2678[arg0]) {
            class171.method2317(this, this.field2675, arg0, this.field2660[arg0], (byte) 2, true);
        } else {
            class170.method3030(arg0, this.field2682, this);
        }
    }

    @ObfuscatedName("fr.cv(III)V")
    public void method3129(int arg0, int arg1) {
        this.field2680 = arg0;
        this.field2681 = arg1;
        if (this.field2674 == null) {
            class171.method2317(this, 255, this.field2675, this.field2680, (byte) 0, true);
        } else {
            class170.method3030(this.field2675, this.field2674, this);
        }
    }

    @ObfuscatedName("fr.co(I[BZZB)V")
    public void method3130(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2661[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2661[arg0];
            if (this.field2682 != null) {
                class134 var10 = this.field2682;
                class169 var11 = new class169();
                var11.field2690 = 0;
                var11.field3107 = (long) arg0;
                var11.field2687 = arg1;
                var11.field2689 = var10;
                class199 var12 = class170.field2697;
                synchronized (class170.field2697) {
                    class170.field2697.method3567(var11);
                }
                class170.method754();
                this.field2678[arg0] = true;
            }
            if (arg3) {
                this.field2658[arg0] = class125.method181(arg1, false);
            }
            return;
        }
        if (this.field2673) {
            throw new RuntimeException();
        }
        if (this.field2674 != null) {
            int var5 = this.field2675;
            class134 var6 = this.field2674;
            class169 var7 = new class169();
            var7.field2690 = 0;
            var7.field3107 = (long) var5;
            var7.field2687 = arg1;
            var7.field2689 = var6;
            class199 var8 = class170.field2697;
            synchronized (class170.field2697) {
                class170.field2697.method3567(var7);
            }
            class170.method754();
        }
        this.method3092(arg1);
        this.method3132();
    }

    @ObfuscatedName("fr.cy(Les;I[BZI)V")
    public void method3131(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2674 != arg0) {
            if (!arg3 && this.field2676 == arg1) {
                this.field2673 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2678[arg1] = false;
                if (this.field2677 || arg3) {
                    class171.method2317(this, this.field2675, arg1, this.field2660[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2685.reset();
            field2685.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2685.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2660[arg1] != var9 || this.field2661[arg1] != var10) {
                this.field2678[arg1] = false;
                if (this.field2677 || arg3) {
                    class171.method2317(this, this.field2675, arg1, this.field2660[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2678[arg1] = true;
            if (arg3) {
                this.field2658[arg1] = class125.method181(arg2, false);
            }
            return;
        }
        if (this.field2673) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method2317(this, 255, this.field2675, this.field2680, (byte) 0, true);
            return;
        }
        field2685.reset();
        field2685.update(arg2, 0, arg2.length);
        int var5 = (int) field2685.getValue();
        class119 var6 = new class119(class167.method1213(arg2));
        int var7 = var6.method2388();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2675 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2393();
        }
        if (this.field2680 != var5 || this.field2681 != var8) {
            class171.method2317(this, 255, this.field2675, this.field2680, (byte) 0, true);
            return;
        }
        this.method3092(arg2);
        this.method3132();
    }

    @ObfuscatedName("fr.cx(I)V")
    public void method3132() {
        this.field2678 = new boolean[this.field2658.length];
        for (int var1 = 0; var1 < this.field2678.length; var1++) {
            this.field2678[var1] = false;
        }
        if (this.field2682 == null) {
            this.field2673 = true;
            return;
        }
        this.field2676 = -1;
        for (int var2 = 0; var2 < this.field2678.length; var2++) {
            if (this.field2662[var2] > 0) {
                class134 var3 = this.field2682;
                class169 var5 = new class169();
                var5.field2690 = 1;
                var5.field3107 = (long) var2;
                var5.field2689 = var3;
                var5.field2692 = this;
                class199 var6 = class170.field2697;
                synchronized (class170.field2697) {
                    class170.field2697.method3567(var5);
                }
                class170.method754();
                this.field2676 = var2;
            }
        }
        if (this.field2676 == -1) {
            this.field2673 = true;
        }
    }

    @ObfuscatedName("fr.ce(IB)I")
    public int method3133(int arg0) {
        if (this.field2658[arg0] == null) {
            return this.field2678[arg0] ? 100 : class171.method2852(this.field2675, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fr.cd(B)I")
    public int method3134() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2658.length; var3++) {
            if (this.field2662[var3] > 0) {
                var1 += 100;
                var2 += this.method3133(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
