package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fr")
public class class168 extends class167 {

    @ObfuscatedName("fr.i")
    public class134 field2699;

    @ObfuscatedName("fr.j")
    public class134 field2693;

    @ObfuscatedName("fr.z")
    public int field2703;

    @ObfuscatedName("fr.m")
    public volatile boolean field2701 = false;

    @ObfuscatedName("fr.g")
    public boolean field2696 = false;

    @ObfuscatedName("fr.c")
    public volatile boolean[] field2697;

    @ObfuscatedName("fr.x")
    public static CRC32 field2695 = new CRC32();

    @ObfuscatedName("fr.ah")
    public int field2698;

    @ObfuscatedName("fr.ap")
    public int field2700;

    @ObfuscatedName("fr.aa")
    public int field2694 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2699 = arg0;
        this.field2693 = arg1;
        this.field2703 = arg2;
        this.field2696 = arg5;
        int var8 = this.field2703;
        if (Statics.field181 == null) {
            class171.method1511((class168) null, 255, 255, 0, (byte) 0, true);
            class171.field2737[var8] = this;
        } else {
            Statics.field181.field1974 = var8 * 8 + 5;
            int var9 = Statics.field181.method2342();
            int var10 = Statics.field181.method2342();
            this.method3159(var9, var10);
        }
    }

    @ObfuscatedName("fr.cu(B)I")
    public int method3134() {
        if (this.field2701) {
            return 100;
        } else if (this.field2682 == null) {
            int var1 = this.field2703;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field694 != null && Statics.field694.field3113 == var2) {
                var4 = Statics.field772.field1974 * 99 / (Statics.field772.field1977.length - Statics.field694.field2745) + 1;
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

    @ObfuscatedName("fr.e(II)V")
    public void method3091(int arg0) {
        class171.method1753(this.field2703, arg0);
    }

    @ObfuscatedName("fr.d(II)V")
    public void method3080(int arg0) {
        if (this.field2699 == null || this.field2697 == null || !this.field2697[arg0]) {
            class171.method1511(this, this.field2703, arg0, this.field2685[arg0], (byte) 2, true);
            return;
        }
        class134 var2 = this.field2699;
        byte[] var4 = null;
        class199 var5 = class170.field2716;
        synchronized (class170.field2716) {
            for (class169 var6 = (class169) class170.field2716.method3581(); var6 != null; var6 = (class169) class170.field2716.method3583()) {
                if ((long) arg0 == var6.field3113 && var6.field2707 == var2 && var6.field2706 == 0) {
                    var4 = var6.field2708;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var8 = var2.method2701(arg0);
            this.method3137(var2, arg0, var8, true);
        } else {
            this.method3137(var2, arg0, var4, true);
        }
    }

    @ObfuscatedName("fr.cc(IIS)V")
    public void method3159(int arg0, int arg1) {
        this.field2698 = arg0;
        this.field2700 = arg1;
        if (this.field2693 == null) {
            class171.method1511(this, 255, this.field2703, this.field2698, (byte) 0, true);
            return;
        }
        int var3 = this.field2703;
        class134 var4 = this.field2693;
        byte[] var6 = null;
        class199 var7 = class170.field2716;
        synchronized (class170.field2716) {
            for (class169 var8 = (class169) class170.field2716.method3581(); var8 != null; var8 = (class169) class170.field2716.method3583()) {
                if ((long) var3 == var8.field3113 && var8.field2707 == var4 && var8.field2706 == 0) {
                    var6 = var8.field2708;
                    break;
                }
            }
        }
        if (var6 == null) {
            byte[] var10 = var4.method2701(var3);
            this.method3137(var4, var3, var10, true);
        } else {
            this.method3137(var4, var3, var6, true);
        }
    }

    @ObfuscatedName("fr.ce(I[BZZS)V")
    public void method3136(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (!arg2) {
            arg1[arg1.length - 2] = (byte) (this.field2677[arg0] >> 8);
            arg1[arg1.length - 1] = (byte) this.field2677[arg0];
            if (this.field2699 != null) {
                class134 var10 = this.field2699;
                class169 var11 = new class169();
                var11.field2706 = 0;
                var11.field3113 = (long) arg0;
                var11.field2708 = arg1;
                var11.field2707 = var10;
                class199 var12 = class170.field2716;
                synchronized (class170.field2716) {
                    class170.field2716.method3589(var11);
                }
                class170.method2589();
                this.field2697[arg0] = true;
            }
            if (arg3) {
                this.field2682[arg0] = class125.method929(arg1, false);
            }
            return;
        }
        if (this.field2701) {
            throw new RuntimeException();
        }
        if (this.field2693 != null) {
            int var5 = this.field2703;
            class134 var6 = this.field2693;
            class169 var7 = new class169();
            var7.field2706 = 0;
            var7.field3113 = (long) var5;
            var7.field2708 = arg1;
            var7.field2707 = var6;
            class199 var8 = class170.field2716;
            synchronized (class170.field2716) {
                class170.field2716.method3589(var7);
            }
            class170.method2589();
        }
        this.method3055(arg1);
        this.method3138();
    }

    @ObfuscatedName("fr.cj(Leb;I[BZI)V")
    public void method3137(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2693 != arg0) {
            if (!arg3 && this.field2694 == arg1) {
                this.field2701 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2697[arg1] = false;
                if (this.field2696 || arg3) {
                    class171.method1511(this, this.field2703, arg1, this.field2685[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2695.reset();
            field2695.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2695.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2685[arg1] != var9 || this.field2677[arg1] != var10) {
                this.field2697[arg1] = false;
                if (this.field2696 || arg3) {
                    class171.method1511(this, this.field2703, arg1, this.field2685[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2697[arg1] = true;
            if (arg3) {
                this.field2682[arg1] = class125.method929(arg2, false);
            }
            return;
        }
        if (this.field2701) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method1511(this, 255, this.field2703, this.field2698, (byte) 0, true);
            return;
        }
        field2695.reset();
        field2695.update(arg2, 0, arg2.length);
        int var5 = (int) field2695.getValue();
        class119 var6 = new class119(class167.method717(arg2));
        int var7 = var6.method2427();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2703 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2342();
        }
        if (this.field2698 != var5 || this.field2700 != var8) {
            class171.method1511(this, 255, this.field2703, this.field2698, (byte) 0, true);
            return;
        }
        this.method3055(arg2);
        this.method3138();
    }

    @ObfuscatedName("fr.ci(I)V")
    public void method3138() {
        this.field2697 = new boolean[this.field2682.length];
        for (int var1 = 0; var1 < this.field2697.length; var1++) {
            this.field2697[var1] = false;
        }
        if (this.field2699 == null) {
            this.field2701 = true;
            return;
        }
        this.field2694 = -1;
        for (int var2 = 0; var2 < this.field2697.length; var2++) {
            if (this.field2674[var2] > 0) {
                class170.method2956(var2, this.field2699, this);
                this.field2694 = var2;
            }
        }
        if (this.field2694 == -1) {
            this.field2701 = true;
        }
    }

    @ObfuscatedName("fr.cs(IB)I")
    public int method3149(int arg0) {
        if (this.field2682[arg0] != null) {
            return 100;
        } else if (this.field2697[arg0]) {
            return 100;
        } else {
            int var2 = this.field2703;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field694 != null && Statics.field694.field3113 == var3) {
                var5 = Statics.field772.field1974 * 99 / (Statics.field772.field1977.length - Statics.field694.field2745) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fr.cp(I)I")
    public int method3160() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2682.length; var3++) {
            if (this.field2674[var3] > 0) {
                var1 += 100;
                var2 += this.method3149(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
