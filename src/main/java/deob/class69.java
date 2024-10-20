package deob;

@ObfuscatedName("bn")
public final class class69 extends class218 {

    @ObfuscatedName("bn.h")
    public int field876;

    @ObfuscatedName("bn.e")
    public int field877;

    @ObfuscatedName("bn.v")
    public int field878;

    @ObfuscatedName("bn.x")
    public int field885;

    @ObfuscatedName("bn.m")
    public int field879;

    @ObfuscatedName("bn.q")
    public int field881;

    @ObfuscatedName("bn.f")
    public class199 field883;

    @ObfuscatedName("bn.r")
    public int field882 = 0;

    @ObfuscatedName("bn.u")
    public int field884 = 0;

    @ObfuscatedName("bn.b")
    public boolean field880 = false;

    public class69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field876 = arg0;
        this.field878 = arg1;
        this.field879 = arg2;
        this.field885 = arg3;
        this.field881 = arg4;
        this.field877 = arg5 + arg6;
        int var8 = class189.method3000(this.field876).field2084;
        if (var8 == -1) {
            this.field880 = true;
        } else {
            this.field880 = false;
            this.field883 = class199.method4223(var8);
        }
    }

    @ObfuscatedName("bn.h(II)V")
    public final void method1919(int arg0) {
        if (this.field880) {
            return;
        }
        this.field884 += arg0;
        if (this.field883.method3671()) {
            this.field882 += arg0;
            if (this.field882 >= this.field883.method3675()) {
                this.field880 = true;
            }
            return;
        }
        while (this.field884 > this.field883.field2289[this.field882]) {
            this.field884 -= this.field883.field2289[this.field882];
            this.field882++;
            if (this.field882 >= this.field883.field2295.length) {
                this.field880 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bn.e(I)Lhh;")
    public final class224 method1915() {
        class189 var1 = class189.method3000(this.field876);
        class224 var2;
        if (this.field880) {
            var2 = var1.method3385(-1);
        } else {
            var2 = var1.method3385(this.field882);
        }
        return var2 == null ? null : var2;
    }
}
