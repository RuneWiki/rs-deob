package deob;

@ObfuscatedName("sy")
public abstract class class477 implements class297 {

    @ObfuscatedName("sy.aq")
    public class522 field4876;

    public class477(int arg0) {
    }

    @ObfuscatedName("sy.ai(Luq;I)V")
    public void method7925(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            class473[] var3 = new class473[] { class473.field4864, class473.field4867, class473.field4863, class473.field4865 };
            class473 var4 = (class473) class392.method6317(var3, var2);
            if (var4 == null) {
                this.method7922(arg0, var2);
            } else {
                switch(var4.field4866) {
                    case 0:
                        class371[] var6 = new class371[] { class371.field4323, class371.field4322, class371.field4321, class371.field4327 };
                        class392.method6317(var6, arg0.method8591());
                        break;
                    case 1:
                        arg0.method8603();
                        break;
                    case 2:
                        int var5 = arg0.method8591();
                        this.field4876 = class520.method5378(var5);
                        if (this.field4876 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            }
        }
    }

    @ObfuscatedName("sy.ar(I)Z")
    public boolean method7926() {
        return this.field4876 != null;
    }

    @ObfuscatedName("sy.as(I)Ljava/lang/Object;")
    public Object method7928() {
        if (class522.field5126 == this.field4876) {
            return 0;
        } else if (class522.field5129 == this.field4876) {
            return -1L;
        } else if (class522.field5127 == this.field4876) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sy.aq(Luq;II)V")
    public abstract void method7922(class534 arg0, int arg1);
}
