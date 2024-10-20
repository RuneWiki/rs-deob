package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fs")
public class class168 extends class167 {

    @ObfuscatedName("fs.u")
    public class134 field2679;

    @ObfuscatedName("fs.o")
    public class134 field2676;

    @ObfuscatedName("fs.k")
    public int field2678;

    @ObfuscatedName("fs.a")
    public volatile boolean field2686 = false;

    @ObfuscatedName("fs.j")
    public boolean field2680 = false;

    @ObfuscatedName("fs.p")
    public volatile boolean[] field2681;

    @ObfuscatedName("fs.w")
    public static CRC32 field2682 = new CRC32();

    @ObfuscatedName("fs.au")
    public int field2683;

    @ObfuscatedName("fs.ar")
    public int field2684;

    @ObfuscatedName("fs.ah")
    public int field2685 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2679 = arg0;
        this.field2676 = arg1;
        this.field2678 = arg2;
        this.field2680 = arg5;
        int var8 = this.field2678;
        if (Statics.field2986 == null) {
            class171.method993((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2719[var8] = this;
        } else {
            Statics.field2986.field1980 = var8 * 8 + 5;
            int var9 = Statics.field2986.method2350();
            int var10 = Statics.field2986.method2350();
            this.method3110(var9, var10);
        }
    }

    @ObfuscatedName("fs.bp(I)I")
    public int method3115() {
        if (this.field2686) {
            return 100;
        } else if (this.field2667 == null) {
            int var1 = class171.method2892(255, this.field2678);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("fs.v(IB)V")
    public void method3034(int arg0) {
        int var2 = this.field2678;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2708.method3496(var3);
        if (var5 != null) {
            class171.field2709.method3587(var5);
        }
    }

    @ObfuscatedName("fs.m(II)V")
    public void method3042(int arg0) {
        if (this.field2679 == null || this.field2681 == null || !this.field2681[arg0]) {
            class171.method993(this, this.field2678, arg0, this.field2674[arg0], (byte) 2, true);
            return;
        }
        class134 var2 = this.field2679;
        byte[] var4 = null;
        class199 var5 = class170.field2695;
        synchronized (class170.field2695) {
            for (class169 var6 = (class169) class170.field2695.method3534(); var6 != null; var6 = (class169) class170.field2695.method3536()) {
                if ((long) arg0 == var6.field3100 && var6.field2694 == var2 && var6.field2691 == 0) {
                    var4 = var6.field2690;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2681(arg0);
            this.method3113(var2, arg0, var8, true);
        } else {
            this.method3113(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fs.ck(III)V")
    public void method3110(int arg0, int arg1) {
        this.field2683 = arg0;
        this.field2684 = arg1;
        if (this.field2676 == null) {
            class171.method993(this, 255, this.field2678, this.field2683, (byte) 0, true);
            return;
        }
        int var3 = this.field2678;
        class134 var4 = this.field2676;
        byte[] var6 = null;
        class199 var7 = class170.field2695;
        synchronized (class170.field2695) {
            for (class169 var8 = (class169) class170.field2695.method3534(); var8 != null; var8 = (class169) class170.field2695.method3536()) {
                if ((long) var3 == var8.field3100 && var8.field2694 == var4 && var8.field2691 == 0) {
                    var6 = var8.field2690;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2681(var3);
            this.method3113(var4, var3, var10, true);
        } else {
            this.method3113(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fs.cs(I[BZZI)V")
    public void method3121(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2662[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2662[arg0];
            if (this.field2679 != null) {
                class134 var12 = this.field2679;
                class169 var13 = new class169();
                var13.field2691 = 0;
                var13.field3100 = (long) arg0;
                var13.field2690 = arg1;
                var13.field2694 = var12;
                class199 var14 = class170.field2695;
                synchronized (class170.field2695) {
                    class170.field2695.method3529(var13);
                }
                Object var16 = class170.field2698;
                synchronized (class170.field2698) {
                    if (class170.field2697 == 0) {
                        Statics.field2889.method2697(new class170(), 5);
                    }
                    class170.field2697 = 600;
                }
                this.field2681[arg0] = true;
            }
            if (arg3) {
                this.field2667[arg0] = class125.method753(arg1, false);
            }
            return;
        }
        if (this.field2686) {
            throw new RuntimeException();
        }
        if (this.field2676 != null) {
            int var5 = this.field2678;
            class134 var6 = this.field2676;
            class169 var7 = new class169();
            var7.field2691 = 0;
            var7.field3100 = (long) var5;
            var7.field2690 = arg1;
            var7.field2694 = var6;
            class199 var8 = class170.field2695;
            synchronized (class170.field2695) {
                class170.field2695.method3529(var7);
            }
            Object var10 = class170.field2698;
            synchronized (class170.field2698) {
                if (class170.field2697 == 0) {
                    Statics.field2889.method2697(new class170(), 5);
                }
                class170.field2697 = 600;
            }
        }
        this.method3033(arg1);
        this.method3112();
    }

    @ObfuscatedName("fs.ca(Lec;I[BZI)V")
    public void method3113(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2676 != arg0) {
            if (!arg3 && this.field2685 == arg1) {
                this.field2686 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2681[arg1] = false;
                if (this.field2680 || arg3) {
                    class171.method993(this, this.field2678, arg1, this.field2674[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2682.reset();
            field2682.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2682.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2674[arg1] != var9 || this.field2662[arg1] != var10) {
                this.field2681[arg1] = false;
                if (this.field2680 || arg3) {
                    class171.method993(this, this.field2678, arg1, this.field2674[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2681[arg1] = true;
            if (arg3) {
                this.field2667[arg1] = class125.method753(arg2, false);
            }
            return;
        }
        if (this.field2686) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method993(this, 255, this.field2678, this.field2683, (byte) 0, true);
            return;
        }
        field2682.reset();
        field2682.update(arg2, 0, arg2.length);
        int var5 = (int) field2682.getValue();
        class119 var6 = new class119(class167.method2690(arg2));
        int var7 = var6.method2380();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2678 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2350();
        }
        if (this.field2683 != var5 || this.field2684 != var8) {
            class171.method993(this, 255, this.field2678, this.field2683, (byte) 0, true);
            return;
        }
        this.method3033(arg2);
        this.method3112();
    }

    @ObfuscatedName("fs.cr(I)V")
    public void method3112() {
        this.field2681 = new boolean[this.field2667.length];
        for (int var1 = 0; var1 < this.field2681.length; var1++) {
            this.field2681[var1] = false;
        }
        if (this.field2679 == null) {
            this.field2686 = true;
            return;
        }
        this.field2685 = -1;
        for (int var2 = 0; var2 < this.field2681.length; var2++) {
            if (this.field2663[var2] > 0) {
                class134 var3 = this.field2679;
                class169 var5 = new class169();
                var5.field2691 = 1;
                var5.field3100 = (long) var2;
                var5.field2694 = var3;
                var5.field2692 = this;
                class199 var6 = class170.field2695;
                synchronized (class170.field2695) {
                    class170.field2695.method3529(var5);
                }
                Object var8 = class170.field2698;
                synchronized (class170.field2698) {
                    if (class170.field2697 == 0) {
                        Statics.field2889.method2697(new class170(), 5);
                    }
                    class170.field2697 = 600;
                }
                this.field2685 = var2;
            }
        }
        if (this.field2685 == -1) {
            this.field2686 = true;
        }
    }

    @ObfuscatedName("fs.cu(II)I")
    public int method3130(int arg0) {
        if (this.field2667[arg0] == null) {
            return this.field2681[arg0] ? 100 : class171.method2892(this.field2678, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("fs.cd(I)I")
    public int method3114() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2667.length; var3++) {
            if (this.field2663[var3] > 0) {
                var1 += 100;
                var2 += this.method3130(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
