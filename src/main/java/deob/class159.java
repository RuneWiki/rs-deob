package deob;

@ObfuscatedName("fr")
public final class class159 {

    @ObfuscatedName("fr.m")
    public int field1985;

    @ObfuscatedName("fr.o")
    public int field1986;

    @ObfuscatedName("fr.q")
    public class326 field1984;

    @ObfuscatedName("fr.j")
    public class276 field1987 = new class276();

    @ObfuscatedName("fr.p")
    public class156 field1988;

    public class159(int arg0, int arg1) {
        this.field1985 = arg0;
        this.field1986 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1984 = new class326(var3);
    }

    @ObfuscatedName("fr.m(J)Ljava/lang/Object;")
    public Object method3151(long arg0) {
        class158 var3 = (class158) this.field1984.method5615(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3148();
        if (var4 == null) {
            var3.method3388();
            var3.method3379();
            this.field1986 += var3.field1983;
            return null;
        }
        if (var3.method3144()) {
            class157 var5 = new class157(var4, var3.field1983);
            this.field1984.method5614(var5, var3.field2152);
            this.field1987.method4705(var5);
            var5.field2144 = 0L;
            var3.method3388();
            var3.method3379();
        } else {
            this.field1987.method4705(var3);
            var3.field2144 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("fr.o(J)V")
    public void method3152(long arg0) {
        class158 var3 = (class158) this.field1984.method5615(arg0);
        this.method3153(var3);
    }

    @ObfuscatedName("fr.q(Lfi;)V")
    public void method3153(class158 arg0) {
        if (arg0 != null) {
            arg0.method3388();
            arg0.method3379();
            this.field1986 += arg0.field1983;
        }
    }

    @ObfuscatedName("fr.j(Ljava/lang/Object;JI)V")
    public void method3154(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1985) {
            throw new IllegalStateException();
        }
        this.method3152(arg1);
        this.field1986 -= arg2;
        while (this.field1986 < 0) {
            class158 var5 = (class158) this.field1987.method4707();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3144()) {
            }
            this.method3153(var5);
            if (this.field1988 != null) {
                this.field1988.method3142(var5.method3148());
            }
        }
        class157 var6 = new class157(arg0, arg2);
        this.field1984.method5614(var6, arg1);
        this.field1987.method4705(var6);
        var6.field2144 = 0L;
    }

    @ObfuscatedName("fr.p(I)V")
    public void method3172(int arg0) {
        for (class158 var2 = (class158) this.field1987.method4708(); var2 != null; var2 = (class158) this.field1987.method4710()) {
            if (var2.method3144()) {
                if (var2.method3148() == null) {
                    var2.method3388();
                    var2.method3379();
                    this.field1986 += var2.field1983;
                }
            } else if (++var2.field2144 > (long) arg0) {
                class160 var3 = new class160(var2.method3148(), var2.field1983);
                this.field1984.method5614(var3, var2.field2152);
                class276.method4709(var3, var2);
                var2.method3388();
                var2.method3379();
            }
        }
    }

    @ObfuscatedName("fr.g()V")
    public void method3157() {
        this.field1987.method4713();
        this.field1984.method5617();
        this.field1986 = this.field1985;
    }
}
