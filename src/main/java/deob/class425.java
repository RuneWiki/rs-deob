package deob;

@ObfuscatedName("pj")
public abstract class class425 implements class266 {

    @ObfuscatedName("pj.f")
    public class464 field4675;

    public class425(int arg0) {
    }

    @ObfuscatedName("pj.z(Lrd;I)V")
    public void method7386(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            class421[] var3 = new class421[] { class421.field4666, class421.field4667, class421.field4668, class421.field4669 };
            class421 var4 = (class421) class351.method19(var3, var2);
            if (var4 == null) {
                this.method7383(arg0, var2);
            } else {
                switch(var4.field4670) {
                    case 0:
                        int var5 = arg0.method7964();
                        this.field4675 = class462.method6482(var5);
                        if (this.field4675 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 2:
                        arg0.method7975();
                        break;
                    case 3:
                        class351.method19(class331.method172(), arg0.method7964());
                }
            }
        }
    }

    @ObfuscatedName("pj.j(I)Z")
    public boolean method7391() {
        return this.field4675 != null;
    }

    @ObfuscatedName("pj.i(B)Ljava/lang/Object;")
    public Object method7387() {
        if (class464.field4898 == this.field4675) {
            return 0;
        } else if (class464.field4899 == this.field4675) {
            return -1L;
        } else if (class464.field4904 == this.field4675) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("pj.f(Lrd;IS)V")
    public abstract void method7383(class474 arg0, int arg1);
}
