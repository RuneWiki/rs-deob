package deob;

@ObfuscatedName("ez")
public final class class155 {

    @ObfuscatedName("ez.h")
    public class185 field1978 = new class185();

    @ObfuscatedName("ez.v")
    public int field1975;

    @ObfuscatedName("ez.x")
    public int field1976;

    @ObfuscatedName("ez.w")
    public class327 field1977;

    @ObfuscatedName("ez.t")
    public class277 field1974 = new class277();

    public class155(int arg0) {
        this.field1975 = arg0;
        this.field1976 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1977 = new class327(var2);
    }

    @ObfuscatedName("ez.h(J)Lgj;")
    public class185 method3147(long arg0) {
        class185 var3 = (class185) this.field1977.method5494(arg0);
        if (var3 != null) {
            this.field1974.method4624(var3);
        }
        return var3;
    }

    @ObfuscatedName("ez.v(J)V")
    public void method3149(long arg0) {
        class185 var3 = (class185) this.field1977.method5494(arg0);
        if (var3 != null) {
            var3.method3359();
            var3.method3353();
            this.field1976++;
        }
    }

    @ObfuscatedName("ez.x(Lgj;J)V")
    public void method3145(class185 arg0, long arg1) {
        if (this.field1976 == 0) {
            class185 var4 = this.field1974.method4605();
            var4.method3359();
            var4.method3353();
            if (this.field1978 == var4) {
                class185 var5 = this.field1974.method4605();
                var5.method3359();
                var5.method3353();
            }
        } else {
            this.field1976--;
        }
        this.field1977.method5503(arg0, arg1);
        this.field1974.method4624(arg0);
    }

    @ObfuscatedName("ez.w()V")
    public void method3146() {
        this.field1974.method4629();
        this.field1977.method5495();
        this.field1978 = new class185();
        this.field1976 = this.field1975;
    }
}
