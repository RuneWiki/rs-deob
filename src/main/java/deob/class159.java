package deob;

@ObfuscatedName("fe")
public final class class159 {

    @ObfuscatedName("fe.f")
    public int field1982;

    @ObfuscatedName("fe.i")
    public int field1978;

    @ObfuscatedName("fe.y")
    public class316 field1980;

    @ObfuscatedName("fe.w")
    public class266 field1981 = new class266();

    @ObfuscatedName("fe.p")
    public class156 field1979;

    public class159(int arg0, int arg1) {
        this.field1982 = arg0;
        this.field1978 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field1980 = new class316(var3);
    }

    @ObfuscatedName("fe.f(J)Ljava/lang/Object;")
    public Object method3134(long arg0) {
        class158 var3 = (class158) this.field1980.method5467(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method3119();
        if (var4 == null) {
            var3.method3292();
            var3.method3286();
            this.field1978 += var3.field1977;
            return null;
        }
        if (var3.method3117()) {
            class157 var5 = new class157(var4, var3.field1977);
            this.field1980.method5469(var5, var3.field2322);
            this.field1981.method4600(var5);
            var5.field2315 = 0L;
            var3.method3292();
            var3.method3286();
        } else {
            this.field1981.method4600(var3);
            var3.field2315 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("fe.i(J)V")
    public void method3125(long arg0) {
        class158 var3 = (class158) this.field1980.method5467(arg0);
        this.method3144(var3);
    }

    @ObfuscatedName("fe.y(Lff;)V")
    public void method3144(class158 arg0) {
        if (arg0 != null) {
            arg0.method3292();
            arg0.method3286();
            this.field1978 += arg0.field1977;
        }
    }

    @ObfuscatedName("fe.w(Ljava/lang/Object;JI)V")
    public void method3122(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field1982) {
            throw new IllegalStateException();
        }
        this.method3125(arg1);
        this.field1978 -= arg2;
        while (this.field1978 < 0) {
            class158 var5 = (class158) this.field1981.method4602();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method3117()) {
            }
            this.method3144(var5);
            if (this.field1979 != null) {
                this.field1979.method3113(var5.method3119());
            }
        }
        class157 var6 = new class157(arg0, arg2);
        this.field1980.method5469(var6, arg1);
        this.field1981.method4600(var6);
        var6.field2315 = 0L;
    }

    @ObfuscatedName("fe.p(I)V")
    public void method3126(int arg0) {
        for (class158 var2 = (class158) this.field1981.method4603(); var2 != null; var2 = (class158) this.field1981.method4604()) {
            if (var2.method3117()) {
                if (var2.method3119() == null) {
                    var2.method3292();
                    var2.method3286();
                    this.field1978 += var2.field1977;
                }
            } else if (++var2.field2315 > (long) arg0) {
                class160 var3 = new class160(var2.method3119(), var2.field1977);
                this.field1980.method5469(var3, var2.field2322);
                class266.method4609(var3, var2);
                var2.method3292();
                var2.method3286();
            }
        }
    }

    @ObfuscatedName("fe.b()V")
    public void method3123() {
        this.field1981.method4599();
        this.field1980.method5470();
        this.field1978 = this.field1982;
    }
}
