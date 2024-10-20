package deob;

@ObfuscatedName("ft")
public class class174 extends class186 {

    @ObfuscatedName("ft.s")
    public final int field2017;

    @ObfuscatedName("ft.t")
    public final class181 field2016;

    @ObfuscatedName("ft.v")
    public final int field2018;

    @ObfuscatedName("ft.j")
    public final int field2019;

    public class174(class245 arg0, class245 arg1, int arg2, class181 arg3) {
        super(arg0, arg1);
        this.field2017 = arg2;
        this.field2016 = arg3;
        class141 var5 = class141.method1794(this.method2921());
        class398 var6 = var5.method2411(false);
        if (var6 == null) {
            this.field2018 = 0;
            this.field2019 = 0;
        } else {
            this.field2018 = var6.field4270;
            this.field2019 = var6.field4271;
        }
    }

    @ObfuscatedName("ft.t(I)I")
    public int method2921() {
        return this.field2017;
    }

    @ObfuscatedName("ft.v(B)Lff;")
    public class181 method2922() {
        return this.field2016;
    }

    @ObfuscatedName("ft.j(I)I")
    public int method2923() {
        return this.field2018;
    }

    @ObfuscatedName("ft.l(I)I")
    public int method2940() {
        return this.field2019;
    }
}
