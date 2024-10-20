package deob;

@ObfuscatedName("sp")
public class class470 extends class476 {

    @ObfuscatedName("sp.ae")
    public final class528 field4966;

    @ObfuscatedName("sp.ag")
    public final class468 field4969;

    @ObfuscatedName("sp.am")
    public String field4968 = null;

    @ObfuscatedName("sp.ax")
    public String field4967 = null;

    @ObfuscatedName("sp.aq")
    public byte field4972;

    @ObfuscatedName("sp.af")
    public int field4971;

    @ObfuscatedName("sp.at")
    public int field4965 = 1;

    public class470(class528 arg0, class468 arg1) {
        super(500);
        this.field4966 = arg0;
        this.field4969 = arg1;
    }

    @ObfuscatedName("sp.ac(I)Lss;")
    public class474 method7986() {
        return new class473();
    }

    @ObfuscatedName("sp.ae(II)[Lss;")
    public class474[] method7985(int arg0) {
        return new class473[arg0];
    }

    @ObfuscatedName("sp.ag(Ljava/lang/String;B)V")
    public final void method8009(String arg0) {
        this.field4968 = Statics.method8842(arg0);
    }

    @ObfuscatedName("sp.au(Ljava/lang/String;I)V")
    public final void method8010(String arg0) {
        String var2 = class421.method5758(class421.method3242(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4967 = var2;
    }

    @ObfuscatedName("sp.ar(Lvf;IB)V")
    public final void method8011(class551 arg0, int arg1) {
        this.method8010(arg0.method9166());
        long var3 = arg0.method8980();
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
                var11.append(class421.field4704[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method8009(var7);
        this.field4972 = arg0.method8975();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8955();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8990();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method8086();
        for (int var17 = 0; var17 < var16; var17++) {
            class473 var18 = (class473) this.method8095(new class574(arg0.method9166(), this.field4966));
            int var19 = arg0.method9119();
            var18.method8158(var19, ++this.field4965 - 1);
            var18.field4999 = arg0.method8975();
            arg0.method9166();
            this.method8018(var18);
        }
    }

    @ObfuscatedName("sp.al(Lvf;B)V")
    public final void method8019(class551 arg0) {
        class574 var2 = new class574(arg0.method9166(), this.field4966);
        int var3 = arg0.method9119();
        byte var4 = arg0.method8975();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method8109() == 0) {
                return;
            }
            class473 var6 = (class473) this.method8091(var2);
            if (var6 != null && var6.method8159() == var3) {
                this.method8094(var6);
            }
            return;
        }
        arg0.method9166();
        class473 var7 = (class473) this.method8091(var2);
        if (var7 == null) {
            if (this.method8109() > this.field4992) {
                return;
            }
            var7 = (class473) this.method8095(var2);
        }
        var7.method8158(var3, ++this.field4965 - 1);
        var7.field4999 = var4;
        this.method8018(var7);
    }

    @ObfuscatedName("sp.ad(B)V")
    public final void method8013() {
        for (int var1 = 0; var1 < this.method8109(); var1++) {
            ((class473) this.method8097(var1)).method8039();
        }
    }

    @ObfuscatedName("sp.ah(B)V")
    public final void method8014() {
        for (int var1 = 0; var1 < this.method8109(); var1++) {
            ((class473) this.method8097(var1)).method8042();
        }
    }

    @ObfuscatedName("sp.ap(Lsh;I)V")
    public final void method8018(class473 arg0) {
        if (arg0.method8064().equals(this.field4969.method1807())) {
            this.field4971 = arg0.field4999;
        }
    }
}
