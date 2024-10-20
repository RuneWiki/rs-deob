package deob;

@ObfuscatedName("aj")
public class class49 implements class43 {

    @ObfuscatedName("aj.a")
    public int field568;

    @ObfuscatedName("aj.w")
    public int field569;

    @ObfuscatedName("aj.e")
    public int field570;

    @ObfuscatedName("aj.k")
    public int field579;

    @ObfuscatedName("aj.u")
    public int field572;

    @ObfuscatedName("aj.z")
    public int field573;

    @ObfuscatedName("aj.t")
    public int field574;

    @ObfuscatedName("aj.f")
    public int field571;

    @ObfuscatedName("aj.g")
    public int field575;

    @ObfuscatedName("aj.j")
    public int field576;

    @ObfuscatedName("aj.a(Lax;I)V")
    public void method174(class33 arg0) {
        if (arg0.field425 > this.field572) {
            arg0.field425 = this.field572;
        }
        if (arg0.field418 < this.field572) {
            arg0.field418 = this.field572;
        }
        if (arg0.field426 > this.field573) {
            arg0.field426 = this.field573;
        }
        if (arg0.field432 < this.field573) {
            arg0.field432 = this.field573;
        }
    }

    @ObfuscatedName("aj.w(IIII)Z")
    public boolean method175(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field568 && arg0 < this.field569 + this.field568) {
            return arg1 >= (this.field574 << 3) + (this.field570 << 6) && arg1 <= (this.field574 << 3) + (this.field570 << 6) + 7 && arg2 >= (this.field579 << 6) + (this.field571 << 3) && arg2 <= (this.field579 << 6) + (this.field571 << 3) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aj.e(III)Z")
    public boolean method176(int arg0, int arg1) {
        return arg0 >= (this.field575 << 3) + (this.field572 << 6) && arg0 <= (this.field575 << 3) + (this.field572 << 6) + 7 && arg1 >= (this.field576 << 3) + (this.field573 << 6) && arg1 <= (this.field576 << 3) + (this.field573 << 6) + 7;
    }

    @ObfuscatedName("aj.k(IIII)[I")
    public int[] method177(int arg0, int arg1, int arg2) {
        return this.method175(arg0, arg1, arg2) ? new int[] { this.field575 * 8 - this.field574 * 8 + this.field572 * 64 - this.field570 * 64 + arg1, this.field576 * 8 - this.field571 * 8 + this.field573 * 64 - this.field579 * 64 + arg2 } : null;
    }

    @ObfuscatedName("aj.u(III)Lhc;")
    public class224 method178(int arg0, int arg1) {
        if (this.method176(arg0, arg1)) {
            int var3 = this.field574 * 8 - this.field575 * 8 + this.field570 * 64 - this.field572 * 64 + arg0;
            int var4 = this.field571 * 8 - this.field576 * 8 + this.field579 * 64 - this.field573 * 64 + arg1;
            return new class224(this.field568, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("aj.z(Lgh;I)V")
    public void method194(class185 arg0) {
        this.field568 = arg0.method2962();
        this.field569 = arg0.method2962();
        this.field570 = arg0.method3194();
        this.field574 = arg0.method2962();
        this.field579 = arg0.method3194();
        this.field571 = arg0.method2962();
        this.field572 = arg0.method3194();
        this.field575 = arg0.method2962();
        this.field573 = arg0.method3194();
        this.field576 = arg0.method2962();
        this.method618();
    }

    @ObfuscatedName("aj.t(B)V")
    public void method618() {
    }
}
