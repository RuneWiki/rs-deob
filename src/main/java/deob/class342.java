package deob;

@ObfuscatedName("md")
public abstract class class342 implements class192 {

    @ObfuscatedName("md.f")
    public class374 field3929;

    public class342(int arg0) {
    }

    @ObfuscatedName("md.u(Lnu;I)V")
    public void method5341(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            class338[] var3 = new class338[] { class338.field3922, class338.field3923, class338.field3921, class338.field3926 };
            class338 var4 = (class338) class267.method2139(var3, var2);
            if (var4 == null) {
                this.method5334(arg0, var2);
            } else {
                switch(var4.field3924) {
                    case 0:
                        arg0.method5896();
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 2:
                        class247[] var6 = new class247[] { class247.field3216, class247.field3215, class247.field3218, class247.field3217 };
                        class267.method2139(var6, arg0.method5856());
                        break;
                    case 3:
                        int var5 = arg0.method5856();
                        this.field3929 = class372.method1710(var5);
                        if (this.field3929 == null) {
                            throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                        }
                }
            }
        }
    }

    @ObfuscatedName("md.p(I)Z")
    public boolean method5336() {
        return this.field3929 != null;
    }

    @ObfuscatedName("md.b(B)Ljava/lang/Object;")
    public Object method5338() {
        if (class374.field4127 == this.field3929) {
            return 0;
        } else if (class374.field4135 == this.field3929) {
            return -1L;
        } else if (class374.field4129 == this.field3929) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("md.f(Lnu;IB)V")
    public abstract void method5334(class382 arg0, int arg1);
}
