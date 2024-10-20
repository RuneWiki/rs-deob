package deob;

@ObfuscatedName("aa")
public final class class32 extends class89 {

    @ObfuscatedName("aa.a")
    public int field714;

    @ObfuscatedName("aa.d")
    public int field713;

    @ObfuscatedName("aa.v")
    public int field711;

    @ObfuscatedName("aa.r")
    public int field722;

    @ObfuscatedName("aa.z")
    public int field716;

    @ObfuscatedName("aa.t")
    public int field719;

    @ObfuscatedName("aa.n")
    public class45 field717;

    @ObfuscatedName("aa.i")
    public int field718 = 0;

    @ObfuscatedName("aa.g")
    public int field723 = 0;

    @ObfuscatedName("aa.m")
    public boolean field720 = false;

    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field714 = arg0;
        this.field711 = arg1;
        this.field722 = arg2;
        this.field719 = arg3;
        this.field716 = arg4;
        this.field713 = arg5 + arg6;
        int var8 = class46.method1007(this.field714).field1035;
        if (var8 == -1) {
            this.field720 = true;
        } else {
            this.field720 = false;
            this.field717 = class45.method185(var8);
        }
    }

    @ObfuscatedName("aa.a(II)V")
    public final void method677(int arg0) {
        if (this.field720) {
            return;
        }
        this.field723 += arg0;
        while (this.field723 > this.field717.field1016[this.field718]) {
            this.field723 -= this.field717.field1016[this.field718];
            this.field718++;
            if (this.field718 >= this.field717.field1010.length) {
                this.field720 = true;
                break;
            }
        }
    }

    @ObfuscatedName("aa.v(I)Ldp;")
    public final class109 method40() {
        class46 var1 = class46.method1007(this.field714);
        class109 var2;
        if (this.field720) {
            var2 = var1.method918(-1);
        } else {
            var2 = var1.method918(this.field718);
        }
        return var2 == null ? null : var2;
    }
}
