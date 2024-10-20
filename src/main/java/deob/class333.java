package deob;

@ObfuscatedName("lp")
public class class333 extends class340 {

    @ObfuscatedName("lp.f")
    public final class383 field3936;

    @ObfuscatedName("lp.j")
    public int field3937 = 1;

    @ObfuscatedName("lp.m")
    public class312 field3939 = new class312();

    public class333(class383 arg0) {
        super(400);
        this.field3936 = arg0;
    }

    @ObfuscatedName("lp.l(I)Llu;")
    public class338 method5438() {
        return new class335();
    }

    @ObfuscatedName("lp.q(II)[Llu;")
    public class338[] method5439(int arg0) {
        return new class335[arg0];
    }

    @ObfuscatedName("lp.f(Lpm;ZI)Z")
    public boolean method5455(class422 arg0, boolean arg1) {
        class335 var3 = (class335) this.method5540(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3976 != 0;
        }
    }

    @ObfuscatedName("lp.y(Lot;II)V")
    public void method5453(class401 arg0, int arg1) {
        while (true) {
            if (arg0.field4292 < arg1) {
                boolean var3 = arg0.method6272() == 1;
                class422 var4 = new class422(arg0.method6474(), this.field3936);
                class422 var5 = new class422(arg0.method6474(), this.field3936);
                int var6 = arg0.method6284();
                int var7 = arg0.method6272();
                int var8 = arg0.method6272();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method6474();
                    arg0.method6272();
                    arg0.method6277();
                }
                arg0.method6474();
                if (var4 != null && var4.method6817()) {
                    class335 var11 = (class335) this.method5541(var4);
                    if (var3) {
                        class335 var12 = (class335) this.method5541(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5544(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5564() >= 400) {
                            continue;
                        }
                        var11 = (class335) this.method5599(var4, var5);
                    } else {
                        this.method5549(var11, var4, var5);
                        if (var11.field3976 != var6) {
                            boolean var13 = true;
                            for (class336 var14 = (class336) this.field3939.method5143(); var14 != null; var14 = (class336) this.field3939.method5146()) {
                                if (var14.field3952.equals(var4)) {
                                    if (var6 != 0 && var14.field3951 == 0) {
                                        var14.method5769();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3951 != 0) {
                                        var14.method5769();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3939.method5144(new class336(var4, var6));
                            }
                        }
                    }
                    if (var11.field3976 != var6) {
                        var11.field3975 = ++this.field3937 - 1;
                        if (var11.field3976 == -1 && var6 == 0) {
                            var11.field3975 = -(var11.field3975 * -780817315) * 245467125;
                        }
                        var11.field3976 = var6;
                    }
                    var11.field3974 = var7;
                    var11.field3950 = var9;
                    var11.field3949 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5552();
            return;
        }
    }
}
