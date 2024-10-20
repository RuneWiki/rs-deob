package deob;

@ObfuscatedName("sm")
public abstract class class490 implements class306 {

    @ObfuscatedName("sm.aq")
    public class535 field5038;

    public class490(int arg0) {
    }

    @ObfuscatedName("sm.ak(Lvp;I)V")
    public void method8060(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            class486[] var3 = new class486[] { class486.field5029, class486.field5025, class486.field5027, class486.field5028 };
            class486 var4 = (class486) class402.method3799(var3, var2);
            if (var4 == null) {
                this.method8055(arg0, var2);
            } else {
                switch(var4.field5026) {
                    case 0:
                        class380[] var6 = new class380[] { class380.field4430, class380.field4433, class380.field4431, class380.field4432 };
                        class402.method3799(var6, arg0.method8804());
                        break;
                    case 1:
                        arg0.method8882();
                        break;
                    case 2:
                        int var5 = arg0.method8804();
                        this.field5038 = class533.method2651(var5);
                        if (this.field5038 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            }
        }
    }

    @ObfuscatedName("sm.ap(I)Z")
    public boolean method8062() {
        return this.field5038 != null;
    }

    @ObfuscatedName("sm.an(B)Ljava/lang/Object;")
    public Object method8063() {
        if (class535.field5291 == this.field5038) {
            return 0;
        } else if (class535.field5285 == this.field5038) {
            return -1L;
        } else if (class535.field5287 == this.field5038) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sm.aq(Lvp;II)V")
    public abstract void method8055(class547 arg0, int arg1);
}
