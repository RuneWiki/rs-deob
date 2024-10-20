package deob;

@ObfuscatedName("ou")
public abstract class class396 implements class250 {

    @ObfuscatedName("ou.o")
    public class434 field4431;

    public class396(int arg0) {
    }

    @ObfuscatedName("ou.a(Lpx;I)V")
    public void method6351(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            class392[] var3 = new class392[] { class392.field4422, class392.field4420, class392.field4425, class392.field4423 };
            class392 var4 = (class392) class330.method4934(var3, var2);
            if (var4 == null) {
                this.method6346(arg0, var2);
            } else {
                switch(var4.field4424) {
                    case 1:
                        int var6 = arg0.method7071();
                        int var7 = class432.field4652[var6];
                        class434 var8;
                        if (var7 == 1) {
                            var8 = class434.field4665;
                        } else if (var7 == 2) {
                            var8 = class434.field4657;
                        } else if (var7 == 3) {
                            var8 = class434.field4656;
                        } else {
                            var8 = null;
                        }
                        this.field4431 = var8;
                        if (this.field4431 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                    case 2:
                        class310[] var5 = new class310[] { class310.field3974, class310.field3977, class310.field3973, class310.field3975 };
                        class330.method4934(var5, arg0.method7071());
                        break;
                    case 3:
                        arg0.method6904();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            }
        }
    }

    @ObfuscatedName("ou.m(B)Z")
    public boolean method6352() {
        return this.field4431 != null;
    }

    @ObfuscatedName("ou.p(B)Ljava/lang/Object;")
    public Object method6353() {
        if (class434.field4665 == this.field4431) {
            return 0;
        } else if (class434.field4656 == this.field4431) {
            return -1L;
        } else if (class434.field4657 == this.field4431) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("ou.o(Lpx;II)V")
    public abstract void method6346(class440 arg0, int arg1);
}
