package deob;

@ObfuscatedName("ng")
public class class366 extends class373 {

    @ObfuscatedName("ng.q")
    public final class423 field4288;

    @ObfuscatedName("ng.f")
    public int field4287 = 1;

    @ObfuscatedName("ng.j")
    public class337 field4290 = new class337();

    public class366(class423 arg0) {
        super(400);
        this.field4288 = arg0;
    }

    @ObfuscatedName("ng.c(S)Lne;")
    public class371 method5998() {
        return new class368();
    }

    @ObfuscatedName("ng.v(II)[Lne;")
    public class371[] method5992(int arg0) {
        return new class368[arg0];
    }

    @ObfuscatedName("ng.q(Lqa;ZB)Z")
    public boolean method6000(class464 arg0, boolean arg1) {
        class368 var3 = (class368) this.method6099(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4325 != 0;
        }
    }

    @ObfuscatedName("ng.w(Lqt;IB)V")
    public void method5999(class443 arg0, int arg1) {
        while (true) {
            if (arg0.field4700 < arg1) {
                boolean var3 = arg0.method7047() == 1;
                class464 var4 = new class464(arg0.method7057(), this.field4288);
                class464 var5 = new class464(arg0.method7057(), this.field4288);
                int var6 = arg0.method7049();
                int var7 = arg0.method7047();
                int var8 = arg0.method7047();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method7057();
                    arg0.method7047();
                    arg0.method7052();
                }
                arg0.method7057();
                if (var4 != null && var4.method7619()) {
                    class368 var11 = (class368) this.method6100(var4);
                    if (var3) {
                        class368 var12 = (class368) this.method6100(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6103(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6096() >= 400) {
                            continue;
                        }
                        var11 = (class368) this.method6105(var4, var5);
                    } else {
                        this.method6108(var11, var4, var5);
                        if (var11.field4325 != var6) {
                            boolean var13 = true;
                            for (class369 var14 = (class369) this.field4290.method5638(); var14 != null; var14 = (class369) this.field4290.method5639()) {
                                if (var14.field4302.equals(var4)) {
                                    if (var6 != 0 && var14.field4303 == 0) {
                                        var14.method6490();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4303 != 0) {
                                        var14.method6490();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4290.method5637(new class369(var4, var6));
                            }
                        }
                    }
                    if (var11.field4325 != var6) {
                        var11.field4326 = ++this.field4287 - 1;
                        if (var11.field4325 == -1 && var6 == 0) {
                            var11.field4326 = -(var11.field4326 * -1691529257) * 1716524007;
                        }
                        var11.field4325 = var6;
                    }
                    var11.field4324 = var7;
                    var11.field4300 = var9;
                    var11.field4299 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6157();
            return;
        }
    }
}
