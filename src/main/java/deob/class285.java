package deob;

@ObfuscatedName("kd")
public final class class285 {

    @ObfuscatedName("kd.at")
    public int field3070;

    @ObfuscatedName("kd.an")
    public int field3071;

    @ObfuscatedName("kd.av")
    public class476 field3074;

    @ObfuscatedName("kd.as")
    public class381 field3073;

    @ObfuscatedName("kd.ax")
    public class284 field3072;

    public class285(int arg0) {
        this(arg0, arg0);
    }

    public class285(int arg0, int arg1) {
        this.field3073 = new class381();
        this.field3070 = arg0;
        this.field3071 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3074 = new class476(var3);
    }

    @ObfuscatedName("kd.at(J)Ljava/lang/Object;")
    public Object method5091(long arg0) {
        class289 var3 = (class289) this.field3074.method7848(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5114();
        if (var4 == null) {
            var3.method7560();
            var3.method7554();
            this.field3071 += var3.field3082;
            return null;
        }
        if (var3.method5113()) {
            class288 var5 = new class288(var4, var3.field3082);
            this.field3074.method7857(var5, var3.field4757);
            this.field3073.method6460(var5);
            var5.field4751 = 0L;
            var3.method7560();
            var3.method7554();
        } else {
            this.field3073.method6460(var3);
            var3.field4751 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("kd.an(J)V")
    public void method5092(long arg0) {
        class289 var3 = (class289) this.field3074.method7848(arg0);
        this.method5093(var3);
    }

    @ObfuscatedName("kd.av(Lld;)V")
    public void method5093(class289 arg0) {
        if (arg0 != null) {
            arg0.method7560();
            arg0.method7554();
            this.field3071 += arg0.field3082;
        }
    }

    @ObfuscatedName("kd.as(Ljava/lang/Object;J)V")
    public void method5094(Object arg0, long arg1) {
        this.method5090(arg0, arg1, 1);
    }

    @ObfuscatedName("kd.ax(Ljava/lang/Object;JI)V")
    public void method5090(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3070) {
            throw new IllegalStateException();
        }
        this.method5092(arg1);
        this.field3071 -= arg2;
        while (this.field3071 < 0) {
            class289 var5 = (class289) this.field3073.method6452();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5113()) {
            }
            this.method5093(var5);
            if (this.field3072 != null) {
                this.field3072.method5089(var5.method5114());
            }
        }
        class288 var6 = new class288(arg0, arg2);
        this.field3074.method7857(var6, arg1);
        this.field3073.method6460(var6);
        var6.field4751 = 0L;
    }

    @ObfuscatedName("kd.ap(I)V")
    public void method5096(int arg0) {
        for (class289 var2 = (class289) this.field3073.method6473(); var2 != null; var2 = (class289) this.field3073.method6455()) {
            if (var2.method5113()) {
                if (var2.method5114() == null) {
                    var2.method7560();
                    var2.method7554();
                    this.field3071 += var2.field3082;
                }
            } else if (++var2.field4751 > (long) arg0) {
                class286 var3 = new class286(var2.method5114(), var2.field3082);
                this.field3074.method7857(var3, var2.field4757);
                class381.method6451(var3, var2);
                var2.method7560();
                var2.method7554();
            }
        }
    }

    @ObfuscatedName("kd.ab()V")
    public void method5097() {
        this.field3073.method6449();
        this.field3074.method7850();
        this.field3071 = this.field3070;
    }
}
