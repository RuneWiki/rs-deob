package deob;

@ObfuscatedName("qd")
public abstract class class429 implements class269 {

    @ObfuscatedName("qd.aj")
    public class468 field4638;

    public class429(int arg0) {
    }

    @ObfuscatedName("qd.ac(Lsy;I)V")
    public void method7291(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            class425[] var3 = new class425[] { class425.field4633, class425.field4632, class425.field4630, class425.field4631 };
            class425 var4 = (class425) class354.method5197(var3, var2);
            if (var4 == null) {
                this.method7284(arg0, var2);
            } else {
                switch(var4.field4629) {
                    case 1:
                        int var6 = arg0.method7909();
                        this.field4638 = class466.method7647(var6);
                        if (this.field4638 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                    case 2:
                        arg0.method8144();
                        break;
                    case 3:
                        class334[] var5 = new class334[] { class334.field4126, class334.field4127, class334.field4128, class334.field4125 };
                        class354.method5197(var5, arg0.method7909());
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            }
        }
    }

    @ObfuscatedName("qd.ab(I)Z")
    public boolean method7288() {
        return this.field4638 != null;
    }

    @ObfuscatedName("qd.an(I)Ljava/lang/Object;")
    public Object method7292() {
        if (class468.field4867 == this.field4638) {
            return 0;
        } else if (class468.field4860 == this.field4638) {
            return -1L;
        } else if (class468.field4866 == this.field4638) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("qd.aj(Lsy;IB)V")
    public abstract void method7284(class478 arg0, int arg1);
}
