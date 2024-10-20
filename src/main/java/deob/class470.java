package deob;

@ObfuscatedName("sj")
public abstract class class470 implements class292 {

    @ObfuscatedName("sj.at")
    public class515 field4809;

    public class470(int arg0) {
    }

    @ObfuscatedName("sj.au(Luj;B)V")
    public void method7778(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            class466 var3 = (class466) class385.method164(class466.method2936(), var2);
            if (var3 == null) {
                this.method7773(arg0, var2);
            } else {
                switch(var3.field4792) {
                    case 0:
                        class385.method164(class365.method3917(), arg0.method8410());
                        break;
                    case 1:
                        int var4 = arg0.method8410();
                        this.field4809 = class513.method7784(var4);
                        if (this.field4809 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 2:
                        arg0.method8422();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("sj.aa(I)Z")
    public boolean method7779() {
        return this.field4809 != null;
    }

    @ObfuscatedName("sj.ac(I)Ljava/lang/Object;")
    public Object method7780() {
        if (class515.field5066 == this.field4809) {
            return 0;
        } else if (class515.field5067 == this.field4809) {
            return -1L;
        } else if (class515.field5062 == this.field4809) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sj.at(Luj;II)V")
    public abstract void method7773(class527 arg0, int arg1);
}
