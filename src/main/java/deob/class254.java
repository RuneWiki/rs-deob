package deob;

@ObfuscatedName("ip")
public final class class254 {

    @ObfuscatedName("ip.s")
    public int field2895;

    @ObfuscatedName("ip.h")
    public int field2893;

    @ObfuscatedName("ip.w")
    public class420 field2894;

    @ObfuscatedName("ip.v")
    public class340 field2892;

    @ObfuscatedName("ip.c")
    public class253 field2896;

    public class254(int arg0) {
        this(arg0, arg0);
    }

    public class254(int arg0, int arg1) {
        this.field2892 = new class340();
        this.field2895 = arg0;
        this.field2893 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2894 = new class420(var3);
    }

    @ObfuscatedName("ip.s(J)Ljava/lang/Object;")
    public Object method4578(long arg0) {
        class258 var3 = (class258) this.field2894.method6668(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4591();
        if (var4 == null) {
            var3.method6409();
            var3.method6406();
            this.field2893 += var3.field2904;
            return null;
        }
        if (var3.method4596()) {
            class257 var5 = new class257(var4, var3.field2904);
            this.field2894.method6673(var5, var3.field4468);
            this.field2892.method5569(var5);
            var5.field4463 = 0L;
            var3.method6409();
            var3.method6406();
        } else {
            this.field2892.method5569(var3);
            var3.field4463 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ip.h(J)V")
    public void method4567(long arg0) {
        class258 var3 = (class258) this.field2894.method6668(arg0);
        this.method4587(var3);
    }

    @ObfuscatedName("ip.w(Lie;)V")
    public void method4587(class258 arg0) {
        if (arg0 != null) {
            arg0.method6409();
            arg0.method6406();
            this.field2893 += arg0.field2904;
        }
    }

    @ObfuscatedName("ip.v(Ljava/lang/Object;J)V")
    public void method4571(Object arg0, long arg1) {
        this.method4572(arg0, arg1, 1);
    }

    @ObfuscatedName("ip.c(Ljava/lang/Object;JI)V")
    public void method4572(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2895) {
            throw new IllegalStateException();
        }
        this.method4567(arg1);
        this.field2893 -= arg2;
        while (this.field2893 < 0) {
            class258 var5 = (class258) this.field2892.method5586();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4596()) {
            }
            this.method4587(var5);
            if (this.field2896 != null) {
                this.field2896.method4566(var5.method4591());
            }
        }
        class257 var6 = new class257(arg0, arg2);
        this.field2894.method6673(var6, arg1);
        this.field2892.method5569(var6);
        var6.field4463 = 0L;
    }

    @ObfuscatedName("ip.q(I)V")
    public void method4573(int arg0) {
        for (class258 var2 = (class258) this.field2892.method5567(); var2 != null; var2 = (class258) this.field2892.method5574()) {
            if (var2.method4596()) {
                if (var2.method4591() == null) {
                    var2.method6409();
                    var2.method6406();
                    this.field2893 += var2.field2904;
                }
            } else if (++var2.field4463 > (long) arg0) {
                class255 var3 = new class255(var2.method4591(), var2.field2904);
                this.field2894.method6673(var3, var2.field4468);
                class340.method5572(var3, var2);
                var2.method6409();
                var2.method6406();
            }
        }
    }

    @ObfuscatedName("ip.i()V")
    public void method4584() {
        this.field2892.method5568();
        this.field2894.method6670();
        this.field2893 = this.field2895;
    }
}
