package deob;

@ObfuscatedName("rt")
public class class448 extends class454 {

    @ObfuscatedName("rt.aw")
    public final class512 field4738;

    @ObfuscatedName("rt.al")
    public final class446 field4743;

    @ObfuscatedName("rt.ai")
    public String field4740 = null;

    @ObfuscatedName("rt.ar")
    public String field4741 = null;

    @ObfuscatedName("rt.as")
    public byte field4742;

    @ObfuscatedName("rt.aa")
    public int field4745;

    @ObfuscatedName("rt.az")
    public int field4744 = 1;

    public class448(class512 arg0, class446 arg1) {
        super(500);
        this.field4738 = arg0;
        this.field4743 = arg1;
    }

    @ObfuscatedName("rt.aq(B)Lra;")
    public class452 method7487() {
        return new class451();
    }

    @ObfuscatedName("rt.aw(IS)[Lra;")
    public class452[] method7488(int arg0) {
        return new class451[arg0];
    }

    @ObfuscatedName("rt.al(Ljava/lang/String;I)V")
    public final void method7507(String arg0) {
        String var2 = class408.method4018(class408.method2982(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4740 = var2;
    }

    @ObfuscatedName("rt.ao(Ljava/lang/String;B)V")
    public final void method7508(String arg0) {
        String var2 = class408.method4018(class408.method2982(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4741 = var2;
    }

    @ObfuscatedName("rt.au(Luq;II)V")
    public final void method7515(class534 arg0, int arg1) {
        this.method7508(arg0.method8741());
        long var3 = arg0.method8598();
        long var5 = var3;
        String var7;
        if (var3 <= 0L || var3 >= 6582952005840035281L) {
            var7 = null;
        } else if (var3 % 37L == 0L) {
            var7 = null;
        } else {
            int var8 = 0;
            for (long var9 = var3; var9 != 0L; var9 /= 37L) {
                var8++;
            }
            StringBuilder var11 = new StringBuilder(var8);
            while (var5 != 0L) {
                long var12 = var5;
                var5 /= 37L;
                var11.append(class408.field4545[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method7507(var7);
        this.field4742 = arg0.method8592();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8591();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8608();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7587();
        for (int var17 = 0; var17 < var16; var17++) {
            class451 var18 = (class451) this.method7643(new class557(arg0.method8741(), this.field4738));
            int var19 = arg0.method8593();
            var18.method7655(var19, ++this.field4744 - 1);
            var18.field4772 = arg0.method8592();
            arg0.method8741();
            this.method7519(var18);
        }
    }

    @ObfuscatedName("rt.ak(Luq;B)V")
    public final void method7510(class534 arg0) {
        class557 var2 = new class557(arg0.method8741(), this.field4738);
        int var3 = arg0.method8593();
        byte var4 = arg0.method8592();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7588() == 0) {
                return;
            }
            class451 var6 = (class451) this.method7649(var2);
            if (var6 != null && var6.method7656() == var3) {
                this.method7595(var6);
            }
            return;
        }
        arg0.method8741();
        class451 var7 = (class451) this.method7649(var2);
        if (var7 == null) {
            if (this.method7588() > this.field4763) {
                return;
            }
            var7 = (class451) this.method7643(var2);
        }
        var7.method7655(var3, ++this.field4744 - 1);
        var7.field4772 = var4;
        this.method7519(var7);
    }

    @ObfuscatedName("rt.ah(I)V")
    public final void method7511() {
        for (int var1 = 0; var1 < this.method7588(); var1++) {
            ((class451) this.method7598(var1)).method7540();
        }
    }

    @ObfuscatedName("rt.aj(B)V")
    public final void method7512() {
        for (int var1 = 0; var1 < this.method7588(); var1++) {
            ((class451) this.method7598(var1)).method7554();
        }
    }

    @ObfuscatedName("rt.af(Lrj;B)V")
    public final void method7519(class451 arg0) {
        if (arg0.method7559().equals(this.field4743.method1167())) {
            this.field4745 = arg0.field4772;
        }
    }
}
