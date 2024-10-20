package deob;

@ObfuscatedName("sz")
public abstract class class493 implements class310 {

    @ObfuscatedName("sz.ac")
    public class538 field5082;

    public class493(int arg0) {
    }

    @ObfuscatedName("sz.ax(Lvf;I)V")
    public void method8298(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            class489 var3 = (class489) class405.method6719(class489.method8156(), var2);
            if (var3 == null) {
                this.method8296(arg0, var2);
            } else {
                switch(var3.field5076) {
                    case 0:
                        int var4 = arg0.method8955();
                        this.field5082 = class536.method2596(var4);
                        if (this.field5082 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 1:
                        class405.method6719(class383.method3430(), arg0.method8955());
                        break;
                    case 2:
                        arg0.method8985();
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("sz.aq(I)Z")
    public boolean method8303() {
        return this.field5082 != null;
    }

    @ObfuscatedName("sz.af(I)Ljava/lang/Object;")
    public Object method8299() {
        if (class538.field5333 == this.field5082) {
            return 0;
        } else if (class538.field5334 == this.field5082) {
            return -1L;
        } else if (class538.field5332 == this.field5082) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sz.ac(Lvf;IB)V")
    public abstract void method8296(class551 arg0, int arg1);
}
