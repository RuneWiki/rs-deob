package deob;

@ObfuscatedName("jp")
public class class285 extends class277 {

    @ObfuscatedName("jp.t")
    public final class338 field3621;

    @ObfuscatedName("jp.n")
    public final class280 field3615;

    @ObfuscatedName("jp.d")
    public String field3618 = null;

    @ObfuscatedName("jp.m")
    public String field3619 = null;

    @ObfuscatedName("jp.p")
    public byte field3617;

    @ObfuscatedName("jp.h")
    public int field3616;

    @ObfuscatedName("jp.k")
    public int field3622 = 1;

    public class285(class338 arg0, class280 arg1) {
        super(100);
        this.field3621 = arg0;
        this.field3615 = arg1;
    }

    @ObfuscatedName("jp.a(I)Ljg;")
    public class274 method4749() {
        return new class273();
    }

    @ObfuscatedName("jp.t(II)[Ljg;")
    public class274[] method4750(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("jp.n(Ljava/lang/String;I)V")
    public final void method4902(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class289.method305(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3618 = var9;
    }

    @ObfuscatedName("jp.cw(Ljava/lang/String;B)V")
    public final void method4887(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class289.method305(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3619 = var9;
    }

    @ObfuscatedName("jp.cd(Lkc;I)V")
    public final void method4881(class300 arg0) {
        this.method4887(arg0.method5132());
        long var2 = arg0.method5129();
        this.method4902(class289.method523(var2));
        this.field3617 = arg0.method5268();
        int var4 = arg0.method5123();
        if (var4 == 255) {
            return;
        }
        this.method4776();
        for (int var5 = 0; var5 < var4; var5++) {
            class273 var6 = (class273) this.method4777(new class283(arg0.method5132(), this.field3621));
            int var7 = arg0.method5166();
            var6.method4827(var7, ++this.field3622 - 1);
            var6.field3599 = arg0.method5268();
            arg0.method5132();
            this.method4892(var6);
        }
    }

    @ObfuscatedName("jp.cn(Lkc;B)V")
    public final void method4878(class300 arg0) {
        class283 var2 = new class283(arg0.method5132(), this.field3621);
        int var3 = arg0.method5166();
        byte var4 = arg0.method5268();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4756() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4760(var2);
            if (var6 != null && var6.method4836() == var3) {
                this.method4763(var6);
            }
            return;
        }
        arg0.method5132();
        class273 var7 = (class273) this.method4760(var2);
        if (var7 == null) {
            if (this.method4756() > this.field3594) {
                return;
            }
            var7 = (class273) this.method4777(var2);
        }
        var7.method4827(var3, ++this.field3622 - 1);
        var7.field3599 = var4;
        this.method4892(var7);
    }

    @ObfuscatedName("jp.cr(I)V")
    public final void method4879() {
        for (int var1 = 0; var1 < this.method4756(); var1++) {
            ((class273) this.method4766(var1)).method4690();
        }
    }

    @ObfuscatedName("jp.ci(I)V")
    public final void method4880() {
        for (int var1 = 0; var1 < this.method4756(); var1++) {
            ((class273) this.method4766(var1)).method4700();
        }
    }

    @ObfuscatedName("jp.cy(Ljn;I)V")
    public final void method4892(class273 arg0) {
        if (arg0.method4737().equals(this.field3615.method1237())) {
            this.field3616 = arg0.field3599;
        }
    }
}
