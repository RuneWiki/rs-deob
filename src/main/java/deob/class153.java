package deob;

@ObfuscatedName("eh")
public class class153 extends class289 {

    @ObfuscatedName("eh.n")
    public final boolean field1982;

    public class153(boolean arg0) {
        this.field1982 = arg0;
    }

    @ObfuscatedName("eh.n(Lkx;Lkx;B)I")
    public int method3199(class293 arg0, class293 arg1) {
        if (arg0.field3701 == 0 || arg1.field3701 == 0) {
            return this.method5147(arg0, arg1);
        } else if (this.field1982) {
            return arg0.method5125().method5263(arg1.method5125());
        } else {
            return arg1.method5125().method5263(arg0.method5125());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3199((class293) arg0, (class293) arg1);
    }
}
