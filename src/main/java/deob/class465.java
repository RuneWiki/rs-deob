package deob;

@ObfuscatedName("rp")
public class class465 extends class474 {

    @ObfuscatedName("rp.ax")
    public final class526 field4891;

    public class465(class526 arg0) {
        super(400);
        this.field4891 = arg0;
    }

    @ObfuscatedName("rp.ab(I)Lsz;")
    public class472 method7861() {
        return new class475();
    }

    @ObfuscatedName("rp.ay(IB)[Lsz;")
    public class472[] method7862(int arg0) {
        return new class475[arg0];
    }

    @ObfuscatedName("rp.an(Lvg;II)V")
    public void method7860(class549 arg0, int arg1) {
        while (arg0.field5378 < arg1) {
            int var3 = arg0.method9025();
            if (var3 == 4) {
                class572 var4 = new class572(arg0.method8808(), this.field4891);
                if (!var4.method9468()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field3011.method1896(var4.method9470(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class572 var7 = new class572(arg0.method8808(), this.field4891);
                class572 var8 = new class572(arg0.method8808(), this.field4891);
                arg0.method8808();
                if (!var7.method9468()) {
                    throw new IllegalStateException();
                }
                class475 var9 = (class475) this.method7959(var7);
                if (var6) {
                    class475 var10 = (class475) this.method7959(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method7955(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method8010(var9, var7, var8);
                } else if (this.method8008() < 400) {
                    int var11 = this.method8008();
                    class475 var12 = (class475) this.method7965(var7, var8);
                    var12.field4933 = var11;
                }
            }
        }
    }
}
