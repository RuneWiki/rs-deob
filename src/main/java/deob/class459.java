package deob;

@ObfuscatedName("rc")
public abstract class class459 implements class282 {

    @ObfuscatedName("rc.aw")
    public class504 field4773;

    public class459(int arg0) {
    }

    @ObfuscatedName("rc.as(Lty;B)V")
    public void method7613(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            class455 var3 = (class455) class374.method2465(class455.method2696(), var2);
            if (var3 == null) {
                this.method7603(arg0, var2);
            } else {
                switch(var3.field4766) {
                    case 0:
                        class374.method2465(class354.method2152(), arg0.method8244());
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 2:
                        arg0.method8256();
                        break;
                    case 3:
                        int var4 = arg0.method8244();
                        this.field4773 = class502.method6796(var4);
                        if (this.field4773 == null) {
                            throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                        }
                }
            }
        }
    }

    @ObfuscatedName("rc.aj(I)Z")
    public boolean method7607() {
        return this.field4773 != null;
    }

    @ObfuscatedName("rc.ag(I)Ljava/lang/Object;")
    public Object method7608() {
        if (class504.field5031 == this.field4773) {
            return 0;
        } else if (class504.field5028 == this.field4773) {
            return -1L;
        } else if (class504.field5029 == this.field4773) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("rc.aw(Lty;II)V")
    public abstract void method7603(class514 arg0, int arg1);
}
