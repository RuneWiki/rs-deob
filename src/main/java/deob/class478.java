package deob;

@ObfuscatedName("sm")
public abstract class class478 implements class297 {

    @ObfuscatedName("sm.az")
    public class523 field4904;

    public class478(int arg0) {
    }

    @ObfuscatedName("sm.an(Lur;B)V")
    public void method7790(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            class474 var3 = (class474) class393.method3484(class474.method7414(), var2);
            if (var3 == null) {
                this.method7786(arg0, var2);
            } else {
                switch(var3.field4898) {
                    case 0:
                        class393.method3484(class371.method2994(), arg0.method8462());
                        break;
                    case 1:
                        int var4 = arg0.method8462();
                        this.field4904 = class521.method3603(var4);
                        if (this.field4904 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 2:
                        arg0.method8474();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("sm.ao(I)Z")
    public boolean method7796() {
        return this.field4904 != null;
    }

    @ObfuscatedName("sm.ab(I)Ljava/lang/Object;")
    public Object method7791() {
        if (class523.field5159 == this.field4904) {
            return 0;
        } else if (class523.field5161 == this.field4904) {
            return -1L;
        } else if (class523.field5156 == this.field4904) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sm.az(Lur;II)V")
    public abstract void method7786(class535 arg0, int arg1);
}
