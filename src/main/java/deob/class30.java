package deob;

@ObfuscatedName("ai")
public final class class30 extends class85 {

    @ObfuscatedName("ai.v")
    public int field705;

    @ObfuscatedName("ai.f")
    public int field694;

    @ObfuscatedName("ai.i")
    public int field695;

    @ObfuscatedName("ai.d")
    public int field696;

    @ObfuscatedName("ai.o")
    public int field697;

    @ObfuscatedName("ai.c")
    public int field703;

    @ObfuscatedName("ai.p")
    public class43 field699;

    @ObfuscatedName("ai.j")
    public int field707 = 0;

    @ObfuscatedName("ai.a")
    public int field701 = 0;

    @ObfuscatedName("ai.y")
    public boolean field702 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field705 = arg0;
        this.field695 = arg1;
        this.field696 = arg2;
        this.field697 = arg3;
        this.field703 = arg4;
        this.field694 = arg5 + arg6;
        int var8 = class44.method1502(this.field705).field1008;
        if (var8 == -1) {
            this.field702 = true;
        } else {
            this.field702 = false;
            this.field699 = class43.method616(var8);
        }
    }

    @ObfuscatedName("ai.v(II)V")
    public final void method632(int arg0) {
        if (this.field702) {
            return;
        }
        this.field701 += arg0;
        while (this.field701 > this.field699.field978[this.field707]) {
            this.field701 -= this.field699.field978[this.field707];
            this.field707++;
            if (this.field707 >= this.field699.field984.length) {
                this.field702 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ai.i(I)Ldq;")
    public final class105 method9() {
        class44 var1 = class44.method1502(this.field705);
        class105 var2;
        if (this.field702) {
            var2 = var1.method874(-1);
        } else {
            var2 = var1.method874(this.field707);
        }
        return var2 == null ? null : var2;
    }
}
