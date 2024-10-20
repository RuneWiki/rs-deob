package deob;

@ObfuscatedName("jd")
public class class283 extends class278 {

    @ObfuscatedName("jd.o")
    public final class339 field3608;

    @ObfuscatedName("jd.m")
    public int field3607 = 1;

    @ObfuscatedName("jd.p")
    public class264 field3610 = new class264();

    public class283(class339 arg0) {
        super(400);
        this.field3608 = arg0;
    }

    @ObfuscatedName("jd.c(S)Ljk;")
    public class275 method4721() {
        return new class285();
    }

    @ObfuscatedName("jd.t(IB)[Ljk;")
    public class275[] method4722(int arg0) {
        return new class285[arg0];
    }

    @ObfuscatedName("jd.o(Ljz;ZI)Z")
    public boolean method4820(class284 arg0, boolean arg1) {
        class285 var3 = (class285) this.method4771(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3600 != 0;
        }
    }

    @ObfuscatedName("jd.j(Lkp;IB)V")
    public void method4823(class301 arg0, int arg1) {
        while (true) {
            if (arg0.field3707 < arg1) {
                boolean var3 = arg0.method5129() == 1;
                class284 var4 = new class284(arg0.method5138(), this.field3608);
                class284 var5 = new class284(arg0.method5138(), this.field3608);
                int var6 = arg0.method5124();
                int var7 = arg0.method5129();
                int var8 = arg0.method5129();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5138();
                    arg0.method5129();
                    arg0.method5134();
                }
                arg0.method5138();
                if (var4 != null && var4.method4830()) {
                    class285 var11 = (class285) this.method4737(var4);
                    if (var3) {
                        class285 var12 = (class285) this.method4737(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4740(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4787() >= 400) {
                            continue;
                        }
                        var11 = (class285) this.method4742(var4, var5);
                    } else {
                        this.method4738(var11, var4, var5);
                        if (var11.field3600 != var6) {
                            boolean var13 = true;
                            for (class287 var14 = (class287) this.field3610.method4579(); var14 != null; var14 = (class287) this.field3610.method4581()) {
                                if (var14.field3634.equals(var4)) {
                                    if (var6 != 0 && var14.field3635 == 0) {
                                        var14.method3345();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3635 != 0) {
                                        var14.method3345();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3610.method4587(new class287(var4, var6));
                            }
                        }
                    }
                    if (var11.field3600 != var6) {
                        var11.field3601 = ++this.field3607 - 1;
                        if (var11.field3600 == -1 && var6 == 0) {
                            var11.field3601 = -(var11.field3601 * 1598123503) * 179134735;
                        }
                        var11.field3600 = var6;
                    }
                    var11.field3602 = var7;
                    var11.field3619 = var9;
                    var11.field3620 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4744();
            return;
        }
    }
}
