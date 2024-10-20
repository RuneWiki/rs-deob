package deob;

@ObfuscatedName("ai")
public class class49 implements class43 {

    @ObfuscatedName("ai.b")
    public int field577;

    @ObfuscatedName("ai.s")
    public int field572;

    @ObfuscatedName("ai.r")
    public int field567;

    @ObfuscatedName("ai.g")
    public int field568;

    @ObfuscatedName("ai.x")
    public int field569;

    @ObfuscatedName("ai.f")
    public int field570;

    @ObfuscatedName("ai.u")
    public int field571;

    @ObfuscatedName("ai.t")
    public int field565;

    @ObfuscatedName("ai.k")
    public int field573;

    @ObfuscatedName("ai.n")
    public int field575;

    @ObfuscatedName("ai.b(Lam;I)V")
    public void method184(class33 arg0) {
        if (arg0.field424 > this.field569) {
            arg0.field424 = this.field569;
        }
        if (arg0.field425 < this.field569) {
            arg0.field425 = this.field569;
        }
        if (arg0.field418 > this.field570) {
            arg0.field418 = this.field570;
        }
        if (arg0.field427 < this.field570) {
            arg0.field427 = this.field570;
        }
    }

    @ObfuscatedName("ai.s(IIIB)Z")
    public boolean method172(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field577 && arg0 < this.field577 + this.field572) {
            return arg1 >= (this.field571 << 3) + (this.field567 << 6) && arg1 <= (this.field571 << 3) + (this.field567 << 6) + 7 && arg2 >= (this.field568 << 6) + (this.field565 << 3) && arg2 <= (this.field568 << 6) + (this.field565 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ai.r(III)Z")
    public boolean method173(int arg0, int arg1) {
        return arg0 >= (this.field573 << 3) + (this.field569 << 6) && arg0 <= (this.field573 << 3) + (this.field569 << 6) + 7 && arg1 >= (this.field575 << 3) + (this.field570 << 6) && arg1 <= (this.field575 << 3) + (this.field570 << 6) + 7;
    }

    @ObfuscatedName("ai.g(IIII)[I")
    public int[] method174(int arg0, int arg1, int arg2) {
        return this.method172(arg0, arg1, arg2) ? new int[] { this.field573 * 8 - this.field571 * 8 + this.field569 * 64 - this.field567 * 64 + arg1, this.field575 * 8 - this.field565 * 8 + this.field570 * 64 - this.field568 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ai.x(III)Lhk;")
    public class220 method175(int arg0, int arg1) {
        if (this.method173(arg0, arg1)) {
            int var3 = this.field571 * 8 - this.field573 * 8 + this.field567 * 64 - this.field569 * 64 + arg0;
            int var4 = this.field565 * 8 - this.field575 * 8 + this.field568 * 64 - this.field570 * 64 + arg1;
            return new class220(this.field577, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ai.f(Lfs;I)V")
    public void method176(class181 arg0) {
        this.field577 = arg0.method2945();
        this.field572 = arg0.method2945();
        this.field567 = arg0.method3081();
        this.field571 = arg0.method2945();
        this.field568 = arg0.method3081();
        this.field565 = arg0.method2945();
        this.field569 = arg0.method3081();
        this.field573 = arg0.method2945();
        this.field570 = arg0.method3081();
        this.field575 = arg0.method2945();
        this.method600();
    }

    @ObfuscatedName("ai.u(B)V")
    public void method600() {
    }
}
