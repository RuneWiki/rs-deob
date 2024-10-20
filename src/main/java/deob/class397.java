package deob;

@ObfuscatedName("of")
public abstract class class397 implements class250 {

    @ObfuscatedName("of.c")
    public class435 field4466;

    public class397(int arg0) {
    }

    @ObfuscatedName("of.k(Lqq;I)V")
    public void method6611(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            class393 var3 = (class393) class331.method5118(class393.method4270(), var2);
            if (var3 == null) {
                this.method6606(arg0, var2);
            } else {
                switch(var3.field4461) {
                    case 0:
                        class331.method5118(class311.method4605(), arg0.method7196());
                        break;
                    case 1:
                        int var4 = arg0.method7196();
                        this.field4466 = class433.method6114(var4);
                        if (this.field4466 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 3:
                        arg0.method7207();
                }
            }
        }
    }

    @ObfuscatedName("of.w(I)Z")
    public boolean method6612() {
        return this.field4466 != null;
    }

    @ObfuscatedName("of.s(I)Ljava/lang/Object;")
    public Object method6617() {
        if (class435.field4692 == this.field4466) {
            return 0;
        } else if (class435.field4689 == this.field4466) {
            return -1L;
        } else if (class435.field4690 == this.field4466) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("of.c(Lqq;IB)V")
    public abstract void method6606(class445 arg0, int arg1);
}
