package deob;

@ObfuscatedName("bp")
public final class class73 extends class222 {

    @ObfuscatedName("bp.f")
    public int field959;

    @ObfuscatedName("bp.w")
    public int field953;

    @ObfuscatedName("bp.v")
    public int field966;

    @ObfuscatedName("bp.s")
    public int field951;

    @ObfuscatedName("bp.z")
    public int field949;

    @ObfuscatedName("bp.j")
    public int field950;

    @ObfuscatedName("bp.i")
    public int field954;

    @ObfuscatedName("bp.n")
    public int field955;

    @ObfuscatedName("bp.l")
    public int field956;

    @ObfuscatedName("bp.k")
    public int field957;

    @ObfuscatedName("bp.c")
    public int field958;

    @ObfuscatedName("bp.r")
    public boolean field968 = false;

    @ObfuscatedName("bp.b")
    public double field960;

    @ObfuscatedName("bp.m")
    public double field961;

    @ObfuscatedName("bp.t")
    public double field962;

    @ObfuscatedName("bp.h")
    public double field963;

    @ObfuscatedName("bp.p")
    public double field964;

    @ObfuscatedName("bp.o")
    public double field948;

    @ObfuscatedName("bp.u")
    public double field952;

    @ObfuscatedName("bp.x")
    public double field967;

    @ObfuscatedName("bp.a")
    public int field965;

    @ObfuscatedName("bp.q")
    public int field969;

    @ObfuscatedName("bp.d")
    public class203 field970;

    @ObfuscatedName("bp.e")
    public int field971 = 0;

    @ObfuscatedName("bp.g")
    public int field972 = 0;

    public class73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field959 = arg0;
        this.field953 = arg1;
        this.field966 = arg2;
        this.field951 = arg3;
        this.field949 = arg4;
        this.field954 = arg5;
        this.field955 = arg6;
        this.field956 = arg7;
        this.field957 = arg8;
        this.field958 = arg9;
        this.field950 = arg10;
        this.field968 = false;
        int var12 = class193.method2221(this.field959).field2097;
        if (var12 == -1) {
            this.field970 = null;
        } else {
            this.field970 = class203.method2227(var12);
        }
    }

    @ObfuscatedName("bp.f(IIIII)V")
    public final void method2078(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field968) {
            double var5 = (double) (arg0 - this.field966);
            double var7 = (double) (arg1 - this.field951);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field960 = (double) this.field957 * var5 / var9 + (double) this.field966;
            this.field961 = (double) this.field957 * var7 / var9 + (double) this.field951;
            this.field962 = (double) this.field949;
        }
        double var11 = (double) (this.field955 + 1 - arg3);
        this.field963 = ((double) arg0 - this.field960) / var11;
        this.field964 = ((double) arg1 - this.field961) / var11;
        this.field948 = Math.sqrt(this.field964 * this.field964 + this.field963 * this.field963);
        if (!this.field968) {
            this.field952 = -this.field948 * Math.tan((double) this.field956 * 0.02454369D);
        }
        this.field967 = ((double) arg2 - this.field962 - this.field952 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("bp.v(IB)V")
    public final void method2079(int arg0) {
        this.field968 = true;
        this.field960 += (double) arg0 * this.field963;
        this.field961 += (double) arg0 * this.field964;
        this.field962 += this.field967 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field952;
        this.field952 += (double) arg0 * this.field967;
        this.field965 = (int) (Math.atan2(this.field963, this.field964) * 325.949D) + 1024 & 0x7FF;
        this.field969 = (int) (Math.atan2(this.field952, this.field948) * 325.949D) & 0x7FF;
        if (this.field970 == null) {
            return;
        }
        if (this.field970.method3769()) {
            this.field971 += arg0;
            int var2 = this.field970.method3754();
            if (this.field971 >= var2) {
                this.field971 = var2 - this.field970.field2282;
            }
            return;
        }
        this.field972 += arg0;
        while (true) {
            do {
                do {
                    if (this.field972 <= this.field970.field2296[this.field971]) {
                        return;
                    }
                    this.field972 -= this.field970.field2296[this.field971];
                    this.field971++;
                } while (this.field971 < this.field970.field2283.length);
                this.field971 -= this.field970.field2282;
            } while (this.field971 >= 0 && this.field971 < this.field970.field2283.length);
            this.field971 = 0;
        }
    }

    @ObfuscatedName("bp.w(I)Lhs;")
    public final class228 method1977() {
        class193 var1 = class193.method2221(this.field959);
        class228 var2 = var1.method3483(this.field971);
        if (var2 == null) {
            return null;
        } else {
            var2.method4353(this.field969);
            return var2;
        }
    }
}
