package deob;

@ObfuscatedName("ah")
public final class class30 extends class85 {

    @ObfuscatedName("ah.d")
    public int field699;

    @ObfuscatedName("ah.p")
    public int field692;

    @ObfuscatedName("ah.v")
    public int field703;

    @ObfuscatedName("ah.l")
    public int field694;

    @ObfuscatedName("ah.y")
    public class43 field697;

    @ObfuscatedName("ah.w")
    public int field695;

    @ObfuscatedName("ah.u")
    public int field696;

    @ObfuscatedName("ah.a")
    public int field698 = 0;

    @ObfuscatedName("ah.e")
    public int field691 = 0;

    @ObfuscatedName("ah.b")
    public boolean field700 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field699 = arg0;
        this.field703 = arg1;
        this.field694 = arg2;
        this.field695 = arg3;
        this.field696 = arg4;
        this.field692 = arg5 + arg6;
        int var8 = class44.method723(this.field699).field1016;
        if (var8 == -1) {
            this.field700 = true;
        } else {
            this.field700 = false;
            this.field697 = class43.method578(var8);
        }
    }

    @ObfuscatedName("ah.d(IB)V")
    public final void method626(int arg0) {
        if (this.field700) {
            return;
        }
        this.field691 += arg0;
        while (this.field691 > this.field697.field1004[this.field698]) {
            this.field691 -= this.field697.field1004[this.field698];
            this.field698++;
            if (this.field698 >= this.field697.field996.length) {
                this.field700 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ah.v(B)Ldn;")
    public final class105 method15() {
        class44 var1 = class44.method723(this.field699);
        class105 var2;
        if (this.field700) {
            var2 = var1.method878(-1);
        } else {
            var2 = var1.method878(this.field698);
        }
        return var2 == null ? null : var2;
    }
}
