package deob;

@ObfuscatedName("rv")
public abstract class class458 implements class281 {

    @ObfuscatedName("rv.au")
    public class503 field4772;

    public class458(int arg0) {
    }

    @ObfuscatedName("rv.ac(Ltm;B)V")
    public void method7635(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            class454 var3 = (class454) class373.method371(class454.method7092(), var2);
            if (var3 == null) {
                this.method7632(arg0, var2);
            } else {
                switch(var3.field4762) {
                    case 0:
                        int var5 = arg0.method8300();
                        this.field4772 = class501.method3784(var5);
                        if (this.field4772 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        arg0.method8452();
                        break;
                    case 2:
                        class353[] var4 = new class353[] { class353.field4229, class353.field4226, class353.field4227, class353.field4225 };
                        class373.method371(var4, arg0.method8300());
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("rv.ai(I)Z")
    public boolean method7638() {
        return this.field4772 != null;
    }

    @ObfuscatedName("rv.az(B)Ljava/lang/Object;")
    public Object method7637() {
        if (class503.field5036 == this.field4772) {
            return 0;
        } else if (class503.field5038 == this.field4772) {
            return -1L;
        } else if (class503.field5031 == this.field4772) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("rv.au(Ltm;II)V")
    public abstract void method7632(class515 arg0, int arg1);
}
