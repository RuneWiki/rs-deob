package deob;

@ObfuscatedName("no")
public class class367 extends class374 {

    @ObfuscatedName("no.w")
    public final class424 field4280;

    @ObfuscatedName("no.v")
    public int field4283 = 1;

    @ObfuscatedName("no.c")
    public class338 field4284 = new class338();

    public class367(class424 arg0) {
        super(400);
        this.field4280 = arg0;
    }

    @ObfuscatedName("no.s(I)Lnb;")
    public class372 method5922() {
        return new class369();
    }

    @ObfuscatedName("no.h(II)[Lnb;")
    public class372[] method5924(int arg0) {
        return new class369[arg0];
    }

    @ObfuscatedName("no.w(Lqy;ZB)Z")
    public boolean method5932(class465 arg0, boolean arg1) {
        class369 var3 = (class369) this.method6024(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4328 != 0;
        }
    }

    @ObfuscatedName("no.o(Lqr;II)V")
    public void method5933(class444 arg0, int arg1) {
        while (true) {
            if (arg0.field4708 < arg1) {
                boolean var3 = arg0.method6929() == 1;
                class465 var4 = new class465(arg0.method6975(), this.field4280);
                class465 var5 = new class465(arg0.method6975(), this.field4280);
                int var6 = arg0.method7120();
                int var7 = arg0.method6929();
                int var8 = arg0.method6929();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method6975();
                    arg0.method6929();
                    arg0.method6934();
                }
                arg0.method6975();
                if (var4 != null && var4.method7489()) {
                    class369 var11 = (class369) this.method6025(var4);
                    if (var3) {
                        class369 var12 = (class369) this.method6025(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6086(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6067() >= 400) {
                            continue;
                        }
                        var11 = (class369) this.method6030(var4, var5);
                    } else {
                        this.method6033(var11, var4, var5);
                        if (var11.field4328 != var6) {
                            boolean var13 = true;
                            for (class370 var14 = (class370) this.field4284.method5549(); var14 != null; var14 = (class370) this.field4284.method5550()) {
                                if (var14.field4298.equals(var4)) {
                                    if (var6 != 0 && var14.field4300 == 0) {
                                        var14.method6404();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4300 != 0) {
                                        var14.method6404();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4284.method5551(new class370(var4, var6));
                            }
                        }
                    }
                    if (var11.field4328 != var6) {
                        var11.field4325 = ++this.field4283 - 1;
                        if (var11.field4328 == -1 && var6 == 0) {
                            var11.field4325 = -(var11.field4325 * 1745645509) * 547305229;
                        }
                        var11.field4328 = var6;
                    }
                    var11.field4326 = var7;
                    var11.field4295 = var9;
                    var11.field4294 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6032();
            return;
        }
    }
}
