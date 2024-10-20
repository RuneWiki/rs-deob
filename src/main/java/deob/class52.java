package deob;

@ObfuscatedName("aw")
public final class class52 extends class201 {

    @ObfuscatedName("aw.s")
    public int field768;

    @ObfuscatedName("aw.t")
    public int field759;

    @ObfuscatedName("aw.v")
    public int field760;

    @ObfuscatedName("aw.j")
    public int field758;

    @ObfuscatedName("aw.l")
    public int field762;

    @ObfuscatedName("aw.n")
    public int field763;

    @ObfuscatedName("aw.w")
    public class159 field764;

    @ObfuscatedName("aw.f")
    public int field769 = 0;

    @ObfuscatedName("aw.o")
    public int field766 = 0;

    @ObfuscatedName("aw.x")
    public boolean field767 = false;

    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field768 = arg0;
        this.field760 = arg1;
        this.field758 = arg2;
        this.field762 = arg3;
        this.field763 = arg4;
        this.field759 = arg5 + arg6;
        int var8 = class150.method455(this.field768).field1664;
        if (var8 == -1) {
            this.field767 = true;
        } else {
            this.field767 = false;
            this.field764 = class159.method1334(var8);
        }
    }

    @ObfuscatedName("aw.s(II)V")
    public final void method1554(int arg0) {
        if (this.field767) {
            return;
        }
        this.field766 += arg0;
        while (this.field766 > this.field764.field1865[this.field769]) {
            this.field766 -= this.field764.field1865[this.field769];
            this.field769++;
            if (this.field769 >= this.field764.field1863.length) {
                this.field767 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aw.t(I)Lgl;")
    public final class207 method1550() {
        class150 var1 = class150.method455(this.field768);
        class207 var2;
        if (this.field767) {
            var2 = var1.method2541(-1);
        } else {
            var2 = var1.method2541(this.field769);
        }
        return var2 == null ? null : var2;
    }
}
