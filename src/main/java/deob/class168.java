package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fe")
public class class168 extends class167 {

    @ObfuscatedName("fe.i")
    public class134 field2673;

    @ObfuscatedName("fe.q")
    public class134 field2663;

    @ObfuscatedName("fe.r")
    public int field2664;

    @ObfuscatedName("fe.s")
    public volatile boolean field2669 = false;

    @ObfuscatedName("fe.g")
    public boolean field2666 = false;

    @ObfuscatedName("fe.f")
    public volatile boolean[] field2665;

    @ObfuscatedName("fe.c")
    public static CRC32 field2667 = new CRC32();

    @ObfuscatedName("fe.ae")
    public int field2670;

    @ObfuscatedName("fe.ao")
    public int field2671;

    @ObfuscatedName("fe.ak")
    public int field2674 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2673 = arg0;
        this.field2663 = arg1;
        this.field2664 = arg2;
        this.field2666 = arg5;
        int var8 = this.field2664;
        if (Statics.field2556 == null) {
            class171.method95((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2707[var8] = this;
        } else {
            Statics.field2556.field1966 = var8 * 8 + 5;
            int var9 = Statics.field2556.method2362();
            int var10 = Statics.field2556.method2362();
            this.method3179(var9, var10);
        }
    }

    @ObfuscatedName("fe.bc(I)I")
    public int method3166() {
        if (this.field2669) {
            return 100;
        } else if (this.field2653 == null) {
            int var1 = Statics.method759(255, this.field2664);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fe.p(IB)V")
    public void method3090(int arg0) {
        int var2 = this.field2664;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2699.method3588(var3);
        if (var5 != null) {
            class171.field2698.method3666(var5);
        }
    }

    @ObfuscatedName("fe.o(II)V")
    public void method3099(int arg0) {
        if (this.field2673 == null || this.field2665 == null || !this.field2665[arg0]) {
            class171.method95(this, this.field2664, arg0, this.field2647[arg0], (byte) 2, true);
        } else {
            class170.method2678(arg0, this.field2673, this);
        }
    }

    @ObfuscatedName("fe.by(III)V")
    public void method3179(int arg0, int arg1) {
        this.field2670 = arg0;
        this.field2671 = arg1;
        if (this.field2663 == null) {
            class171.method95(this, 255, this.field2664, this.field2670, (byte) 0, true);
        } else {
            class170.method2678(this.field2664, this.field2663, this);
        }
    }

    @ObfuscatedName("fe.co(I[BZZB)V")
    public void method3167(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2656[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2656[arg0];
            if (this.field2673 != null) {
                class134 var12 = this.field2673;
                class169 var13 = new class169();
                var13.field2680 = 0;
                var13.field3107 = (long) arg0;
                var13.field2682 = arg1;
                var13.field2678 = var12;
                class199 var14 = class170.field2685;
                synchronized (class170.field2685) {
                    class170.field2685.method3633(var13);
                }
                Object var16 = class170.field2687;
                synchronized (class170.field2687) {
                    if (class170.field2686 == 0) {
                        Statics.field2001.method2762(new class170(), 5);
                    }
                    class170.field2686 = 600;
                }
                this.field2665[arg0] = true;
            }
            if (arg3) {
                this.field2653[arg0] = class125.method576(arg1, false);
            }
            return;
        }
        if (this.field2669) {
            throw new RuntimeException();
        }
        if (this.field2663 != null) {
            int var5 = this.field2664;
            class134 var6 = this.field2663;
            class169 var7 = new class169();
            var7.field2680 = 0;
            var7.field3107 = (long) var5;
            var7.field2682 = arg1;
            var7.field2678 = var6;
            class199 var8 = class170.field2685;
            synchronized (class170.field2685) {
                class170.field2685.method3633(var7);
            }
            Object var10 = class170.field2687;
            synchronized (class170.field2687) {
                if (class170.field2686 == 0) {
                    Statics.field2001.method2762(new class170(), 5);
                }
                class170.field2686 = 600;
            }
        }
        this.method3093(arg1);
        this.method3169();
    }

    @ObfuscatedName("fe.cv(Led;I[BZI)V")
    public void method3174(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2663 != arg0) {
            if (!arg3 && this.field2674 == arg1) {
                this.field2669 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2665[arg1] = false;
                if (this.field2666 || arg3) {
                    class171.method95(this, this.field2664, arg1, this.field2647[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2667.reset();
            field2667.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2667.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2647[arg1] != var9 || this.field2656[arg1] != var10) {
                this.field2665[arg1] = false;
                if (this.field2666 || arg3) {
                    class171.method95(this, this.field2664, arg1, this.field2647[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2665[arg1] = true;
            if (arg3) {
                this.field2653[arg1] = class125.method576(arg2, false);
            }
            return;
        }
        if (this.field2669) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method95(this, 255, this.field2664, this.field2670, (byte) 0, true);
            return;
        }
        field2667.reset();
        field2667.update(arg2, 0, arg2.length);
        int var5 = (int) field2667.getValue();
        class119 var6 = new class119(class167.method838(arg2));
        int var7 = var6.method2357();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2664 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2362();
        }
        if (this.field2670 != var5 || this.field2671 != var8) {
            class171.method95(this, 255, this.field2664, this.field2670, (byte) 0, true);
            return;
        }
        this.method3093(arg2);
        this.method3169();
    }

    @ObfuscatedName("fe.cx(I)V")
    public void method3169() {
        this.field2665 = new boolean[this.field2653.length];
        for (int var1 = 0; var1 < this.field2665.length; var1++) {
            this.field2665[var1] = false;
        }
        if (this.field2673 == null) {
            this.field2669 = true;
            return;
        }
        this.field2674 = -1;
        for (int var2 = 0; var2 < this.field2665.length; var2++) {
            if (this.field2651[var2] > 0) {
                class134 var3 = this.field2673;
                class169 var5 = new class169();
                var5.field2680 = 1;
                var5.field3107 = (long) var2;
                var5.field2678 = var3;
                var5.field2679 = this;
                class199 var6 = class170.field2685;
                synchronized (class170.field2685) {
                    class170.field2685.method3633(var5);
                }
                Object var8 = class170.field2687;
                synchronized (class170.field2687) {
                    if (class170.field2686 == 0) {
                        Statics.field2001.method2762(new class170(), 5);
                    }
                    class170.field2686 = 600;
                }
                this.field2674 = var2;
            }
        }
        if (this.field2674 == -1) {
            this.field2669 = true;
        }
    }

    @ObfuscatedName("fe.cg(II)I")
    public int method3181(int arg0) {
        if (this.field2653[arg0] == null) {
            return this.field2665[arg0] ? 100 : Statics.method759(this.field2664, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fe.ck(I)I")
    public int method3171() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2653.length; var3++) {
            if (this.field2651[var3] > 0) {
                var1 += 100;
                var2 += this.method3181(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
