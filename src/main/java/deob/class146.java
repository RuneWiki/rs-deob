package deob;

@ObfuscatedName("ep")
public final class class146 {

    @ObfuscatedName("ep.s")
    public class176 field1936 = new class176();

    @ObfuscatedName("ep.j")
    public int field1935;

    @ObfuscatedName("ep.i")
    public int field1937;

    @ObfuscatedName("ep.k")
    public class316 field1938;

    @ObfuscatedName("ep.u")
    public class266 field1939 = new class266();

    public class146(int arg0) {
        this.field1935 = arg0;
        this.field1937 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1938 = new class316(var2);
    }

    @ObfuscatedName("ep.s(J)Lfe;")
    public class176 method3065(long arg0) {
        class176 var3 = (class176) this.field1938.method5405(arg0);
        if (var3 != null) {
            this.field1939.method4552(var3);
        }
        return var3;
    }

    @ObfuscatedName("ep.j(J)V")
    public void method3066(long arg0) {
        class176 var3 = (class176) this.field1938.method5405(arg0);
        if (var3 != null) {
            var3.method3304();
            var3.method3297();
            this.field1937++;
        }
    }

    @ObfuscatedName("ep.i(Lfe;J)V")
    public void method3067(class176 arg0, long arg1) {
        if (this.field1937 == 0) {
            class176 var4 = this.field1939.method4550();
            var4.method3304();
            var4.method3297();
            if (this.field1936 == var4) {
                class176 var5 = this.field1939.method4550();
                var5.method3304();
                var5.method3297();
            }
        } else {
            this.field1937--;
        }
        this.field1938.method5400(arg0, arg1);
        this.field1939.method4552(arg0);
    }

    @ObfuscatedName("ep.k()V")
    public void method3068() {
        this.field1939.method4558();
        this.field1938.method5398();
        this.field1936 = new class176();
        this.field1937 = this.field1935;
    }
}
