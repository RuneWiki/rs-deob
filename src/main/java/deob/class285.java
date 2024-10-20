package deob;

@ObfuscatedName("jl")
public class class285 extends class277 {

    @ObfuscatedName("jl.j")
    public final class338 field3614;

    @ObfuscatedName("jl.i")
    public final class280 field3616;

    @ObfuscatedName("jl.d")
    public String field3613 = null;

    @ObfuscatedName("jl.f")
    public String field3612 = null;

    @ObfuscatedName("jl.c")
    public byte field3615;

    @ObfuscatedName("jl.r")
    public int field3611;

    @ObfuscatedName("jl.y")
    public int field3617 = 1;

    public class285(class338 arg0, class280 arg1) {
        super(100);
        this.field3614 = arg0;
        this.field3616 = arg1;
    }

    @ObfuscatedName("jl.s(I)Lju;")
    public class274 method4665() {
        return new class273();
    }

    @ObfuscatedName("jl.j(II)[Lju;")
    public class274[] method4663(int arg0) {
        return new class273[arg0];
    }

    @ObfuscatedName("jl.i(Ljava/lang/String;B)V")
    public final void method4789(String arg0) {
        this.field3613 = class289.method3031(arg0);
    }

    @ObfuscatedName("jl.q(Ljava/lang/String;B)V")
    public final void method4797(String arg0) {
        this.field3612 = class289.method3031(arg0);
    }

    @ObfuscatedName("jl.ck(Lky;B)V")
    public final void method4791(class300 arg0) {
        this.method4797(arg0.method5150());
        long var2 = arg0.method5221();
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
                var10.append(class289.field3629[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method4789(var6);
        this.field3615 = arg0.method5034();
        int var13 = arg0.method5179();
        if (var13 == 255) {
            return;
        }
        this.method4727();
        for (int var14 = 0; var14 < var13; var14++) {
            class273 var15 = (class273) this.method4689(new class283(arg0.method5150(), this.field3614));
            int var16 = arg0.method5054();
            var15.method4745(var16, ++this.field3617 - 1);
            var15.field3592 = arg0.method5034();
            arg0.method5150();
            this.method4787(var15);
        }
    }

    @ObfuscatedName("jl.cc(Lky;I)V")
    public final void method4792(class300 arg0) {
        class283 var2 = new class283(arg0.method5150(), this.field3614);
        int var3 = arg0.method5054();
        byte var4 = arg0.method5034();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4699() == 0) {
                return;
            }
            class273 var6 = (class273) this.method4713(var2);
            if (var6 != null && var6.method4748() == var3) {
                this.method4678(var6);
            }
            return;
        }
        arg0.method5150();
        class273 var7 = (class273) this.method4713(var2);
        if (var7 == null) {
            if (this.method4699() > this.field3583) {
                return;
            }
            var7 = (class273) this.method4689(var2);
        }
        var7.method4745(var3, ++this.field3617 - 1);
        var7.field3592 = var4;
        this.method4787(var7);
    }

    @ObfuscatedName("jl.cd(I)V")
    public final void method4793() {
        for (int var1 = 0; var1 < this.method4699(); var1++) {
            ((class273) this.method4736(var1)).method4620();
        }
    }

    @ObfuscatedName("jl.cf(I)V")
    public final void method4794() {
        for (int var1 = 0; var1 < this.method4699(); var1++) {
            ((class273) this.method4736(var1)).method4613();
        }
    }

    @ObfuscatedName("jl.cw(Ljr;I)V")
    public final void method4787(class273 arg0) {
        if (arg0.method4632().equals(this.field3616.method1169())) {
            this.field3611 = arg0.field3592;
        }
    }
}
