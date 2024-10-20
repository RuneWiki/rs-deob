package deob;

@ObfuscatedName("eb")
public final class class155 {

    @ObfuscatedName("eb.f")
    public class183 field1975 = new class183();

    @ObfuscatedName("eb.i")
    public int field1972;

    @ObfuscatedName("eb.y")
    public int field1971;

    @ObfuscatedName("eb.w")
    public class316 field1974;

    @ObfuscatedName("eb.p")
    public class266 field1973 = new class266();

    public class155(int arg0) {
        this.field1972 = arg0;
        this.field1971 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1974 = new class316(var2);
    }

    @ObfuscatedName("eb.f(J)Lgw;")
    public class183 method3099(long arg0) {
        class183 var3 = (class183) this.field1974.method5467(arg0);
        if (var3 != null) {
            this.field1973.method4600(var3);
        }
        return var3;
    }

    @ObfuscatedName("eb.i(J)V")
    public void method3100(long arg0) {
        class183 var3 = (class183) this.field1974.method5467(arg0);
        if (var3 != null) {
            var3.method3292();
            var3.method3286();
            this.field1971++;
        }
    }

    @ObfuscatedName("eb.y(Lgw;J)V")
    public void method3101(class183 arg0, long arg1) {
        if (this.field1971 == 0) {
            class183 var4 = this.field1973.method4602();
            var4.method3292();
            var4.method3286();
            if (this.field1975 == var4) {
                class183 var5 = this.field1973.method4602();
                var5.method3292();
                var5.method3286();
            }
        } else {
            this.field1971--;
        }
        this.field1974.method5469(arg0, arg1);
        this.field1973.method4600(arg0);
    }

    @ObfuscatedName("eb.w()V")
    public void method3102() {
        this.field1973.method4599();
        this.field1974.method5470();
        this.field1975 = new class183();
        this.field1971 = this.field1972;
    }
}
