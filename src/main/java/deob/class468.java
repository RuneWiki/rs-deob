package deob;

@ObfuscatedName("rr")
public class class468 extends class477 {

    @ObfuscatedName("rr.ai")
    public final class535 field4980;

    public class468(class535 arg0) {
        super(400);
        this.field4980 = arg0;
    }

    @ObfuscatedName("rr.ap(I)Lse;")
    public class475 method8257() {
        return new class478();
    }

    @ObfuscatedName("rr.aw(II)[Lse;")
    public class475[] method8258(int arg0) {
        return new class478[arg0];
    }

    @ObfuscatedName("rr.ak(Lvl;II)V")
    public void method8261(class558 arg0, int arg1) {
        while (arg0.field5462 < arg1) {
            int var3 = arg0.method9258();
            if (var3 == 4) {
                class581 var4 = new class581(arg0.method9269(), this.field4980);
                if (!var4.method9994()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field1072.method1939(var4.method9989(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class581 var7 = new class581(arg0.method9269(), this.field4980);
                class581 var8 = new class581(arg0.method9269(), this.field4980);
                arg0.method9269();
                if (!var7.method9994()) {
                    throw new IllegalStateException();
                }
                class478 var9 = (class478) this.method8360(var7);
                if (var6) {
                    class478 var10 = (class478) this.method8360(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method8363(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method8368(var9, var7, var8);
                } else if (this.method8356() < 400) {
                    int var11 = this.method8356();
                    class478 var12 = (class478) this.method8365(var7, var8);
                    var12.field5020 = var11;
                }
            }
        }
    }
}
