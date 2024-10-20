package deob;

@ObfuscatedName("j")
public final class class72 extends class145 {

    @ObfuscatedName("j.f")
    public int field808;

    @ObfuscatedName("j.g")
    public boolean field812 = false;

    @ObfuscatedName("j.d")
    public int field806;

    @ObfuscatedName("j.e")
    public double field829;

    @ObfuscatedName("j.b")
    public int field815;

    @ObfuscatedName("j.c")
    public int field810 = 0;

    @ObfuscatedName("j.a")
    public int field822;

    @ObfuscatedName("j.n")
    public double field819;

    @ObfuscatedName("j.o")
    public double field813;

    @ObfuscatedName("j.l")
    public int field807;

    @ObfuscatedName("j.m")
    public int field824 = 0;

    @ObfuscatedName("j.j")
    public int field817;

    @ObfuscatedName("j.k")
    public int field803;

    @ObfuscatedName("j.h")
    public int field802;

    @ObfuscatedName("j.i")
    public double field801;

    @ObfuscatedName("j.w")
    public int field814;

    @ObfuscatedName("j.u")
    public double field805;

    @ObfuscatedName("j.t")
    public int field818;

    @ObfuscatedName("j.s")
    public int field809;

    @ObfuscatedName("j.r")
    public double field804;

    @ObfuscatedName("j.q")
    public double field820;

    @ObfuscatedName("j.p")
    public class173 field823;

    @ObfuscatedName("j.z")
    public double field816;

    @ObfuscatedName("j.y")
    public int field821;

    @ObfuscatedName("j.x")
    public int field811;

    public class72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field815 = arg0;
        this.field802 = arg1;
        this.field803 = arg2;
        this.field814 = arg3;
        this.field818 = arg4;
        this.field807 = arg5;
        this.field808 = arg6;
        this.field809 = arg7;
        this.field817 = arg8;
        this.field811 = arg9;
        this.field806 = arg10;
        this.field812 = false;
        int var12 = class184.method1375(this.field815).field2814;
        if (var12 == -1) {
            this.field823 = null;
        } else {
            this.field823 = class173.method3098(var12);
        }
    }

    @ObfuscatedName("j.b(IIIII)V")
    public final void method1158(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field812) {
            double var5 = (double) (arg0 - this.field803);
            double var7 = (double) (arg1 - this.field814);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field813 = (double) this.field817 * var5 / var9 + (double) this.field803;
            this.field829 = (double) this.field817 * var7 / var9 + (double) this.field814;
            this.field820 = (double) this.field818;
        }
        double var11 = (double) (this.field808 + 1 - arg3);
        this.field816 = ((double) arg0 - this.field813) / var11;
        this.field801 = ((double) arg1 - this.field829) / var11;
        this.field804 = Math.sqrt(this.field816 * this.field816 + this.field801 * this.field801);
        if (!this.field812) {
            this.field819 = -this.field804 * Math.tan((double) this.field809 * 0.02454369D);
        }
        this.field805 = ((double) arg2 - this.field820 - this.field819 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("j.h(I)Ldu;")
    public final class27 method1087() {
        class184 var1 = class184.method1375(this.field815);
        class27 var2 = var1.method3339(this.field824);
        if (var2 == null) {
            return null;
        } else {
            var2.method398(this.field822);
            return var2;
        }
    }

    @ObfuscatedName("j.k(II)V")
    public final void method1164(int arg0) {
        this.field812 = true;
        this.field813 += (double) arg0 * this.field816;
        this.field829 += (double) arg0 * this.field801;
        this.field820 += this.field805 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field819;
        this.field819 += (double) arg0 * this.field805;
        this.field821 = (int) (Math.atan2(this.field816, this.field801) * 325.949D) + 1024 & 0x7FF;
        this.field822 = (int) (Math.atan2(this.field819, this.field804) * 325.949D) & 0x7FF;
        if (this.field823 == null) {
            return;
        }
        this.field810 += arg0;
        while (true) {
            do {
                do {
                    if (this.field810 <= this.field823.field2588[this.field824]) {
                        return;
                    }
                    this.field810 -= this.field823.field2588[this.field824];
                    this.field824++;
                } while (this.field824 < this.field823.field2584.length);
                this.field824 -= this.field823.field2575;
            } while (this.field824 >= 0 && this.field824 < this.field823.field2584.length);
            this.field824 = 0;
        }
    }
}
