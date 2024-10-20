package deob;

@ObfuscatedName("rp")
public class class445 extends class451 {

    @ObfuscatedName("rp.ap")
    public final class509 field4710;

    @ObfuscatedName("rp.af")
    public final class443 field4711;

    @ObfuscatedName("rp.aj")
    public String field4712 = null;

    @ObfuscatedName("rp.aq")
    public String field4716 = null;

    @ObfuscatedName("rp.ar")
    public byte field4714;

    @ObfuscatedName("rp.ag")
    public int field4715;

    @ObfuscatedName("rp.ao")
    public int field4709 = 1;

    public class445(class509 arg0, class443 arg1) {
        super(500);
        this.field4710 = arg0;
        this.field4711 = arg1;
    }

    @ObfuscatedName("rp.am(I)Lrq;")
    public class449 method7469() {
        return new class448();
    }

    @ObfuscatedName("rp.ap(IB)[Lrq;")
    public class449[] method7476(int arg0) {
        return new class448[arg0];
    }

    @ObfuscatedName("rp.af(Ljava/lang/String;B)V")
    public final void method7485(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class405.method294(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4712 = var9;
    }

    @ObfuscatedName("rp.ag(Ljava/lang/String;I)V")
    public final void method7501(String arg0) {
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        String var9 = class405.method294(var2);
        if (var9 == null) {
            var9 = "";
        }
        this.field4716 = var9;
    }

    @ObfuscatedName("rp.ao(Luk;II)V")
    public final void method7487(class531 arg0, int arg1) {
        this.method7501(arg0.method8641());
        long var3 = arg0.method8567();
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
                var11.append(class405.field4507[(int) (var12 - var5 * 37L)]);
            }
            var7 = var11.reverse().toString();
        }
        this.method7485(var7);
        this.field4714 = arg0.method8562();
        int var14;
        short var15;
        if (arg1 == 1) {
            var14 = arg0.method8561();
            var15 = 255;
        } else if (arg1 == 2) {
            var14 = arg0.method8563();
            var15 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var14 == var15) {
            return;
        }
        int var16 = var14;
        this.method7604();
        for (int var17 = 0; var17 < var16; var17++) {
            class448 var18 = (class448) this.method7610(new class554(arg0.method8641(), this.field4710));
            int var19 = arg0.method8775();
            var18.method7649(var19, ++this.field4709 - 1);
            var18.field4742 = arg0.method8562();
            arg0.method8641();
            this.method7491(var18);
        }
    }

    @ObfuscatedName("rp.ae(Luk;I)V")
    public final void method7488(class531 arg0) {
        class554 var2 = new class554(arg0.method8641(), this.field4710);
        int var3 = arg0.method8775();
        byte var4 = arg0.method8562();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7622() == 0) {
                return;
            }
            class448 var6 = (class448) this.method7576(var2);
            if (var6 != null && var6.method7646() == var3) {
                this.method7579(var6);
            }
            return;
        }
        arg0.method8641();
        class448 var7 = (class448) this.method7576(var2);
        if (var7 == null) {
            if (this.method7622() > this.field4732) {
                return;
            }
            var7 = (class448) this.method7610(var2);
        }
        var7.method7649(var3, ++this.field4709 - 1);
        var7.field4742 = var4;
        this.method7491(var7);
    }

    @ObfuscatedName("rp.aa(B)V")
    public final void method7489() {
        for (int var1 = 0; var1 < this.method7622(); var1++) {
            ((class448) this.method7626(var1)).method7520();
        }
    }

    @ObfuscatedName("rp.au(B)V")
    public final void method7490() {
        for (int var1 = 0; var1 < this.method7622(); var1++) {
            ((class448) this.method7626(var1)).method7523();
        }
    }

    @ObfuscatedName("rp.an(Lrx;I)V")
    public final void method7491(class448 arg0) {
        if (arg0.method7544().equals(this.field4711.method1591())) {
            this.field4715 = arg0.field4742;
        }
    }
}
