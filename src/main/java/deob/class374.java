package deob;

@ObfuscatedName("np")
public abstract class class374 implements class242 {

    @ObfuscatedName("np.c")
    public class410 field4227;

    public class374(int arg0) {
    }

    @ObfuscatedName("np.m(Lpi;I)V")
    public void method6130(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            class370 var3 = (class370) class316.method2616(class370.method4979(), var2);
            if (var3 == null) {
                this.method6125(arg0, var2);
            } else {
                switch(var3.field4219) {
                    case 1:
                        int var5 = arg0.method6781();
                        int var6 = class408.field4440[var5];
                        class410 var7;
                        if (var6 == 1) {
                            var7 = class410.field4446;
                        } else if (var6 == 2) {
                            var7 = class410.field4450;
                        } else if (var6 == 3) {
                            var7 = class410.field4443;
                        } else {
                            var7 = null;
                        }
                        this.field4227 = var7;
                        if (this.field4227 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 2:
                        class296[] var4 = new class296[] { class296.field3792, class296.field3791, class296.field3790, class296.field3794 };
                        class316.method2616(var4, arg0.method6781());
                        break;
                    case 3:
                        arg0.method6681();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("np.t(S)Z")
    public boolean method6132() {
        return this.field4227 != null;
    }

    @ObfuscatedName("np.s(B)Ljava/lang/Object;")
    public Object method6133() {
        if (class410.field4446 == this.field4227) {
            return 0;
        } else if (class410.field4443 == this.field4227) {
            return -1L;
        } else if (class410.field4450 == this.field4227) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("np.c(Lpi;II)V")
    public abstract void method6125(class419 arg0, int arg1);
}
