package deob;

@ObfuscatedName("oj")
public abstract class class395 implements class249 {

    @ObfuscatedName("oj.c")
    public class433 field4429;

    public class395(int arg0) {
    }

    @ObfuscatedName("oj.f(Lqt;I)V")
    public void method6442(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            class391[] var3 = new class391[] { class391.field4419, class391.field4420, class391.field4421, class391.field4423 };
            class391 var4 = (class391) class329.method2087(var3, var2);
            if (var4 == null) {
                this.method6440(arg0, var2);
            } else {
                switch(var4.field4418) {
                    case 0:
                        int var6 = arg0.method7047();
                        this.field4429 = class431.method4951(var6);
                        if (this.field4429 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                    case 1:
                        class309[] var5 = new class309[] { class309.field3940, class309.field3939, class309.field3942, class309.field3941 };
                        class329.method2087(var5, arg0.method7047());
                        break;
                    case 2:
                        arg0.method7211();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            }
        }
    }

    @ObfuscatedName("oj.j(I)Z")
    public boolean method6443() {
        return this.field4429 != null;
    }

    @ObfuscatedName("oj.e(I)Ljava/lang/Object;")
    public Object method6448() {
        if (class433.field4659 == this.field4429) {
            return 0;
        } else if (class433.field4657 == this.field4429) {
            return -1L;
        } else if (class433.field4658 == this.field4429) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("oj.c(Lqt;II)V")
    public abstract void method6440(class443 arg0, int arg1);
}
