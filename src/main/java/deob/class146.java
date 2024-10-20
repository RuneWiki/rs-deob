package deob;

@ObfuscatedName("et")
public final class class146 {

    @ObfuscatedName("et.c")
    public class176 field1924 = new class176();

    @ObfuscatedName("et.x")
    public int field1925;

    @ObfuscatedName("et.t")
    public int field1927;

    @ObfuscatedName("et.g")
    public class316 field1926;

    @ObfuscatedName("et.l")
    public class266 field1928 = new class266();

    public class146(int arg0) {
        this.field1925 = arg0;
        this.field1927 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1926 = new class316(var2);
    }

    @ObfuscatedName("et.c(J)Lfv;")
    public class176 method3061(long arg0) {
        class176 var3 = (class176) this.field1926.method5493(arg0);
        if (var3 != null) {
            this.field1928.method4607(var3);
        }
        return var3;
    }

    @ObfuscatedName("et.x(J)V")
    public void method3066(long arg0) {
        class176 var3 = (class176) this.field1926.method5493(arg0);
        if (var3 != null) {
            var3.method3326();
            var3.method3320();
            this.field1927++;
        }
    }

    @ObfuscatedName("et.t(Lfv;J)V")
    public void method3062(class176 arg0, long arg1) {
        if (this.field1927 == 0) {
            class176 var4 = this.field1928.method4608();
            var4.method3326();
            var4.method3320();
            if (this.field1924 == var4) {
                class176 var5 = this.field1928.method4608();
                var5.method3326();
                var5.method3320();
            }
        } else {
            this.field1927--;
        }
        this.field1926.method5497(arg0, arg1);
        this.field1928.method4607(arg0);
    }

    @ObfuscatedName("et.g()V")
    public void method3063() {
        this.field1928.method4606();
        this.field1926.method5494();
        this.field1924 = new class176();
        this.field1927 = this.field1925;
    }
}
