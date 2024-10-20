package deob;

@ObfuscatedName("kw")
public class class292 extends class287 {

    @ObfuscatedName("kw.s")
    public final class348 field3643;

    @ObfuscatedName("kw.m")
    public int field3642 = 1;

    @ObfuscatedName("kw.n")
    public class273 field3644 = new class273();

    public class292(class348 arg0) {
        super(400);
        this.field3643 = arg0;
    }

    @ObfuscatedName("kw.z(B)Ljc;")
    public class284 method4798() {
        return new class294();
    }

    @ObfuscatedName("kw.k(IB)[Ljc;")
    public class284[] method4797(int arg0) {
        return new class294[arg0];
    }

    @ObfuscatedName("kw.s(Lku;ZI)Z")
    public boolean method4880(class293 arg0, boolean arg1) {
        class294 var3 = (class294) this.method4804(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3632 != 0;
        }
    }

    @ObfuscatedName("kw.o(Lkf;II)V")
    public void method4881(class310 arg0, int arg1) {
        while (true) {
            if (arg0.field3734 < arg1) {
                boolean var3 = arg0.method5193() == 1;
                class293 var4 = new class293(arg0.method5202(), this.field3643);
                class293 var5 = new class293(arg0.method5202(), this.field3643);
                int var6 = arg0.method5195();
                int var7 = arg0.method5193();
                int var8 = arg0.method5193();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5202();
                    arg0.method5193();
                    arg0.method5270();
                }
                arg0.method5202();
                if (var4 != null && var4.method4886()) {
                    class294 var11 = (class294) this.method4805(var4);
                    if (var3) {
                        class294 var12 = (class294) this.method4805(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4835(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4801() >= 400) {
                            continue;
                        }
                        var11 = (class294) this.method4810(var4, var5);
                    } else {
                        this.method4813(var11, var4, var5);
                        if (var11.field3632 != var6) {
                            boolean var13 = true;
                            for (class296 var14 = (class296) this.field3644.method4650(); var14 != null; var14 = (class296) this.field3644.method4657()) {
                                if (var14.field3664.equals(var4)) {
                                    if (var6 != 0 && var14.field3666 == 0) {
                                        var14.method3397();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3666 != 0) {
                                        var14.method3397();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3644.method4649(new class296(var4, var6));
                            }
                        }
                    }
                    if (var11.field3632 != var6) {
                        var11.field3633 = ++this.field3642 - 1;
                        if (var11.field3632 == -1 && var6 == 0) {
                            var11.field3633 = -(var11.field3633 * 1706616033) * -224698591;
                        }
                        var11.field3632 = var6;
                    }
                    var11.field3634 = var7;
                    var11.field3652 = var9;
                    var11.field3653 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4812();
            return;
        }
    }
}
