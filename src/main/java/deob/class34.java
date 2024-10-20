package deob;

@ObfuscatedName("aa")
public final class class34 extends class90 {

    @ObfuscatedName("aa.x")
    public int field745;

    @ObfuscatedName("aa.n")
    public int field741;

    @ObfuscatedName("aa.g")
    public int field742;

    @ObfuscatedName("aa.v")
    public int field752;

    @ObfuscatedName("aa.y")
    public class202 field743;

    @ObfuscatedName("aa.p")
    public int field744;

    @ObfuscatedName("aa.j")
    public int field746;

    @ObfuscatedName("aa.m")
    public int field747 = 0;

    @ObfuscatedName("aa.a")
    public int field749 = 0;

    @ObfuscatedName("aa.i")
    public boolean field750 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field741 = arg0;
        this.field752 = arg1;
        this.field744 = arg2;
        this.field745 = arg3;
        this.field746 = arg4;
        this.field742 = arg5 + arg6;
        int var8 = class191.method2936(this.field741).field2798;
        if (var8 == -1) {
            this.field750 = true;
        } else {
            this.field750 = false;
            this.field743 = Statics.method1464(var8);
        }
    }

    @ObfuscatedName("aa.x(II)V")
    public final void method767(int arg0) {
        if (this.field750) {
            return;
        }
        this.field749 += arg0;
        while (this.field749 > this.field743.field3064[this.field747]) {
            this.field749 -= this.field743.field3064[this.field747];
            this.field747++;
            if (this.field747 >= this.field743.field3063.length) {
                this.field750 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aa.g(B)Lcj;")
    public final class83 method240() {
        class191 var1 = class191.method2936(this.field741);
        class83 var2;
        if (this.field750) {
            var2 = var1.method3326(-1);
        } else {
            var2 = var1.method3326(this.field747);
        }
        return var2 == null ? null : var2;
    }
}
