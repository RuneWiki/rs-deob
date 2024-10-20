package deob;

@ObfuscatedName("mi")
public abstract class class356 implements class229 {

    @ObfuscatedName("mi.n")
    public class392 field4026;

    public class356(int arg0) {
    }

    @ObfuscatedName("mi.o(Lot;I)V")
    public void method5701(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            class352[] var3 = new class352[] { class352.field4020, class352.field4022, class352.field4018, class352.field4019 };
            class352 var4 = (class352) class304.method4518(var3, var2);
            if (var4 == null) {
                this.method5696(arg0, var2);
            } else {
                switch(var4.field4021) {
                    case 1:
                        class284[] var8 = new class284[] { class284.field3654, class284.field3652, class284.field3653, class284.field3651 };
                        class304.method4518(var8, arg0.method6217());
                        break;
                    case 2:
                        int var5 = arg0.method6217();
                        int var6 = class390.field4235[var5];
                        class392 var7;
                        if (var6 == 1) {
                            var7 = class392.field4241;
                        } else if (var6 == 2) {
                            var7 = class392.field4239;
                        } else if (var6 == 3) {
                            var7 = class392.field4242;
                        } else {
                            var7 = null;
                        }
                        this.field4026 = var7;
                        if (this.field4026 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 3:
                        arg0.method6390();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            }
        }
    }

    @ObfuscatedName("mi.g(S)Z")
    public boolean method5703() {
        return this.field4026 != null;
    }

    @ObfuscatedName("mi.z(B)Ljava/lang/Object;")
    public Object method5702() {
        if (class392.field4241 == this.field4026) {
            return 0;
        } else if (class392.field4242 == this.field4026) {
            return -1L;
        } else if (class392.field4239 == this.field4026) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("mi.n(Lot;II)V")
    public abstract void method5696(class400 arg0, int arg1);
}
