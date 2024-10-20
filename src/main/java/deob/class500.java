package deob;

@ObfuscatedName("tv")
public abstract class class500 implements class309 {

    @ObfuscatedName("tv.ap")
    public class545 field5127;

    public class500(int arg0) {
    }

    @ObfuscatedName("tv.ay(Lvl;I)V")
    public void method8596(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            class496 var3 = (class496) class406.method3580(class496.method7703(), var2);
            if (var3 == null) {
                this.method8591(arg0, var2);
            } else {
                switch(var3.field5121) {
                    case 0:
                        int var5 = arg0.method9258();
                        this.field5127 = class543.method4246(var5);
                        if (this.field5127 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        class384[] var4 = new class384[] { class384.field4496, class384.field4494, class384.field4497, class384.field4495 };
                        class406.method3580(var4, arg0.method9258());
                        break;
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 3:
                        arg0.method9270();
                }
            }
        }
    }

    @ObfuscatedName("tv.as(I)Z")
    public boolean method8600() {
        return this.field5127 != null;
    }

    @ObfuscatedName("tv.ae(I)Ljava/lang/Object;")
    public Object method8597() {
        if (class545.field5386 == this.field5127) {
            return 0;
        } else if (class545.field5381 == this.field5127) {
            return -1L;
        } else if (class545.field5382 == this.field5127) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("tv.ap(Lvl;II)V")
    public abstract void method8591(class558 arg0, int arg1);
}
