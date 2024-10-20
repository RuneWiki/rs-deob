package deob;

@ObfuscatedName("ax")
public final class class32 extends class89 {

    @ObfuscatedName("ax.x")
    public int field702;

    @ObfuscatedName("ax.r")
    public int field706;

    @ObfuscatedName("ax.j")
    public int field698;

    @ObfuscatedName("ax.z")
    public int field708;

    @ObfuscatedName("ax.i")
    public int field703;

    @ObfuscatedName("ax.b")
    public int field700;

    @ObfuscatedName("ax.l")
    public class45 field701;

    @ObfuscatedName("ax.m")
    public int field704 = 0;

    @ObfuscatedName("ax.p")
    public int field705 = 0;

    @ObfuscatedName("ax.f")
    public boolean field699 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field706 = arg0;
        this.field703 = arg1;
        this.field700 = arg2;
        this.field702 = arg3;
        this.field708 = arg4;
        this.field698 = arg5 + arg6;
        int var8 = class46.method1823(this.field706).field1018;
        if (var8 == -1) {
            this.field699 = true;
        } else {
            this.field699 = false;
            this.field701 = class45.method2337(var8);
        }
    }

    @ObfuscatedName("ax.x(II)V")
    public final void method648(int arg0) {
        if (this.field699) {
            return;
        }
        this.field705 += arg0;
        while (this.field705 > this.field701.field1000[this.field704]) {
            this.field705 -= this.field701.field1000[this.field704];
            this.field704++;
            if (this.field704 >= this.field701.field1002.length) {
                this.field699 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ax.j(I)Ldj;")
    public final class109 method17() {
        class46 var1 = class46.method1823(this.field706);
        class109 var2;
        if (this.field699) {
            var2 = var1.method875(-1);
        } else {
            var2 = var1.method875(this.field704);
        }
        return var2 == null ? null : var2;
    }
}
