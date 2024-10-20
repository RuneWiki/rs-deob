package deob;

@ObfuscatedName("rg")
public abstract class class446 implements class280 {

    @ObfuscatedName("rg.at")
    public class491 field4715;

    public class446(int arg0) {
    }

    @ObfuscatedName("rg.as(Ltz;B)V")
    public void method7507(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            class442[] var3 = new class442[] { class442.field4705, class442.field4707, class442.field4706, class442.field4703 };
            class442 var4 = (class442) class371.method4632(var3, var2);
            if (var4 == null) {
                this.method7504(arg0, var2);
            } else {
                switch(var4.field4704) {
                    case 0:
                        arg0.method8193();
                        break;
                    case 1:
                        int var6 = arg0.method8129();
                        this.field4715 = class489.method4988(var6);
                        if (this.field4715 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 3:
                        class351[] var5 = new class351[] { class351.field4193, class351.field4191, class351.field4196, class351.field4194 };
                        class371.method4632(var5, arg0.method8129());
                }
            }
        }
    }

    @ObfuscatedName("rg.ax(I)Z")
    public boolean method7508() {
        return this.field4715 != null;
    }

    @ObfuscatedName("rg.ap(B)Ljava/lang/Object;")
    public Object method7509() {
        if (class491.field4974 == this.field4715) {
            return 0;
        } else if (class491.field4973 == this.field4715) {
            return -1L;
        } else if (class491.field4977 == this.field4715) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("rg.at(Ltz;II)V")
    public abstract void method7504(class501 arg0, int arg1);
}
