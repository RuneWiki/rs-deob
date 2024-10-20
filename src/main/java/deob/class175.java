package deob;

@ObfuscatedName("fx")
public final class class175 extends class166 {

    @ObfuscatedName("fx.r")
    public int field2586;

    @ObfuscatedName("fx.d")
    public int field2569;

    @ObfuscatedName("fx.k")
    public int field2570;

    @ObfuscatedName("fx.u")
    public int field2571;

    @ObfuscatedName("fx.v")
    public int field2572;

    @ObfuscatedName("fx.f")
    public int field2573;

    @ObfuscatedName("fx.s")
    public int field2574;

    @ObfuscatedName("fx.j")
    public int field2575;

    @ObfuscatedName("fx.e")
    public int field2576;

    @ObfuscatedName("fx.t")
    public int field2587;

    @ObfuscatedName("fx.y")
    public int field2578;

    @ObfuscatedName("fx.b")
    public boolean field2579 = false;

    @ObfuscatedName("fx.w")
    public double field2582;

    @ObfuscatedName("fx.g")
    public double field2577;

    @ObfuscatedName("fx.p")
    public double field2585;

    @ObfuscatedName("fx.z")
    public double field2583;

    @ObfuscatedName("fx.n")
    public double field2584;

    @ObfuscatedName("fx.x")
    public double field2580;

    @ObfuscatedName("fx.i")
    public double field2581;

    @ObfuscatedName("fx.m")
    public double field2591;

    @ObfuscatedName("fx.ai")
    public int field2588;

    @ObfuscatedName("fx.aa")
    public int field2589;

    @ObfuscatedName("fx.af")
    public class156 field2590;

    @ObfuscatedName("fx.ae")
    public int field2568 = 0;

    @ObfuscatedName("fx.at")
    public int field2592 = 0;

    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2586 = arg0;
        this.field2569 = arg1;
        this.field2570 = arg2;
        this.field2571 = arg3;
        this.field2572 = arg4;
        this.field2574 = arg5;
        this.field2575 = arg6;
        this.field2576 = arg7;
        this.field2587 = arg8;
        this.field2578 = arg9;
        this.field2573 = arg10;
        this.field2579 = false;
        int var12 = class157.method404(this.field2586).field2381;
        if (var12 == -1) {
            this.field2590 = null;
        } else {
            this.field2590 = class156.method482(var12);
        }
    }

    @ObfuscatedName("fx.w(IIIIB)V")
    public final void method2895(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field2579) {
            double var5 = (double) (arg0 - this.field2570);
            double var7 = (double) (arg1 - this.field2571);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field2582 = (double) this.field2587 * var5 / var9 + (double) this.field2570;
            this.field2577 = (double) this.field2587 * var7 / var9 + (double) this.field2571;
            this.field2585 = (double) this.field2572;
        }
        double var11 = (double) (this.field2575 + 1 - arg3);
        this.field2583 = ((double) arg0 - this.field2582) / var11;
        this.field2584 = ((double) arg1 - this.field2577) / var11;
        this.field2580 = Math.sqrt(this.field2584 * this.field2584 + this.field2583 * this.field2583);
        if (!this.field2579) {
            this.field2581 = -this.field2580 * Math.tan((double) this.field2576 * 0.02454369D);
        }
        this.field2591 = ((double) arg2 - this.field2585 - this.field2581 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("fx.g(IB)V")
    public final void method2893(int arg0) {
        this.field2579 = true;
        this.field2582 += (double) arg0 * this.field2583;
        this.field2577 += (double) arg0 * this.field2584;
        this.field2585 += this.field2591 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2581;
        this.field2581 += (double) arg0 * this.field2591;
        this.field2588 = (int) (Math.atan2(this.field2583, this.field2584) * 325.949D) + 1024 & 0x7FF;
        this.field2589 = (int) (Math.atan2(this.field2581, this.field2580) * 325.949D) & 0x7FF;
        if (this.field2590 == null) {
            return;
        }
        this.field2592 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2592 <= this.field2590.field2364[this.field2568]) {
                        return;
                    }
                    this.field2592 -= this.field2590.field2364[this.field2568];
                    this.field2568++;
                } while (this.field2568 < this.field2590.field2362.length);
                this.field2568 -= this.field2590.field2366;
            } while (this.field2568 >= 0 && this.field2568 < this.field2590.field2362.length);
            this.field2568 = 0;
        }
    }

    @ObfuscatedName("fx.u(S)Lfb;")
    public final class181 method2641() {
        class157 var1 = class157.method404(this.field2586);
        class181 var2 = var1.method2453(this.field2568);
        if (var2 == null) {
            return null;
        } else {
            var2.method3012(this.field2589);
            return var2;
        }
    }
}
