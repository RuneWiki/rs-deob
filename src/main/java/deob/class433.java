package deob;

@ObfuscatedName("qg")
public abstract class class433 implements class273 {

    @ObfuscatedName("qg.af")
    public class479 field4702;

    public class433(int arg0) {
    }

    @ObfuscatedName("qg.aw(Lsg;I)V")
    public void method7582(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            class429[] var3 = new class429[] { class429.field4694, class429.field4693, class429.field4692, class429.field4695 };
            class429 var4 = (class429) Statics.method3600(var3, var2);
            if (var4 == null) {
                this.method7580(arg0, var2);
            } else {
                switch(var4.field4696) {
                    case 1:
                        int var5 = arg0.method8248();
                        this.field4702 = class477.method2573(var5);
                        if (this.field4702 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 2:
                        Statics.method3600(class338.method6304(), arg0.method8248());
                        break;
                    case 3:
                        arg0.method8260();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            }
        }
    }

    @ObfuscatedName("qg.ac(I)Z")
    public boolean method7583() {
        return this.field4702 != null;
    }

    @ObfuscatedName("qg.au(I)Ljava/lang/Object;")
    public Object method7587() {
        if (class479.field4949 == this.field4702) {
            return 0;
        } else if (class479.field4948 == this.field4702) {
            return -1L;
        } else if (class479.field4947 == this.field4702) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("qg.af(Lsg;II)V")
    public abstract void method7580(class489 arg0, int arg1);
}
