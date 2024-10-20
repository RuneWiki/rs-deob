package deob;

@ObfuscatedName("fb")
public class class166 extends class285 {

    @ObfuscatedName("fb.z")
    public final boolean field2026;

    public class166(boolean arg0) {
        this.field2026 = arg0;
    }

    @ObfuscatedName("fb.z(Lko;Lko;B)I")
    public int method3243(class289 arg0, class289 arg1) {
        if (arg0.field3632 == 0) {
            if (arg1.field3632 != 0) {
                return this.field2026 ? 1 : -1;
            }
        } else if (arg1.field3632 == 0) {
            return this.field2026 ? -1 : 1;
        }
        return this.method4783(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3243((class289) arg0, (class289) arg1);
    }
}
