package deob;

@ObfuscatedName("kb")
public class class294 extends class286 {

    @ObfuscatedName("kb.m")
    public final class323 field3669;

    @ObfuscatedName("kb.q")
    public final class289 field3667;

    @ObfuscatedName("kb.a")
    public String field3668 = null;

    @ObfuscatedName("kb.l")
    public String field3670 = null;

    @ObfuscatedName("kb.d")
    public byte field3675;

    @ObfuscatedName("kb.s")
    public int field3672;

    @ObfuscatedName("kb.p")
    public int field3673 = 1;

    public class294(class323 arg0, class289 arg1) {
        super(100);
        this.field3669 = arg0;
        this.field3667 = arg1;
    }

    @ObfuscatedName("kb.w(B)Ljn;")
    public class283 method4946() {
        return new class282();
    }

    @ObfuscatedName("kb.m(II)[Ljn;")
    public class283[] method4943(int arg0) {
        return new class282[arg0];
    }

    @ObfuscatedName("kb.q(Ljava/lang/String;I)V")
    public final void method5069(String arg0) {
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
        String var9 = class304.method5224(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3668 = var9;
    }

    @ObfuscatedName("kb.d(Ljava/lang/String;S)V")
    public final void method5070(String arg0) {
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
        String var9 = class304.method5224(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3670 = var9;
    }

    @ObfuscatedName("kb.s(Lgy;I)V")
    public final void method5080(class183 arg0) {
        this.method5070(arg0.method3271());
        long var2 = arg0.method3486();
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
                var10.append(class304.field3733[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5069(var6);
        this.field3675 = arg0.method3263();
        int var13 = arg0.method3436();
        if (var13 == 255) {
            return;
        }
        this.method4951();
        for (int var14 = 0; var14 < var13; var14++) {
            class282 var15 = (class282) this.method4960(new class292(arg0.method3271(), this.field3669));
            int var16 = arg0.method3268();
            var15.method5030(var16, ++this.field3673 - 1);
            var15.field3648 = arg0.method3263();
            arg0.method3271();
            this.method5075(var15);
        }
    }

    @ObfuscatedName("kb.ca(Lgy;I)V")
    public final void method5072(class183 arg0) {
        class292 var2 = new class292(arg0.method3271(), this.field3669);
        int var3 = arg0.method3268();
        byte var4 = arg0.method3263();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4952() == 0) {
                return;
            }
            class282 var6 = (class282) this.method4979(var2);
            if (var6 != null && var6.method5031() == var3) {
                this.method4969(var6);
            }
            return;
        }
        arg0.method3271();
        class282 var7 = (class282) this.method4979(var2);
        if (var7 == null) {
            if (this.method4952() > this.field3643) {
                return;
            }
            var7 = (class282) this.method4960(var2);
        }
        var7.method5030(var3, ++this.field3673 - 1);
        var7.field3648 = var4;
        this.method5075(var7);
    }

    @ObfuscatedName("kb.cm(I)V")
    public final void method5091() {
        for (int var1 = 0; var1 < this.method4952(); var1++) {
            ((class282) this.method4962(var1)).method4886();
        }
    }

    @ObfuscatedName("kb.cb(B)V")
    public final void method5074() {
        for (int var1 = 0; var1 < this.method4952(); var1++) {
            ((class282) this.method4962(var1)).method4890();
        }
    }

    @ObfuscatedName("kb.cg(Ljw;B)V")
    public final void method5075(class282 arg0) {
        if (arg0.method4910().equals(this.field3667.method1117())) {
            this.field3672 = arg0.field3648;
        }
    }
}
