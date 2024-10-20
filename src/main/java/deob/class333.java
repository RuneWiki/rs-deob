package deob;

@ObfuscatedName("lg")
public class class333 extends class340 {

    @ObfuscatedName("lg.s")
    public final class383 field3931;

    @ObfuscatedName("lg.a")
    public int field3930 = 1;

    @ObfuscatedName("lg.o")
    public class312 field3929 = new class312();

    public class333(class383 arg0) {
        super(400);
        this.field3931 = arg0;
    }

    @ObfuscatedName("lg.i(I)Lla;")
    public class338 method5402() {
        return new class335();
    }

    @ObfuscatedName("lg.w(IB)[Lla;")
    public class338[] method5403(int arg0) {
        return new class335[arg0];
    }

    @ObfuscatedName("lg.s(Lpb;ZI)Z")
    public boolean method5413(class422 arg0, boolean arg1) {
        class335 var3 = (class335) this.method5499(arg0);
        if (var3 == null) {
            return false;
        } else {
            return !arg1 || var3.field3965 != 0;
        }
    }

    @ObfuscatedName("lg.e(Lop;II)V")
    public void method5416(class401 arg0, int arg1) {
        while (true) {
            if (arg0.field4300 < arg1) {
                boolean var3 = arg0.method6240() == 1;
                class422 var4 = new class422(arg0.method6335(), this.field3931);
                class422 var5 = new class422(arg0.method6335(), this.field3931);
                int var6 = arg0.method6242();
                int var7 = arg0.method6240();
                int var8 = arg0.method6240();
                boolean var9 = (var8 & 0x2) != 0;
                boolean var10 = (var8 & 0x1) != 0;
                if (var6 > 0) {
                    arg0.method6335();
                    arg0.method6240();
                    arg0.method6245();
                }
                arg0.method6335();
                if (var4 != null && var4.method6816()) {
                    class335 var11 = (class335) this.method5558(var4);
                    if (var3) {
                        class335 var12 = (class335) this.method5558(var5);
                        if (var12 != null && var11 != var12) {
                            if (var11 == null) {
                                var11 = var12;
                            } else {
                                this.method5520(var12);
                            }
                        }
                    }
                    if (var11 == null) {
                        if (this.method5496() >= 400) {
                            continue;
                        }
                        var11 = (class335) this.method5518(var4, var5);
                    } else {
                        this.method5507(var11, var4, var5);
                        if (var11.field3965 != var6) {
                            boolean var13 = true;
                            for (class336 var14 = (class336) this.field3929.method5110(); var14 != null; var14 = (class336) this.field3929.method5109()) {
                                if (var14.field3945.equals(var4)) {
                                    if (var6 != 0 && var14.field3948 == 0) {
                                        var14.method5746();
                                        var13 = false;
                                    } else if (var6 == 0 && var14.field3948 != 0) {
                                        var14.method5746();
                                        var13 = false;
                                    }
                                }
                            }
                            if (var13) {
                                this.field3929.method5111(new class336(var4, var6));
                            }
                        }
                    }
                    if (var11.field3965 != var6) {
                        var11.field3966 = ++this.field3930 - 1;
                        if (var11.field3965 == -1 && var6 == 0) {
                            var11.field3966 = -(var11.field3966 * -939883657) * -641382841;
                        }
                        var11.field3965 = var6;
                    }
                    var11.field3964 = var7;
                    var11.field3943 = var9;
                    var11.field3942 = var10;
                    continue;
                }
                throw new IllegalStateException();
            }
            this.method5506();
            return;
        }
    }
}
