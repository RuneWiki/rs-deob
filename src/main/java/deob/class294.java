package deob;

@ObfuscatedName("kg")
public class class294 extends class286 {

    @ObfuscatedName("kg.q")
    public final class327 field3742;

    @ObfuscatedName("kg.o")
    public final class289 field3741;

    @ObfuscatedName("kg.c")
    public String field3746 = null;

    @ObfuscatedName("kg.u")
    public String field3743 = null;

    @ObfuscatedName("kg.r")
    public byte field3740;

    @ObfuscatedName("kg.d")
    public int field3745;

    @ObfuscatedName("kg.v")
    public int field3744 = 1;

    public class294(class327 arg0, class289 arg1) {
        super(100);
        this.field3742 = arg0;
        this.field3741 = arg1;
    }

    @ObfuscatedName("kg.b(I)Ljw;")
    public class283 method4814() {
        return new class282();
    }

    @ObfuscatedName("kg.q(IB)[Ljw;")
    public class283[] method4816(int arg0) {
        return new class282[arg0];
    }

    @ObfuscatedName("kg.o(Ljava/lang/String;I)V")
    public final void method4970(String arg0) {
        String var2 = class303.method651(class303.method2841(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3746 = var2;
    }

    @ObfuscatedName("kg.u(Ljava/lang/String;I)V")
    public final void method4959(String arg0) {
        String var2 = class303.method651(class303.method2841(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3743 = var2;
    }

    @ObfuscatedName("kg.t(Lgn;I)V")
    public final void method4954(class194 arg0) {
        this.method4959(arg0.method3256());
        long var2 = arg0.method3253();
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
                var10.append(class303.field3795[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method4970(var6);
        this.field3740 = arg0.method3248();
        int var13 = arg0.method3247();
        if (var13 == 255) {
            return;
        }
        this.method4826();
        for (int var14 = 0; var14 < var13; var14++) {
            class282 var15 = (class282) this.method4860(new class292(arg0.method3256(), this.field3742));
            int var16 = arg0.method3249();
            var15.method4913(var16, ++this.field3744 - 1);
            var15.field3720 = arg0.method3248();
            arg0.method3256();
            this.method4957(var15);
        }
    }

    @ObfuscatedName("kg.f(Lgn;I)V")
    public final void method4976(class194 arg0) {
        class292 var2 = new class292(arg0.method3256(), this.field3742);
        int var3 = arg0.method3249();
        byte var4 = arg0.method3248();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4827() == 0) {
                return;
            }
            class282 var6 = (class282) this.method4831(var2);
            if (var6 != null && var6.method4917() == var3) {
                this.method4834(var6);
            }
            return;
        }
        arg0.method3256();
        class282 var7 = (class282) this.method4895(var2);
        if (var7 == null) {
            if (this.method4827() > this.field3710) {
                return;
            }
            var7 = (class282) this.method4860(var2);
        }
        var7.method4913(var3, ++this.field3744 - 1);
        var7.field3720 = var4;
        this.method4957(var7);
    }

    @ObfuscatedName("kg.ck(I)V")
    public final void method4960() {
        for (int var1 = 0; var1 < this.method4827(); var1++) {
            ((class282) this.method4907(var1)).method4759();
        }
    }

    @ObfuscatedName("kg.ci(I)V")
    public final void method4956() {
        for (int var1 = 0; var1 < this.method4827(); var1++) {
            ((class282) this.method4907(var1)).method4762();
        }
    }

    @ObfuscatedName("kg.ch(Ljc;I)V")
    public final void method4957(class282 arg0) {
        if (arg0.method4780().equals(this.field3741.method1149())) {
            this.field3745 = arg0.field3720;
        }
    }
}
