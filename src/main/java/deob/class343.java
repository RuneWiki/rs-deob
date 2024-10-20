package deob;

@ObfuscatedName("md")
public abstract class class343 implements class216 {

    @ObfuscatedName("md.s")
    public class377 field3941;

    public class343(int arg0) {
    }

    @ObfuscatedName("md.j(Lnv;B)V")
    public void method5423(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            class339[] var3 = new class339[] { class339.field3931, class339.field3934, class339.field3929, class339.field3930 };
            class339 var4 = (class339) class291.method4326(var3, var2);
            if (var4 == null) {
                this.method5418(arg0, var2);
            } else {
                switch(var4.field3932) {
                    case 0:
                        int var5 = arg0.method5958();
                        this.field3941 = class375.method3223(var5);
                        if (this.field3941 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        class291.method4326(class271.method3264(), arg0.method5958());
                        break;
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 3:
                        arg0.method6104();
                }
            }
        }
    }

    @ObfuscatedName("md.l(I)Z")
    public boolean method5422() {
        return this.field3941 != null;
    }

    @ObfuscatedName("md.n(I)Ljava/lang/Object;")
    public Object method5427() {
        if (class377.field4164 == this.field3941) {
            return 0;
        } else if (class377.field4160 == this.field3941) {
            return -1L;
        } else if (class377.field4165 == this.field3941) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("md.s(Lnv;II)V")
    public abstract void method5418(class385 arg0, int arg1);
}
