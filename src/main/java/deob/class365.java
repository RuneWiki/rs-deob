package deob;

@ObfuscatedName("nd")
public class class365 extends class374 {

    @ObfuscatedName("nd.l")
    public final class424 field4296;

    public class365(class424 arg0) {
        super(400);
        this.field4296 = arg0;
    }

    @ObfuscatedName("nd.o(I)Lnb;")
    public class372 method5931() {
        return new class375();
    }

    @ObfuscatedName("nd.q(II)[Lnb;")
    public class372[] method5932(int arg0) {
        return new class375[arg0];
    }

    @ObfuscatedName("nd.l(Lpx;IB)V")
    public void method5930(class440 arg0, int arg1) {
        while (true) {
            if (arg0.field4678 < arg1) {
                int var3 = arg0.method7071();
                boolean var4 = (var3 & 0x1) == 1;
                class461 var5 = new class461(arg0.method7044(), this.field4296);
                class461 var6 = new class461(arg0.method7044(), this.field4296);
                arg0.method7044();
                if (var5 != null && var5.method7490()) {
                    class375 var7 = (class375) this.method6055(var5);
                    if (var4) {
                        class375 var8 = (class375) this.method6055(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method6039(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method6036(var7, var5, var6);
                        continue;
                    }
                    if (this.method6028() < 400) {
                        int var9 = this.method6028();
                        class375 var10 = (class375) this.method6073(var5, var6);
                        var10.field4333 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
