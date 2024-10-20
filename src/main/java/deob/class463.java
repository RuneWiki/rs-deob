package deob;

@ObfuscatedName("rw")
public class class463 extends class472 {

    @ObfuscatedName("rw.af")
    public final class524 field4896;

    public class463(class524 arg0) {
        super(400);
        this.field4896 = arg0;
    }

    @ObfuscatedName("rw.ak(B)Lsg;")
    public class470 method7796() {
        return new class473();
    }

    @ObfuscatedName("rw.al(II)[Lsg;")
    public class470[] method7805(int arg0) {
        return new class473[arg0];
    }

    @ObfuscatedName("rw.aj(Lua;II)V")
    public void method7797(class546 arg0, int arg1) {
        while (arg0.field5344 < arg1) {
            int var3 = arg0.method8796();
            if (var3 == 4) {
                class568 var4 = new class568(arg0.method8806(), this.field4896);
                if (!var4.method9387()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field182.method1809(var4.method9385(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class568 var7 = new class568(arg0.method8806(), this.field4896);
                class568 var8 = new class568(arg0.method8806(), this.field4896);
                arg0.method8806();
                if (!var7.method9387()) {
                    throw new IllegalStateException();
                }
                class473 var9 = (class473) this.method7912(var7);
                if (var6) {
                    class473 var10 = (class473) this.method7912(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7970(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7918(var9, var7, var8);
                } else if (this.method7931() < 400) {
                    int var11 = this.method7931();
                    class473 var12 = (class473) this.method7932(var7, var8);
                    var12.field4931 = var11;
                }
            }
        }
    }
}
