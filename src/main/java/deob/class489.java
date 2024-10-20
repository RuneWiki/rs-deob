package deob;

@ObfuscatedName("sp")
public abstract class class489 implements class305 {

    @ObfuscatedName("sp.ak")
    public class534 field5011;

    public class489(int arg0) {
    }

    @ObfuscatedName("sp.aj(Lua;I)V")
    public void method8126(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            class485 var3 = (class485) class401.method2027(class485.method1098(), var2);
            if (var3 == null) {
                this.method8123(arg0, var2);
            } else {
                switch(var3.field5003) {
                    case 0:
                        class401.method2027(Statics.method2111(), arg0.method8796());
                        break;
                    case 1:
                        arg0.method8968();
                        break;
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 3:
                        int var4 = arg0.method8796();
                        this.field5011 = class532.method5060(var4);
                        if (this.field5011 == null) {
                            throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                        }
                }
            }
        }
    }

    @ObfuscatedName("sp.az(S)Z")
    public boolean method8127() {
        return this.field5011 != null;
    }

    @ObfuscatedName("sp.af(I)Ljava/lang/Object;")
    public Object method8132() {
        if (class534.field5264 == this.field5011) {
            return 0;
        } else if (class534.field5267 == this.field5011) {
            return -1L;
        } else if (class534.field5268 == this.field5011) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sp.ak(Lua;II)V")
    public abstract void method8123(class546 arg0, int arg1);
}
