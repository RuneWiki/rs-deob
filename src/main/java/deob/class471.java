package deob;

@ObfuscatedName("st")
public class class471 extends class477 {

    @ObfuscatedName("st.aw")
    public final class535 field4991;

    @ObfuscatedName("st.ak")
    public final class469 field4992;

    @ObfuscatedName("st.aj")
    public String field4993 = null;

    @ObfuscatedName("st.ai")
    public String field4995 = null;

    @ObfuscatedName("st.ay")
    public byte field4994;

    @ObfuscatedName("st.as")
    public int field4996;

    @ObfuscatedName("st.ae")
    public int field4997 = 1;

    public class471(class535 arg0, class469 arg1) {
        super(500);
        this.field4991 = arg0;
        this.field4992 = arg1;
    }

    @ObfuscatedName("st.ap(I)Lse;")
    public class475 method8257() {
        return new class474();
    }

    @ObfuscatedName("st.aw(II)[Lse;")
    public class475[] method8258(int arg0) {
        return new class474[arg0];
    }

    @ObfuscatedName("st.ak(Ljava/lang/String;B)V")
    public final void method8282(String arg0) {
        String var2 = class422.method2357(class422.method5747(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4993 = var2;
    }

    @ObfuscatedName("st.at(Ljava/lang/String;B)V")
    public final void method8278(String arg0) {
        String var2 = class422.method2357(class422.method5747(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4995 = var2;
    }

    @ObfuscatedName("st.au(Lvl;II)V")
    public final void method8280(class558 arg0, int arg1) {
        this.method8278(arg0.method9269());
        long var3 = arg0.method9265();
        this.method8282(class422.method3717(var3));
        this.field4994 = arg0.method9259();
        int var5;
        short var6;
        if (arg1 == 1) {
            var5 = arg0.method9258();
            var6 = 255;
        } else if (arg1 == 2) {
            var5 = arg0.method9275();
            var6 = -1;
        } else {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + arg1);
        }
        if (var5 == var6) {
            return;
        }
        int var7 = var5;
        this.method8379();
        for (int var8 = 0; var8 < var7; var8++) {
            class474 var9 = (class474) this.method8364(new class581(arg0.method9269(), this.field4991));
            int var10 = arg0.method9260();
            var9.method8430(var10, ++this.field4997 - 1);
            var9.field5024 = arg0.method9259();
            arg0.method9269();
            this.method8279(var9);
        }
    }

    @ObfuscatedName("st.an(Lvl;I)V")
    public final void method8281(class558 arg0) {
        class581 var2 = new class581(arg0.method9269(), this.field4991);
        int var3 = arg0.method9260();
        byte var4 = arg0.method9259();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method8356() == 0) {
                return;
            }
            class474 var6 = (class474) this.method8360(var2);
            if (var6 != null && var6.method8432() == var3) {
                this.method8363(var6);
            }
            return;
        }
        arg0.method9269();
        class474 var7 = (class474) this.method8360(var2);
        if (var7 == null) {
            if (this.method8356() > this.field5018) {
                return;
            }
            var7 = (class474) this.method8364(var2);
        }
        var7.method8430(var3, ++this.field4997 - 1);
        var7.field5024 = var4;
        this.method8279(var7);
    }

    @ObfuscatedName("st.ao(B)V")
    public final void method8277() {
        for (int var1 = 0; var1 < this.method8356(); var1++) {
            ((class474) this.method8366(var1)).method8313();
        }
    }

    @ObfuscatedName("st.af(I)V")
    public final void method8290() {
        for (int var1 = 0; var1 < this.method8356(); var1++) {
            ((class474) this.method8366(var1)).method8315();
        }
    }

    @ObfuscatedName("st.ar(Lsp;I)V")
    public final void method8279(class474 arg0) {
        if (arg0.method8345().equals(this.field4992.method1266())) {
            this.field4996 = arg0.field5024;
        }
    }
}
