package deob;

@ObfuscatedName("lz")
public class class334 extends class340 {

    @ObfuscatedName("lz.q")
    public final class383 field3941;

    @ObfuscatedName("lz.f")
    public final class332 field3946;

    @ObfuscatedName("lz.j")
    public String field3943 = null;

    @ObfuscatedName("lz.m")
    public String field3944 = null;

    @ObfuscatedName("lz.k")
    public byte field3947;

    @ObfuscatedName("lz.t")
    public int field3942;

    @ObfuscatedName("lz.a")
    public int field3940 = 1;

    public class334(class383 arg0, class332 arg1) {
        super(100);
        this.field3941 = arg0;
        this.field3946 = arg1;
    }

    @ObfuscatedName("lz.l(I)Llu;")
    public class338 method5438() {
        return new class337();
    }

    @ObfuscatedName("lz.q(II)[Llu;")
    public class338[] method5439(int arg0) {
        return new class337[arg0];
    }

    @ObfuscatedName("lz.f(Ljava/lang/String;I)V")
    public final void method5462(String arg0) {
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
        String var9 = class321.method3732(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3943 = var9;
    }

    @ObfuscatedName("lz.y(Ljava/lang/String;I)V")
    public final void method5463(String arg0) {
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
        String var9 = class321.method3732(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field3944 = var9;
    }

    @ObfuscatedName("lz.w(Lot;B)V")
    public final void method5467(class401 arg0) {
        this.method5463(arg0.method6474());
        long var2 = arg0.method6275();
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
                var10.append(class321.field3875[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5462(var6);
        this.field3947 = arg0.method6273();
        int var13 = arg0.method6272();
        if (var13 == 255) {
            return;
        }
        this.method5583();
        for (int var14 = 0; var14 < var13; var14++) {
            class337 var15 = (class337) this.method5545(new class422(arg0.method6474(), this.field3941));
            int var16 = arg0.method6284();
            var15.method5610(var16, ++this.field3940 - 1);
            var15.field3974 = arg0.method6273();
            arg0.method6474();
            this.method5466(var15);
        }
    }

    @ObfuscatedName("lz.g(Lot;I)V")
    public final void method5465(class401 arg0) {
        class422 var2 = new class422(arg0.method6474(), this.field3941);
        int var3 = arg0.method6284();
        byte var4 = arg0.method6273();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5564() == 0) {
                return;
            }
            class337 var6 = (class337) this.method5541(var2);
            if (var6 != null && var6.method5611() == var3) {
                this.method5544(var6);
            }
            return;
        }
        arg0.method6474();
        class337 var7 = (class337) this.method5541(var2);
        if (var7 == null) {
            if (this.method5564() > this.field3969) {
                return;
            }
            var7 = (class337) this.method5545(var2);
        }
        var7.method5610(var3, ++this.field3940 - 1);
        var7.field3974 = var4;
        this.method5466(var7);
    }

    @ObfuscatedName("lz.v(I)V")
    public final void method5474() {
        for (int var1 = 0; var1 < this.method5564(); var1++) {
            ((class337) this.method5547(var1)).method5491();
        }
    }

    @ObfuscatedName("lz.s(I)V")
    public final void method5461() {
        for (int var1 = 0; var1 < this.method5564(); var1++) {
            ((class337) this.method5547(var1)).method5496();
        }
    }

    @ObfuscatedName("lz.c(Llj;I)V")
    public final void method5466(class337 arg0) {
        if (arg0.method5508().equals(this.field3946.method1216())) {
            this.field3942 = arg0.field3974;
        }
    }
}
