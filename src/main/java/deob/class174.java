package deob;

@ObfuscatedName("fq")
public final class class174 extends class165 {

    @ObfuscatedName("fq.l")
    public int field2581;

    @ObfuscatedName("fq.i")
    public int field2568;

    @ObfuscatedName("fq.e")
    public int field2569;

    @ObfuscatedName("fq.a")
    public int field2570;

    @ObfuscatedName("fq.g")
    public int field2571;

    @ObfuscatedName("fq.w")
    public int field2567;

    @ObfuscatedName("fq.v")
    public int field2576;

    @ObfuscatedName("fq.u")
    public int field2583;

    @ObfuscatedName("fq.m")
    public int field2573;

    @ObfuscatedName("fq.b")
    public int field2590;

    @ObfuscatedName("fq.f")
    public int field2577;

    @ObfuscatedName("fq.d")
    public boolean field2578 = false;

    @ObfuscatedName("fq.x")
    public double field2580;

    @ObfuscatedName("fq.z")
    public double field2572;

    @ObfuscatedName("fq.o")
    public double field2579;

    @ObfuscatedName("fq.c")
    public double field2574;

    @ObfuscatedName("fq.y")
    public double field2575;

    @ObfuscatedName("fq.j")
    public double field2584;

    @ObfuscatedName("fq.s")
    public double field2585;

    @ObfuscatedName("fq.p")
    public double field2586;

    @ObfuscatedName("fq.ak")
    public int field2587;

    @ObfuscatedName("fq.ap")
    public int field2588;

    @ObfuscatedName("fq.ai")
    public class155 field2589;

    @ObfuscatedName("fq.ae")
    public int field2582 = 0;

    @ObfuscatedName("fq.ad")
    public int field2591 = 0;

    public class174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2581 = arg0;
        this.field2568 = arg1;
        this.field2569 = arg2;
        this.field2570 = arg3;
        this.field2571 = arg4;
        this.field2576 = arg5;
        this.field2583 = arg6;
        this.field2573 = arg7;
        this.field2590 = arg8;
        this.field2577 = arg9;
        this.field2567 = arg10;
        this.field2578 = false;
        int var12 = class156.method1555(this.field2581).field2377;
        if (var12 == -1) {
            this.field2589 = null;
        } else {
            this.field2589 = class155.method2497(var12);
        }
    }

    @ObfuscatedName("fq.w(IIIIS)V")
    public final void method2886(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field2578) {
            double var5 = (double) (arg0 - this.field2569);
            double var7 = (double) (arg1 - this.field2570);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field2580 = (double) this.field2590 * var5 / var9 + (double) this.field2569;
            this.field2572 = (double) this.field2590 * var7 / var9 + (double) this.field2570;
            this.field2579 = (double) this.field2571;
        }
        double var11 = (double) (this.field2583 + 1 - arg3);
        this.field2574 = ((double) arg0 - this.field2580) / var11;
        this.field2575 = ((double) arg1 - this.field2572) / var11;
        this.field2584 = Math.sqrt(this.field2575 * this.field2575 + this.field2574 * this.field2574);
        if (!this.field2578) {
            this.field2585 = -this.field2584 * Math.tan((double) this.field2573 * 0.02454369D);
        }
        this.field2586 = ((double) arg2 - this.field2579 - this.field2585 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("fq.v(II)V")
    public final void method2888(int arg0) {
        this.field2578 = true;
        this.field2580 += (double) arg0 * this.field2574;
        this.field2572 += (double) arg0 * this.field2575;
        this.field2579 += this.field2586 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field2585;
        this.field2585 += (double) arg0 * this.field2586;
        this.field2587 = (int) (Math.atan2(this.field2574, this.field2575) * 325.949D) + 1024 & 0x7FF;
        this.field2588 = (int) (Math.atan2(this.field2585, this.field2584) * 325.949D) & 0x7FF;
        if (this.field2589 == null) {
            return;
        }
        this.field2591 += arg0;
        while (true) {
            do {
                do {
                    if (this.field2591 <= this.field2589.field2359[this.field2582]) {
                        return;
                    }
                    this.field2591 -= this.field2589.field2359[this.field2582];
                    this.field2582++;
                } while (this.field2582 < this.field2589.field2369.length);
                this.field2582 -= this.field2589.field2363;
            } while (this.field2582 >= 0 && this.field2582 < this.field2589.field2369.length);
            this.field2582 = 0;
        }
    }

    @ObfuscatedName("fq.e(I)Lfr;")
    public final class180 method2628() {
        class156 var1 = class156.method1555(this.field2581);
        class180 var2 = var1.method2416(this.field2582);
        if (var2 == null) {
            return null;
        } else {
            var2.method3004(this.field2588);
            return var2;
        }
    }
}
