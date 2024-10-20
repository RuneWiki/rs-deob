package deob;

@ObfuscatedName("ay")
public final class class30 extends class86 {

    @ObfuscatedName("ay.a")
    public int field706;

    @ObfuscatedName("ay.w")
    public int field699;

    @ObfuscatedName("ay.d")
    public int field698;

    @ObfuscatedName("ay.c")
    public int field705;

    @ObfuscatedName("ay.y")
    public class43 field704;

    @ObfuscatedName("ay.k")
    public int field702;

    @ObfuscatedName("ay.r")
    public int field701;

    @ObfuscatedName("ay.p")
    public int field708 = 0;

    @ObfuscatedName("ay.q")
    public int field703 = 0;

    @ObfuscatedName("ay.m")
    public boolean field707 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field706 = arg0;
        this.field698 = arg1;
        this.field705 = arg2;
        this.field702 = arg3;
        this.field701 = arg4;
        this.field699 = arg5 + arg6;
        int var8 = class44.method688(this.field706).field1022;
        if (var8 == -1) {
            this.field707 = true;
        } else {
            this.field707 = false;
            this.field704 = class43.method2137(var8);
        }
    }

    @ObfuscatedName("ay.a(IB)V")
    public final void method728(int arg0) {
        if (this.field707) {
            return;
        }
        this.field703 += arg0;
        while (this.field703 > this.field704.field996[this.field708]) {
            this.field703 -= this.field704.field996[this.field708];
            this.field708++;
            if (this.field708 >= this.field704.field990.length) {
                this.field707 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ay.d(I)Ldr;")
    public final class106 method32() {
        class44 var1 = class44.method688(this.field706);
        class106 var2;
        if (this.field707) {
            var2 = var1.method972(-1);
        } else {
            var2 = var1.method972(this.field708);
        }
        return var2 == null ? null : var2;
    }
}
