package deob;

@ObfuscatedName("sf")
public abstract class class474 implements class295 {

    @ObfuscatedName("sf.am")
    public class519 field4841;

    public class474(int arg0) {
    }

    @ObfuscatedName("sf.aq(Luk;I)V")
    public void method7922(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            class470 var3 = (class470) class389.method6514(class470.method4732(), var2);
            if (var3 == null) {
                this.method7918(arg0, var2);
            } else {
                switch(var3.field4833) {
                    case 0:
                        class389.method6514(class368.method5279(), arg0.method8561());
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 2:
                        int var4 = arg0.method8561();
                        this.field4841 = class517.method4843(var4);
                        if (this.field4841 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 3:
                        arg0.method8635();
                }
            }
        }
    }

    @ObfuscatedName("sf.ar(I)Z")
    public boolean method7924() {
        return this.field4841 != null;
    }

    @ObfuscatedName("sf.ag(B)Ljava/lang/Object;")
    public Object method7925() {
        if (class519.field5110 == this.field4841) {
            return 0;
        } else if (class519.field5103 == this.field4841) {
            return -1L;
        } else if (class519.field5104 == this.field4841) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sf.am(Luk;II)V")
    public abstract void method7918(class531 arg0, int arg1);
}
