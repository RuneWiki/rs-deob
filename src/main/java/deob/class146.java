package deob;

@ObfuscatedName("er")
public final class class146 {

    @ObfuscatedName("er.m")
    public class181 field1934 = new class181();

    @ObfuscatedName("er.f")
    public int field1937;

    @ObfuscatedName("er.q")
    public int field1935;

    @ObfuscatedName("er.w")
    public class319 field1933;

    @ObfuscatedName("er.o")
    public class271 field1936 = new class271();

    public class146(int arg0) {
        this.field1937 = arg0;
        this.field1935 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1933 = new class319(var2);
    }

    @ObfuscatedName("er.m(J)Lfn;")
    public class181 method3011(long arg0) {
        class181 var3 = (class181) this.field1933.method5416(arg0);
        if (var3 != null) {
            this.field1936.method4815(var3);
        }
        return var3;
    }

    @ObfuscatedName("er.f(J)V")
    public void method3008(long arg0) {
        class181 var3 = (class181) this.field1933.method5416(arg0);
        if (var3 != null) {
            var3.method3306();
            var3.method3294();
            this.field1935++;
        }
    }

    @ObfuscatedName("er.q(Lfn;J)V")
    public void method3009(class181 arg0, long arg1) {
        if (this.field1935 == 0) {
            class181 var4 = this.field1936.method4801();
            var4.method3306();
            var4.method3294();
            if (this.field1934 == var4) {
                class181 var5 = this.field1936.method4801();
                var5.method3306();
                var5.method3294();
            }
        } else {
            this.field1935--;
        }
        this.field1933.method5412(arg0, arg1);
        this.field1936.method4815(arg0);
    }

    @ObfuscatedName("er.w()V")
    public void method3010() {
        this.field1936.method4804();
        this.field1933.method5413();
        this.field1934 = new class181();
        this.field1935 = this.field1937;
    }
}
