package deob;

@ObfuscatedName("kv")
public class class297 extends class289 {

    @ObfuscatedName("kv.f")
    public final class335 field3722;

    @ObfuscatedName("kv.q")
    public final class292 field3723;

    @ObfuscatedName("kv.x")
    public String field3724 = null;

    @ObfuscatedName("kv.d")
    public String field3728 = null;

    @ObfuscatedName("kv.k")
    public byte field3726;

    @ObfuscatedName("kv.n")
    public int field3727;

    @ObfuscatedName("kv.i")
    public int field3725 = 1;

    public class297(class335 arg0, class292 arg1) {
        super(100);
        this.field3722 = arg0;
        this.field3723 = arg1;
    }

    @ObfuscatedName("kv.m(I)Ljs;")
    public class286 method5022() {
        return new class285();
    }

    @ObfuscatedName("kv.f(II)[Ljs;")
    public class286[] method5031(int arg0) {
        return new class285[arg0];
    }

    @ObfuscatedName("kv.q(Ljava/lang/String;I)V")
    public final void method5155(String arg0) {
        this.field3724 = class307.method1557(arg0);
    }

    @ObfuscatedName("kv.x(Ljava/lang/String;B)V")
    public final void method5154(String arg0) {
        this.field3728 = class307.method1557(arg0);
    }

    @ObfuscatedName("kv.d(Lgr;I)V")
    public final void method5157(class202 arg0) {
        this.method5154(arg0.method3426());
        long var2 = arg0.method3423();
        long var4 = var2;
        String var6;
        if (var2 <= 0L || var2 >= 6582952005840035281L) {
            var6 = null;
        } else if (var2 % 37L == 0L) {
            var6 = null;
        } else {
            int var7 = 0;
            for (long var8 = var2; var8 != 0L; var8 /= 37L) {
                var7++;
            }
            StringBuilder var10 = new StringBuilder(var7);
            while (var4 != 0L) {
                long var11 = var4;
                var4 /= 37L;
                var10.append(class307.field3788[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5155(var6);
        this.field3726 = arg0.method3537();
        int var13 = arg0.method3551();
        if (var13 == 255) {
            return;
        }
        this.method5035();
        for (int var14 = 0; var14 < var13; var14++) {
            class285 var15 = (class285) this.method5044(new class295(arg0.method3426(), this.field3722));
            int var16 = arg0.method3530();
            var15.method5119(var16, ++this.field3725 - 1);
            var15.field3700 = arg0.method3537();
            arg0.method3426();
            this.method5161(var15);
        }
    }

    @ObfuscatedName("kv.a(Lgr;B)V")
    public final void method5156(class202 arg0) {
        class295 var2 = new class295(arg0.method3426(), this.field3722);
        int var3 = arg0.method3530();
        byte var4 = arg0.method3537();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5036() == 0) {
                return;
            }
            class285 var6 = (class285) this.method5040(var2);
            if (var6 != null && var6.method5116() == var3) {
                this.method5043(var6);
            }
            return;
        }
        arg0.method3426();
        class285 var7 = (class285) this.method5040(var2);
        if (var7 == null) {
            if (this.method5036() > this.field3695) {
                return;
            }
            var7 = (class285) this.method5044(var2);
        }
        var7.method5119(var3, ++this.field3725 - 1);
        var7.field3700 = var4;
        this.method5161(var7);
    }

    @ObfuscatedName("kv.cg(I)V")
    public final void method5159() {
        for (int var1 = 0; var1 < this.method5036(); var1++) {
            ((class285) this.method5046(var1)).method4970();
        }
    }

    @ObfuscatedName("kv.cf(B)V")
    public final void method5158() {
        for (int var1 = 0; var1 < this.method5036(); var1++) {
            ((class285) this.method5046(var1)).method4986();
        }
    }

    @ObfuscatedName("kv.cp(Ljk;I)V")
    public final void method5161(class285 arg0) {
        if (arg0.method4997().equals(this.field3723.method1503())) {
            this.field3727 = arg0.field3700;
        }
    }
}
