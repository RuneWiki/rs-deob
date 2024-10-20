package deob;

@ObfuscatedName("kn")
public class class294 extends class286 {

    @ObfuscatedName("kn.w")
    public final class323 field3657;

    @ObfuscatedName("kn.s")
    public final class289 field3653;

    @ObfuscatedName("kn.e")
    public String field3655 = null;

    @ObfuscatedName("kn.p")
    public String field3656 = null;

    @ObfuscatedName("kn.b")
    public byte field3652;

    @ObfuscatedName("kn.n")
    public int field3658;

    @ObfuscatedName("kn.f")
    public int field3659 = 1;

    public class294(class323 arg0, class289 arg1) {
        super(100);
        this.field3657 = arg0;
        this.field3653 = arg1;
    }

    @ObfuscatedName("kn.z(I)Ljx;")
    public class283 method4921() {
        return new class282();
    }

    @ObfuscatedName("kn.w(II)[Ljx;")
    public class283[] method4924(int arg0) {
        return new class282[arg0];
    }

    @ObfuscatedName("kn.s(Ljava/lang/String;I)V")
    public final void method5052(String arg0) {
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
        String var9 = class304.method3160(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3655 = var9;
    }

    @ObfuscatedName("kn.e(Ljava/lang/String;I)V")
    public final void method5044(String arg0) {
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
        String var9 = class304.method3160(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3656 = var9;
    }

    @ObfuscatedName("kn.p(Lgk;I)V")
    public final void method5043(class183 arg0) {
        this.method5044(arg0.method3441());
        long var2 = arg0.method3257();
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
                var10.append(class304.field3721[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5052(var6);
        this.field3652 = arg0.method3384();
        int var13 = arg0.method3247();
        if (var13 == 255) {
            return;
        }
        this.method4932();
        for (int var14 = 0; var14 < var13; var14++) {
            class282 var15 = (class282) this.method4977(new class292(arg0.method3441(), this.field3657));
            int var16 = arg0.method3253();
            var15.method5007(var16, ++this.field3659 - 1);
            var15.field3630 = arg0.method3384();
            arg0.method3441();
            this.method5057(var15);
        }
    }

    @ObfuscatedName("kn.cf(Lgk;I)V")
    public final void method5064(class183 arg0) {
        class292 var2 = new class292(arg0.method3441(), this.field3657);
        int var3 = arg0.method3253();
        byte var4 = arg0.method3384();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4933() == 0) {
                return;
            }
            class282 var6 = (class282) this.method4937(var2);
            if (var6 != null && var6.method5009() == var3) {
                this.method4940(var6);
            }
            return;
        }
        arg0.method3441();
        class282 var7 = (class282) this.method4937(var2);
        if (var7 == null) {
            if (this.method4933() > this.field3621) {
                return;
            }
            var7 = (class282) this.method4977(var2);
        }
        var7.method5007(var3, ++this.field3659 - 1);
        var7.field3630 = var4;
        this.method5057(var7);
    }

    @ObfuscatedName("kn.ca(B)V")
    public final void method5047() {
        for (int var1 = 0; var1 < this.method4933(); var1++) {
            ((class282) this.method4942(var1)).method4878();
        }
    }

    @ObfuscatedName("kn.cr(I)V")
    public final void method5048() {
        for (int var1 = 0; var1 < this.method4933(); var1++) {
            ((class282) this.method4942(var1)).method4879();
        }
    }

    @ObfuscatedName("kn.cv(Ljz;I)V")
    public final void method5057(class282 arg0) {
        if (arg0.method4893().equals(this.field3653.method1071())) {
            this.field3658 = arg0.field3630;
        }
    }
}
