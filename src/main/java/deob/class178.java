package deob;

@ObfuscatedName("fe")
public final class class178 extends class166 {

    @ObfuscatedName("fe.r")
    public int field2610;

    @ObfuscatedName("fe.d")
    public int field2605;

    @ObfuscatedName("fe.k")
    public int field2604;

    @ObfuscatedName("fe.u")
    public int field2607;

    @ObfuscatedName("fe.v")
    public int field2613;

    @ObfuscatedName("fe.f")
    public int field2609;

    @ObfuscatedName("fe.s")
    public class156 field2608;

    @ObfuscatedName("fe.j")
    public int field2611 = 0;

    @ObfuscatedName("fe.e")
    public int field2612 = 0;

    @ObfuscatedName("fe.t")
    public boolean field2606 = false;

    public class178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2610 = arg0;
        this.field2604 = arg1;
        this.field2607 = arg2;
        this.field2613 = arg3;
        this.field2609 = arg4;
        this.field2605 = arg5 + arg6;
        int var8 = class157.method404(this.field2610).field2381;
        if (var8 == -1) {
            this.field2606 = true;
        } else {
            this.field2606 = false;
            this.field2608 = class156.method482(var8);
        }
    }

    @ObfuscatedName("fe.w(IB)V")
    public final void method2902(int arg0) {
        if (this.field2606) {
            return;
        }
        this.field2612 += arg0;
        while (this.field2612 > this.field2608.field2364[this.field2611]) {
            this.field2612 -= this.field2608.field2364[this.field2611];
            this.field2611++;
            if (this.field2611 >= this.field2608.field2362.length) {
                this.field2606 = true;
                break;
            }
        }
    }

    @ObfuscatedName("fe.u(S)Lfb;")
    public final class181 method2641() {
        class157 var1 = class157.method404(this.field2610);
        class181 var2;
        if (this.field2606) {
            var2 = var1.method2453(-1);
        } else {
            var2 = var1.method2453(this.field2611);
        }
        return var2 == null ? null : var2;
    }
}
