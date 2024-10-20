package deob;

@ObfuscatedName("hd")
public final class class234 {

    @ObfuscatedName("hd.i")
    public int field2652;

    @ObfuscatedName("hd.w")
    public int field2653;

    @ObfuscatedName("hd.s")
    public class379 field2655;

    @ObfuscatedName("hd.a")
    public class314 field2654;

    @ObfuscatedName("hd.o")
    public class233 field2656;

    public class234(int arg0) {
        this(arg0, arg0);
    }

    public class234(int arg0, int arg1) {
        this.field2654 = new class314();
        this.field2652 = arg0;
        this.field2653 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field2655 = new class379(var3);
    }

    @ObfuscatedName("hd.i(J)Ljava/lang/Object;")
    public Object method4179(long arg0) {
        class238 var3 = (class238) this.field2655.method6009(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4198();
        if (var4 == null) {
            var3.method5752();
            var3.method5748();
            this.field2653 += var3.field2664;
            return null;
        }
        if (var3.method4199()) {
            class237 var5 = new class237(var4, var3.field2664);
            this.field2655.method6010(var5, var3.field4075);
            this.field2654.method5124(var5);
            var5.field4067 = 0L;
            var3.method5752();
            var3.method5748();
        } else {
            this.field2654.method5124(var3);
            var3.field4067 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("hd.w(J)V")
    public void method4180(long arg0) {
        class238 var3 = (class238) this.field2655.method6009(arg0);
        this.method4181(var3);
    }

    @ObfuscatedName("hd.s(Lin;)V")
    public void method4181(class238 arg0) {
        if (arg0 != null) {
            arg0.method5752();
            arg0.method5748();
            this.field2653 += arg0.field2664;
        }
    }

    @ObfuscatedName("hd.a(Ljava/lang/Object;J)V")
    public void method4195(Object arg0, long arg1) {
        this.method4192(arg0, arg1, 1);
    }

    @ObfuscatedName("hd.o(Ljava/lang/Object;JI)V")
    public void method4192(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field2652) {
            throw new IllegalStateException();
        }
        this.method4180(arg1);
        this.field2653 -= arg2;
        while (this.field2653 < 0) {
            class238 var5 = (class238) this.field2654.method5128();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4199()) {
            }
            this.method4181(var5);
            if (this.field2656 != null) {
                this.field2656.method4173(var5.method4198());
            }
        }
        class237 var6 = new class237(arg0, arg2);
        this.field2655.method6010(var6, arg1);
        this.field2654.method5124(var6);
        var6.field4067 = 0L;
    }

    @ObfuscatedName("hd.g(I)V")
    public void method4183(int arg0) {
        for (class238 var2 = (class238) this.field2654.method5127(); var2 != null; var2 = (class238) this.field2654.method5135()) {
            if (var2.method4199()) {
                if (var2.method4198() == null) {
                    var2.method5752();
                    var2.method5748();
                    this.field2653 += var2.field2664;
                }
            } else if (++var2.field4067 > (long) arg0) {
                class235 var3 = new class235(var2.method4198(), var2.field2664);
                this.field2655.method6010(var3, var2.field4075);
                class314.method5126(var3, var2);
                var2.method5752();
                var2.method5748();
            }
        }
    }

    @ObfuscatedName("hd.e()V")
    public void method4177() {
        this.field2654.method5123();
        this.field2655.method6022();
        this.field2653 = this.field2652;
    }
}
