package deob;

@ObfuscatedName("ap")
public final class class34 extends class90 {

    @ObfuscatedName("ap.b")
    public int field746;

    @ObfuscatedName("ap.e")
    public int field737;

    @ObfuscatedName("ap.c")
    public int field738;

    @ObfuscatedName("ap.l")
    public int field739;

    @ObfuscatedName("ap.y")
    public class202 field742;

    @ObfuscatedName("ap.j")
    public int field740;

    @ObfuscatedName("ap.g")
    public int field744;

    @ObfuscatedName("ap.s")
    public int field743 = 0;

    @ObfuscatedName("ap.r")
    public int field736 = 0;

    @ObfuscatedName("ap.t")
    public boolean field745 = false;

    public class34(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field746 = arg0;
        this.field738 = arg1;
        this.field739 = arg2;
        this.field740 = arg3;
        this.field744 = arg4;
        this.field737 = arg5 + arg6;
        int var8 = class191.method3117(this.field746).field2802;
        if (var8 == -1) {
            this.field745 = true;
        } else {
            this.field745 = false;
            this.field742 = class202.method17(var8);
        }
    }

    @ObfuscatedName("ap.b(IS)V")
    public final void method718(int arg0) {
        if (this.field745) {
            return;
        }
        this.field736 += arg0;
        while (this.field736 > this.field742.field3067[this.field743]) {
            this.field736 -= this.field742.field3067[this.field743];
            this.field743++;
            if (this.field743 >= this.field742.field3062.length) {
                this.field745 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ap.c(B)Lco;")
    public final class83 method241() {
        class191 var1 = class191.method3117(this.field746);
        class83 var2;
        if (this.field745) {
            var2 = var1.method3304(-1);
        } else {
            var2 = var1.method3304(this.field743);
        }
        return var2 == null ? null : var2;
    }
}
