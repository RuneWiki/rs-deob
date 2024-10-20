package deob;

@ObfuscatedName("ke")
public class class293 extends class288 {

    @ObfuscatedName("ke.m")
    public final class331 field3687;

    @ObfuscatedName("ke.o")
    public int field3686 = 1;

    @ObfuscatedName("ke.s")
    public class211 field3685 = new class211();

    public class293(class331 arg0) {
        super(400);
        this.field3687 = arg0;
    }

    @ObfuscatedName("ke.c(B)Ljx;")
    public class285 method4967() {
        return new class295();
    }

    @ObfuscatedName("ke.q(II)[Ljx;")
    public class285[] method4958(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("ke.m(Lkz;ZI)Z")
    public boolean method5065(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method4973(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3679 != 0;
        }
    }

    @ObfuscatedName("ke.l(Lgg;IB)V")
    public void method5066(class185 arg0, int arg1) {
        while (true) {
            if (arg0.field2386 < arg1) {
                boolean var3 = arg0.method3243() == 1;
                class294 var4 = new class294(arg0.method3251(), this.field3687);
                class294 var5 = new class294(arg0.method3251(), this.field3687);
                int var6 = arg0.method3245();
                int var7 = arg0.method3243();
                int var8 = arg0.method3243();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3251();
                    arg0.method3243();
                    arg0.method3323();
                }
                arg0.method3251();
                if (var4 != null && var4.method5076()) {
                    class295 var11 = (class295) this.method4974(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method4974(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4977(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4970() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method4979(var4, var5);
                    } else {
                        this.method4982(var11, var4, var5);
                        if (var11.field3679 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3685.method3770(); var14 != null; var14 = (class297) this.field3685.method3769()) {
                                if (var14.field3709.equals(var4)) {
                                    if (var6 != 0 && var14.field3705 == 0) {
                                        var14.method3780();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3705 != 0) {
                                        var14.method3780();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3685.method3775(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3679 != var6) {
                        var11.field3678 = ++this.field3686 - 1;
                        if (var11.field3679 == -1 && var6 == 0) {
                            var11.field3678 = -(var11.field3678 * 395558465) * 631984577;
                        }
                        var11.field3679 = var6;
                    }
                    var11.field3677 = var7;
                    var11.field3692 = var9;
                    var11.field3693 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4981();
            return;
        }
    }
}
