package deob;

@ObfuscatedName("fh")
public final class class159 {

    @ObfuscatedName("fh.n")
    public int field1975;

    @ObfuscatedName("fh.v")
    public int field1974;

    @ObfuscatedName("fh.d")
    public class327 field1973;

    @ObfuscatedName("fh.c")
    public class277 field1976 = new class277();

    @ObfuscatedName("fh.y")
    public class156 field1977;

    public class159(int arg0, int arg1) {
        this.field1975 = arg0;
        this.field1974 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1973 = new class327(var3);
    }

    @ObfuscatedName("fh.n(J)Ljava/lang/Object;")
    public Object method3247(long arg0) {
        class158 var3 = (class158) this.field1973.method5648(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3237();
        if (var4 == null) {
            var3.method3486();
            var3.method3481();
            this.field1974 += var3.field1972;
            return null;
        }
        if (var3.method3239()) {
            class157 var5 = new class157(var4, var3.field1972);
            this.field1973.method5649(var5, var3.field2141);
            this.field1976.method4772(var5);
            var5.field2132 = 0L;
            var3.method3486();
            var3.method3481();
        } else {
            this.field1976.method4772(var3);
            var3.field2132 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("fh.v(J)V")
    public void method3244(long arg0) {
        class158 var3 = (class158) this.field1973.method5648(arg0);
        this.method3245(var3);
    }

    @ObfuscatedName("fh.d(Lfa;)V")
    public void method3245(class158 arg0) {
        if (arg0 != null) {
            arg0.method3486();
            arg0.method3481();
            this.field1974 += arg0.field1972;
        }
    }

    @ObfuscatedName("fh.c(Ljava/lang/Object;JI)V")
    public void method3262(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1975) {
            throw new IllegalStateException();
        }
        this.method3244(arg1);
        this.field1974 -= arg2;
        while (this.field1974 < 0) {
            class158 var5 = (class158) this.field1976.method4768();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3239()) {
            }
            this.method3245(var5);
            if (this.field1977 != null) {
                this.field1977.method3231(var5.method3237());
            }
        }
        class157 var6 = new class157(arg0, arg2);
        this.field1973.method5649(var6, arg1);
        this.field1976.method4772(var6);
        var6.field2132 = 0L;
    }

    @ObfuscatedName("fh.y(I)V")
    public void method3250(int arg0) {
        for (class158 var2 = (class158) this.field1976.method4764(); var2 != null; var2 = (class158) this.field1976.method4771()) {
            if (var2.method3239()) {
                if (var2.method3237() == null) {
                    var2.method3486();
                    var2.method3481();
                    this.field1974 += var2.field1972;
                }
            } else if (++var2.field2132 > (long) arg0) {
                class160 var3 = new class160(var2.method3237(), var2.field1972);
                this.field1973.method5649(var3, var2.field2141);
                class277.method4767(var3, var2);
                var2.method3486();
                var2.method3481();
            }
        }
    }

    @ObfuscatedName("fh.h()V")
    public void method3248() {
        this.field1976.method4785();
        this.field1973.method5650();
        this.field1974 = this.field1975;
    }
}
