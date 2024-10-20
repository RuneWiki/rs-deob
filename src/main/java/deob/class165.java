package deob;

@ObfuscatedName("fe")
public class class165 extends class285 {

    @ObfuscatedName("fe.z")
    public final boolean field2023;

    public class165(boolean arg0) {
        this.field2023 = arg0;
    }

    @ObfuscatedName("fe.z(Lko;Lko;I)I")
    public int method3235(class289 arg0, class289 arg1) {
        if (arg0.field3632 == 0 || arg1.field3632 == 0) {
            return this.method4783(arg0, arg1);
        } else if (this.field2023) {
            return arg0.field3633 - arg1.field3633;
        } else {
            return arg1.field3633 - arg0.field3633;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3235((class289) arg0, (class289) arg1);
    }
}
