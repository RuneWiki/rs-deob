package deob;

@ObfuscatedName("ji")
public class class282 extends class276 {

    @ObfuscatedName("ji.g")
    public final class314 field3730;

    @ObfuscatedName("ji.m")
    public final class278 field3731;

    @ObfuscatedName("ji.z")
    public String field3732 = null;

    @ObfuscatedName("ji.k")
    public String field3733 = null;

    @ObfuscatedName("ji.c")
    public byte field3738;

    @ObfuscatedName("ji.o")
    public byte field3734;

    public class282(class314 arg0, class278 arg1) {
        super(100);
        this.field3730 = arg0;
        this.field3731 = arg1;
    }

    @ObfuscatedName("ji.s(I)Ljq;")
    public class274 method4826() {
        return new class273();
    }

    @ObfuscatedName("ji.g(II)[Ljq;")
    public class274[] method4830(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("ji.m(Ljava/lang/String;B)V")
    public final void method4951(String arg0) {
        this.field3732 = class292.method5082(arg0);
    }

    @ObfuscatedName("ji.cx(Ljava/lang/String;I)V")
    public final void method4973(String arg0) {
        this.field3733 = class292.method5082(arg0);
    }

    @ObfuscatedName("ji.ck(Lgy;B)V")
    public final void method4953(class185 arg0) {
        this.method4973(arg0.method3248());
        long var2 = arg0.method3405();
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
                var10.append(class292.field3792[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method4951(var6);
        this.field3738 = arg0.method3240();
        int var13 = arg0.method3239();
        if (var13 == 255) {
            return;
        }
        this.method4907();
        for (int var14 = 0; var14 < var13; var14++) {
            class273 var15 = (class273) this.method4846(new class281(arg0.method3248(), this.field3730));
            var15.field3699 = arg0.method3241();
            var15.field3697 = arg0.method3240();
            arg0.method3248();
            this.method4955(var15);
        }
    }

    @ObfuscatedName("ji.cb(Lgy;I)V")
    public final void method4952(class185 arg0) {
        class281 var2 = new class281(arg0.method3248(), this.field3730);
        int var3 = arg0.method3241();
        byte var4 = arg0.method3240();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4838() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4842(var2);
            if (var6 != null && var6.field3699 == var3) {
                this.method4845(var6);
            }
            return;
        }
        arg0.method3248();
        class273 var7 = (class273) this.method4840(var2);
        if (var7 == null) {
            if (this.method4838() > this.field3708) {
                return;
            }
            var7 = (class273) this.method4846(var2);
        }
        var7.field3699 = var3;
        var7.field3697 = var4;
        this.method4955(var7);
    }

    @ObfuscatedName("ji.cm(I)V")
    public final void method4954() {
        for (int var1 = 0; var1 < this.method4838(); var1++) {
            ((class273) this.method4848(var1)).method4786();
        }
    }

    @ObfuscatedName("ji.cu(B)V")
    public final void method4950() {
        for (int var1 = 0; var1 < this.method4838(); var1++) {
            ((class273) this.method4848(var1)).method4784();
        }
    }

    @ObfuscatedName("ji.cf(Ljn;B)V")
    public final void method4955(class273 arg0) {
        if (arg0.method4805().equals(this.field3731.method1400())) {
            this.field3734 = arg0.field3697;
        }
    }
}
