package deob;

@ObfuscatedName("nd")
public class class365 extends class374 {

    @ObfuscatedName("nd.w")
    public final class424 field4276;

    public class365(class424 arg0) {
        super(400);
        this.field4276 = arg0;
    }

    @ObfuscatedName("nd.s(I)Lnb;")
    public class372 method5922() {
        return new class375();
    }

    @ObfuscatedName("nd.h(II)[Lnb;")
    public class372[] method5924(int arg0) {
        return new class375[arg0];
    }

    @ObfuscatedName("nd.w(Lqr;IB)V")
    public void method5929(class444 arg0, int arg1) {
        while (true) {
            if (arg0.field4708 < arg1) {
                int var3 = arg0.method6929();
                boolean var4 = (var3 & 0x1) == 1;
                class465 var5 = new class465(arg0.method6975(), this.field4276);
                class465 var6 = new class465(arg0.method6975(), this.field4276);
                arg0.method6975();
                if (var5 != null && var5.method7489()) {
                    class375 var7 = (class375) this.method6025(var5);
                    if (var4) {
                        class375 var8 = (class375) this.method6025(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method6086(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method6033(var7, var5, var6);
                        continue;
                    }
                    if (this.method6067() < 400) {
                        int var9 = this.method6067();
                        class375 var10 = (class375) this.method6030(var5, var6);
                        var10.field4323 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
