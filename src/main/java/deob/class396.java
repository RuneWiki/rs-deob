package deob;

@ObfuscatedName("oe")
public class class396 extends class403 {

    @ObfuscatedName("oe.v")
    public final class454 field4538;

    @ObfuscatedName("oe.s")
    public int field4542 = 1;

    @ObfuscatedName("oe.z")
    public class359 field4540 = new class359();

    public class396(class454 arg0) {
        super(400);
        this.field4538 = arg0;
    }

    @ObfuscatedName("oe.f(I)Low;")
    public class401 method6946() {
        return new class398();
    }

    @ObfuscatedName("oe.w(II)[Low;")
    public class401[] method6950(int arg0) {
        return new class398[arg0];
    }

    @ObfuscatedName("oe.v(Lsi;ZI)Z")
    public boolean method6955(class497 arg0, boolean arg1) {
        class398 var3 = (class398) this.method7054(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field4577 != 0;
        }
    }

    @ObfuscatedName("oe.n(Lrd;II)V")
    public void method6956(class474 arg0, int arg1) {
        while (true) {
            if (arg0.field4939 < arg1) {
                boolean var3 = arg0.method7964() == 1;
                class497 var4 = new class497(arg0.method7983(), this.field4538);
                class497 var5 = new class497(arg0.method7983(), this.field4538);
                int var6 = arg0.method8032();
                int var7 = arg0.method7964();
                int var8 = arg0.method7964();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method7983();
                    arg0.method7964();
                    arg0.method7979();
                }
                arg0.method7983();
                if (var4 != null && var4.method8558()) {
                    class398 var11 = (class398) this.method7055(var4);
                    if (var3) {
                        class398 var12 = (class398) this.method7055(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method7097(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method7052() >= 400) {
                            continue;
                        }
                        var11 = (class398) this.method7060(var4, var5);
                    } else {
                        this.method7063(var11, var4, var5);
                        if (var11.field4577 != var6) {
                            boolean var13 = true;
                            for (class399 var14 = (class399) this.field4540.method6358(); var14 != null; var14 = (class399) this.field4540.method6354()) {
                                if (var14.field4556.equals(var4)) {
                                    if (var6 != 0 && var14.field4555 == 0) {
                                        var14.method7428();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field4555 != 0) {
                                        var14.method7428();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field4540.method6352(new class399(var4, var6));
                            }
                        }
                    }
                    if (var11.field4577 != var6) {
                        var11.field4575 = ++this.field4542 - 1;
                        if (var11.field4577 == -1 && var6 == 0) {
                            var11.field4575 = -(var11.field4575 * -801801849) * 143588407;
                        }
                        var11.field4577 = var6;
                    }
                    var11.field4576 = var7;
                    var11.field4554 = var9;
                    var11.field4553 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method7104();
            return;
        }
    }
}
