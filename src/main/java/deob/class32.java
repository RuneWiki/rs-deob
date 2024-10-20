package deob;

@ObfuscatedName("ac")
public final class class32 extends class89 {

    @ObfuscatedName("ac.s")
    public int field686;

    @ObfuscatedName("ac.z")
    public int field683;

    @ObfuscatedName("ac.t")
    public int field684;

    @ObfuscatedName("ac.y")
    public class45 field685;

    @ObfuscatedName("ac.p")
    public int field680;

    @ObfuscatedName("ac.g")
    public int field681;

    @ObfuscatedName("ac.m")
    public int field678;

    @ObfuscatedName("ac.f")
    public int field687 = 0;

    @ObfuscatedName("ac.k")
    public int field688 = 0;

    @ObfuscatedName("ac.h")
    public boolean field682 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field686 = arg0;
        this.field680 = arg1;
        this.field681 = arg2;
        this.field678 = arg3;
        this.field683 = arg4;
        this.field684 = arg5 + arg6;
        int var8 = class46.method2163(this.field686).field992;
        if (var8 == -1) {
            this.field682 = true;
        } else {
            this.field682 = false;
            this.field685 = class45.method44(var8);
        }
    }

    @ObfuscatedName("ac.s(II)V")
    public final void method671(int arg0) {
        if (this.field682) {
            return;
        }
        this.field688 += arg0;
        while (this.field688 > this.field685.field982[this.field687]) {
            this.field688 -= this.field685.field982[this.field687];
            this.field687++;
            if (this.field687 >= this.field685.field970.length) {
                this.field682 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ac.t(B)Lde;")
    public final class109 method27() {
        class46 var1 = class46.method2163(this.field686);
        class109 var2;
        if (this.field682) {
            var2 = var1.method900(-1);
        } else {
            var2 = var1.method900(this.field687);
        }
        return var2 == null ? null : var2;
    }
}
