package deob;

@ObfuscatedName("pq")
public class class397 extends class406 {

    @ObfuscatedName("pq.an")
    public final class458 field4495;

    public class397(class458 arg0) {
        super(400);
        this.field4495 = arg0;
    }

    @ObfuscatedName("pq.aj(I)Lpb;")
    public class404 method6843() {
        return new class407();
    }

    @ObfuscatedName("pq.al(IB)[Lpb;")
    public class404[] method6844(int arg0) {
        return new class407[arg0];
    }

    @ObfuscatedName("pq.ac(Lsy;II)V")
    public void method6845(class478 arg0, int arg1) {
        while (arg0.field4904 < arg1) {
            int var3 = arg0.method7909();
            if (var3 == 4) {
                class501 var4 = new class501(arg0.method7950(), this.field4495);
                if (!var4.method8489()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field16.method1802(var4.method8490(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class501 var7 = new class501(arg0.method7950(), this.field4495);
                class501 var8 = new class501(arg0.method7950(), this.field4495);
                arg0.method7950();
                if (!var7.method8489()) {
                    throw new IllegalStateException();
                }
                class407 var9 = (class407) this.method6955(var7);
                if (var6) {
                    class407 var10 = (class407) this.method6955(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method6974(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method6963(var9, var7, var8);
                } else if (this.method6951() < 400) {
                    int var11 = this.method6951();
                    class407 var12 = (class407) this.method6989(var7, var8);
                    var12.field4531 = var11;
                }
            }
        }
    }
}
