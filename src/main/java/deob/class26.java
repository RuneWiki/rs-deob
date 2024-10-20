package deob;

@ObfuscatedName("g")
public final class class26 extends class78 {

    @ObfuscatedName("g.z")
    public int field592;

    @ObfuscatedName("g.j")
    public int field598;

    @ObfuscatedName("g.a")
    public int field588;

    @ObfuscatedName("g.y")
    public class38 field593;

    @ObfuscatedName("g.i")
    public int field602;

    @ObfuscatedName("g.b")
    public int field589;

    @ObfuscatedName("g.s")
    public int field591;

    @ObfuscatedName("g.q")
    public int field587 = 0;

    @ObfuscatedName("g.p")
    public int field590 = 0;

    @ObfuscatedName("g.h")
    public boolean field596 = false;

    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field598 = arg0;
        this.field602 = arg1;
        this.field589 = arg2;
        this.field591 = arg3;
        this.field592 = arg4;
        this.field588 = arg5 + arg6;
        int var8 = class39.method1360(this.field598).field896;
        if (var8 == -1) {
            this.field596 = true;
        } else {
            this.field596 = false;
            this.field593 = class38.method84(var8);
        }
    }

    @ObfuscatedName("g.z(IB)V")
    public final void method520(int arg0) {
        if (this.field596) {
            return;
        }
        this.field590 += arg0;
        while (this.field590 > this.field593.field867[this.field587]) {
            this.field590 -= this.field593.field867[this.field587];
            this.field587++;
            if (this.field587 >= this.field593.field872.length) {
                this.field596 = true;
                break;
            }
        }
    }

    @ObfuscatedName("g.j(B)Lcu;")
    public final class98 method16() {
        class39 var1 = class39.method1360(this.field598);
        class98 var2;
        if (this.field596) {
            var2 = var1.method728(-1);
        } else {
            var2 = var1.method728(this.field587);
        }
        return var2 == null ? null : var2;
    }
}
