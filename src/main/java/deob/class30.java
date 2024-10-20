package deob;

@ObfuscatedName("ay")
public final class class30 extends class86 {

    @ObfuscatedName("ay.w")
    public int field698;

    @ObfuscatedName("ay.x")
    public int field701;

    @ObfuscatedName("ay.t")
    public int field705;

    @ObfuscatedName("ay.p")
    public int field693;

    @ObfuscatedName("ay.e")
    public int field690;

    @ObfuscatedName("ay.y")
    public class43 field695;

    @ObfuscatedName("ay.m")
    public int field694;

    @ObfuscatedName("ay.c")
    public int field696 = 0;

    @ObfuscatedName("ay.v")
    public int field697 = 0;

    @ObfuscatedName("ay.l")
    public boolean field691 = false;

    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field698 = arg0;
        this.field693 = arg1;
        this.field690 = arg2;
        this.field701 = arg3;
        this.field694 = arg4;
        this.field705 = arg5 + arg6;
        int var8 = class44.method662(this.field698).field1019;
        if (var8 == -1) {
            this.field691 = true;
        } else {
            this.field691 = false;
            this.field695 = class43.method2054(var8);
        }
    }

    @ObfuscatedName("ay.w(II)V")
    public final void method660(int arg0) {
        if (this.field691) {
            return;
        }
        this.field697 += arg0;
        while (this.field697 > this.field695.field998[this.field696]) {
            this.field697 -= this.field695.field998[this.field696];
            this.field696++;
            if (this.field696 >= this.field695.field996.length) {
                this.field691 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ay.t(I)Ldp;")
    public final class106 method34() {
        class44 var1 = class44.method662(this.field698);
        class106 var2;
        if (this.field691) {
            var2 = var1.method918(-1);
        } else {
            var2 = var1.method918(this.field696);
        }
        return var2 == null ? null : var2;
    }
}
