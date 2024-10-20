package deob;

@ObfuscatedName("na")
public class class368 extends class375 {

    @ObfuscatedName("na.f")
    public final class425 field4328;

    @ObfuscatedName("na.n")
    public int field4330 = 1;

    @ObfuscatedName("na.k")
    public class339 field4331 = new class339();

    public class368(class425 arg0) {
        super(400);
        this.field4328 = arg0;
    }

    @ObfuscatedName("na.c(B)Lnc;")
    public class373 method6155() {
        return new class370();
    }

    @ObfuscatedName("na.p(IB)[Lnc;")
    public class373[] method6159(int arg0) {
        return new class370[arg0];
    }

    @ObfuscatedName("na.f(Lqo;ZI)Z")
    public boolean method6165(class466 arg0, boolean arg1) {
        class370 var3 = (class370) this.method6264(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4366 != 0;
        }
    }

    @ObfuscatedName("na.q(Lqq;II)V")
    public void method6164(class445 arg0, int arg1) {
        while (true) {
            if (arg0.field4735 < arg1) {
                boolean var3 = arg0.method7196() == 1;
                class466 var4 = new class466(arg0.method7206(), this.field4328);
                class466 var5 = new class466(arg0.method7206(), this.field4328);
                int var6 = arg0.method7198();
                int var7 = arg0.method7196();
                int var8 = arg0.method7196();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method7206();
                    arg0.method7196();
                    arg0.method7201();
                }
                arg0.method7206();
                if (var4 != null && var4.method7784()) {
                    class370 var11 = (class370) this.method6250(var4);
                    if (var3) {
                        class370 var12 = (class370) this.method6250(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6253(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6246() >= 400) {
                            continue;
                        }
                        var11 = (class370) this.method6304(var4, var5);
                    } else {
                        this.method6252(var11, var4, var5);
                        if (var11.field4366 != var6) {
                            boolean var13 = true;
                            for (class371 var14 = (class371) this.field4331.method5774(); var14 != null; var14 = (class371) this.field4331.method5781()) {
                                if (var14.field4346.equals(var4)) {
                                    if (var6 != 0 && var14.field4348 == 0) {
                                        var14.method6649();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4348 != 0) {
                                        var14.method6649();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4331.method5772(new class371(var4, var6));
                            }
                        }
                    }
                    if (var11.field4366 != var6) {
                        var11.field4367 = ++this.field4330 - 1;
                        if (var11.field4366 == -1 && var6 == 0) {
                            var11.field4367 = -(var11.field4367 * -287223117) * 597666939;
                        }
                        var11.field4366 = var6;
                    }
                    var11.field4368 = var7;
                    var11.field4340 = var9;
                    var11.field4341 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6268();
            return;
        }
    }
}
