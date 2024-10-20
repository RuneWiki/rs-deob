package deob;

@ObfuscatedName("kr")
public class class297 extends class292 {

    @ObfuscatedName("kr.g")
    public final class335 field3724;

    @ObfuscatedName("kr.b")
    public int field3725 = 1;

    @ObfuscatedName("kr.n")
    public class216 field3726 = new class216();

    public class297(class335 arg0) {
        super(400);
        this.field3724 = arg0;
    }

    @ObfuscatedName("kr.a(I)Lkn;")
    public class289 method5128() {
        return new class299();
    }

    @ObfuscatedName("kr.s(IB)[Lkn;")
    public class289[] method5130(int arg0) {
        return new class299[arg0];
    }

    @ObfuscatedName("kr.g(Lkx;ZB)Z")
    public boolean method5235(class298 arg0, boolean arg1) {
        class299 var3 = (class299) this.method5143(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3713 != 0;
        }
    }

    @ObfuscatedName("kr.n(Lgx;IB)V")
    public void method5230(class190 arg0, int arg1) {
        while (true) {
            if (arg0.field2419 < arg1) {
                boolean var3 = arg0.method3443() == 1;
                class298 var4 = new class298(arg0.method3647(), this.field3724);
                class298 var5 = new class298(arg0.method3647(), this.field3724);
                int var6 = arg0.method3610();
                int var7 = arg0.method3443();
                int var8 = arg0.method3443();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method3647();
                    arg0.method3443();
                    arg0.method3460();
                }
                arg0.method3647();
                if (var4 != null && var4.method5238()) {
                    class299 var11 = (class299) this.method5174(var4);
                    if (var3) {
                        class299 var12 = (class299) this.method5174(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5147(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5140() >= 400) {
                            continue;
                        }
                        var11 = (class299) this.method5149(var4, var5);
                    } else {
                        this.method5144(var11, var4, var5);
                        if (var11.field3713 != var6) {
                            boolean var13 = true;
                            for (class301 var14 = (class301) this.field3726.method4004(); var14 != null; var14 = (class301) this.field3726.method4000()) {
                                if (var14.field3742.equals(var4)) {
                                    if (var6 != 0 && var14.field3743 == 0) {
                                        var14.method4010();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3743 != 0) {
                                        var14.method4010();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3726.method4005(new class301(var4, var6));
                            }
                        }
                    }
                    if (var11.field3713 != var6) {
                        var11.field3712 = ++this.field3725 - 1;
                        if (var11.field3713 == -1 && var6 == 0) {
                            var11.field3712 = -(var11.field3712 * -67140027) * -2143445875;
                        }
                        var11.field3713 = var6;
                    }
                    var11.field3711 = var7;
                    var11.field3730 = var9;
                    var11.field3731 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5180();
            return;
        }
    }
}
