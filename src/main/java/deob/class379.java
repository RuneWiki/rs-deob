package deob;

@ObfuscatedName("nu")
public abstract class class379 implements class242 {

    @ObfuscatedName("nu.c")
    public class415 field4271;

    public class379(int arg0) {
    }

    @ObfuscatedName("nu.e(Lpi;B)V")
    public void method6134(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            class375 var3 = (class375) class321.method2696(class375.method5698(), var2);
            if (var3 == null) {
                this.method6130(arg0, var2);
            } else {
                switch(var3.field4266) {
                    case 0:
                        class321.method2696(class301.method4287(), arg0.method6686());
                        break;
                    case 1:
                        int var4 = arg0.method6686();
                        this.field4271 = class413.method174(var4);
                        if (this.field4271 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 3:
                        arg0.method6675();
                }
            }
        }
    }

    @ObfuscatedName("nu.r(S)Z")
    public boolean method6136() {
        return this.field4271 != null;
    }

    @ObfuscatedName("nu.o(I)Ljava/lang/Object;")
    public Object method6137() {
        if (class415.field4488 == this.field4271) {
            return 0;
        } else if (class415.field4490 == this.field4271) {
            return -1L;
        } else if (class415.field4496 == this.field4271) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("nu.c(Lpi;II)V")
    public abstract void method6130(class421 arg0, int arg1);
}
