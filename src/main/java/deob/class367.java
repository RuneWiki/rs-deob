package deob;

@ObfuscatedName("no")
public class class367 extends class373 {

    @ObfuscatedName("no.v")
    public final class423 field4292;

    @ObfuscatedName("no.q")
    public final class365 field4295;

    @ObfuscatedName("no.f")
    public String field4294 = null;

    @ObfuscatedName("no.j")
    public String field4293 = null;

    @ObfuscatedName("no.e")
    public byte field4296;

    @ObfuscatedName("no.g")
    public int field4297;

    @ObfuscatedName("no.w")
    public int field4298 = 1;

    public class367(class423 arg0, class365 arg1) {
        super(500);
        this.field4292 = arg0;
        this.field4295 = arg1;
    }

    @ObfuscatedName("no.c(S)Lne;")
    public class371 method5998() {
        return new class370();
    }

    @ObfuscatedName("no.v(II)[Lne;")
    public class371[] method5992(int arg0) {
        return new class370[arg0];
    }

    @ObfuscatedName("no.q(Ljava/lang/String;B)V")
    public final void method6006(String arg0) {
        this.field4294 = class345.method2955(arg0);
    }

    @ObfuscatedName("no.w(Ljava/lang/String;B)V")
    public final void method6007(String arg0) {
        this.field4293 = class345.method2955(arg0);
    }

    @ObfuscatedName("no.y(Lqt;II)V")
    public final void method6008(class443 arg0, int arg1) {
        this.method6007(arg0.method7057());
        long var3 = arg0.method7106();
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
                var11.append(class345.field4157[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method6006(var7);
        this.field4296 = arg0.method7048();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method7047();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method7063();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method6095();
        for (int var17 = 0; var17 < var16; var17++) {
            class370 var18 = (class370) this.method6165(new class464(arg0.method7057(), this.field4292));
            int var19 = arg0.method7049();
            var18.method6181(var19, ++this.field4298 - 1);
            var18.field4324 = arg0.method7048();
            arg0.method7057();
            this.method6028(var18);
        }
    }

    @ObfuscatedName("no.i(Lqt;B)V")
    public final void method6024(class443 arg0) {
        class464 var2 = new class464(arg0.method7057(), this.field4292);
        int var3 = arg0.method7049();
        byte var4 = arg0.method7048();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6096() == 0) {
                return;
            }
            class370 var6 = (class370) this.method6100(var2);
            if (var6 != null && var6.method6180() == var3) {
                this.method6103(var6);
            }
            return;
        }
        arg0.method7057();
        class370 var7 = (class370) this.method6100(var2);
        if (var7 == null) {
            if (this.method6096() > this.field4318) {
                return;
            }
            var7 = (class370) this.method6165(var2);
        }
        var7.method6181(var3, ++this.field4298 - 1);
        var7.field4324 = var4;
        this.method6028(var7);
    }

    @ObfuscatedName("no.s(I)V")
    public final void method6010() {
        for (int var1 = 0; var1 < this.method6096(); var1++) {
            ((class370) this.method6125(var1)).method6046();
        }
    }

    @ObfuscatedName("no.t(I)V")
    public final void method6013() {
        for (int var1 = 0; var1 < this.method6096(); var1++) {
            ((class370) this.method6125(var1)).method6049();
        }
    }

    @ObfuscatedName("no.z(Lnj;I)V")
    public final void method6028(class370 arg0) {
        if (arg0.method6075().equals(this.field4295.method1051())) {
            this.field4297 = arg0.field4324;
        }
    }
}
