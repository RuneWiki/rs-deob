package deob;

@ObfuscatedName("st")
public abstract class class491 implements class308 {

    @ObfuscatedName("st.ab")
    public class536 field5020;

    public class491(int arg0) {
    }

    @ObfuscatedName("st.an(Lvg;I)V")
    public void method8159(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            class487 var3 = (class487) class403.method3083(class487.method4885(), var2);
            if (var3 == null) {
                this.method8157(arg0, var2);
            } else {
                switch(var3.field5013) {
                    case 0:
                        class403.method3083(class381.method4126(), arg0.method9025());
                        break;
                    case 1:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                    case 2:
                        int var4 = arg0.method9025();
                        this.field5020 = class534.method7129(var4);
                        if (this.field5020 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
                    case 3:
                        arg0.method8827();
                }
            }
        }
    }

    @ObfuscatedName("st.au(B)Z")
    public boolean method8160() {
        return this.field5020 != null;
    }

    @ObfuscatedName("st.ax(I)Ljava/lang/Object;")
    public Object method8161() {
        if (class536.field5300 == this.field5020) {
            return 0;
        } else if (class536.field5294 == this.field5020) {
            return -1L;
        } else if (class536.field5293 == this.field5020) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("st.ab(Lvg;II)V")
    public abstract void method8157(class549 arg0, int arg1);
}
