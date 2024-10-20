package deob;

@ObfuscatedName("fq")
public class class166 extends class186 {

    @ObfuscatedName("fq.s")
    public final int field1930;

    @ObfuscatedName("fq.t")
    public final class169 field1926;

    @ObfuscatedName("fq.v")
    public int field1927;

    @ObfuscatedName("fq.j")
    public class181 field1928;

    @ObfuscatedName("fq.l")
    public int field1929;

    @ObfuscatedName("fq.n")
    public int field1931;

    public class166(class245 arg0, class245 arg1, int arg2, class169 arg3) {
        super(arg0, arg1);
        this.field1930 = arg2;
        this.field1926 = arg3;
        this.method2920();
    }

    @ObfuscatedName("fq.s(B)V")
    public void method2920() {
        this.field1927 = class156.method2267(this.field1930).method2681().field1763;
        this.field1928 = this.field1926.method3069(class141.method1794(this.field1927));
        class141 var1 = class141.method1794(this.method2921());
        class398 var2 = var1.method2411(false);
        if (var2 == null) {
            this.field1929 = 0;
            this.field1931 = 0;
        } else {
            this.field1929 = var2.field4270;
            this.field1931 = var2.field4271;
        }
    }

    @ObfuscatedName("fq.t(I)I")
    public int method2921() {
        return this.field1927;
    }

    @ObfuscatedName("fq.v(B)Lff;")
    public class181 method2922() {
        return this.field1928;
    }

    @ObfuscatedName("fq.j(I)I")
    public int method2923() {
        return this.field1929;
    }

    @ObfuscatedName("fq.l(I)I")
    public int method2940() {
        return this.field1931;
    }
}
