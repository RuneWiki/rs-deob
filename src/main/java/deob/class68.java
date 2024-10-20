package deob;

@ObfuscatedName("bb")
public final class class68 extends class222 {

    @ObfuscatedName("bb.f")
    public int field875;

    @ObfuscatedName("bb.w")
    public int field880;

    @ObfuscatedName("bb.v")
    public int field870;

    @ObfuscatedName("bb.s")
    public int field871;

    @ObfuscatedName("bb.z")
    public int field873;

    @ObfuscatedName("bb.j")
    public int field872;

    @ObfuscatedName("bb.i")
    public class203 field868;

    @ObfuscatedName("bb.n")
    public int field869 = 0;

    @ObfuscatedName("bb.l")
    public int field876 = 0;

    @ObfuscatedName("bb.k")
    public boolean field877 = false;

    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field875 = arg0;
        this.field870 = arg1;
        this.field871 = arg2;
        this.field872 = arg3;
        this.field873 = arg4;
        this.field880 = arg5 + arg6;
        int var8 = class193.method2221(this.field875).field2097;
        if (var8 == -1) {
            this.field877 = true;
        } else {
            this.field877 = false;
            this.field868 = class203.method2227(var8);
        }
    }

    @ObfuscatedName("bb.f(II)V")
    public final void method1976(int arg0) {
        if (this.field877) {
            return;
        }
        this.field876 += arg0;
        if (this.field868.method3769()) {
            this.field869 += arg0;
            if (this.field869 >= this.field868.method3754()) {
                this.field877 = true;
            }
            return;
        }
        while (this.field876 > this.field868.field2296[this.field869]) {
            this.field876 -= this.field868.field2296[this.field869];
            this.field869++;
            if (this.field869 >= this.field868.field2283.length) {
                this.field877 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bb.w(I)Lhs;")
    public final class228 method1977() {
        class193 var1 = class193.method2221(this.field875);
        class228 var2;
        if (this.field877) {
            var2 = var1.method3483(-1);
        } else {
            var2 = var1.method3483(this.field869);
        }
        return var2 == null ? null : var2;
    }
}
