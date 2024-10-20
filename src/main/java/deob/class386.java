package deob;

@ObfuscatedName("ny")
public class class386 extends class393 {

    @ObfuscatedName("ny.c")
    public final class444 field4460;

    @ObfuscatedName("ny.x")
    public int field4458 = 1;

    @ObfuscatedName("ny.h")
    public class352 field4462 = new class352();

    public class386(class444 arg0) {
        super(400);
        this.field4460 = arg0;
    }

    @ObfuscatedName("ny.a(B)Loj;")
    public class391 method6649() {
        return new class388();
    }

    @ObfuscatedName("ny.f(II)[Loj;")
    public class391[] method6650(int arg0) {
        return new class388[arg0];
    }

    @ObfuscatedName("ny.c(Lrg;ZI)Z")
    public boolean method6660(class486 arg0, boolean arg1) {
        class388 var3 = (class388) this.method6760(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4495 != 0;
        }
    }

    @ObfuscatedName("ny.n(Lqr;II)V")
    public void method6661(class464 arg0, int arg1) {
        while (true) {
            if (arg0.field4864 < arg1) {
                boolean var3 = arg0.method7735() == 1;
                class486 var4 = new class486(arg0.method7725(), this.field4460);
                class486 var5 = new class486(arg0.method7725(), this.field4460);
                int var6 = arg0.method7716();
                int var7 = arg0.method7735();
                int var8 = arg0.method7735();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method7725();
                    arg0.method7735();
                    arg0.method7720();
                }
                arg0.method7725();
                if (var4 != null && var4.method8296()) {
                    class388 var11 = (class388) this.method6761(var4);
                    if (var3) {
                        class388 var12 = (class388) this.method6761(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6764(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6803() >= 400) {
                            continue;
                        }
                        var11 = (class388) this.method6766(var4, var5);
                    } else {
                        this.method6811(var11, var4, var5);
                        if (var11.field4495 != var6) {
                            boolean var13 = true;
                            for (class389 var14 = (class389) this.field4462.method6156(); var14 != null; var14 = (class389) this.field4462.method6153()) {
                                if (var14.field4476.equals(var4)) {
                                    if (var6 != 0 && var14.field4477 == 0) {
                                        var14.method7165();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4477 != 0) {
                                        var14.method7165();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4462.method6154(new class389(var4, var6));
                            }
                        }
                    }
                    if (var11.field4495 != var6) {
                        var11.field4494 = ++this.field4458 - 1;
                        if (var11.field4495 == -1 && var6 == 0) {
                            var11.field4494 = -(var11.field4494 * 765902219) * 1732968995;
                        }
                        var11.field4495 = var6;
                    }
                    var11.field4496 = var7;
                    var11.field4473 = var9;
                    var11.field4474 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6768();
            return;
        }
    }
}
