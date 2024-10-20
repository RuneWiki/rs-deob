package deob;

@ObfuscatedName("mw")
public class class364 extends class373 {

    @ObfuscatedName("mw.i")
    public final class422 field4229;

    public class364(class422 arg0) {
        super(400);
        this.field4229 = arg0;
    }

    @ObfuscatedName("mw.v(I)Lnn;")
    public class371 method6030() {
        return new class374();
    }

    @ObfuscatedName("mw.c(II)[Lnn;")
    public class371[] method6037(int arg0) {
        return new class374[arg0];
    }

    @ObfuscatedName("mw.i(Lpi;IS)V")
    public void method6032(class438 arg0, int arg1) {
        while (true) {
            if (arg0.field4621 < arg1) {
                int var3 = arg0.method6971();
                boolean var4 = (var3 & 0x1) == 1;
                class459 var5 = new class459(arg0.method6981(), this.field4229);
                class459 var6 = new class459(arg0.method6981(), this.field4229);
                arg0.method6981();
                if (var5 != null && var5.method7524()) {
                    class374 var7 = (class374) this.method6174(var5);
                    if (var4) {
                        class374 var8 = (class374) this.method6174(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method6136(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method6127(var7, var5, var6);
                        continue;
                    }
                    if (this.method6129() < 400) {
                        int var9 = this.method6129();
                        class374 var10 = (class374) this.method6138(var5, var6);
                        var10.field4266 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
