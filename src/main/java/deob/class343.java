package deob;

@ObfuscatedName("ml")
public abstract class class343 implements class214 {

    @ObfuscatedName("ml.v")
    public class375 field3928;

    public class343(int arg0) {
    }

    @ObfuscatedName("ml.f(Lnd;I)V")
    public void method5474(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            class339 var3 = (class339) class289.method2163(class339.method3480(), var2);
            if (var3 == null) {
                this.method5472(arg0, var2);
            } else {
                switch(var3.field3919) {
                    case 0:
                        class289.method2163(class269.method4396(), arg0.method5965());
                        break;
                    case 1:
                        int var4 = arg0.method5965();
                        int var5 = class373.field4125[var4];
                        class375 var6;
                        if (var5 == 1) {
                            var6 = class375.field4132;
                        } else if (var5 == 2) {
                            var6 = class375.field4130;
                        } else if (var5 == 3) {
                            var6 = class375.field4129;
                        } else {
                            var6 = null;
                        }
                        this.field3928 = var6;
                        if (this.field3928 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 2:
                        arg0.method5975();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("ml.y(I)Z")
    public boolean method5477() {
        return this.field3928 != null;
    }

    @ObfuscatedName("ml.p(I)Ljava/lang/Object;")
    public Object method5476() {
        if (class375.field4132 == this.field3928) {
            return 0;
        } else if (class375.field4129 == this.field3928) {
            return -1L;
        } else if (class375.field4130 == this.field3928) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("ml.v(Lnd;II)V")
    public abstract void method5472(class383 arg0, int arg1);
}
