package deob;

@ObfuscatedName("aq")
public final class class32 extends class89 {

    @ObfuscatedName("aq.i")
    public int field728;

    @ObfuscatedName("aq.h")
    public int field731;

    @ObfuscatedName("aq.e")
    public int field717;

    @ObfuscatedName("aq.g")
    public int field718;

    @ObfuscatedName("aq.n")
    public int field724;

    @ObfuscatedName("aq.u")
    public int field720;

    @ObfuscatedName("aq.d")
    public class45 field721;

    @ObfuscatedName("aq.l")
    public int field719 = 0;

    @ObfuscatedName("aq.m")
    public int field723 = 0;

    @ObfuscatedName("aq.j")
    public boolean field716 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field728 = arg0;
        this.field717 = arg1;
        this.field718 = arg2;
        this.field724 = arg3;
        this.field720 = arg4;
        this.field731 = arg5 + arg6;
        int var8 = class46.method895(this.field728).field1034;
        if (var8 == -1) {
            this.field716 = true;
        } else {
            this.field716 = false;
            this.field721 = class45.method3523(var8);
        }
    }

    @ObfuscatedName("aq.i(II)V")
    public final void method649(int arg0) {
        if (this.field716) {
            return;
        }
        this.field723 += arg0;
        while (this.field723 > this.field721.field1020[this.field719]) {
            this.field723 -= this.field721.field1020[this.field719];
            this.field719++;
            if (this.field719 >= this.field721.field1012.length) {
                this.field716 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aq.e(I)Ldo;")
    public final class109 method47() {
        class46 var1 = class46.method895(this.field728);
        class109 var2;
        if (this.field716) {
            var2 = var1.method901(-1);
        } else {
            var2 = var1.method901(this.field719);
        }
        return var2 == null ? null : var2;
    }
}
