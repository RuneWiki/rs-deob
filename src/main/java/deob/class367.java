package deob;

@ObfuscatedName("na")
public class class367 extends class374 {

    @ObfuscatedName("na.l")
    public final class424 field4297;

    @ObfuscatedName("na.k")
    public int field4300 = 1;

    @ObfuscatedName("na.a")
    public class338 field4299 = new class338();

    public class367(class424 arg0) {
        super(400);
        this.field4297 = arg0;
    }

    @ObfuscatedName("na.o(I)Lnb;")
    public class372 method5931() {
        return new class369();
    }

    @ObfuscatedName("na.q(II)[Lnb;")
    public class372[] method5932(int arg0) {
        return new class369[arg0];
    }

    @ObfuscatedName("na.l(Lqv;ZB)Z")
    public boolean method5940(class461 arg0, boolean arg1) {
        class369 var3 = (class369) this.method6030(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4335 != 0;
        }
    }

    @ObfuscatedName("na.s(Lpx;IB)V")
    public void method5943(class440 arg0, int arg1) {
        while (true) {
            if (arg0.field4678 < arg1) {
                boolean var3 = arg0.method7071() == 1;
                class461 var4 = new class461(arg0.method7044(), this.field4297);
                class461 var5 = new class461(arg0.method7044(), this.field4297);
                int var6 = arg0.method7082();
                int var7 = arg0.method7071();
                int var8 = arg0.method7071();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method7044();
                    arg0.method7071();
                    arg0.method6898();
                }
                arg0.method7044();
                if (var4 != null && var4.method7490()) {
                    class369 var11 = (class369) this.method6055(var4);
                    if (var3) {
                        class369 var12 = (class369) this.method6055(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method6039(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method6028() >= 400) {
                            continue;
                        }
                        var11 = (class369) this.method6073(var4, var5);
                    } else {
                        this.method6036(var11, var4, var5);
                        if (var11.field4335 != var6) {
                            boolean var13 = true;
                            for (class370 var14 = (class370) this.field4299.method5544(); var14 != null; var14 = (class370) this.field4299.method5551()) {
                                if (var14.field4316.equals(var4)) {
                                    if (var6 != 0 && var14.field4317 == 0) {
                                        var14.method6391();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4317 != 0) {
                                        var14.method6391();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4299.method5545(new class370(var4, var6));
                            }
                        }
                    }
                    if (var11.field4335 != var6) {
                        var11.field4336 = ++this.field4300 - 1;
                        if (var11.field4335 == -1 && var6 == 0) {
                            var11.field4336 = -(var11.field4336 * -1393296031) * 960063137;
                        }
                        var11.field4335 = var6;
                    }
                    var11.field4334 = var7;
                    var11.field4312 = var9;
                    var11.field4313 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method6040();
            return;
        }
    }
}
