package deob;

@ObfuscatedName("qg")
public class class420 extends class426 {

    public class420(class426 arg0) {
        super(arg0);
        this.field4628 = "SwapSongTask";
    }

    @ObfuscatedName("qg.aq(I)Z")
    public boolean method7266() {
        if (class322.field3475.size() > 1 && class322.field3475.get(0) != null && ((class334) class322.field3475.get(0)).field3595.method5551() && class322.field3475.get(1) != null && ((class334) class322.field3475.get(1)).field3595.method5551()) {
            class334 var1 = (class334) class322.field3475.get(0);
            class322.field3475.set(0, class322.field3475.get(1));
            class322.field3475.set(1, var1);
        }
        return true;
    }
}
