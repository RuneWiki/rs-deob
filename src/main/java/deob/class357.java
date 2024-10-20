package deob;

@ObfuscatedName("mn")
public abstract class class357 implements class229 {

    @ObfuscatedName("mn.i")
    public class393 field4041;

    public class357(int arg0) {
    }

    @ObfuscatedName("mn.g(Lop;I)V")
    public void method5722(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            class353[] var3 = new class353[] { class353.field4028, class353.field4030, class353.field4031, class353.field4033 };
            class353 var4 = (class353) class304.method2319(var3, var2);
            if (var4 == null) {
                this.method5719(arg0, var2);
            } else {
                switch(var4.field4032) {
                    case 0:
                        int var5 = arg0.method6240();
                        this.field4041 = class391.method4740(var5);
                        if (this.field4041 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 2:
                        arg0.method6250();
                        break;
                    case 3:
                        class304.method2319(class284.method4026(), arg0.method6240());
                }
            }
        }
    }

    @ObfuscatedName("mn.e(B)Z")
    public boolean method5723() {
        return this.field4041 != null;
    }

    @ObfuscatedName("mn.p(I)Ljava/lang/Object;")
    public Object method5724() {
        if (class393.field4277 == this.field4041) {
            return 0;
        } else if (class393.field4271 == this.field4041) {
            return -1L;
        } else if (class393.field4272 == this.field4041) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("mn.i(Lop;II)V")
    public abstract void method5719(class401 arg0, int arg1);
}
