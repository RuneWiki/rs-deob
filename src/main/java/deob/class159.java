package deob;

@ObfuscatedName("fp")
public final class class159 {

    @ObfuscatedName("fp.z")
    public int field2001;

    @ObfuscatedName("fp.k")
    public int field2000;

    @ObfuscatedName("fp.s")
    public class326 field2003;

    @ObfuscatedName("fp.t")
    public class276 field1999 = new class276();

    @ObfuscatedName("fp.i")
    public class156 field2002;

    public class159(int arg0, int arg1) {
        this.field2001 = arg0;
        this.field2000 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2003 = new class326(var3);
    }

    @ObfuscatedName("fp.z(J)Ljava/lang/Object;")
    public Object method3198(long arg0) {
        class158 var3 = (class158) this.field2003.method5582(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3186();
        if (var4 == null) {
            var3.method3401();
            var3.method3395();
            this.field2000 += var3.field1998;
            return null;
        }
        if (var3.method3187()) {
            class157 var5 = new class157(var4, var3.field1998);
            this.field2003.method5583(var5, var3.field2157);
            this.field1999.method4679(var5);
            var5.field2149 = 0L;
            var3.method3401();
            var3.method3395();
        } else {
            this.field1999.method4679(var3);
            var3.field2149 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("fp.k(J)V")
    public void method3193(long arg0) {
        class158 var3 = (class158) this.field2003.method5582(arg0);
        this.method3194(var3);
    }

    @ObfuscatedName("fp.s(Lfx;)V")
    public void method3194(class158 arg0) {
        if (arg0 != null) {
            arg0.method3401();
            arg0.method3395();
            this.field2000 += arg0.field1998;
        }
    }

    @ObfuscatedName("fp.t(Ljava/lang/Object;JI)V")
    public void method3195(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2001) {
            throw new IllegalStateException();
        }
        this.method3193(arg1);
        this.field2000 -= arg2;
        while (this.field2000 < 0) {
            class158 var5 = (class158) this.field1999.method4681();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3187()) {
            }
            this.method3194(var5);
            if (this.field2002 != null) {
                this.field2002.method3183(var5.method3186());
            }
        }
        class157 var6 = new class157(arg0, arg2);
        this.field2003.method5583(var6, arg1);
        this.field1999.method4679(var6);
        var6.field2149 = 0L;
    }

    @ObfuscatedName("fp.i(I)V")
    public void method3196(int arg0) {
        for (class158 var2 = (class158) this.field1999.method4695(); var2 != null; var2 = (class158) this.field1999.method4684()) {
            if (var2.method3187()) {
                if (var2.method3186() == null) {
                    var2.method3401();
                    var2.method3395();
                    this.field2000 += var2.field1998;
                }
            } else if (++var2.field2149 > (long) arg0) {
                class160 var3 = new class160(var2.method3186(), var2.field1998);
                this.field2003.method5583(var3, var2.field2157);
                class276.method4680(var3, var2);
                var2.method3401();
                var2.method3395();
            }
        }
    }

    @ObfuscatedName("fp.o()V")
    public void method3197() {
        this.field1999.method4691();
        this.field2003.method5584();
        this.field2000 = this.field2001;
    }
}
