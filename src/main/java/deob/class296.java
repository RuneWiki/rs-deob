package deob;

@ObfuscatedName("kq")
public class class296 extends class288 {

    @ObfuscatedName("kq.h")
    public final class331 field3718;

    @ObfuscatedName("kq.e")
    public final class291 field3720;

    @ObfuscatedName("kq.g")
    public String field3719 = null;

    @ObfuscatedName("kq.a")
    public String field3721 = null;

    @ObfuscatedName("kq.r")
    public byte field3722;

    @ObfuscatedName("kq.k")
    public int field3723;

    @ObfuscatedName("kq.m")
    public int field3724 = 1;

    public class296(class331 arg0, class291 arg1) {
        super(100);
        this.field3718 = arg0;
        this.field3720 = arg1;
    }

    @ObfuscatedName("kq.f(B)Ljw;")
    public class285 method4952() {
        return new class284();
    }

    @ObfuscatedName("kq.h(II)[Ljw;")
    public class285[] method4962(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("kq.e(Ljava/lang/String;I)V")
    public final void method5089(String arg0) {
        this.field3719 = class306.method1479(arg0);
    }

    @ObfuscatedName("kq.m(Ljava/lang/String;I)V")
    public final void method5087(String arg0) {
        this.field3721 = class306.method1479(arg0);
    }

    @ObfuscatedName("kq.q(Lgx;I)V")
    public final void method5093(class185 arg0) {
        this.method5087(arg0.method3435());
        long var2 = arg0.method3505();
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
                var10.append(class306.field3785[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5089(var6);
        this.field3722 = arg0.method3324();
        int var13 = arg0.method3323();
        if (var13 == 255) {
            return;
        }
        this.method4965();
        for (int var14 = 0; var14 < var13; var14++) {
            class284 var15 = (class284) this.method4974(new class294(arg0.method3435(), this.field3718));
            int var16 = arg0.method3325();
            var15.method5043(var16, ++this.field3724 - 1);
            var15.field3695 = arg0.method3324();
            arg0.method3435();
            this.method5091(var15);
        }
    }

    @ObfuscatedName("kq.ci(Lgx;B)V")
    public final void method5084(class185 arg0) {
        class294 var2 = new class294(arg0.method3435(), this.field3718);
        int var3 = arg0.method3325();
        byte var4 = arg0.method3324();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4966() == 0) {
                return;
            }
            class284 var6 = (class284) this.method4967(var2);
            if (var6 != null && var6.method5044() == var3) {
                this.method4973(var6);
            }
            return;
        }
        arg0.method3435();
        class284 var7 = (class284) this.method4967(var2);
        if (var7 == null) {
            if (this.method4966() > this.field3686) {
                return;
            }
            var7 = (class284) this.method4974(var2);
        }
        var7.method5043(var3, ++this.field3724 - 1);
        var7.field3695 = var4;
        this.method5091(var7);
    }

    @ObfuscatedName("kq.cj(B)V")
    public final void method5090() {
        for (int var1 = 0; var1 < this.method4966(); var1++) {
            ((class284) this.method4976(var1)).method4908();
        }
    }

    @ObfuscatedName("kq.cd(S)V")
    public final void method5098() {
        for (int var1 = 0; var1 < this.method4966(); var1++) {
            ((class284) this.method4976(var1)).method4911();
        }
    }

    @ObfuscatedName("kq.cr(Ljp;I)V")
    public final void method5091(class284 arg0) {
        if (arg0.method4927().equals(this.field3720.method1100())) {
            this.field3723 = arg0.field3695;
        }
    }
}
