package deob;

import java.util.zip.CRC32;

@ObfuscatedName("ft")
public class class168 extends class167 {

    @ObfuscatedName("ft.j")
    public class134 field2683;

    @ObfuscatedName("ft.b")
    public class134 field2684;

    @ObfuscatedName("ft.r")
    public int field2685;

    @ObfuscatedName("ft.n")
    public volatile boolean field2695 = false;

    @ObfuscatedName("ft.c")
    public boolean field2687 = false;

    @ObfuscatedName("ft.k")
    public volatile boolean[] field2690;

    @ObfuscatedName("ft.x")
    public static CRC32 field2689 = new CRC32();

    @ObfuscatedName("ft.ar")
    public int field2694;

    @ObfuscatedName("ft.as")
    public int field2691;

    @ObfuscatedName("ft.ac")
    public int field2692 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2683 = arg0;
        this.field2684 = arg1;
        this.field2685 = arg2;
        this.field2687 = arg5;
        int var8 = this.field2685;
        if (Statics.field1991 == null) {
            class171.method837((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2729[var8] = this;
        } else {
            Statics.field1991.field1984 = var8 * 8 + 5;
            int var9 = Statics.field1991.method2295();
            int var10 = Statics.field1991.method2295();
            this.method3053(var9, var10);
        }
    }

    @ObfuscatedName("ft.cq(S)I")
    public int method3061() {
        if (this.field2695) {
            return 100;
        } else if (this.field2675 == null) {
            int var1 = class171.method152(255, this.field2685);
            if (var1 >= 100) {
                var1 = 99;
            }
            return var1;
        } else {
            return 99;
        }
    }

    @ObfuscatedName("ft.f(IB)V")
    public void method3028(int arg0) {
        int var2 = this.field2685;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2720.method3482(var3);
        if (var5 != null) {
            class171.field2713.method3575(var5);
        }
    }

    @ObfuscatedName("ft.g(II)V")
    public void method2982(int arg0) {
        if (this.field2683 == null || this.field2690 == null || !this.field2690[arg0]) {
            class171.method837(this, this.field2685, arg0, this.field2669[arg0], (byte) 2, true);
            return;
        }
        class134 var2 = this.field2683;
        byte[] var4 = null;
        class199 var5 = class170.field2711;
        synchronized (class170.field2711) {
            for (class169 var6 = (class169) class170.field2711.method3520(); var6 != null; var6 = (class169) class170.field2711.method3522()) {
                if ((long) arg0 == var6.field3097 && var6.field2701 == var2 && var6.field2697 == 0) {
                    var4 = var6.field2698;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2632(arg0);
            this.method3055(var2, arg0, var8, true);
        } else {
            this.method3055(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("ft.ce(IIB)V")
    public void method3053(int arg0, int arg1) {
        this.field2694 = arg0;
        this.field2691 = arg1;
        if (this.field2684 == null) {
            class171.method837(this, 255, this.field2685, this.field2694, (byte) 0, true);
            return;
        }
        int var3 = this.field2685;
        class134 var4 = this.field2684;
        byte[] var6 = null;
        class199 var7 = class170.field2711;
        synchronized (class170.field2711) {
            for (class169 var8 = (class169) class170.field2711.method3520(); var8 != null; var8 = (class169) class170.field2711.method3522()) {
                if ((long) var3 == var8.field3097 && var8.field2701 == var4 && var8.field2697 == 0) {
                    var6 = var8.field2698;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2632(var3);
            this.method3055(var4, var3, var10, true);
        } else {
            this.method3055(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("ft.co(I[BZZB)V")
    public void method3054(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2695) {
                throw new RuntimeException();
            }
            if (this.field2684 != null) {
                Statics.method954(this.field2685, arg1, this.field2684);
            }
            this.method2972(arg1);
            this.method3056();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2670[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2670[arg0];
        if (this.field2683 != null) {
            Statics.method954(arg0, arg1, this.field2683);
            this.field2690[arg0] = true;
        }
        if (arg3) {
            this.field2675[arg0] = class125.method612(arg1, false);
        }
    }

    @ObfuscatedName("ft.cp(Len;I[BZI)V")
    public void method3055(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2684 != arg0) {
            if (!arg3 && this.field2692 == arg1) {
                this.field2695 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2690[arg1] = false;
                if (this.field2687 || arg3) {
                    class171.method837(this, this.field2685, arg1, this.field2669[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2689.reset();
            field2689.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2689.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2669[arg1] != var9 || this.field2670[arg1] != var10) {
                this.field2690[arg1] = false;
                if (this.field2687 || arg3) {
                    class171.method837(this, this.field2685, arg1, this.field2669[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2690[arg1] = true;
            if (arg3) {
                this.field2675[arg1] = class125.method612(arg2, false);
            }
            return;
        }
        if (this.field2695) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method837(this, 255, this.field2685, this.field2694, (byte) 0, true);
            return;
        }
        field2689.reset();
        field2689.update(arg2, 0, arg2.length);
        int var5 = (int) field2689.getValue();
        class119 var6 = new class119(class167.method148(arg2));
        int var7 = var6.method2290();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2685 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2295();
        }
        if (this.field2694 != var5 || this.field2691 != var8) {
            class171.method837(this, 255, this.field2685, this.field2694, (byte) 0, true);
            return;
        }
        this.method2972(arg2);
        this.method3056();
    }

    @ObfuscatedName("ft.cv(I)V")
    public void method3056() {
        this.field2690 = new boolean[this.field2675.length];
        for (int var1 = 0; var1 < this.field2690.length; var1++) {
            this.field2690[var1] = false;
        }
        if (this.field2683 == null) {
            this.field2695 = true;
            return;
        }
        this.field2692 = -1;
        for (int var2 = 0; var2 < this.field2690.length; var2++) {
            if (this.field2671[var2] > 0) {
                class170.method1453(var2, this.field2683, this);
                this.field2692 = var2;
            }
        }
        if (this.field2692 == -1) {
            this.field2695 = true;
        }
    }

    @ObfuscatedName("ft.ch(IB)I")
    public int method3057(int arg0) {
        if (this.field2675[arg0] == null) {
            return this.field2690[arg0] ? 100 : class171.method152(this.field2685, arg0);
        } else {
            return 100;
        }
    }

    @ObfuscatedName("ft.cn(I)I")
    public int method3059() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2675.length; var3++) {
            if (this.field2671[var3] > 0) {
                var1 += 100;
                var2 += this.method3057(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
