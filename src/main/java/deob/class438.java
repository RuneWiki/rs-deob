package deob;

@ObfuscatedName("qs")
public class class438 extends class447 {

    @ObfuscatedName("qs.ab")
    public final class505 field4662;

    public class438(class505 arg0) {
        super(400);
        this.field4662 = arg0;
    }

    @ObfuscatedName("qs.at(I)Lrf;")
    public class445 method7337() {
        return new class448();
    }

    @ObfuscatedName("qs.ah(II)[Lrf;")
    public class445[] method7338(int arg0) {
        return new class448[arg0];
    }

    @ObfuscatedName("qs.ar(Luj;IB)V")
    public void method7339(class527 arg0, int arg1) {
        while (arg0.field5137 < arg1) {
            int var3 = arg0.method8410();
            if (var3 == 4) {
                class550 var4 = new class550(arg0.method8535(), this.field4662);
                if (!var4.method9075()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field52.method1808(var4.method9073(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class550 var7 = new class550(arg0.method8535(), this.field4662);
                class550 var8 = new class550(arg0.method8535(), this.field4662);
                arg0.method8535();
                if (!var7.method9075()) {
                    throw new IllegalStateException();
                }
                class448 var9 = (class448) this.method7473(var7);
                if (var6) {
                    class448 var10 = (class448) this.method7473(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7445(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method7450(var9, var7, var8);
                } else if (this.method7456() < 400) {
                    int var11 = this.method7456();
                    class448 var12 = (class448) this.method7447(var7, var8);
                    var12.field4700 = var11;
                }
            }
        }
    }
}
