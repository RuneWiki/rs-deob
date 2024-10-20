package deob;

@ObfuscatedName("ec")
public final class class149 {

    @ObfuscatedName("ec.m")
    public int field1941;

    @ObfuscatedName("ec.f")
    public int field1940;

    @ObfuscatedName("ec.q")
    public class317 field1942;

    @ObfuscatedName("ec.w")
    public class277 field1943 = new class277();

    public class149(int arg0, int arg1) {
        this.field1941 = arg0;
        this.field1940 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1942 = new class317(var3);
    }

    @ObfuscatedName("ec.m(J)Ljava/lang/Object;")
    public Object method3032(long arg0) {
        class148 var3 = (class148) this.field1942.method5382(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3019();
        if (var4 == null) {
            var3.method3306();
            var3.method3294();
            this.field1940 += var3.field1939;
            return null;
        }
        if (var3.method3018()) {
            class147 var5 = new class147(var4, var3.field1939);
            this.field1942.method5383(var5, var3.field2139);
            this.field1943.method4918(var5);
            var5.field2133 = 0L;
            var3.method3306();
            var3.method3294();
        } else {
            this.field1943.method4918(var3);
            var3.field2133 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ec.f(J)V")
    public void method3044(long arg0) {
        class148 var3 = (class148) this.field1942.method5382(arg0);
        this.method3040(var3);
    }

    @ObfuscatedName("ec.q(Leu;)V")
    public void method3040(class148 arg0) {
        if (arg0 != null) {
            arg0.method3306();
            arg0.method3294();
            this.field1940 += arg0.field1939;
        }
    }

    @ObfuscatedName("ec.w(Ljava/lang/Object;JI)V")
    public void method3028(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1941) {
            throw new IllegalStateException();
        }
        this.method3044(arg1);
        this.field1940 -= arg2;
        while (this.field1940 < 0) {
            class148 var5 = (class148) this.field1943.method4919();
            this.method3040(var5);
        }
        class147 var6 = new class147(arg0, arg2);
        this.field1942.method5383(var6, arg1);
        this.field1943.method4918(var6);
        var6.field2133 = 0L;
    }

    @ObfuscatedName("ec.o(I)V")
    public void method3029(int arg0) {
        for (class148 var2 = (class148) this.field1943.method4928(); var2 != null; var2 = (class148) this.field1943.method4916()) {
            if (var2.method3018()) {
                if (var2.method3019() == null) {
                    var2.method3306();
                    var2.method3294();
                    this.field1940 += var2.field1939;
                }
            } else if (++var2.field2133 > (long) arg0) {
                class150 var3 = new class150(var2.method3019(), var2.field1939);
                this.field1942.method5383(var3, var2.field2139);
                class271.method4803(var3, var2);
                var2.method3306();
                var2.method3294();
            }
        }
    }

    @ObfuscatedName("ec.u()V")
    public void method3030() {
        this.field1943.method4917();
        this.field1942.method5391();
        this.field1940 = this.field1941;
    }
}
