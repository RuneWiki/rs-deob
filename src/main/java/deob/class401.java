package deob;

@ObfuscatedName("pu")
public class class401 extends class410 {

    @ObfuscatedName("pu.au")
    public final class469 field4550;

    public class401(class469 arg0) {
        super(400);
        this.field4550 = arg0;
    }

    @ObfuscatedName("pu.af(I)Lpw;")
    public class408 method7085() {
        return new class411();
    }

    @ObfuscatedName("pu.an(II)[Lpw;")
    public class408[] method7088(int arg0) {
        return new class411[arg0];
    }

    @ObfuscatedName("pu.aw(Lsg;II)V")
    public void method7086(class489 arg0, int arg1) {
        while (arg0.field4989 < arg1) {
            int var3 = arg0.method8248();
            if (var3 == 4) {
                class513 var4 = new class513(arg0.method8259(), this.field4550);
                if (!var4.method8843()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field804.method1747(var4.method8841(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class513 var7 = new class513(arg0.method8259(), this.field4550);
                class513 var8 = new class513(arg0.method8259(), this.field4550);
                arg0.method8259();
                if (!var7.method8843()) {
                    throw new IllegalStateException();
                }
                class411 var9 = (class411) this.method7198(var7);
                if (var6) {
                    class411 var10 = (class411) this.method7198(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7208(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7210(var9, var7, var8);
                } else if (this.method7195() < 400) {
                    int var11 = this.method7195();
                    class411 var12 = (class411) this.method7221(var7, var8);
                    var12.field4595 = var11;
                }
            }
        }
    }
}
