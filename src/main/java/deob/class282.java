package deob;

@ObfuscatedName("jr")
public class class282 extends class277 {

    @ObfuscatedName("jr.y")
    public final class338 field3603;

    @ObfuscatedName("jr.d")
    public int field3604 = 1;

    @ObfuscatedName("jr.c")
    public class263 field3600 = new class263();

    public class282(class338 arg0) {
        super(400);
        this.field3603 = arg0;
    }

    @ObfuscatedName("jr.f(B)Ljy;")
    public class274 method4709() {
        return new class285();
    }

    @ObfuscatedName("jr.i(IB)[Ljy;")
    public class274[] method4710(int arg0) {
        return new class285[arg0];
    }

    @ObfuscatedName("jr.y(Ljc;ZI)Z")
    public boolean method4815(class283 arg0, boolean arg1) {
        class285 var3 = (class285) this.method4721(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3595 != 0;
        }
    }

    @ObfuscatedName("jr.x(Lkq;IB)V")
    public void method4816(class300 arg0, int arg1) {
        while (true) {
            if (arg0.field3703 < arg1) {
                boolean var3 = arg0.method5110() == 1;
                class283 var4 = new class283(arg0.method5119(), this.field3603);
                class283 var5 = new class283(arg0.method5119(), this.field3603);
                int var6 = arg0.method5112();
                int var7 = arg0.method5110();
                int var8 = arg0.method5110();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5119();
                    arg0.method5110();
                    arg0.method5192();
                }
                arg0.method5119();
                if (var4 != null && var4.method4823()) {
                    class285 var11 = (class285) this.method4722(var4);
                    if (var3) {
                        class285 var12 = (class285) this.method4722(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4725(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4765() >= 400) {
                            continue;
                        }
                        var11 = (class285) this.method4767(var4, var5);
                    } else {
                        this.method4730(var11, var4, var5);
                        if (var11.field3595 != var6) {
                            boolean var13 = true;
                            for (class286 var14 = (class286) this.field3600.method4560(); var14 != null; var14 = (class286) this.field3600.method4561()) {
                                if (var14.field3625.equals(var4)) {
                                    if (var6 != 0 && var14.field3622 == 0) {
                                        var14.method3288();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3622 != 0) {
                                        var14.method3288();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3600.method4559(new class286(var4, var6));
                            }
                        }
                    }
                    if (var11.field3595 != var6) {
                        var11.field3593 = ++this.field3604 - 1;
                        if (var11.field3595 == -1 && var6 == 0) {
                            var11.field3593 = -(var11.field3593 * 604472963) * 509966379;
                        }
                        var11.field3595 = var6;
                    }
                    var11.field3592 = var7;
                    var11.field3618 = var9;
                    var11.field3619 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4729();
            return;
        }
    }
}
