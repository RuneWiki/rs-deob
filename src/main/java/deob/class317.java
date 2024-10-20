package deob;

@ObfuscatedName("lb")
public class class317 extends class324 {

    @ObfuscatedName("lb.f")
    public final class365 field3811;

    @ObfuscatedName("lb.y")
    public int field3809 = 1;

    @ObfuscatedName("lb.p")
    public class297 field3810 = new class297();

    public class317(class365 arg0) {
        super(400);
        this.field3811 = arg0;
    }

    @ObfuscatedName("lb.v(B)Llx;")
    public class322 method5146() {
        return new class319();
    }

    @ObfuscatedName("lb.n(II)[Llx;")
    public class322[] method5149(int arg0) {
        return new class319[arg0];
    }

    @ObfuscatedName("lb.f(Lly;ZB)Z")
    public boolean method5157(class328 arg0, boolean arg1) {
        class319 var3 = (class319) this.method5249(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3853 != 0;
        }
    }

    @ObfuscatedName("lb.b(Lnd;II)V")
    public void method5158(class383 arg0, int arg1) {
        while (true) {
            if (arg0.field4158 < arg1) {
                boolean var3 = arg0.method5965() == 1;
                class328 var4 = new class328(arg0.method5974(), this.field3811);
                class328 var5 = new class328(arg0.method5974(), this.field3811);
                int var6 = arg0.method5967();
                int var7 = arg0.method5965();
                int var8 = arg0.method5965();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method5974();
                    arg0.method5965();
                    arg0.method5970();
                }
                arg0.method5974();
                if (var4 != null && var4.method5339()) {
                    class319 var11 = (class319) this.method5250(var4);
                    if (var3) {
                        class319 var12 = (class319) this.method5250(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5253(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5246() >= 400) {
                            continue;
                        }
                        var11 = (class319) this.method5255(var4, var5);
                    } else {
                        this.method5258(var11, var4, var5);
                        if (var11.field3853 != var6) {
                            boolean var13 = true;
                            for (class320 var14 = (class320) this.field3810.method4835(); var14 != null; var14 = (class320) this.field3810.method4838()) {
                                if (var14.field3827.equals(var4)) {
                                    if (var6 != 0 && var14.field3828 == 0) {
                                        var14.method5484();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3828 != 0) {
                                        var14.method5484();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3810.method4831(new class320(var4, var6));
                            }
                        }
                    }
                    if (var11.field3853 != var6) {
                        var11.field3850 = ++this.field3809 - 1;
                        if (var11.field3853 == -1 && var6 == 0) {
                            var11.field3850 = -(var11.field3850 * -2116718473) * -1023710905;
                        }
                        var11.field3853 = var6;
                    }
                    var11.field3852 = var7;
                    var11.field3825 = var9;
                    var11.field3824 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5298();
            return;
        }
    }
}
