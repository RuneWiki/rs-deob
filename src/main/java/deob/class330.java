package deob;

@ObfuscatedName("lw")
public class class330 extends class339 {

    @ObfuscatedName("lw.m")
    public final class382 field3917;

    public class330(class382 arg0) {
        super(400);
        this.field3917 = arg0;
    }

    @ObfuscatedName("lw.n(B)Lle;")
    public class337 method5374() {
        return new class340();
    }

    @ObfuscatedName("lw.c(II)[Lle;")
    public class337[] method5379(int arg0) {
        return new class340[arg0];
    }

    @ObfuscatedName("lw.m(Lot;IB)V")
    public void method5384(class400 arg0, int arg1) {
        while (true) {
            if (arg0.field4272 < arg1) {
                int var3 = arg0.method6217();
                boolean var4 = (var3 & 0x1) == 1;
                class421 var5 = new class421(arg0.method6226(), this.field3917);
                class421 var6 = new class421(arg0.method6226(), this.field3917);
                arg0.method6226();
                if (var5 != null && var5.method6781()) {
                    class340 var7 = (class340) this.method5502(var5);
                    if (var4) {
                        class340 var8 = (class340) this.method5502(var6);
                        if (var8 != null && var7 != var8) {
                            if (var7 == null) {
                                var7 = var8;
                            } else {
                                this.method5516(var8);
                            }
                        }
                    }
                    if (var7 != null) {
                        this.method5497(var7, var5, var6);
                        continue;
                    }
                    if (this.method5504() < 400) {
                        int var9 = this.method5504();
                        class340 var10 = (class340) this.method5494(var5, var6);
                        var10.field3961 = var9;
                    }
                    continue;
                }
                throw new IllegalStateException();
            }
            return;
        }
    }
}
