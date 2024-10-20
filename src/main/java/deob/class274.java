package deob;

@ObfuscatedName("ky")
public final class class274 {

    @ObfuscatedName("ky.aj")
    public int field3038;

    @ObfuscatedName("ky.al")
    public int field3037;

    @ObfuscatedName("ky.ac")
    public class454 field3039;

    @ObfuscatedName("ky.ab")
    public class364 field3040;

    @ObfuscatedName("ky.an")
    public class273 field3041;

    public class274(int arg0) {
        this(arg0, arg0);
    }

    public class274(int arg0, int arg1) {
        this.field3040 = new class364();
        this.field3038 = arg0;
        this.field3037 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3039 = new class454(var3);
    }

    @ObfuscatedName("ky.aj(J)Ljava/lang/Object;")
    public Object method4891(long arg0) {
        class278 var3 = (class278) this.field3039.method7611(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method4912();
        if (var4 == null) {
            var3.method7335();
            var3.method7331();
            this.field3037 += var3.field3049;
            return null;
        }
        if (var3.method4914()) {
            class277 var5 = new class277(var4, var3.field3049);
            this.field3039.method7595(var5, var3.field4673);
            this.field3040.method6238(var5);
            var5.field4667 = 0L;
            var3.method7335();
            var3.method7331();
        } else {
            this.field3040.method6238(var3);
            var3.field4667 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ky.al(J)V")
    public void method4897(long arg0) {
        class278 var3 = (class278) this.field3039.method7611(arg0);
        this.method4892(var3);
    }

    @ObfuscatedName("ky.ac(Lki;)V")
    public void method4892(class278 arg0) {
        if (arg0 != null) {
            arg0.method7335();
            arg0.method7331();
            this.field3037 += arg0.field3049;
        }
    }

    @ObfuscatedName("ky.ab(Ljava/lang/Object;J)V")
    public void method4890(Object arg0, long arg1) {
        this.method4894(arg0, arg1, 1);
    }

    @ObfuscatedName("ky.an(Ljava/lang/Object;JI)V")
    public void method4894(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3038) {
            throw new IllegalStateException();
        }
        this.method4897(arg1);
        this.field3037 -= arg2;
        while (this.field3037 < 0) {
            class278 var5 = (class278) this.field3040.method6248();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method4914()) {
            }
            this.method4892(var5);
            if (this.field3041 != null) {
                this.field3041.method4888(var5.method4912());
            }
        }
        class277 var6 = new class277(arg0, arg2);
        this.field3039.method7595(var6, arg1);
        this.field3040.method6238(var6);
        var6.field4667 = 0L;
    }

    @ObfuscatedName("ky.ao(I)V")
    public void method4895(int arg0) {
        for (class278 var2 = (class278) this.field3040.method6240(); var2 != null; var2 = (class278) this.field3040.method6243()) {
            if (var2.method4914()) {
                if (var2.method4912() == null) {
                    var2.method7335();
                    var2.method7331();
                    this.field3037 += var2.field3049;
                }
            } else if (++var2.field4667 > (long) arg0) {
                class275 var3 = new class275(var2.method4912(), var2.field3049);
                this.field3039.method7595(var3, var2.field4673);
                class364.method6246(var3, var2);
                var2.method7335();
                var2.method7331();
            }
        }
    }

    @ObfuscatedName("ky.av()V")
    public void method4903() {
        this.field3040.method6244();
        this.field3039.method7596();
        this.field3037 = this.field3038;
    }
}
