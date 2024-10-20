package deob;

@ObfuscatedName("rm")
public class class467 extends class473 {

    @ObfuscatedName("rm.ad")
    public final class525 field4925;

    @ObfuscatedName("rm.ag")
    public final class465 field4924;

    @ObfuscatedName("rm.ak")
    public String field4930 = null;

    @ObfuscatedName("rm.ap")
    public String field4928 = null;

    @ObfuscatedName("rm.an")
    public byte field4929;

    @ObfuscatedName("rm.aj")
    public int field4927;

    @ObfuscatedName("rm.av")
    public int field4931 = 1;

    public class467(class525 arg0, class465 arg1) {
        super(500);
        this.field4925 = arg0;
        this.field4924 = arg1;
    }

    @ObfuscatedName("rm.aq(B)Lsk;")
    public class471 method7759() {
        return new class470();
    }

    @ObfuscatedName("rm.ad(II)[Lsk;")
    public class471[] method7760(int arg0) {
        return new class470[arg0];
    }

    @ObfuscatedName("rm.ag(Ljava/lang/String;B)V")
    public final void method7778(String arg0) {
        this.field4930 = class418.method3395(arg0);
    }

    @ObfuscatedName("rm.ab(Ljava/lang/String;B)V")
    public final void method7779(String arg0) {
        this.field4928 = class418.method3395(arg0);
    }

    @ObfuscatedName("rm.ai(Lvp;IB)V")
    public final void method7780(class547 arg0, int arg1) {
        this.method7779(arg0.method8739());
        long var3 = arg0.method8735();
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
                var11.append(class418.field4679[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method7778(var7);
        this.field4929 = arg0.method8857();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8804();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8745();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7866();
        for (int var17 = 0; var17 < var16; var17++) {
            class470 var18 = (class470) this.method7900(new class569(arg0.method8739(), this.field4925));
            int var19 = arg0.method8899();
            var18.method7933(var19, ++this.field4931 - 1);
            var18.field4955 = arg0.method8857();
            arg0.method8739();
            this.method7784(var18);
        }
    }

    @ObfuscatedName("rm.ae(Lvp;I)V")
    public final void method7781(class547 arg0) {
        class569 var2 = new class569(arg0.method8739(), this.field4925);
        int var3 = arg0.method8899();
        byte var4 = arg0.method8857();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7889() == 0) {
                return;
            }
            class470 var6 = (class470) this.method7886(var2);
            if (var6 != null && var6.method7938() == var3) {
                this.method7874(var6);
            }
            return;
        }
        arg0.method8739();
        class470 var7 = (class470) this.method7886(var2);
        if (var7 == null) {
            if (this.method7889() > this.field4953) {
                return;
            }
            var7 = (class470) this.method7900(var2);
        }
        var7.method7933(var3, ++this.field4931 - 1);
        var7.field4955 = var4;
        this.method7784(var7);
    }

    @ObfuscatedName("rm.au(B)V")
    public final void method7782() {
        for (int var1 = 0; var1 < this.method7889(); var1++) {
            ((class470) this.method7876(var1)).method7822();
        }
    }

    @ObfuscatedName("rm.ah(B)V")
    public final void method7789() {
        for (int var1 = 0; var1 < this.method7889(); var1++) {
            ((class470) this.method7876(var1)).method7838();
        }
    }

    @ObfuscatedName("rm.az(Lsd;I)V")
    public final void method7784(class470 arg0) {
        if (arg0.method7842().equals(this.field4924.method1207())) {
            this.field4927 = arg0.field4955;
        }
    }
}
