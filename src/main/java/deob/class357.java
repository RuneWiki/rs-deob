package deob;

@ObfuscatedName("mp")
public abstract class class357 implements class229 {

    @ObfuscatedName("mp.l")
    public class393 field4045;

    public class357(int arg0) {
    }

    @ObfuscatedName("mp.k(Lot;I)V")
    public void method5743(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            class353[] var3 = new class353[] { class353.field4037, class353.field4036, class353.field4040, class353.field4038 };
            class353 var4 = (class353) class304.method2484(var3, var2);
            if (var4 == null) {
                this.method5733(arg0, var2);
            } else {
                switch(var4.field4039) {
                    case 0:
                        int var5 = arg0.method6272();
                        this.field4045 = class391.method1789(var5);
                        if (this.field4045 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 2:
                        class304.method2484(class284.method717(), arg0.method6272());
                        break;
                    case 3:
                        arg0.method6282();
                }
            }
        }
    }

    @ObfuscatedName("mp.t(S)Z")
    public boolean method5741() {
        return this.field4045 != null;
    }

    @ObfuscatedName("mp.a(I)Ljava/lang/Object;")
    public Object method5738() {
        if (class393.field4267 == this.field4045) {
            return 0;
        } else if (class393.field4274 == this.field4045) {
            return -1L;
        } else if (class393.field4265 == this.field4045) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("mp.l(Lot;II)V")
    public abstract void method5733(class401 arg0, int arg1);
}
