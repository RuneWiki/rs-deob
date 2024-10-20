package deob;

@ObfuscatedName("oz")
public abstract class class415 implements class259 {

    @ObfuscatedName("oz.a")
    public class454 field4599;

    public class415(int arg0) {
    }

    @ObfuscatedName("oz.h(Lqr;I)V")
    public void method7126(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            class411[] var3 = new class411[] { class411.field4588, class411.field4587, class411.field4589, class411.field4586 };
            class411 var4 = (class411) class344.method4292(var3, var2);
            if (var4 == null) {
                this.method7120(arg0, var2);
            } else {
                switch(var4.field4585) {
                    case 0:
                        class324[] var6 = new class324[] { class324.field4090, class324.field4091, class324.field4093, class324.field4089 };
                        class344.method4292(var6, arg0.method7735());
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 2:
                        arg0.method7726();
                        break;
                    case 3:
                        int var5 = arg0.method7735();
                        this.field4599 = class452.method4310(var5);
                        if (this.field4599 == null) {
                            throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                        }
                }
            }
        }
    }

    @ObfuscatedName("oz.j(I)Z")
    public boolean method7127() {
        return this.field4599 != null;
    }

    @ObfuscatedName("oz.y(I)Ljava/lang/Object;")
    public Object method7128() {
        if (class454.field4835 == this.field4599) {
            return 0;
        } else if (class454.field4829 == this.field4599) {
            return -1L;
        } else if (class454.field4837 == this.field4599) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("oz.a(Lqr;IB)V")
    public abstract void method7120(class464 arg0, int arg1);
}
