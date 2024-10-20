package deob;

@ObfuscatedName("lg")
public class class332 extends class339 {

    @ObfuscatedName("lg.m")
    public final class382 field3925;

    @ObfuscatedName("lg.k")
    public int field3924 = 1;

    @ObfuscatedName("lg.o")
    public class312 field3921 = new class312();

    public class332(class382 arg0) {
        super(400);
        this.field3925 = arg0;
    }

    @ObfuscatedName("lg.n(B)Lle;")
    public class337 method5374() {
        return new class334();
    }

    @ObfuscatedName("lg.c(II)[Lle;")
    public class337[] method5379(int arg0) {
        return new class334[arg0];
    }

    @ObfuscatedName("lg.m(Lpp;ZI)Z")
    public boolean method5386(class421 arg0, boolean arg1) {
        class334 var3 = (class334) this.method5548(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3965 != 0;
        }
    }

    @ObfuscatedName("lg.u(Lot;IB)V")
    public void method5385(class400 arg0, int arg1) {
        while (true) {
            if (arg0.field4272 < arg1) {
                boolean var3 = arg0.method6217() == 1;
                class421 var4 = new class421(arg0.method6226(), this.field3925);
                class421 var5 = new class421(arg0.method6226(), this.field3925);
                int var6 = arg0.method6219();
                int var7 = arg0.method6217();
                int var8 = arg0.method6217();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method6226();
                    arg0.method6217();
                    arg0.method6222();
                }
                arg0.method6226();
                if (var4 != null && var4.method6781()) {
                    class334 var11 = (class334) this.method5502(var4);
                    if (var3) {
                        class334 var12 = (class334) this.method5502(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5516(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5504() >= 400) {
                            continue;
                        }
                        var11 = (class334) this.method5494(var4, var5);
                    } else {
                        this.method5497(var11, var4, var5);
                        if (var11.field3965 != var6) {
                            boolean var13 = true;
                            for (class335 var14 = (class335) this.field3921.method5076(); var14 != null; var14 = (class335) this.field3921.method5081()) {
                                if (var14.field3941.equals(var4)) {
                                    if (var6 != 0 && var14.field3942 == 0) {
                                        var14.method5725();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3942 != 0) {
                                        var14.method5725();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3921.method5073(new class335(var4, var6));
                            }
                        }
                    }
                    if (var11.field3965 != var6) {
                        var11.field3963 = ++this.field3924 - 1;
                        if (var11.field3965 == -1 && var6 == 0) {
                            var11.field3963 = -(var11.field3963 * 897750695) * 1852682519;
                        }
                        var11.field3965 = var6;
                    }
                    var11.field3962 = var7;
                    var11.field3937 = var9;
                    var11.field3938 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5496();
            return;
        }
    }
}
