package deob;

@ObfuscatedName("lz")
public class class334 extends class340 {

    @ObfuscatedName("lz.w")
    public final class383 field3937;

    @ObfuscatedName("lz.s")
    public final class332 field3939;

    @ObfuscatedName("lz.a")
    public String field3936 = null;

    @ObfuscatedName("lz.o")
    public String field3933 = null;

    @ObfuscatedName("lz.g")
    public byte field3938;

    @ObfuscatedName("lz.e")
    public int field3935;

    @ObfuscatedName("lz.p")
    public int field3940 = 1;

    public class334(class383 arg0, class332 arg1) {
        super(100);
        this.field3937 = arg0;
        this.field3939 = arg1;
    }

    @ObfuscatedName("lz.i(I)Lla;")
    public class338 method5402() {
        return new class337();
    }

    @ObfuscatedName("lz.w(IB)[Lla;")
    public class338[] method5403(int arg0) {
        return new class337[arg0];
    }

    @ObfuscatedName("lz.s(Ljava/lang/String;I)V")
    public final void method5422(String arg0) {
        this.field3936 = class321.method2525(arg0);
    }

    @ObfuscatedName("lz.e(Ljava/lang/String;I)V")
    public final void method5424(String arg0) {
        this.field3933 = class321.method2525(arg0);
    }

    @ObfuscatedName("lz.p(Lop;I)V")
    public final void method5427(class401 arg0) {
        this.method5424(arg0.method6335());
        long var2 = arg0.method6249();
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
                var10.append(class321.field3868[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5422(var6);
        this.field3938 = arg0.method6241();
        int var13 = arg0.method6240();
        if (var13 == 255) {
            return;
        }
        this.method5495();
        for (int var14 = 0; var14 < var13; var14++) {
            class337 var15 = (class337) this.method5510(new class422(arg0.method6335(), this.field3937));
            int var16 = arg0.method6242();
            var15.method5584(var16, ++this.field3940 - 1);
            var15.field3964 = arg0.method6241();
            arg0.method6335();
            this.method5420(var15);
        }
    }

    @ObfuscatedName("lz.j(Lop;I)V")
    public final void method5432(class401 arg0) {
        class422 var2 = new class422(arg0.method6335(), this.field3937);
        int var3 = arg0.method6242();
        byte var4 = arg0.method6241();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method5496() == 0) {
                return;
            }
            class337 var6 = (class337) this.method5558(var2);
            if (var6 != null && var6.method5585() == var3) {
                this.method5520(var6);
            }
            return;
        }
        arg0.method6335();
        class337 var7 = (class337) this.method5558(var2);
        if (var7 == null) {
            if (this.method5496() > this.field3957) {
                return;
            }
            var7 = (class337) this.method5510(var2);
        }
        var7.method5584(var3, ++this.field3940 - 1);
        var7.field3964 = var4;
        this.method5420(var7);
    }

    @ObfuscatedName("lz.k(B)V")
    public final void method5431() {
        for (int var1 = 0; var1 < this.method5496(); var1++) {
            ((class337) this.method5505(var1)).method5451();
        }
    }

    @ObfuscatedName("lz.t(I)V")
    public final void method5426() {
        for (int var1 = 0; var1 < this.method5496(); var1++) {
            ((class337) this.method5505(var1)).method5454();
        }
    }

    @ObfuscatedName("lz.l(Llp;I)V")
    public final void method5420(class337 arg0) {
        if (arg0.method5471().equals(this.field3939.method1108())) {
            this.field3935 = arg0.field3964;
        }
    }
}
