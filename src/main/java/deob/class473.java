package deob;

@ObfuscatedName("sl")
public abstract class class473 implements class295 {

    @ObfuscatedName("sl.ac")
    public class518 field4817;

    public class473(int arg0) {
    }

    @ObfuscatedName("sl.ak(Lul;I)V")
    public void method7705(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            class469 var3 = (class469) class388.method3894(class469.method440(), var2);
            if (var3 == null) {
                this.method7702(arg0, var2);
            } else {
                switch(var3.field4810) {
                    case 0:
                        int var5 = arg0.method8365();
                        this.field4817 = class516.method4151(var5);
                        if (this.field4817 != null) {
                            break;
                        }
                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        arg0.method8377();
                        break;
                    case 2:
                        class368[] var4 = new class368[] { class368.field4264, class368.field4261, class368.field4262, class368.field4260 };
                        class388.method3894(var4, arg0.method8365());
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
                }
            }
        }
    }

    @ObfuscatedName("sl.ax(I)Z")
    public boolean method7706() {
        return this.field4817 != null;
    }

    @ObfuscatedName("sl.ao(I)Ljava/lang/Object;")
    public Object method7709() {
        if (class518.field5068 == this.field4817) {
            return 0;
        } else if (class518.field5067 == this.field4817) {
            return -1L;
        } else if (class518.field5066 == this.field4817) {
            return "";
        } else {
            return null;
        }
    }

    @ObfuscatedName("sl.ac(Lul;IS)V")
    public abstract void method7702(class530 arg0, int arg1);
}
