package deob;

@ObfuscatedName("av")
public final class class32 extends class89 {

    @ObfuscatedName("av.e")
    public int field728;

    @ObfuscatedName("av.l")
    public int field729;

    @ObfuscatedName("av.c")
    public int field736;

    @ObfuscatedName("av.h")
    public int field731;

    @ObfuscatedName("av.r")
    public int field732;

    @ObfuscatedName("av.a")
    public int field733;

    @ObfuscatedName("av.b")
    public class45 field730;

    @ObfuscatedName("av.u")
    public int field735 = 0;

    @ObfuscatedName("av.o")
    public int field734 = 0;

    @ObfuscatedName("av.p")
    public boolean field737 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field728 = arg0;
        this.field736 = arg1;
        this.field731 = arg2;
        this.field732 = arg3;
        this.field733 = arg4;
        this.field729 = arg5 + arg6;
        int var8 = class46.method3025(this.field728).field1048;
        if (var8 == -1) {
            this.field737 = true;
        } else {
            this.field737 = false;
            this.field730 = Statics.method144(var8);
        }
    }

    @ObfuscatedName("av.e(II)V")
    public final void method656(int arg0) {
        if (this.field737) {
            return;
        }
        this.field734 += arg0;
        while (this.field734 > this.field730.field1026[this.field735]) {
            this.field734 -= this.field730.field1026[this.field735];
            this.field735++;
            if (this.field735 >= this.field730.field1024.length) {
                this.field737 = true;
                break;
            }
        }
    }

    @ObfuscatedName("av.c(I)Lds;")
    public final class109 method9() {
        class46 var1 = class46.method3025(this.field728);
        class109 var2;
        if (this.field737) {
            var2 = var1.method932(-1);
        } else {
            var2 = var1.method932(this.field735);
        }
        return var2 == null ? null : var2;
    }
}
