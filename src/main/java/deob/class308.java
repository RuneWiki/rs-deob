package deob;

@ObfuscatedName("ky")
public class class308 extends class300 {

    @ObfuscatedName("ky.k")
    public final class336 field3867;

    @ObfuscatedName("ky.t")
    public final class303 field3868;

    @ObfuscatedName("ky.x")
    public String field3871 = null;

    @ObfuscatedName("ky.y")
    public String field3870 = null;

    @ObfuscatedName("ky.a")
    public byte field3866;

    @ObfuscatedName("ky.w")
    public int field3872;

    @ObfuscatedName("ky.n")
    public int field3873 = 1;

    public class308(class336 arg0, class303 arg1) {
        super(100);
        this.field3867 = arg0;
        this.field3868 = arg1;
    }

    @ObfuscatedName("ky.o(B)Lku;")
    public class297 method4904() {
        return new class296();
    }

    @ObfuscatedName("ky.k(II)[Lku;")
    public class297[] method4905(int arg0) {
        return new class296[arg0];
    }

    @ObfuscatedName("ky.t(Ljava/lang/String;I)V")
    public final void method5059(String arg0) {
        this.field3871 = class317.method4820(arg0);
    }

    @ObfuscatedName("ky.m(Ljava/lang/String;I)V")
    public final void method5041(String arg0) {
        this.field3870 = class317.method4820(arg0);
    }

    @ObfuscatedName("ky.z(Lgc;I)V")
    public final void method5049(class195 arg0) {
        this.method5041(arg0.method3284());
        long var2 = arg0.method3211();
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
                var10.append(class317.field3925[(int) (var11 - var4 * 37L)]);
            }
            var6 = var10.reverse().toString();
        }
        this.method5059(var6);
        this.field3866 = arg0.method3210();
        int var13 = arg0.method3205();
        if (var13 == 255) {
            return;
        }
        this.method4914();
        for (int var14 = 0; var14 < var13; var14++) {
            class296 var15 = (class296) this.method4924(new class306(arg0.method3284(), this.field3867));
            int var16 = arg0.method3207();
            var15.method4989(var16, ++this.field3873 - 1);
            var15.field3847 = arg0.method3210();
            arg0.method3284();
            this.method5050(var15);
        }
    }

    @ObfuscatedName("ky.i(Lgc;I)V")
    public final void method5043(class195 arg0) {
        class306 var2 = new class306(arg0.method3284(), this.field3867);
        int var3 = arg0.method3207();
        byte var4 = arg0.method3210();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4916() == 0) {
                return;
            }
            class296 var6 = (class296) this.method4936(var2);
            if (var6 != null && var6.method4990() == var3) {
                this.method4923(var6);
            }
            return;
        }
        arg0.method3284();
        class296 var7 = (class296) this.method4936(var2);
        if (var7 == null) {
            if (this.method4916() > this.field3839) {
                return;
            }
            var7 = (class296) this.method4924(var2);
        }
        var7.method4989(var3, ++this.field3873 - 1);
        var7.field3847 = var4;
        this.method5050(var7);
    }

    @ObfuscatedName("ky.cm(I)V")
    public final void method5044() {
        for (int var1 = 0; var1 < this.method4916(); var1++) {
            ((class296) this.method4926(var1)).method4859();
        }
    }

    @ObfuscatedName("ky.cw(I)V")
    public final void method5045() {
        for (int var1 = 0; var1 < this.method4916(); var1++) {
            ((class296) this.method4926(var1)).method4870();
        }
    }

    @ObfuscatedName("ky.ci(Lkg;I)V")
    public final void method5050(class296 arg0) {
        if (arg0.method4883().equals(this.field3868.method1155())) {
            this.field3872 = arg0.field3847;
        }
    }
}
