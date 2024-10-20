package deob;

import java.util.zip.CRC32;

@ObfuscatedName("fb")
public class class168 extends class167 {

    @ObfuscatedName("fb.u")
    public class134 field2680;

    @ObfuscatedName("fb.a")
    public class134 field2678;

    @ObfuscatedName("fb.x")
    public int field2673;

    @ObfuscatedName("fb.y")
    public volatile boolean field2674 = false;

    @ObfuscatedName("fb.c")
    public boolean field2675 = false;

    @ObfuscatedName("fb.h")
    public volatile boolean[] field2676;

    @ObfuscatedName("fb.e")
    public static CRC32 field2677 = new CRC32();

    @ObfuscatedName("fb.ab")
    public int field2683;

    @ObfuscatedName("fb.af")
    public int field2679;

    @ObfuscatedName("fb.au")
    public int field2672 = -1;

    public class168(class134 arg0, class134 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2680 = arg0;
        this.field2678 = arg1;
        this.field2673 = arg2;
        this.field2675 = arg5;
        class171.method573(this, this.field2673);
    }

    @ObfuscatedName("fb.cl(I)I")
    public int method3121() {
        if (this.field2674) {
            return 100;
        } else if (this.field2655 == null) {
            int var1 = this.field2673;
            long var2 = (long) (var1 + 16711680);
            int var4;
            if (Statics.field2633 != null && Statics.field2633.field3105 == var2) {
                var4 = Statics.field278.field1994 * 99 / (Statics.field278.field2000.length - Statics.field2633.field2726) + 1;
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

    @ObfuscatedName("fb.s(IB)V")
    public void method3037(int arg0) {
        int var2 = this.field2673;
        long var3 = (long) ((var2 << 16) + arg0);
        class172 var5 = (class172) class171.field2713.method3532(var3);
        if (var5 != null) {
            class171.field2709.method3622(var5);
        }
    }

    @ObfuscatedName("fb.w(II)V")
    public void method3098(int arg0) {
        if (this.field2680 == null || this.field2676 == null || !this.field2676[arg0]) {
            class171.method926(this, this.field2673, arg0, this.field2656[arg0], (byte) 2, true);
        } else {
            class170.method2061(arg0, this.field2680, this);
        }
    }

    @ObfuscatedName("fb.cy(III)V")
    public void method3134(int arg0, int arg1) {
        this.field2683 = arg0;
        this.field2679 = arg1;
        if (this.field2678 == null) {
            class171.method926(this, 255, this.field2673, this.field2683, (byte) 0, true);
        } else {
            class170.method2061(this.field2673, this.field2678, this);
        }
    }

    @ObfuscatedName("fb.cv(I[BZZI)V")
    public void method3125(int arg0, byte[] arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            if (this.field2674) {
                throw new RuntimeException();
            }
            if (this.field2678 != null) {
                class170.method2041(this.field2673, arg1, this.field2678);
            }
            this.method3036(arg1);
            this.method3123();
            return;
        }
        arg1[arg1.length - 2] = (byte) (this.field2652[arg0] >> 8);
        arg1[arg1.length - 1] = (byte) this.field2652[arg0];
        if (this.field2680 != null) {
            class170.method2041(arg0, arg1, this.field2680);
            this.field2676[arg0] = true;
        }
        if (arg3) {
            this.field2655[arg0] = class125.method739(arg1, false);
        }
    }

    @ObfuscatedName("fb.ct(Len;I[BZI)V")
    public void method3122(class134 arg0, int arg1, byte[] arg2, boolean arg3) {
        if (this.field2678 != arg0) {
            if (!arg3 && this.field2672 == arg1) {
                this.field2674 = true;
            }
            if (arg2 == null || arg2.length <= 2) {
                this.field2676[arg1] = false;
                if (this.field2675 || arg3) {
                    class171.method926(this, this.field2673, arg1, this.field2656[arg1], (byte) 2, arg3);
                }
                return;
            }
            field2677.reset();
            field2677.update(arg2, 0, arg2.length - 2);
            int var9 = (int) field2677.getValue();
            int var10 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
            if (this.field2656[arg1] != var9 || this.field2652[arg1] != var10) {
                this.field2676[arg1] = false;
                if (this.field2675 || arg3) {
                    class171.method926(this, this.field2673, arg1, this.field2656[arg1], (byte) 2, arg3);
                }
                return;
            }
            this.field2676[arg1] = true;
            if (arg3) {
                this.field2655[arg1] = class125.method739(arg2, false);
            }
            return;
        }
        if (this.field2674) {
            throw new RuntimeException();
        }
        if (arg2 == null) {
            class171.method926(this, 255, this.field2673, this.field2683, (byte) 0, true);
            return;
        }
        field2677.reset();
        field2677.update(arg2, 0, arg2.length);
        int var5 = (int) field2677.getValue();
        class119 var6 = new class119(class167.method2156(arg2));
        int var7 = var6.method2363();
        if (var7 != 5 && var7 != 6) {
            throw new RuntimeException(var7 + "," + this.field2673 + "," + arg1);
        }
        int var8 = 0;
        if (var7 >= 6) {
            var8 = var6.method2368();
        }
        if (this.field2683 != var5 || this.field2679 != var8) {
            class171.method926(this, 255, this.field2673, this.field2683, (byte) 0, true);
            return;
        }
        this.method3036(arg2);
        this.method3123();
    }

    @ObfuscatedName("fb.ck(B)V")
    public void method3123() {
        this.field2676 = new boolean[this.field2655.length];
        for (int var1 = 0; var1 < this.field2676.length; var1++) {
            this.field2676[var1] = false;
        }
        if (this.field2680 == null) {
            this.field2674 = true;
            return;
        }
        this.field2672 = -1;
        for (int var2 = 0; var2 < this.field2676.length; var2++) {
            if (this.field2658[var2] > 0) {
                class134 var3 = this.field2680;
                class169 var5 = new class169();
                var5.field2690 = 1;
                var5.field3105 = (long) var2;
                var5.field2684 = var3;
                var5.field2687 = this;
                class199 var6 = class170.field2696;
                synchronized (class170.field2696) {
                    class170.field2696.method3559(var5);
                }
                class170.method2932();
                this.field2672 = var2;
            }
        }
        if (this.field2672 == -1) {
            this.field2674 = true;
        }
    }

    @ObfuscatedName("fb.cm(II)I")
    public int method3120(int arg0) {
        if (this.field2655[arg0] != null) {
            return 100;
        } else if (this.field2676[arg0]) {
            return 100;
        } else {
            int var2 = this.field2673;
            long var3 = (long) ((var2 << 16) + arg0);
            int var5;
            if (Statics.field2633 != null && Statics.field2633.field3105 == var3) {
                var5 = Statics.field278.field1994 * 99 / (Statics.field278.field2000.length - Statics.field2633.field2726) + 1;
            } else {
                var5 = 0;
            }
            return var5;
        }
    }

    @ObfuscatedName("fb.cc(I)I")
    public int method3124() {
        int var1 = 0;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2655.length; var3++) {
            if (this.field2658[var3] > 0) {
                var1 += 100;
                var2 += this.method3120(var3);
            }
        }
        if (var1 == 0) {
            return 100;
        } else {
            return var2 * 100 / var1;
        }
    }
}
