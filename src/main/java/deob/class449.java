package deob;

@ObfuscatedName("rx")
public class class449 extends class455 {

    @ObfuscatedName("rx.ah")
    public final class513 field4777;

    @ObfuscatedName("rx.af")
    public final class447 field4779;

    @ObfuscatedName("rx.at")
    public String field4778 = null;

    @ObfuscatedName("rx.an")
    public String field4780 = null;

    @ObfuscatedName("rx.ao")
    public byte field4776;

    @ObfuscatedName("rx.ab")
    public int field4781;

    @ObfuscatedName("rx.aw")
    public int field4782 = 1;

    public class449(class513 arg0, class447 arg1) {
        super(500);
        this.field4777 = arg0;
        this.field4779 = arg1;
    }

    @ObfuscatedName("rx.az(I)Lrr;")
    public class453 method7359() {
        return new class452();
    }

    @ObfuscatedName("rx.ah(IB)[Lrr;")
    public class453[] method7360(int arg0) {
        return new class452[arg0];
    }

    @ObfuscatedName("rx.af(Ljava/lang/String;I)V")
    public final void method7378(String arg0) {
        String var2 = class409.method4809(class409.method79(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4778 = var2;
    }

    @ObfuscatedName("rx.ao(Ljava/lang/String;B)V")
    public final void method7379(String arg0) {
        String var2 = class409.method4809(class409.method79(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4780 = var2;
    }

    @ObfuscatedName("rx.ab(Lur;II)V")
    public final void method7380(class535 arg0, int arg1) {
        this.method7379(arg0.method8473());
        long var3 = arg0.method8469();
        this.method7378(class409.method3527(var3));
        this.field4776 = arg0.method8463();
        int var5;
        short var6;
        if (arg1 == 1) {
            var5 = arg0.method8462();
            var6 = 255;
        } else if (arg1 == 2) {
            var5 = arg0.method8479();
            var6 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var5 == var6) {
            return;
        }
        int var7 = var5;
        this.method7454();
        for (int var8 = 0; var8 < var7; var8++) {
            class452 var9 = (class452) this.method7462(new class558(arg0.method8473(), this.field4777));
            int var10 = arg0.method8670();
            var9.method7533(var10, ++this.field4782 - 1);
            var9.field4805 = arg0.method8463();
            arg0.method8473();
            this.method7388(var9);
        }
    }

    @ObfuscatedName("rx.aw(Lur;S)V")
    public final void method7381(class535 arg0) {
        class558 var2 = new class558(arg0.method8473(), this.field4777);
        int var3 = arg0.method8670();
        byte var4 = arg0.method8463();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method7461() == 0) {
                return;
            }
            class452 var6 = (class452) this.method7458(var2);
            if (var6 != null && var6.method7536() == var3) {
                this.method7474(var6);
            }
            return;
        }
        arg0.method8473();
        class452 var7 = (class452) this.method7458(var2);
        if (var7 == null) {
            if (this.method7461() > this.field4796) {
                return;
            }
            var7 = (class452) this.method7462(var2);
        }
        var7.method7533(var3, ++this.field4782 - 1);
        var7.field4805 = var4;
        this.method7388(var7);
    }

    @ObfuscatedName("rx.ad(I)V")
    public final void method7389() {
        for (int var1 = 0; var1 < this.method7461(); var1++) {
            ((class452) this.method7464(var1)).method7416();
        }
    }

    @ObfuscatedName("rx.al(I)V")
    public final void method7383() {
        for (int var1 = 0; var1 < this.method7461(); var1++) {
            ((class452) this.method7464(var1)).method7418();
        }
    }

    @ObfuscatedName("rx.as(Lry;I)V")
    public final void method7388(class452 arg0) {
        if (arg0.method7433().equals(this.field4779.method1168())) {
            this.field4781 = arg0.field4805;
        }
    }
}
