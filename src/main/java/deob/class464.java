package deob;

@ObfuscatedName("rl")
public class class464 extends class473 {

    @ObfuscatedName("rl.ap")
    public final class525 field4915;

    public class464(class525 arg0) {
        super(400);
        this.field4915 = arg0;
    }

    @ObfuscatedName("rl.aq(B)Lsk;")
    public class471 method7759() {
        return new class474();
    }

    @ObfuscatedName("rl.ad(II)[Lsk;")
    public class471[] method7760(int arg0) {
        return new class474[arg0];
    }

    @ObfuscatedName("rl.ag(Lvp;II)V")
    public void method7761(class547 arg0, int arg1) {
        while (arg0.field5363 < arg1) {
            int var3 = arg0.method8804();
            if (var3 == 4) {
                class569 var4 = new class569(arg0.method8739(), this.field4915);
                if (!var4.method9359()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field1599.method1820(var4.method9347(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class569 var7 = new class569(arg0.method8739(), this.field4915);
                class569 var8 = new class569(arg0.method8739(), this.field4915);
                arg0.method8739();
                if (!var7.method9359()) {
                    throw new IllegalStateException();
                }
                class474 var9 = (class474) this.method7886(var7);
                if (var6) {
                    class474 var10 = (class474) this.method7886(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7874(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7878(var9, var7, var8);
                } else if (this.method7889() < 400) {
                    int var11 = this.method7889();
                    class474 var12 = (class474) this.method7875(var7, var8);
                    var12.field4954 = var11;
                }
            }
        }
    }
}
