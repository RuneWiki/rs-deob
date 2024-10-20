package deob;

@ObfuscatedName("ki")
public class class308 extends class300 {

    @ObfuscatedName("ki.i")
    public final class336 field3862;

    @ObfuscatedName("ki.o")
    public final class303 field3859;

    @ObfuscatedName("ki.r")
    public String field3858 = null;

    @ObfuscatedName("ki.d")
    public String field3857 = null;

    @ObfuscatedName("ki.a")
    public byte field3861;

    @ObfuscatedName("ki.e")
    public int field3863;

    @ObfuscatedName("ki.f")
    public int field3864 = 1;

    public class308(class336 arg0, class303 arg1) {
        super(100);
        this.field3862 = arg0;
        this.field3859 = arg1;
    }

    @ObfuscatedName("ki.c(I)Lku;")
    public class297 method4925() {
        return new class296();
    }

    @ObfuscatedName("ki.i(II)[Lku;")
    public class297[] method4932(int arg0) {
        return new class296[arg0];
    }

    @ObfuscatedName("ki.o(Ljava/lang/String;I)V")
    public final void method5059(String arg0) {
        this.field3858 = class317.method2893(arg0);
    }

    @ObfuscatedName("ki.w(Ljava/lang/String;I)V")
    public final void method5060(String arg0) {
        this.field3857 = class317.method2893(arg0);
    }

    @ObfuscatedName("ki.r(Lgp;S)V")
    public final void method5082(class195 arg0) {
        this.method5060(arg0.method3427());
        long var2 = arg0.method3231();
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
                var10.append(class317.field3923[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5059(var6);
        this.field3861 = arg0.method3226();
        int var13 = arg0.method3429();
        if (var13 == 255) {
            return;
        }
        this.method4971();
        for (int var14 = 0; var14 < var13; var14++) {
            class296 var15 = (class296) this.method4946(new class306(arg0.method3427(), this.field3862));
            int var16 = arg0.method3218();
            var15.method5007(var16, ++this.field3864 - 1);
            var15.field3839 = arg0.method3226();
            arg0.method3427();
            this.method5061(var15);
        }
    }

    @ObfuscatedName("ki.d(Lgp;I)V")
    public final void method5080(class195 arg0) {
        class306 var2 = new class306(arg0.method3427(), this.field3862);
        int var3 = arg0.method3218();
        byte var4 = arg0.method3226();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4938() == 0) {
                return;
            }
            class296 var6 = (class296) this.method4943(var2);
            if (var6 != null && var6.method5012() == var3) {
                this.method4945(var6);
            }
            return;
        }
        arg0.method3427();
        class296 var7 = (class296) this.method4943(var2);
        if (var7 == null) {
            if (this.method4938() > this.field3834) {
                return;
            }
            var7 = (class296) this.method4946(var2);
        }
        var7.method5007(var3, ++this.field3864 - 1);
        var7.field3839 = var4;
        this.method5061(var7);
    }

    @ObfuscatedName("ki.a(I)V")
    public final void method5063() {
        for (int var1 = 0; var1 < this.method4938(); var1++) {
            ((class296) this.method4970(var1)).method4860();
        }
    }

    @ObfuscatedName("ki.cc(I)V")
    public final void method5064() {
        for (int var1 = 0; var1 < this.method4938(); var1++) {
            ((class296) this.method4970(var1)).method4863();
        }
    }

    @ObfuscatedName("ki.cg(Lkg;I)V")
    public final void method5061(class296 arg0) {
        if (arg0.method4884().equals(this.field3859.method1107())) {
            this.field3863 = arg0.field3839;
        }
    }
}
