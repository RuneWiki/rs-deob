package deob;

@ObfuscatedName("mq")
public abstract class class344 implements class215 {

    @ObfuscatedName("mq.f")
    public class376 field3925;

    public class344(int arg0) {
    }

    @ObfuscatedName("mq.y(Lnt;I)V")
    public void method5392(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            class340[] var3 = new class340[] { class340.field3917, class340.field3915, class340.field3914, class340.field3916 };
            class340 var4 = (class340) class290.method2391(var3, var2);
            if (var4 == null) {
                this.method5387(arg0, var2);
            } else {
                switch(var4.field3913) {
                    case 0:
                        int var5 = arg0.method5902();
                        int var6 = class374.field4127[var5];
                        class376 var7;
                        if (var6 == 1) {
                            var7 = class376.field4135;
                        } else if (var6 == 2) {
                            var7 = class376.field4129;
                        } else if (var6 == 3) {
                            var7 = class376.field4128;
                        } else {
                            var7 = null;
                        }
                        this.field3925 = var7;
                        if (this.field3925 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        arg0.method5907();
                        break;
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 3:
                        class290.method2391(class270.method4019(), arg0.method5902());
                }
            }
        }
    }

    @ObfuscatedName("mq.j(I)Z")
    public boolean method5393() {
        return this.field3925 != null;
    }

    @ObfuscatedName("mq.o(I)Ljava/lang/Object;")
    public Object method5394() {
        if (class376.field4135 == this.field3925) {
            return 0;
        } else if (class376.field4128 == this.field3925) {
            return -1L;
        } else if (class376.field4129 == this.field3925) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("mq.f(Lnt;II)V")
    public abstract void method5387(class384 arg0, int arg1);
}
