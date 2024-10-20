package deob;

@ObfuscatedName("nx")
public class class368 extends class374 {

    @ObfuscatedName("nx.q")
    public final class424 field4304;

    @ObfuscatedName("nx.l")
    public final class366 field4305;

    @ObfuscatedName("nx.k")
    public String field4306 = null;

    @ObfuscatedName("nx.a")
    public String field4307 = null;

    @ObfuscatedName("nx.m")
    public byte field4311;

    @ObfuscatedName("nx.p")
    public int field4309;

    @ObfuscatedName("nx.s")
    public int field4310 = 1;

    public class368(class424 arg0, class366 arg1) {
        super(100);
        this.field4304 = arg0;
        this.field4305 = arg1;
    }

    @ObfuscatedName("nx.o(I)Lnb;")
    public class372 method5931() {
        return new class371();
    }

    @ObfuscatedName("nx.q(II)[Lnb;")
    public class372[] method5932(int arg0) {
        return new class371[arg0];
    }

    @ObfuscatedName("nx.l(Ljava/lang/String;I)V")
    public final void method5950(String arg0) {
        String var2 = class346.method4583(class346.method2487(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4306 = var2;
    }

    @ObfuscatedName("nx.s(Ljava/lang/String;I)V")
    public final void method5951(String arg0) {
        String var2 = class346.method4583(class346.method2487(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field4307 = var2;
    }

    @ObfuscatedName("nx.r(Lpx;B)V")
    public final void method5952(class440 arg0) {
        this.method5951(arg0.method7044());
        long var2 = arg0.method7014();
        this.method5950(class346.method4972(var2));
        this.field4311 = arg0.method7034();
        int var4 = arg0.method7071();
        if (var4 == 255) {
            return;
        }
        this.method6027();
        for (int var5 = 0; var5 < var4; var5++) {
            class371 var6 = (class371) this.method6035(new class461(arg0.method7044(), this.field4304));
            int var7 = arg0.method7082();
            var6.method6088(var7, ++this.field4310 - 1);
            var6.field4334 = arg0.method7034();
            arg0.method7044();
            this.method5956(var6);
        }
    }

    @ObfuscatedName("nx.v(Lpx;B)V")
    public final void method5955(class440 arg0) {
        class461 var2 = new class461(arg0.method7044(), this.field4304);
        int var3 = arg0.method7082();
        byte var4 = arg0.method7034();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method6028() == 0) {
                return;
            }
            class371 var6 = (class371) this.method6055(var2);
            if (var6 != null && var6.method6089() == var3) {
                this.method6039(var6);
            }
            return;
        }
        arg0.method7044();
        class371 var7 = (class371) this.method6055(var2);
        if (var7 == null) {
            if (this.method6028() > this.field4331) {
                return;
            }
            var7 = (class371) this.method6035(var2);
        }
        var7.method6088(var3, ++this.field4310 - 1);
        var7.field4334 = var4;
        this.method5956(var7);
    }

    @ObfuscatedName("nx.y(I)V")
    public final void method5954() {
        for (int var1 = 0; var1 < this.method6028(); var1++) {
            ((class371) this.method6037(var1)).method5989();
        }
    }

    @ObfuscatedName("nx.c(I)V")
    public final void method5968() {
        for (int var1 = 0; var1 < this.method6028(); var1++) {
            ((class371) this.method6037(var1)).method5986();
        }
    }

    @ObfuscatedName("nx.w(Lnm;I)V")
    public final void method5956(class371 arg0) {
        if (arg0.method6011().equals(this.field4305.method1079())) {
            this.field4309 = arg0.field4334;
        }
    }
}
