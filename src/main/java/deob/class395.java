package deob;

@ObfuscatedName("ox")
public abstract class class395 implements class250 {

    @ObfuscatedName("ox.v")
    public class432 field4379;

    public class395(int arg0) {
    }

    @ObfuscatedName("ox.i(Lpi;B)V")
    public void method6464(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            class391[] var3 = new class391[] { class391.field4368, class391.field4369, class391.field4367, class391.field4370 };
            class391 var4 = (class391) class330.method4919(var3, var2);
            if (var4 == null) {
                this.method6462(arg0, var2);
            } else {
                switch(var4.field4371) {
                    case 0:
                        int var5 = arg0.method6971();
                        int var6 = class430.field4589[var5];
                        class432 var7;
                        if (var6 == 1) {
                            var7 = class432.field4596;
                        } else if (var6 == 2) {
                            var7 = class432.field4599;
                        } else if (var6 == 3) {
                            var7 = class432.field4593;
                        } else {
                            var7 = null;
                        }
                        this.field4379 = var7;
                        if (this.field4379 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        arg0.method7023();
                        break;
                    case 2:
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                    case 3:
                        class330.method4919(class310.method1549(), arg0.method6971());
                }
            }
        }
    }

    @ObfuscatedName("ox.f(B)Z")
    public boolean method6463() {
        return this.field4379 != null;
    }

    @ObfuscatedName("ox.b(I)Ljava/lang/Object;")
    public Object method6466() {
        if (class432.field4596 == this.field4379) {
            return 0;
        } else if (class432.field4593 == this.field4379) {
            return -1L;
        } else if (class432.field4599 == this.field4379) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("ox.v(Lpi;IS)V")
    public abstract void method6462(class438 arg0, int arg1);
}
