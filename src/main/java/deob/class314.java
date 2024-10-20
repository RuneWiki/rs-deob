package deob;

@ObfuscatedName("ml")
public final class class314 {

    @ObfuscatedName("ml.ap")
    public int field3289;

    @ObfuscatedName("ml.aw")
    public int field3290;

    @ObfuscatedName("ml.ak")
    public class530 field3291;

    @ObfuscatedName("ml.aj")
    public class416 field3292;

    @ObfuscatedName("ml.ai")
    public class313 field3293;

    public class314(int arg0) {
        this(arg0, arg0);
    }

    public class314(int arg0, int arg1) {
        this.field3292 = new class416();
        this.field3289 = arg0;
        this.field3290 = arg0;
        int var3;
        for (var3 = 1; var3 + var3 < arg0 && var3 < arg1; var3 += var3) {
        }
        this.field3291 = new class530(var3);
    }

    @ObfuscatedName("ml.ap(J)Ljava/lang/Object;")
    public Object method5901(long arg0) {
        class318 var3 = (class318) this.field3291.method8985(arg0);
        if (var3 == null) {
            return null;
        }
        Object var4 = var3.method5921();
        if (var4 == null) {
            var3.method8667();
            var3.method8665();
            this.field3290 += var3.field3301;
            return null;
        }
        if (var3.method5922()) {
            class317 var5 = new class317(var4, var3.field3301);
            this.field3291.method8970(var5, var3.field5170);
            this.field3292.method7400(var5);
            var5.field5165 = 0L;
            var3.method8667();
            var3.method8665();
        } else {
            this.field3292.method7400(var3);
            var3.field5165 = 0L;
        }
        return var4;
    }

    @ObfuscatedName("ml.aw(J)V")
    public void method5902(long arg0) {
        class318 var3 = (class318) this.field3291.method8985(arg0);
        this.method5903(var3);
    }

    @ObfuscatedName("ml.ak(Lmf;)V")
    public void method5903(class318 arg0) {
        if (arg0 != null) {
            arg0.method8667();
            arg0.method8665();
            this.field3290 += arg0.field3301;
        }
    }

    @ObfuscatedName("ml.aj(Ljava/lang/Object;J)V")
    public void method5904(Object arg0, long arg1) {
        this.method5905(arg0, arg1, 1);
    }

    @ObfuscatedName("ml.ai(Ljava/lang/Object;JI)V")
    public void method5905(Object arg0, long arg1, int arg2) {
        if (arg2 > this.field3289) {
            throw new IllegalStateException();
        }
        this.method5902(arg1);
        this.field3290 -= arg2;
        while (this.field3290 < 0) {
            class318 var5 = (class318) this.field3292.method7399();
            if (var5 == null) {
                throw new RuntimeException("");
            }
            if (!var5.method5922()) {
            }
            this.method5903(var5);
            if (this.field3293 != null) {
                this.field3293.method5898(var5.method5921());
            }
        }
        class317 var6 = new class317(arg0, arg2);
        this.field3291.method8970(var6, arg1);
        this.field3292.method7400(var6);
        var6.field5165 = 0L;
    }

    @ObfuscatedName("ml.ay(I)V")
    public void method5906(int arg0) {
        for (class318 var2 = (class318) this.field3292.method7403(); var2 != null; var2 = (class318) this.field3292.method7402()) {
            if (var2.method5922()) {
                if (var2.method5921() == null) {
                    var2.method8667();
                    var2.method8665();
                    this.field3290 += var2.field3301;
                }
            } else if (++var2.field5165 > (long) arg0) {
                class315 var3 = new class315(var2.method5921(), var2.field3301);
                this.field3291.method8970(var3, var2.field5170);
                class416.method7401(var3, var2);
                var2.method8667();
                var2.method8665();
            }
        }
    }

    @ObfuscatedName("ml.as()V")
    public void method5907() {
        this.field3292.method7421();
        this.field3291.method8963();
        this.field3290 = this.field3289;
    }
}
