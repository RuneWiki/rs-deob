package deob;

@ObfuscatedName("lo")
public class class318 extends class325 {

    @ObfuscatedName("lo.v")
    public final class366 field3812;

    @ObfuscatedName("lo.y")
    public int field3813 = 1;

    @ObfuscatedName("lo.j")
    public class298 field3814 = new class298();

    public class318(class366 arg0) {
        super(400);
        this.field3812 = arg0;
    }

    @ObfuscatedName("lo.f(I)Llf;")
    public class323 method5102() {
        return new class320();
    }

    @ObfuscatedName("lo.e(II)[Llf;")
    public class323[] method5108(int arg0) {
        return new class320[arg0];
    }

    @ObfuscatedName("lo.v(Llc;ZB)Z")
    public boolean method5111(class329 arg0, boolean arg1) {
        class320 var3 = (class320) this.method5247(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3848 != 0;
        }
    }

    @ObfuscatedName("lo.d(Lnt;II)V")
    public void method5112(class384 arg0, int arg1) {
        while (true) {
            if (arg0.field4161 < arg1) {
                boolean var3 = arg0.method5902() == 1;
                class329 var4 = new class329(arg0.method5906(), this.field3812);
                class329 var5 = new class329(arg0.method5906(), this.field3812);
                int var6 = arg0.method5899();
                int var7 = arg0.method5902();
                int var8 = arg0.method5902();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5906();
                    arg0.method5902();
                    arg0.method5965();
                }
                arg0.method5906();
                if (var4 != null && var4.method5265()) {
                    class320 var11 = (class320) this.method5202(var4);
                    if (var3) {
                        class320 var12 = (class320) this.method5202(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5205(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5199() >= 400) {
                            continue;
                        }
                        var11 = (class320) this.method5239(var4, var5);
                    } else {
                        this.method5209(var11, var4, var5);
                        if (var11.field3848 != var6) {
                            boolean var13 = true;
                            for (class321 var14 = (class321) this.field3814.method4829(); var14 != null; var14 = (class321) this.field3814.method4831()) {
                                if (var14.field3829.equals(var4)) {
                                    if (var6 != 0 && var14.field3828 == 0) {
                                        var14.method5400();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3828 != 0) {
                                        var14.method5400();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3814.method4830(new class321(var4, var6));
                            }
                        }
                    }
                    if (var11.field3848 != var6) {
                        var11.field3847 = ++this.field3813 - 1;
                        if (var11.field3848 == -1 && var6 == 0) {
                            var11.field3847 = -(var11.field3847 * 1083271825) * -286288271;
                        }
                        var11.field3848 = var6;
                    }
                    var11.field3849 = var7;
                    var11.field3825 = var9;
                    var11.field3826 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5229();
            return;
        }
    }
}
