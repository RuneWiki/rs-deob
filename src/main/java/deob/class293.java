package deob;

@ObfuscatedName("km")
public class class293 extends class288 {

    @ObfuscatedName("km.d")
    public final class349 field3653;

    @ObfuscatedName("km.l")
    public int field3656 = 1;

    @ObfuscatedName("km.s")
    public class274 field3657 = new class274();

    public class293(class349 arg0) {
        super(400);
        this.field3653 = arg0;
    }

    @ObfuscatedName("km.n(I)Ljn;")
    public class285 method4873() {
        return new class295();
    }

    @ObfuscatedName("km.v(II)[Ljn;")
    public class285[] method4874(int arg0) {
        return new class295[arg0];
    }

    @ObfuscatedName("km.d(Lkk;ZI)Z")
    public boolean method4959(class294 arg0, boolean arg1) {
        class295 var3 = (class295) this.method4885(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3645 != 0;
        }
    }

    @ObfuscatedName("km.bk(Lkx;II)V")
    public void method4956(class311 arg0, int arg1) {
        while (true) {
            if (arg0.field3747 < arg1) {
                boolean var3 = arg0.method5310() == 1;
                class294 var4 = new class294(arg0.method5465(), this.field3653);
                class294 var5 = new class294(arg0.method5465(), this.field3653);
                int var6 = arg0.method5247();
                int var7 = arg0.method5310();
                int var8 = arg0.method5310();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5465();
                    arg0.method5310();
                    arg0.method5455();
                }
                arg0.method5465();
                if (var4 != null && var4.method4966()) {
                    class295 var11 = (class295) this.method4892(var4);
                    if (var3) {
                        class295 var12 = (class295) this.method4892(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method4888(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method4882() >= 400) {
                            continue;
                        }
                        var11 = (class295) this.method4941(var4, var5);
                    } else {
                        this.method4893(var11, var4, var5);
                        if (var11.field3645 != var6) {
                            boolean var13 = true;
                            for (class297 var14 = (class297) this.field3657.method4733(); var14 != null; var14 = (class297) this.field3657.method4731()) {
                                if (var14.field3675.equals(var4)) {
                                    if (var6 != 0 && var14.field3676 == 0) {
                                        var14.method3484();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3676 != 0) {
                                        var14.method3484();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3657.method4732(new class297(var4, var6));
                            }
                        }
                    }
                    if (var11.field3645 != var6) {
                        var11.field3647 = ++this.field3656 - 1;
                        if (var11.field3645 == -1 && var6 == 0) {
                            var11.field3647 = -(var11.field3647 * 1612943523) * 975938315;
                        }
                        var11.field3645 = var6;
                    }
                    var11.field3646 = var7;
                    var11.field3664 = var9;
                    var11.field3662 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method4922();
            return;
        }
    }
}
