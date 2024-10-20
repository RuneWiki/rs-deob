package deob;

@ObfuscatedName("eb")
public final class class146 {

    @ObfuscatedName("eb.a")
    public class176 field1937 = new class176();

    @ObfuscatedName("eb.t")
    public int field1938;

    @ObfuscatedName("eb.n")
    public int field1939;

    @ObfuscatedName("eb.q")
    public class316 field1940;

    @ObfuscatedName("eb.v")
    public class266 field1941 = new class266();

    public class146(int arg0) {
        this.field1938 = arg0;
        this.field1939 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1940 = new class316(var2);
    }

    @ObfuscatedName("eb.a(J)Lfa;")
    public class176 method3120(long arg0) {
        class176 var3 = (class176) this.field1940.method5494(arg0);
        if (var3 != null) {
            this.field1941.method4639(var3);
        }
        return var3;
    }

    @ObfuscatedName("eb.t(J)V")
    public void method3119(long arg0) {
        class176 var3 = (class176) this.field1940.method5494(arg0);
        if (var3 != null) {
            var3.method3386();
            var3.method3378();
            this.field1939++;
        }
    }

    @ObfuscatedName("eb.n(Lfa;J)V")
    public void method3122(class176 arg0, long arg1) {
        if (this.field1939 == 0) {
            class176 var4 = this.field1941.method4653();
            var4.method3386();
            var4.method3378();
            if (this.field1937 == var4) {
                class176 var5 = this.field1941.method4653();
                var5.method3386();
                var5.method3378();
            }
        } else {
            this.field1939--;
        }
        this.field1940.method5495(arg0, arg1);
        this.field1941.method4639(arg0);
    }

    @ObfuscatedName("eb.q()V")
    public void method3123() {
        this.field1941.method4638();
        this.field1940.method5505();
        this.field1937 = new class176();
        this.field1939 = this.field1938;
    }
}
