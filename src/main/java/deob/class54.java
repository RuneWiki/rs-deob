package deob;

@ObfuscatedName("f")
public final class class54 extends class144 {

    @ObfuscatedName("f.f")
    public int field449;

    @ObfuscatedName("f.g")
    public int field468;

    @ObfuscatedName("f.d")
    public int field470 = 0;

    @ObfuscatedName("f.e")
    public int field454;

    @ObfuscatedName("f.b")
    public int field467;

    @ObfuscatedName("f.c")
    public double field464;

    @ObfuscatedName("f.n")
    public int field452;

    @ObfuscatedName("f.o")
    public int field448;

    @ObfuscatedName("f.l")
    public double field446;

    @ObfuscatedName("f.m")
    public double field462;

    @ObfuscatedName("f.j")
    public int field469;

    @ObfuscatedName("f.k")
    public class166 field471;

    @ObfuscatedName("f.h")
    public int field450;

    @ObfuscatedName("f.i")
    public double field460;

    @ObfuscatedName("f.w")
    public double field459;

    @ObfuscatedName("f.v")
    public double field463;

    @ObfuscatedName("f.u")
    public double field465;

    @ObfuscatedName("f.t")
    public int field466;

    @ObfuscatedName("f.s")
    public double field461;

    @ObfuscatedName("f.r")
    public int field472;

    @ObfuscatedName("f.q")
    public int field453 = 0;

    @ObfuscatedName("f.p")
    public int field447;

    @ObfuscatedName("f.z")
    public boolean field457 = false;

    @ObfuscatedName("f.y")
    public int field455;

    @ObfuscatedName("f.x")
    public int field458;

    @ObfuscatedName("f.j(IIIII)V")
    public final void method782(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field457) {
            double var5 = (double) (arg0 - this.field448);
            double var7 = (double) (arg1 - this.field466);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field446 = (double) this.field449 * var5 / var9 + (double) this.field448;
            this.field459 = (double) this.field449 * var7 / var9 + (double) this.field466;
            this.field460 = (double) this.field450;
        }
        double var11 = (double) (this.field468 + 1 - arg3);
        this.field461 = ((double) arg0 - this.field446) / var11;
        this.field462 = ((double) arg1 - this.field459) / var11;
        this.field463 = Math.sqrt(this.field462 * this.field462 + this.field461 * this.field461);
        if (!this.field457) {
            this.field464 = -this.field463 * Math.tan((double) this.field454 * 0.02454369D);
        }
        this.field465 = ((double) arg2 - this.field460 - this.field464 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("f.o(II)V")
    public final void method783(int arg0) {
        this.field457 = true;
        this.field446 += (double) arg0 * this.field461;
        this.field459 += (double) arg0 * this.field462;
        this.field460 += this.field465 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field464;
        this.field464 += (double) arg0 * this.field465;
        this.field455 = (int) (Math.atan2(this.field461, this.field462) * 325.949D) + 1024 & 0x7FF;
        this.field467 = (int) (Math.atan2(this.field464, this.field463) * 325.949D) & 0x7FF;
        if (this.field471 == null) {
            return;
        }
        this.field470 += arg0;
        while (true) {
            do {
                do {
                    if (this.field470 <= this.field471.field2531[this.field453]) {
                        return;
                    }
                    this.field470 -= this.field471.field2531[this.field453];
                    this.field453++;
                } while (this.field453 < this.field471.field2529.length);
                this.field453 -= this.field471.field2533;
            } while (this.field453 >= 0 && this.field453 < this.field471.field2529.length);
            this.field453 = 0;
        }
    }

    @ObfuscatedName("f.p(B)Ldi;")
    public final class41 method784() {
        class173 var1 = class173.method2209(this.field469);
        class41 var2 = var1.method3335(this.field453);
        if (var2 == null) {
            return null;
        } else {
            var2.method653(this.field467);
            return var2;
        }
    }

    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field469 = arg0;
        this.field447 = arg1;
        this.field448 = arg2;
        this.field466 = arg3;
        this.field450 = arg4;
        this.field452 = arg5;
        this.field468 = arg6;
        this.field454 = arg7;
        this.field449 = arg8;
        this.field458 = arg9;
        this.field472 = arg10;
        this.field457 = false;
        int var12 = class173.method2209(this.field469).field2605;
        if (var12 == -1) {
            this.field471 = null;
        } else {
            this.field471 = class166.method274(var12);
        }
    }
}
