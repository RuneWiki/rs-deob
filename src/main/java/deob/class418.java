package deob;

@ObfuscatedName("pv")
public abstract class class418 implements class262 {

    @ObfuscatedName("pv.h")
    public class457 field4652;

    public class418(int arg0) {
    }

    @ObfuscatedName("pv.x(Lqy;B)V")
    public void method7184(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            class414 var3 = (class414) class347.method1688(Statics.method1920(), var2);
            if (var3 == null) {
                this.method7180(arg0, var2);
            } else {
                switch(var3.field4639) {
                    case 0:
                        class327[] var5 = new class327[] { class327.field4141, class327.field4144, class327.field4142, class327.field4145 };
                        class347.method1688(var5, arg0.method7792());
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 2:
                        int var4 = arg0.method7792();
                        this.field4652 = class455.method73(var4);
                        if (this.field4652 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 3:
                        arg0.method7802();
                }
            }
        }
    }

    @ObfuscatedName("pv.m(S)Z")
    public boolean method7185() {
        return this.field4652 != null;
    }

    @ObfuscatedName("pv.q(B)Ljava/lang/Object;")
    public Object method7186() {
        if (class457.field4875 == this.field4652) {
            return 0;
        } else if (class457.field4871 == this.field4652) {
            return -1L;
        } else if (class457.field4872 == this.field4652) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("pv.h(Lqy;II)V")
    public abstract void method7180(class467 arg0, int arg1);
}
