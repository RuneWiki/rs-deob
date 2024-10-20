package deob;

@ObfuscatedName("od")
public abstract class class396 implements class249 {

    @ObfuscatedName("od.s")
    public class434 field4435;

    public class396(int arg0) {
    }

    @ObfuscatedName("od.w(Lqr;I)V")
    public void method6366(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            class392 var3 = (class392) class330.method525(class392.method1824(), var2);
            if (var3 == null) {
                this.method6362(arg0, var2);
            } else {
                switch(var3.field4425) {
                    case 0:
                        int var5 = arg0.method6929();
                        this.field4435 = class432.method280(var5);
                        if (this.field4435 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        arg0.method7022();
                        break;
                    case 2:
                        class310[] var4 = new class310[] { class310.field3946, class310.field3939, class310.field3942, class310.field3941 };
                        class330.method525(var4, arg0.method6929());
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("od.v(B)Z")
    public boolean method6363() {
        return this.field4435 != null;
    }

    @ObfuscatedName("od.c(B)Ljava/lang/Object;")
    public Object method6365() {
        if (class434.field4660 == this.field4435) {
            return 0;
        } else if (class434.field4654 == this.field4435) {
            return -1L;
        } else if (class434.field4656 == this.field4435) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("od.s(Lqr;IS)V")
    public abstract void method6362(class444 arg0, int arg1);
}
