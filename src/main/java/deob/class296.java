package deob;

@ObfuscatedName("ki")
public class class296 extends class288 {

    @ObfuscatedName("ki.l")
    public final class331 field3727;

    @ObfuscatedName("ki.w")
    public final class291 field3721;

    @ObfuscatedName("ki.m")
    public String field3722 = null;

    @ObfuscatedName("ki.d")
    public String field3724 = null;

    @ObfuscatedName("ki.z")
    public byte field3723;

    @ObfuscatedName("ki.x")
    public int field3725;

    @ObfuscatedName("ki.v")
    public int field3726 = 1;

    public class296(class331 arg0, class291 arg1) {
        super(100);
        this.field3727 = arg0;
        this.field3721 = arg1;
    }

    @ObfuscatedName("ki.f(I)Ljb;")
    public class285 method5023() {
        return new class284();
    }

    @ObfuscatedName("ki.l(IS)[Ljb;")
    public class285[] method5024(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("ki.w(Ljava/lang/String;I)V")
    public final void method5175(String arg0) {
        this.field3722 = class306.method2407(arg0);
    }

    @ObfuscatedName("ki.x(Ljava/lang/String;I)V")
    public final void method5156(String arg0) {
        this.field3724 = class306.method2407(arg0);
    }

    @ObfuscatedName("ki.cz(Lgm;B)V")
    public final void method5158(class185 arg0) {
        this.method5156(arg0.method3353());
        long var2 = arg0.method3437();
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
                var10.append(class306.field3789[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5175(var6);
        this.field3723 = arg0.method3345();
        int var13 = arg0.method3344();
        if (var13 == 255) {
            return;
        }
        this.method5035();
        for (int var14 = 0; var14 < var13; var14++) {
            class284 var15 = (class284) this.method5044(new class294(arg0.method3353(), this.field3727));
            int var16 = arg0.method3346();
            var15.method5106(var16, ++this.field3726 - 1);
            var15.field3699 = arg0.method3345();
            arg0.method3353();
            this.method5162(var15);
        }
    }

    @ObfuscatedName("ki.cc(Lgm;S)V")
    public final void method5159(class185 arg0) {
        class294 var2 = new class294(arg0.method3353(), this.field3727);
        int var3 = arg0.method3346();
        byte var4 = arg0.method3345();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5049() == 0) {
                return;
            }
            class284 var6 = (class284) this.method5040(var2);
            if (var6 != null && var6.method5107() == var3) {
                this.method5043(var6);
            }
            return;
        }
        arg0.method3353();
        class284 var7 = (class284) this.method5040(var2);
        if (var7 == null) {
            if (this.method5049() > this.field3694) {
                return;
            }
            var7 = (class284) this.method5044(var2);
        }
        var7.method5106(var3, ++this.field3726 - 1);
        var7.field3699 = var4;
        this.method5162(var7);
    }

    @ObfuscatedName("ki.co(I)V")
    public final void method5160() {
        for (int var1 = 0; var1 < this.method5049(); var1++) {
            ((class284) this.method5034(var1)).method4969();
        }
    }

    @ObfuscatedName("ki.cq(I)V")
    public final void method5161() {
        for (int var1 = 0; var1 < this.method5049(); var1++) {
            ((class284) this.method5034(var1)).method4972();
        }
    }

    @ObfuscatedName("ki.cw(Lja;I)V")
    public final void method5162(class284 arg0) {
        if (arg0.method5002().equals(this.field3721.method1109())) {
            this.field3725 = arg0.field3699;
        }
    }
}
