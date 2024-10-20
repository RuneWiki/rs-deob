package deob;

@ObfuscatedName("em")
public final class class146 {

    @ObfuscatedName("em.z")
    public class176 field1938 = new class176();

    @ObfuscatedName("em.n")
    public int field1934;

    @ObfuscatedName("em.v")
    public int field1936;

    @ObfuscatedName("em.u")
    public class316 field1937;

    @ObfuscatedName("em.r")
    public class266 field1935 = new class266();

    public class146(int arg0) {
        this.field1934 = arg0;
        this.field1936 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1937 = new class316(var2);
    }

    @ObfuscatedName("em.z(J)Lfw;")
    public class176 method2992(long arg0) {
        class176 var3 = (class176) this.field1937.method5362(arg0);
        if (var3 != null) {
            this.field1935.method4507(var3);
        }
        return var3;
    }

    @ObfuscatedName("em.n(J)V")
    public void method2993(long arg0) {
        class176 var3 = (class176) this.field1937.method5362(arg0);
        if (var3 != null) {
            var3.method3249();
            var3.method3240();
            this.field1936++;
        }
    }

    @ObfuscatedName("em.v(Lfw;J)V")
    public void method2994(class176 arg0, long arg1) {
        if (this.field1936 == 0) {
            class176 var4 = this.field1935.method4523();
            var4.method3249();
            var4.method3240();
            if (this.field1938 == var4) {
                class176 var5 = this.field1935.method4523();
                var5.method3249();
                var5.method3240();
            }
        } else {
            this.field1936--;
        }
        this.field1937.method5363(arg0, arg1);
        this.field1935.method4507(arg0);
    }

    @ObfuscatedName("em.u()V")
    public void method2995() {
        this.field1935.method4500();
        this.field1937.method5364();
        this.field1938 = new class176();
        this.field1936 = this.field1934;
    }
}
